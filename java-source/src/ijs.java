/*
 * Decompiled with CFR.
 */
class ijs
extends iqp {
    ipf meD;
    ipf meE;
    ipf meF;
    ipf meG;
    double meH = 0.0;

    public void a(ipf ipf2, double d2) {
        this.meG = ipf2;
        this.meH = d2;
    }

    ijs(ipf ipf2, ipf ipf3, ipf ipf4) {
        this.meD = ipf2;
        this.meE = ipf3;
        this.meF = ipf4;
    }

    @Override
    public void i(ipf ipf2) {
        super.i(ipf2);
        if (this.meD == null) {
            return;
        }
        if (this.meE != null) {
            this.meE.RH(this.meD.getX() + this.meD.getWidth() + 4);
        }
        if (this.meF != null) {
            this.meF.RH(this.meD.getX() - this.meF.getWidth() / 2 + 16);
        }
        if (this.meG != null) {
            this.meG.RH(this.meD.getX() + (int)((double)this.meD.getWidth() * this.meH) - 1);
            this.meG.RI(this.meD.getY() + 3);
        }
    }
}

