/*
 * Decompiled with CFR.
 */
public class iiu
extends iir {
    public static final String mbL = "casting_and_breath_background";
    public static final String mbM = "breath_foreground";
    public static final String mbN = "breath_leading_edge_glow";
    public static final String mbO = "_large";
    public static final String mbP = "_normal";
    public static final String mbQ = "_small";
    private irr ljc = null;
    private float mbR = 0.0f;
    private ist mbS = null;
    private double mbT = 0.0;
    private String mbU = null;
    private ipx mbV = ipx.l(new ipf[0]);

    public iiu() {
        super("BreathBar");
        this.W(this.mbV);
        this.dap();
        this.mbV.W(ipx.a(4, 1, new ipf[0]));
        this.mbS = new ist("0:0");
        this.mbS.b(isf.mwM);
        this.mbS.zY(this.daq());
        this.mbS.Rk(0xE0E0E0);
        this.mbS.sv(false);
        this.mbS.setSize(40, 14);
        this.mbS.a(ite.myG);
        this.mbV.W(ipx.a(40, 14, this.mbS));
        hso.cxK().cxP().cyZ().lgz.c(new jlr<iiu, Float>(this, this){
            final /* synthetic */ iiu mbW;
            {
                this.mbW = iiu2;
                super(iiu3);
            }

            public void a(iiu iiu2, Float f) {
                if (iiu.a(this.mbW) == null) {
                    return;
                }
                if (f.floatValue() < 0.0f) {
                    this.mbW.setVisible(false);
                    return;
                }
                iiu.a(this.mbW, f.floatValue() < 0.0f ? 0.0f : (f.floatValue() > 1.0f ? 1.0f : f.floatValue()));
                iiu.a(this.mbW).setProgress(iiu.b(this.mbW));
                iiu.a(this.mbW).OI(iiu.b(this.mbW) < 0.25f ? 1 : 0);
                this.mbW.daj();
                this.mbW.setVisible(iiu.b(this.mbW) <= 1.0f && iiu.b(this.mbW) >= 0.0f);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((iiu)object, (Float)object2);
            }
        });
        hso.cxK().cxP().cyZ().lgA.c(new jlr<iiu, Double>(this, this){
            final /* synthetic */ iiu mbW;
            {
                this.mbW = iiu2;
                super(iiu3);
            }

            public void a(iiu iiu2, Double d2) {
                iiu.a(this.mbW, d2);
                this.mbW.daj();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((iiu)object, (Double)object2);
            }
        });
        this.setVisible(false);
    }

    private void dap() {
        if (this.ljc != null) {
            this.mbV.X(this.ljc);
        }
        irs irs2 = new irs();
        irs2.qu(this.qt(mbL));
        irs2.ra(this.qt(mbM));
        irs2.sh(true);
        irs2.rd(this.qt(mbN));
        irs2.dt(-1.0);
        irs2.sj(true);
        irs2.Sn(2);
        this.ljc = new irr(irs2);
        this.mbV.c(this.ljc, 0);
        this.ljc.setProgress(this.mbR);
        this.ljc.OI(this.mbR < 0.25f ? 1 : 0);
        if (this.mbS != null) {
            this.mbS.zY(this.daq());
        }
    }

    @Override
    protected void daj() {
        if (this.dag()) {
            String string;
            this.mbS.setVisible(true);
            double d2 = this.mbT * (double)this.mbR;
            int n = (int)d2;
            if (n < 0) {
                this.mbS.setVisible(false);
            }
            if ((string = "" + n).equals(this.mbU)) {
                return;
            }
            this.mbS.setText(string);
            this.mbU = string;
        } else {
            this.mbS.setVisible(false);
        }
    }

    private String qt(String string) {
        switch (this.daD()) {
            case mcN: {
                return string + mbO;
            }
            case mcM: {
                return string + mbP;
            }
            case mcL: {
                return string + mbQ;
            }
        }
        return string;
    }

    private int daq() {
        switch (this.daD()) {
            case mcN: {
                return 12;
            }
            default: {
                return 10;
            }
            case mcL: 
        }
        return 9;
    }

    @Override
    public Integer dO(int n, int n2) {
        return n / 2 + 20;
    }

    @Override
    public Integer dP(int n, int n2) {
        return n2 / 2 - 15;
    }

    @Override
    public ijc cZY() {
        return new iiv();
    }

    @Override
    public void cZZ() {
        this.dap();
    }

    @Override
    public boolean cZX() {
        return true;
    }

    @Override
    public void daa() {
        if (this.ljc != null) {
            this.ljc.hz(this.daE());
        }
    }

    static /* synthetic */ irr a(iiu iiu2) {
        return iiu2.ljc;
    }

    static /* synthetic */ float a(iiu iiu2, float f) {
        iiu2.mbR = f;
        return iiu2.mbR;
    }

    static /* synthetic */ float b(iiu iiu2) {
        return iiu2.mbR;
    }

    static /* synthetic */ double a(iiu iiu2, double d2) {
        iiu2.mbT = d2;
        return iiu2.mbT;
    }
}

