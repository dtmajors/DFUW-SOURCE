/*
 * Decompiled with CFR.
 */
public class iqk
extends ipx {
    private ipf moZ;
    private ipf mpa;
    private ipf mtJ;

    public iqk() {
        this.a(irl.dnr());
    }

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

    public void aTg() {
        ipf ipf2;
        ipf ipf3 = ipf2 = this.djR() && this.djZ() ? this.mpa : this.moZ;
        if (this.mtJ != null) {
            this.mtJ.setVisible(false);
        }
        this.mtJ = ipf2;
        if (this.mtJ != null) {
            this.mtJ.setVisible(true);
        }
    }

    @Override
    public void cPv() {
        this.aTg();
    }

    @Override
    public void cPw() {
        this.aTg();
    }
}

