/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public class bml
extends bke {
    private fdj duY = null;
    private cbx dvu = null;
    private static final float dvv = 2.0f;
    private static final float dvw = 4.0f;

    public bml() {
        this.dsy = bkd.a.dse;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9234) {
            this.Vc();
            return;
        }
        this.duY = (fdj)fdo2;
        if (this.duY.ResourceType <= 0) {
            this.Vc();
            return;
        }
        if (this.duY.aZG == null) {
            this.Vc();
            return;
        }
        this.a(-1, this.duY.ResourceType, lcr.qzY, 1);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                gfn gfn2 = (gfn)dxq2;
                cbx cbx2 = gfn2.dtF;
                if (cbx2 == null) {
                    this.Vc();
                    return;
                }
                this.dvu = cbx2;
                this.arK();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void arK() {
        assert (this.dvu.aIh() != null);
        assert (this.dvu.aAG() != null);
        ljq ljq2 = this.duY.Rotation.eqT();
        ljq2.x = 0.0f;
        ljq2.rlV = 0.0f;
        this.dvu.aAG().c(this.duY.Position);
        this.dvu.aAG().a(new lgl(ljq2));
        bwh bwh2 = ((bvu)this.dvu.aAG()).aAl();
        bwh2.n(this.duY.Rotation);
        bwh2.eV(true);
        this.MessageDelegator.a((amf)this.dvu);
        this.Vc();
    }
}

