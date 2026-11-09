/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cex
 *  lcr
 *  mcs
 */
public class daa
extends czc {
    private bqs gaS = null;
    private lef dIW = null;
    private ljq Position = null;
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
            this.gaS = brg2.iK(ldv2);
            if (this.gaS == null) {
                lfn.b(5, "SFTeleportSkill", "doPerform() Could not find item " + ldv2);
                this.bhw();
                return;
            }
            this.dIW = brg2.auo().iX(ldv2);
            if (this.dIW == null) {
                lfn.b(5, "SFTeleportSkill", "doPerform() Could not lock item " + ldv2);
                this.bhw();
                return;
            }
            ew ew2 = this.gaS.ao(1248);
            if (ew2 == null) {
                lfn.b(5, "SFTeleportSkill", "doPerform() Usage Count attribute was not found.");
                this.bhw();
                return;
            }
            this.gaT = ew2.fQ() - 1;
            fh fh2 = (fh)this.gaS.ae(9648);
            if (fh2 == null) {
                lfn.b(5, "SFTeleportSkill", "doPerform() Could not find attribute 'Teleport Rune Position'");
                this.bhw();
                return;
            }
            this.Position = fh2.gy();
        } else if (a2 != czc.a.fZH && a2 == czc.a.fZI) {
            Cloneable cloneable;
            Object object;
            assert (this.gaS != null);
            assert (this.dIW != null);
            if (!this.bfg()) {
                brg brg3 = (brg)this.emI.bgQ().aJC().asf();
                brg3.auo().a(this.gaS.getGUID(), this.dIW);
                this.a(mcs.uyt.bD(this.Bu()));
                this.bhw();
                return;
            }
            brg brg4 = (brg)this.emI.bgQ().aJC().asf();
            if (this.Position.equals(ljq.roQ)) {
                lfn.b(5, "SFTeleportSkill", "doPerform() Position is [0,0,0]");
                brg4.b(this.gaS, bqy.dHw);
                this.bhw();
                return;
            }
            if (this.gaT == 0) {
                brg4.b(this.gaS, bqy.dHw);
            } else {
                object = new ew();
                ((ej)object).setType(1248);
                ((ew)object).bi(this.gaT);
                cloneable = (eap)this.MessageDelegator.h(10757, this.GUID, this.gaS.getGUID());
                cloneable.bhp = object;
                this.MessageDelegator.F((dxq)cloneable);
            }
            object = this.emI.bgQ().aJP().getGUID();
            this.mq((ldv)object);
            this.bhq();
            this.bhr();
            cloneable = this.emI.bgQ().aAG().getGUID();
            ljq ljq2 = this.emI.bgQ().aAG().av();
            this.b((ldv)cloneable, ljq2);
        }
    }

    @Override
    protected void bex() {
        super.bex();
        if (this.gaS != null) {
            assert (this.dIW != null);
            this.emI.bgQ().aJC().asf().auo().a(this.gaS.getGUID(), this.dIW);
        }
        this.gaS = null;
        this.dIW = null;
        this.Position = null;
    }

    private void b(ldv ldv2, ljq ljq2) {
        assert (ldv2 != null);
        assert (ljq2 != null);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        glh2.SpecialEffectType = del.giD;
        glh2.akX = ldv2;
        glh2.aZD = ljq2;
        this.MessageDelegator.F(glh2);
    }

    private void mq(ldv ldv2) {
        assert (ldv2 != null);
        assert (this.Position != null);
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.GUID, ldv2);
        gqt2.a(hx.a.aeK);
        gqt2.Position = this.Position;
        gqt2.jpN = true;
        this.MessageDelegator.F(gqt2);
    }
}

