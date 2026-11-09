/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  cxg
 *  ha
 *  lcr
 *  lcw
 */
public class czj
extends czc
implements dbl {
    private boolean gab = false;
    protected czb[] gac = null;
    protected ddj gad = null;
    protected int gae = 0;
    private boolean gaf = false;
    protected boolean gag = false;
    private boolean gah = false;
    private boolean gai = false;
    private int gaj = -1;

    public final boolean bhK() {
        return this.gab;
    }

    public final void ht(boolean bl) {
        this.gab = bl;
    }

    public final czb[] bhL() {
        return this.gac;
    }

    public final void a(czb[] czbArray) {
        this.gac = czbArray;
        for (czb czb2 : czbArray) {
            if (!(czb2 instanceof daq)) continue;
            ((daq)czb2).b(this);
        }
    }

    public final ddj bhM() {
        return this.gad;
    }

    public final void a(ddj ddj2) {
        this.gad = ddj2;
    }

    public final int bhN() {
        return this.gae;
    }

    public final void cleanUp() {
        super.cleanUp();
        if (this.gac == null) {
            return;
        }
        int n2 = this.gac.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.MessageDelegator.hd(this.gac[i2].getGUID());
        }
    }

    public final boolean mb(ldv ldv2) {
        if (this.GUID.equals(ldv2)) {
            return true;
        }
        if (this.gac != null) {
            int n2 = this.gac.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!this.gac[i2].mb(ldv2)) continue;
                return true;
            }
        }
        return false;
    }

    public void initialize() {
        super.initialize();
        if (this.gac == null) {
            lfn.b(5, "SFContainerSkill", "initialize() Skill '" + this.getName() + "' has no subskills.");
            assert (false);
            return;
        }
        int n2 = this.gac.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.gac[i2].setGUID(this.MessageDelegator.bzv());
            this.gac[i2].a(this.aJz(), false);
            this.MessageDelegator.a((amf)((Object)this.gac[i2]));
        }
    }

    @Override
    public final void zk(int n2) {
        assert (this.gad != null);
        this.gaf = false;
        this.gah = true;
        this.bhO();
        if (!this.gad.bkc()) {
            daz daz2 = this.jk().bhk();
            daz2.zy(this.SkillType);
            daz2.zx(this.SkillType);
        }
        this.emI.bgQ().pe(n2);
        if (aqN.isDescendant(this.SkillType, cxd.fIk)) {
            this.emI.bgQ().aJK();
        }
        if (this.bev() && this.beY()) {
            if (this.gai) {
                this.a(cwx.a.fGx);
            } else {
                this.beQ();
            }
        }
    }

    @Override
    public final void a(ddu[] dduArray) {
        int n2;
        assert (this.fGi == null);
        assert (this.gad != null);
        if (dduArray == null) {
            lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() TargetObjectInfo array is null.");
            return;
        }
        if (cxd.xC((int)this.SkillType) && (n2 = this.jk().a(this, dduArray[0].aYH)) != 0) {
            this.zk(dduArray[0].aYH);
            return;
        }
        this.gaf = false;
        this.gah = true;
        int n3 = dduArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            if (dduArray[n2].dtj == null) {
                lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() PhysicalObjectGUID " + n2 + " is null.");
                return;
            }
            if (dduArray[n2].Ui == null) {
                lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() MeshObjectGUID " + n2 + " is null.");
                return;
            }
            if (dduArray[n2].ResourceType <= 0) {
                lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() ResourceType " + n2 + " is invalid.");
                return;
            }
            if (dduArray[n2].dph == null) {
                lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() ObjectPosition " + n2 + " is null.");
                return;
            }
            if (dduArray[n2].dur == null) {
                lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() HitLocationType " + n2 + " is null.");
                return;
            }
            if (dduArray[n2].aYH <= 0) {
                lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() SessionID " + n2 + " is invalid.");
                return;
            }
            if (!this.a(dduArray[n2].ResourceType, dduArray[n2])) continue;
            if (this.fGi == null) {
                float f2;
                assert (!this.gaf);
                this.gaf = true;
                this.fGi = this.c(dduArray[n2].aYH, dduArray[n2].dtj, dduArray[n2].dph, dduArray[n2].ResourceType);
                if (this.fGi == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() SubSkillParams could not be created.");
                    assert (false);
                    return;
                }
                if (cxd.xD((int)this.SkillType) && (f2 = this.bF(dduArray[n2].aYH, dduArray[n2].ResourceType)) > 0.0f) {
                    this.fGi.Magnitude += f2;
                }
                this.fGi.gdY = null;
                this.fGi.dsL = dduArray[n2].Ui;
                this.fGi.aZD = dduArray[n2].dph;
                this.fGi.dur = dduArray[n2].dur;
                this.fGi.dus = dduArray[n2].dus;
                if (dduArray[n2].duq >= 0.0f) {
                    this.fGi.duq = dduArray[n2].duq;
                }
                if (dduArray[n2].biu >= 0.0f) {
                    this.fGi.biu = dduArray[n2].biu;
                }
                if (this.fGi.dur == null) {
                    this.fGi.dur = cxd.f.fQX;
                    lfn.b(5, this.getClass().getSimpleName(), "notifyTargetObjectsFound() '" + this.getName() + "' was provided null hitlocationtype.");
                    assert (false);
                }
                if (this.emI.bgQ() instanceof cex) {
                    cex cex2 = (cex)this.emI.bgQ();
                    cex2.aMy().a(this, this.fGi.aYH, this.fGi.akX, this.fGi.dhr);
                }
            } else {
                this.fGi.akX = dduArray[n2].dtj;
                this.fGi.gdY = null;
                this.fGi.dsL = dduArray[n2].Ui;
                this.fGi.dhr = dduArray[n2].ResourceType;
                this.fGi.aZD = dduArray[n2].dph;
                this.fGi.dur = dduArray[n2].dur;
                this.fGi.dus = dduArray[n2].dus;
            }
            if (dduArray[n2].biq > 0) {
                this.fGi.biq = dduArray[n2].biq;
            }
            this.b(dduArray[n2]);
            if (this.gad.bkc()) continue;
            daz daz2 = this.jk().bhk();
            daz2.c(this.SkillType, dduArray[n2]);
        }
        if (this.gaf) {
            if (!this.gad.bkc()) {
                daz daz3 = this.jk().bhk();
                daz3.zx(this.SkillType);
            }
            this.fGi = null;
            if (this.gad.bkc()) {
                if (dduArray[0].geu) {
                    this.emI.bgQ().pe(dduArray[0].aYH);
                }
            } else {
                this.emI.bgQ().pe(dduArray[0].aYH);
            }
            if (this.gai) {
                this.a(cwx.a.fGx);
            }
        } else {
            assert (dduArray.length > 0);
            assert (dduArray[0] != null);
            this.zk(dduArray[0].aYH);
        }
    }

    @Override
    protected final boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && this.beY() && this.bhP() && !this.gah) {
            this.gai = true;
            return true;
        }
        return super.b(a2, a3);
    }

    protected void c(ddc ddc2) {
        ddc2.aYF = this.emI.bgQ().getGUID();
        ddc2.gdZ = this.emI.bgQ().getObjectType();
        ddc2.aYC = this.SkillType;
        ddc2.Magnitude = this.zg() == cxd.fHy || this.zg() == cxd.fJB ? 0.0f : cxg.d((cxc)((Object)this), (int)this.gaj);
        ddc2.doT = 0.0f;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czj czj2 = (czj)((Object)cxc2);
        czj2.ht(this.gab);
        czj2.zl(this.gaj);
        if (this.gac != null) {
            czb[] czbArray = new czb[this.gac.length];
            int n2 = this.gac.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                czbArray[i2] = (czb)((Object)this.gac[i2].bfv());
                czbArray[i2].hl(true);
            }
            czj2.a(czbArray);
        }
        if (this.gad != null) {
            czj2.a(this.gad.bka());
        }
    }

    protected final void beA() {
        assert (!this.fGZ);
        if (cxd.xy((int)this.SkillType)) {
            this.emI.bgQ().aD(this.SkillType, this.aYH);
        }
        if (this.bhP()) {
            this.bhJ();
        } else {
            ldv ldv2 = this.emI.bgQ().getGUID();
            ldv ldv3 = this.emI.bgQ().aAG().axa();
            ldv ldv4 = this.emI.bgQ().aAG().getGUID();
            int n2 = this.emI.bgQ().az();
            ljq ljq2 = this.emI.yS(this.SkillType);
            boolean bl = true;
            if (this.gad != null && (this.gad instanceof dds || this.gad instanceof ddn)) {
                assert (this.fGh.dsL != null);
                assert (this.fGh.akX != null);
                assert (this.fGh.dhr > 0);
                assert (this.fGh.aZD != null);
                ldv2 = this.fGh.akX;
                ldv3 = null;
                ldv4 = this.fGh.dsL;
                n2 = this.fGh.dhr;
                ljq2 = this.fGh.aZD;
                if (!ldv2.equals(this.emI.bgQ().getGUID())) {
                    bl = false;
                }
            }
            this.fGi = this.c(this.aYH, ldv2, ljq2, n2);
            if (this.fGi == null) {
                lfn.b(5, "SFContainerSkill", "doAction() SubSkillParameters could not be created.");
                return;
            }
            this.fGi.gdY = ldv3;
            this.fGi.dsL = ldv4;
            this.fGi.aZD = ljq2;
            this.fGi.dur = cxd.f.fQW;
            this.fGi.dus = 0.0f;
            if (this.emI.bgQ() instanceof cex) {
                cex cex2 = (cex)this.emI.bgQ();
                ha ha2 = cex2.mA();
                if (ha2 != null) {
                    fte fte2 = (fte)ha2.getMessageDelegator().h(30209, ha2.getGUID(), ha2.getGUID());
                    fte2.SkillType = this.SkillType;
                    fte2.ResourceType = this.fGi.dhr;
                    fte2.Position = this.fGi.aZD;
                    ha2.getMessageDelegator().I(fte2);
                }
                if (bl) {
                    cex2.aMy().a(this, cex2.getGUID());
                } else {
                    cex2.aMy().a(this, this.fGi.aYH, this.fGi.akX, this.fGi.dhr);
                }
            }
            this.a(cxd.p.fSm, this.fGi);
            this.a(cxd.p.fSl, this.fGi);
            this.d(this.fGi);
            if (cxd.xy((int)this.SkillType)) {
                this.emI.bgQ().pe(this.aYH);
            }
        }
    }

    @Override
    protected void a(czc.a a2) {
        assert (!this.fGZ);
        if (a2 == czc.a.fZG) {
            this.emI.bgQ().aD(this.SkillType, this.aYH);
            if (this.bhP()) {
                this.bhJ();
            } else {
                ldv ldv2 = this.emI.bgQ().getGUID();
                ldv ldv3 = this.emI.bgQ().aAG().axa();
                ldv ldv4 = this.emI.bgQ().aAG().getGUID();
                int n2 = this.emI.bgQ().az();
                ljq ljq2 = this.emI.yS(this.SkillType);
                boolean bl = true;
                if (this.gad != null && (this.gad instanceof dds || this.gad instanceof ddn)) {
                    assert (this.fGh.dsL != null);
                    assert (this.fGh.akX != null);
                    assert (this.fGh.dhr > 0);
                    assert (this.fGh.aZD != null);
                    ldv2 = this.fGh.akX;
                    ldv3 = null;
                    ldv4 = this.fGh.dsL;
                    n2 = this.fGh.dhr;
                    ljq2 = this.fGh.aZD;
                    if (!ldv2.equals(this.emI.bgQ().getGUID())) {
                        bl = false;
                    }
                }
                this.fGi = this.c(this.aYH, ldv2, ljq2, n2);
                if (this.fGi == null) {
                    lfn.b(5, "SFContainerSkill", "doPerform() SubSkillParameters could not be created.");
                    return;
                }
                this.fGi.gdY = ldv3;
                this.fGi.dsL = ldv4;
                this.fGi.aZD = ljq2;
                this.fGi.dur = cxd.f.fQW;
                this.fGi.dus = 0.0f;
                this.fGi.biu = this.getPower();
                if (this.emI.bgQ() instanceof cex) {
                    cex cex2 = (cex)this.emI.bgQ();
                    ha ha2 = cex2.mA();
                    if (ha2 != null) {
                        fte fte2 = (fte)ha2.getMessageDelegator().h(30209, ha2.getGUID(), ha2.getGUID());
                        fte2.SkillType = this.SkillType;
                        fte2.ResourceType = this.fGi.dhr;
                        fte2.Position = this.fGi.aZD;
                        ha2.getMessageDelegator().I(fte2);
                    }
                    if (bl) {
                        cex2.aMy().a(this, cex2.getGUID());
                    } else {
                        cex2.aMy().a(this, this.fGi.aYH, this.fGi.akX, this.fGi.dhr);
                    }
                }
                this.a(cxd.p.fSm, this.fGi);
                this.a(cxd.p.fSl, this.fGi);
                this.d(this.fGi);
                if (cxd.xy((int)this.SkillType)) {
                    this.emI.bgQ().pe(this.aYH);
                }
            }
        } else if (a2 == czc.a.fZI) {
            this.hu(false);
        }
    }

    protected void bhJ() {
        dbw[] dbwArray;
        daz daz2 = this.jk().bhk();
        if (this.fGh.gcx) {
            assert (this.fGh.dph != null);
            assert (this.fGh.dpi != null);
            daz2.a(this, this.gad, this.fGh.dph, this.fGh.dpi, true);
        } else {
            dbwArray = this.emI.bgQ().aAG().av();
            lgl lgl2 = this.emI.bgQ().aAG().aw();
            daz2.a(this, this.gad, (ljq)dbwArray, lgl2, false);
        }
        if (this.e(cxd.p.fSf) != null) {
            int n2;
            dbwArray = this.bgi();
            if (dbwArray != null) {
                n2 = dbwArray.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (!(dbwArray[i2] instanceof dbk)) continue;
                    daz2.a((dbk)((Object)dbwArray[i2]));
                }
            }
            if (this.fGe != null) {
                n2 = this.fGe.length;
                for (int i3 = 0; i3 < n2; ++i3) {
                    if (!(this.fGe[i3] instanceof dbk)) continue;
                    daz2.a((dbk)((Object)this.fGe[i3]));
                }
            }
        }
    }

    protected final ldv[] aCx() {
        assert (this.emI.bgQ().isServerObject());
        if (lcw.enb()) {
            ldv ldv2 = this.emI.bgQ().aAG().getGUID();
            if (lcw.qGV) {
                ldv[] ldvArray = new ldv[]{this.emI.bgQ().aAG().axa(), lcr.ak((ldv)ldv2, (int)this.jk().jr()), lcr.ak((ldv)ldv2, (int)7000)};
                return ldvArray;
            }
            ldv[] ldvArray = new ldv[]{this.emI.bgQ().aAG().axa(), lcr.ak((ldv)ldv2, (int)this.jk().jr())};
            return ldvArray;
        }
        ldv[] ldvArray = new ldv[]{this.emI.bgQ().aAG().axa()};
        return ldvArray;
    }

    @Override
    protected final void bgj() {
        this.hu(true);
    }

    @Override
    protected void beO() {
        boolean bl = this.emI.bgQ().aJD().aEP().isAlive();
        this.hu(!bl);
        super.beO();
    }

    protected void bhy() {
    }

    protected boolean bhz() {
        return false;
    }

    protected boolean e(czb czb2) {
        aja[] ajaArray = czb2.bhp();
        if (ajaArray == null) {
            return true;
        }
        for (aja aja2 : ajaArray) {
            if (aja2.Ct()) continue;
            return false;
        }
        return true;
    }

    @Override
    protected void bex() {
        super.bex();
        for (czb czb2 : this.gac) {
            aja[] ajaArray = czb2.bhp();
            if (ajaArray == null) continue;
            int n2 = ajaArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                ajaArray[i2].reset();
            }
        }
        this.gaf = false;
        this.gag = false;
        this.gah = false;
        this.gai = false;
    }

    private ddc c(int n2, ldv ldv2, ljq ljq2, int n3) {
        assert (n2 > 0);
        assert (ldv2 != null);
        assert (ljq2 != null);
        assert (n3 > 0);
        this.gae = n2;
        ddc ddc2 = new ddc();
        ddc2.aYH = n2;
        ddc2.akX = ldv2;
        ddc2.aZD = ljq2;
        ddc2.dhr = n3;
        ddc2.dup = this.emI.bgQ().aIq();
        ddc2.biu = this.getPower();
        this.c(ddc2);
        this.gae = 0;
        return ddc2;
    }

    private float bF(int n2, int n3) {
        assert (n2 > 0);
        ddy ddy2 = this.emI.bgQ().pd(this.gae);
        if (ddy2 == null) {
            lfn.b(5, "SFContainerSkill", "getEnchantmentMagnitudeModifier() No weaponinfocache mapped to sessionID " + this.aYH + " for skill '" + this.getName() + "'");
            return 0.0f;
        }
        if (cug.uy((int)ddy2.aRX)) {
            return ddy2.zL(n3);
        }
        return 0.0f;
    }

    private void b(ddu ddu2) {
        assert (!this.fGZ);
        assert (this.fGi != null);
        assert (this.gad != null);
        assert (ddu2.Ui != null);
        assert (ddu2.ResourceType >= 0);
        assert (ddu2.dph != null);
        assert (ddu2.dur != null);
        ha ha2 = this.emI.bgQ().mA();
        if (ha2 != null) {
            fte fte2 = (fte)this.MessageDelegator.h(30209, ha2.getGUID(), ha2.getGUID());
            fte2.SkillType = this.SkillType;
            fte2.ResourceType = this.fGi.dhr;
            fte2.Position = this.fGi.aZD;
            this.MessageDelegator.I(fte2);
            this.b(cxd.p.fSe);
        }
        if (ddu2.dtj != null) {
            this.a(cxd.p.fSm, this.fGi);
            this.a(cxd.p.fSl, this.fGi);
            if (this.bhz()) {
                this.bhy();
            } else {
                this.d(this.fGi);
            }
        } else {
            this.a(cxd.p.fSl, this.fGi);
        }
    }

    private void bhO() {
        assert (!this.fGZ);
        assert (this.fGi == null);
        assert (this.gad != null);
        this.b(cxd.p.fSn);
    }

    private boolean bhP() {
        return this.gad != null && !(this.gad instanceof dds) && !(this.gad instanceof ddn);
    }

    private boolean a(int n2, ddu ddu2) {
        assert (this.gad != null);
        assert (this.gad.bqK > 0);
        ddi ddi2 = cxj.yt(this.gad.bqK);
        if (ddi2 == null) {
            lfn.b(5, "SFContainerSkill", "isValidTarget() Could not find targetgroup " + this.gad.bqK);
            return false;
        }
        if (lea.enW().isDescendant(n2, cug.fkz) || lea.enW().isDescendant(n2, cug.fkv)) {
            this.c(ddu2);
            return false;
        }
        return ddi2.zJ(n2);
    }

    private void c(ddu ddu2) {
        if (this.emI.bgQ() instanceof cex) {
            lgv[] lgvArray;
            Object object;
            cex cex2 = (cex)this.emI.bgQ();
            ha ha2 = cex2.mA();
            if (ha2 != null) {
                object = (fte)ha2.getMessageDelegator().h(30209, ha2.getGUID(), ha2.getGUID());
                ((fte)object).SkillType = this.SkillType;
                ((fte)object).ResourceType = ddu2.ResourceType;
                ((fte)object).Position = ddu2.dph;
                ha2.getMessageDelegator().I((dxq)object);
            }
            if ((lgvArray = (object = lea.eop()).get(bfk.dgk)) != null) {
                int n2 = lgvArray.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (!ResourceTree.isDescendant(ddu2.ResourceType, lgvArray[i2].ResourceType) || lgvArray[i2].bnM != 2656) continue;
                    assert (lgvArray[i2].bsH != null);
                    int[] nArray = lgvArray[i2].bsH;
                    for (int i3 = 0; i3 < nArray.length; ++i3) {
                        this.b(nArray[i3], ddu2);
                    }
                }
            }
        }
    }

    private void b(int n2, ddu ddu2) {
        assert (n2 > 0);
        ldv ldv2 = lcr.qEa;
        if (this.bfF()) {
            ldv2 = lcr.qEb;
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, ldv2);
        glh2.SpecialEffectType = n2;
        glh2.akX = ddu2.Ui;
        glh2.aZD = ddu2.dph;
        glh2.jkS = 32;
        this.MessageDelegator.F(glh2);
    }

    protected void d(ddc ddc2) {
        assert (this.gac != null);
        if (ddc2 == null) {
            lfn.b(5, "SFContainerSkill", "startSubSkills() SubSkillParameters is null.");
            return;
        }
        int n2 = 0;
        int n3 = this.gac.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            if (!this.e(this.gac[i2])) continue;
            if (this.gac[i2] instanceof daq) {
                daq daq2 = (daq)this.gac[i2];
                float f2 = this.xn(daq2.bhY());
                if (f2 <= 0.0f && f2 != -2.0f && f2 != -3.0f) {
                    lfn.b(5, "SFContainerSkill", "startSubSkills() Computed duration is invalid for subskill '" + this.gac[i2].getName() + "'");
                    continue;
                }
                ddc2.doT = f2;
            } else {
                ddc2.doT = 0.0f;
            }
            n2 = this.gac[i2].DB();
            int n5 = n4 = this.bhM() != null ? this.bhM().bqK : 0;
            if (n4 > 0) {
                if (n2 > 0) {
                    if (n2 != n4) {
                        // empty if block
                    }
                } else {
                    n2 = n4;
                }
            }
            if (((Object)((Object)this.gac[i2])).getClass().equals(daq.class) || ((Object)((Object)this.gac[i2])).getClass().equals(dat.class) || ((Object)((Object)this.gac[i2])).getClass().equals(das.class)) {
                ddi ddi2 = cxj.yt(n2);
                if (ddi2 == null) {
                    lfn.b(5, "SFModificationSkill", "getTargetGroup() Could not find targetgroup " + n4);
                    continue;
                }
                if (!ddi2.zJ(this.fGi.dhr)) continue;
            }
            if (ddc2.akX != null) {
                if (ddc2.dur == null) {
                    ddc2.dur = cxd.f.fQX;
                    lfn.b(5, "SFContainerSkill", "startSubSkills() HitLocationType is null for skill '" + this.getName() + "'");
                    assert (false) : "Notify Chris about this assert!";
                }
                if (this.beY()) {
                    this.gac[i2].a(ddc2);
                    continue;
                }
                this.gac[i2].b(ddc2);
                continue;
            }
            lfn.b(5, "SFContainerSkill", "startSubSkills() No targetobject provided in skill '" + this.getName() + "'");
            return;
        }
        if (!cxd.xy((int)this.SkillType) || cxd.xG((int)this.SkillType)) {
            // empty if block
        }
        if (this.beY()) {
            this.gag = true;
        }
    }

    private void hu(boolean bl) {
        assert (this.gac != null);
        if (this.gag) {
            int n2 = this.gac.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.gac[i2].hk(bl);
            }
        }
    }

    protected final bwo bhQ() {
        int n2 = this.bhR();
        if (n2 <= 0) {
            lfn.b(5, "SFContainerSkill", "getMissileInfo() MissileResourceType is invalid.");
            return null;
        }
        bwp bwp2 = new bwp(this.SkillType, n2);
        return lea.eoi().get(bwp2);
    }

    protected int bhR() {
        if (this.fGe == null) {
            lfn.b(5, "SFContainerSkill", "findMissileResourceType() No constraints defined for skill '" + this.getName() + "'");
            return -1;
        }
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            akc akc2;
            if (!(this.fGe[i2] instanceof akc) || (akc2 = (akc)this.fGe[i2]).Dc() == null) continue;
            bsa bsa2 = akc2.Dc();
            if (ResourceTree.isDescendant(akc2.az(), cug.fjj)) {
                assert (bsa2.avX() != null);
                assert (bsa2.avX().length == 1);
                if (this.getName().toLowerCase().startsWith("s_natural archery")) {
                    return bsa2.avX()[0].ResourceType;
                }
                return akc2.az();
            }
            if (!ResourceTree.isDescendant(bsa2.az(), cug.fiK)) continue;
            assert (bsa2.avX() != null);
            assert (bsa2.avX().length == 1);
            return bsa2.avX()[0].ResourceType;
        }
        lfn.b(5, "SFContainerSkill", "findMissileResourceType() Could not find ammunition resourcetype for skill '" + this.getName() + "'");
        return -1;
    }

    protected final float bhS() {
        if (!cxg.bp((int)0, (int)519)) {
            lfn.b(5, "SFContainerMeleeSkill", "performThreatCheck() SkillFunction '" + cxh.fH(519) + "' was not defined.");
            return 0.0f;
        }
        if (!cxd.xy((int)this.zg())) {
            return 0.0f;
        }
        return cxg.d((cxc)((Object)this), (int)519);
    }

    public final int bhT() {
        return this.gaj;
    }

    public final void zl(int n2) {
        this.gaj = n2;
    }
}

