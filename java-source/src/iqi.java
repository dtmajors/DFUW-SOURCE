/*
 * Decompiled with CFR.
 */
public class iqi
extends ipx {
    private ipf mpa;
    private ipf mpb;

    public iqi(ipf ipf2, ipf ipf3) {
        this.a(irl.dnr());
        this.rG(false);
        this.u(ipf2);
        this.v(ipf3);
    }

    public ipf dit() {
        return this.mpa;
    }

    public void u(ipf ipf2) {
        if (ipf2 == this.mpa) {
            return;
        }
        if (this.mpa != null) {
            this.mpa.removeFromParent();
        }
        this.mpa = ipf2;
        if (this.mpa != null) {
            this.c(this.mpa, 0);
        }
        this.aTg();
    }

    public ipf diu() {
        return this.mpb;
    }

    public void v(ipf ipf2) {
        if (ipf2 == this.mpb) {
            return;
        }
        if (this.mpb != null) {
            this.mpb.removeFromParent();
        }
        this.mpb = ipf2;
        if (this.mpb != null) {
            this.c(this.mpb, 0);
        }
        this.aTg();
    }

    public void aTg() {
        if (this.dkb()) {
            if (this.mpa != null) {
                this.mpa.setVisible(false);
            }
            if (this.mpb != null) {
                this.mpb.setVisible(true);
            }
        } else {
            if (this.mpa != null) {
                this.mpa.setVisible(true);
            }
            if (this.mpb != null) {
                this.mpb.setVisible(false);
            }
        }
    }

    @Override
    public void cND() {
        this.aTg();
    }
}

