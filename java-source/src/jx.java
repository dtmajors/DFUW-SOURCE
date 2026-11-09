/*
 * Decompiled with CFR.
 */
public class jx
extends jk {
    @Override
    public void nU() {
        for (a a2 : a.values()) {
            this.a(a2.getCommand(), a2.om(), a2.hf(), a2.ok(), a2.ol());
        }
    }

    @Override
    public void a(jj jj2) {
        a a2 = a.findCommand(jj2.akV);
        if (a2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unrecognised Command Encountered!!!... CommandText = " + jj2.akV);
            assert (false);
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case ams: {
                this.w(jj2);
                break;
            }
            case amt: {
                this.x(jj2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unhandled Command Encountered!!!... CommandText = " + jj2.akV);
                assert (false);
                jj2.b(lqd.rXd.bD(jj2.akV), true);
                return;
            }
        }
    }

    private void w(jj jj2) {
        int n = -1;
        if (jj2.getArgCount() > 0) {
            n = ((mho)jj2.cA((int)0)).PC;
        }
        if (n < 0 || xc.dN(n) == null) {
            jj2.b(lqh.scJ.bD(n), true);
            return;
        }
        xe.baL.ef(n);
        jj2.b(lqh.scK.bD(n), false);
    }

    private void x(jj jj2) {
        int n = -1;
        if (jj2.getArgCount() > 0) {
            n = ((mho)jj2.cA((int)0)).PC;
        }
        if (n < 0 || xc.dN(n) == null) {
            jj2.b(lqh.scJ.bD(n), true);
            return;
        }
        xe.baL.eg(n);
        jj2.b(lqh.scL.bD(n), false);
    }
}

