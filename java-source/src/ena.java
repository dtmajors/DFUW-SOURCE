/*
 * Decompiled with CFR.
 */
public class ena
extends emr {
    private ldv ade = null;
    private String add = null;
    private int iuO = -1;
    private bcb iuP = null;

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

    public bbs bIQ() {
        return bbs.getValueByOrdinal(this.iuO);
    }

    public void d(bbs bbs2) {
        this.iuO = bbs2 == null ? this.iuO : bbs2.ordinal();
    }

    public bcb qq() {
        return this.iuP;
    }

    public void d(bcb bcb2) {
        this.iuP = bcb2;
    }

    ena() {
        super(13913);
    }
}

