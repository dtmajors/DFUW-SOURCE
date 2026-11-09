/*
 * Decompiled with CFR.
 */
public class dvv
extends dvy
implements dwb {
    private a hhJ = null;
    private ldv hhK = null;
    private String hhL = null;
    private dvp[] hhM = null;

    public ldv bCl() {
        return this.hhK;
    }

    public String bCm() {
        return this.hhL;
    }

    public dvp[] bCk() {
        return this.hhM;
    }

    public dvv(a a2, ldv ldv2, String string) {
        this.hhJ = a2;
        this.hhK = ldv2;
        this.hhL = string;
    }

    @Override
    public boolean bCh() {
        if (this.hhJ == null || this.hhK == null || this.hhL == null || !this.Initialized) {
            return false;
        }
        String string = null;
        switch (this.hhJ) {
            case hhO: {
                string = dvl.ov(this.hhK);
                break;
            }
            case hhP: {
                string = dvl.ou(this.hhK);
                break;
            }
            default: {
                return false;
            }
        }
        this.d(new dvu(string));
        return this.bCw();
    }

    @Override
    public void c(dvy dvy2) {
        if (dvy2 == null || !(dvy2 instanceof dvu)) {
            this.bCv();
            return;
        }
        this.hhM = ((dvu)dvy2).bCk();
        this.bCu();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to retrieve the conquest history for the " + (Object)((Object)this.hhJ) + ", '" + this.hhL + "' " + this.hhK;
    }
}

