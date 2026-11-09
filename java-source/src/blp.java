/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cwx
 *  cxd
 */
import java.util.ArrayList;

public class blp
extends bke {
    private final int[] duz = new int[]{416, 448, 464};
    private fdo duA = null;
    private ArrayList<ldv> duB = lcn.abH(4);

    public blp() {
        this.dsy = bkd.a.drP;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        assert (fdo2.bOr());
        this.duA = fdo2;
        cdb cdb2 = (cdb)this.d(fdo2.akX);
        if (cdb2 == null) {
            lfn.b(5, "SFPerformRestingEffectFO", "doFunction() TargetObject " + fdo2.akX + " was not found.");
            this.Vc();
            return;
        }
        cwx cwx2 = cdb2.aJz().yG(cxd.fHy);
        int n2 = cwx2.Ec();
        float f2 = cwx2.bfw();
        for (int n3 : this.duz) {
            float f3 = 1.0f + f2 / 100.0f;
            this.a((cbx)cdb2, n3, n2, f3, 4, false);
        }
        float f4 = -0.5f;
        this.a((cbx)cdb2, 12112, n2, -0.5f, 3, true);
        if (fdo2.bOs()) {
            this.a(fdo2, true, cdb2.getGUID());
        }
    }

    @Override
    protected void a(fdp fdp2) {
        assert (this.duB != null);
        this.hU(this.duA.akX);
        this.Vc();
    }

    private void a(cbx cbx2, int n, int n2, float f2, int n3, boolean bl2) {
        assert (cbx2 != null);
        assert (n >= 0);
        assert (n2 > 0);
        et et2 = cbx2.fi().ah(n);
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(-2.0);
        als2.ga(n3);
        als2.gb(0);
        als2.fC(et2.getType());
        als2.gc(0);
        als2.ar(0.0f);
        als2.aq(f2);
        als2.as(f2);
        als2.cP(this.duA.aYF);
        als2.gd(this.duA.bsG);
        als2.ge(this.duA.aYC);
        als2.fJ(bl2 ? bfk.dgL : bfk.dgK);
        als2.gf(n2);
        als2.aX(this.GUID);
        this.duB.add(als2.getGUID());
        cbx2.a(als2, cbx2.aAG().av(), null, null);
    }

    private void hU(ldv ldv2) {
        assert (ldv2 != null);
        assert (this.duB != null);
        assert (this.duB.size() > 0);
        frk frk2 = (frk)this.MessageDelegator.h(5379, this.GUID, ldv2);
        frk2.hsP = false;
        frk2.iUQ = true;
        frk2.dtB = this.duB.toArray(new ldv[this.duB.size()]);
        this.MessageDelegator.F(frk2);
    }
}

