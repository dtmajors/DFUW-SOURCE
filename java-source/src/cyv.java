/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cdb
 *  cex
 *  cxd
 *  cyt
 *  lcr
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class cyv
extends cyt {
    private ldv fYS = null;
    private cyn fYT = null;
    private cyy fYU = null;
    private daz fYV = null;
    private cxm auD = new cxm();
    private Map<ldv, alx> fYW = lcn.emw();
    private akn fYX = null;
    private Map<Integer, Float> fYY = lea.epB();

    public cyv(cdb cdb2) {
        super(cdb2);
    }

    public ldv bhh() {
        return this.fYS;
    }

    public void mk(ldv ldv2) {
        this.fYS = ldv2;
    }

    public int jr() {
        return this.fYS.ib();
    }

    public boolean isServerObject() {
        return true;
    }

    public final boolean a(ldv ldv2, czb czb2) {
        assert (ldv2 != null);
        assert (czb2 != null);
        if (this.fYB.Ux()) {
            return false;
        }
        brg brg2 = (brg)this.fYB.aJC().asf();
        return brg2.a(ldv2, czb2);
    }

    public final boolean c(czb czb2) {
        assert (czb2 != null);
        if (this.fYB.aJB().aCK == null) {
            lfn.b(5, "SFSkillManagerServer", "consumeWeaponItemDurability() No itemGUID is set in weaponinfo.");
            return false;
        }
        return this.a(this.fYB.aJB().aCK, czb2);
    }

    public final boolean a(czb czb2, int n2) {
        assert (czb2 != null);
        assert (n2 > 0);
        ddy ddy2 = this.fYB.pd(n2);
        if (ddy2 == null) {
            lfn.b(5, "SFSkillManagerServer", "consumeWeaponItemDurability() No weaponinfocache mapped to sessionID " + n2 + " for skill '" + czb2.getName() + "'");
            return true;
        }
        return this.a(ddy2.aCK, czb2);
    }

    public lgl E(int n2, boolean bl) {
        if (bl) {
            assert (this.bhk() != null);
            lgl lgl2 = this.bhk().yT(n2);
            return lgl2;
        }
        return this.yT(n2);
    }

    public final void a(giy giy2) {
        if (giy2.aZF <= 0) {
            lfn.b(5, "SFSkillManagerServer", "handleSkillConfigMessage() ConfigType is invalid.");
            return;
        }
        switch (giy2.aZF) {
            case 3: {
                cxj.bfR();
                break;
            }
            case 6: {
                if (giy2.SkillType < 0) {
                    lfn.b(5, "SFSkillManagerServer", "handleSkillConfigMessage(SET_ALWAYS_FAIL) SkillType is invalid.");
                    return;
                }
                dck dck2 = cxj.yl(giy2.SkillType);
                if (dck2 == null) {
                    dck2 = new dck();
                    dck2.SkillType = giy2.SkillType;
                    dck2.gcT = true;
                    cxj.a(dck2);
                    break;
                }
                dck2.gcT = true;
                break;
            }
            case 7: {
                if (giy2.SkillType < 0) {
                    lfn.b(5, "SFSkillManagerServer", "handleSkillConfigMessage(SET_ALWAYS_SUCCEED) SkillType is invalid.");
                    return;
                }
                dck dck3 = cxj.yl(giy2.SkillType);
                if (dck3 == null) {
                    dck3 = new dck();
                    dck3.SkillType = giy2.SkillType;
                    dck3.gcT = false;
                    cxj.a(dck3);
                    break;
                }
                dck3.gcT = false;
                break;
            }
            case 8: {
                if (giy2.SkillType < 0) {
                    lfn.b(5, "SFSkillManagerServer", "handleSkillConfigMessage(SET_LEVEL) SkillType is invalid.");
                    return;
                }
                if (giy2.SkillLevel < 1.0f || giy2.SkillLevel > 100.0f) {
                    lfn.b(5, "SFSkillManagerServer", "handleSkillConfigMessage(SET_LEVEL) SkillLevel is invalid.");
                    return;
                }
                for (cxc cxc2 : this.jl().values()) {
                    if (!aqN.isDescendant(cxc2.zg(), giy2.SkillType) || cxc2.pe() <= 0.0f) continue;
                    if (cxc2 instanceof cxb) {
                        ((cxb)cxc2).ff(giy2.SkillLevel);
                        continue;
                    }
                    ((czb)((Object)cxc2)).ff(giy2.SkillLevel);
                }
                break;
            }
            case 9: {
                if (giy2.SkillLevel < 1.0f || giy2.SkillLevel > 100.0f) {
                    lfn.b(5, "SFSkillManagerServer", "handleSkillConfigMessage(SET_LEVEL_FOR_ALL) SkillLevel is invalid.");
                    return;
                }
                for (cxc cxc3 : this.jl().values()) {
                    if (cxc3.pe() <= 0.0f) continue;
                    if (cxc3 instanceof cxb) {
                        ((cxb)cxc3).ff(giy2.SkillLevel);
                        continue;
                    }
                    ((czb)((Object)cxc3)).ff(giy2.SkillLevel);
                }
                break;
            }
            default: {
                super.a(giy2);
            }
        }
    }

    public final void a(gjw gjw2) {
        if (gjw2.SkillType <= 0) {
            return;
        }
        if (gjw2.aYH <= 0) {
            return;
        }
        czb czb2 = (czb)((Object)this.ht(gjw2.SkillType));
        if (czb2 == null) {
            return;
        }
        if (!czb2.bev()) {
            return;
        }
        if (czb2.Ec() != gjw2.aYH) {
            return;
        }
        czb2.hr(gjw2.jjv);
    }

    protected final ldv bgZ() {
        return lcr.ak((ldv)lcr.acL, (int)this.jr());
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.fYT != null) {
            this.fYB.getMessageDelegator().hd(this.fYT.getGUID());
        }
        if (this.fYU != null) {
            this.fYB.getMessageDelegator().hd(this.fYU.getGUID());
        }
        if (this.fYV != null) {
            this.fYB.getMessageDelegator().hd(this.fYV.getGUID());
        }
    }

    public cyn bhi() {
        if (this.fYT == null) {
            this.fYT = new cyn(this);
            this.fYT.setGUID(this.fYB.getMessageDelegator().bzv());
            this.fYB.getMessageDelegator().a(this.fYT);
        }
        return this.fYT;
    }

    public cyy bhj() {
        if (this.fYU == null) {
            this.fYU = new cyy(this);
            this.fYU.setGUID(this.fYB.getMessageDelegator().bzv());
            this.fYB.getMessageDelegator().a(this.fYU);
        }
        return this.fYU;
    }

    public daz bhk() {
        if (this.fYV == null) {
            this.fYV = new daz(this);
            this.fYV.setGUID(this.fYB.getMessageDelegator().bzv());
            this.fYB.getMessageDelegator().a(this.fYV);
        }
        return this.fYV;
    }

    public final float yZ(int n2) {
        if (lea.enZ().isDescendant(n2, cxd.fJj)) {
            return this.a(n2, cxd.fOB, false, cxd.w.fSZ);
        }
        return this.a(n2, cxd.fOA, false, cxd.w.fSZ);
    }

    public final float x(int n2, float f2) {
        return this.a(n2, f2, false, cxd.w.fSZ);
    }

    public final float a(int n2, float f2, boolean bl, cxd.w w2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillManagerServer", "calculateXPGain(4) SkillType is invalid.");
            return 0.0f;
        }
        cxc cxc2 = this.ht(n2);
        if (cxc2 == null) {
            return 0.0f;
        }
        return this.a(cxc2, f2, bl, w2);
    }

    public final float ch(cxc cxc2) {
        if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJj)) {
            return this.a(cxc2.zg(), cxd.fOB, false, cxd.w.fSZ);
        }
        return this.a(cxc2, cxd.fOA, false, cxd.w.fSZ);
    }

    public final float a(cxc cxc2, float f2) {
        return this.a(cxc2, f2, false, cxd.w.fSZ);
    }

    public final float a(cxc cxc2, float f2, boolean bl, cxd.w w2) {
        float f3;
        lmf lmf2;
        bvd bvd2;
        cex cex2;
        assert (cxc2 != null);
        assert (cxc2.pe() >= 0.0f);
        if (cyv.yV((int)cxc2.zg())) {
            return 0.0f;
        }
        if (cxc2.pe() == 0.0f) {
            return 0.0f;
        }
        if (!(cxc2 instanceof cxb) && !(cxc2 instanceof czb)) {
            lfn.b(5, "SFSkillManagerServer", "calculateXPGain() Skill '" + cxc2.getName() + "' is not a passiveskill or a serverskill.");
            assert (false);
            return 0.0f;
        }
        if (this.bgQ() instanceof cex && (cex2 = (cex)this.bgQ()) != null && (bvd2 = cex2.aAG()) != null && (lmf2 = lea.eg(cex2.aAG().azb())) != null && lmf2 == lmf.rEz) {
            for (Map.Entry<Integer, Float> entry : this.fYY.entrySet()) {
                int n2 = entry.getKey();
                if (!lea.enZ().isDescendant(cxc2.zg(), n2)) continue;
                float f4 = entry.getValue().floatValue();
                if (!(cxc2.Bt() >= f4)) continue;
                return 0.0f;
            }
        }
        if ((f3 = this.auD.E(cxc2.Bt(), cxc2.pe())) <= 0.0f) {
            lfn.b(5, "SFSkillManagerServer", "calculateXPGain() XP gained for skill '" + cxc2.getName() + "' is invalid: " + f3);
            return 0.0f;
        }
        if (f2 >= 0.0f) {
            f3 *= f2;
            f2 = 0.0f;
            if (bl) {
                switch (w2) {
                    case fTa: {
                        f2 = cxd.fOE;
                        break;
                    }
                    case fTb: {
                        f2 = cxd.fOI;
                        break;
                    }
                    case fTc: {
                        f2 = cxd.fOI * cxd.fOE;
                        break;
                    }
                    default: {
                        lfn.b(5, "SFSkillManagerServer", "calculateXPGain() Invalid paramtype provided: " + (Object)((Object)w2));
                        assert (false);
                        f2 = 0.0f;
                    }
                }
            }
        }
        return this.a(cxc2, f3, f2);
    }

    public final boolean G(float f2, float f3) {
        if (this.fJ(f2) != this.fJ(f3)) {
            return true;
        }
        return this.fK(f2) < this.fK(f3);
    }

    private void a(deb deb2, float f2) {
    }

    private void a(dec dec2, float f2, boolean bl) {
    }

    private float fI(float f2) {
        return f2 - this.fJ(f2);
    }

    private float fJ(float f2) {
        return (float)Math.floor(f2);
    }

    private float fK(float f2) {
        float f3 = this.fI(f2) * 100.0f;
        return this.fJ(f3);
    }

    private final float a(cxc cxc2, float f2, float f3) {
        dea[] deaArray;
        assert (cxc2 != null);
        assert (cxc2.pe() > 0.0f);
        assert (f2 >= 0.0f);
        assert (f3 >= 0.0f);
        if (this.fYB.fi().ag(1344)) {
            return 0.0f;
        }
        if (cxc2.bfE()) {
            if (cxd.xH((int)cxc2.zg())) {
                if (cxc2 instanceof cxb) {
                    ((cxb)cxc2).bfs();
                } else {
                    ((czb)((Object)cxc2)).bfs();
                }
                return 0.0f;
            }
        } else if (cxc2 instanceof cxb) {
            ((cxb)cxc2).fg(f2);
        } else {
            ((czb)((Object)cxc2)).fg(f2);
        }
        if ((deaArray = cxc2.bfu()) == null || deaArray.length == 0) {
            return f2;
        }
        int n2 = deaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (deaArray[i2] instanceof deb) {
                this.a((deb)deaArray[i2], f3);
                continue;
            }
            if (deaArray[i2] instanceof dec) {
                this.a((dec)deaArray[i2], f3, false);
                continue;
            }
            lfn.b(5, "SFSkillManagerServer", "giveXPToSkill() Xp heir " + i2 + " for skill '" + cxc2.getName() + "' has unknown type: " + deaArray[i2]);
            assert (false);
        }
        return f2;
    }

    public final void a(alx alx2) {
        if (alx2 == null) {
            return;
        }
        if (this.fYW.containsKey(alx2.getGUID())) {
            return;
        }
        this.fYW.put(alx2.getGUID(), alx2);
        this.fYB.d(14, alx2.DZ(), alx2.Ea());
    }

    public final float za(int n2) {
        if (n2 <= 0) {
            return 0.0f;
        }
        if (this.fYW.isEmpty()) {
            return 0.0f;
        }
        float f2 = 0.0f;
        for (alx alx2 : this.fYW.values()) {
            alw alw2;
            if (alx2.zg() != n2 || !(alx2 instanceof alw) || !((alw2 = (alw)alx2).DS() > f2)) continue;
            f2 = alw2.DS();
        }
        return f2;
    }

    public final void ml(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        alx alx2 = this.fYW.remove(ldv2);
        if (alx2 == null) {
            return;
        }
        this.fYB.d(15, alx2.DZ(), alx2.Ea());
    }

    public final void d(czb czb2) {
        if (this.fYX != null) {
            this.fYX.b(czb2);
        }
    }

    public final void a(akn akn2) {
        this.fYX = akn2;
    }

    protected void a(cyg cyg2) {
        assert (cyg2 != null);
        dxr dxr2 = this.fYB.getMessageDelegator();
        gyg gyg2 = (gyg)dxr2.h(12038, this.fYB.getGUID(), lcr.qAI);
        gyg2.ija = 4;
        gyg2.aXP = 1;
        gyg2.jul = cyg2;
        dxr2.F(gyg2);
    }

    protected void b(cyg cyg2) {
        assert (cyg2 != null);
        dxr dxr2 = this.fYB.getMessageDelegator();
        gyg gyg2 = (gyg)dxr2.h(12038, this.fYB.getGUID(), lcr.qAI);
        gyg2.ija = 4;
        gyg2.aXP = 2;
        gyg2.jul = cyg2;
        dxr2.F(gyg2);
    }

    public void a(gji gji2) {
        cxc cxc2 = this.ht(gji2.SkillType);
        if (cxc2 == null) {
            return;
        }
        if (!cyv.yV((int)gji2.SkillType)) {
            return;
        }
        int n2 = Math.round(cxc2.Bt());
        if (gji2.iky <= 0 || gji2.iky > 100) {
            return;
        }
        if (n2 + gji2.iky > 100) {
            return;
        }
        if (!(cxc2 instanceof czb) && !(cxc2 instanceof cxb)) {
            return;
        }
        if (!(this.fYB instanceof cex)) {
            return;
        }
        cex cex2 = (cex)this.fYB;
        int n3 = 0;
        for (int i2 = 0; i2 < gji2.iky; ++i2) {
            n3 += this.yU(++n2);
        }
        ts ts2 = cex2.mA().kz();
        int n4 = (int)ts2.kB();
        if (n3 > n4) {
            return;
        }
        if (ts2.a(tv.aVE, -n3, cxc2.getName()) != tu.aVp) {
            return;
        }
        if (cxc2 instanceof czb) {
            czb czb2 = (czb)((Object)cxc2);
            czb2.ff(n2);
        } else if (cxc2 instanceof cxb) {
            cxb cxb2 = (cxb)cxc2;
            cxb2.ff(n2);
        }
    }

    public int bhl() {
        ArrayList<Integer> arrayList = lcn.emv();
        for (cxc cxc2 : this.jl().values()) {
            if (!cyv.yV((int)cxc2.zg())) continue;
            arrayList.add(Math.round(cxc2.Bt()));
        }
        Collections.sort(arrayList);
        int n2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            int n3 = (Integer)arrayList.get(i2);
            int n4 = arrayList.size() - i2 - 1;
            while (n3 > 1) {
                n2 += cyv.bE((int)n3, (int)n4);
                arrayList.set(i2, --n3);
            }
        }
        for (cxc cxc3 : this.jl().values()) {
            Object object;
            if (!cyv.yV((int)cxc3.zg())) continue;
            if (cxc3 instanceof czb) {
                object = (czb)((Object)cxc3);
                ((czb)((Object)object)).ff(1.0f);
                continue;
            }
            if (!(cxc3 instanceof cxb)) continue;
            object = (cxb)cxc3;
            ((cxb)object).ff(1.0f);
        }
        return n2;
    }

    public void zb(int n2) {
        this.yO(n2);
        cex cex2 = (cex)this.bgR();
        giy giy2 = (giy)cex2.getMessageDelegator().h(4624, cex2.getGUID(), this.fYS);
        giy2.aZF = 4;
        giy2.SkillType = n2;
        cex2.getMessageDelegator().E(giy2);
    }

    public void y(int n2, float f2) {
        this.w(n2, f2);
        cex cex2 = (cex)this.bgR();
        giy giy2 = (giy)cex2.getMessageDelegator().h(4624, cex2.getGUID(), this.fYS);
        giy2.aZF = 5;
        giy2.SkillType = n2;
        giy2.iGw = f2;
        cex2.getMessageDelegator().E(giy2);
    }

    public lfs<Integer, Integer> hq(boolean bl) {
        int n2 = 0;
        int n3 = 0;
        ArrayList<cxc> arrayList = lcn.emv();
        for (cxc cxc2 : this.jl().values()) {
            cuo cuo2 = cxj.yw(cxc2.zg());
            if (cuo2 == null) continue;
            if (!bl && lea.enZ().isDescendant(cxc2.zg(), cxd.fLd)) {
                n3 = (int)((float)n3 + cuo2.TrainingCost);
                continue;
            }
            n2 = (int)((float)n2 + cuo2.TrainingCost);
            arrayList.add(cxc2);
        }
        for (cxc cxc2 : arrayList) {
            this.yH(cxc2.zg());
            this.bgQ().aJA().kw(cxc2.getGUID());
        }
        return new lfs<Integer, Integer>(n2, n3);
    }
}

