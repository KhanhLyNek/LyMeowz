package main;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import java.util.Calendar;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;

public class IIlo
implements I1_1,
CommandListener {
    private static IIlo var_IIlo_II;
    public boolean IIO0 = false;
    private int II0o = 0;
    private long IIll = 0L;
    private long IIl1 = 0L;
    public long IIl_ = 0L;
    public boolean IIOo = false;
    public int IlI_;
    public int IlIO;
    private long IIlO = 0L;
    private static final long IIl0 = 2000L;
    private static final long IIlo = 750L;
    private static final long II1 = 30000L;
    private static final long II1I = 15000L;
    private IlI0 var_IlI0_II = new IlI0();
    public Form IIII;
    public Command var_javax_microedition_lcdui_Command_III1;
    public Command III_;
    public TextField IIIl;
    public TextField var_javax_microedition_lcdui_TextField_III1;
    private boolean II0 = false;
    private String IIl = IIlo.IIIO("\ub66b\ub64d\ub6a5\ub685", 46680);
    private String IIlI = IIlo.IIIO("\ub66d\ub64d\ub6a6\ub685", 46680);
    private int IlI0 = 3;
    private int IlIo = 30;
    private int Ill = 5;
    private int IllI = 0;
    private boolean II0I = false;
    private boolean II0l = false;

    public static IIlo II() {
        if (var_IIlo_II == null) {
            var_IIlo_II = new IIlo();
        }
        return var_IIlo_II;
    }

    public static IIlo III() {
        return IIlo.II();
    }

    private IIlo() {
        this.IIoI();
        this.IIl0();
    }

    private void IIoI() {
        this.IlIO();
        this.var_IlI0_II.II(new II1(this, 10000L));
    }

    public void II_I() {
        Il1_.II().Il1__III().II(IIlo.IIIO("\ub613\ua8c8\ub6e2\ub695\ub6ba\ua822\ub77b", 46680)).II(IIlo.IIIO("\ub60c\ua886\ub6b6\ub6de\ua86b\ub687\ub732\ub75f\ua981\ub706\ub7ae\ub7c1\ua96d\ub782", 46680), this.IIO0 ? IIlo.IIIO("\ub61a\ua8da\ub6e2", 46680) : IIlo.IIIO("\ub60c\ua8d8\ub6e2", 46680), 1, null).II(IIlo.IIIO("\ub614\ub7c7\ub6e3\ub695\ub6bf\ub69b\ub767\ub711\ub738\ub706\ua949\ub7c3\ub7ec\ub79f\ua6ab\ub840", 46680), this.IIOo ? IIlo.IIIO("\ub61a\ua8da\ub6e2", 46680) : IIlo.IIIO("\ub60c\ua8d8\ub6e2", 46680), 2, null).II(IIlo.IIIO("\ub619\ub602\ub6e2\ub6da\ub6f4\ub6bc\ub77c\ub77e\ub716\ub729", 46680), this.II0 ? IIlo.IIIO("\ub61a\ua8da\ub6e2", 46680) : IIlo.IIIO("\ub60c\ua8d8\ub6e2", 46680), 3, null).II(IIlo.IIIO("\ub60c\ub61e\ub6fb\ub6d0", 46680), IIlo.IIIO("\ub60c\ua8d8\ub6e2\ub68f\ub6f4", 46680) + this.IIl + IIlo.IIIO("\ub678\ub635\ua83b\ub6c1\ub6ee\ub6d3", 46680) + this.IIlI, 4, null).II(IIlo.IIIO("\ub609\ub602\ub6f7\ub6cc\ub6f4\ub69f\ua9b3\ub758", 46680), "", 99, null).Il1__II(this).I__0();
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                this.IIO0 = !this.IIO0;
                this.IIIl(IIlo.IIIO("\ub60c\ua886\ub6b6\ub6de\ua86b\ub687\ub732\ub75f\ua981\ub706\ub7ae\ub7c1\ua96d\ub782\ub830\ub809", 46680) + (this.IIO0 ? IIlo.IIIO("\ub61a\ua8da\ub6e2", 46680) : IIlo.IIIO("\ub60c\ua8d8\ub6e2", 46680)));
                this.II_I();
                break;
            }
            case 2: {
                boolean bl = this.IIOo = !this.IIOo;
                if (this.IIOo) {
                    this.IlIO = IOlO.l1oI;
                    this.IlI_ = IOlO.l1ol;
                }
                this.IIIl(IIlo.IIIO("\ub614\ub7c7\ub6e3\ub695\ub6bf\ub69b\ub767\ub711\ub738\ub706\ua949\ub7c3\ub7ec\ub79f\ua6ab\ub840\ub872\ub847", 46680) + (this.IIOo ? IIlo.IIIO("\ub61a\ua8da\ub6e2", 46680) : IIlo.IIIO("\ub60c\ua8d8\ub6e2", 46680)));
                this.II_I();
                break;
            }
            case 3: {
                this.II0 = !this.II0;
                this.IlI0();
                this.IIIl(IIlo.IIIO("\ub619\ub602\ub6e2\ub6da\ub6f4\ub6bc\ub77c\ub77e\ub716\ub729\ub7b4\ub78d", 46680) + (this.II0 ? IIlo.IIIO("\ub61a\ua8da\ub6e2", 46680) : IIlo.IIIO("\ub60c\ua8d8\ub6e2", 46680)));
                if (this.II0) {
                    this.IlIl();
                }
                this.II_I();
                break;
            }
            case 4: {
                this.IlI_();
                break;
            }
            case 99: {
                IlI.III().I_11();
            }
        }
    }

    private void IIIl(String string) {
        I1_I.var_I1Oo_II.IIII(string, 0);
    }

    public void IIol() {
        if (this.IIO0) {
            String string = I_O1.IIl(IIlo.IIIO("\ub639\ub614\ub6f5", 46680));
            String string2 = I_O1.IIl(IIlo.IIIO("\ub628\ub616\ub6e5\ub6c6", 46680));
            if (!Il_o.boolean_III1(string) && !Il_o.boolean_III1(string2)) {
                II.var_I_0l_II.Io_();
                if (!I_0O.II().IlI_()) {
                    II.void_II();
                }
                I_0_.II().II(string, string2, IIlo.IIIO("\ub669\ub659\ub6a6\ub69b\ub6e6", 46680), (byte)(I1o_.IOo ? 1 : 0));
                this.IIl_ = IO10.IIII() + 30000L;
            }
        }
    }

    public void IIlO() {
        this.var_IlI0_II.IIlO();
        if (this.IIOo) {
            long l = IO10.IIII();
            if (IOlO.l1ol != this.IlI_ && IOlO.l1oI == this.IlIO && l - this.IIlO >= 2000L) {
                I_0_.II().II0O(this.IlI_);
                this.IIlO = l;
            }
        }
        if (!this.IIO0) {
            return;
        }
        if (II.var_IO1__II instanceof I1o_ && this.IIl_ < IO10.IIII() && !I_0O.II().IlI_()) {
            this.IIol();
            return;
        }
        switch (this.II0o) {
            default: {
                this.IIo1();
                break;
            }
            case 1: {
                if (IO10.IIII() - this.IIl1 <= 750L) {
                    return;
                }
                this.IIl1 = IO10.IIII();
                this.IIo_();
                break;
            }
            case 2: {
                if (IO10.IIII() - this.IIl1 <= 750L) {
                    return;
                }
                this.IIl1 = IO10.IIII();
                this.IIoO();
                break;
            }
            case 3: {
                if (IO10.IIII() - this.IIl1 <= 750L) {
                    return;
                }
                this.IIl1 = IO10.IIII();
                this.IIo0();
                break;
            }
            case 4: {
                if (IO10.IIII() - this.IIl1 <= 750L) {
                    return;
                }
                this.IIl1 = IO10.IIII();
                this.IIoo();
            }
        }
    }

    private void IIo1() {
        if (II.var_IO1__II instanceof I1o_) {
            return;
        }
        if (II.var_IO1__II instanceof I1_I && I_0O.II().IlI_()) {
            return;
        }
        if (!I_0O.II().IlI_()) {
            this.IIll = IO10.IIII();
            II.var_I_0l_II.I0l_();
            II.II(IIlo.IIIO("\ub748\ub616\ub6f8\ub6d2\ub6f4\ub687\ub77a\ua9dc\ub770\ub704\ua931\ub7d9\ub7ec\ub785\ua6db\ub840\ub868\ub80b\ua627\ub8cc\ub8e4\ub890\ub963\ub954\ub960\ub96c\ub94e\ub9ee\ub99d", 46680));
            this.II0o = 1;
        }
    }

    private void IIo_() {
        if (II.var_IO1__II instanceof I1_I) {
            this.II0o = 0;
            return;
        }
        long l = (30000L - (IO10.IIII() - this.IIll)) / 1000L;
        if (l > 0L) {
            II.II(IIlo.IIIO("\ub60c\ub61f\ua87b\ub695\ub6bf\ua84c\ub766\ub711\ub73e\ua9be\ub7e7\ub78d\ub7a0\ua94a\ub863\ub809\ub83b\ub806\ub8f3\ub885", 46680) + l + IIlo.IIIO("\ub62b\ub656", 46680));
        }
        if (IO10.IIII() - this.IIll < 30000L) {
            return;
        }
        this.II0o = 2;
        this.IIll = IO10.IIII();
    }

    private void IIoO() {
        if (II.var_IO1__II instanceof I1_I) {
            this.II0o = 0;
            return;
        }
        if (II.var_IO1__II instanceof I1o_) {
            II.var_I_0l_II.I0l_();
        }
        if (I_0O.II().IlI_()) {
            I_0O.II().close();
            this.IIll = IO10.IIII() - 30000L + 1500L;
            this.II0o = 1;
            return;
        }
        if (I_0O.II().I0OI) {
            II.II(IIlo.IIIO("\ub748\ub616\ub6f8\ub6d2\ub6f4\ub698\ua9ad\ub745\ub770\ub701\ua95f\ub7c4\ub7ed", 46680));
            return;
        }
        if (II.var_I1o__II == null) {
            II.var_I1o__II = new I1o_();
        }
        II.void_II();
        this.IIll = IO10.IIII();
        this.II0o = 3;
    }

    private void IIo0() {
        if (II.var_IO1__II instanceof I1_I) {
            this.II0o = 0;
            return;
        }
        if (I_0O.II().IlI_()) {
            II.II(IIlo.IIIO("\ub613\ua8c8\ub6e2\ub695\ub6ba\ua822\ub77b\ub711\ub724\ub707\ub76e\ub7c3\ub7a4\ub7cb\ub869\ub8dd\ub826\ub800\ub8a7", 46680));
            this.II0o = 4;
            return;
        }
        if (IO10.IIII() - this.IIll > 15000L) {
            II.II(IIlo.IIIO("\ub610\ua8c8\ub6e2\ub695\ub6a0\ub69b\ua9cf\ub758\ub770\ub708\ub7e7\ub7cc\ub7a2\ub7cb\ub869\ub841\ua695\ub847\ub8ed\ua61a\ub8b0\ub8c3\ub96c\ua7f0\ub929\ub973\ub95e\ub9e9\ub9d4\ua736\ub9da\uba75\ua499\uba3e\uba58\ubabb\uba9a", 46680));
            this.IIll = IO10.IIII();
            this.II0o = 1;
            return;
        }
        II.II(IIlo.IIIO("\ub748\ub616\ub6f8\ub6d2\ub6f4\ub698\ua9ad\ub745\ub770\ub701\ua95f\ub7c4\ub7e2\ub7c5\ub824", 46680));
    }

    private void IIoo() {
        if (II.var_IO1__II instanceof I1_I) {
            this.II0o = 0;
            return;
        }
        if (!I_0O.II().IlI_()) {
            II.II(IIlo.IIIO("\ub615\ua8d2\ub6e2\ub695\ub6bf\ua84c\ub766\ub711\ub73e\ua9be\ub7e7\ub78d\ub7b8\ub783\ua6e7\ub809\ub824\ua6c6\ub8ef\ub884", 46680));
            this.II0o = 1;
            this.IIll = IO10.IIII();
            return;
        }
        I_0_.II().Io__();
        II.var_I_0l_II.II(3, null);
        this.IIll = IO10.IIII();
        this.II0o = 0;
    }

    private void Il() {
        try {
            Calendar calendar = Calendar.getInstance();
            int n = calendar.get(11);
            int n2 = calendar.get(12);
            if (n == this.IlI0 && n2 == this.IlIo && !this.II0I) {
                this.IlI();
                this.II0I = true;
                this.II0l = false;
            }
            if (n == this.Ill && n2 == this.IllI && !this.II0l) {
                this.IlII();
                this.II0l = true;
                this.II0I = false;
            }
            if ((n != this.IlI0 || n2 != this.IlIo) && this.II0I) {
                this.II0I = false;
            }
            if ((n != this.Ill || n2 != this.IllI) && this.II0l) {
                this.II0l = false;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void IlI() {
        try {
            this.IIO0 = false;
            I_0O.II().close();
            II.var_II_II.IIl();
            II.var_IO1__II = II.var_I1o__II;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void IlII() {
        try {
            this.IIO0 = true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void IlIl() {
        this.II0I = false;
        this.II0l = false;
    }

    public void IlI1() {
        this.IIII = new Form(IIlo.IIIO("\ub61b\ub697\ub6ff\ub695\ub7c5\ua844\ub766\ub711\ub724\ub707\ua953\ub7c4\ub7ec\ub78c\ub863\ub848\ub826", 46680));
        this.IIIl = new TextField(IIlo.IIIO("\ub60c\ua8d8\ub6e2\ub695\ub6b3\ub692\ub77f\ub754\ub770\ub747\ub7c6\ub7e5\ub7f6\ub7a6\ub847\ub800", 46680), this.IIl, 10, 0);
        this.IIII.append((Item)this.IIIl);
        this.var_javax_microedition_lcdui_TextField_III1 = new TextField(IIlo.IIIO("\ub61a\ua8da\ub6e2\ub695\ub6b3\ub692\ub77f\ub754\ub770\ub747\ub7c6\ub7e5\ub7f6\ub7a6\ub847\ub800", 46680), this.IIlI, 10, 0);
        this.IIII.append((Item)this.var_javax_microedition_lcdui_TextField_III1);
        this.var_javax_microedition_lcdui_Command_III1 = new Command(IIlo.IIIO("\ub614\ub7c7\ub6e3", 46680), 4, 1);
        this.IIII.addCommand(this.var_javax_microedition_lcdui_Command_III1);
        this.III_ = new Command(IIlo.IIIO("\ub610\ub602\ua861", 46680), 3, 1);
        this.IIII.addCommand(this.III_);
        this.IIII.setCommandListener((CommandListener)this);
    }

    private void IlI_() {
        this.IlI1();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.IIII);
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command == this.var_javax_microedition_lcdui_Command_III1) {
            try {
                String string;
                String string2 = this.IIIl.getString().trim();
                if (this.II(string2, true)) {
                    this.IIl = string2;
                }
                if (this.II(string = this.var_javax_microedition_lcdui_TextField_III1.getString().trim(), false)) {
                    this.IIlI = string;
                }
                this.IlI0();
                this.IlIl();
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
                this.IIIl(IIlo.IIIO("\ub748\ub694\ub6b6\ub6d9\ub764\ub686\ub728\ub711\ub704\ua9c0\ub7fa\ub78d", 46680) + this.IIl + IIlo.IIIO("\ub678\ub65a\ub6b6\ub6f7\ua879\ub687\ub732", 46680) + this.IIlI);
                this.II_I();
            }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
                I1_I.var_I1Oo_II.IIII(IIlo.IIIO("\ub614\ua8a0\ub6ff\ub68f\ub6f4", 46680) + exception.getMessage(), 0);
            }
        }
        if (command == this.III_) {
            Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
            this.II_I();
        }
    }

    private boolean II(String string, boolean bl) {
        try {
            String[] stringArray = Il_o.java_lang_String_arr_II(string, ':');
            if (stringArray.length != 2) {
                throw new Exception(IIlo.IIIO("\ub748\ua8bc\ub6f8\ub6dd\ub6f4\ub697\ua9b3\ub75f\ub737\ub74f\ub7fe\ub7c5\ua96f\ub782\ub82a\ub845\ub8a8\ub847\ub8ce\ub8ed\ub8fe\ub8ae\ub94f", 46680));
            }
            int n = Integer.parseInt(stringArray[0].trim());
            int n2 = Integer.parseInt(stringArray[1].trim());
            if (n < 0 || n > 23 || n2 < 0 || n2 > 59) {
                throw new Exception(IIlo.IIIO("\ub61f\ub61e\ua84b\ub695\ub6a4\ub69b\ua9b1\ub758\ub770\ub71b\ua965\ub78d\ub7fc\ub7c6\ub838\ub81a\ub864\ub847\ub8f6\ub8cd\ub83e\ub897\ub922\ub955\ua7ab\ub97f\ub94e\ub9b0\ub989\ub9e2", 46680));
            }
            if (bl) {
                this.IlI0 = n;
                this.IlIo = n2;
            } else {
                this.Ill = n;
                this.IllI = n2;
            }
            return true;
        }
        catch (Exception exception) {
            I1_I.var_I1Oo_II.IIII(IIlo.IIIO("\ub614\ua8a0\ub6ff\ub695\ub7c5\ua838\ub77c\ub759\ub770\ub70b\ua92f\ub7c3\ub7ab\ub7cb\ub87e\ub841\ua695\ub80e\ub8a6\ub8c2\ub8ad\ub882\ub96c\ub91b\ub960", 46680) + exception.getMessage(), 0);
            return false;
        }
    }

    private void IlIO() {
        this.II0 = IlIO.III(IIlo.IIIO("\ub639\ub602\ub6e2\ub6da\ub6bb\ub69d\ub77d\ub757\ub736\ub741\ub7eb\ub7c3\ub7ad\ub789\ub866\ub84c\ub82c", 46680), false);
        this.IIl = IlIO.java_lang_String_IIII(IIlo.IIIO("\ub639\ub602\ub6e2\ub6da\ub6bb\ub69d\ub77d\ub757\ub736\ub741\ub7e1\ub7cb\ub7aa\ub79f\ub863\ub844\ub82d", 46680), IIlo.IIIO("\ub66b\ub64d\ub6a5\ub685", 46680));
        this.IIlI = IlIO.java_lang_String_IIII(IIlo.IIIO("\ub639\ub602\ub6e2\ub6da\ub6bb\ub69d\ub77d\ub757\ub736\ub741\ub7e1\ub7c3\ub7b8\ub782\ub867\ub84c", 46680), IIlo.IIIO("\ub66d\ub64d\ub6a6\ub685", 46680));
        this.II(this.IIl, true);
        this.II(this.IIlI, false);
    }

    private void IlI0() {
        IlIO.II(IIlo.IIIO("\ub639\ub602\ub6e2\ub6da\ub6bb\ub69d\ub77d\ub757\ub736\ub741\ub7eb\ub7c3\ub7ad\ub789\ub866\ub84c\ub82c", 46680), this.II0);
        IlIO.void_IIII(IIlo.IIIO("\ub639\ub602\ub6e2\ub6da\ub6bb\ub69d\ub77d\ub757\ub736\ub741\ub7e1\ub7cb\ub7aa\ub79f\ub863\ub844\ub82d", 46680), this.IIl);
        IlIO.void_IIII(IIlo.IIIO("\ub639\ub602\ub6e2\ub6da\ub6bb\ub69d\ub77d\ub757\ub736\ub741\ub7e1\ub7c3\ub7b8\ub782\ub867\ub84c", 46680), this.IIlI);
    }

    public void IIl0() {
        this.IlI0();
        this.var_IlI0_II.I_1O();
    }

    static /* synthetic */ boolean boolean_II(IIlo iIlo) {
        return iIlo.II0;
    }

    static /* synthetic */ void void_II(IIlo iIlo) {
        iIlo.Il();
    }

    private static /* synthetic */ String IIIO(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

