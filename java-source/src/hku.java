/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hku
extends hkr
implements lbq {
    public final bqm.b kCo;
    private String kCp;

    public hku(hdm hdm2, bqm.b b2) {
        this(hdm2, b2, hku.a(hdm2, b2));
    }

    private hku(hdm hdm2, bqm.b b2, a a2) {
        super(hdm2, null, "INVENTORY", a2.kCs, a2.kCr, false, false, true, true, null);
        this.kCo = b2;
    }

    public final String cpg() {
        hee hee2 = this.cjv();
        if (hee2 == null) {
            return this.kCp;
        }
        return hee2.kdC.Name;
    }

    public final void mU(String string) {
        this.kCp = string;
    }

    @Override
    protected hgm cpc() {
        a a2 = hku.a(this.jLM, this.cjv().kdF);
        lgg lgg2 = a2.kCt;
        if (lgg2 != null) {
            lgg2 = new lgg(lgg2.cf + this.jLM.jXk.jPK.rmN / 2, lgg2.cg + this.jLM.jXk.jPK.H / 2);
        }
        hgm hgm2 = new hgm(this.jLM, null, lgg.rlI, lhf.rnv, new hpw.a(a2.ktG, lcq.COLORSHIFT_NEUTRAL), this.cjv(), lgg2);
        return hgm2;
    }

    @Override
    public boolean d(lfu lfu2) {
        return super.d(lfu2);
    }

    @Override
    protected void cpd() {
        this.kCp = "Unknown";
        super.cpd();
    }

    @Override
    public String toString() {
        return null;
    }

    private static final a a(hdm hdm2, bqm.b b2) {
        switch (b2) {
            default: {
                assert (false) : b2;
                return hku.a(hdm2, bqm.b.dEP);
            }
            case dEo: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEp: {
                return new a(null, hdm2.jYf, hdm2.jXk.jMG, null, hdm2.jXk.jMF);
            }
            case dEP: {
                return new a(null, hdm2.jXQ, hdm2.jXk.jMC, null, hdm2.jXk.jMB);
            }
            case dEq: {
                return new a(null, hdm2.jYj, hdm2.jXk.jMM, null, hdm2.jXk.jML);
            }
            case dEr: {
                return new a(null, hdm2.jYh, hdm2.jXk.jMC, null, hdm2.jXk.jMN);
            }
            case dEs: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEt: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEu: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEv: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEw: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEx: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEy: {
                return new a(null, hdm2.jYb, hdm2.jXk.jMI, null, hdm2.jXk.jMH);
            }
            case dEz: {
                return new a(null, hdm2.jYb, hdm2.jXk.jMI, null, hdm2.jXk.jMH);
            }
            case dEA: {
                return new a(null, hdm2.jYd, hdm2.jXk.jMK, null, hdm2.jXk.jMJ);
            }
            case dEC: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dED: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEE: {
                return new a(null, hdm2.jXZ, hdm2.jXk.jME, null, hdm2.jXk.jMD);
            }
            case dEF: {
                return new a(null, hdm2.jYb, hdm2.jXk.jMI, null, hdm2.jXk.jMH);
            }
            case dEG: {
                return new a(null, hdm2.jYb, hdm2.jXk.jMI, null, hdm2.jXk.jMH);
            }
            case dEH: {
                return new a(null, hdm2.jYb, hdm2.jXk.jMI, null, hdm2.jXk.jMH);
            }
            case dEL: 
        }
        return new a(null, hdm2.jYl, hdm2.jXk.jMQ, null, hdm2.jXk.jMP);
    }
}

