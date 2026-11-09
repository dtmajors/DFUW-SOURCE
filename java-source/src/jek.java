/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hyn
 */
public class jek {
    public static lil<Float, Float, Float> a(jep jep2) {
        Object object;
        int n = jep.getAttributeType(jep2);
        float f = hso.cxK().cxP().cyZ().Oy(n);
        jeo jeo2 = jen.dzL().dzM().dzC().e(jep2);
        float f2 = 0.0f;
        if (jeo2 != null) {
            object = lea.epw().aW(jep2.ordinal(), jeo2.dzP().ordinal());
            int n2 = jep.getBonusAttributeType(jep2);
            f2 = ((ckk)object).rf(n2);
        }
        object = jen.dzL().dzM().dzC().f(jep2);
        float f3 = 0.0f;
        if (object != null) {
            ckk ckk2 = lea.epw().aW(jep2.ordinal(), ((jeo)object).dzP().ordinal());
            int n3 = jep.getBonusAttributeType(jep2);
            f3 = ckk2.rf(n3);
        }
        return new lil<Float, Float, Float>(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    public static void a(jep jep2, ist ist2) {
        lil<Float, Float, Float> lil2 = jek.a(jep2);
        float f = ((Float)lil2.reX).floatValue();
        float f2 = ((Float)lil2.reX).floatValue() - ((Float)lil2.reY).floatValue() + ((Float)lil2.reZ).floatValue();
        ist2.setText("" + Math.round(f2));
        if (f2 > f) {
            ist2.Rk(5282643);
        } else if (f2 < f) {
            ist2.Rk(0xAC3333);
        } else {
            ist2.Rk(12357465);
        }
    }

    public static String a(jfc jfc2) {
        return jfc2 != null ? "/dfdata/" + new hwv((bsj)jfc2.cCs()).cBj().iconName : null;
    }

    public static float a(int n, jep jep2) {
        return cer.pv(n);
    }

    public static float b(int n, jep jep2) {
        return cer.a(n, jek.d(n, jep2), jek.e(n, jep2), jek.g(n, jep2), jek.f(n, jep2));
    }

    public static float c(int n, jep jep2) {
        return cer.aF(n, jek.c(jep2));
    }

    public static void a(int n, jep jep2, ist ist2) {
        float f = jek.a(n, jep2);
        float f2 = jek.b(n, jep2);
        float f3 = cer.aF(n, jek.b(jep2));
        float f4 = jek.c(n, jep2);
        float f5 = f + f2 + f3;
        float f6 = f + f2 + f4;
        ist2.setText(Math.round(f6) + "");
        if (f6 > f5) {
            ist2.Rk(5282643);
        } else if (f6 < f5) {
            ist2.Rk(0xAC3333);
        } else {
            ist2.Rk(12357465);
        }
    }

    public static float d(int n, jep jep2) {
        float f = hso.cxK().cxP().cyZ().OA(jep2.BV());
        return hso.cxK().cxP().cyZ().bnS() - f;
    }

    public static float e(int n, jep jep2) {
        float f = hso.cxK().cxP().cyZ().OA(jep2.BV());
        return hso.cxK().cxP().cyZ().cAF() - f;
    }

    public static float f(int n, jep jep2) {
        float f = hso.cxK().cxP().cyZ().OA(jep2.BV());
        return hso.cxK().cxP().cyZ().cAH() - f;
    }

    public static float g(int n, jep jep2) {
        float f = hso.cxK().cxP().cyZ().OA(jep2.BV());
        return hso.cxK().cxP().cyZ().cAG() - f;
    }

    public static int b(jep jep2) {
        jeq jeq2 = jen.dzL().dzM().dzC().g(jep2);
        if (jeq2 == null) {
            return -1;
        }
        ckk ckk2 = lea.epw().aW(jep2.ordinal(), jeq2.ordinal());
        return ckk2.getID();
    }

    public static int c(jep jep2) {
        jeo jeo2 = jen.dzL().dzM().dzC().f(jep2);
        if (jeo2 == null) {
            return -1;
        }
        ckk ckk2 = lea.epw().aW(jep2.ordinal(), jeo2.dzP().ordinal());
        return ckk2.getID();
    }

    public static hyn d(jep jep2) {
        String string = isg.F(14, lvm.sWX.bD(jep.getAttributeType(jep2)).exA());
        String string2 = isg.a(ish.mwR, isg.F(12, lxx.tzW.bD(new Object[0]).exA().toUpperCase()));
        lil<Float, Float, Float> lil2 = jek.a(jep2);
        String string3 = isg.a(ish.mwS, isg.F(12, Math.round(((Float)lil2.reX).floatValue() - ((Float)lil2.reY).floatValue()) + ""));
        String string4 = isg.a(ish.mwR, isg.F(12, lxx.tzV.bD(new Object[0]).exA().toUpperCase()));
        String string5 = isg.a(ish.mwS, isg.F(12, "+" + ((Float)lil2.reZ).intValue()));
        return iae.b(iae.a(string, null, 2, 2, 0, 0, string2, string3, string4, string5));
    }

    public static hyn dzr() {
        return iae.oJ(jen.dzL().dzM().dzE().dAO() <= lea.epx().aQK() ? lxx.tAg.bD(new Object[0]).exA() : lxx.tAj.bD(new Object[0]).exA());
    }

    public static hyn dzs() {
        return iae.oJ(jen.dzL().dzM().dzE().dAN() <= lea.epx().aQJ() ? lxx.tAh.bD(new Object[0]).exA() : lxx.tAj.bD(new Object[0]).exA());
    }

    public static hyn dzt() {
        return iae.oJ(lxx.tAi.bD(new Object[0]).exA());
    }

    public static hyn TU(int n) {
        jfc jfc2 = jen.dzL().dzM().dzE().Ur(n).dAu();
        return jfc2 != null ? new iag(jfc2.cCs().awE().getType(), hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), false) : null;
    }

    public static hyn h(int n, jep jep2) {
        Object var2_2 = null;
        Object var3_3 = null;
        switch (n) {
            case 9056: {
                String string = isg.F(14, lvm.sWX.bD(9056).exA());
                jbf jbf2 = jbg.b(jbh.getAttributeType(176));
                String string2 = String.format("%.2f", (double)cer.dO(jbf2.mNc + jbf2.mNd) * 100.0) + "%";
                String string3 = String.format("%.2f", (double)cer.dP(jbf2.mNf) * 100.0) + "%";
                String string4 = isg.a(ish.mwR, isg.F(12, lxx.tzW.bD(new Object[0]).exA().toUpperCase()));
                String string5 = isg.a(ish.mwS, isg.F(12, " +" + string2));
                String string6 = isg.a(ish.mwR, isg.F(12, lxx.tzV.bD(new Object[0]).exA().toUpperCase()));
                String string7 = isg.a(ish.mwS, isg.F(12, " +" + string3));
                return iae.b(iae.a(string, null, 2, 2, 0, 0, string4, string5, string6, string7));
            }
        }
        String string = isg.F(14, lvm.sWX.bD(n).exA());
        jbf jbf3 = jbg.b(jbh.getAttributeType(jep.getAttributeType(jep2)));
        int n2 = Math.round(jek.b(n, jep2));
        int n3 = Math.round(cer.aF(n, jek.b(jep2)));
        String string8 = isg.a(ish.mwR, isg.F(12, lxx.tzW.bD(new Object[0]).exA().toUpperCase()));
        String string9 = isg.a(ish.mwS, isg.F(12, " +" + n2));
        String string10 = isg.a(ish.mwR, isg.F(12, lxx.tzV.bD(new Object[0]).exA().toUpperCase()));
        String string11 = isg.a(ish.mwS, isg.F(12, " +" + n3));
        return iae.b(iae.a(string, null, 2, 2, 0, 0, string8, string9, string10, string11));
    }

    public static boolean b(ifg ifg2, int n) {
        if (ifg2 instanceof ifh && ((ifh)ifg2).cQm() instanceof hwv) {
            hwv hwv2 = (hwv)((ifh)ifg2).cQm();
            jff jff2 = jen.dzL().dzM().dzE();
            jfd jfd2 = jff2.Ur(n);
            if (jff2.d(n, hwv2.cCs())) {
                jfc jfc2 = jfd2.dAu();
                int n2 = ((bsn)hwv2.cCs().awE()).getType();
                return !(jfc2 == null ? (lea.epx().qV(n2) ? !jff2.e(hwv2.cCs()) && jff2.dAN() >= lea.epx().aQJ() : cxd.xq((int)n2) && !jff2.e(hwv2.cCs()) && jff2.dAO() >= lea.epx().aQK()) : (lea.epx().qV(n2) ? !(jfc2 instanceof jfg) && jff2.dAN() >= lea.epx().aQJ() : cxd.xq((int)n2) && !(jfc2 instanceof jfb) && jff2.dAO() >= lea.epx().aQK()));
            }
        }
        return false;
    }

    public static boolean TV(int n) {
        jfd jfd2 = jen.dzL().dzM().dzE().Ur(n);
        if (jfd2 == null) {
            return false;
        }
        jfc jfc2 = jfd2.dAu();
        if (jfc2 == null) {
            return false;
        }
        cxc cxc2 = jfc2.bjd();
        if (cxc2 == null) {
            return false;
        }
        return hso.cxK().cxP().cyZ().re(cxc2.getGUID());
    }

    public static boolean c(ifg ifg2, int n) {
        if (ifg2 instanceof ifh && ((ifh)ifg2).cQm() instanceof hwo) {
            hwo hwo2 = (hwo)((ifh)ifg2).cQm();
            return jen.dzL().dzM().dzE().Ur(n).u(hwo2);
        }
        return false;
    }

    public static hwo TW(int n) {
        for (int i = 1; i >= 0; --i) {
            hwo hwo2 = jen.dzL().dzM().dzE().Ur(n).Ql(i);
            if (hwo2 == null) continue;
            return hwo2;
        }
        return null;
    }

    public static hyn TX(int n) {
        hwo hwo2 = jek.TW(n);
        return hwo2 != null ? new iac(hwo2, hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), false, true, false) : iae.oJ(lxx.tAw.bD(new Object[0]).exA());
    }

    public static boolean TY(int n) {
        for (int i = 0; i < 2; ++i) {
            hwo hwo2 = jen.dzL().dzM().dzE().Ur(n).Ql(i);
            if (hwo2 == null) continue;
            return false;
        }
        return true;
    }
}

