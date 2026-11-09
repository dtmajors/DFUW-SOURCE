/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cew
 *  cex
 *  cph
 *  cug
 *  cxd
 *  ep
 *  ha
 *  lcw
 */
import java.util.Map;

public class cer {
    private static final float eqF = 100.0f;
    private static boolean bC = false;
    private static final les DX = lea.enT();
    private static final les ResourceTree = lea.enW();
    private static float eqG = 1.5f;
    private static float eqH = 1.0f;
    private static float eqI = 1.5f;
    private static float eqJ = 3.0f;
    private static float eqK = 1.5f;
    private static float eqL = 3.0f;
    private static float eqM = 50.0f;
    private static float eqN = 50.0f;
    private static float eqO = 50.0f;
    private static float eqP = 50.0f;
    private static float eqQ = 50.0f;
    private static float eqR = 50.0f;
    @Deprecated
    private static final float eqS = 300.0f;
    private static float eqT = 1.0f;
    private static float eqU = 300.0f;
    private static float eqV = 300.0f;
    private static float eqW = 300.0f;
    private static float eqX = 50.0f;
    private static float eqY = 50.0f;
    private static float eqZ = 50.0f;
    private static float era = 150.0f;
    private static float erb = 150.0f;
    private static float erc = 150.0f;
    private static float erd = 0.0f;
    private static float ere = 0.0f;

    private static boolean e(cdb cdb2) {
        if (cdb2 == null) {
            lfn.b(5, "SFPlayerFunction", "validateCreatureObject() CreatureObject is null.");
            return false;
        }
        if (cdb2.fi() == null) {
            lfn.b(5, "SFPlayerFunction", "validateCreatureObject() AttributeManager is null.");
            return false;
        }
        return true;
    }

    private static boolean e(cev cev2) {
        if (cev2 == null) {
            lfn.b(5, "SFPlayerFunction", "validatePlayerObject() PlayerObject is null.");
            return false;
        }
        if (cev2.fi() == null) {
            lfn.b(5, "SFPlayerFunction", "validatePlayerObject() AttributeManager is null.");
            return false;
        }
        return true;
    }

    public static boolean c(cex cex2) {
        return false;
    }

    public static float a(cew cew2, float f2) {
        if (!cer.e((cev)cew2)) {
            return f2;
        }
        float f3 = cew2.aJz().yR(cxd.fHr);
        int n = cxi.fj(f3);
        f2 *= 1.0f + 0.0625f * (float)n;
        f2 = ayc.a((cev)cew2, f2);
        return f2;
    }

    public static float a(cex cex2, int n, float f2, float f3) {
        if (!cer.e((cev)cex2)) {
            return 0.0f;
        }
        if (!cug.wj((int)n)) {
            return f2;
        }
        return (float)(0.5 * (double)f3 / 100.0) * f2;
    }

    public static float b(cew cew2, float f2) {
        if (!cer.e((cev)cew2)) {
            return f2;
        }
        f2 = ayc.d((cdb)cew2, f2);
        return f2;
    }

    public static float a(cex cex2, float f2) {
        if (!cer.e((cev)cex2)) {
            return f2;
        }
        return f2;
    }

    public static float a(cex cex2, int n) {
        if (!cer.e((cev)cex2)) {
            return 0.0f;
        }
        float f2 = cug.bi((int)n, (int)9856);
        if (f2 == 0.0f) {
            lfn.b(5, "SFPlayerFunction", "computeNourishmentDuration() NourishmentDuration is invalid for '" + ResourceTree.getName(n) + "'");
            f2 = 1.0f;
        }
        float f3 = ayc.a((cbx)cex2, f2);
        return f3;
    }

    public static float a(cev cev2, int n) {
        return ayc.d(cev2);
    }

    public static float b(cev cev2, float f2) {
        if (!cer.e(cev2)) {
            return f2;
        }
        float f3 = cev2.aJz().yR(cxd.fHE);
        int n = cxi.fj(f3);
        float f4 = f2 * (1.0f + 0.0125f * (float)n);
        return f4;
    }

    public static float j(cew cew2) {
        return 300.0f;
    }

    public static float k(cew cew2) {
        float f2 = 50.0f;
        if (!cer.e((cev)cew2)) {
            return f2;
        }
        float f3 = f2;
        return f3;
    }

    public static float l(cew cew2) {
        float f2 = 25.0f;
        if (!cer.e((cev)cew2)) {
            return f2;
        }
        float f3 = f2;
        return f3;
    }

    public static void d(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        if (cex2.mp()) {
            return;
        }
        float f2 = cex2.aJz().yR(cxd.fJP) / 2.0f;
        float f3 = cex2.fi().al(160) / 4.5f;
        float f4 = cex2.fi().al(208) / 4.5f;
        int n = (int)(30.0f + f2 + f4 + f3);
        cex2.fi().c(1506, n);
    }

    public static void e(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        float f2 = 100.0f;
        cex2.fi().c(162, f2);
    }

    public static void f(cex cex2) {
        int n;
        if (!cer.e((cev)cex2)) {
            return;
        }
        if (cex2.mp()) {
            float f2;
            float f3 = cex2.fi().aj(352);
            float f4 = cex2.fi().al(354);
            float f5 = cex2.fi().aj(208);
            float f6 = cex2.fi().al(208);
            ez ez2 = cex2.fi().an(208);
            float f7 = ez2.fX();
            float f8 = (f4 + cex2.fi().DY) / f7;
            float f9 = f3 / f5;
            float f10 = f8 / f9;
            float f11 = f6 * (f10 * (f3 / f5));
            cex2.fi().DY += f4 - f11;
            if (f11 < f4 && f11 < f4 - (f2 = f4 / 10.0f)) {
                f11 = f4 - f2;
            }
            cex2.fi().c(354, f11);
            f2 = cex2.fi().al(352);
            if (f4 < f11) {
                float f12 = f4 - f2;
                cex2.fi().c(352, f11 - f12);
            }
            return;
        }
        String string = "";
        if (lcw.aQH()) {
            float f13 = cex2.fi().al(11584);
            string = lea.epw().a(f13, 5232, ckj.eGG);
        } else {
            ff ff2 = cex2.fi().aq(11568);
            string = ff2.getStringValue();
        }
        ez ez3 = (ez)cex2.fi().ah(208);
        ff ff3 = cex2.fi().aq(11552);
        String string2 = ff3.getStringValue();
        ckk ckk2 = lea.epw().hz(string);
        int n2 = ckk2 != null ? ckk2.getID() : -1;
        float f14 = ez3.fN();
        float f15 = ez3.gl();
        float f16 = ez3.fO();
        float f17 = f15 - f16;
        float f18 = cer.p(352, string2);
        float f19 = cer.a(352, f14 - f17, 0.0f, 0.0f, 0.0f);
        float f20 = cer.aF(352, n2);
        float f21 = 0.0f;
        int n3 = cex2.fi().ap(13712);
        if (n3 > 0 && (n = cex2.lG()) > 0) {
            f21 = lea.epQ().Zx().floatValue() / (float)n;
        }
        float f22 = f18 + f19 + f20 + f21;
        cex2.fi().c(354, Math.round(f22));
    }

    public static void g(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        float f2 = 100.0f;
        cex2.fi().c(178, f2);
    }

    public static void h(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        float f2 = bqm.dDz;
        float f3 = cex2.fi().al(3488);
        float f4 = cex2.fi().al(1968);
        if (lcw.emW() && lcw.emX()) {
            f2 = cil.a(cex2.fi(), f2);
        }
        float f5 = ayc.c((cdb)cex2, f2 + f3 - f4);
        f5 = cie.d(cex2, f5);
        f5 += cer.b(cex2, f5);
        cex2.aJC().asf().Z(f5 *= cex2.nz());
    }

    public static float b(cex cex2, float f2) {
        ha ha2 = cex2.mA();
        if (ha2 == null) {
            return 0.0f;
        }
        if (ha2.kW() == null) {
            return 0.0f;
        }
        ge ge2 = ha2.kW();
        if (ge2.Us != 3) {
            return 0.0f;
        }
        int n = ge2.Ut;
        cuf cuf2 = lea.eov().get(n);
        if (cuf2 == null) {
            return 0.0f;
        }
        et et2 = cuf2.ah(1536);
        if (et2 == null) {
            return 0.0f;
        }
        return et2.fN() - f2;
    }

    public static float c(cew cew2, float f2) {
        ceg ceg2 = (ceg)cew2.aJN();
        if (ceg2 == null) {
            return 0.0f;
        }
        cph cph2 = ceg2.Wm();
        if (cph2 == null) {
            return 0.0f;
        }
        if (!(cph2 instanceof cpf)) {
            return 0.0f;
        }
        cpf cpf2 = (cpf)cph2;
        em em2 = cpf2.aIj();
        if (em2 == null) {
            return 0.0f;
        }
        int n = em2.ap(13632);
        int n2 = cug.uJ((int)n);
        cuf cuf2 = lea.eov().get(n2);
        if (cuf2 == null) {
            return 0.0f;
        }
        et et2 = cuf2.ah(1536);
        if (et2 == null) {
            return 0.0f;
        }
        return et2.fN() - f2;
    }

    public static void i(cex cex2) {
        int n;
        float f2;
        float f3;
        float f4;
        float f5;
        if (!cer.e((cev)cex2)) {
            return;
        }
        if (cex2.mp()) {
            float f6 = cex2.fi().aj(384);
            float f7 = cex2.fi().ai(176);
            float f8 = cex2.fi().al(176);
            float f9 = cex2.fi().ai(240);
            float f10 = cex2.fi().al(240);
            float f11 = f6 - 50.0f - (1.0f - f8 / f7 + (1.0f - f10 / f9)) / 2.0f * f6;
            cex2.fi().c(386, f11);
            return;
        }
        ez ez2 = (ez)cex2.fi().ah(240);
        ff ff2 = cex2.fi().aq(11552);
        String string = ff2.getStringValue();
        String string2 = "";
        float f12 = 0.0f;
        if (lcw.aQH()) {
            float f13 = cex2.fi().al(11616);
            string2 = lea.epw().a(f13, 5744, ckj.eGJ);
        } else {
            ff ff3 = cex2.fi().aq(11568);
            string2 = ff3.getStringValue();
            ez ez3 = (ez)cex2.fi().ah(176);
            f5 = ez3.fN();
            f4 = ez3.gl();
            f3 = ez3.fO();
            f2 = f4 - f3;
            f12 = f5 - f2;
        }
        ckk ckk2 = lea.epw().hz(string2);
        int n2 = ckk2 != null ? ckk2.getID() : -1;
        f5 = ez2.fN();
        f4 = ez2.gl();
        f3 = ez2.fO();
        f2 = f4 - f3;
        float f14 = f5 - f2;
        float f15 = cer.p(384, string);
        float f16 = cer.a(384, 0.0f, 0.0f, f14, f12);
        float f17 = cer.aF(384, n2);
        float f18 = 0.0f;
        int n3 = cex2.fi().ap(13712);
        if (n3 > 0 && (n = cex2.lG()) > 0) {
            f18 = lea.epQ().Zy().floatValue() / (float)n;
        }
        float f19 = f15 + f16 + f17 + f18;
        cex2.fi().c(386, Math.round(f19));
    }

    public static void j(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        float f2 = cex2.fi().al(354);
        float f3 = cex2.fi().al(352);
        float f4 = cex2.fi().al(416);
        f4 = cie.e(cex2, f4);
        float f5 = Math.max(eqG, eqH * (f2 - f3) / f2);
        float f6 = f5 * f4;
        cex2.aJL().q(352, f6);
    }

    public static void k(cex cex2) {
        float f2;
        float f3;
        if (!cer.e((cev)cex2)) {
            return;
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (lcw.aQH()) {
            f3 = cex2.fi().al(11632);
            ez ez2 = (ez)cex2.fi().ah(176);
            f2 = ez2 != null ? ez2.fN() : 0.0f;
            f6 = cex2.fi().al(13280);
            f5 = cer.dP(f3);
            f4 = cer.dO(f2 - f3);
        }
        f3 = cex2.fi().al(386);
        float f7 = cex2.fi().al(384);
        f2 = cex2.fi().al(448);
        f2 = cie.e(cex2, f2);
        float f8 = Math.max(eqK, eqL * (f3 - f7) / f3);
        float f9 = f8 * f2 * (1.0f + f5 + f4 + f6);
        cex2.aJL().q(384, f9);
    }

    public static void l(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        if (cex2.mp()) {
            return;
        }
        float f2 = lcw.aQH() ? cex2.fi().al(13280) : 0.0f;
        float f3 = cex2.fi().al(402);
        float f4 = cex2.fi().al(400);
        float f5 = cex2.fi().al(464);
        f5 = cie.e(cex2, f5);
        float f6 = Math.max(eqI, eqJ * (f3 - f4) / f3);
        float f7 = f6 * f5 * (1.0f + f2);
        cex2.aJL().q(400, f7);
    }

    public static void m(cex cex2) {
        int n;
        if (!cer.e((cev)cex2)) {
            return;
        }
        if (cex2.mp()) {
            return;
        }
        String string = "";
        if (lcw.aQH()) {
            float f2 = cex2.fi().al(11600);
            string = lea.epw().a(f2, 2576, ckj.eGH);
        } else {
            ff ff2 = cex2.fi().aq(11568);
            string = ff2.getStringValue();
        }
        ez ez2 = (ez)cex2.fi().ah(160);
        ff ff3 = cex2.fi().aq(11552);
        String string2 = ff3.getStringValue();
        ckk ckk2 = lea.epw().hz(string);
        int n2 = ckk2 != null ? ckk2.getID() : -1;
        float f3 = ez2.fN();
        float f4 = ez2.gl();
        float f5 = ez2.fO();
        float f6 = f4 - f5;
        float f7 = cer.p(400, string2);
        float f8 = cer.a(400, 0.0f, f3 - f6, 0.0f, 0.0f);
        float f9 = cer.aF(400, n2);
        float f10 = 0.0f;
        int n3 = cex2.fi().ap(13712);
        if (n3 > 0 && (n = cex2.lG()) > 0) {
            f10 = lea.epQ().Zz().floatValue() / (float)n;
        }
        float f11 = f7 + f8 + f9 + f10;
        cex2.fi().c(402, Math.round(f11));
    }

    public static void n(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        float f2 = 100.0f;
        cex2.fi().c(210, f2);
    }

    public static void o(cex cex2) {
        if (!cer.e((cev)cex2)) {
            return;
        }
        float f2 = 100.0f;
        cex2.fi().c(242, f2);
    }

    public static float p(int n, String string) {
        cjx cjx2 = lea.epx().hu(string);
        if (cjx2 != null) {
            Map<Integer, Float> map = cjx2.aQA();
            if (map == null) {
                return cer.pv(n);
            }
            Float f2 = map.get(n);
            if (f2 != null) {
                return cer.pv(n) * f2.floatValue() / 100.0f;
            }
            return cer.pv(n);
        }
        return cer.pv(n);
    }

    public static float pv(int n) {
        switch (n) {
            case 352: {
                return eqU;
            }
            case 400: {
                return eqV;
            }
            case 384: {
                return eqV;
            }
        }
        assert (false) : "Invalid AttributeType : " + n + " Name : " + ep.aM((int)n);
        return 0.0f;
    }

    public static float a(int n, float f2, float f3, float f4, float f5) {
        switch (n) {
            case 352: {
                return eqX * (f2 / 110.0f);
            }
            case 400: {
                return eqZ * (f3 / 110.0f);
            }
            case 384: {
                if (lcw.aQH()) {
                    return eqY * (f4 / 110.0f);
                }
                return f4 > f5 ? 50.0f * (f4 / 110.0f) : 50.0f * (f5 / 110.0f);
            }
        }
        assert (false) : "Invalid AttributeType : " + n + " Name : " + ep.aM((int)n);
        return 0.0f;
    }

    public static float dO(float f2) {
        return f2 * ere / 110.0f;
    }

    public static float dP(float f2) {
        return f2 * erd / 40.0f;
    }

    public static float pw(int n) {
        return 50.0f;
    }

    public static float aF(int n, int n2) {
        ckk ckk2 = lea.epw().ro(n2);
        if (ckk2 == null) {
            return 0.0f;
        }
        float f2 = 0.0f;
        ckj ckj2 = ckk2.aQS();
        switch (ckj2) {
            case eGG: {
                if (n != 352) {
                    return 0.0f;
                }
                f2 = ckk2.rf(5232);
                break;
            }
            case eGH: {
                if (n != 400) {
                    return 0.0f;
                }
                f2 = ckk2.rf(2576);
                break;
            }
            case eGJ: {
                if (n != 384) {
                    return 0.0f;
                }
                f2 = ckk2.rf(5744);
                break;
            }
            case eGI: {
                if (n != 9056) {
                    return 0.0f;
                }
                f2 = ckk2.rf(3360);
            }
        }
        return f2 * cer.px(n) / 40.0f;
    }

    public static float px(int n) {
        if (lcw.aQH()) {
            switch (n) {
                case 352: {
                    return era;
                }
                case 400: {
                    return erc;
                }
                case 384: {
                    return erb;
                }
                case 9056: {
                    return erd;
                }
            }
            assert (false) : "Invalid AttributeType : " + n + " Name : " + ep.aM((int)n);
            return 0.0f;
        }
        return 150.0f;
    }

    public static void dQ(float f2) {
        eqG = f2;
    }

    public static void dR(float f2) {
        eqH = f2;
    }

    public static void dS(float f2) {
        eqI = f2;
    }

    public static void dT(float f2) {
        eqJ = f2;
    }

    public static void dU(float f2) {
        eqK = f2;
    }

    public static void dV(float f2) {
        eqL = f2;
    }

    public static void dW(float f2) {
        eqN = f2;
    }

    public static void dX(float f2) {
        eqM = f2;
    }

    public static void dY(float f2) {
        eqO = f2;
    }

    public static void dZ(float f2) {
        eqP = f2;
    }

    public static void ea(float f2) {
        eqQ = f2;
    }

    public static void eb(float f2) {
        eqR = f2;
    }

    public static final float aLI() {
        return eqN;
    }

    public static final float aLJ() {
        return eqM + (float)Math.random() * (eqN - eqM);
    }

    public static final float aLK() {
        return eqO + (float)Math.random() * (eqP - eqO);
    }

    public static final float aLL() {
        return eqQ + (float)Math.random() * (eqR - eqQ);
    }

    public static final float aLM() {
        return eqT;
    }

    public static final void ec(float f2) {
        eqT = f2;
    }

    public static final void ed(float f2) {
        eqU = f2;
    }

    public static final void ee(float f2) {
        eqV = f2;
    }

    public static final void ef(float f2) {
        eqW = f2;
    }

    public static final void eg(float f2) {
        eqX = f2;
    }

    public static final void eh(float f2) {
        eqY = f2;
    }

    public static final void ei(float f2) {
        eqZ = f2;
    }

    public static final void ej(float f2) {
        era = f2;
    }

    public static final void ek(float f2) {
        erb = f2;
    }

    public static final void el(float f2) {
        erc = f2;
    }

    public static void em(float f2) {
        erd = f2;
    }

    public static void en(float f2) {
        ere = f2;
    }
}

