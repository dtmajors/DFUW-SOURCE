/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  cxg
 *  lcr
 */
public class czg
extends czf {
    private static final double fZY = 0.1;
    private float fZZ = 0.0f;
    private ljq aZH = null;

    public float bhI() {
        return this.fZZ;
    }

    public void fV(float f2) {
        this.fZZ = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 18: {
                return this.fZZ;
            }
        }
        return super.xo(n2);
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
        ddc2.aZH = this.emI.bgQ().aAG() != null ? this.emI.bgQ().aAG().av() : ddc2.aZD;
        ddc2.aYF = this.emI.bgQ().getGUID();
        ddc2.gdZ = this.emI.bgQ().getObjectType();
        ddc2.aYC = this.SkillType;
        ddc2.Magnitude = cxg.d((cxc)((Object)this), (int)this.bhT());
        ddc2.doT = 0.0f;
        ddc2.duq = this.bhS();
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czg czg2 = (czg)((Object)cxc2);
        czg2.fV(this.fZZ);
    }

    @Override
    protected void bhJ() {
        boolean bl;
        if (aqN.isDescendant(this.SkillType, cxd.fIe) && (bl = this.jk().c(this))) {
            return;
        }
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
        if (this.MessageDelegator.arc().rgz < this.fZz + 0.1) {
            this.zk(this.aYH);
            return;
        }
        boolean bl = this.emI.bgQ() instanceof cev;
        if (bl) {
            lgl2 = lgl.b(lgl2, lgl.eqL(), ((cev)this.emI.bgQ()).eq(this.fGl));
        }
        ddp ddp2 = (ddp)this.gad;
        if (this.bhQ() == null) {
            lfn.b(5, "SFContainerMissileSkill", "createMissileObject() Missileinfo is null.");
            int n2 = this.bhR();
            if (n2 > 0) {
                lfn.b(5, "SFContainerMissileSkill", "createMissileObject() There is no mapping with Skill : " + cxd.xu((int)this.SkillType) + " and resource : " + cug.uV((int)n2));
            }
            this.zk(this.aYH);
            return;
        }
        bwo bwo2 = this.bhQ().aCr();
        if (bwo2 == null) {
            lfn.b(5, "SFContainerMissileSkill", "createMissileObject() Missileinfo is null.");
            this.zk(this.aYH);
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
            bws2.ad(12.0f + 6.0f * (float)Math.random());
        }
        this.MessageDelegator.a(bws2);
        byv byv2 = this.aJz().bgQ().aJD().aEP();
        if (byv2.aEE() && lea.enZ().isDescendant(this.zg(), cxd.fIe) && lea.enW().isDescendant(bwo2.az(), cug.fjy)) {
            bws2.ab(50.0f);
            bwo2.setMaxVelocity(100.0f);
            bwo2.ac(50.0f);
        }
    }

    private void a(frf frf2) {
        if (frf2.aYH <= 0) {
            lfn.b(5, "SFContainerMissileSkill", "handleMissileNotificationMessage() SessionID is invalid.");
            return;
        }
        switch (frf2.ipI) {
            case 1: {
                this.zk(frf2.aYH);
                break;
            }
            case 2: {
                if (frf2.biq <= 0) {
                    lfn.b(5, "SFContainerMissileSkill", "handleMissileNotificationMessage() MissileInfoType is invalid.");
                    return;
                }
                if (frf2.biu < 0.0f) {
                    lfn.b(5, "SFContainerMissileSkill", "handleMissileNotificationMessage() Power is invalid.");
                    return;
                }
                if (frf2.duq < 0.0f) {
                    lfn.b(5, "SFContainerMissileSkill", "handleMissileNotificationMessage() CriticalChance is invalid.");
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
                this.a(new ddu[]{ddu2});
                break;
            }
            case 3: {
                this.zk(frf2.aYH);
                break;
            }
            default: {
                lfn.b(5, "SFContainerMissileSkill", "handleMissileNotificationMessage() Invalid NotificationType provided: " + frf2.ipI);
                return;
            }
        }
    }
}

