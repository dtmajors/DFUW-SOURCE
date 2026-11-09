/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class cvz
extends cwg {
    public static final float fBu = 0.05f;
    protected static final boolean fBv = false;
    public static final float fBw = 0.03f;
    public static final float fBx = 0.07f;
    public static final int fBy = 100;
    public static final int fBz = 100;
    public static final int fBA = 0;
    public static final int fBB = 1;
    public static final int fBC = 2;
    public static final float fBD = 0.95f;
    public static final float fBE = 0.95f;
    public static final int fBF = 3;
    public static final int fBG = 18;
    public static final int fBH = 5000;
    private static Map<Integer, loz> fBI = null;

    cvz(int n, boolean bl) {
        super(cwf.b.fEH, n, bl);
    }

    public static String wV(int n) {
        Map<Integer, List<bsx>> map;
        if (fBI == null) {
            fBI = lcn.emD();
            map = fy.TN.get(fy.a.TQ.ordinal());
            if (map != null) {
                for (List list : map.values()) {
                    for (bsx bsx2 : list) {
                        ljq ljq2 = (ljq)bsx2.getValue("Position");
                        int n2 = (Integer)bsx2.getValue("MarketID");
                        fBI.put(n2, lxj.trK.bD(ljq2));
                    }
                }
            }
        }
        if ((map = fBI.get(n)) != null) {
            return ((loz)((Object)map)).exA();
        }
        return "Clan market";
    }

    public static int a(int n, el el2, boolean bl) {
        if (bl) {
            return 1;
        }
        float f2 = 0.03f * (float)n;
        int n2 = f2 - (float)((int)f2) > 0.0f ? (int)f2 + 1 : (int)f2;
        return n2 == 0 ? 1 : n2;
    }

    public static int b(int n, el el2, boolean bl) {
        if (bl) {
            return 0;
        }
        float f2 = 0.05f * (float)n;
        if (lcw.emX() && el2 != null) {
            f2 *= cil.i(el2);
        }
        int n2 = f2 - (float)((int)f2) > 0.0f ? (int)f2 + 1 : (int)f2;
        return n2 == 0 ? 1 : n2;
    }

    public static int c(int n, el el2, boolean bl) {
        if (bl) {
            return 0;
        }
        float f2 = 0.07f * (float)n;
        int n2 = f2 - (float)((int)f2) > 0.0f ? (int)f2 + 1 : (int)f2;
        int n3 = n2 = n2 == 0 ? 1 : n2;
        if (n2 < 10) {
            n2 = 10;
        }
        return n2;
    }

    public static Float g(ej[] ejArray) {
        Float f2 = null;
        Float f3 = null;
        for (ej ej2 : ejArray) {
            if (ej2.getType() == 1232) {
                f2 = Float.valueOf(((et)ej2).fN());
            }
            if (ej2.getType() != 1234) continue;
            f3 = Float.valueOf(((et)ej2).fN());
        }
        if (f2 == null || f3 == null) {
            return null;
        }
        return Float.valueOf(f2.floatValue() / f3.floatValue());
    }

    public static boolean h(ej[] ejArray) {
        Float f2 = cvz.g(ejArray);
        if (f2 == null) {
            return true;
        }
        return f2.floatValue() > 0.95f;
    }

    public static Float a(ej[] ejArray, int n) {
        Object object;
        Float f2 = null;
        Float f3 = null;
        String string = lea.enW().getName(n);
        string = string.replace("r_Figurine ", "r_");
        n = lea.enW().getType(string);
        cuf cuf2 = lea.eov().get(n);
        if (cuf2 != null && (object = (et)cuf2.ae(352)) != null) {
            f3 = Float.valueOf(((et)object).fN());
        }
        for (ej ej2 : ejArray) {
            if (ej2.getType() != 9472) continue;
            f2 = Float.valueOf(((et)ej2).fN());
        }
        if (f2 == null || f3 == null) {
            return null;
        }
        if (f2.floatValue() == 0.0f) {
            f2 = f3;
        }
        if (f3.floatValue() == 0.0f) {
            return null;
        }
        return Float.valueOf(f2.floatValue() / f3.floatValue());
    }

    public static boolean b(ej[] ejArray, int n) {
        Float f2 = cvz.a(ejArray, n);
        if (f2 == null) {
            return true;
        }
        return f2.floatValue() > 0.95f;
    }

    public static boolean wW(int n) {
        return lea.enX().contains(n);
    }

    public static loz a(int n, a a2) {
        if (a2.equals((Object)a.fBQ) || a2.equals((Object)a.fBM)) {
            return mcg.utB.bD(new Object[0]);
        }
        if (n == 29953) {
            switch (a2) {
                case fBV: {
                    return mcg.utD.bD(new Object[0]);
                }
                case fBN: {
                    return mcg.utH.bD(new Object[0]);
                }
                case fBL: {
                    return mcg.utI.bD(new Object[0]);
                }
                case fBO: {
                    return mcg.utJ.bD(new Object[0]);
                }
                case fBR: {
                    return mcg.utK.bD(new Object[0]);
                }
                case fBP: {
                    return mcg.utL.bD(new Object[0]);
                }
                case fBW: {
                    return mcg.utE.bD(95);
                }
                case fBX: {
                    return mcg.utF.bD(95);
                }
                case fBY: {
                    return mcg.utG.bD(3);
                }
                case fBK: {
                    return mcg.utM.bD(new Object[0]);
                }
                case fCa: {
                    return mdc.uFe.bD(new Object[0]);
                }
            }
        } else if (n == 29954) {
            switch (a2) {
                case fBN: {
                    return mcg.utO.bD(new Object[0]);
                }
                case fBR: {
                    return mcg.utP.bD(new Object[0]);
                }
                case fBS: {
                    return mcg.utQ.bD(new Object[0]);
                }
                case fBK: {
                    return mcg.utR.bD(new Object[0]);
                }
                case fBT: {
                    return mcg.utT.bD(new Object[0]);
                }
                case fBZ: {
                    return mcg.uuj.bD(new Object[0]);
                }
                case fCa: {
                    return mdc.uFg.bD(new Object[0]);
                }
            }
        } else if (n == 29957) {
            switch (a2) {
                case fBV: {
                    return mcg.utU.bD(new Object[0]);
                }
                case fBO: {
                    return mcg.utV.bD(new Object[0]);
                }
                case fBR: {
                    return mcg.utK.bD(new Object[0]);
                }
                case fBY: {
                    return mcg.utG.bD(3);
                }
                case fBK: {
                    return mcg.utW.bD(new Object[0]);
                }
                case fCa: {
                    return mdc.uFd.bD(new Object[0]);
                }
            }
        } else if (n == 29958) {
            switch (a2) {
                case fBN: {
                    return mcg.utX.bD(new Object[0]);
                }
                case fBU: {
                    return mcg.utY.bD(new Object[0]);
                }
                case fBK: {
                    return mcg.utZ.bD(new Object[0]);
                }
                case fBT: {
                    return mcg.uub.bD(new Object[0]);
                }
                case fBY: {
                    return mcg.uuc.bD(new Object[0]);
                }
                case fBZ: {
                    return mcg.uuj.bD(new Object[0]);
                }
                case fCa: {
                    return mdc.uFf.bD(new Object[0]);
                }
            }
        } else if (n == 29959) {
            switch (a2) {
                case fBN: {
                    return mcg.uud.bD(new Object[0]);
                }
                case fBK: {
                    return mcg.uue.bD(new Object[0]);
                }
                case fBZ: {
                    return mcg.uuj.bD(new Object[0]);
                }
            }
        }
        if (a2.equals((Object)a.fBK)) {
            return null;
        }
        return mcg.uml.bD(new Object[0]);
    }

    public static boolean il(String string) {
        char c2;
        char[] cArray = string.toCharArray();
        int n = 0;
        for (n = 0; n < cArray.length && (Character.isLetter(c2 = cArray[n]) || Character.isWhitespace(c2) || Character.isDigit(c2)); ++n) {
        }
        return n == cArray.length;
    }
}

