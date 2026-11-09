/*
 * Decompiled with CFR.
 */
public class ftm
extends ftt {
    private ldv ade = null;
    private String add = null;
    private int iVS = bbs.NoRank.ordinal();

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public String iV() {
        return this.add;
    }

    public void cD(String string) {
        this.add = string;
    }

    public bbs bRM() {
        return bbs.getValueByOrdinal(this.iVS);
    }

    public void f(bbs bbs2) {
        this.iVS = bbs2 == null ? this.iVS : bbs2.ordinal();
    }

    ftm() {
        super(1055);
    }
}

