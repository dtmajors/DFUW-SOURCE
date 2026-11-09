/*
 * Decompiled with CFR.
 */
public class isk
extends inz {
    private int mwX;
    private int mwY;
    private int mwZ;
    private int mxa;
    private isw moJ;
    private boolean mxb;
    private boolean mxc;
    private isf mxd;
    private int mjJ;
    private boolean mxe;
    private String lob;
    private isu mxf;
    private isx mxg;
    private ite mxh;
    private itb mxi;

    public isk(ioa ioa2, isw isw2, itb itb2) {
        super("RenameWindow", "J2FWindow.swf", ioa2, new joa(isw2.eo((int)0, (int)0).cf, isw2.eo((int)0, (int)0).cg, isw2.getWidth(), isw2.getHeight()), 0, 0);
        this.OQ(-1);
        this.a(hya.lmp, true);
        this.a(hya.lmr, false);
        this.a(hya.lms, false);
        this.a(hya.lmx, false);
        this.a(iod.moE);
        this.moJ = isw2;
        this.mxc = isw2.djP();
        this.moJ.rg(false);
        this.mxb = this.moJ.djL();
        this.moJ.setVisible(false);
        ioc ioc2 = isw2.eo(0, 0);
        this.mwX = ioc2.cf;
        this.mwY = ioc2.cg;
        this.mwZ = isw2.getWidth();
        this.mxa = isw2.getHeight();
        this.mxd = isw2.dqk();
        this.mjJ = isw2.bll();
        this.mxe = isw2 instanceof isp;
        this.lob = isw2.getText();
        this.mxf = isw2.dqi();
        this.mxg = isw2.dqm();
        this.mxh = isw2.dqn();
        this.mxi = itb2;
        this.moJ.setVisible(false);
    }

    @Override
    protected void cCu() {
        super.cCu();
        joa joa2 = hso.cxK().cxY();
        this.g(0.0f, 0.0f, joa2.W, joa2.H);
        ipx ipx2 = new ipx(this){
            final /* synthetic */ isk mxj;
            {
                this.mxj = isk2;
            }

            public boolean du(int n, int n2) {
                this.mxj.cGR();
                return true;
            }

            public boolean eC(int n, int n2) {
                this.mxj.cGR();
                return true;
            }
        };
        ipx2.r(0, 0, (int)joa2.W, (int)joa2.H);
        this.dhJ().W(ipx2);
        isw isw2 = this.mxe ? new isq(this, this.mxd, this.mjJ, 0, this.lob){
            final /* synthetic */ isk mxj;
            {
                this.mxj = isk2;
                super(isf2, n, n2, string);
            }

            public void od(String string) {
            }

            public void c(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
                switch (n) {
                    case 13: {
                        this.dpv();
                    }
                }
            }

            public void pI(String string) {
                isk.a(this.mxj, string);
            }
        } : new isy(this, this.mxd, this.mjJ, 0, this.lob){
            final /* synthetic */ isk mxj;
            {
                this.mxj = isk2;
                super(isf2, n, n2, string);
            }

            public void od(String string) {
            }

            public void c(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
                switch (n) {
                    case 13: {
                        this.dpv();
                    }
                }
            }

            public void pI(String string) {
                isk.a(this.mxj, string);
            }
        };
        isw2.a(this.mxf);
        isw2.a(this.mxg);
        isw2.a(this.mxh);
        isw2.a(this.mxi);
        isw2.sp(true);
        isw2.sq(true);
        isw2.sr(true);
        isw2.r(this.mwX, this.mwY, this.mwZ, this.mxa);
        this.dhJ().W(isw2.dik());
        isw2.L();
        this.cqF();
    }

    @Override
    protected void cGR() {
        super.cGR();
        this.moJ.rg(this.mxc);
        this.moJ.setVisible(this.mxb);
    }

    protected void rl(String string) {
    }

    private void rm(String string) {
        this.cGR();
        this.rl(string);
    }

    static /* synthetic */ void a(isk isk2, String string) {
        isk2.rm(string);
    }
}

