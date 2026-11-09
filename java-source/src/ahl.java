/*
 * Decompiled with CFR.
 */
public class ahl
extends ahz {
    private ldv blo = null;
    private ldv blp = null;

    public ahl() {
        super(3);
        this.bls = ahu.c.bmE;
    }

    public ahl(int n) {
        super(n);
        this.bls = ahu.c.bmE;
    }

    public ldv Bq() {
        return this.blo;
    }

    public void cM(ldv ldv2) {
        this.blo = ldv2;
    }

    public ldv Br() {
        return this.blp;
    }

    public void cN(ldv ldv2) {
        this.blp = ldv2;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "StartPoint";
            }
            case 2: {
                return "EndPoint";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
    }

    public boolean AC() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" StartPoint=");
        stringBuilder.append(this.blo);
        stringBuilder.append(" EndPoint=");
        stringBuilder.append(this.blp);
        stringBuilder.append(" Type=");
        stringBuilder.append(this.Bz());
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                ug ug2 = new ug();
                ug2.Uo = n;
                ug2.PB = this.blo;
                return ug2;
            }
            case 2: {
                ug ug3 = new ug();
                ug3.Uo = n;
                ug3.PB = this.blp;
                return ug3;
            }
        }
        return super.G(n, n2);
    }
}

