/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcw
 */
public class bqp
extends bqn {
    public bqp(bqv bqv2) {
        super(bqv2);
    }

    @Override
    protected void auJ() {
        if (this.dFb != null && this.a(this.dFb)) {
            cex cex2;
            bqx bqx2;
            bqs bqs2;
            if (this.dEY instanceof bqx && (bqs2 = (bqx2 = (bqx)this.dEY).iK(this.dFb.iPE)) != null && bqx2.auk() instanceof cex && (cex2 = (cex)bqx2.auk()).aKu() instanceof cat) {
                boolean bl2;
                boolean bl3 = lcw.aQH() ? bqx2.ja(bqs2.getGUID()) == null : (bl2 = bqx2.jb(bqs2.getGUID()) == null);
                if (bl2) {
                    ((bqx)this.dEY).atU().a(this.dFb.aO(), this.dFb);
                    super.auJ();
                    return;
                }
                fma fma2 = (fma)this.MessageDelegator.h(7961, this.dEY.getGUID(), this.dFb.aO());
                fma2.iPn = false;
                fma2.gLy = this.dFb.gLy;
                fma2.iPE = this.dFb.iPE;
                fma2.gLz = this.dFb.gLz;
                fma2.aqs = this.dFb.aqs;
                fma2.s(mce.usK.bD(new Object[0]));
                this.MessageDelegator.F(fma2);
                super.auJ();
                return;
            }
            ((bqx)this.dEY).atU().a(this.dFb.aO(), this.dFb);
        }
        super.auJ();
    }

    @Override
    protected void auL() {
        if (this.dFc != null && this.a(this.dFc)) {
            ((bqx)this.dEY).atU().a(this.dFc.aO(), this.dFc);
        }
        super.auL();
    }

    @Override
    protected void auI() {
    }

    @Override
    protected void auK() {
    }

    @Override
    protected void auM() {
        super.auM();
    }

    private boolean a(flz flz2) {
        return this.dEY.asf().iE(flz2.iPE);
    }
}

