/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 *  cug
 *  cwx
 *  cxd
 *  ha
 *  lcr
 *  lcw
 */
public class czb
extends cwx {
    protected boolean fZx = false;
    private cxd.q fZy = cxd.q.fSr;
    protected double fZz = 0.0;
    protected aja[] fZA = null;

    public final aja[] bhp() {
        assert (this.bft());
        return this.fZA;
    }

    public final void c(aja[] ajaArray) {
        assert (this.fZA == null);
        assert (ajaArray != null);
        this.fZA = ajaArray;
        int n2 = this.fZA.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.fZA[i2].a(this);
        }
    }

    protected void e(cxc cxc2) {
        super.e(cxc2);
        czb czb2 = (czb)((Object)cxc2);
        if (this.fZA != null) {
            aja[] ajaArray = new aja[this.fZA.length];
            int n2 = this.fZA.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                ajaArray[i2] = this.fZA[i2].Cp();
            }
            czb2.c(ajaArray);
        }
    }

    public final void a(cxd.q q2) {
        assert (q2 != null);
        assert (this.fZy == cxd.q.fSr) : this.fZy;
        this.fZy = q2;
    }

    public final float bhq() {
        assert (this.emI != null);
        assert (this.emI instanceof cyv);
        return this.jk().ch((cxc)((Object)this));
    }

    public final boolean beL() {
        assert (this.bef() != null);
        switch (this.bef()) {
            case fGs: 
            case fGu: 
            case fGv: 
            case fGw: {
                return true;
            }
            case fGx: {
                return true;
            }
        }
        return false;
    }

    public final void ff(float f2) {
        assert (this.emI != null);
        assert (this.emI instanceof cyv);
        if (this.bfE() && f2 >= this.bfx()) {
            return;
        }
        if (f2 > this.bfx()) {
            f2 = this.bfx();
        }
        float f3 = this.bfw();
        this.ag(f2);
        if (this.jk().G(f3, this.bfw())) {
            cex cex2;
            ha ha2;
            cyv cyv2;
            cdb cdb2;
            gyw gyw2 = (gyw)this.MessageDelegator.h(12048, this.GUID, lcr.qAI);
            gyw2.ija = 1;
            gyw2.SkillLevel = this.bfw();
            this.MessageDelegator.E(gyw2);
            if (cxi.D(f3, f2) && (cdb2 = (cyv2 = (cyv)this.emI).bgQ()) != null && cdb2 instanceof cex && (ha2 = (cex2 = (cex)cdb2).mA()) != null) {
                ftd ftd2 = (ftd)this.MessageDelegator.h(30210, this.getGUID(), ha2.getGUID());
                ftd2.SkillType = this.zg();
                ftd2.SkillLevel = f2;
                this.MessageDelegator.I(ftd2);
            }
        }
        if (this.emI.bgQ() instanceof cex) {
            ((cex)this.emI.bgQ()).aMy().c((cxc)((Object)this));
        }
    }

    public final void bfs() {
        assert (this.emI != null);
        assert (this.emI instanceof cyv);
        this.ff(99.6f);
    }

    public int DB() {
        return 0;
    }

    public final void bhr() {
        assert (this.bfF());
        if (this.beu()) {
            this.emI.l((cwx)this);
        }
        this.b(cxd.p.fSj);
        if (this.emI.bgQ() instanceof cex) {
            ((cex)this.emI.bgQ()).aMy().b(this);
            fte fte2 = (fte)this.MessageDelegator.h(30209, this.getGUID(), ((cex)this.emI.bgQ()).mA().getGUID());
            fte2.doT = 0.0f;
            fte2.mB = 0.0f;
            fte2.SkillType = this.SkillType;
            fte2.ResourceType = this.fGh.dhr;
            this.MessageDelegator.I(fte2);
        }
    }

    public final void fg(float f2) {
        float f3;
        assert (this.emI != null);
        assert (this.emI instanceof cyv);
        if (lcw.emW() && lcw.emX() && lea.enZ().isDescendant(this.zg(), cxd.fLd)) {
            f3 = cil.h(this.aJz().bgQ().fi());
            f2 += f2 * f3;
        }
        f3 = this.Bt() + f2;
        this.ff(f3);
    }

    public final void b(int n2, boolean bl, boolean bl2) {
        if (n2 <= 0) {
            lfn.b(5, "SFServerSkill", "sendSkillStopMessage() SkillSessionID is invalid for " + this.art());
        }
        gjv gjv2 = (gjv)this.MessageDelegator.h(4618, this.GUID, this.jk().bhh());
        gjv2.SkillType = this.SkillType;
        gjv2.aYH = n2;
        gjv2.jju = bl;
        gjv2.jjt = true;
        gjv2.fGk = bl2;
        this.MessageDelegator.E(gjv2);
    }

    public void hr(boolean bl) {
        if (this.bef() != cwx.a.fGw) {
            lfn.b(5, "SFServerSkill", "stopPerformingSkill() Skill '" + this.getName() + "' is not in performing state: " + (Object)((Object)this.bef()));
            return;
        }
        this.a(cwx.a.fGx);
    }

    protected boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGr) {
            return false;
        }
        return a3 == cwx.a.fGv || a3 == cwx.a.fGw;
    }

    protected final void bhs() {
        boolean bl = true;
        this.fZx = false;
        if (cxj.yn(this.SkillType)) {
            bl = false;
            this.fZx = false;
        } else if (cxj.yo(this.SkillType)) {
            bl = false;
            this.fZx = true;
        }
        if (bl) {
            this.fZx = this.bhu();
        }
    }

    protected final ldv mp(ldv ldv2) {
        assert (this.bfF());
        return lcr.ak((ldv)ldv2, (int)this.jk().jr());
    }

    protected void hh(boolean bl) {
        dcy dcy2 = (dcy)this.e(cxd.p.fSe);
        if (dcy2 != null && dcy2.bjz() && !dcy2.beV()) {
            assert (dcy2.bjA() != null);
            this.a(dcy2.bjA(), dcy2.bjw(), false);
            dcy2.reset();
        }
        super.hh(bl);
    }

    protected final int b(float[] fArray) {
        assert (fArray != null);
        assert (fArray.length > 0);
        int n2 = 0;
        float f2 = fArray[0];
        for (int i2 = 1; i2 < fArray.length; ++i2) {
            if (!(fArray[i2] > f2)) continue;
            n2 = i2;
            f2 = fArray[i2];
        }
        return n2;
    }

    protected final int c(float[] fArray) {
        assert (fArray != null);
        assert (fArray.length > 0);
        int n2 = 0;
        float f2 = fArray[0];
        for (int i2 = 1; i2 < fArray.length; ++i2) {
            if (!(fArray[i2] < f2)) continue;
            n2 = i2;
            f2 = fArray[i2];
        }
        return n2;
    }

    protected final ldv bht() {
        assert (this.fGe != null);
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            akc akc2;
            if (!(this.fGe[i2] instanceof akc) || (akc2 = (akc)this.fGe[i2]).Dc() == null || !ResourceTree.k(n3 = akc2.Dc().az(), cug.fmO, false)) continue;
            return akc2.Dc().avX()[0].GUID;
        }
        lfn.b(5, "SFServerSkill", "findToolItemGUID() Could not find tool item for skill '" + this.getName() + "'");
        return null;
    }

    protected final int Be() {
        if (this.emI.bgQ() instanceof cex) {
            return this.jk().jr();
        }
        return 0;
    }

    protected void b(gjt gjt2) {
        super.b(gjt2);
        this.b(gjt2.aYH, true, true);
    }

    protected boolean c(gjt gjt2) {
        boolean bl = super.c(gjt2);
        if (bl) {
            this.jk().d(this);
            this.fZz = this.MessageDelegator.arc().rgz;
        }
        return bl;
    }

    protected void a(cwx.a a2, cwx.a a3) {
        if (a3 == cwx.a.fGr && aqN.isDescendant(this.SkillType, cxd.fJn)) {
            this.b(this.aYH, false, false);
        }
    }

    protected final boolean bfZ() {
        if (this instanceof daf) {
            return true;
        }
        return this instanceof dae;
    }

    protected boolean bhu() {
        return true;
    }

    protected void bex() {
        super.bex();
        this.fZx = false;
        switch (this.fZy) {
            case fSp: {
                this.bfs();
                break;
            }
            case fSq: {
                this.bhq();
                break;
            }
            case fSr: {
                break;
            }
            default: {
                lfn.b(5, "SFContainerSkill", "resetSkill() Invalid state provided: " + (Object)((Object)this.fZy));
                return;
            }
        }
        this.fZy = cxd.q.fSr;
    }

    protected final void hR(ldv ldv2) {
        assert (ldv2 != null);
        fdp fdp2 = (fdp)this.MessageDelegator.h(9218, this.GUID, ldv2);
        this.MessageDelegator.F(fdp2);
    }

    protected final void c(cwx.a a2) {
        switch (a2) {
            case fGw: 
            case fGr: {
                break;
            }
            default: {
                lfn.b(5, "SFServerSkill", "sendSkillStateChangeMessage() Message sent while in unhandled state: " + (Object)((Object)a2));
                assert (false);
                break;
            }
        }
        gju gju2 = (gju)this.MessageDelegator.h(4620, this.GUID, this.jk().bhh());
        gju2.SkillType = this.SkillType;
        gju2.aYH = this.aYH;
        gju2.jjs = a2.ordinal();
        gju2.gcx = false;
        gju2.fXd = this.fZx;
        this.MessageDelegator.E(gju2);
    }

    protected final boolean a(int n2, ljq ljq2, ljq ljq3) {
        float f2;
        boolean bl;
        assert (ljq2 != null);
        assert (ljq3 != null);
        float f3 = ljq2.ez(ljq3);
        boolean bl2 = bl = f3 <= (f2 = this.zh(n2));
        if (!bl) {
            // empty if block
        }
        return bl;
    }

    private float zh(int n2) {
        assert (n2 > 0);
        dbv dbv2 = lea.eoW().get(n2);
        if (dbv2 == null) {
            return 27.5f;
        }
        return dbv2.gcA;
    }
}

