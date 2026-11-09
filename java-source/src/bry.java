/*
 * Decompiled with CFR.
 */
public class bry {
    public final lef dAy;
    public final ldv dJf;

    public bry(ldv ldv2) {
        assert (ldv2 != null);
        this.dJf = ldv2;
        this.dAy = leg.eqd();
    }

    public final boolean equals(Object object) {
        assert (this.dAy != null);
        assert (this.dJf != null);
        if (object instanceof bry) {
            bry bry2 = (bry)object;
            if (this.dAy.equals(bry2.dAy)) {
                assert (this.dJf.equals(bry2.dJf));
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLock: LockID=");
        stringBuilder.append(this.dAy);
        stringBuilder.append(" LockedObjectGUID=");
        stringBuilder.append(this.dJf);
        return stringBuilder.toString();
    }
}

