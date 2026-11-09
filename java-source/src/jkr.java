/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jju
 */
public abstract class jkr {
    private jju nth;
    private jks nti;
    private boolean mxb;

    public jkr(jju jju2, jks jks2) {
        this.nth = jju2;
        this.nti = jks2;
        this.mxb = true;
    }

    public jju dLt() {
        return this.nth;
    }

    public jks dLu() {
        return this.nti;
    }

    public int getId() {
        return this.nti.ordinal();
    }

    public String getName() {
        return this.nti.name();
    }

    public boolean djL() {
        return this.mxb;
    }

    public void setVisible(boolean bl) {
        if (bl == this.mxb) {
            return;
        }
        this.mxb = bl;
        this.a("setOverlayVisible", this.getId(), this.mxb);
    }

    public boolean a(String string, Object ... objectArray) {
        return this.nth != null ? this.nth.a(string, objectArray) : false;
    }

    public abstract void Vf(int var1);

    public static int c(float f2, int n) {
        return (int)(f2 * 255.0f) << 24 | n;
    }
}

