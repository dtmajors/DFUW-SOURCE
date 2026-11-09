/*
 * Decompiled with CFR.
 */
public class ijt
extends ijd
implements ija {
    private ipg<Boolean> meI;
    private ipg<Boolean> meJ;
    private ipg<Boolean> meK;

    public ijt() {
        super("FloatingText");
        this.rh(false);
        this.meI = new ipg<Boolean>(this, (ipf)this, "VisibleOnSelf", hsu.ldg, true){
            final /* synthetic */ ijt meL;
            {
                this.meL = ijt2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return true;
            }

            public void dak() {
                bjk.apI().dl((Boolean)this.get());
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.meJ = new ipg<Boolean>(this, (ipf)this, "VisibleOnTarget", hsu.ldg, true){
            final /* synthetic */ ijt meL;
            {
                this.meL = ijt2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return true;
            }

            public void dak() {
                bjk.apI().dk((Boolean)this.get());
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.meK = new ipg<Boolean>(this, (ipf)this, "VisibleProwessGain", hsu.ldg, true){
            final /* synthetic */ ijt meL;
            {
                this.meL = ijt2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return true;
            }

            public void dak() {
                bjk.apI().dm((Boolean)this.get());
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
    }

    @Override
    public ijc cZY() {
        return new iju();
    }

    @Override
    public void cZZ() {
        bjk.apI().kP(this.daD().ordinal());
    }

    @Override
    public void dah() {
        super.dah();
        iju iju2 = (iju)this.daw();
        iju2.qB(this.meI.get());
        iju2.qC(this.meJ.get());
        iju2.qD(this.meK.get());
    }

    @Override
    public void dai() {
        super.dai();
        iju iju2 = (iju)this.daw();
        this.meI.set(iju2.dbJ());
        this.meJ.set(iju2.dbK());
        this.meK.set(iju2.dbL());
    }
}

