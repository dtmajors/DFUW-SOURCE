/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cug
 *  mcs
 */
public class czq
extends czc {
    private boolean gaA = false;
    private boolean gax = false;

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1028: {
                this.a((ftz)dxq2);
                break;
            }
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 1048: {
                this.a((fue)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && this.gaA) {
            this.gax = true;
            return true;
        }
        return super.b(a2, a3);
    }

    @Override
    protected final void a(czc.a a2) {
        if (a2 == czc.a.fZG) {
            if (this.bfF()) {
                fud fud2 = (fud)this.MessageDelegator.h(1047, this.GUID, this.fGh.akX);
                fud2.pU(this.jk().bgR().mA().getGUID());
                this.MessageDelegator.F(fud2);
            }
        } else if (a2 != czc.a.fZH && a2 == czc.a.fZI) {
            if (this.fGh.akX == null) {
                lfn.b(5, "SFRepairingSkill", "doPerform() TargetObjectGUID is null.");
                this.beQ();
                return;
            }
            ake ake2 = this.bid();
            if (ake2 == null) {
                lfn.b(5, "SFRepairingSkill", "doPerform() No constraint found in skill '" + this.getName() + "'");
                this.beQ();
                return;
            }
            ftz ftz2 = (ftz)this.MessageDelegator.h(1028, this.GUID, this.fGh.akX);
            ftz2.jM(true);
            ftz2.aqs = this.aYH;
            this.MessageDelegator.F(ftz2);
            this.gaA = true;
        }
    }

    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        this.gaA = false;
        if (this.gax) {
            this.beQ();
        }
    }

    @Override
    protected final void bex() {
        if (this.bfF()) {
            fuf fuf2 = (fuf)this.MessageDelegator.h(1049, this.GUID, this.fGh.akX);
            fuf2.pU(this.jk().bgR().mA().getGUID());
            this.MessageDelegator.F(fuf2);
        }
        super.bex();
        this.gaA = false;
        this.gax = false;
    }

    private void a(ftz ftz2) {
        if (ftz2.aqs != this.aYH) {
            lfn.b(5, "SFRepairingSkill", "handleObjectPositionInfoMessage() Invalid messagetag provided: " + ftz2.aqs);
            lfn.b(5, "SFRepairingSkill", "handleObjectPositionInfoMessage() SessionID=" + this.aYH);
            return;
        }
        assert (this.gaA);
        this.gaA = false;
        boolean bl = true;
        if (ftz2.Position == null) {
            lfn.b(5, "SFRepairingSkill", "handleObjectPositionInfoMessage() Position is null.");
            bl = false;
        } else if (!this.b(this.fGh.dhr, this.emI.bgQ().aAG().av(), ftz2.Position)) {
            bl = false;
        }
        ake ake2 = this.bid();
        if (ake2 == null) {
            lfn.b(5, "SFRepairingSkill", "handleObjectPositionInfoMessage() No constraint found in skill '" + this.getName() + "'");
            bl = false;
        }
        if (!bl) {
            this.bhw();
            return;
        }
        bri bri2 = (bri)this.emI.bgQ().aJC().asf();
        bri2.a(ake2.Dc(), bqy.dHw);
        ldv ldv2 = this.bht();
        if (ldv2 == null) {
            lfn.b(5, "SFRepairingSkill", "handleObjectPositionInfoMessage() ToolItemGUID is null.");
            return;
        }
        boolean bl2 = this.jk().a(ldv2, this);
        if (!bl2) {
            float f2 = this.xn(1542);
            this.l(this.fGh.akX, f2);
        }
        if (this.gax) {
            this.beQ();
        }
    }

    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFRepairingSkill", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.bst != this.getFunctionType()) {
            lfn.b(5, "SFRepairingSkill", "handleFunctionCompletionResultMessage() FunctionType are different.");
            lfn.b(5, "SFRepairingSkill", "handleFunctionCompletionResultMessage() Message.FunctionType='" + dqt.getName(fcs2.bst) + "'");
            lfn.b(5, "SFRepairingSkill", "handleFunctionCompletionResultMessage() Skill.FunctionType='" + dqt.getName(this.getFunctionType()) + "'");
            return;
        }
        if (fcs2.iJq) {
            this.bhq();
            this.bhr();
            this.b(cxd.p.fSi);
        } else {
            this.ber();
        }
    }

    private float zq(int n2) {
        assert (n2 > 0);
        dbv dbv2 = lea.eoW().get(n2);
        if (dbv2 == null) {
            return 27.5f;
        }
        return dbv2.gcz;
    }

    private ake bid() {
        if (this.fGe == null) {
            lfn.b(5, "SFRepairingSkill", "getResourceQuantityConstraint() No constraints added to skill '" + this.getName() + "'");
            return null;
        }
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ake ake2;
            if (!(this.fGe[i2] instanceof ake) || (ake2 = (ake)this.fGe[i2]).az() != cug.fkE) continue;
            return ake2;
        }
        return null;
    }

    private void l(ldv ldv2, float f2) {
        assert (ldv2 != null);
        assert (f2 > 0.0f);
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.dul = 8;
        fcw2.bst = this.getFunctionType();
        fcw2.aZG = this.emI.bgQ().getGUID();
        fcw2.akX = ldv2;
        fcw2.aYF = fcw2.aZG;
        fcw2.bsG = this.emI.bgQ().az();
        fcw2.aYC = this.SkillType;
        fcw2.Magnitude = f2;
        fcw2.eKm = 0.0;
        fcw2.aSp = 0.0f;
        fcw2.a(cxd.f.fQX);
        fcw2.aYH = this.aYH;
        fcw2.aYG = bfk.dgx;
        fcw2.bsE = 0;
        fcw2.bRD = 1;
        fcw2.gpI = -3.0;
        fcw2.aZH = null;
        this.MessageDelegator.H(fcw2);
    }

    private boolean b(int n2, ljq ljq2, ljq ljq3) {
        float f2;
        assert (ljq2 != null);
        assert (ljq3 != null);
        float f3 = ljq2.ez(ljq3);
        return f3 <= (f2 = this.zq(n2));
    }

    private void a(fue fue2) {
        if (!fue2.vA()) {
            this.jk().bgR().mA().c(mcs.uCe.bD(this.fGh.dhr));
            this.bhw();
        }
    }
}

