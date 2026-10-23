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
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;

public class II0l
extends IIII
implements I1_1,
CommandListener {
    private static II0l var_II0l_II;
    private IlI0 var_IlI0_II = new IlI0();
    public boolean IllO = false;
    private boolean Ill0 = false;
    private boolean Illo = false;
    private I_I_ var_I_I__II;
    public long IIOl = 0L;
    public boolean Il1 = true;
    public boolean Il1I = false;
    public int IlO1 = 0;
    public Il_l.II var_Il_l$II_IIIl = new Il_l.II();
    private long IIO1 = 0L;
    private long IIO_ = 0L;
    public boolean Il1l = true;
    private long IIOO = 0L;
    private int IlO_ = -1;
    private long IIO0 = -1L;
    private Il_l.III1 var_Il_l$III1_II = new Il_l.III1();
    private long IIOo = 0L;
    private int IlOO = -1;
    private long II0 = 0L;
    public long II0I = 0L;
    public Form var_javax_microedition_lcdui_Form_IIIl;
    public Command IIIO;
    public Command var_javax_microedition_lcdui_Command_III0;
    public TextField var_javax_microedition_lcdui_TextField_III0;
    public TextField IIIo;

    private II0l() {
    }

    public static II0l II0l_II() {
        if (var_II0l_II == null) {
            var_II0l_II = new II0l();
        }
        return var_II0l_II;
    }

    public static II0l II0l_III() {
        return II0l.II0l_II();
    }

    @Override
    protected void II1l() {
        this.IIOI();
        this.var_IlI0_II.II(new II01(this, 5000L));
        this.var_IlI0_II.II(new II0_(this, 5000L));
        this.var_IlI0_II.II(new II0O(this, 0L));
        this.var_IlI0_II.II(new II00(this, 100L));
        this.var_IlI0_II.II(new II0o(this, 5000L));
        this.void_IIlo();
    }

    @Override
    protected void II11() {
        this.IIOl();
        this.var_IlI0_II.I_1O();
    }

    @Override
    protected void II1_() {
        IIo_.III().void_IIlO();
        Ilol ilol = Ilol.Ilol_II();
        if (ilol != null && this.IllO && !IlO_.II_O() && !II_O.III().IIll()) {
            Il_.III().IIlO();
            Il_I.III().IIlO();
            if (IIo1.Il_l) {
                this.II(Il1O.Il1O_III().IIlO);
            }
            this.var_IlI0_II.IIlO();
        }
    }

    @Override
    protected void II1O() {
    }

    @Override
    protected void II10() {
    }

    private void IIOI() {
        this.Il1 = IlIO.III(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf30\ubf06\ubfe0\ubfc7\ubfa9\ubfbf\uc07e\uc05a\uc02c\uc01a\uc0ca\uc0c9\uc0a7", 48791), true);
        this.IlO1 = IlIO.II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf3c\ubf1f\ubff9\ubfcb\ubf80\ubf83\uc06f\uc04f", 48791), 0);
        this.Il1I = IlIO.III(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf25\ubf02\ubfee\ubfc7\ubfa3\ubfbc\uc06e\uc05e\uc03a", 48791), false);
        this.Il1l = IlIO.III(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf32\ubf18\ubfea\ubfcd\ubfa6\ubfa0\uc06a\uc04d\uc004\uc007\uc0e5", 48791), true);
        this.IIO1 = IlIO.long_II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf3c\ubf11\ubff7\ubfe6\ubf9d\ubfa1\uc064\uc048", 48791), 0L);
        this.IIO_ = IlIO.long_II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf3c\ubf19\ubfe1\ubfe6\ubf9d\ubfa1\uc064\uc048", 48791), 0L);
    }

    private void IIOl() {
        IlIO.II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf30\ubf06\ubfe0\ubfc7\ubfa9\ubfbf\uc07e\uc05a\uc02c\uc01a\uc0ca\uc0c9\uc0a7", 48791), this.Il1);
        IlIO.III(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf3c\ubf1f\ubff9\ubfcb\ubf80\ubf83\uc06f\uc04f", 48791), this.IlO1);
        IlIO.II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf25\ubf02\ubfee\ubfc7\ubfa3\ubfbc\uc06e\uc05e\uc03a", 48791), this.Il1I);
        IlIO.II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf32\ubf18\ubfea\ubfcd\ubfa6\ubfa0\uc06a\uc04d\uc004\uc007\uc0e5", 48791), this.Il1l);
        IlIO.void_II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf3c\ubf11\ubff7\ubfe6\ubf9d\ubfa1\uc064\uc048", 48791), this.IIO1);
        IlIO.void_II(II0l.IIl0("\ubee3\ubec4\ubeb4\ube9d\ubf7d\ubf1c\ubf3c\ubf19\ubfe1\ubfe6\ubf9d\ubfa1\uc064\uc048", 48791), this.IIO_);
    }

    private void IIIl(String string) {
        I1_I.var_I1Oo_II.IIII(string, 0);
    }

    private void void_II(I_I_ i_I_) {
        try {
            if (i_I_ == null || this.Il1I || !this.Il1l) {
                return;
            }
            if (this.IlO_ != i_I_.lll) {
                this.IlO_ = i_I_.lll;
                this.IIOO = IO10.IIII();
                this.IIO0 = i_I_.llIl;
                return;
            }
            long l = IO10.IIII() - this.IIOO;
            if (l > 15000L) {
                if ((double)i_I_.llIl >= (double)this.IIO0 * 0.9) {
                    this.var_Il_l$III1_II.II(new Integer(i_I_.lll), new Boolean(true));
                    this.IIOo = IO10.IIII();
                    Ilol.Ilol_II().var_I_I__IIII = null;
                    this.var_I_I__II = null;
                    this.IlO_ = -1;
                    this.IIOO = 0L;
                    this.IIO0 = -1L;
                    Il_.III().II0();
                    Il_I.III().II0();
                }
            } else {
                this.IIO0 = i_I_.llIl;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private boolean III(I_I_ i_I_) {
        return this.var_Il_l$III1_II.IIII(new Integer(i_I_.lll));
    }

    private void Ilo_() {
        try {
            if (this.IlOO != IOlO.l1oI) {
                this.var_Il_l$III1_II.I_1O();
                this.IlOO = IOlO.l1oI;
                this.IIOo = 0L;
                return;
            }
            if (this.var_Il_l$III1_II.IIlO() > 0 && IO10.IIII() - this.IIOo > 30000L) {
                this.var_Il_l$III1_II.I_1O();
                this.IIOo = 0L;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public long long_II() {
        try {
            Ilol ilol = Ilol.Ilol_II();
            if (ilol != null && this.IllO && this.II0 > 0L) {
                return ilol.Il11 - this.II0;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return 0L;
    }

    public long long_III() {
        return this.IllO && this.II0I > 0L ? IO10.IIII() - this.II0I : 0L;
    }

    private I_I_ I_I__III() {
        I_I_ i_I_ = null;
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < I1_I.var_I_lO_IIO.size(); ++i) {
            I_I_ i_I_2 = (I_I_)I1_I.var_I_lO_IIO.elementAt(i);
            if (!this.boolean_II(i_I_2)) continue;
            if (!(this.IlO1 != 0 && this.IlO1 != 2 || Il_0.II_())) {
                Il10.IIII iIII = new Il10.IIII(Ilol.Ilol_II().I_o_ / 24, Ilol.Ilol_II().I_oO / 24);
                Il10.IIII iIII2 = new Il10.IIII(i_I_2.I1 / 24, i_I_2.I1I / 24);
                Il_l.II iI = Il10.II(iIII, iIII2);
                if (iI == null || iI.IIlO() >= n) continue;
                n = iI.IIlO();
                i_I_ = i_I_2;
                continue;
            }
            int n2 = Il_O.II(Ilol.Ilol_II(), i_I_2);
            if (n2 >= n) continue;
            n = n2;
            i_I_ = i_I_2;
        }
        return i_I_;
    }

    private boolean boolean_II(I_I_ i_I_) {
        if (i_I_ != null && i_I_.llIl > 0 && !i_I_.I0I1 && i_I_.status > 1) {
            if (this.III(i_I_)) {
                return false;
            }
            if (this.var_Il_l$II_IIIl.IIlO() > 0 && !this.var_Il_l$II_IIIl.boolean_III(new Integer(i_I_.I1ll))) {
                return false;
            }
            if (this.Il1 && !Il_0.II_() && i_I_.IIOI()) {
                return false;
            }
            if (this.IIO1 <= 0L || (long)i_I_.llI1 <= this.IIO1 && (long)i_I_.llI1 >= this.IIO_) {
                return this.IIO_ <= 0L || (long)i_I_.llIl > this.IIO_;
            }
            return false;
        }
        return false;
    }

    private void IloO() {
        Ilol ilol;
        if (this.var_I_I__II != null && !this.Il1I && (ilol = Ilol.Ilol_II()) != null) {
            this.void_II(this.var_I_I__II);
            Ilol.Ilol_II().var_I_I__IIII = this.var_I_I__II;
            if (this.IlO1 == 2) {
                Il_1.II(this.var_I_I__II);
            } else {
                I_0o i_0o = Ilol.Ilol_II().var_I_0o_II;
                if (i_0o != null) {
                    long l = IO10.IIII();
                    if (l - i_0o.I1IO < (long)i_0o.l1_O + 100L) {
                        return;
                    }
                    i_0o.I1IO = l;
                }
                I_lO i_lO = new I_lO("");
                i_lO.addElement(this.var_I_I__II);
                I_0_.II().II(i_lO, new I_lO(""), -1);
            }
        }
    }

    public void II(boolean bl) {
        try {
            this.Ill0 = bl;
            if (!bl) {
                this.I1();
            }
            II1I.III().II(bl);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void Ilo0() {
        try {
            if (!this.Ill0 || !I1_I.IO_I || this.IllO || Ilol.Ilol_II() == null) {
                return;
            }
            this.var_Il_l$II_IIIl.I_1O();
            this.II0 = Ilol.Ilol_II().Il11;
            this.II0I = IO10.IIII();
            this.Illo = true;
            this.IllO = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void Iloo() {
        if (this.Illo) {
            this.I1();
        }
    }

    private void I1() {
        if (!this.Illo) {
            return;
        }
        this.Illo = false;
        this.IllO = false;
        this.var_I_I__II = null;
        if (Ilol.Ilol_II() != null) {
            Ilol.Ilol_II().var_I_I__IIII = null;
        }
        Il_.III().II0();
        Il_I.III().II0();
    }

    public void I1I() {
        if (this.Illo) {
            this.I1();
            this.IIIl(II0l.IIl0("\ubf87\ube55\ubef5\ube90\ua1f8\ubf5c\ubf36\ubf50\ubffb\ua15f\ubfed\ubefd\uded2\uc044\uc02e\uc048\uc0eb\uc0d3\uc0bc\ude23\uc16d\uc102\uc135\udfcd\uc10f", 48791));
        } else if (this.Ill0) {
            this.IIIl(II0l.IIl0("\ubed9\ubede\ua070\ube84\ubf33\ube23\ubfab\ubf00\ubfaf\ubfd8\ubf2d\ubf83\uc02b\uc05b\uc03c\uc089\uc0ee\uc086\uc1d4\ude27\uc123\uc140\udfee\uc114\uc15f\uc08f\udf1a\uc1a9\uc1db\uc276\uc24c\uc221\udcb0\uc2f8\uc295\uc2a0\udc5e\uc362", 48791));
        }
    }

    private void I1II() {
        this.Illo = false;
        if (this.var_Il_l$II_IIIl.IIlO() == 0) {
            this.IIIl(II0l.IIl0("\ubec3\ube56\ubebb\ubed4\ubf40\ubfd3\ubf25\ubf50\ubfdb\ua10b\ubfb9\ubfcc\uc048\ude89\uc069\uc178\uc064\uc086\uc087\ude49\uc177\uc103", 48791));
        } else {
            this.IIIl(II0l.IIl0("\ubec3\ube56\ubebb\ubed4\ubf40\ubfd3\ubf25\ubf50\ubfcb\ubfcf\ubfa3\ubf84\uc02b\uc079\uc0a8\uc00b\uc0ef\uc086\uc1d5\uc007\uc123\uc160\udfec\uc114\uc15e", 48791));
        }
        this.II0 = Ilol.Ilol_II().Il11;
        this.II0I = IO10.IIII();
        this.IllO = true;
    }

    private void I1Il() {
        if (!Ilol.Ilol_II().I_I1 && !Ilol.Ilol_II().I_I_) {
            I_I_ i_I_ = this.I_I__III();
            if (this.var_I_I__II != i_I_) {
                this.var_I_I__II = i_I_;
                Il_.III().II0();
                Il_I.III().II0();
            }
            if (this.var_I_I__II != null) {
                int n = Il_O.II(Ilol.Ilol_II(), this.var_I_I__II);
                if (n <= 50) {
                    Il_.III().II0();
                    Il_I.III().II0();
                    this.IloO();
                } else if (Il_0.II_()) {
                    Il_0.III1(this.var_I_I__II.I1, this.var_I_I__II.I1I);
                } else if (this.IlO1 == 0) {
                    if (!Il_I.III().II1O()) {
                        Il10.IIII iIII = new Il10.IIII(Ilol.Ilol_II().I_o_ / 24, Ilol.Ilol_II().I_oO / 24);
                        Il10.IIII iIII2 = new Il10.IIII(this.var_I_I__II.I1 / 24, this.var_I_I__II.I1I / 24);
                        Il_I.III().II(iIII, iIII2);
                    }
                } else if (this.IlO1 == 1) {
                    Il_0.III1(this.var_I_I__II.I1, this.var_I_I__II.I1I);
                } else if (this.IlO1 == 2 && !Il_.III().II1O()) {
                    Il10.IIII iIII = new Il10.IIII(Ilol.Ilol_II().I_o_ / 24, Ilol.Ilol_II().I_oO / 24);
                    Il10.IIII iIII3 = new Il10.IIII(this.var_I_I__II.I1 / 24, this.var_I_I__II.I1I / 24);
                    Il_.III().II(iIII, iIII3);
                }
            }
        }
    }

    public void I1I1() {
        this.var_javax_microedition_lcdui_Form_IIIl = new Form(II0l.IIl0("\ubedb\ua07b\ubeb6\ubed4\ubf5b\ubf62\ubf71\ubf21\ubffa\ubf4f\ubfa4", 48791));
        String string = this.IIO1 > 0L ? String.valueOf(this.IIO1) : "";
        this.var_javax_microedition_lcdui_TextField_III0 = new TextField(II0l.IIl0("\ubedf\ubee6\ubef5\ubea0\ua1c2\ubf5b\ubf71\ube60\ubfee\ubf94", 48791), string, 500000000, 2);
        String string2 = this.IIO_ > 0L ? String.valueOf(this.IIO_) : "";
        this.IIIo = new TextField(II0l.IIl0("\ubedf\ubee6\ubef5\ubea0\ua1c2\ubf5b\ubf71\ubf24\ubfe7\ubfc7\ua10e\ubf99\uc031", 48791), string2, 500000000, 2);
        this.var_javax_microedition_lcdui_Form_IIIl.append((Item)this.var_javax_microedition_lcdui_TextField_III0);
        this.var_javax_microedition_lcdui_Form_IIIl.append((Item)this.IIIo);
        this.IIIO = new Command(II0l.IIl0("\ubedb\ubf06\ubea0", 48791), 4, 1);
        this.var_javax_microedition_lcdui_Command_III0 = new Command(II0l.IIl0("\ubedf\ubec3\ua022", 48791), 3, 1);
        this.var_javax_microedition_lcdui_Form_IIIl.addCommand(this.IIIO);
        this.var_javax_microedition_lcdui_Form_IIIl.addCommand(this.var_javax_microedition_lcdui_Command_III0);
        this.var_javax_microedition_lcdui_Form_IIIl.setCommandListener((CommandListener)this);
    }

    private void I1I_() {
        this.I1I1();
        Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)this.var_javax_microedition_lcdui_Form_IIIl);
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command == this.IIIO) {
            try {
                long l;
                String string = this.var_javax_microedition_lcdui_TextField_III0.getString().trim();
                String string2 = this.IIIo.getString().trim();
                if (Il_o.boolean_III1(string)) {
                    this.IIO1 = 0L;
                } else {
                    l = Long.parseLong(string);
                    if (l < 0L) {
                        I1_I.var_I1Oo_II.IIII(II0l.IIl0("\ubedf\ubee6\ubef5\ube80\ua1c2\ubf5b\ubf71\ube61\ubfee\ubf8e\ubfbd\ubf84\udea8\uc043\uc069\uc056\uc0ba\uc086\uc0f5", 48791), 0);
                        return;
                    }
                    this.IIO1 = l;
                }
                if (Il_o.boolean_III1(string2)) {
                    this.IIO_ = 0L;
                } else {
                    l = Long.parseLong(string2);
                    if (l < 0L) {
                        I1_I.var_I1Oo_II.IIII(II0l.IIl0("\ubedf\ubee6\ubef5\ube80\ua1c2\ubf5b\ubf71\ubf04\ubfe7\ubfc7\ua10e\ubf99\uc02b\uc05a\uc021\udecb\uc0ee\uc086\uc0fb\uc0d9\uc123\uc112", 48791), 0);
                        return;
                    }
                    this.IIO_ = l;
                }
                if (this.IIO1 > 0L && this.IIO_ > 0L && this.IIO_ > this.IIO1) {
                    I1_I.var_I1Oo_II.IIII(II0l.IIl0("\ubedf\ubee6\ubef5\ube80\ua1c2\ubf5b\ubf71\ubf04\ubfe7\ubfc7\ua10e\ubf99\uc02b\uc041\uc021\uc09c\uc0e9\uc0c1\uc0e5\uc1f5\uc0b3\udfc1\uc122\uc140\uc113\udf45\uc1d3\uc1fc\uc193\uc3bb\uc257\uc278\uc23f\uc2c6\uc295\uc2a0\udc22\uc37b\uc311\uc241\uc30e", 48791), 0);
                    return;
                }
                this.IIOl();
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
                if (this.IIO1 <= 0L && this.IIO_ <= 0L) {
                    this.IIIl(II0l.IIl0("\ubf87\ube55\ubef5\ube80\ua1bc\ubf46\ubf71\ubf1c\ua142\ubfcd\ubfed\ubfa4\uc05b", 48791));
                } else {
                    this.IIIl(II0l.IIl0("\ubf87\ube55\ubef5\ube98\ubea3\ubf47\ubf6b\ubf50\ubfc7\ubffe\ubfed", 48791) + this.IIO_ + II0l.IIl0("\ubeb7\ube9b\ubef5", 48791) + this.IIO1);
                }
                this.II_I();
            }
            catch (NumberFormatException numberFormatException) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
                I1_I.var_I1Oo_II.IIII(II0l.IIl0("\ubedb\ua061\ubebc\ubece\ubf33\ubf7c\ubf39\ua1dd\ubfff\ubf8e\ubfbe\ua13d\uc02b\uc041\uc021\uc09c\uc0e9\uc0c1\uc0e5\uc08c\udfe0\uc152\uc161\uc10c\udfb8", 48791), 0);
            }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
                I1_I.var_I1Oo_II.IIII(II0l.IIl0("\ubedb\ua061\ubebc\ubece\ubf33", 48791) + exception.getMessage(), 0);
            }
        }
        if (command == this.var_javax_microedition_lcdui_Command_III0) {
            Display.getDisplay((MIDlet)GameMidlet.II).setCurrent((Displayable)II.var_II_II);
            this.II_I();
        }
    }

    public void II_I() {
        Object object;
        Il_l.II iI = new Il_l.II();
        Il1_ il1_ = Il1_.II().Il1__III().II(II0l.IIl0("\ubed6\ubec3\ubea1\ube9b\ubf33\ubf66\ubf23\ubf11\ubfe6\ubfc0", 48791));
        if (this.IllO) {
            il1_.II(II0l.IIl0("\ubec3\ua019\ubea1\ubed4\ubf47\ubfd2\ubf3f\ubf50\ubfdc\ubf4f\ubfb9", 48791), "", 5, null);
        }
        for (int i = 0; i < I1_I.var_I_lO_IIO.size(); ++i) {
            object = (I_I_)I1_I.var_I_lO_IIO.elementAt(i);
            if (((I_I_)object).I0I1) continue;
            boolean bl = false;
            for (int j = 0; j < iI.IIlO(); ++j) {
                I_I_ i_I_ = (I_I_)iI.II(j);
                if (((I_I_)object).I1ll != i_I_.I1ll) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            iI.void_III(object);
            il1_.II(II0l.IIl0("\ubec3\ube56\ubebb\ubed4\ubf40\ubfd3\ubf25\ubf50", 48791) + ((I_I_)object).I_Io_II().II1o, "", 1, new Integer(((I_I_)object).I1ll));
        }
        il1_.II(II0l.IIl0("\ubec3\ube56\ubebb\ubed4\ubf40\ubfd3\ubf25\ubf50\ubfdb\ua10b\ubfb9\ubfcc\uc048\ude89", 48791), "", 2, null);
        il1_.II(II0l.IIl0("\ubed9\ube5f\ubef5\ubea7\ubf7a\ubfd8\ubf24\ubf50\ubfde\ubfdb\ubf2c\ubf85", 48791), this.Il1 ? II0l.IIl0("\ubed5\ua01b\ubea1", 48791) : II0l.IIl0("\ubec3\ua019\ubea1", 48791), 3, null);
        String string = this.IlO1 == 0 ? II0l.IIl0("\ubed3\ubedf\ubef5\ubeb7\ubf7b\ubf47\ubf28\ua1b3\ubfe1\ubf8e\ubf99\ubf84\uc0ff\uc044\uc02e\uc048\uc0ca\uc0cf\uc0ab\uc08c", 48791) : (this.IlO1 == 1 ? II0l.IIl0("\ubed3\ua07d\ubeb6\ube9c\ubf33\ubf71\ubf39\ubf05\ubff6\ua16d\ubfa3\ubfcc\uc05d\uc0ca\uc026\uc048\uc0d6\uc0d3\uc024\uc08d", 48791) : II0l.IIl0("\ubf87\ubedf\ubef5\ubeb6\ua1ca\ubf12\ubf05\ubf18\ubf7b\ubfc0\ubfaa\ubfcc\uc046\uc043\uc027\uc000", 48791));
        il1_.II(string, "", 6, null);
        il1_.II(II0l.IIl0("\ubf87\ua071\ubef5\ubea0\ua1fe\ubf12\ubf05\ubf90\ubfe1\ubf8e\ubf9e\ubf0d\uc07f", 48791), this.Il1I ? II0l.IIl0("\ubed5\ua01b\ubea1", 48791) : II0l.IIl0("\ubec3\ua019\ubea1", 48791), 7, null);
        il1_.II(II0l.IIl0("\ubed4\ube56\ubebc\ubed4\ube03\ua185\ubf25\ubf50\ubfdc\ubfc5\ubfa4\ubf80\uc067", 48791), "", 8, null);
        il1_.II(II0l.IIl0("\ubf87\ua063\ubebc\ubed4\ubf7e\ua1d7\ubf32\ubf50\ubffb\ubfc7\ubf27\ubf99\uc02b\uc041\uc021\uc001\uc0a7\uc0ea\uc084\uc0a3", 48791), this.Il1l ? II0l.IIl0("\ubed5\ua01b\ubea1", 48791) : II0l.IIl0("\ubec3\ua019\ubea1", 48791), 9, null);
        object = this.IIO1 <= 0L && this.IIO_ <= 0L ? II0l.IIl0("\ubec3\ua019\ubea1", 48791) : this.IIO_ + II0l.IIl0("\ubeb7\ube9b\ubef5", 48791) + this.IIO1;
        il1_.II(II0l.IIl0("\ubedb\ua07b\ubeb6\ubed4\ubf5b\ubf62\ubf71\ubf21\ubffa\ubf4f\ubfa4", 48791), (String)object, 10, null);
        il1_.II(II0l.IIl0("\ubed0\ubed9\ubeb7\ube95\ubf70\ubf59", 48791), "", 11, null);
        il1_.II(II0l.IIl0("\ubec6\ubec3\ubeb4\ube8d\ubf33\ubf5e\ua1f0\ubf19", 48791), "", 12, null);
        il1_.Il1__II(this);
        il1_.I__0();
    }

    @Override
    public void II(int n, Object object) {
        switch (n) {
            case 1: {
                int n2 = (Integer)object;
                this.var_Il_l$II_IIIl.I_1O();
                this.var_Il_l$II_IIIl.void_III(new Integer(n2));
                this.I1II();
                this.II_I();
                break;
            }
            case 2: {
                this.var_Il_l$II_IIIl.I_1O();
                for (int i = 0; i < I1_I.var_I_lO_IIO.size(); ++i) {
                    I_I_ i_I_ = (I_I_)I1_I.var_I_lO_IIO.elementAt(i);
                    if (i_I_.I0I1 || this.var_Il_l$II_IIIl.boolean_III(new Integer(i_I_.I1ll))) continue;
                    this.var_Il_l$II_IIIl.void_III(new Integer(i_I_.I1ll));
                }
                this.I1II();
                this.II_I();
                break;
            }
            case 3: {
                this.Il1 = !this.Il1;
                this.IIOl();
                this.IIIl(II0l.IIl0("\ubed9\ube5f\ubef5\ubea7\ubf7a\ubfd8\ubf24\ubf50\ubfde\ubfdb\ubf2c\ubf85\uc031\uc00a", 48791) + (this.Il1 ? II0l.IIl0("\ubed5\ua01b\ubea1", 48791) : II0l.IIl0("\ubec3\ua019\ubea1", 48791)));
                this.II_I();
            }
            default: {
                break;
            }
            case 5: {
                this.IllO = false;
                this.Illo = false;
                this.var_Il_l$II_IIIl.I_1O();
                this.var_I_I__II = null;
                Ilol.Ilol_II().var_I_I__IIII = null;
                Il_.III().II0();
                Il_I.III().II0();
                this.IIIl(II0l.IIl0("\ubf87\ube55\ubef5\ubea0\ua1bc\ubf46\ubf71\ubf24\ubf6f\ubfc0\ubfed\ubfbf\uc0ea\uc05e\uc068", 48791));
                this.II_I();
                break;
            }
            case 6: {
                this.IlO1 = (this.IlO1 + 1) % 3;
                this.IIOl();
                String string = this.IlO1 == 0 ? II0l.IIl0("\ubed3\ubedf\ubef5\ubeb7\ubf7b\ubf47\ubf28\ua1b3\ubfe1\ubf8e\ubf99\ubf84\uc0ff\uc044\uc02e\uc048\uc0ca\uc0cf\uc0ab\uc08c", 48791) : (this.IlO1 == 1 ? II0l.IIl0("\ubed3\ua07d\ubeb6\ube9c\ubf33\ubf71\ubf39\ubf05\ubff6\ua16d\ubfa3", 48791) : II0l.IIl0("\ubf87\ubedf\ubef5\ubeb6\ua1ca\ubf12\ubf05\ubf18\ubf7b\ubfc0\ubfaa\ubfcc\uc046\uc043\uc027\uc000", 48791));
                this.IIIl(string + II0l.IIl0("\ubeb7\ubfa6\ube36\ubed4\ubf51\ua19f\ubf25\ubf51", 48791));
                this.II_I();
                break;
            }
            case 7: {
                boolean bl = this.Il1I = !this.Il1I;
                if (this.Il1I && !II10.III().II00) {
                    II10.III().II00 = true;
                }
                this.IIOl();
                this.IIIl(II0l.IIl0("\ubf87\ua071\ubef5\ubea0\ua1fe\ubf12\ubf05\ubf90\ubfe1\ubf8e\ubf9e\ubf0d\uc07f\uc010\uc069", 48791) + (this.Il1I ? II0l.IIl0("\ubed5\ua01b\ubea1", 48791) : II0l.IIl0("\ubec3\ua019\ubea1", 48791)));
                this.II_I();
                break;
            }
            case 8: {
                Il1O.Il1O_III().II_I();
                break;
            }
            case 9: {
                this.Il1l = !this.Il1l;
                this.IIOl();
                this.IIIl(II0l.IIl0("\ubf87\ua063\ubebc\ubed4\ubf7e\ua1d7\ubf32\ubf50\ubffb\ubfc7\ubf27\ubf99\uc02b\uc041\uc021\uc001\uc0a7\uc0ea\uc084\uc0a3\uc139\uc102", 48791) + (this.Il1l ? II0l.IIl0("\ubed5\ua01b\ubea1", 48791) : II0l.IIl0("\ubec3\ua019\ubea1", 48791)));
                this.II_I();
                break;
            }
            case 10: {
                this.I1I_();
                break;
            }
            case 11: {
                IIo_.III().II_I();
                break;
            }
            case 12: {
                IlI.III().I_1l();
            }
        }
    }

    public I_0o II(int n) {
        if (I1_I.var_I_0o_arr_III == null) {
            return null;
        }
        for (int i = 0; i < I1_I.var_I_0o_arr_III.length; ++i) {
            I_0o i_0o = I1_I.var_I_0o_arr_III[i];
            if (i_0o == null || i_0o.II == null || i_0o.II.IlIO != n) continue;
            return i_0o;
        }
        return null;
    }

    private boolean II(I_0o i_0o) {
        if (i_0o.II.l1Ol == 2) {
            return true;
        }
        if (i_0o.II.l1Ol != 1) {
            return (long)Ilol.Ilol_II().IOl1 >= (long)i_0o.l1O;
        }
        return (long)Ilol.Ilol_II().IOl1 >= (long)i_0o.l1O * (long)Ilol.Ilol_II().IO1 / 100L;
    }

    public void II(Il_l.II iI) {
        for (int i = 0; i < iI.IIlO(); ++i) {
            long l;
            int n = (Integer)iI.II(i);
            I_0o i_0o = this.II(n);
            if (i_0o == null) continue;
            if (Ilol.Ilol_II().I1_0 || Ilol.Ilol_II().I_I1 || (l = IO10.IIII()) - this.IIOl < 500L) break;
            if (l - i_0o.I1IO >= (long)i_0o.l1_O && this.II(i_0o) && i_0o.II.IoI_ != 1) {
                if (i_0o.II.IlIO() && i_0o.II.IlIO == 7) {
                    this.I1I0();
                    return;
                }
                if (i_0o.II.IlI0()) {
                    I1_I.I1_I_II().II(i_0o, true);
                    I1_I.I1_I_II().II(i_0o, true);
                    switch (i_0o.II.IlIO) {
                        case 8: {
                            I_0_.II().IIo(8);
                            I_0_.II().III1((byte)1);
                            break;
                        }
                        case 12: {
                            I_0_.II().IIo(12);
                            I_0_.II().III1((byte)8);
                            break;
                        }
                        case 13: {
                            I_0_.II().IIo(13);
                            I_0_.II().III1((byte)6);
                            break;
                        }
                        case 19: {
                            I_0_.II().IIo(19);
                            I_0_.II().III1((byte)9);
                        }
                    }
                    i_0o.I1IO = l;
                    this.IIOl = l;
                }
            }
            if (Ilol.Ilol_II().IOIO == 1 && I1_I.var_I_0o_arr_III[5] != null && i_0o.II.IlIO == 2) break;
            if (i_0o.II.IoI_ != 1 || l - i_0o.I1IO < (long)i_0o.l1_O || !this.II(i_0o)) continue;
            if (Ilol.Ilol_II().var_I_0o_II == i_0o) break;
            I_0_.II().IIo(i_0o.II.IlIO);
            Ilol.Ilol_II().var_I_0o_II = i_0o;
            break;
        }
    }

    public void I1IO() {
        Ilol ilol = Ilol.Ilol_II();
        if (ilol != null && ilol.var_I101_arr_II != null) {
            I101 i101;
            int n;
            I101[] i101Array = Ilol.Ilol_II().var_I101_arr_II;
            int n2 = i101Array.length;
            for (n = 0; n < n2; ++n) {
                i101 = i101Array[n];
                if (i101 == null || i101.var_I1o_II.II__ != 212) continue;
                I_0_.II().II((byte)0, (byte)1, (byte)i101.lIO_, (short)-1);
                return;
            }
            for (n = 0; n < n2; ++n) {
                i101 = i101Array[n];
                if (i101 == null || i101.var_I1o_II.II__ != 211) continue;
                I_0_.II().II((byte)0, (byte)1, (byte)i101.lIO_, (short)-1);
                break;
            }
        }
    }

    private void I1I0() {
        if (Ilol.Ilol_II().IOIO == 1) {
            byte by = Ilol.Ilol_II().var_I_0o_II.II.IlIO;
            I_o1 i_o1 = new I_o1();
            i_o1.IlIO = (byte)7;
            I_0o i_0o = Ilol.Ilol_II().II(i_o1);
            long l = IO10.IIII();
            if (l - i_0o.I1IO >= (long)i_0o.l1_O) {
                I_0_.II().IIo(i_o1.IlIO);
                I_lO i_lO = new I_lO("");
                i_lO.addElement(Ilol.Ilol_II());
                I_0_.II().II(new I_lO(), i_lO, -1);
                i_0o.I1IO = l;
                I_0_.II().IIo(by);
            }
        }
    }

    static /* synthetic */ void II(II0l iI0l) {
        iI0l.Ilo_();
    }

    static /* synthetic */ void III(II0l iI0l) {
        iI0l.I1Il();
    }

    private static /* synthetic */ String IIl0(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ n + i * 31);
        }
        return new String(cArray);
    }
}

