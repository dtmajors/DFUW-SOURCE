/*
 * Decompiled with CFR.
 */
public class dtx
extends dtu {
    protected ldv Rs = null;
    protected ldv adA = null;
    protected int ObjectType = -1;
    protected int Uo = -1;

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public ldv bAD() {
        return this.adA;
    }

    public void oq(ldv ldv2) {
        this.adA = ldv2;
    }

    public int getObjectType() {
        return this.ObjectType;
    }

    public void setObjectType(int n) {
        this.ObjectType = n;
    }

    public int AJ() {
        return this.Uo;
    }

    public void eS(int n) {
        this.Uo = n;
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof dtx) {
            dtx dtx2 = (dtx)object;
            if (this.hdr < dtx2.getLevel()) {
                return -1;
            }
            if (this.hdr == dtx2.getLevel()) {
                return 0;
            }
            return 1;
        }
        assert (false) : "Object is not a SFSubscriptionPermission! It's a " + object.getClass().getName();
        return -1;
    }
}

