/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hvy
 *  hzo
 *  lcw
 */
import java.util.ArrayList;
import java.util.Map;

public class iab {
    public static final hzu lqz = hso.cxK().cxP().lee;
    private static int[] lAN = new int[]{1680, 1744, 6416, 1936, 2096, 2704, 3248, 3280, 4464, 3536, 3568, 4496, 4912, 5536, 4208, 13248, 13264, 14128, 13296, 13280};

    public static void a(iaa iaa2, hwo hwo2, int n, boolean bl) {
        bsh hvy2;
        bsh hvy3;
        ljq bsh2;
        int n2;
        Object object;
        int n3;
        String string14;
        Map<String, cur> ljq2;
        cur cur2;
        String string;
        float n9;
        float string10;
        float bl16;
        int n4 = hwo2.cBq().getType();
        boolean bl2 = hwo2.cBY();
        boolean bl3 = hwo2.cBO();
        boolean bl4 = hwo2.cBW();
        boolean bl5 = hwo2.cBP();
        boolean bl6 = hwo2.cBQ();
        boolean bl7 = hwo2.cBT();
        boolean bl8 = hwo2.cBX();
        boolean bl9 = lea.enW().isDescendant(n4, cug.fnn);
        boolean bl10 = hwo2.cBZ();
        boolean bl11 = hwo2.cCa();
        boolean bl12 = hwo2.auU();
        boolean bl13 = hwo2.cCb();
        boolean bl14 = hwo2.cCc();
        boolean bl15 = hwo2.bkp();
        iaa2.lzU = n;
        iaa2.lzV = n4;
        iaa2.quantity = hwo2.auW() ? hwo2.vf() : 0;
        cuf cuf2 = bl ? lea.eov().get(n4) : null;
        lgw lgw2 = (lgw)lea.enW().acv(n4);
        cak.c c2 = lgw2.auO();
        hzo hzo2 = hso.cxK().cxP().cyJ();
        hwo hwo3 = hzo2.cHP().h(c2);
        if (hwo2.ceE()) {
            for (int f15 : lAN) {
                lil<Integer, Float, Float> f16 = iab.a(cuf2, f15, hwo3, hwo2);
                if (f16 == null || ((Float)f16.reY).floatValue() == 0.0f && ((Float)f16.reZ).floatValue() == 0.0f) continue;
                iaa2.lzW.add(f16);
            }
        }
        if (bl14) {
            float f4 = cug.bi((int)n4, (int)9856);
            if (f4 == 0.0f) {
                lfn.b(5, "SFTooltipItemWindow", "collectItemTooltipInfo() NourishmentDuration is invalid for '" + hwo2.cBq().getName() + "'");
                f4 = 1.0f;
            }
            iaa2.lzX = Float.valueOf(f4);
        }
        if (bl6) {
            String f14;
            Map<String, cur> f12;
            cur f20;
            bqm.d f9 = bqm.d.getWeaponType(n4);
            if (f9 != null && bl7) {
                iaa2.lzY = bqm.d.isTwoHandedWeapon(f9) ? 2 : 1;
            }
            if ((f20 = (f12 = lea.eos()).get(f14 = lea.enW().getName(n4))) != null) {
                iaa2.lzZ = Float.valueOf(f20.fyc);
            }
            float f21 = cuf2 != null ? ((et)cuf2.ae(640)).fN() : hwo2.cBC();
            bl16 = hwo3 != null ? hwo3.cBC() : 0.0f;
            string10 = f21 - bl16;
            iaa2.lAa = new lil<Float, Float, Boolean>(Float.valueOf(f21), Float.valueOf(string10), false);
            if (!bl8) {
                float f = n9 = cuf2 != null ? ((et)cuf2.ae(624)).fN() : hwo2.cBE();
                if (n9 != 0.0f && cuf2 != null) {
                    n9 = 1.0f / n9;
                }
                float string12 = hwo3 != null ? hwo3.cBE() : 0.0f;
                float string6 = n9 - string12;
                iaa2.lAb = new lil<Float, Float, Boolean>(Float.valueOf(n9), Float.valueOf(string6), false);
            }
        }
        if (bl15 && hwo2.cBE() != 0.0f) {
            float et3 = (1.0f / hwo2.cBE() - 1.0f) * 100.0f;
            float et2 = 0.0f;
            if (hwo3 != null && hwo3.bkp()) {
                et2 = (1.0f / hwo3.cBE() - 1.0f) * 100.0f;
            }
            iaa2.lAg = new lil<Float, Float, Boolean>(Float.valueOf(et3), Float.valueOf(et3 - et2), true);
        }
        if (bl5) {
            float string4 = cuf2 != null ? ((et)cuf2.ae(9360)).fN() : hwo2.cBJ();
            float string5 = hwo3 != null ? hwo3.cBJ() : 0.0f;
            float f19 = string4 - string5;
            iaa2.lAd = new lil<Float, Float, Boolean>(Float.valueOf(string4), Float.valueOf(f19), true);
        }
        if (!bl9 && !cug.vF((int)n4)) {
            et f18;
            et f17 = cuf2 != null ? (et)cuf2.ae(1234) : hwo2.cBy();
            et et2 = f18 = cuf2 != null ? (et)cuf2.ae(1232) : hwo2.cBA();
            if (f18 != null && f18 != null) {
                float f = f17.fN();
                float string2 = hwo3 != null && hwo3.cBu() != null && !cug.vF((int)hwo3.cBu().az()) ? hwo3.cBx() : 0.0f;
                float arrayList = hwo3 != null && hwo3.cBu() != null && !cug.vF((int)hwo3.cBu().az()) ? f - string2 : 0.0f;
                bl16 = f18.fN();
                string10 = hwo3 != null && hwo3.cBu() != null && !cug.vF((int)hwo3.cBu().az()) ? hwo3.cBz() : 0.0f;
                n9 = hwo3 != null && hwo3.cBu() != null && !cug.vF((int)hwo3.cBu().az()) ? f18.fN() - string10 : 0.0f;
                iaa2.lAe = new lil<Float, Float, Boolean>(Float.valueOf(bl16), Float.valueOf(n9), false);
                iaa2.lAf = new lil<Float, Float, Boolean>(Float.valueOf(f), Float.valueOf(arrayList), false);
            }
        }
        if (bl10) {
            String string2 = hwo2.cBK();
            String string3 = hwo2.cBM();
            iaa2.lAi = string2;
            iaa2.lAj = hwo2.cBN();
        }
        if (bl11) {
            iaa2.lAh = hwo2.cBL();
        }
        float f = cuf2 != null ? ((et)cuf2.ae(1104)).fN() : hwo2.getWeight();
        float f2 = hwo3 != null ? hwo3.getWeight() : 0.0f;
        float f3 = bl2 || bl6 ? f - f2 : 0.0f;
        iaa2.lAk = new lil<Float, Float, Boolean>(Float.valueOf(f), Float.valueOf(f3), false);
        if (bl14) {
            float n6 = cug.bi((int)n4, (int)3488);
            float f4 = cug.bi((int)n4, (int)208);
            bl16 = cug.bi((int)n4, (int)160);
            string10 = cug.bi((int)n4, (int)240);
            n9 = cug.bi((int)n4, (int)176);
            if (n6 > 0.0f) {
                iaa2.lAl = Float.valueOf(n6);
            }
            if (f4 > 0.0f) {
                iaa2.lAm = Float.valueOf(f4);
            }
            if (bl16 > 0.0f) {
                iaa2.lAn = Float.valueOf(bl16);
            }
            if (string10 > 0.0f) {
                iaa2.lAo = Float.valueOf(string10);
            }
            if (n9 > 0.0f) {
                iaa2.lAp = Float.valueOf(n9);
            }
        }
        if (bl9) {
            iaa2.lAq = new lil<Float, Float, Boolean>(Float.valueOf(hwo2.cBG()), Float.valueOf(0.0f), true);
            if (hwo2.cCd()) {
                iaa2.lAr = Float.valueOf(hwo2.Ub());
                iaa2.lAt = Float.valueOf(cug.bi((int)n4, (int)11056));
                iaa2.lAu = Float.valueOf(cug.bi((int)n4, (int)1536));
                iaa2.lAs = Float.valueOf(cug.bi((int)n4, (int)208));
                iaa2.lAv = Float.valueOf(cug.bi((int)n4, (int)1088));
            }
        }
        if (cuf2 == null && !hwo2.auW() && (string = hwo2.cBw()) != null) {
            if (!string.equalsIgnoreCase("unknown")) {
                iaa2.lAw = string;
            }
            iaa2.lAx = bl12;
        }
        int n5 = hwo2.cBt();
        ArrayList<Integer> arrayList = lcn.abH(4);
        if ((n5 & 4) != 0) {
            arrayList.add(160);
        }
        if ((n5 & 0x10) != 0) {
            arrayList.add(176);
        }
        if ((n5 & 2) != 0) {
            arrayList.add(208);
        }
        if ((n5 & 8) != 0) {
            arrayList.add(240);
        }
        if ((bl3 || bl6 || bl4 || bl5) && (cur2 = (ljq2 = lea.eos()).get(string14 = lea.enW().getName(n4))) != null && cur2.fyd != -1) {
            String string4;
            int n6 = -1;
            if (lcw.aQH()) {
                cjv cjv2 = cjv.getArmorType(cur2.ResourceType);
                n6 = cjv.getConnectionAttribute(cjv2);
                if (n6 == -1) {
                    n6 = ckh.getWeaponTypeConnectedAttribute(cur2.ResourceType);
                }
                if (n6 != -1) {
                    n6 = hso.cxK().cxP().cyZ().Ow(n6);
                }
            }
            if (n6 == -1) {
                n6 = cur2.fyd;
            }
            if ((string4 = lvm.sWX.bD(n6).exA()) != null) {
                String string5;
                iaa2.lAy = n6;
                float ej3 = cur2.fye;
                n3 = !arrayList.contains(n6) ? 1 : 0;
                iaa2.lAz = Float.valueOf(ej3);
                object = n3 != 0 ? lqz.cJM() : lqz.cJN();
                String string6 = string5 = n3 != 0 ? lqz.cJT() : lqz.cJN();
                if (cur2.fyf != -1 && !lcw.aQH()) {
                    String string7 = lvm.sWX.bD(cur2.fyf).exA();
                    if (string7 != null) {
                        float f5 = cur2.fyg;
                        int n7 = n2 = !arrayList.contains(cur2.fyf) ? 1 : 0;
                        if (n3 == 0) {
                            if (n2 != 0) {
                                object = lqz.cJT();
                                string5 = lqz.cJM();
                            } else {
                                object = lqz.cJN();
                                string5 = lqz.cJN();
                            }
                        } else if (n2 != 0) {
                            string5 = lqz.cJM();
                        }
                        iaa2.lAB = cur2.fyf;
                        iaa2.lAC = Float.valueOf(f5);
                        iaa2.lAA = object;
                        iaa2.lAD = string5;
                    }
                } else {
                    iaa2.lAA = object;
                }
            }
        }
        if (!lcw.aQH()) {
            boolean bsh3;
            boolean bl17 = bsh3 = (n5 & 1) != 0;
            if (bl3 || bl4) {
                String ejArray;
                String string8 = ejArray = cuf2 != null ? ((ff)cuf2.ae(11024)).getStringValue() : hwo2.cBB();
                if (ejArray != null) {
                    String string9;
                    int n8 = lea.epx().hx(ejArray);
                    String string11 = string9 = n8 != -1 ? lvm.sXc.bD(n8).exA() : null;
                    if (string9 != null) {
                        iaa2.lAE = string9;
                        iaa2.lAF = bsh3;
                    }
                }
            }
        }
        if (bl13 && hso.cxK().cxP().cyZ().cAv() > hc.aaz.ordinal() && (bsh2 = hwo2.cBF()) != null) {
            String ejArray = "" + (int)bsh2.x + "," + (int)bsh2.y + "," + (int)bsh2.rlV;
            iaa2.lAG = bsh2;
        }
        if (cug.wB((int)lgw2.getType()) && (hvy3 = hwo2.cBu()) != null) {
            ej[] d2;
            for (ej ej2 : d2 = hvy3.arJ()) {
                if (ej2.getType() != 13216) continue;
                ew ew2 = (ew)ej2;
                int n10 = ew2.fQ();
                iaa2.primaryDye = n10 & 0xFFFF;
                iaa2.secondaryDye = n10 >> 16;
            }
        }
        if (cug.wA((int)lgw2.getType()) && (hvy2 = hwo2.cBu()) != null) {
            ej[] ejArray;
            for (ej ej3 : ejArray = hvy2.arJ()) {
                if (ej3.getType() != 13200) continue;
                n3 = ((ew)ej3).fQ();
                int n11 = (int)((double)n3 - (object = hso.cxK().cxP().cyZ()).cAC());
                if (n11 < 0) {
                    n11 = 0;
                }
                int n12 = n11 / 86400;
                int n13 = (n11 -= n12 * 3600 * 24) / 3600;
                n2 = (n11 -= n13 * 3600) / 60;
                int n14 = n11 -= n2 * 60;
                String string12 = lxz.tBR.bD(new Object[0]).exA();
                if (n12 > 0) {
                    string12 = string12 + " " + n12 + " " + lxz.tqC.bD(new Object[0]).exA();
                }
                if (n13 > 0 || n12 > 0) {
                    string12 = string12 + " " + n13 + " " + lxz.tqF.bD(new Object[0]).exA();
                }
                if (n2 > 0 || n12 > 0 || n13 > 0) {
                    string12 = string12 + " " + n2 + " " + lxz.tBS.bD(new Object[0]).exA() + " " + lxz.tBU.bD(new Object[0]).exA();
                }
                iaa2.lAH = string12 = string12 + " " + n14 + " " + lxz.tBT.bD(new Object[0]).exA();
            }
        }
        if (cug.wr((int)lgw2.getType())) {
            hvy hvy4;
            if (cug.fua == lgw2.getType()) {
                int n15;
                double d2;
                hvy civ2 = hso.cxK().cxP().cyZ();
                if (civ2 != null && (d2 = civ2.cAC()) < (double)(n15 = civ2.cAE())) {
                    String string13;
                    iaa2.lAM = string13 = lxz.tBK.bD((double)n15 - d2, cug.fua).exA();
                }
            } else if (lgw2.getType() == cug.fui && (hvy4 = hso.cxK().cxP().cyZ()) != null && hvy4.cAC() < hvy4.cAD()) {
                iaa2.lAM = lxz.tBL.bD(hvy4.cAD() - hvy4.cAC()).exA();
            }
            if (!lcw.emW()) {
                civ civ2 = lea.epC().get(lgw2.getType());
                if (civ2 == null) {
                    civ2 = lea.epC().get(lea.enW().uW(lgw2.getType()));
                }
                if (civ2 != null) {
                    if (civ2.aPI()) {
                        iaa2.lAI = lxz.tCk.bD(new Object[0]).exA();
                    }
                    if (civ2.aPH()) {
                        iaa2.lAJ = lxz.tCl.bD(new Object[0]).exA();
                    }
                    if (civ2.aPJ()) {
                        iaa2.lAK = lxz.tCm.bD(new Object[0]).exA();
                    }
                    if (civ2.aPK()) {
                        iaa2.lAL = lxz.tCn.bD(new Object[0]).exA();
                    }
                }
            }
        }
    }

    private static lil<Integer, Float, Float> a(cuf cuf2, int n, hwo hwo2, hwo hwo3) {
        ej ej2 = cuf2 != null ? cuf2.ae(n) : null;
        float f = cuf2 != null && ej2 != null ? ((et)ej2).fN() : hwo3.OH(n);
        float f2 = hwo2 != null ? hwo2.OH(n) : 0.0f;
        float f3 = f - f2;
        lil<Integer, Float, Float> lil2 = new lil<Integer, Float, Float>(n, Float.valueOf(f), Float.valueOf(f3));
        return lil2;
    }
}

