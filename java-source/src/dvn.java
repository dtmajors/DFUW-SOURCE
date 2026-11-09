/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.sql.Timestamp;

public class dvn
extends dvl {
    private int hfG = 0;
    private int hfH = -1;
    private ljq Position = null;
    private int ResourceType = -1;
    private String Name = null;
    private ldv hgi = null;
    private String aGt = null;
    private Timestamp hgj = null;
    private Timestamp hgk = null;
    private ldv hgl = null;
    private String hgm = null;
    private int hgn = -1;

    public int bBz() {
        return this.hfH;
    }

    public ljq av() {
        return this.Position;
    }

    public int az() {
        return this.ResourceType;
    }

    public String getName() {
        return this.Name;
    }

    public ldv bBL() {
        return this.hgi;
    }

    public String bBM() {
        return this.aGt;
    }

    public Timestamp bBN() {
        return this.hgj;
    }

    public Timestamp bBO() {
        return this.hgk;
    }

    public ldv bBP() {
        return this.hgl;
    }

    public String bBQ() {
        return this.hgm;
    }

    public int bBR() {
        return this.hgn;
    }

    private dvn() {
    }

    public void a(String string, boolean bl, String string2) {
        lfn.b(2, string, string2 + "Resource       : " + this.ResourceType);
        lfn.b(2, string, string2 + "Name           : " + this.Name);
        lfn.b(2, string, string2 + "Position       : " + this.Position);
        lfn.b(2, string, string2 + "Placer         : " + this.aGt + " " + this.hgi);
        lfn.b(2, string, string2 + "Placed Time    : " + this.hgj);
        if (this.hgk != null) {
            if (this.hgl.equals(lcr.qAC)) {
                lfn.b(2, string, string2 + "-- Still Standing at Challenge/Attacker End! --");
            } else {
                lfn.b(2, string, string2 + "Destroyer      : " + this.hgm + " " + this.hgl);
                lfn.b(2, string, string2 + "Destroyed Time : " + this.hgk);
                lfn.b(2, string, string2 + "Wager Reward   : " + this.hgn);
            }
        }
    }

    public static dvn b(lmi[] lmiArray, lmg[] lmgArray) {
        if (lmiArray == null || lmgArray == null || lmiArray.length != lmgArray.length) {
            return null;
        }
        dvn dvn2 = new dvn();
        block13: for (int i = 0; i < lmiArray.length; ++i) {
            a a2 = a.getValueByName(lmgArray[i].getName());
            if (a2 == null || a2.getType() != lmj.adz(lmiArray[i].getType())) continue;
            if (lmiArray[i].euR()) {
                if (!a2.bBK()) continue;
                ++dvn2.hfG;
                continue;
            }
            switch (a2) {
                case hgp: {
                    dvn2.hfH = dvn.d(lmiArray[i]);
                    if (dvn2.hfH < 0) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgq: {
                    dvn2.Position = dvn.j(lmiArray[i]);
                    if (dvn2.Position == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgr: {
                    dvn2.ResourceType = dvn.d(lmiArray[i]);
                    if (dvn2.ResourceType < 0) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgs: {
                    dvn2.Name = dvn.c(lmiArray[i]);
                    if (dvn2.Name == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgt: {
                    dvn2.hgi = dvn.h(lmiArray[i]);
                    if (dvn2.hgi == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgu: {
                    dvn2.aGt = dvn.c(lmiArray[i]);
                    if (dvn2.aGt == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgv: {
                    dvn2.hgj = dvn.i(lmiArray[i]);
                    if (dvn2.hgj == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgw: {
                    dvn2.hgk = dvn.i(lmiArray[i]);
                    if (dvn2.hgk == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgx: {
                    dvn2.hgl = dvn.h(lmiArray[i]);
                    if (dvn2.hgl == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgy: {
                    dvn2.hgm = dvn.c(lmiArray[i]);
                    if (dvn2.hgm == null) continue block13;
                    ++dvn2.hfG;
                    continue block13;
                }
                case hgz: {
                    dvn2.hgn = dvn.d(lmiArray[i]);
                    if (dvn2.hgn < 0) continue block13;
                    ++dvn2.hfG;
                }
            }
        }
        return dvn2;
    }
}

