/*
 * Decompiled with CFR.
 */
public class ifp {
    private String lRG;
    private float lRH;
    private boolean lRI = true;

    public ifp(String string) {
        this.lRG = string;
        this.lRH = lea.eps().hk(string);
    }

    public String ym() {
        return this.lRG;
    }

    public float getWeight() {
        return this.lRH;
    }

    public boolean isActive() {
        return this.lRI;
    }

    public void setActive(boolean bl) {
        this.lRI = bl;
    }

    public boolean e(ign ign2) {
        return this.lRI && ign2.qf(this.lRG);
    }
}

