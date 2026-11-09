/*
 * Decompiled with CFR.
 */
public class hcd
extends hce {
    public final hff jET;
    private hfa jEU = hfa.LEVEL_NONE;
    private boolean jEV = false;
    private float jEW = 1.0f;
    private boolean jEX;
    private double jEY = 0.0;
    private static final float jEZ = 0.25f;
    private static final float jFa = 0.99f;
    private static final float jFb = 1.5f;
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hcd jFc;
        {
            this.jFc = hcd2;
        }

        public void W() {
            hcd.a(this.jFc);
        }
    };

    public hcd(hff hff2, hqx.a a2) {
        super(hff2.jIm.dXw, (String)null, (hmi)hff2, a2, hff2.khb, true);
        this.jET = hff2;
    }

    @Override
    protected void cbT() {
        this.jET.cbE();
    }

    @Override
    protected void cbU() {
        this.jET.cgP();
    }

    private void cbH() {
        if (!this.jEV) {
            return;
        }
        if (this.jET.jIm.dXw.kAz.emb() - this.jEY > 0.75) {
            this.jEW = this.jEX ? 0.99f : 0.25f;
        } else {
            double d2 = (this.jET.jIm.dXw.kAz.emb() - this.jEY) / 0.75;
            double d3 = d2 * (double)0.74f;
            if (d3 < 0.0) {
                lfn.b(5, "SFButtonTabChat", "tick(): Val=" + d3 + " Frac=" + d2);
                d3 = 0.0;
            }
            if (this.jEX) {
                this.jEW = (float)((double)this.jEW + d3);
                if (this.jEW > 0.99f) {
                    this.jEX = false;
                    this.jEW = 0.99f;
                }
            } else {
                this.jEW = (float)((double)this.jEW - d3);
                if (this.jEW < 0.25f) {
                    this.jEX = true;
                    this.jEW = 0.25f;
                }
            }
        }
        this.jEW = Math.min(0.99f, Math.max(0.25f, this.jEW));
        this.jEY = this.jET.jIm.dXw.kAz.emb();
        this.M(new lcq(1.0f, 1.0f, 1.0f, this.jEW));
    }

    public void a(hfa hfa2) {
        if (this.jEU == hfa2) {
            return;
        }
        this.jEU = hfa2;
        if (this.jEV && this.jEU == hfa.LEVEL_NONE) {
            this.jET.jIm.dXw.kAz.eme().a(false, this.jEL);
            this.jEV = false;
            this.c(this.kZH.jHz.kiK);
            this.M(lcq.COLORSHIFT_NEUTRAL);
        } else if (!this.jEV && this.jEU != hfa.LEVEL_NONE) {
            this.jEV = true;
            this.jET.jIm.dXw.kAz.eme().a(true, this.jEL);
            this.jEW = 1.0f;
            this.jEX = false;
            this.jEY = this.jET.jIm.dXw.kAz.emb();
            this.c(new hpe.e(this.kZH.jHz.kiK.jFE, this.jET.jIm.kgI.b(this.jEU), hpe.a.kUO, hpe.b.kUT));
        }
    }

    @Override
    public boolean a(hmt hmt2, boolean bl) {
        if (hmt2 instanceof hiq) {
            hiq hiq2 = (hiq)hmt2;
            boolean bl2 = hiq2.jIQ.Identifier.equalsIgnoreCase(this.jET.cgK());
            if (!this.jET.khc && !bl2) {
                return false;
            }
            if (bl) {
                return true;
            }
            int n = hiq2.v(hiq2.cqu());
            hiq2.jIQ.b(this.jET, n);
            return false;
        }
        if (hmt2 instanceof hob) {
            if (!this.jET.khc) {
                return false;
            }
            if (bl) {
                return true;
            }
            this.jET.k(this.jET.jIm.dXw.cqu());
            return false;
        }
        return false;
    }

    static /* synthetic */ void a(hcd hcd2) {
        hcd2.cbH();
    }
}

