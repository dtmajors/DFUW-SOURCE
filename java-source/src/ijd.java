/*
 * Decompiled with CFR.
 */
public abstract class ijd
extends ijb
implements ija {
    private ijc mcy;
    private ipg<ijg> mcz;
    private ipg<ijg> mcA;
    private ipg<ijf> mcB;
    private ipg<Float> mcC;
    private ipg<Boolean> mcD;
    private ipg<Float> mcE = null;
    private ipg<Float> mcF = null;
    private int mck;
    private int mcl;

    public ijd(String string) {
        this.setName(string);
        this.mcE = new ipg<Float>(this, (ipf)this, "HUDRelativeX", hsu.ldg, true){
            final /* synthetic */ ijd mcG;
            {
                this.mcG = ijd2;
                super(ipf2, string, hsu2, bl);
            }

            public Float dW(int n, int n2) {
                int n3 = this.mcG.dO(n, n2);
                return Float.valueOf((float)n3 / (float)n);
            }

            public void dak() {
                ijd.a(this.mcG, (int)(((Float)ijd.b(this.mcG).get()).floatValue() * hso.cxK().cyc().W + 0.5f));
                this.mcG.pack();
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dW(n, n2);
            }
        };
        this.mcF = new ipg<Float>(this, (ipf)this, "HUDRelativeY", hsu.ldg, true){
            final /* synthetic */ ijd mcG;
            {
                this.mcG = ijd2;
                super(ipf2, string, hsu2, bl);
            }

            public Float dW(int n, int n2) {
                int n3 = this.mcG.dP(n, n2);
                return Float.valueOf((float)n3 / (float)n2);
            }

            public void dak() {
                ijd.b(this.mcG, (int)(((Float)ijd.c(this.mcG).get()).floatValue() * hso.cxK().cyc().H + 0.5f));
                this.mcG.pack();
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dW(n, n2);
            }
        };
        this.mck = 0;
        this.mcl = 0;
        this.mcz = new ipg<ijg>(this, (ipf)this, "HUDSnapX", hsu.ldg, true){
            final /* synthetic */ ijd mcG;
            {
                this.mcG = ijd2;
                super(ipf2, string, hsu2, bl);
            }

            public ijg dX(int n, int n2) {
                return this.mcG.dS(n, n2);
            }

            public void dak() {
                this.mcG.pack();
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dX(n, n2);
            }
        };
        this.mcA = new ipg<ijg>(this, (ipf)this, "HUDSnapY", hsu.ldg, true){
            final /* synthetic */ ijd mcG;
            {
                this.mcG = ijd2;
                super(ipf2, string, hsu2, bl);
            }

            public ijg dX(int n, int n2) {
                return this.mcG.dT(n, n2);
            }

            public void dak() {
                this.mcG.pack();
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dX(n, n2);
            }
        };
        this.mcB = new ipg<ijf>(this, (ipf)this, "HUDSize", hsu.ldg, true){
            final /* synthetic */ ijd mcG;
            {
                this.mcG = ijd2;
                super(ipf2, string, hsu2, bl);
            }

            public ijf dY(int n, int n2) {
                return this.mcG.dU(n, n2);
            }

            public void dak() {
                this.mcG.cZZ();
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dY(n, n2);
            }
        };
        this.mcC = new ipg<Float>(this, (ipf)this, "HUDAlpha", hsu.ldg, true){
            final /* synthetic */ ijd mcG;
            {
                this.mcG = ijd2;
                super(ipf2, string, hsu2, bl);
            }

            public Float dW(int n, int n2) {
                return this.mcG.dV(n, n2);
            }

            public void dak() {
                this.mcG.daa();
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dW(n, n2);
            }
        };
        this.mcD = new ipg<Boolean>(this, (ipf)this, "ASTAR", hsu.ldg, false){
            final /* synthetic */ ijd mcG;
            {
                this.mcG = ijd2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean daP() {
                return false;
            }

            public /* synthetic */ Object daQ() {
                return this.daP();
            }
        };
    }

    @Override
    public int day() {
        return this.mck;
    }

    @Override
    public void Rd(int n) {
        this.mcE.set(Float.valueOf((float)n / hso.cxK().cyc().W));
    }

    @Override
    public int daA() {
        return this.mcl;
    }

    @Override
    public void Rf(int n) {
        this.mcF.set(Float.valueOf((float)n / hso.cxK().cyc().H));
    }

    @Override
    public ijg daB() {
        return this.mcz.get();
    }

    @Override
    public void a(ijg ijg2) {
        this.mcz.set(ijg2);
    }

    @Override
    public ijg daC() {
        return this.mcA.get();
    }

    @Override
    public void b(ijg ijg2) {
        this.mcA.set(ijg2);
    }

    @Override
    public ijf daD() {
        return this.mcB.get();
    }

    @Override
    public void a(ijf ijf2) {
        this.mcB.set(ijf2);
    }

    @Override
    public float daE() {
        return this.mcC == null ? 1.0f : this.mcC.get().floatValue();
    }

    @Override
    public void kI(float f) {
        this.mcC.set(Float.valueOf(f));
    }

    @Override
    public ijc daw() {
        return this.mcy;
    }

    @Override
    public boolean cZt() {
        return this.djE() != null && this.djE().cZt() ? true : this.mcD.get();
    }

    public boolean daO() {
        return this.mcD.get();
    }

    public void qs(boolean bl) {
        this.mcD.set(bl);
    }

    public boolean cZX() {
        return false;
    }

    public Integer dO(int n, int n2) {
        return 0;
    }

    public Integer dP(int n, int n2) {
        return 0;
    }

    public ijg dS(int n, int n2) {
        return ijg.mcP;
    }

    public ijg dT(int n, int n2) {
        return ijg.mcP;
    }

    public ijf dU(int n, int n2) {
        return ijf.mcM;
    }

    public Float dV(int n, int n2) {
        return Float.valueOf(1.0f);
    }

    @Override
    public void qu(boolean bl) {
        if (bl) {
            if (this.mcy != null) {
                this.mcy.setVisible(true);
            } else {
                this.mcy = this.cZY();
                if (this.mcy != null) {
                    this.dah();
                    this.dax().a(this.mcy);
                }
            }
        } else if (this.mcy != null) {
            this.mcy.setVisible(false);
        }
    }

    @Override
    public void cNl() {
        if (this.mcy != null) {
            this.dai();
            this.mcy.removeFromParent();
            this.mcy = null;
        }
    }

    public abstract ijc cZY();

    public void dah() {
        this.mcy.qs(this.daO());
        this.mcy.a(this);
        this.mcy.kI(this.daE());
    }

    public void dai() {
        this.qs(this.mcy.cZt());
        this.a(this.mcy);
        this.kI(this.mcy.daE());
    }

    static /* synthetic */ int a(ijd ijd2, int n) {
        ijd2.mck = n;
        return ijd2.mck;
    }

    static /* synthetic */ ipg b(ijd ijd2) {
        return ijd2.mcE;
    }

    static /* synthetic */ int b(ijd ijd2, int n) {
        ijd2.mcl = n;
        return ijd2.mcl;
    }

    static /* synthetic */ ipg c(ijd ijd2) {
        return ijd2.mcF;
    }
}

