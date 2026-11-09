/*
 * Decompiled with CFR.
 */
public class ayk {
    private ldv GUID = null;
    private ljq Position = null;
    private String ID = null;
    private boolean czb = false;
    private String czc = null;
    private ldv czd = null;

    public ldv getGUID() {
        return this.GUID;
    }

    public ljq av() {
        return this.Position;
    }

    public String getID() {
        return this.ID;
    }

    public boolean aaW() {
        return this.czb;
    }

    public boolean aaX() {
        return this.czd != null;
    }

    public String aaY() {
        return this.czc;
    }

    public ldv aaZ() {
        return this.czd;
    }

    @Deprecated
    public ayk() {
    }

    public ayk(bbf bbf2) {
        this.GUID = bbf2.ajD();
        this.Position = bbf2.ajE();
        this.ID = bbf2.ajH();
    }

    public void co(boolean bl) {
        this.czb = bl;
    }

    public void aba() {
        this.czd = null;
        this.czc = null;
    }

    public void i(ldv ldv2, String string) {
        this.czd = ldv2;
        this.czc = string;
    }
}

