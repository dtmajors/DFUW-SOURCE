/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class czh
extends czk {
    private int biq = 0;
    private ljq aZH = null;

    public int aCv() {
        return this.biq;
    }

    public void ff(int n2) {
        this.biq = n2;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 14081: {
                this.a((frf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void c(ddc ddc2) {
        assert (this.aZH != null);
        super.c(ddc2);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czh czh2 = (czh)((Object)cxc2);
        czh2.ff(this.biq);
    }

    @Override
    protected void bhJ() {
        if (this.fGh.gcx) {
            assert (this.fGh.dph != null);
            assert (this.fGh.dpi != null);
            this.r(this.fGh.dph, this.fGh.dpi);
        } else {
            this.r(this.emI.yS(this.SkillType), this.emI.bgQ().aAG().aw());
        }
    }

    @Override
    protected void bex() {
        super.bex();
        this.aZH = null;
    }

    private void r(ljq ljq2, lgl lgl2) {
        assert (this.gad != null);
        assert (this.gad instanceof ddp);
        boolean bl = this.emI.bgQ() instanceof cev;
        if (bl) {
            lgl2 = lgl.b(lgl2, lgl.eqL(), ((cev)this.emI.bgQ()).eq(this.fGl));
        }
        ddp ddp2 = (ddp)this.gad;
        if (ctg.ffj) {
            ljq ljq3 = this.emI.bgQ().aAG().av();
            frf frf2 = (frf)this.MessageDelegator.h(14081, this.GUID, this.GUID);
            frf2.ipI = 2;
            frf2.biq = this.aCv();
            frf2.aZH = ljq3;
            frf2.dtj = this.emI.bgQ().getGUID();
            frf2.Ui = this.emI.bgQ().aAG().getGUID();
            frf2.ResourceType = this.emI.bgQ().az();
            frf2.aZD = ljq3;
            frf2.aYH = this.aYH;
            frf2.biu = this.getPower();
            frf2.duq = this.bhS();
            frf2.a(cxd.f.fQW);
            this.MessageDelegator.E(frf2);
            return;
        }
        bws bws2 = new bws();
        bws2.setGUID(this.MessageDelegator.lL(lcr.qAe));
        bws2.kb(this.GUID);
        bws2.fe(this.Be());
        bws2.gf(this.aYH);
        bws2.ff(this.aCv());
        bws2.c(ljq2);
        bws2.a(lgl2);
        bws2.v(this.MessageDelegator.arc().rgz);
        bws2.setStartDirection(ddp2.bis);
        if (lgp.erA().cS(this.bhS())) {
            bws2.setPower(cxi.fk(this.getPower()));
            bws2.dE(1.0f);
        } else {
            bws2.setPower(this.getPower());
            bws2.dE(0.0f);
        }
        bws2.c(this.aCx());
        if (bl && this.fGh.dOf) {
            bws2.ad(10.0f + 5.0f * (float)Math.random());
        }
        this.MessageDelegator.a(bws2);
    }

    private void a(frf frf2) {
        if (frf2.aYH <= 0) {
            lfn.b(5, "SFContainerMissileSpell", "handleMissileNotificationMessage() SessionID is invalid.");
            return;
        }
        switch (frf2.ipI) {
            case 1: {
                this.zk(frf2.aYH);
                break;
            }
            case 2: {
                if (frf2.biq <= 0) {
                    lfn.b(5, "SFContainerMissileSpell", "handleMissileNotificationMessage() MissileInfoType is invalid.");
                    return;
                }
                if (frf2.biu < 0.0f) {
                    lfn.b(5, "SFContainerMissileSpell", "handleMissileNotificationMessage() SkillLevel is invalid.");
                    return;
                }
                if (frf2.duq < 0.0f) {
                    lfn.b(5, "SFContainerMissileSpell", "handleMissileNotificationMessage() CriticalChance is invalid.");
                    return;
                }
                this.aZH = frf2.aZH;
                ddu ddu2 = new ddu();
                ddu2.dtj = frf2.dtj;
                ddu2.Ui = frf2.Ui;
                ddu2.ResourceType = frf2.ResourceType;
                ddu2.dph = frf2.aZD;
                ddu2.dur = frf2.aCD();
                ddu2.dus = frf2.bOo();
                ddu2.aYH = frf2.aYH;
                ddu2.biq = frf2.biq;
                ddu2.biu = frf2.biu;
                ddu2.duq = frf2.duq;
                ddu2.geu = frf2.geu;
                this.a(new ddu[]{ddu2});
                break;
            }
            case 3: {
                this.zk(frf2.aYH);
                break;
            }
            default: {
                lfn.b(5, "SFContainerMissileSpell", "handleMissileNotificationMessage() Invalid NotificationType provided: " + frf2.ipI);
                return;
            }
        }
    }
}

