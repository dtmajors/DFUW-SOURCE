/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class ela
extends emr {
    private int ew = ayl.cze.ordinal();
    private String itI = null;
    private long itJ = 0L;
    private ayt itK = null;

    public ayl bIz() {
        return ayl.getValueByOrdinal(this.ew);
    }

    public void a(ayl ayl2) {
        this.ew = ayl2 == null ? this.ew : ayl2.ordinal();
    }

    public String bIA() {
        return this.itI;
    }

    public void kd(String string) {
        this.itI = string;
    }

    public long bIB() {
        return this.itJ;
    }

    public void ab(long l) {
        this.itJ = l;
    }

    public ayt bIC() {
        return this.itK;
    }

    public void a(ayt ayt2) {
        this.itK = ayt2;
    }

    ela() {
        super(13887);
    }

    public loz bIt() {
        ayl ayl2 = this.bIz();
        switch (ayl2) {
            case czj: {
                return ayl2.YF().bD(3);
            }
            case czk: {
                return ayl2.YF().bD(ayi.aaK());
            }
            case czm: {
                return ayl2.YF().bD(0);
            }
            case czn: {
                return ayl2.YF().bD(100);
            }
            case czo: {
                return ayl2.YF().bD(0);
            }
            case czp: {
                return ayl2.YF().bD(200);
            }
            case czs: 
            case czi: {
                return ayl2.YF().bD(this.itI == null ? "" : this.itI);
            }
            case czu: {
                return ayl2.YF().bD(86400L, this.itJ / 1000L);
            }
            case czt: {
                return ayl2.YF().bD(2000, cug.fkb);
            }
            case czv: {
                return ayl2.YF().bD(this.itK.iV());
            }
        }
        return ayl2.YF().bD(new Object[0]);
    }
}

