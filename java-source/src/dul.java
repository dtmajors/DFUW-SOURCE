/*
 * Decompiled with CFR.
 */
public class dul
extends amf {
    private int gqN = 0;
    private ldv blo = null;
    private ldv blp = null;

    public dul() {
        this.ObjectType = 37;
    }

    public dul(ldv ldv2, ldv ldv3, int n) {
        this.gqN = n;
        this.blo = ldv2;
        this.blp = ldv3;
        this.ObjectType = 37;
    }

    public int getRelationType() {
        return this.gqN;
    }

    public void setRelationType(int n) {
        assert (this.gqN == 0);
        this.gqN = n;
    }

    public ldv Bq() {
        return this.blo;
    }

    public void cM(ldv ldv2) {
        assert (this.blo == null);
        this.blo = ldv2;
    }

    public ldv Br() {
        return this.blp;
    }

    public void cN(ldv ldv2) {
        assert (this.blp == null);
        this.blp = ldv2;
    }

    public final int bBj() {
        return dup.Cu(this.gqN);
    }

    @Override
    public void reset() {
        this.gqN = 0;
        this.blo = null;
        this.blp = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRelationBase: GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" Type=");
        stringBuilder.append(this.gqN);
        if (this.blo != null) {
            stringBuilder.append(" StartPoint=");
            stringBuilder.append(this.blo);
        } else {
            stringBuilder.append(" StartPoint=null");
        }
        if (this.blp != null) {
            stringBuilder.append(" EndPoint=");
            stringBuilder.append(this.blp);
        } else {
            stringBuilder.append(" EndPoint=null");
        }
        return stringBuilder.toString();
    }
}

