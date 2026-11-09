/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class dvp
extends dvl {
    private int hfG = 0;
    private int hfI = -1;
    private ldv cIl = null;
    private String cIz = null;
    private int hgN = -1;
    private ldv aDk = null;
    private String hgO = null;
    private Timestamp hgP = null;
    private Timestamp hfN = null;
    private dxl.c hfO = null;
    private Map<Integer, dvm> cMa = lcn.emw();
    private Map<Integer, dvq> hgQ = lcn.emw();
    private List<dvo> hgR = lcn.emA();

    public int bBA() {
        return this.hfI;
    }

    public ldv afk() {
        return this.cIl;
    }

    public String afB() {
        return this.cIz;
    }

    public int bBV() {
        return this.hgN;
    }

    public ldv acm() {
        return this.aDk;
    }

    public String bBW() {
        return this.hgO;
    }

    public Timestamp bBX() {
        return this.hgP;
    }

    public Timestamp bBF() {
        return this.hfN;
    }

    public dxl.c bBG() {
        return this.hfO;
    }

    public dvm CB(int n) {
        return this.cMa.get(n);
    }

    public Iterable<dvm> bBY() {
        return this.cMa.values();
    }

    public void a(dvm dvm2) {
        if (dvm2 != null && dvm2.bBz() >= 0) {
            this.cMa.put(dvm2.bBz(), dvm2);
        }
    }

    public dvq CC(int n) {
        return this.hgQ.get(n);
    }

    public Iterable<dvq> bBZ() {
        return this.hgQ.values();
    }

    public void a(dvq dvq2) {
        if (dvq2 != null && dvq2.bCb() >= 0) {
            this.hgQ.put(dvq2.bCb(), dvq2);
        }
    }

    public Iterable<dvo> bCa() {
        return this.hgR;
    }

    public void a(dvo dvo2) {
        this.hgR.add(dvo2);
    }

    private dvp() {
    }

    public void a(String string, boolean bl, String string2) {
        lfn.b(2, string, string2 + "City     : " + this.hgO + " " + this.aDk);
        lfn.b(2, string, string2 + "Defender : " + this.cIz + " " + this.cIl);
        lfn.b(2, string, string2 + "Started  : " + this.hgP);
        lfn.b(2, string, string2 + "Status   : " + (Object)((Object)this.hfO));
        if (this.hfN != null) {
            lfn.b(2, string, string2 + "Ended    : " + this.hfN);
        }
        if (bl) {
            String string3 = this.a('-', 100 - string2.length());
            lfn.b(2, string, string2 + string3);
            lfn.b(2, string, string2 + "Attackers");
            lfn.b(2, string, string2 + string3);
            int n = 0;
            for (dvm dvl2 : this.cMa.values()) {
                dvl2.a(string, true, string2 + string2);
                if (n < this.cMa.size() - 1) {
                    lfn.b(2, string, string2 + string3);
                }
                ++n;
            }
            if (!this.hgQ.isEmpty()) {
                lfn.b(2, string, string2 + string3);
                lfn.b(2, string, string2 + "Defener Mercenaries");
                lfn.b(2, string, string2 + string3);
                n = 0;
                for (dvq dvq2 : this.hgQ.values()) {
                    dvq2.x(string, string2 + string2);
                    if (n < this.hgQ.size() - 1) {
                        lfn.b(2, string, string2 + string3);
                    }
                    ++n;
                }
            }
            if (!this.hgR.isEmpty()) {
                lfn.b(2, string, string2 + string3);
                lfn.b(2, string, string2 + "Bind-Stone Damagers");
                lfn.b(2, string, string2 + string3);
                n = 0;
                for (dvo dvo2 : this.hgR) {
                    dvo2.a(string, true, string2 + string2);
                    if (n < this.hgR.size() - 1) {
                        lfn.b(2, string, string2 + string3);
                    }
                    ++n;
                }
            }
        }
    }

    public static dvp d(lmi[] lmiArray, lmg[] lmgArray) {
        if (lmiArray == null || lmgArray == null || lmiArray.length != lmgArray.length) {
            return null;
        }
        dvp dvp2 = new dvp();
        block11: for (int i = 0; i < lmiArray.length; ++i) {
            a a2 = a.getValueByName(lmgArray[i].getName());
            if (a2 == null || a2.getType() != lmj.adz(lmiArray[i].getType())) continue;
            if (lmiArray[i].euR()) {
                if (!a2.bBK()) continue;
                ++dvp2.hfG;
                continue;
            }
            switch (a2) {
                case hgT: {
                    dvp2.hfI = dvp.d(lmiArray[i]);
                    if (dvp2.hfI < 0) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hgU: {
                    dvp2.cIl = dvp.h(lmiArray[i]);
                    if (dvp2.cIl == null) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hgV: {
                    dvp2.cIz = dvp.c(lmiArray[i]);
                    if (dvp2.cIz == null) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hgW: {
                    dvp2.hgN = dvp.d(lmiArray[i]);
                    if (dvp2.hgN < 0) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hgX: {
                    dvp2.aDk = dvp.h(lmiArray[i]);
                    if (dvp2.aDk == null) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hgY: {
                    dvp2.hgO = dvp.c(lmiArray[i]);
                    if (dvp2.hgO == null) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hgZ: {
                    dvp2.hgP = dvp.i(lmiArray[i]);
                    if (dvp2.hgP == null) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hha: {
                    dvp2.hfN = dvp.i(lmiArray[i]);
                    if (dvp2.hfN == null) continue block11;
                    ++dvp2.hfG;
                    continue block11;
                }
                case hhb: {
                    dvp2.hfO = dvp.a(lmiArray[i]);
                    if (dvp2.hfO == null) continue block11;
                    ++dvp2.hfG;
                }
            }
        }
        return dvp2;
    }
}

