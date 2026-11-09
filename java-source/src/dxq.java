/*
 * Decompiled with CFR.
 */
public abstract class dxq
implements Cloneable {
    private final int hsO;
    protected ldv hA = null;
    protected ldv eSR = null;
    public boolean hsP = false;
    protected ldv hsQ = null;

    @Deprecated
    private dxq() {
        this.hsO = 0;
    }

    protected dxq(int n2) {
        this.hsO = n2;
    }

    public int bEz() {
        return this.hsO;
    }

    public void f(ldv ldv2) {
        this.hA = ldv2;
    }

    public ldv aO() {
        return this.hA;
    }

    public void on(ldv ldv2) {
        this.eSR = ldv2;
    }

    public ldv amk() {
        return this.eSR;
    }

    public final boolean bEA() {
        return this.hsP;
    }

    public final void jM(boolean bl) {
        this.hsP = bl;
    }

    public ldv bEB() {
        return this.hsQ;
    }

    public void oA(ldv ldv2) {
        this.hsQ = ldv2;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            lfn.log("SFMessageBase", cloneNotSupportedException);
            return null;
        }
    }

    public String bEC() {
        return super.toString();
    }

    public final int bED() {
        return 0xFFF00 & this.hsO;
    }

    public static final int CV(int n2) {
        return 0xFFF00 & n2;
    }

    public String toString() {
        return super.toString() + ", MsgType=" + this.hsO + ", FromGUID=" + this.hA + ", ToGUID=" + this.eSR;
    }

    public void Y(dxq dxq2) {
        dxq2.hA = this.hA;
        dxq2.eSR = this.eSR;
        dxq2.hsP = this.hsP;
        dxq2.hsQ = this.hsQ;
    }

    public dxq bEE() {
        return this;
    }

    public dxq bEF() {
        return this;
    }
}

