/*
 * Decompiled with CFR.
 */
public class baw {
    private ldv ade = null;
    private String add = null;
    private boolean cPh = false;
    private ldv aEA = null;
    private String cPi = null;

    public ldv iG() {
        return this.ade;
    }

    void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public String iV() {
        return this.add;
    }

    void cD(String string) {
        this.add = string;
    }

    public boolean aiZ() {
        return this.cPh;
    }

    public boolean aja() {
        return !this.cPh;
    }

    public boolean afV() {
        return this.aEA != null;
    }

    public boolean ajb() {
        return this.afV() && this.cPh;
    }

    public boolean ajc() {
        return this.afV() && !this.cPh;
    }

    void a(boolean bl, ldv ldv2, String string) {
        this.cPh = bl;
        this.aEA = ldv2;
        this.cPi = string;
    }

    public ldv ajd() {
        return this.aEA;
    }

    public String aje() {
        return this.cPi;
    }

    baw() {
    }
}

