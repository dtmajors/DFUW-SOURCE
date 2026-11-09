/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class ima
extends ilq {
    private Map<ldv, ilx> miR = lcn.emw();
    private hxd miS;
    private hxe miT;

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.ddY();
    }

    @Override
    public boolean b(ilx ilx2) {
        return super.b(ilx2) && (ilx2 instanceof imc || ilx2 instanceof imb);
    }

    @Override
    public boolean c(ilx ilx2) {
        if (!this.b(ilx2)) {
            assert (false);
            return false;
        }
        return super.c(ilx2);
    }

    final void e(hxd hxd2) {
        if (this.miS != null) {
            this.ddY();
            this.miS = null;
        }
        if (hxd2 == null) {
            return;
        }
        this.miS = hxd2;
        this.miT = new hxe(this){
            final /* synthetic */ ima miU;
            {
                this.miU = ima2;
            }

            public void B(bsh bsh2) {
                ima.a(this.miU, ((bsl)bsh2).getGUID(), bsh2);
            }

            public void C(bsh bsh2) {
                ima.a(this.miU, ((bsl)bsh2).getGUID());
            }

            public void D(bsh bsh2) {
                ima.b(this.miU, ((bsl)bsh2).getGUID(), bsh2);
            }
        };
        hxd2.a(this.miT);
    }

    private void d(ldv ldv2, bsh bsh2) {
        ilx ilx2 = ilz.c(ldv2, bsh2);
        this.c(ilx2);
        this.miR.put(ldv2, ilx2);
    }

    private void rC(ldv ldv2) {
        ilx ilx2 = this.miR.get(ldv2);
        this.d(ilx2);
    }

    private void e(ldv ldv2, bsh bsh2) {
        ilx ilx2 = this.miR.get(ldv2);
        if (ilx2 != null) {
            ilx2.T(bsh2);
        }
    }

    private void ddY() {
        if (this.miS != null && this.miT != null) {
            this.miS.b(this.miT);
            this.miT = null;
        }
    }

    static /* synthetic */ void a(ima ima2, ldv ldv2, bsh bsh2) {
        ima2.d(ldv2, bsh2);
    }

    static /* synthetic */ void a(ima ima2, ldv ldv2) {
        ima2.rC(ldv2);
    }

    static /* synthetic */ void b(ima ima2, ldv ldv2, bsh bsh2) {
        ima2.e(ldv2, bsh2);
    }
}

