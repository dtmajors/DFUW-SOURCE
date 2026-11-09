/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cxd
 *  lcw
 *  mcs
 */
public class cxv
extends cxo
implements bto {
    private dbw[] fXs = null;
    private double fXt = 0.0;
    private boolean fXu = false;
    private boolean fXv = false;

    public dbw[] bgi() {
        return this.fXs;
    }

    public void a(dbw[] dbwArray) {
        this.fXs = dbwArray;
        if (this.fXs != null) {
            int n2 = this.fXs.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.fXs[i2].a(this);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.bef() != cwx.a.fGw) {
            return;
        }
        if (this.fGj) {
            return;
        }
        dcx dcx2 = this.e(cxd.p.fSf);
        if (dcx2 == null) {
            return;
        }
        if (this.fXt == 0.0) {
            this.fXt = ldz2.rgz;
        } else if (ldz2.rgz >= this.fXt + 0.1) {
            assert (dcx2.bjz());
            assert (dcx2.bjA() != null);
            this.fXt = ldz2.rgz;
            if (!this.beZ()) {
                this.bgj();
                this.a(dcx2.bjA(), dcx2.bjw(), false);
                dcx2.reset();
                this.a(cwx.a.fGx);
            }
        }
        if (this.fXu) {
            this.bgm();
            this.bgp();
        }
    }

    public final void a(gjy gjy2) {
        if (!lcw.emW() || !lcw.emX()) {
            assert (false) : "System should be disabled.";
            return;
        }
        Float f2 = lea.epE().get(this.SkillType);
        if (f2 == null) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " is not a selentine skill.";
            return;
        }
        if (this.bef() != cwx.a.fGw) {
            assert (false);
            return;
        }
        dcx dcx2 = this.e(cxd.p.fSf);
        if (dcx2 == null || !dcx2.bjz()) {
            assert (false);
            return;
        }
        if (dcx2.bjA() == null) {
            assert (false) : "Performong timer for skill : " + this.Bu() + " is not ready.";
            return;
        }
        gvu gvu2 = (gvu)this.MessageDelegator.h(4359, this.GUID, this.MessageDelegator.getGUID());
        gvu2.atv = dcx2.bjA();
        gvu2.jsy = f2.floatValue();
        this.MessageDelegator.H(gvu2);
        if (this.fXs != null && this.fXs.length > 0) {
            for (dbw dbw2 : this.fXs) {
                if (!(dbw2 instanceof dca)) continue;
                dca dca2 = (dca)dbw2;
                dca2.a(this.getGUID(), cxd.k.fRI, f2.floatValue());
            }
        }
    }

    public float xo(int n2) {
        switch (n2) {
            case 24: {
                return this.beX();
            }
        }
        return super.xo(n2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 1024: {
                if (this.fXs == null) {
                    lfn.b(5, "SFDurationSkillClient", "receiveResponse() No performingobject to handle objectresponse.");
                    return;
                }
                int n2 = this.fXs.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (this.fXs[i2].bji() != cxd.j.fRu || ktv2.ew == 0) continue;
                    lfn.b(5, "SFDurationSkillClient", "receiveResponse() ObjectStuckRequest failed.");
                }
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        cxv cxv2 = (cxv)((Object)cxc2);
        if (this.fXs != null) {
            dbw[] dbwArray = new dbw[this.fXs.length];
            int n2 = this.fXs.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                dbwArray[i2] = this.fXs[i2].bjj();
            }
            cxv2.a(dbwArray);
        }
    }

    protected void a(a a2) {
        if (a2 == a.fXw || a2 == a.fXx || a2 == a.fXy) {
            // empty if block
        }
    }

    protected void hh(boolean bl) {
        Object object;
        this.b(cwx.a.fGw);
        if (!this.beZ()) {
            this.bgj();
            this.a(cwx.a.fGx);
            return;
        }
        if (this.zg() == cxd.fJG) {
            if (this.aJz().bgR() instanceof cew && (object = ((cew)this.aJz().bgQ()).aMg()) != null && (((cwd)object).bdi() || ((cwd)object).bdh())) {
                this.a(mcs.uBL.bD(new Object[0]));
                this.beO();
                this.a(cwx.a.fGx);
                return;
            }
        } else if (this.zg() == cxd.fJH && this.aJz().bgR() instanceof cew && (object = ((cew)this.aJz().bgQ()).aMg()) != null && (((cwd)object).bdi() || ((cwd)object).bdh())) {
            this.a(mcs.uBM.bD(new Object[0]));
            this.beO();
            this.a(cwx.a.fGx);
            return;
        }
        if (this.zg() == cxd.fJI) {
            System.out.println("a");
        }
        if ((object = this.e(cxd.p.fSf)) != null) {
            assert (!((dcx)object).bjz());
            assert (((dcx)object).bjA() == null);
            double d2 = this.beX();
            if (((dcx)object).bjD()) {
                ((dcx)object).bJ(d2);
                this.a(((dcx)object).bjw(), d2, 0);
                this.b(a.fXw);
            } else {
                ((dcx)object).bJ(d2);
                this.a(((dcx)object).bjw(), d2, ((dcx)object).bjy());
                this.b(a.fXw);
            }
            this.bgk();
        } else {
            this.beA();
            this.a(cwx.a.fGx, bl);
        }
        this.b(cxd.p.fSf);
    }

    protected final void hi(boolean bl) {
        this.bgl();
        this.bgo();
        if (this.beW()) {
            this.a(cxd.p.fSf, true, false, true);
            dcx dcx2 = this.e(cxd.p.fSf);
            if (dcx2.bjz()) {
                assert (dcx2.bjA() != null);
                this.a(dcx2.bjA(), dcx2.bjw(), false);
                dcx2.reset();
            }
        } else {
            dcx dcx3 = this.e(cxd.p.fSf);
            this.fXv = this.fXv || dcx3.bjw() == 4;
            this.a(cxd.p.fSf, false, false, this.fXv);
        }
        super.hi(bl);
    }

    protected final void bgj() {
        aja aja2 = this.bfb();
        if (aja2 == null) {
            lfn.b(5, "SFDurationSkillClient", "handleBreakableConstraintsBroken() Could not find an unsatisfied constraint.");
            return;
        }
        if (ajb.b.isPreventPerformingStateCheck(aja2.Cl())) {
            lfn.b(5, "SFDurationSkillClient", "handleBreakableConstraintsBroken() Unsatisfied constraint: " + aja2);
            return;
        }
        gjw gjw2 = (gjw)this.MessageDelegator.h(4625, this.GUID, this.aJX().bhb());
        gjw2.SkillType = this.SkillType;
        gjw2.aYH = this.aYH;
        gjw2.jjv = true;
        this.MessageDelegator.E(gjw2);
        this.fXv = true;
    }

    protected void beO() {
        dcx dcx2 = this.e(cxd.p.fSf);
        if (dcx2 != null) {
            if (dcx2.bjz()) {
                if (dcx2.bjA() != null) {
                    this.a(dcx2.bjA(), dcx2.bjw(), false);
                    dcx2.reset();
                    this.b(a.fXy);
                } else {
                    lfn.b(5, "SFDurationSkillClient", "handleSkillStoppedPerforming() Stopping skill '" + this.getName() + "' but missing performing timerGUID.");
                    lfn.b(5, "SFDurationSkillClient", "handleSkillStoppedPerforming() " + dcx2);
                    dcx2.reset();
                }
            } else assert (dcx2.bjA() == null);
        } else {
            lfn.b(5, "SFDurationSkillClient", "handleSkillStoppedPerforming() Could not find a performing timer in skill '" + this.getName() + "'");
            assert (false);
        }
        super.beO();
    }

    protected final void a(gvt gvt2) {
        if (gvt2.atv == null) {
            lfn.b(5, "SFDurationSkillClient", "handleTimerTimeoutMessage() TimerGUID is null in state '" + this.beS() + "'");
            return;
        }
        if (this.bef() == cwx.a.fGw) {
            dcx dcx2 = this.a(cxd.p.fSf, gvt2.atv);
            if (dcx2 == null) {
                lfn.b(5, "SFDurationSkillClient", "handleTimerTimeoutMessage() No performing skilltimer found.");
                return;
            }
            if (dcx2.bjw() == 4) {
                if (gvt2.hmX == dcx2.bjy() + 1) {
                    dcx2.reset();
                    if (this.beZ()) {
                        this.b(a.fXy);
                    } else {
                        this.bgj();
                    }
                    this.a(cwx.a.fGx);
                } else {
                    this.b(a.fXx);
                }
            } else if (dcx2.bjD()) {
                this.b(a.fXx);
            } else {
                lfn.b(5, "SFDurationSkillClient", "handleTimerTimeoutMessage() Skill '" + this.getName() + "' has invalid performing timertype: " + dcx2.bjw());
                assert (false);
            }
        } else {
            super.a(gvt2);
        }
    }

    @Override
    protected void bex() {
        super.bex();
        this.fXt = 0.0;
        this.fXu = false;
        this.fXv = false;
    }

    private void b(a a2) {
        this.a(a2);
        if (a2 == a.fXw) {
            this.fXu = true;
        } else if (a2 == a.fXy) {
            this.fXu = false;
        }
    }

    private void bgk() {
        if (this.fXs == null) {
            return;
        }
        int n2 = this.fXs.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.fXs[i2].bjk();
        }
    }

    private void bgl() {
        if (this.fXs == null) {
            return;
        }
        int n2 = this.fXs.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.fXs[i2].beQ();
        }
    }

    private void bgm() {
        if (this.fXs == null) {
            return;
        }
        int n2 = this.fXs.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.fXs[i2].nh();
        }
    }

    private void bgn() {
        if (this.fGe == null) {
            return;
        }
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(this.fGe[i2] instanceof aki)) continue;
            if (!this.fGe[i2].Cs()) {
                lfn.b(5, "SFDurationSkillClient", "startSessionConstraints() Constraint " + i2 + " is a session constraint but is not a performing constraint.");
                lfn.b(5, "SFDurationSkillClient", "startSessionConstraints() " + this.fGe[i2]);
                continue;
            }
            ((aki)((Object)this.fGe[i2])).Ch();
        }
    }

    private void bgo() {
        if (this.fGe == null) {
            return;
        }
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(this.fGe[i2] instanceof aki) || !this.fGe[i2].Cs()) continue;
            ((aki)((Object)this.fGe[i2])).Ci();
        }
    }

    private void bgp() {
        if (this.fGe == null) {
            return;
        }
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(this.fGe[i2] instanceof akw) || !this.fGe[i2].Cs()) continue;
            ((akw)((Object)this.fGe[i2])).nh();
        }
    }
}

