/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cex
 *  mcs
 */
public class dab
extends czc {
    private bqs gaU = null;
    private lef dIW = null;
    private int gaT = 0;

    @Override
    protected void a(czc.a a2) {
        if (a2 == czc.a.fZG) {
            assert (!this.fGZ);
            assert (this.fGh.akX != null);
            assert (this.fGi == null);
            if (this.emI.bgQ() instanceof cex && ((cex)this.emI.bgQ()).aMz().bdh()) {
                this.bhw();
                return;
            }
            ldv ldv2 = this.fGh.akX;
            brg brg2 = (brg)this.emI.bgQ().aJC().asf();
            this.gaU = brg2.iK(ldv2);
            if (this.gaU == null) {
                lfn.b(5, "SFTelescopeSkill", "doPerform() Could not find item " + ldv2);
                this.bhw();
                return;
            }
            this.dIW = brg2.auo().iX(ldv2);
            if (this.dIW == null) {
                lfn.b(5, "SFTelescopeSkill", "doPerform() Could not lock item " + ldv2);
                this.bhw();
                return;
            }
            ew ew2 = this.gaU.ao(1248);
            if (ew2 == null) {
                lfn.b(5, "SFTelescopeSkill", "doPerform() Usage Count attribute was not found.");
                this.bhw();
                return;
            }
            this.gaT = ew2.fQ() - 1;
        } else if (a2 != czc.a.fZH && a2 == czc.a.fZI) {
            ew ew3;
            assert (this.gaU != null);
            assert (this.dIW != null);
            if (!this.bfg()) {
                brg brg3 = (brg)this.emI.bgQ().aJC().asf();
                brg3.auo().a(this.gaU.getGUID(), this.dIW);
                this.a(mcs.uyt.bD(this.Bu()));
                this.bhw();
                return;
            }
            brg brg4 = (brg)this.emI.bgQ().aJC().asf();
            if (this.gaT == 0) {
                brg4.b(this.gaU, bqy.dHw);
            } else {
                ew3 = new ew();
                ew3.setType(1248);
                ew3.bi(this.gaT);
                eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, this.gaU.getGUID());
                eap2.bhp = ew3;
                this.MessageDelegator.F(eap2);
            }
            ew3 = (cex)this.emI.bgQ();
            if (ew3.aMQ() != null) {
                ew3.aMQ().aPO();
            }
            this.bhq();
            this.bhr();
        }
    }

    @Override
    protected void bex() {
        super.bex();
        if (this.gaU != null) {
            assert (this.dIW != null);
            this.emI.bgQ().aJC().asf().auo().a(this.gaU.getGUID(), this.dIW);
        }
        this.gaU = null;
        this.dIW = null;
    }
}

