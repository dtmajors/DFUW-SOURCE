/*
 * Decompiled with CFR.
 */
public class ios
extends ioo {
    private ipf moZ;
    private ipf mpa;
    private ipf mpb;
    private ipf mpc;

    public ipf dis() {
        return this.moZ;
    }

    public void t(ipf ipf2) {
        if (ipf2 == this.moZ) {
            return;
        }
        if (this.moZ != null) {
            this.X(this.moZ);
        }
        this.moZ = ipf2;
        if (this.moZ != null) {
            this.moZ.setVisible(false);
            this.W(this.moZ);
        }
        this.aTg();
    }

    public ipf dit() {
        return this.mpa;
    }

    public void u(ipf ipf2) {
        if (ipf2 == this.mpa) {
            return;
        }
        if (this.mpa != null) {
            this.X(this.mpa);
        }
        this.mpa = ipf2;
        if (this.mpa != null) {
            this.mpa.setVisible(false);
            this.W(this.mpa);
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
            this.X(this.mpb);
        }
        this.mpb = ipf2;
        if (this.mpb != null) {
            this.mpb.setVisible(false);
            this.W(this.mpb);
        }
        this.aTg();
    }

    public ipf div() {
        return this.mpc;
    }

    public void w(ipf ipf2) {
        if (ipf2 == this.mpc) {
            return;
        }
        if (this.mpc != null) {
            this.X(this.mpc);
        }
        this.mpc = ipf2;
        if (this.mpc != null) {
            this.mpc.setVisible(false);
            this.W(this.mpc);
        }
        this.aTg();
    }

    @Override
    public void aTg() {
        ipf ipf2 = null;
        ipf2 = !this.djR() ? this.moZ : (this.dil() ? this.mpc : (this.dkb() ? this.mpb : (!this.djZ() ? this.moZ : this.mpa)));
        this.r(ipf2);
    }
}

