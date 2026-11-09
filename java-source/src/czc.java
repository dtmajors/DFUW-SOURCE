/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 *  cug
 *  cxd
 *  ha
 *  lcw
 */
public class czc
extends czb
implements bto {
    private boolean fZC = false;
    private dbw[] fXs = null;
    private double fXt = 0.0;
    private boolean fXu = false;
    private long fZD = 0L;
    private ljq Position = null;
    private double fZE = 0.0;
    protected boolean fXv = false;
    private boolean fZF = false;

    public final boolean bhv() {
        return this.fZC;
    }

    public final void hs(boolean bl) {
        this.fZC = bl;
    }

    public final dbw[] bgi() {
        return this.fXs;
    }

    public final void a(dbw[] dbwArray) {
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
            cex cex2;
            bvd bvd2;
            cdb cdb2;
            this.fXt = ldz2.rgz;
            if (cxd.xB((int)this.zg()) && (cdb2 = this.emI.bgQ()) instanceof cex && (bvd2 = (cex2 = (cex)cdb2).aAG()) != null) {
                this.fZD = this.MessageDelegator.bzy().getTimeInMillis();
                this.Position = bvd2.azb();
            }
        } else if (ldz2.rgz >= this.fXt + 0.1) {
            assert (dcx2.bjz());
            assert (dcx2.bjA() != null);
            if (ldz2.rgz >= this.fZE + 1.0) {
                cdb cdb3;
                if (cxd.xB((int)this.zg()) && (cdb3 = this.emI.bgQ()) instanceof cex) {
                    cex cex3 = (cex)cdb3;
                    bvd bvd3 = cex3.aAG();
                    ha ha2 = cex3.mA();
                    if (ha2 != null) {
                        Object object;
                        float f2 = 1.0f;
                        float f3 = 0.0f;
                        if (bvd3 != null) {
                            f3 = ljq.s(bvd3.azb(), this.Position);
                            this.Position = bvd3.azb();
                        }
                        int n2 = -1;
                        n2 = this instanceof daf ? (((daf)(object = (daf)this)).Dw() ? ((daf)object).bgx() : this.zg()) : this.SkillType;
                        object = (fte)this.MessageDelegator.h(30209, this.getGUID(), ha2.getGUID());
                        ((fte)object).doT = 1.0f;
                        ((fte)object).mB = f3;
                        ((fte)object).SkillType = n2;
                        ((fte)object).ResourceType = cug.fgJ;
                        this.MessageDelegator.I((dxq)object);
                    }
                }
                this.fZE = ldz2.rgz;
            }
            this.fXt = ldz2.rgz;
            if (!this.beZ()) {
                this.bgj();
                this.beP();
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

    public final void bI(double d2) {
        if (!lcw.emW() || !lcw.emX()) {
            assert (false) : "System should be disabled.";
            return;
        }
        if (d2 <= 0.0) {
            assert (false) : "TimerLengthMultiplier : " + d2 + " is invalid.";
            return;
        }
        if (this.bef() != cwx.a.fGw) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " is not in performing state.";
            return;
        }
        dcx dcx2 = this.e(cxd.p.fSf);
        if (dcx2 == null) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " does not have a performing timer.";
            return;
        }
        if (!dcx2.bjz()) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " does not have a created skill performing timer.";
            return;
        }
        gvu gvu2 = (gvu)this.MessageDelegator.h(4359, this.GUID, this.MessageDelegator.getGUID());
        gvu2.atv = dcx2.bjA();
        gvu2.jsy = d2;
        this.MessageDelegator.H(gvu2);
    }

    public final void a(gvv gvv2) {
        ldv ldv2 = gvv2.atv;
        if (ldv2 == null) {
            assert (false) : "TimerGUID is NULL.";
            return;
        }
        if (this.bef() != cwx.a.fGw) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " is not in performing state.";
            return;
        }
        dcx dcx2 = this.e(cxd.p.fSf);
        if (dcx2 == null) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " does not have a performing timer.";
            return;
        }
        if (!dcx2.bjz()) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " does not have a created skill performing timer.";
            return;
        }
        if (!ldv2.equals(dcx2.bjA())) {
            assert (false) : "TimerGUID : " + ldv2 + " does not match with SkillTimerGUID : " + dcx2.bjA();
            return;
        }
        Float f2 = lea.epE().get(this.SkillType);
        if (f2 == null) {
            assert (false) : "Skill : " + cxd.xu((int)this.SkillType) + " is not a selentine skill.";
            return;
        }
        if (gvv2.jsA) {
            if (this.fXs != null && this.fXs.length > 0) {
                for (dbw dbw2 : this.fXs) {
                    if (!(dbw2 instanceof dcc)) continue;
                    dcc dcc2 = (dcc)dbw2;
                    dcc2.gc(f2.floatValue());
                }
            }
            gjy gjy2 = (gjy)this.MessageDelegator.h(4641, this.GUID, this.jk().bhh());
            gjy2.jjy = this.MessageDelegator.arc().rgz;
            gjy2.SkillType = this.SkillType;
            gjy2.aYH = this.aYH;
            gjy2.jjs = this.bef().ordinal();
            this.MessageDelegator.E(gjy2);
            this.fZF = true;
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

    public String bfB() {
        return "SFDurationSkillServer";
    }

    @Override
    public final void hr(boolean bl) {
        if (this.bef() != cwx.a.fGw) {
            lfn.b(5, "SFDurationSkillServer", "stopPerformingSkill() Skill '" + this.getName() + "' is not in performing state: " + (Object)((Object)this.bef()));
            return;
        }
        if (bl) {
            this.bgj();
        }
        this.beP();
        this.a(cwx.a.fGx);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czc czc2 = (czc)((Object)cxc2);
        czc2.hs(this.fZC);
        if (this.fXs != null) {
            dbw[] dbwArray = new dbw[this.fXs.length];
            int n2 = this.fXs.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                dbwArray[i2] = this.fXs[i2].bjj();
            }
            czc2.a(dbwArray);
        }
    }

    protected void a(a a2) {
        if (a2 == a.fZG || a2 == a.fZH || a2 == a.fZI) {
            // empty if block
        }
    }

    @Override
    protected final void hh(boolean bl) {
        boolean bl2;
        boolean bl3;
        dcx dcx2;
        dcy dcy2 = (dcy)this.e(cxd.p.fSe);
        if (dcy2 != null && dcy2.bjz() && !dcy2.beV()) {
            assert (dcy2.bjA() != null);
            this.a(dcy2.bjA(), dcy2.bjw(), false);
            dcy2.reset();
        }
        this.b(cwx.a.fGw);
        if (!this.beZ()) {
            this.bgj();
            this.a(cwx.a.fGx);
            return;
        }
        if (cxd.xS((int)this.SkillType)) {
            this.bhs();
            if (this.fZx) {
                this.bhr();
            } else {
                this.ber();
                this.a(cwx.a.fGx);
                return;
            }
        }
        if ((dcx2 = this.e(cxd.p.fSf)) != null) {
            assert (!dcx2.bjz());
            assert (dcx2.bjA() == null);
            if (!this.fZC) {
                this.beB();
            }
            double d2 = this.beX();
            if (dcx2.bjD()) {
                dcx2.bJ(d2);
                this.a(dcx2.bjw(), d2, 0);
                this.b(a.fZG);
            } else {
                dcx2.bJ(d2);
                this.a(dcx2.bjw(), d2, dcx2.bjy());
                this.b(a.fZG);
            }
            this.bgk();
            this.bgn();
        } else {
            this.beB();
            this.beA();
            if (this.bef() == cwx.a.fGr) {
                return;
            }
            this.a(cwx.a.fGx, bl);
        }
        this.b(cxd.p.fSf);
        if (aqN.isDescendant(this.SkillType, cxd.fJq) && !this.emI.bgQ().aJB().bko() ? (bl3 = this.jk().c(this)) : aqN.isDescendant(this.SkillType, cxd.fJl) && (bl2 = this.jk().c(this))) {
            return;
        }
    }

    protected final void hi(boolean bl) {
        this.bgl();
        this.bgo();
        if (this.beW()) {
            this.a(cxd.p.fSf, true, false, true);
        } else {
            this.a(cxd.p.fSf, false, false, true);
        }
        super.hi(bl);
    }

    protected void bgj() {
        this.fXv = true;
    }

    protected void beO() {
        dcx dcx2 = this.e(cxd.p.fSf);
        if (dcx2 != null) {
            if (dcx2.bjz()) {
                if (dcx2.bjA() != null) {
                    this.a(dcx2.bjA(), dcx2.bjw(), false);
                    dcx2.reset();
                } else {
                    lfn.b(5, "SFDurationSkillServer", "handleSkillStoppedPerforming() Stopping skill '" + this.getName() + "' but missing performing timerGUID.");
                    lfn.b(5, "SFDurationSkillServer", "handleSkillStoppedPerforming() " + dcx2);
                    dcx2.reset();
                }
            } else assert (dcx2.bjA() == null);
        }
        super.beO();
    }

    @Override
    protected void a(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && this.beY()) {
            if (this.bfZ()) {
                return;
            }
            if (this.SkillType == cxd.fHj) {
                return;
            }
            this.c(a3);
        }
        super.a(a2, a3);
    }

    protected final void a(gvt gvt2) {
        if (gvt2.atv == null) {
            lfn.b(5, "SFDurationSkillServer", "handleTimerTimeoutMessage() TimerGUID is null in state '" + this.beS() + "'");
            return;
        }
        if (this.bef() == cwx.a.fGw) {
            dcx dcx2 = this.a(cxd.p.fSf, gvt2.atv);
            if (dcx2 == null) {
                lfn.b(5, "SFDurationSkillServer", "handleTimerTimeoutMessage() No performing skilltimer found.");
                return;
            }
            if (dcx2.bjw() == 4) {
                if (gvt2.hmX == dcx2.bjy() + 1) {
                    dcx2.reset();
                    if (this.beZ()) {
                        this.b(a.fZI);
                    } else {
                        this.bgj();
                    }
                    this.a(cwx.a.fGx);
                } else {
                    this.b(a.fZH);
                }
            } else if (dcx2.bjD()) {
                this.b(a.fZH);
            } else {
                lfn.b(5, "SFDurationSkillServer", "handleTimerTimeoutMessage() Skill '" + this.getName() + "' has invalid performing timertype: " + dcx2.bjw());
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
        this.fZE = 0.0;
        this.fXu = false;
        this.fXv = false;
        this.fZF = false;
    }

    protected final void bhw() {
        this.fZx = false;
        this.beQ();
    }

    private void b(a a2) {
        if (a2 == a.fZI && this.fZC) {
            this.beB();
        }
        this.a(a2);
        if (this.fXs != null) {
            int n2 = this.fXs.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.fXs[i2].a(a2);
            }
        }
        if (a2 == a.fZG) {
            this.fXu = true;
        } else if (a2 == a.fZI) {
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
                lfn.b(5, "SFDurationSkillServer", "startSessionConstraints() Constraint " + i2 + " is a session constraint but is not a performing constraint.");
                lfn.b(5, "SFDurationSkillServer", "startSessionConstraints() " + this.fGe[i2]);
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

    public final boolean bhx() {
        return this.fZF;
    }
}

