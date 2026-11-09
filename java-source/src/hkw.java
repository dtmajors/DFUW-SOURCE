/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hkw
extends hdj {
    private final lbn keI = new lbn(this){
        final /* synthetic */ hkw kCv;
        {
            this.kCv = hkw2;
        }

        public void W() {
            hkw.a(this.kCv);
        }
    };
    private heq kCu;

    public hkw(hdm hdm2) {
        super(hdm2, null, "ITEMCOUNTER", 311, joj.nIK);
        hdm2.jZL.cdf().cec().a(true, this.keI);
    }

    @Override
    public void cbg() {
        this.jLM.jZL.cdf().cec().a(false, this.keI);
        super.cbg();
    }

    @Override
    protected hen cdl() {
        this.kCu = new heq(this.jLM, null, lgg.rlI, new hdj.a(this), this.jLM.jZL.cdf().getValue());
        lhf lhf2 = this.kCu.cqv();
        lgg lgg2 = this.jLM.e(this.jLM.jXk.jUh, lhf2);
        this.kCu.z(lgg2);
        return this.kCu;
    }

    private void cpi() {
        if (this.cdi()) {
            hms hms2 = this.jLM.jZH.crp();
            lgg lgg2 = this.kCu.cqw();
            this.closeWindow();
            this.cdk();
            this.kCu.z(lgg2);
            if (hms2 != null) {
                hms2.cqV();
            }
        }
    }

    static /* synthetic */ void a(hkw hkw2) {
        hkw2.cpi();
    }
}

