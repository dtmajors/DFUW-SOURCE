/*
 * Decompiled with CFR.
 */
public class iiw
extends iir {
    public static final String mbL = "casting_and_breath_background";
    public static final String mbM = "casting_foreground";
    public static final String mbN = "casting_leading_edge_glow";
    public static final String mbO = "_large";
    public static final String mbP = "_normal";
    public static final String mbQ = "_small";
    public static final jll<Boolean> mbY = new jll();
    private irr ljc = null;
    private float mbR = 0.0f;
    private ist mbS = null;
    private double mbT = 0.0;
    private String mbU = null;
    private ipx mbV = null;

    public iiw() {
        super("CastingBar");
        ipc.c("HudNew.swf", "casting_and_breath_background_normal", 155, 8);
        this.mbV = ipx.l(new ipf[0]);
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
        hso.cxK().cxP().cyZ().lgx.c(new jlr<iiw, Float>(this, this){
            final /* synthetic */ iiw mbZ;
            {
                this.mbZ = iiw2;
                super(iiw3);
            }

            public void b(iiw iiw2, Float f) {
                iiw.a(iiw2, f);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((iiw)object, (Float)object2);
            }
        });
        hso.cxK().cxP().cyZ().lgy.c(new jlr<iiw, Double>(this, this){
            final /* synthetic */ iiw mbZ;
            {
                this.mbZ = iiw2;
                super(iiw3);
            }

            public void a(iiw iiw2, Double d2) {
                iiw.a(this.mbZ, d2);
                this.mbZ.daj();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((iiw)object, (Double)object2);
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
        this.ljc = new irr(irs2);
        this.mbV.c(this.ljc, 0);
        if (this.mbS != null) {
            this.mbS.zY(this.daq());
        }
    }

    @Override
    protected void daj() {
        if (this.dag()) {
            String string;
            this.mbS.setVisible(true);
            double d2 = this.mbT * (double)(1.0f - this.mbR);
            int n = (int)d2;
            int n2 = (int)((d2 - (double)((int)d2)) * 10.0);
            if (n <= 0 && n2 <= 0) {
                this.mbS.setVisible(false);
            }
            if ((string = n + "." + n2).equals(this.mbU)) {
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

    private void a(Float f) {
        float f2;
        if (this.ljc == null) {
            return;
        }
        if ((double)f.floatValue() <= 0.01) {
            if (this.djL()) {
                this.setVisible(false);
                mbY.V(false);
            }
            return;
        }
        float f3 = f.floatValue() < 0.0f ? 0.0f : (f2 = f.floatValue() > 1.0f ? 1.0f : f.floatValue());
        if ((double)Math.abs(this.mbR - f2) < 1.0E-5) {
            return;
        }
        this.mbR = f2;
        this.ljc.setProgress(this.mbR);
        this.daj();
        if (!this.djL()) {
            this.setVisible(true);
            mbY.V(true);
        }
    }

    @Override
    public Integer dO(int n, int n2) {
        return n / 2 + 20;
    }

    @Override
    public Integer dP(int n, int n2) {
        return n2 / 2 - 30;
    }

    @Override
    public ijc cZY() {
        return new iix();
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

    static /* synthetic */ void a(iiw iiw2, Float f) {
        iiw2.a(f);
    }

    static /* synthetic */ double a(iiw iiw2, double d2) {
        iiw2.mbT = d2;
        return iiw2.mbT;
    }
}

