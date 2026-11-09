/*
 * Decompiled with CFR.
 */
public class fgj
extends fgp {
    private byte iLK = (byte)-1;
    private byte iLL = 0;

    public jc bPc() {
        return jc.getValueByOrdinal(this.iLK);
    }

    public void b(jc jc2) {
        this.iLK = jc2 == null ? this.iLK : (byte)jc2.ordinal();
    }

    public int getPlayCount() {
        return this.iLL;
    }

    public void setPlayCount(int n) {
        this.iLL = (byte)n;
    }

    fgj() {
        super(29452);
    }
}

