/*
 * Decompiled with CFR.
 */
public class dtt
extends dtu {
    protected ldv hdp = null;
    protected ldv hdq = null;

    public ldv bAB() {
        return this.hdp;
    }

    public void oo(ldv ldv2) {
        this.hdp = ldv2;
    }

    public ldv bAC() {
        return this.hdq;
    }

    public void op(ldv ldv2) {
        this.hdq = ldv2;
    }

    @Override
    public int compareTo(Object object) {
        if (object instanceof dtu) {
            dtt dtt2 = (dtt)object;
            if (this.hdr < dtt2.getLevel()) {
                return -1;
            }
            if (this.hdr == dtt2.getLevel()) {
                return 0;
            }
            return 1;
        }
        assert (false) : "Object is not a SFMessagePermission! It's a " + object.getClass().getName();
        return -1;
    }
}

