/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;

public class dvq
extends dvl {
    private int hfG = 0;
    private int hhd = -1;
    private int hfI = -1;
    private ldv cIK = null;
    private String cIL = null;
    private ldv hhe = null;
    private String hhf = null;
    private Timestamp hhg = null;
    private int hhh = -1;
    private int hhi = -1;
    private Timestamp hfN = null;
    private dxl.c hfO = null;

    public int bCb() {
        return this.hhd;
    }

    public int bBA() {
        return this.hfI;
    }

    public ldv afM() {
        return this.cIK;
    }

    public String afN() {
        return this.cIL;
    }

    public ldv bCc() {
        return this.hhe;
    }

    public String bCd() {
        return this.hhf;
    }

    public Timestamp bCe() {
        return this.hhg;
    }

    public int bCf() {
        return this.hhh;
    }

    public int afO() {
        return this.hhi;
    }

    public Timestamp bBF() {
        return this.hfN;
    }

    public dxl.c bBG() {
        return this.hfO;
    }

    private dvq() {
    }

    public void x(String string, String string2) {
        lfn.b(2, string, string2 + "Mercenary                 : " + this.cIL + " " + this.cIK);
        lfn.b(2, string, string2 + "Employer                  : " + this.hhf + " " + this.hhe);
        lfn.b(2, string, string2 + "Join Time                 : " + this.hhg);
        lfn.b(2, string, string2 + "Wager Percentage Reward   : " + this.hhh);
        lfn.b(2, string, string2 + "Flat-Fee Reward           : " + this.hhi);
        lfn.b(2, string, string2 + "Status                    : " + (Object)((Object)this.hfO));
        if (this.hfN != null) {
            lfn.b(2, string, string2 + "End Time                  : " + this.hfN);
        }
    }

    public static dvq e(lmi[] lmiArray, lmg[] lmgArray) {
        if (lmiArray == null || lmgArray == null || lmiArray.length != lmgArray.length) {
            return null;
        }
        dvq dvq2 = new dvq();
        block13: for (int i = 0; i < lmiArray.length; ++i) {
            a a2 = a.getValueByName(lmgArray[i].getName());
            if (a2 == null || a2.getType() != lmj.adz(lmiArray[i].getType())) continue;
            if (lmiArray[i].euR()) {
                if (!a2.bBK()) continue;
                ++dvq2.hfG;
                continue;
            }
            switch (a2) {
                case hhk: {
                    dvq2.hhd = dvq.d(lmiArray[i]);
                    if (dvq2.hhd < 0) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhl: {
                    dvq2.hfI = dvq.d(lmiArray[i]);
                    if (dvq2.hfI < 0) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhm: {
                    dvq2.cIK = dvq.h(lmiArray[i]);
                    if (dvq2.cIK == null) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhn: {
                    dvq2.cIL = dvq.c(lmiArray[i]);
                    if (dvq2.cIL == null) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hho: {
                    dvq2.hhe = dvq.h(lmiArray[i]);
                    if (dvq2.hhe == null) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhp: {
                    dvq2.hhf = dvq.c(lmiArray[i]);
                    if (dvq2.hhf == null) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhq: {
                    dvq2.hhg = dvq.i(lmiArray[i]);
                    if (dvq2.hhg == null) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhr: {
                    dvq2.hhh = dvq.d(lmiArray[i]);
                    if (dvq2.hhh < 0) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhs: {
                    dvq2.hhi = dvq.d(lmiArray[i]);
                    if (dvq2.hhi < 0) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hht: {
                    dvq2.hfN = dvq.i(lmiArray[i]);
                    if (dvq2.hfN == null) continue block13;
                    ++dvq2.hfG;
                    continue block13;
                }
                case hhu: {
                    dvq2.hfO = dvq.a(lmiArray[i]);
                    if (dvq2.hfO == null) continue block13;
                    ++dvq2.hfG;
                }
            }
        }
        return dvq2;
    }
}

