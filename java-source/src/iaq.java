/*
 * Decompiled with CFR.
 */
public class iaq
extends btk {
    public iaq() {
        hso.cxK().cxP().cyJ().cJp().euB.a((jlg<Integer, Boolean>)new jls<iaq, Integer, Boolean>(this, this){
            final /* synthetic */ iaq lBU;
            {
                this.lBU = iaq2;
                super(iaq3);
            }

            public void b(iaq iaq2, Integer n, Boolean bl) {
                iaq.a(iaq2, n, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((iaq)object, (Integer)object2, (Boolean)object3);
            }
        });
    }

    public void Pt(int n) {
        hso.cxK().cxP().cyJ().cJp().pK(n);
        hso.cxK().cxP().cyJ().cJm().Pu(n);
    }

    public void cKF() {
        cfk cfk2 = hso.cxK().cxP().cyJ().cJp();
        if (cfk2.aNs().size() > 0) {
            this.Pt(cfk2.aNs().get(cfk2.aNs().size() - 1));
        }
    }

    private void a(Integer n, Boolean bl) {
        if (bl.booleanValue() && hso.cxK().cxP().cyJ().cHH().dIh()) {
            this.Pt(n);
        }
    }

    static /* synthetic */ void a(iaq iaq2, Integer n, Boolean bl) {
        iaq2.a(n, bl);
    }
}

