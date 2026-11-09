/*
 * Decompiled with CFR.
 */
class inf
extends ize {
    private cwz mlU;

    public inf(cwz cwz2) {
        this.mlU = cwz2;
        lgw lgw2 = (lgw)lea.enW().acv(cwz2.az());
        String string = lgw2.enm();
        if (string != null && !string.isEmpty()) {
            this.dss().qP("/dfdata/texture/dds/" + string);
            this.dss().a(new iqu(40, 40));
        }
        this.drd().a(isf.mwO, 12);
        this.drd().Rk(0xABABAB);
        this.drd().o(lvm.sXa.bD(cwz2.az()));
    }

    public cwz dgf() {
        return this.mlU;
    }
}

