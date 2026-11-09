/*
 * Decompiled with CFR.
 */
public class hjp {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    public final lmy.a kzY = new lmy.a("Root", lmx.a.a.rEX);
    public final lmy kzZ = this.kzY.evs();
    private final lmt kAa = null;
    private final lbi<fjt> kAb = new lbi<fjt>(this){
        final /* synthetic */ hjp kAd;
        {
            this.kAd = hjp2;
        }

        public void a(fjt fjt2) {
            if (fjt2.ila) {
                lna.a a2 = new lna.a(fjt2.iOi, hjp.a(this.kAd));
                this.kAd.kzY.a(fjt2.Name, a2, null);
            } else {
                this.kAd.kzY.removeField(fjt2.Name);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjt)object);
        }
    };
    private final lbi<fju> kAc = new lbi<fju>(this){
        final /* synthetic */ hjp kAd;
        {
            this.kAd = hjp2;
        }

        public void a(fju fju2) {
            if (fju2.lu == null) {
                return;
            }
            int n = this.kAd.kzZ.eve().AN(fju2.Name);
            if (n == -1) {
                return;
            }
            lna.a a2 = (lna.a)this.kAd.kzZ.eve().evf().get((int)n).kza;
            lna lna2 = (lna)this.kAd.kzZ.ewx().get(n);
            lna lna3 = a2.at(fju2.lu);
            if (lna2 == null) {
                this.kAd.kzZ.a(n, (lmv)lna3);
            } else {
                if (lna2.rFi == fju2.lu) {
                    return;
                }
                lna2.c(lna3);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fju)object);
        }
    };

    public hjp(lha<dxq, dxq> lha2) {
        this.cdh = lha2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, fju.class, this.kAc);
        this.cdh.rex.a(bl, fjt.class, this.kAb);
    }

    static /* synthetic */ lmt a(hjp hjp2) {
        return hjp2.kAa;
    }
}

