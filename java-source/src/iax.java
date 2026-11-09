/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hyn
 *  iba
 *  lcw
 */
public abstract class iax
extends hzk {
    public static final float lCU = 0.004f;
    public static final float lCV = 0.05f;
    public static final int lCW = 430;
    public static final int lCX = 30;
    protected iba lwn;
    protected Boolean lCY = false;
    protected int lCZ = -1;
    protected float lDa = 0.0f;

    public iax(String string, String string2, iba iba2) {
        super(string, string2);
        this.OQ(jnz.nGb | jnz.nGc);
        this.a(hyb.lmG);
        this.a(hxu.lle);
        this.lwn = iba2;
    }

    public void initialize() {
        super.initialize();
    }

    public void cleanUp() {
        super.cleanUp();
    }

    protected void cBa() {
        this.cGz();
        this.pB(this instanceof ibc);
        this.a("setBuildType", new Object[]{lcw.bcB});
    }

    public void cHn() {
    }

    protected void cEa() {
        this.cGz();
    }

    protected void g(int n, int n2, String string) {
        this.lCY = this.Pz(n);
        this.lCZ = n;
    }

    protected void e(int n, int n2, String string) {
        this.lCY = false;
        this.lCZ = -1;
        this.lDa = 0.0f;
    }

    protected void b(int n, int n2, int n3, String string) {
        if (this.lCY.booleanValue() && this.lCZ >= 0) {
            this.lDa = (float)(this.lCZ - n) * 0.004f;
            this.lCZ = n;
        }
    }

    protected boolean cEm() {
        return false;
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 5 || stringArray[0] == null) {
            return null;
        }
        float f = Float.valueOf(stringArray[1]).floatValue();
        float f2 = Float.valueOf(stringArray[2]).floatValue();
        float f3 = Float.valueOf(stringArray[4]).floatValue();
        if (stringArray[0].equals("backButton")) {
            return new hzz((int)f + 20, (int)f2, 0, (int)f3, true, lyi.tEK.bD(new Object[0]).exA());
        }
        if (stringArray[0].equals("quickstartButton")) {
            return new hzz((int)f + 20, (int)f2, 0, (int)f3, true, lyi.tEL.bD(new Object[0]).exA());
        }
        if (stringArray[0].equals("closeButton")) {
            if (iba.lDE) {
                return new hzz((int)this.getWidth() - 25, (int)f2, 0, (int)f3, false, lyi.tEv.bD(cug.fub).exA());
            }
            return new hzz((int)this.getWidth() - 25, (int)f2, 0, (int)f3, false, lyi.tEu.bD(new Object[0]).exA());
        }
        return null;
    }

    protected boolean Pz(int n) {
        return n > 430 && (float)n < this.cEN().W - 30.0f;
    }

    protected void cGz() {
        this.N(this.cEN().W / this.cEJ(), this.cEN().H / this.cDc());
        this.cER();
        this.a("setScreenSize", new Object[]{Float.valueOf(this.cEN().W), Float.valueOf(this.cEN().H)});
    }

    @llk
    protected void closeCharacterCreator() {
        this.lwn.closeCharacterCreator();
    }

    @llk
    protected void goToNextScreen() {
        this.lwn.goToNextScreen();
    }

    @llk
    protected void goToPreviousScreen() {
        this.lwn.goToPreviousScreen();
    }

    @llk
    protected void accept() {
        this.lwn.accept();
    }

    protected void f(String string, String string2, String string3) {
        this.a("setHeaderData", new Object[]{string, string2, string3});
        this.a("setFooterData", new Object[]{lvq.sYL.bD(new Object[0]).exA(), lvq.sYM.bD(new Object[0]).exA(), lvq.sYN.bD(new Object[0]).exA()});
    }

    public void pB(boolean bl) {
        this.a("setNavigationButtonsEnabled", new Object[]{bl});
    }

    public void pC(boolean bl) {
        this.a("setRandomizeButtonEnabled", new Object[]{bl});
    }

    public void pD(boolean bl) {
        this.a("setAcceptButtonVisible", new Object[]{bl});
    }

    public abstract iay.a cLv();

    protected abstract void cEk();
}

