/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class dvm
extends dvl {
    private int hfG = 0;
    private int hfH = -1;
    private int hfI = -1;
    private ldv cIq = null;
    private String cIr = null;
    private int hfJ = -1;
    private int hfK = -1;
    private String hfL = null;
    private Timestamp hfM = null;
    private int aEx = -1;
    private int aEi = -1;
    private Timestamp hfN = null;
    private dxl.c hfO = null;
    private int hfP = -1;
    private List<dvn> hfQ = lcn.emA();
    private Map<Integer, dvq> hfR = lcn.emw();

    public int bBz() {
        return this.hfH;
    }

    public int bBA() {
        return this.hfI;
    }

    public ldv afr() {
        return this.cIq;
    }

    public String afs() {
        return this.cIr;
    }

    public int bBB() {
        return this.hfJ;
    }

    public int bBC() {
        return this.hfK;
    }

    public String bBD() {
        return this.hfL;
    }

    public Timestamp bBE() {
        return this.hfM;
    }

    public int Dl() {
        return this.aEx;
    }

    public int adA() {
        return this.aEi;
    }

    public Timestamp bBF() {
        return this.hfN;
    }

    public dxl.c bBG() {
        return this.hfO;
    }

    public int bBH() {
        return this.hfP;
    }

    public Iterable<dvn> bBI() {
        return this.hfQ;
    }

    public void a(dvn dvn2) {
        this.hfQ.add(dvn2);
    }

    public dvq CA(int n) {
        return this.hfR.get(n);
    }

    public Iterable<dvq> bBJ() {
        return this.hfR.values();
    }

    public void a(dvq dvq2) {
        if (dvq2 != null && dvq2.bCb() >= 0) {
            this.hfR.put(dvq2.bCb(), dvq2);
        }
    }

    private dvm() {
    }

    public void a(String string, boolean bl, String string2) {
        lfn.b(2, string, string2 + "Attacker    : " + this.cIr + " " + this.cIq);
        lfn.b(2, string, string2 + "Initiator   : " + this.hfL + " " + this.hfK);
        lfn.b(2, string, string2 + "Joined Time : " + this.hfM);
        lfn.b(2, string, string2 + "Gold Cost   : " + this.aEx);
        lfn.b(2, string, string2 + "Wager       : " + this.aEi);
        lfn.b(2, string, string2 + "Status      : " + (Object)((Object)this.hfO));
        if (this.hfN != null) {
            lfn.b(2, string, string2 + "End Time    : " + this.hfN);
            lfn.b(2, string, string2 + "Wager Won   : " + this.hfP);
        }
        if (bl) {
            int n;
            String string3;
            if (!this.hfQ.isEmpty()) {
                string3 = this.a('-', 100 - string2.length());
                lfn.b(2, string, string2 + string3);
                lfn.b(2, string, string2 + "Siege-Stones");
                lfn.b(2, string, string2 + string3);
                n = 0;
                for (dvn dvl2 : this.hfQ) {
                    dvl2.a(string, true, string2 + string2);
                    if (n < this.hfQ.size() - 1) {
                        lfn.b(2, string, string2 + string3);
                    }
                    ++n;
                }
            }
            if (!this.hfR.isEmpty()) {
                string3 = this.a('-', 100 - string2.length());
                lfn.b(2, string, string2 + string3);
                lfn.b(2, string, string2 + "Defener Mercenaries");
                lfn.b(2, string, string2 + string3);
                n = 0;
                for (dvq dvq2 : this.hfR.values()) {
                    dvq2.x(string, string2 + string2);
                    if (n < this.hfR.size() - 1) {
                        lfn.b(2, string, string2 + string3);
                    }
                    ++n;
                }
            }
        }
    }

    public static dvm a(lmi[] lmiArray, lmg[] lmgArray) {
        if (lmiArray == null || lmgArray == null || lmiArray.length != lmgArray.length) {
            return null;
        }
        dvm dvm2 = new dvm();
        block15: for (int i = 0; i < lmiArray.length; ++i) {
            a a2 = a.getValueByName(lmgArray[i].getName());
            if (a2 == null || a2.getType() != lmj.adz(lmiArray[i].getType())) continue;
            if (lmiArray[i].euR()) {
                if (!a2.bBK()) continue;
                ++dvm2.hfG;
                continue;
            }
            switch (a2) {
                case hfT: {
                    dvm2.hfH = dvm.d(lmiArray[i]);
                    if (dvm2.hfH < 0) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hfU: {
                    dvm2.hfI = dvm.d(lmiArray[i]);
                    if (dvm2.hfI < 0) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hfV: {
                    dvm2.cIq = dvm.h(lmiArray[i]);
                    if (dvm2.cIq == null) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hfW: {
                    dvm2.cIr = dvm.c(lmiArray[i]);
                    if (dvm2.cIr == null) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hfX: {
                    dvm2.hfJ = dvm.d(lmiArray[i]);
                    if (dvm2.hfJ < 0) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hfY: {
                    dvm2.hfK = dvm.d(lmiArray[i]);
                    if (dvm2.hfK < 0) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hfZ: {
                    dvm2.hfL = dvm.c(lmiArray[i]);
                    if (dvm2.hfL == null) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hga: {
                    dvm2.hfM = dvm.i(lmiArray[i]);
                    if (dvm2.hfM == null) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hgb: {
                    dvm2.aEx = dvm.d(lmiArray[i]);
                    if (dvm2.aEx < 0) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hgc: {
                    dvm2.aEi = dvm.d(lmiArray[i]);
                    if (dvm2.aEi < 0) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hgd: {
                    dvm2.hfN = dvm.i(lmiArray[i]);
                    if (dvm2.hfN == null) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hge: {
                    dvm2.hfO = dvm.a(lmiArray[i]);
                    if (dvm2.hfO == null) continue block15;
                    ++dvm2.hfG;
                    continue block15;
                }
                case hgf: {
                    dvm2.hfP = dvm.d(lmiArray[i]);
                    if (dvm2.hfP < 0) continue block15;
                    ++dvm2.hfG;
                }
            }
        }
        return dvm2;
    }
}

