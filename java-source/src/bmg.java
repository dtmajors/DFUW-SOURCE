/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  lcr
 *  mcs
 */
public class bmg
extends bke {
    private static final float dvl = 5.0f;
    private static final float dvm = 40.0f;
    private static final boolean dvn = true;
    private fdi dvo = null;
    private cex abN = null;

    public bmg() {
        this.dsy = bkd.a.dsc;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFReadManualFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9246) {
            lfn.b(5, "SFReadManualFO", "doFunction() Invalid message received: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dvo = (fdi)fdo2;
        if (this.dvo.iJV == null) {
            lfn.b(5, "SFReadManualFO", "doFunction() ManualGUID is null.");
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        if (this.dvo.iJW <= 0) {
            lfn.b(5, "SFReadManualFO", "doFunction() ManualSkillType is invalid.");
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        this.abN = (cex)this.MessageDelegator.d(this.dvo.akX);
        if (this.abN == null) {
            lfn.b(5, "SFReadManualFO", "doFunction() TargetObject " + this.dvo.akX + " was not found.");
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        cxc cxc2 = this.abN.aJz().ht(this.dvo.iJW);
        if (cxc2 == null) {
            String string = lea.enZ().getName(this.dvo.iJW);
            boolean bl2 = true;
            cuo cuo2 = cxj.yw(this.dvo.iJW);
            if (cuo2 == null) {
                lfn.b(5, "SFReadManualFO", "doFunction() No trainingrule found for skill '" + string + "'");
                bl2 = false;
                bl2 = true;
            }
            if (!bl2) {
                if (this.dvo.bOs()) {
                    this.a(this.dvo, false);
                }
                this.Vc();
                return;
            }
            this.a(this.dvo.iJW, this.dvo.aZG, 1.0f);
            return;
        }
        if (cxc2.bfw() >= 40.0f) {
            ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.abN.jk().jr());
            this.f(ldv2, mcs.uyy.bD(cxc2.zg()));
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        bri bri2 = (bri)this.abN.aJC().asf();
        boolean bl3 = bri2.a(this.dvo.iJV, bqy.dHw);
        if (!bl3) {
            lfn.b(5, "SFReadManualFO", "doFunction() ManualItem " + this.dvo.iJV + " could not be removed.");
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        if (cxc2 instanceof cxb) {
            ((cxb)cxc2).fg(5.0f);
        } else if (cxc2 instanceof czb) {
            ((czb)((Object)cxc2)).fg(5.0f);
        } else {
            lfn.b(5, "SFReadManualFO", "doFunction() Unknown skilltype");
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        if (this.dvo.bOs()) {
            this.a(this.dvo, true);
        }
        this.Vc();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4610: {
                this.a((gja)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gja gja2) {
        cxc cxc2 = gja2.gcr;
        if (cxc2 == null) {
            lfn.b(5, "SFReadManualFO", "handleSkillCreateResponse() Skill received from resourcemanager is null.");
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        bri bri2 = (bri)this.abN.aJC().asf();
        boolean bl2 = bri2.a(this.dvo.iJV, bqy.dHw);
        if (!bl2) {
            lfn.b(5, "SFReadManualFO", "handleSkillCreateResponse() ManualItem " + this.dvo.iJV + " could not be removed.");
            if (this.dvo.bOs()) {
                this.a(this.dvo, false);
            }
            this.Vc();
            return;
        }
        this.MessageDelegator.a(cxc2);
        this.abN.aJz().a(cxc2, false);
        this.abN.aJA().R(cxc2.getGUID(), cxc2.zg());
        ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.abN.jk().jr());
        this.f(ldv2, mcs.uys.bD(cxc2.zg()));
        if (this.dvo.bOs()) {
            this.a(this.dvo, true);
        }
        this.Vc();
    }

    public final void f(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void a(int n, ldv ldv2, float f2) {
        assert (n > 0);
        assert (ldv2 != null);
        giz giz2 = (giz)this.MessageDelegator.h(4609, this.GUID, lcr.qCq);
        giz2.SkillType = n;
        giz2.iSi = 1;
        giz2.Yc = ldv2;
        giz2.SkillLevel = f2;
        this.MessageDelegator.F(giz2);
    }
}

