/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cbx
 *  cug
 *  lcr
 *  lcw
 */
import java.util.Map;

public class cei
extends cea {
    private static final boolean bC = false;
    private String epg = "human_f_hands.xml";
    public final int[] eph = new int[]{0, 0, 130, 139, 148};
    public final int[] epi = new int[]{0, 0, 130, 139, 148};
    public final int[] epj = new int[]{0, 0, 131, 133, 150};
    public final int[] epk = new int[]{0, 0, 128, 137, 146};
    public final int[] epl = new int[]{0, 0, 129, 138, 147};
    public final int[] epm = new int[]{0, 0, 153, 152, 151};
    public final int[] epn = new int[]{0, 0, 127, 136, 145};
    private boolean epo = false;
    private ldv epp;
    private ldv epq;
    private ljq epr = new ljq(-0.015f, -0.28f, -0.06f);
    private ljq eps = new ljq((double)-0.21f, 0.0, 0.0);
    private boolean ept = false;
    private boolean epu = false;
    private boolean epv = false;
    private boolean epw = false;
    private a epx;
    private a epy;
    private boolean epz = false;
    private b epA = b.eqg;
    private double epB = 0.0;
    private double epC = 0.0;
    private double epD = 0.0;
    private double epE = 0.0;
    private final double epF = 0.5;
    private boolean fE = true;
    private int epG = 10;
    private boolean epH = false;
    private final boolean epI = false;
    private Map<String, eh> epJ = null;
    bvf epK = null;
    private final double epL = 60.0;
    private double epM = 0.0;
    private double epN;
    private boolean epO;
    private int dRh;
    private int dXk;
    public static boolean epP;
    private boolean c = false;
    private double epQ = 0.0;
    private double epR = 1.0;
    private boolean epS = false;
    private kps epT = null;
    private float epU = 0.0f;

    @Override
    public void initialize() {
        this.epQ = this.MessageDelegator.arc().rgz;
        if (!this.Initialized) {
            super.initialize();
            this.epJ = ei.ao("animations/" + this.epg);
            assert (this.epJ != null);
            this.Initialized = true;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        assert (this.Initialized);
        if (this.c && ldz2.rgz > this.epQ + this.epR) {
            lfn.b(0, "SFFirstPersonViewManager", "doTick() HandsMesh = " + this.epg);
            this.epQ = ldz2.rgz;
        }
        if (epP) {
            epP = false;
            if (this.epz) {
                this.aFl();
            }
        }
        if (this.fE) {
            --this.epG;
            if (this.epG > 0) {
                return;
            }
            this.aLn();
            this.fE = false;
        } else {
            this.aLi();
        }
        if (this.epz && this.epO) {
            if (this.epM == 0.0) {
                this.epM = 60.0 + 60.0 * Math.random();
            }
            if (ldz2.rgz > this.epN + this.epM) {
                this.epN = ldz2.rgz;
            }
        }
        if (this.epu && this.b(this.epx)) {
            this.epu = false;
        }
        if (this.epv && this.b(this.epy)) {
            this.epv = false;
        }
        if (this.epw) {
            this.aLl();
        }
        if (this.epB != 0.0 && ldz2.rgz >= this.epB) {
            this.epB = 0.0;
            this.b(this.epx);
        }
        if (this.epK == null) {
            this.epK = (bvf)this.MessageDelegator.d(this.epp);
            if (this.epK != null) {
                this.epK.et(false);
            }
        }
        if (this.epC != 0.0 && this.epC + this.epD <= ldz2.rgz) {
            this.epC = 0.0;
            switch (this.dRh) {
                case 2: 
                case 7: {
                    return;
                }
            }
            if (!this.epo) {
                int n;
                if (!this.epH) {
                    this.po(this.epi[this.epA.ordinal()]);
                } else if (this.epK != null && (n = this.eph[this.epA.ordinal()]) != 0) {
                    this.epK.ng(n);
                }
            }
        }
        if (this.epE != 0.0 && this.epE <= ldz2.rgz) {
            this.aLj();
            this.epE = 0.0;
        }
    }

    private void aLi() {
        if (this.epK == null) {
            return;
        }
        if (this.epK.axa() == null) {
            return;
        }
        if (this.eot == null) {
            return;
        }
        if (this.eot.aFh() == null) {
            return;
        }
        if (this.eot.aFh().aKu() == null) {
            return;
        }
        if (this.eot.aFh().aKu().aGq() == null) {
            return;
        }
        if (this.eot.aFh().aIj() == null) {
            return;
        }
        if (this.epT == null) {
            this.epT = (kps)this.MessageDelegator.h(3589);
        }
        float f2 = this.eot.aFh().aIj().al(352);
        float f3 = this.eot.aFh().aIj().ai(352);
        if (f2 == this.epU) {
            return;
        }
        this.epU = f2;
        float f4 = f2 / f3;
        if ((f4 = 1.0f - f4) > 1.0f) {
            f4 = 1.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        lcq lcq2 = this.eot.aFh().aKu().aGq();
        this.epT.ts(this.getGUID());
        this.epT.hC(this.epK.axa());
        this.epT.eA(0);
        this.epT.aan(0);
        this.epT.aam(40);
        ljr ljr2 = new ljr(lcq2.a, lcq2.r, lcq2.g, lcq2.b);
        ljr ljr3 = new ljr(f4, f4, 1.0f, 1.0f);
        this.epT.g(ljr2);
        this.epT.f(ljr3);
        this.MessageDelegator.a(this.epT);
    }

    public void pn(int n) {
        this.epg = cug.uK((int)n);
    }

    @Override
    public cea aKA() {
        cei cei2 = new cei();
        cei2.epg = this.epg;
        return cei2;
    }

    @Override
    public void cleanUp() {
        this.epE = 0.0;
        if (this.MessageDelegator != null) {
            if (this.epx != null) {
                this.c(this.epx);
                this.d(this.epx);
                this.epx = null;
            }
            if (this.epy != null) {
                this.c(this.epy);
                this.d(this.epy);
                this.epy = null;
            }
            if (this.epp != null) {
                this.MessageDelegator.hd(this.epp);
                if (this.epq != null) {
                    kmy kmy2 = (kmy)this.MessageDelegator.h(772);
                    kmy2.ts(this.GUID);
                    kmy2.Zk(2);
                    kmy2.setActive(false);
                    kmy2.setDeltaPos(new ljq());
                    kmy2.setDeltaRot(new lgl());
                    kmy2.qj(this.eou.getGUID());
                    kmy2.qk(this.epp);
                    kmy2.kX(this.epq);
                    this.MessageDelegator.a(kmy2);
                    this.epq = null;
                }
                this.epp = null;
            }
        }
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 6146: {
                this.e((gfn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void e(gfn gfn2) {
        cbx cbx2 = gfn2.dtF;
        this.MessageDelegator.a((amf)cbx2);
        this.epx.kB(cbx2.getGUID());
    }

    @Override
    public void aFl() {
        this.epz = false;
        this.epE = this.MessageDelegator.arc().rgz + 0.5;
        this.aLo();
        this.epA = b.eqg;
    }

    private void aLj() {
        this.epE = 0.0;
        if (this.MessageDelegator != null) {
            if (this.epx != null) {
                this.c(this.epx);
                this.d(this.epx);
                this.epx = null;
            }
            if (this.epy != null) {
                this.c(this.epy);
                this.d(this.epy);
                this.epy = null;
            }
            this.aLm();
            this.aLo();
            this.epA = b.eqg;
        }
    }

    @Override
    public void P(ldv ldv2, int n) {
        if (this.epE != 0.0) {
            this.epE = 0.0;
            this.aLj();
        }
        lgw lgw2 = (lgw)lea.enW().acv(n);
        String string = null;
        if (lgw2 != null && this.eot != null && this.MessageDelegator != null) {
            string = lgw2.bBt();
            if (string != null) {
                ddx ddx2 = this.eot.aFh().aJB();
                switch (ddx2.bki()) {
                    case MAGIC_STAFF: {
                        if (this.epx == null) {
                            eh eh2 = this.epJ.get("AttachPoint FP Hands Hum_f Staff");
                            assert (eh2 != null);
                            this.epx = new a(this);
                            this.epx.hb(eh2.getFrameName());
                            this.epx.kB(this.MessageDelegator.bzv());
                            this.epx.hc(string);
                            this.epx.bj(eh2.getRotation());
                            this.epx.bk(eh2.fb());
                            this.a(this.epx);
                            this.epu = true;
                            this.epA = b.eqi;
                            break;
                        }
                        lfn.b(5, this.getClass().getSimpleName(), "notifyViewModeChanged() : Cannot double-attach!");
                        break;
                    }
                    case BOW: {
                        if (this.epy != null) break;
                        eh eh3 = this.epJ.get("AttachPoint FP Hands Hum_f Bow");
                        assert (eh3 != null);
                        this.epy = new a(this);
                        this.epy.hb(eh3.getFrameName());
                        this.epy.kB(this.MessageDelegator.bzv());
                        this.epy.hc(string);
                        this.epy.bj(eh3.getRotation());
                        this.epy.bk(eh3.fb());
                        this.a(this.epy);
                        this.epv = true;
                        this.epA = b.eqh;
                        this.aLk();
                        this.a(this.epx, false);
                        break;
                    }
                    case THROWABLE_WEAPON: {
                        if (this.epx != null) break;
                        eh eh4 = this.epJ.get("AttachPoint FP Hands Hum_f Grenade");
                        assert (eh4 != null);
                        this.epx = new a(this);
                        this.epx.hb(eh4.getFrameName());
                        this.epx.kB(this.MessageDelegator.bzv());
                        this.epx.hc(string);
                        this.epx.bj(eh4.getRotation());
                        this.epx.bk(eh4.fb());
                        this.a(this.epx);
                        this.epu = true;
                        this.epA = b.eqj;
                        break;
                    }
                    case NATURAL_BOW: {
                        this.epA = b.eqh;
                        break;
                    }
                    case NATURAL_MAGIC_STAFF: {
                        this.epA = b.eqi;
                        break;
                    }
                    case NATURAL_MELEE: {
                        return;
                    }
                    default: {
                        return;
                    }
                }
                this.aLl();
                this.aLp();
            } else {
                String string2 = "MeshDescriptionFilename is null!";
                lfn.b(5, this.getClass().getSimpleName(), "createNewMeshForResource() : " + string2);
                assert (false) : string2;
            }
        } else {
            String string3 = "ResourceListItem is null!";
            lfn.b(5, this.getClass().getSimpleName(), "createNewMeshForResource() : " + string3 + ", ItemGUID = " + ldv2 + ", ItemResourceType = " + n);
        }
    }

    private void aLk() {
        if (this.epx != null) {
            return;
        }
        assert (this.epx == null) : "Right Hand resource is not null!";
        int n = cug.fjy;
        lgw lgw2 = (lgw)lea.enW().acv(n);
        if (lgw2 != null) {
            String string = lgw2.bBt();
            if (string != null) {
                eh eh2 = this.epJ.get("AttachPoint FP Hands Hum_f Arrow");
                assert (eh2 != null);
                this.epx = new a(this);
                this.epx.hb(eh2.getFrameName());
                this.epx.kB(this.MessageDelegator.bzv());
                this.epx.hc(string);
                this.epx.bj(eh2.getRotation());
                this.epx.bk(eh2.fb());
                this.a(this.epx);
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "notifyItemUnsheathed() : AmmoMeshDescriptionFilename is null!");
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "notifyItemUnsheathed() : Ammo ResourceListItem  = null, for AmmotResourceType = " + n);
        }
    }

    private void a(a a2) {
        bvd bvd2 = bvn.c(bve.a.dQD);
        bvd2.setGUID(a2.aLr());
        bvd2.setFileName(a2.aLv());
        this.MessageDelegator.a(bvd2);
        a2.eqd = bvd2;
    }

    @Override
    public void fo(boolean bl) {
        if (bl) {
            switch (this.epA) {
                case eqh: 
                case eqj: 
                case eqi: {
                    this.epz = true;
                    break;
                }
                default: {
                    lfn.b(0, "SFFirstPersonViewManager", "notifyViewModeChanged() Not changinh to TRUE. FP Mode = " + (Object)((Object)this.epA));
                    break;
                }
            }
        } else {
            this.epz = false;
        }
    }

    private boolean b(a a2) {
        boolean bl = false;
        if (a2 != null && !a2.aLt()) {
            a2.fO(this.kA(a2.aLr()));
            if (!a2.aLt()) {
                return bl;
            }
        }
        if (a2 != null && a2.aLr() != null && a2.aLs() == null) {
            a2.kC(this.MessageDelegator.bzv());
            knd knd2 = (knd)this.MessageDelegator.h(775);
            knd2.wD(true);
            knd2.Jd(1);
            knd2.aE(false);
            ljq ljq2 = a2.aLw();
            if (ljq2 == null) {
                ljq2 = new ljq();
            }
            knd2.ak(ljq2);
            ljq ljq3 = a2.aLx();
            if (ljq3 == null) {
                ljq3 = new ljq();
            }
            knd2.aj(ljq3);
            knd2.bM(new ljq(1.0f, 1.0f, 1.0f));
            knd2.setFrameName(a2.aLu());
            knd2.qj(this.epp);
            knd2.qk(a2.aLr());
            knd2.kX(a2.aLs());
            knd2.ts(this.GUID);
            this.MessageDelegator.a(knd2);
            bl = true;
        }
        return bl;
    }

    private void c(a a2) {
        if (a2 != null && a2.aLr() != null && a2.aLs() != null) {
            if (a2.aLs() != null) {
                knd knd2 = (knd)this.MessageDelegator.h(775);
                knd2.Jd(2);
                knd2.aE(false);
                knd2.ak(new ljq());
                knd2.aj(new ljq());
                knd2.setFrameName(a2.aLu());
                knd2.qj(this.epp);
                knd2.qk(a2.aLr());
                knd2.kX(a2.aLs());
                knd2.ts(this.GUID);
                knd2.jM(true);
                this.MessageDelegator.a(knd2);
                this.MessageDelegator.oa(a2.aLs());
                a2.kC(null);
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "unAttachItemFromHand() : Could not UnAttach. ResourceItemData = " + a2);
        }
    }

    private void a(a a2, boolean bl) {
        if (a2 != null && a2.aLr() != null && a2.aLs() != null && a2.aLs() != null) {
            bvd bvd2 = a2.eqd;
            bvd2.eq(bl);
        }
    }

    private void d(a a2) {
        this.MessageDelegator.hd(a2.aLr());
    }

    private void aLl() {
        if (!this.ept) {
            this.ept = this.kA(this.epp);
            if (!this.ept) {
                this.epw = true;
                return;
            }
            this.epw = false;
        }
        if (lcw.ena() || lcw.enb()) {
            if (this.eou != null && this.epp != null) {
                kmy kmy2 = (kmy)this.MessageDelegator.h(772);
                kmy2.ts(this.GUID);
                if (this.epq == null) {
                    kmy2.Zk(1);
                    this.epq = this.MessageDelegator.bzv();
                } else {
                    kmy2.Zk(28);
                }
                kmy2.setActive(true);
                kmy2.setDeltaPos(this.epr);
                kmy2.setDeltaRot(new lgl(this.eps));
                kmy2.qj(this.eou.getGUID());
                kmy2.qk(this.epp);
                kmy2.kX(this.epq);
                this.MessageDelegator.a(kmy2);
                this.fN(true);
            } else {
                lfn.b(4, this.getClass().getSimpleName(), "setupFirstPersonObjectsAndRelations() : CameraObject = " + this.eou + ", FirstPersonHandsAnimationGUID = " + this.epp);
            }
        } else {
            lfn.b(4, this.getClass().getSimpleName(), "setupFirstPersonObjectsAndRelations() : not Client Version");
        }
    }

    private void aLm() {
        if (!this.epz) {
            return;
        }
        if (this.ept && lcw.ena() || lcw.enb()) {
            if (this.epq != null && this.eou != null && this.epp != null) {
                kmy kmy2 = (kmy)this.MessageDelegator.h(772);
                kmy2.ts(this.GUID);
                kmy2.Zk(16);
                kmy2.setActive(false);
                kmy2.setDeltaPos(new ljq());
                kmy2.setDeltaRot(new lgl());
                kmy2.qj(this.eou.getGUID());
                kmy2.qk(this.epp);
                kmy2.kX(this.epq);
                this.MessageDelegator.a(kmy2);
                this.fN(false);
            } else {
                lfn.b(0, this.getClass().getSimpleName(), "removeFirstPersonObjectsAndRelations() : \nFirstPersonViewActive = " + this.epz + "\n\n");
                lfn.b(4, this.getClass().getSimpleName(), "removeFirstPersonObjectsAndRelations() : CameraToObjectRelationGUID = " + this.epq + ", CameraObject = " + this.eou + ", FirstPersonHandsAnimationGUID = " + this.epp);
            }
        } else {
            lfn.b(4, this.getClass().getSimpleName(), "removeFirstPersonObjectsAndRelations() : not Client Version");
        }
    }

    private void fN(boolean bl) {
        fua fua2 = (fua)this.MessageDelegator.h(1029, this.GUID, this.epp);
        fua2.HW(2);
        fua2.setVisible(bl);
        this.MessageDelegator.F(fua2);
    }

    private void aLn() {
        this.epp = this.MessageDelegator.bzv();
        fob fob2 = (fob)this.MessageDelegator.h(11521, this.GUID, lcr.qzt);
        fob2.cd("xml-files/object/animation/" + this.epg);
        fob2.pL(this.epp);
        fob2.li(true);
        fob2.setServerObject(false);
        if (this.eou != null) {
            fob2.c(this.eou.av());
        } else {
            lfn.b(4, "SFFirstPersonViewManager", "setupFirstPersonAnimations() No CameraObject Found!");
            fob2.c(new ljq());
        }
        fob2.setRotation(new ljq());
        fob2.d(bve.a.dQt);
        this.MessageDelegator.F(fob2);
    }

    @Override
    public void a(dbo dbo2, float f2) {
        this.epO = false;
        if (!this.epz) {
            return;
        }
        if (this.epA == b.eqg) {
            return;
        }
        switch (dbo2.aDI()) {
            case 983046: 
            case 983047: 
            case 983049: 
            case 983050: 
            case 983051: 
            case 983053: 
            case 983072: 
            case 983076: {
                break;
            }
            case 0x10000E: 
            case 0x10000F: 
            case 0x100012: 
            case 1048616: 
            case 1048617: 
            case 1048620: {
                break;
            }
            case 65539: 
            case 65540: 
            case 65566: {
                break;
            }
            case 167772277: {
                if (this.epx != null) {
                    this.epu = true;
                    this.a(this.epx, true);
                }
                this.s(dbo2.aDI(), f2);
                this.epH = true;
                break;
            }
            case 0x2000072: {
                this.s(dbo2.aDI(), f2);
                this.epH = true;
                break;
            }
            case 0x3000077: {
                this.s(dbo2.aDI(), f2);
                if (this.epx != null) {
                    this.c(this.epx);
                    if (this.epx != null) {
                        this.a(this.epx, false);
                    }
                }
                this.epH = false;
                break;
            }
            case 33554547: 
            case 33554548: 
            case 33554638: 
            case 33554639: 
            case 0x20000D0: 
            case 33554783: 
            case 33554784: 
            case 33554785: {
                this.s(dbo2.aDI(), f2);
                this.epH = false;
                break;
            }
            case 149: {
                this.s(dbo2.aDI(), f2);
                this.epH = false;
                break;
            }
            default: {
                lfn.b(4, this.getClass().getSimpleName(), "startSkillAnimation() : Unknown State = " + dbo2.aDI() + ", Name: " + dbo2.aDK());
                if (!this.epH) break;
                return;
            }
        }
    }

    @Override
    public void a(dbo dbo2) {
        switch (dbo2.aDI()) {
            case 0x2000072: 
            case 167772277: {
                this.epH = false;
                break;
            }
        }
        dzw dzw2 = (dzw)this.MessageDelegator.h(7426, this.GUID, this.epp);
        dzw2.ijH = dbo2.aDI();
        this.MessageDelegator.H(dzw2);
    }

    @Override
    public void pk(int n) {
        this.dXk = n;
        switch (this.dRh) {
            case 2: 
            case 7: {
                return;
            }
        }
        this.epO = false;
        int n2 = 0;
        if (this.dXk == 1) {
            this.epN = this.MessageDelegator.arc().rgz;
            this.epO = true;
            this.epM = 0.0;
            this.epo = false;
            this.epC = this.epN;
            if (this.epH) {
                if (this.epK != null) {
                    int n3 = this.eph[this.epA.ordinal()];
                    if (n3 != 0) {
                        this.epK.ng(n3);
                    }
                } else {
                    lfn.b(4, this.getClass().getSimpleName(), "startSkillAnimation() : HandsMesh is null!");
                }
            }
        } else if (this.dXk == 2) {
            if (this.epH) {
                if (this.epK != null) {
                    int n4 = this.epk[this.epA.ordinal()];
                    if (n4 != 0) {
                        this.epK.ng(n4);
                    }
                } else {
                    lfn.b(4, this.getClass().getSimpleName(), "startSkillAnimation() : HandsMesh is null!");
                }
                return;
            }
            if (this.epC == 0.0) {
                n2 = this.epk[this.epA.ordinal()];
            }
            this.epo = true;
        } else if (this.dXk == 3) {
            if (this.epH) {
                if (this.epK != null) {
                    int n5 = this.epl[this.epA.ordinal()];
                    if (n5 != 0) {
                        this.epK.ng(n5);
                    }
                } else {
                    lfn.b(4, this.getClass().getSimpleName(), "startSkillAnimation() : HandsMesh is null!");
                }
                return;
            }
            if (this.epC == 0.0) {
                n2 = this.epl[this.epA.ordinal()];
            }
            this.epo = true;
        } else if (this.dXk == 4) {
            if (this.epH) {
                if (this.epK != null) {
                    int n6 = this.epm[this.epA.ordinal()];
                    if (n6 != 0) {
                        this.epK.ng(n6);
                    }
                } else {
                    lfn.b(4, this.getClass().getSimpleName(), "startSkillAnimation() : HandsMesh is null!");
                }
                return;
            }
            if (this.epC == 0.0) {
                n2 = this.epm[this.epA.ordinal()];
            }
            this.epo = true;
        }
        if (n2 != 0 && !this.epH && this.epz) {
            this.po(n2);
        }
    }

    @Override
    public void oV(int n) {
        this.dRh = n;
        switch (this.dRh) {
            case 2: 
            case 7: {
                int n2;
                if (!this.epH) {
                    this.po(this.epn[this.epA.ordinal()]);
                    break;
                }
                if (this.epK == null || (n2 = this.epn[this.epA.ordinal()]) == 0) break;
                this.epK.ng(n2);
            }
        }
    }

    private void aLo() {
        if (this.MessageDelegator != null) {
            int n = 0;
            switch (this.epA) {
                case eqf: {
                    break;
                }
                case eqh: {
                    n = 127;
                    break;
                }
                case eqj: {
                    n = 145;
                    break;
                }
                case eqi: {
                    n = 136;
                    break;
                }
                case eqg: {
                    return;
                }
                default: {
                    assert (false);
                    break;
                }
            }
            this.po(n);
        }
    }

    private void aLp() {
        if (this.MessageDelegator == null) {
            return;
        }
        int n = 0;
        n = !this.epo ? this.epi[this.epA.ordinal()] : this.aLq();
        this.po(n);
    }

    private int aLq() {
        switch (this.dRh) {
            case 2: 
            case 7: {
                return this.epn[this.epA.ordinal()];
            }
        }
        switch (this.dXk) {
            case 1: {
                return this.epi[this.epA.ordinal()];
            }
            case 2: {
                return this.epk[this.epA.ordinal()];
            }
            case 3: 
            case 4: {
                return this.epl[this.epA.ordinal()];
            }
        }
        lfn.b(5, this.getClass().getSimpleName(), "getStateForMovementMode() : Invalid ModementMode = " + this.dXk);
        return 0;
    }

    private void po(int n) {
        this.s(n, 0.0f);
    }

    private void s(int n, float f2) {
        if (n == 0) {
            return;
        }
        if (this.MessageDelegator != null) {
            dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.epp);
            dzv2.dTs = n;
            dzv2.aWf = f2;
            this.MessageDelegator.H(dzv2);
        } else {
            lfn.b(5, "SFFirstPersonViewManager", "sendStartAnimationMessage() Cannot Start Animation. MessageDelegator is null!");
        }
    }

    private boolean kA(ldv ldv2) {
        boolean bl = false;
        bvd bvd2 = (bvd)this.MessageDelegator.d(ldv2);
        if (bvd2 != null && bvd2.isReadyToRun()) {
            bl = true;
        }
        return bl;
    }

    @Override
    public void oU(int n) {
        switch (n) {
            case 1: {
                this.fo(true);
                if (!this.epS) break;
                this.aLp();
                break;
            }
            case 2: {
                this.aLo();
                this.fo(false);
                this.epS = true;
                return;
            }
            case 3: {
                break;
            }
            case 4: {
                this.fo(true);
                break;
            }
            case 5: {
                break;
            }
            default: {
                return;
            }
        }
        this.epS = false;
    }
}

