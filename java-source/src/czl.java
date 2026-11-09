/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxg
 *  lcr
 */
public class czl
extends czj {
    private ljq aZH = null;
    private ddv gan = null;

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
        assert (this.gan != null);
        ddc2.aZH = this.aZH;
        ddc2.aYF = this.emI.bgQ().getGUID();
        ddc2.gdZ = this.emI.bgQ().getObjectType();
        ddc2.aYC = this.SkillType;
        ddc2.Magnitude = cxg.d((cxc)((Object)this), (int)this.bhT());
        ddc2.doT = this.gan.gew;
    }

    @Override
    protected void bhJ() {
        if (this.fGh.gcx) {
            assert (this.fGh.dph != null);
            assert (this.fGh.dpi != null);
            lgl lgl2 = this.y(this.fGh.dpi);
            this.r(this.fGh.dph, lgl2);
        } else {
            lgl lgl3 = this.y(this.emI.bgQ().aAG().aw());
            this.r(this.emI.yS(this.SkillType), lgl3);
        }
    }

    @Override
    protected boolean e(czb czb2) {
        if (this.gan == null) {
            lfn.b(5, "SFContainerThrowingSkill", "isStartSubSkill() ThrowableWeaponInfo is null.");
            return false;
        }
        return this.gan.zK(czb2.zg());
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
        bwo bwo2 = this.bhQ();
        if (bwo2 == null) {
            lfn.b(5, "SFContainerThrowingSkill", "createMissileObject() Missileinfo is null.");
            return;
        }
        if (ctg.ffj) {
            ljq ljq3 = this.emI.bgQ().aAG().av();
            frf frf2 = (frf)this.MessageDelegator.h(14081, this.GUID, this.GUID);
            frf2.ipI = 2;
            frf2.biq = bwo2.getType();
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
        bws2.ff(bwo2.getType());
        bws2.c(ljq2);
        bws2.a(lgl2);
        bws2.setPower(this.getPower());
        bws2.dE(this.bhS());
        bws2.v(this.MessageDelegator.arc().rgz);
        bws2.setStartDirection(ddp2.bis);
        bws2.c(this.aCx());
        if (bl && this.fGh.dOf) {
            bws2.ad(2.0f + 1.0f * (float)Math.random());
        }
        this.MessageDelegator.a(bws2);
    }

    private lgl y(lgl lgl2) {
        ljq ljq2 = this.fGh.dpi.eqT();
        ljq2.x -= 0.09817477f;
        double d2 = 0.01f;
        double d3 = 1.5707963267948966;
        if ((double)ljq2.x > 1.560796327018414) {
            ljq2.x = 1.5607964f;
        }
        if ((double)ljq2.x < -1.560796327018414) {
            ljq2.x = -1.5607964f;
        }
        return new lgl(ljq2);
    }

    private void a(frf frf2) {
        if (frf2.aYH <= 0) {
            lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() SessionID is invalid.");
            return;
        }
        switch (frf2.ipI) {
            case 1: {
                this.zk(frf2.aYH);
                break;
            }
            case 2: {
                if (frf2.biq <= 0) {
                    lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() MissileInfoType is invalid.");
                    return;
                }
                if (frf2.biu < 0.0f) {
                    lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() SkillLevel is invalid.");
                    return;
                }
                if (frf2.duq < 0.0f) {
                    lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() CriticalChance is invalid.");
                    return;
                }
                bwo bwo2 = (bwo)lea.eoj().get(frf2.biq);
                if (bwo2 == null) {
                    lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() No missileinfo found for missileinfotype " + frf2.biq);
                    return;
                }
                this.aZH = frf2.aZH;
                int n2 = bwo2.az();
                if (!ResourceTree.isDescendant(n2, cug.fiK)) {
                    lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() Resource '" + bwo2.pa() + "' is not a throwable weapon.");
                    return;
                }
                this.gan = cug.ve((int)bwo2.az());
                if (this.gan == null) {
                    lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() No throwableweaponinfo found for resource '" + bwo2.pa() + "'");
                    return;
                }
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
                this.a(new ddu[]{ddu2});
                this.gan = null;
                break;
            }
            case 3: {
                this.zk(frf2.aYH);
                break;
            }
            default: {
                lfn.b(5, "SFContainerThrowingSkill", "handleMissileNotificationMessage() Invalid NotificationType provided: " + frf2.ipI);
                return;
            }
        }
    }
}

