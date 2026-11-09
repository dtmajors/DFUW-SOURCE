/*
 * Decompiled with CFR.
 */
public abstract class knm
extends khd {
    public ldv ehv = null;
    public ldv ehw = null;
    public ldv doP = null;
    public boolean dsK = false;

    knm() {
    }

    public void a(knm knm2) {
        this.ehv = knm2.ehv;
        this.ehw = knm2.ehw;
        this.doP = knm2.doP;
        this.dsK = knm2.dsK;
        super.d(knm2);
    }

    public ldv bUk() {
        return this.ehv;
    }

    public void qj(ldv ldv2) {
        this.ehv = ldv2;
    }

    public ldv bUl() {
        return this.ehw;
    }

    public void qk(ldv ldv2) {
        this.ehw = ldv2;
    }

    public ldv aSO() {
        return this.doP;
    }

    public void kX(ldv ldv2) {
        this.doP = ldv2;
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ObjectFromGUID=");
        stringBuilder.append(this.ehv);
        stringBuilder.append(" ObjectToGUID=");
        stringBuilder.append(this.ehw);
        stringBuilder.append(" RelationGUID=");
        stringBuilder.append(this.doP);
        return stringBuilder.toString();
    }
}

