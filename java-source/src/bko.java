/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.Map;

public class bko
extends bke
implements bkm,
bto {
    private bkk dsG = null;
    private boolean dsH = false;
    private fcq dsA = null;
    private double dth = 0.0;
    private Map<ldv, bkn> dsI = lcn.emw();

    public bko() {
        this.dsy = bkd.a.drt;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFAreaTimedEffectFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9224) {
            lfn.b(5, "SFAreaTimedEffectFO", "doFunction() FunctionMessage is not a SFFunctionAreaEffectMessage.");
            lfn.b(5, "SFAreaTimedEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dsA = (fcq)fdo2;
        this.dsG = new bkk(this);
        this.dsG.setGUID(this.MessageDelegator.bzv());
        this.dsG.setRadius(this.dsA.Radius);
        this.dsG.aR(this.dsA.Position);
        this.dsG.hK(this.dsA.dsZ);
        this.dsG.r(this.dsA.dta);
        this.dsG.ds(this.dsA.dtb);
        this.MessageDelegator.a(this.dsG);
        this.dsH = true;
        this.dth = this.MessageDelegator.arc().rgz + this.dsA.eKm;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz >= this.dth) {
            this.dsG.arj();
            this.dsG = null;
            this.dsH = false;
            if (this.dsA.bOs()) {
                this.a(this.dsA, true);
            }
            this.Vc();
            return;
        }
        if (!this.dsH) {
            return;
        }
        if (this.dsI.isEmpty()) {
            return;
        }
        for (bkn bkn2 : this.dsI.values()) {
            if (bkn2.dsE > ldz2.rgz) continue;
            this.a(bkn2);
        }
    }

    private void a(bkn bkn2) {
        assert (bkn2 != null);
        cxd.f f2 = this.dsA.aCD();
        if (aqN.isDescendant(this.dsA.aYC, cxd.fJq)) {
            f2 = cxd.f.fQW;
        }
        float f3 = ljq.s(this.dsA.Position, bkn2.Position);
        bkn2.dsE = this.MessageDelegator.arc().rgz + this.dsA.gpI;
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = this.dsA.gbe;
        fcw2.aZG = this.dsA.aZG;
        fcw2.akX = bkn2.Ui;
        fcw2.aYF = this.dsA.aYF;
        fcw2.bsG = this.dsA.bsG;
        fcw2.aYC = this.dsA.aYC;
        fcw2.Magnitude = this.dsA.Magnitude;
        fcw2.cRI = this.dsA.cRI;
        fcw2.eKm = this.dsA.eKm;
        fcw2.aSp = this.dsA.aSp;
        fcw2.aYH = this.dsA.aYH;
        fcw2.aYG = this.dsA.aYG;
        fcw2.bsE = this.dsA.bsE;
        fcw2.bRD = this.dsA.bRD;
        fcw2.gpI = this.dsA.gpI;
        fcw2.dup = this.dsA.dup;
        fcw2.aZH = null;
        fcw2.duq = this.dsA.duq;
        fcw2.duq = this.dsA.iJy;
        fcw2.iJA = this.dsA.iJA;
        fcw2.iJB = this.dsA.iJB;
        fcw2.a(f2);
        this.MessageDelegator.F(fcw2);
    }

    @Override
    public void c(bkn bkn2) {
        bkn bkn3 = this.dsI.get(bkn2.Ui);
        if (bkn3 != null) {
            lfn.b(5, "SFAreaTimedEffectFO", "notifyObjectEnteredArea() Object already exists. Existing: " + bkn3);
            lfn.b(5, "SFAreaTimedEffectFO", "notifyObjectEnteredArea() New: " + bkn2);
            assert (false);
            return;
        }
        this.dsI.put(bkn2.Ui, bkn2);
        this.a(bkn2);
    }

    @Override
    public void hJ(ldv ldv2) {
        bkn bkn2 = this.dsI.remove(ldv2);
        if (bkn2 == null) {
            return;
        }
    }

    @Override
    public void arh() {
        if (this.dsA.bOs()) {
            this.a(this.dsA, false);
        }
        this.dsG = null;
        this.dsH = false;
        this.Vc();
    }
}

