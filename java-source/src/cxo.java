/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  cxd
 *  lcr
 *  mcs
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class cxo
extends cwx {
    private static final double fWY = 3.01;
    private cxd.d fWZ = null;
    private ddf fXa = null;
    private static double fXb = 0.0;
    public static boolean fXc = false;
    protected boolean fXd = false;
    gju fXe = null;

    public final cxd.d bfW() {
        return this.fWZ;
    }

    public final void a(cxd.d d2) {
        this.fWZ = d2;
    }

    public final ddf bfX() {
        return this.fXa;
    }

    public final void a(ddf ddf2) {
        this.fXa = ddf2;
        if (this.fXa != null) {
            dde[] ddeArray = this.fXa.gee;
            int n2 = ddeArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (ddeArray[i2] instanceof ddd) {
                    if (!(((ddd)ddeArray[i2]).bjQ() instanceof dbp)) continue;
                    ((dbp)((ddd)ddeArray[i2]).bjQ()).ci((cxc)((Object)this));
                    continue;
                }
                if (!(ddeArray[i2] instanceof ddg) || ((ddg)ddeArray[i2]).bjY().getSpecialEffectType() != -1) continue;
                ((ddg)ddeArray[i2]).bjY().ci((cxc)((Object)this));
            }
        }
    }

    public final boolean beL() {
        assert (this.bef() != null);
        switch (this.bef()) {
            case fGw: 
            case fGx: {
                return true;
            }
        }
        return false;
    }

    public final akt bfY() {
        if (this.fGe != null) {
            int n2 = this.fGe.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!(this.fGe[i2] instanceof akt)) continue;
                return (akt)this.fGe[i2];
            }
        }
        return null;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                gsl gsl2 = (gsl)dxq2;
                uk[] ukArray = gsl2.joY;
                this.c(ukArray);
                break;
            }
            default: {
                akt akt2;
                if (this.bev() && (akt2 = this.bfY()) != null && akt2.o(dxq2)) {
                    return;
                }
                super.receiveMessage(dxq2);
            }
        }
    }

    public final void a(gjv gjv2) {
        assert (this.Initialized);
        assert (this.bef() != cwx.a.fGr);
        if (gjv2 != null && gjv2.jjt) {
            if (gjv2.aO().enw() != this.GUID.enw() || gjv2.aO().enx() != this.GUID.enx()) {
                lfn.b(5, "SFClientSkill", "stopSkill() Message is not from serverskill.");
                lfn.b(5, "SFClientSkill", "stopSkill() GUID=" + this.GUID + " Message.FromGUID=" + gjv2.aO());
                return;
            }
            if (gjv2.fGk) {
                this.fGk = true;
            }
            this.beM();
        } else if (this.bef() == cwx.a.fGw && this.beY()) {
            if (this.bfZ()) {
                super.a(gjv2);
            } else {
                this.bgb();
                this.fGj = true;
            }
        } else {
            super.a(gjv2);
        }
    }

    public final void hm(boolean bl) {
        if (this.bef() != cwx.a.fGw) {
            assert (false);
            return;
        }
        this.fXd = bl;
    }

    protected final boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGr) {
            return false;
        }
        if (a2 == cwx.a.fGw) {
            if (this.bfZ()) {
                return false;
            }
            if (this.SkillType == cxd.fHj) {
                return false;
            }
            if (this.beY()) {
                return true;
            }
        }
        return false;
    }

    protected final void a(boolean bl, boolean bl2, boolean bl3) {
        super.a(bl, bl2, bl3);
        dcn dcn2 = (dcn)this.fGf;
        if (bl && dcn2.gdg || bl2) {
            this.bgb();
        }
    }

    protected final void beT() {
        super.beT();
        if (this.fXa != null) {
            this.aJX().bhd().zg(this.SkillType);
        }
    }

    protected final void beU() {
        super.beU();
        if (this.fXa != null) {
            this.aJX().bhd().zg(this.SkillType);
        }
        this.bgb();
    }

    protected final boolean bez() {
        if (this.fXa != null) {
            int n2 = this.fXa.gee.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!(this.fXa.gee[i2] instanceof ddh)) continue;
                return true;
            }
        }
        return false;
    }

    protected void e(cxc cxc2) {
        super.e(cxc2);
        cxo cxo2 = (cxo)((Object)cxc2);
        cxo2.a(this.fWZ);
        if (this.fXa != null) {
            cxo2.a(this.fXa.bjV());
        }
    }

    protected final void bfc() {
        this.bgb();
    }

    protected boolean c(gjt gjt2) {
        super.c(gjt2);
        gjt gjt3 = null;
        if (gjt2 == null) {
            gjt3 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.aJX().bhb());
            gjt3.SkillType = this.SkillType;
            gjt3.aYH = this.aYH;
        } else {
            gjt3 = (gjt)gjt2.clone();
            gjt3.f(this.GUID);
            gjt3.on(this.aJX().bhb());
            gjt3.aYH = this.aYH;
        }
        switch (this.fWZ) {
            case fQD: {
                break;
            }
            case fQE: {
                ceg ceg2 = (ceg)this.emI.bgQ().aJM();
                if (!(ceg2.aKU() || ceg2.aKV() || ceg2.aKY())) {
                    lfn.b(5, "SFClientSkill", "handleSkillStarted() SkillOwner is not controlling a gun or a guntank.");
                    return false;
                }
                assert (ceg2.Wm() != null);
                gjt3.aZF |= 0x20;
                gjt3.QM = this.MessageDelegator.arc().rgz;
                if (ceg2.Wm() instanceof coy) {
                    coy coy2 = (coy)ceg2.Wm();
                    gjt3.Position = coy2.aXG();
                    gjt3.Rotation = coy2.aXH();
                    break;
                }
                if (ceg2.Wm() instanceof cpb) {
                    cpb cpb2 = (cpb)ceg2.Wm();
                    if (cpb2.aWL() == null) break;
                    gjt3.Position = cpb2.aWL().aXG();
                    gjt3.Rotation = cpb2.aWL().aXH();
                    break;
                }
                if (ceg2.Wm() instanceof cpj) {
                    cpj cpj2 = (cpj)ceg2.Wm();
                    gjt3.Position = new ljq(0.0f, 0.0f, 0.0f);
                    gjt3.Rotation = new lgl();
                    break;
                }
                assert (false);
                break;
            }
            case fQF: {
                assert (!this.d(cxd.p.fSc));
                assert (!this.d(cxd.p.fSe));
                akt akt2 = this.bfY();
                if (akt2 == null) {
                    lfn.b(5, "SFClientSkill", "handleSkillStarted() Could not find a targetingconstraint in skill '" + this.getName() + "'");
                    return false;
                }
                buf buf2 = akt2.CN();
                if (buf2 == null) {
                    lfn.b(5, "SFClientSkill", "TARGETING_CONSTRAINT_DATA handleSkillStarted() InfoAssembler is null.");
                    return false;
                }
                if (buf2.Uj() == null) {
                    lfn.b(5, "SFClientSkill", "TARGETING_CONSTRAINT_DATA handleSkillStarted() TargetPhysicalObjectGUID is null.");
                    return false;
                }
                if (buf2.KY() == null) {
                    lfn.b(5, "SFClientSkill", "TARGETING_CONSTRAINT_DATA handleSkillStarted() TargetMeshObjectGUID is null.");
                    return false;
                }
                if (buf2.av() == null) {
                    lfn.b(5, "SFClientSkill", "TARGETING_CONSTRAINT_DATA handleSkillStarted() TargetPosition is null.");
                    return false;
                }
                if (this.SkillType == cxd.fJz && !buf2.axV()) {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(mcs.uCe.bD(buf2.az()));
                    }
                    return false;
                }
                gjt3.aZF |= 0xC;
                gjt3.akX = buf2.Uj();
                gjt3.dsL = buf2.KY();
                gjt3.dhr = buf2.az();
                gjt3.aZD = buf2.av();
                break;
            }
            case fQG: {
                akt akt3 = this.bfY();
                if (akt3 == null) {
                    lfn.b(5, "SFClientSkill", "handleSkillStarted() Could not find a targetingconstraint in skill '" + this.getName() + "'");
                    return false;
                }
                buf buf3 = akt3.CN();
                if (buf3 == null) {
                    lfn.b(5, "SFClientSkill", "INTERFERENCE_CONSTRAINT_DATA handleSkillStarted() InfoAssembler is null.");
                    return false;
                }
                if (buf3.KY() == null) {
                    lfn.b(5, "SFClientSkill", "INTERFERENCE_CONSTRAINT_DATA handleSkillStarted() TargetMeshObjectGUID is null.");
                    return false;
                }
                if (buf3.Uj() == null) {
                    lfn.b(5, "SFClientSkill", "INTERFERENCE_CONSTRAINT_DATA handleSkillStarted() TargetPhysicalObjectGUID is null.");
                    return false;
                }
                if (buf3.av() == null) {
                    lfn.b(5, "SFClientSkill", "INTERFERENCE_CONSTRAINT_DATA handleSkillStarted() TargetPosition is null.");
                    return false;
                }
                gjt3.aZF |= 0xC;
                gjt3.akX = buf3.Uj();
                gjt3.dsL = buf3.KY();
                gjt3.dhr = buf3.az();
                gjt3.aZD = buf3.av();
                break;
            }
            case fQH: {
                if (this.d(cxd.p.fSc) || this.d(cxd.p.fSe)) break;
                ljq ljq2 = this.emI.yS(this.SkillType);
                assert (ljq2 != null);
                lgl lgl2 = bum.jN(this.emI.bgQ().getGUID());
                if (lgl2 == null) {
                    lfn.b(5, "SFClientSkill", "handleSkillStarted() CameraRotation is not set. Skill='" + this.getName() + "'");
                    lfn.b(5, "SFClientSkill", "handleSkillStarted() GUID=" + this.emI.bgQ().getGUID());
                    lfn.b(5, "SFClientSkill", "handleSkillStarted() Resource='" + this.emI.bgQ().pa() + "'");
                    assert (false);
                    lgl2 = new lgl();
                }
                lgl2.normalize();
                gjt3.aZF |= 0x20;
                gjt3.Position = ljq2;
                gjt3.Rotation = lgl2;
                gjt3.dOf = bum.ayo();
                gjt3.QM = this.MessageDelegator.arc().rgz;
                break;
            }
            default: {
                lfn.b(5, "SFClientSkill", "handleSkillStarted() Invalid clientparamtype provided: " + (Object)((Object)this.fWZ));
                return false;
            }
        }
        this.MessageDelegator.E(gjt3);
        return true;
    }

    protected void beN() {
        byx byx2;
        if (this.bfZ()) {
            this.bgb();
        }
        if (aqN.isDescendant(this.SkillType, cxd.fIk) && (byx2 = this.emI.bgQ().aJD()).aEP().Uv()) {
            byx2.a(byw.c.ecq);
        }
    }

    protected final void b(gjz gjz2) {
        gjz gjz3 = (gjz)gjz2.clone();
        gjz3.f(this.GUID);
        gjz3.on(this.aJX().bhb());
        gjz3.aYH = this.aYH;
        this.MessageDelegator.E(gjz3);
    }

    protected void a(cwx.a a2, cwx.a a3) {
        if (a3 == cwx.a.fGu) {
            this.aJX().bH(this.MessageDelegator.arc().rgz);
        }
        if (a3 == cwx.a.fGr && a2 == cwx.a.fGu) {
            this.aJX().bH(0.0);
        }
        if (a2 == cwx.a.fGr) {
            return;
        }
        if (a3 == cwx.a.fGv || a3 == cwx.a.fGw) {
            this.c(a3);
        } else if (a3 == cwx.a.fGx && this.beW() && this.bfZ()) {
            this.c(a3);
        }
    }

    protected final boolean bfZ() {
        if (this instanceof cya) {
            return true;
        }
        return this instanceof cxz;
    }

    protected void bex() {
        super.bex();
        this.fXd = false;
        if (this.fXa != null && this.aJX().bhd().bhm()) {
            this.aJX().bhd().zg(this.SkillType);
        }
    }

    private boolean bga() {
        if (this.MessageDelegator.arc().rgz > fXb + 3.01) {
            fXb = this.MessageDelegator.arc().rgz;
            return true;
        }
        return false;
    }

    private void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                float f2 = this.Bt();
                float f3 = ((ue)uk2).Pz;
                this.ag(f3);
                if (!this.Initialized || this.emI == null) break;
                this.emI.a(cbx.a.ekM);
                ((cyu)this.emI).cg((cxc)((Object)this));
                if (cxi.fl(f3)) {
                    if (cxd.xH((int)this.zg())) {
                        this.a(mcs.uyB.bD(this.Bu()));
                        break;
                    }
                    this.a(mcs.uyA.bD(this.Bu()));
                    break;
                }
                if (!cxi.D(f2, f3)) break;
                this.a(mcs.uyz.bD(this.Bu()));
                break;
            }
            default: {
                lfn.b(5, "SFClientSkill", "handlePropertyUpdate() Invalid PropertyID provided: " + uk2.Uo);
                return;
            }
        }
    }

    private void c(uk[] ukArray) {
        int n2 = ukArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (ukArray[i2] != null) {
                this.a(ukArray[i2]);
                continue;
            }
            lfn.b(5, "SFClientSkill", "handleSubscriptionEvent() GUID=" + this.GUID + " PropertyUpdate " + i2 + " is null.");
            assert (false);
        }
    }

    private void c(cwx.a a2) {
        switch (a2) {
            case fGw: 
            case fGx: 
            case fGv: {
                break;
            }
            default: {
                lfn.b(5, "SFClientSkill", "sendSkillStateChangeMessage() Message sent while in unhandled state: " + (Object)((Object)a2));
                assert (false);
                break;
            }
        }
        gju gju2 = (gju)this.MessageDelegator.h(4620, this.GUID, this.aJX().bhb());
        gju2.SkillType = this.SkillType;
        gju2.aYH = this.aYH;
        gju2.jjs = a2.ordinal();
        if (a2 == cwx.a.fGw) {
            double d2 = this.aJX().bhg();
            gju2.fGl = d2 == 0.0 ? 0.0f : (float)(this.MessageDelegator.arc().rgz - d2);
            this.aJX().bH(0.0);
            gju2.eTM = this.eTM;
        }
        if (this.fWZ == cxd.d.fQH && a2 == cwx.a.fGw) {
            ljq ljq2 = null;
            lgl lgl2 = null;
            if (this.emI.bgQ().aJD().aEP().Uv()) {
                cef cef2 = (cef)((Object)this.emI.bgQ().aJM());
                assert (cef2.Wm() != null);
                ljq2 = cef2.Wm().aAG().av();
                assert (ljq2 != null);
                ljq2.es(new ljq(0.0f, 0.5f, 0.0f));
                lgl2 = this.emI.bgQ().aAG().aw();
                assert (lgl2 != null);
            } else {
                boolean bl = this instanceof cxq && !(this instanceof cxr) || this instanceof cxp;
                boolean bl2 = bum.ayn();
                if (bl) {
                    bum.el(false);
                }
                ljq2 = this.emI.yS(this.SkillType);
                lgl2 = bum.jN(this.emI.bgQ().getGUID());
                assert (lgl2 != null);
                if (bl) {
                    bum.el(bl2);
                }
            }
            gju2.gcx = true;
            gju2.Position = ljq2;
            gju2.Rotation = lgl2;
            gju2.QM = this.MessageDelegator.arc().rgz;
            gju2.dOf = bum.ayo();
            if (lea.acr(this.zg()) && bum.ayn()) {
                boolean bl = bum.ayn();
                bum.el(false);
                gju2.Position = this.emI.yS(this.zg());
                bum.el(bl);
                kji kji2 = (kji)this.MessageDelegator.h(2818);
                kji2.ts(this.GUID);
                kji2.Yg(2);
                kji2.Yh(4);
                kji2.wS(true);
                kji2.wT(true);
                kji2.ca(bum.getCameraPosition());
                kji2.cq(new ljq(0.0f, 0.0f, 1.0f));
                kji2.setLength(200.0f);
                dld dld2 = (dld)this.MessageDelegator.bzx().bzt().d(lcr.rg);
                if (dld2 != null) {
                    kji2.a(dld2.aw());
                } else {
                    kji2.a(lgl2);
                }
                kji2.wU(true);
                kji2.wD(true);
                kji2.jM(true);
                this.MessageDelegator.a(kji2);
                this.fXe = gju2;
                return;
            }
        }
        this.MessageDelegator.E(gju2);
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 4866) {
            akt akt2;
            kuj kuj2 = (kuj)ktv2;
            if (this.fXe != null) {
                ljq ljq2 = null;
                Float f2 = null;
                for (int i2 = 0; i2 < kuj2.jnv.length; ++i2) {
                    if (kuj2.jnv[i2].equals(this.aJz().bgQ().KY()) || f2 != null && !(kuj2.pJh[i2] < f2.floatValue())) continue;
                    ljq2 = kuj2.ilP[i2];
                    f2 = Float.valueOf(kuj2.pJh[i2]);
                }
                if (ljq2 == null) {
                    dld dld2 = (dld)this.MessageDelegator.bzx().bzt().d(lcr.rg);
                    ljq2 = bum.getCameraPosition();
                    ljq ljq3 = null;
                    ljq3 = dld2 != null ? dld2.aw().eq(new ljq(0.0f, 0.0f, 1.0f)) : this.fXe.Rotation.eq(new ljq(0.0f, 0.0f, 1.0f));
                    ljq3.nm(80.0f);
                    ljq2.es(ljq3);
                }
                if (this.zg() != cxd.fHN) {
                    this.fXe.Position.y -= 0.4f;
                }
                ljq2.et(this.fXe.Position);
                this.fXe.Rotation = lgl.q(new ljq(0.0f, 0.0f, 1.0f), ljq2);
                this.MessageDelegator.F(this.fXe);
            } else if (this.bev() && (akt2 = this.bfY()) != null && akt2.a(kuj2)) {
                return;
            }
            return;
        }
        super.receiveResponse(ktv2);
    }

    private void bgb() {
        gjv gjv2 = (gjv)this.MessageDelegator.h(4618, this.GUID, this.aJX().bhb());
        gjv2.SkillType = this.SkillType;
        gjv2.aYH = this.aYH;
        gjv2.jju = true;
        gjv2.jjt = false;
        this.MessageDelegator.E(gjv2);
    }

    private void if(int n2) {
        assert (n2 > 0);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.setSpecialEffectType(n2);
        glh2.setTargetObjectGUID(this.emI.bgQ().aAG().getGUID());
        glh2.setTargetPosition(this.emI.bgQ().aAG().av());
        this.MessageDelegator.E(glh2);
    }
}

