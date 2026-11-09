/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cyt
 *  ha
 *  lcr
 *  lcw
 */
import java.util.Iterator;

public class ts
extends btk {
    private static final float aUU = 0.5f;
    private static final float aUV = 1.0f;
    private static final double aUW = 600.0;
    final tt aUX = lea.epA();
    final boolean aUY;
    private ha aer = null;
    private float aUZ = 0.0f;
    private float aVa = 0.0f;
    private float aVb = 0.0f;
    private float aVc = 0.0f;
    private double aVd = 0.0;

    public float kA() {
        return this.aUZ;
    }

    public float kB() {
        return this.aVa;
    }

    public float kC() {
        return this.aVc;
    }

    public ts(ha ha2) {
        this.aer = ha2;
        this.aUZ = tr.vv();
        this.aVa = tr.vv();
        this.aUY = this.aUX.vw();
    }

    public void jw() {
        if (this.aer.jm() != null) {
            this.aer.jm().c(11872, this.aVa);
            this.aer.jm().c(12048, this.aUZ);
            this.aer.jm().c(13648, this.aVc);
        }
    }

    public void e(float f2, float f3, float f4) {
        this.aUZ = f2;
        this.aVa = f3;
        this.aVc = f4;
    }

    public void qt() {
        if (this.aer.kv()) {
            return;
        }
        if (this.aVc <= 0.0f) {
            return;
        }
        this.a(tv.aVR, this.aVc, "Trial Account Subscribed!");
        this.aVc = 0.0f;
        if (this.aer.jm() != null) {
            this.aer.jm().c(13648, this.aVc);
        }
    }

    public tu a(tv tv2, float f2, String string) {
        float f3;
        loz loz2 = null;
        boolean bl = tv2 != tv.aVH;
        switch (tv2) {
            case aVs: {
                return tu.aVp;
            }
            case aVu: {
                loz2 = mcm.uwk.bD(Float.valueOf(f2));
                break;
            }
            case aVv: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwl.bD(Float.valueOf(f2));
                break;
            }
            case aVw: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                f2 = this.T(f2);
                loz2 = mcm.uwm.bD(Float.valueOf(f2 *= 1.0f), cug.fso);
                break;
            }
            case aVt: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.rTO.bD(Float.valueOf(f2));
                break;
            }
            case aVB: {
                f3 = this.aUY ? this.aVa : this.aUZ;
                f2 *= lea.epA().a(f3, this.aer.kg().lz());
                f2 = this.T(f2);
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwj.bD(Float.valueOf(f2 *= 1.0f));
                break;
            }
            case aVy: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                f3 = this.aUY ? this.aVa : this.aUZ;
                f2 *= lea.epA().a(f3, this.aer.kg().lz());
                f2 = this.T(f2);
                loz2 = mcm.uwn.bD(Float.valueOf(f2));
                break;
            }
            case aVz: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                f3 = this.aUY ? this.aVa : this.aUZ;
                f2 *= lea.epA().a(f3, this.aer.kg().lz());
                f2 = this.T(f2);
                loz2 = mcm.uwo.bD(Float.valueOf(f2));
                break;
            }
            case aVA: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                f3 = this.aUY ? this.aVa : this.aUZ;
                f2 *= lea.epA().a(f3, this.aer.kg().lz());
                f2 = this.T(f2);
                loz2 = mcm.uwq.bD(Float.valueOf(f2));
                break;
            }
            case aVP: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwr.bD(Float.valueOf(f2));
                break;
            }
            case aVQ: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwE.bD(cug.fww, Float.valueOf(f2));
                break;
            }
            case aVx: 
            case aVI: 
            case aVJ: 
            case aVK: 
            case aVL: {
                cex cex2;
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                f3 = this.aUY ? this.aVa : this.aUZ;
                f2 *= lea.epA().a(f3, this.aer.kg().lz());
                if (lcw.emW() && lcw.emX() && (cex2 = this.aer.jf()) != null) {
                    f2 = cil.a(this.aer.jf().fi(), tv2, f2);
                }
                f2 = this.T(f2);
                if (tv2 == tv.aVK) {
                    f2 *= 1.0f;
                }
                loz2 = mcm.uwp.bD(Float.valueOf(f2));
                break;
            }
            case aVC: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwv.bD(Float.valueOf(-f2));
                break;
            }
            case aVD: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uww.bD(Float.valueOf(-f2));
                break;
            }
            case aVE: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwx.bD(Float.valueOf(-f2));
                break;
            }
            case aVF: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwy.bD(Float.valueOf(-f2));
                break;
            }
            case aVO: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwB.bD(Float.valueOf(-f2));
                break;
            }
            case aVN: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwA.bD(Float.valueOf(-f2));
                break;
            }
            case aVM: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwz.bD(Float.valueOf(-f2));
                break;
            }
            case aVR: {
                if (!tv2.U(f2)) {
                    return tu.aVn;
                }
                loz2 = mcm.uwD.bD((int)f2);
                break;
            }
            case aVH: {
                if (!(f2 + this.aVa > this.aUZ)) break;
                f2 = this.aUZ - this.aVa;
                break;
            }
            default: {
                return tu.aVn;
            }
        }
        f3 = this.aUZ;
        float f4 = this.aVa;
        if (this.aer.kv() && f2 > 0.0f && tv2 != tv.aVH && this.aUZ + f2 > (float)iw.ny()) {
            float f5 = f2 - ((float)iw.ny() - this.aUZ);
            f2 -= f5;
            if (f5 > 0.0f) {
                float f6 = this.aVc;
                this.aVc += f5;
                if (this.aVd + 600.0 <= this.MessageDelegator.arc().rgz) {
                    this.aer.c(mdc.uFa.bD(new Object[0]));
                    this.aVd = this.MessageDelegator.arc().rgz;
                }
                if ((int)this.aVc != (int)f6) {
                    this.b(tv2, f2, "TrialAccountPostponed: " + string);
                    if (this.aer.jm() != null) {
                        this.aer.jm().c(13648, this.aVc);
                    }
                }
            }
            if (f2 <= 0.0f) {
                return tu.aVp;
            }
        }
        if (f2 > 0.0f) {
            if (bl && this.aer.jf() != null && this.aer.jf().aMJ() != null) {
                this.aer.jf().aMJ().u(this.aUZ, this.aUZ + f2);
            }
            if (tv2 != tv.aVH) {
                this.aUZ += f2;
            }
            this.aVa += f2;
            if ((int)f3 != (int)this.aUZ && this.aer.jm() != null) {
                this.aer.jm().c(12048, this.aUZ);
            }
            this.aer.lb().a(f3, this.aUZ, tv2);
        } else if (f2 < 0.0f) {
            if (this.aVa + f2 < 0.0f) {
                return tu.aVo;
            }
            this.aVa += f2;
            if (tv2 == tv.aVu) {
                this.aUZ += f2;
                if ((int)f3 != (int)this.aUZ) {
                    if (this.aer.jm() != null) {
                        this.aer.jm().c(12048, this.aUZ);
                    }
                    this.aer.lb().a(f3, this.aUZ, tv2);
                }
            }
        }
        if (this.aer.jm() != null && (int)f4 != (int)this.aVa) {
            this.aer.jm().c(11872, this.aVa);
        }
        if (Math.abs(this.aVa - f4) < 0.1f) {
            loz2 = tv2 != tv.aVP ? mcm.uwt.bD(new Object[0]) : mcm.uwu.bD(new Object[0]);
        }
        if (loz2 != null) {
            this.aer.c(loz2);
        }
        if ((int)f4 != (int)this.aVa) {
            this.ar(bl);
        }
        if (f2 != 0.0f && ((int)f4 != (int)this.aVa || (int)f3 != (int)this.aUZ)) {
            this.b(tv2, f2, string);
        }
        if (bl) {
            ftb ftb2 = (ftb)this.MessageDelegator.h(30243, this.getGUID(), this.aer.getGUID());
            ftb2.K(f2);
            ftb2.HI(tv2.ordinal());
            this.MessageDelegator.I(ftb2);
        }
        return tu.aVp;
    }

    private float T(float f2) {
        if (this.aer == null || this.aer.jf() == null) {
            assert (false);
            return f2;
        }
        float f3 = f2 * this.aer.jf().b(dmh.gHX);
        if (f2 < f3 && f3 - f2 >= 0.01f) {
            this.aer.c(mcy.uDx.bD(new Object[]{Float.valueOf(f3 - f2), Float.valueOf(this.aer.jf().a(dmh.gHX) * 100.0f), dmh.gHX}));
        }
        return f3;
    }

    private void a(eeo eeo2, tu tu2) {
        eep eep2 = (eep)this.MessageDelegator.h(12835, this.aer.getGUID(), eeo2.aO());
        this.MessageDelegator.b(eeo2, eep2);
        eep2.a(tu2);
        eep2.iI(this.aUZ);
        eep2.iJ(this.aVa);
        this.MessageDelegator.F(eep2);
    }

    private void ar(boolean bl) {
        if (this.aer.iG() == null || this.aer.iG().equals(lcr.qAC)) {
            return;
        }
        emk emk2 = (emk)this.MessageDelegator.h(13857, this.aer.getGUID(), this.aer.iG());
        emk2.aEf = Math.round(this.aVa);
        emk2.aFH = Math.round(this.aUZ);
        emk2.iuM = bl;
        this.MessageDelegator.F(emk2);
    }

    private void b(tv tv2, float f2, String string) {
        kdu kdu2 = (kdu)this.MessageDelegator.i(292, this.aer.getGUID(), lcr.qza);
        kdu2.cS(this.aer.getGUID().enw());
        kdu2.a(tv2);
        kdu2.lf(f2);
        kdu2.wC(string);
        this.MessageDelegator.b(kdu2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 30208: {
                this.a((fsw)dxq2);
                return;
            }
        }
        switch (dxq2.bEz()) {
            case 12834: {
                this.a((eeo)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fsw fsw2) {
        int n = fsw2.bEz();
        switch (n) {
            case 30213: {
                this.a((fsv)fsw2);
                break;
            }
            case 30210: {
                this.a((ftd)fsw2);
                break;
            }
            case 30211: {
                this.a((fst)fsw2);
                break;
            }
            case 30220: {
                this.a((fso)fsw2);
            }
        }
    }

    private void a(fsv fsv2) {
        Object object;
        if (!fsv2.iVw) {
            return;
        }
        if (fsv2.iVx) {
            return;
        }
        if (fsv2.iVE) {
            return;
        }
        cha cha2 = cha.getValueByOrdinal(fsv2.dtZ);
        int n = fsv2.ResourceType;
        boolean bl = cug.vI((int)n);
        boolean bl2 = cug.wg((int)n) && fsv2.iVs;
        boolean bl3 = cug.vM((int)n) && cha2 == cha.ezA;
        boolean bl4 = lea.enW().isDescendant(n, cug.fnO);
        boolean bl5 = lea.enW().isDescendant(n, cug.fpV) && fsv2.iVs;
        boolean bl6 = lea.enW().isDescendant(n, cug.fqO);
        boolean bl7 = lea.enW().isDescendant(n, cug.fnw);
        boolean bl8 = lea.enW().isDescendant(n, cug.fnQ);
        if (!(bl || bl2 || bl3 || bl4 || bl5 || bl6 || bl7 || bl8)) {
            return;
        }
        tw tw2 = tw.aVT;
        if (bl4 || bl5) {
            tw2 = tw.aVY;
        } else if (bl3) {
            tw2 = tw.aWb;
        } else if (bl2) {
            tw2 = tw.aVZ;
        }
        boolean bl9 = this.aer.jM() != null && this.aer.jN() > 1 && !this.aer.jM().equals(lcr.qAC) && (bl || bl2 || bl4 || bl6);
        float f2 = lea.epA().a(tw2, n, 1);
        if (f2 <= 0.0f) {
            return;
        }
        if (this.aer != null && this.aer.jf() != null && (object = this.aer.jf().aLP()) != null) {
            float f3 = f2 * 0.2f / (float)object.size();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                ldv ldv2 = (ldv)iterator.next();
                ldv ldv3 = lcr.tQ((ldv)ldv2);
                eeo eeo2 = (eeo)this.MessageDelegator.h(12834, this.getGUID(), ldv3);
                eeo2.iH(f3);
                eeo2.a(tv.aVA);
                eeo2.jZ(this.aer.iU());
                this.MessageDelegator.F(eeo2);
            }
        }
        if (bl9) {
            if (this.aer.jf() != null && this.aer.jf().aAG() != null && this.aer.jf().aAG().azb() != null) {
                object = (fxw)this.MessageDelegator.h(17954, this.getGUID(), this.aer.jM());
                ((fxw)object).cAw = fsv2.aO();
                ((fxw)object).jaO = fsv2.Position;
                ((fxw)object).ejd = f2;
                this.MessageDelegator.F((dxq)object);
            }
            return;
        }
        this.a(tv.aVK, f2, lea.enW().getName(n));
    }

    private void a(ftd ftd2) {
        int n = ftd2.SkillType;
        float f2 = ftd2.SkillLevel;
        if (cyt.yV((int)n)) {
            return;
        }
        float f3 = this.aUY ? this.aVa : this.aUZ;
        float f4 = lea.epA().vx();
        if (f4 > 0.0f) {
            this.a(tv.aVL, f4, lea.enZ().getName(n));
        }
    }

    private void a(fst fst2) {
        boolean bl;
        int n = fst2.eAc;
        cte[] cteArray = fst2.iVC;
        if (cteArray == null) {
            assert (false);
            return;
        }
        boolean bl2 = n == cug.foJ;
        boolean bl3 = bl = this.aer.jM() != null && this.aer.jN() > 1 && !this.aer.jM().equals(lcr.qAC) && bl2;
        if (bl) {
            float f2 = 0.0f;
            for (cte cte2 : cteArray) {
                if (!((f2 += lea.epA().a(tw.aVU, cte2.ResourceType, cte2.asi)) <= 0.0f)) continue;
                return;
            }
            fxw f4 = (fxw)this.MessageDelegator.h(17954, this.getGUID(), this.aer.jM());
            f4.cAw = this.aer.getGUID();
            f4.jaO = fst2.Position;
            f4.ejd = f2;
            this.MessageDelegator.F(f4);
            return;
        }
        float f3 = this.aUY ? this.aVa : this.aUZ;
        float f2 = 0.0f;
        for (cte cte3 : cteArray) {
            f2 += lea.epA().a(tw.aVU, cte3.ResourceType, cte3.asi);
        }
        if (f2 > 0.0f) {
            this.a(tv.aVJ, f2, lea.enW().getName(n));
        }
    }

    private void a(fso fso2) {
        float f2;
        int n = fso2.ilu;
        boolean bl = fso2.ezP;
        int n2 = fso2.SkillType;
        int n3 = fso2.ResourceType;
        tw tw2 = null;
        String string = lea.enW().getName(n3);
        float f3 = f2 = this.aUY ? this.aVa : this.aUZ;
        if (!bl) {
            switch (n) {
                case 1: {
                    tw2 = tw.aVV;
                    break;
                }
                case 0: {
                    n3 = cug.ih((String)string.replace("broken", ""));
                    tw2 = tw.aVW;
                }
            }
            float f4 = lea.epA().a(tw2, n3, 1);
            if (f4 > 0.0f) {
                this.a(tv.aVI, f4, string);
            }
        }
    }

    private void a(eeo eeo2) {
        this.a(eeo2, this.a(eeo2.bGl(), eeo2.bGm(), eeo2.bGn()));
    }
}

