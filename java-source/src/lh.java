/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class lh
extends btk {
    private final ha hF;
    private double asU = 0.0;
    private static final double asV = 0.5;

    public lh(ha ha2) {
        this.hF = ha2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26121: {
                this.a((gkp)dxq2);
                break;
            }
            case 26117: {
                this.a((gkf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gkp gkp2) {
        assert (gkp2.jjS != null);
        assert (gkp2.ResourceType > 0);
        if (this.asU + 0.5 > this.MessageDelegator.arc().rgz) {
            return;
        }
        this.asU = this.MessageDelegator.arc().rgz;
        gke gke2 = (gke)this.MessageDelegator.h(26116, this.getGUID(), gkp2.jjS);
        gke2.diQ = this.hF.getGUID();
        this.MessageDelegator.F(gke2);
    }

    private void a(gkf gkf2) {
        switch (gkf2.ew) {
            case 3: {
                this.hF.c(mct.uhE.bD(gkf2.jjL, gkf2.brS));
                return;
            }
            case 2: {
                this.hF.c(mct.uCi.bD(new Object[0]));
                return;
            }
            case 0: {
                assert (false) : "NO RESULT";
                return;
            }
            case 1: {
                break;
            }
            default: {
                assert (false) : "Unknown result : " + gkf2.ew;
                return;
            }
        }
        if (gkf2.jjN > 0) {
            assert (gkf2.jjO > 0);
            fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), this.hF.getGUID());
            fmz2.iIY = new int[]{gkf2.jjN};
            fmz2.bqd = new int[]{gkf2.jjO};
            fmz2.hsP = true;
            fmz2.b(bqy.dGN);
            this.hF.receiveMessage((dxq)fmz2);
            if (gkf2.jjM) {
                this.hF.c(mct.uCj.bD(gkf2.jjN, gkf2.jjO));
                this.hF.f(mct.uCk.bD(gkf2.jjN, gkf2.jjO));
            } else {
                this.hF.c(mct.uCl.bD(gkf2.jjN, gkf2.jjO));
            }
        }
    }
}

