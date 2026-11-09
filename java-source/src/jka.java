/*
 * Decompiled with CFR.
 */
public class jka {
    jjw nrU;
    private jkd nrV;
    private ldv min;
    private ljq lSi;
    private String _name;
    private jkc nrW = new jkc();

    public jka(jkd jkd2, ldv ldv2, String string, ljq ljq2) {
        this.nrV = jkd2;
        this.min = ldv2;
        this._name = string;
        this.lSi = ljq2;
    }

    public jkd dKU() {
        return this.nrV;
    }

    public ldv getGUID() {
        return this.min;
    }

    public ljq av() {
        return this.lSi;
    }

    public jjw dKV() {
        return this.nrU;
    }

    public String getName() {
        return this._name;
    }

    public jkc dKW() {
        return this.nrW;
    }

    public void a(jkc jkc2) {
        this.nrW = jkc2;
        if (this.nrU != null && this.nrU.nrD != null) {
            for (jjx jjx2 : this.nrU.nrD.nrR) {
                jjx2.c(this.nrU, this);
            }
        }
    }

    public boolean dJZ() {
        return this.nrV.dJZ();
    }
}

