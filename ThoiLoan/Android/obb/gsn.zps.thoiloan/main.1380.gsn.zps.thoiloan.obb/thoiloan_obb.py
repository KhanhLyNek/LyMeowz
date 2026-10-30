#!/usr/bin/env python3
"""Inspect an Android OBB safely; extract ZIP-compatible OBB assets if requested."""
import argparse
import hashlib
import json
from pathlib import Path
import zipfile


def inspect(path: Path):
    digest = hashlib.sha256()
    with path.open('rb') as stream:
        for block in iter(lambda: stream.read(1024 * 1024), b''):
            digest.update(block)
    result = {'filename': path.name, 'bytes': path.stat().st_size,
              'sha256': digest.hexdigest(), 'zip_compatible': zipfile.is_zipfile(path)}
    if result['zip_compatible']:
        with zipfile.ZipFile(path) as z:
            result['entries'] = [{'name': i.filename, 'bytes': i.file_size} for i in z.infolist()]
    return result


def extract_zip(path: Path, destination: Path):
    destination.mkdir(parents=True, exist_ok=True)
    root = destination.resolve()
    with zipfile.ZipFile(path) as z:
        for item in z.infolist():
            target = (root / item.filename).resolve()
            if not target.is_relative_to(root):
                raise ValueError(f'Unsafe ZIP path: {item.filename}')
            if item.is_dir():
                target.mkdir(parents=True, exist_ok=True)
                continue
            # Skip symlinks in archives.
            if (item.external_attr >> 16) & 0o170000 == 0o120000:
                continue
            target.parent.mkdir(parents=True, exist_ok=True)
            with z.open(item) as src, target.open('wb') as dst:
                while chunk := src.read(1024 * 1024):
                    dst.write(chunk)


def main():
    p = argparse.ArgumentParser(description='Analyze a Thoi Loan OBB archive')
    p.add_argument('obb', type=Path)
    p.add_argument('--report', type=Path, default=Path('obb_report.json'))
    p.add_argument('--extract', type=Path, help='Extract if ZIP-compatible')
    args = p.parse_args()
    if not args.obb.is_file():
        p.error('OBB file not found')
    report = inspect(args.obb)
    args.report.parent.mkdir(parents=True, exist_ok=True)
    args.report.write_text(json.dumps(report, ensure_ascii=False, indent=2), encoding='utf-8')
    print(f"OBB: {report['filename']} | ZIP: {report['zip_compatible']}")
    print(f"SHA256: {report['sha256']}")
    print(f'Report: {args.report}')
    if args.extract:
        if not report['zip_compatible']:
            p.error('Not ZIP-compatible; cannot extract automatically')
        extract_zip(args.obb, args.extract)
        print(f'Extracted to: {args.extract}')


if __name__ == '__main__':
    main()
