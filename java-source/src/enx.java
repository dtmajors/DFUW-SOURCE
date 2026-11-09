/*
 * Decompiled with CFR.
 */
public class enx
extends emr {
    private ldv Ri = null;
    private int iwa = bdj.dak.ordinal();

    public ldv qd() {
        return this.Ri;
    }

    public void oH(ldv ldv2) {
        this.Ri = ldv2;
    }

    public bdj bJS() {
        return bdj.getValueByOrdinal(this.iwa);
    }

    public void e(bdj bdj2) {
        this.iwa = bdj2 == null ? this.iwa : bdj2.ordinal();
    }

    enx() {
        super(13833);
    }
}

