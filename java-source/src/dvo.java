/*
 * Decompiled with CFR.
 */
public class dvo
extends dvl {
    private int hfG = 0;
    private int hfI = -1;
    private ldv hgB = null;
    private String hgC = null;
    private ldv ade = null;
    private String add = null;
    private int hgD = -1;
    private boolean dis = false;

    public int bBA() {
        return this.hfI;
    }

    public ldv bBS() {
        return this.hgB;
    }

    public String bBT() {
        return this.hgC;
    }

    public ldv iG() {
        return this.ade;
    }

    public String iV() {
        return this.add;
    }

    public int bBU() {
        return this.hgD;
    }

    public boolean aov() {
        return this.dis;
    }

    private dvo() {
    }

    public void a(String string, boolean bl, String string2) {
        lfn.b(2, string, string2 + "Damager      : " + this.hgC + " " + this.hgB);
        lfn.b(2, string, string2 + "Damager Clan : " + this.add + " " + this.ade);
        lfn.b(2, string, string2 + "Damage Done  : " + this.hgD);
        lfn.b(2, string, string2 + "Critical Hit : " + this.dis);
    }

    public static dvo c(lmi[] lmiArray, lmg[] lmgArray) {
        if (lmiArray == null || lmgArray == null || lmiArray.length != lmgArray.length) {
            return null;
        }
        dvo dvo2 = new dvo();
        block9: for (int i = 0; i < lmiArray.length; ++i) {
            a a2 = a.getValueByName(lmgArray[i].getName());
            if (a2 == null || a2.getType() != lmj.adz(lmiArray[i].getType())) continue;
            if (lmiArray[i].euR()) {
                if (!a2.bBK()) continue;
                ++dvo2.hfG;
                continue;
            }
            switch (a2) {
                case hgF: {
                    dvo2.hfI = dvo.d(lmiArray[i]);
                    if (dvo2.hfI < 0) continue block9;
                    ++dvo2.hfG;
                    continue block9;
                }
                case hgG: {
                    dvo2.hgB = dvo.h(lmiArray[i]);
                    if (dvo2.hgB == null) continue block9;
                    ++dvo2.hfG;
                    continue block9;
                }
                case hgH: {
                    dvo2.hgC = dvo.c(lmiArray[i]);
                    if (dvo2.hgC == null) continue block9;
                    ++dvo2.hfG;
                    continue block9;
                }
                case hgI: {
                    dvo2.ade = dvo.h(lmiArray[i]);
                    if (dvo2.ade == null) continue block9;
                    ++dvo2.hfG;
                    continue block9;
                }
                case hgJ: {
                    dvo2.add = dvo.c(lmiArray[i]);
                    if (dvo2.add == null) continue block9;
                    ++dvo2.hfG;
                    continue block9;
                }
                case hgK: {
                    dvo2.hgD = dvo.d(lmiArray[i]);
                    if (dvo2.hgD < 0) continue block9;
                    ++dvo2.hfG;
                    continue block9;
                }
                case hgL: {
                    dvo2.dis = dvo.b(lmiArray[i]);
                    ++dvo2.hfG;
                }
            }
        }
        return dvo2;
    }
}

