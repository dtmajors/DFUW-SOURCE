/*
 * Decompiled with CFR.
 */
public class jab
extends ihs {
    private static final String mDT = "/dfdata/texture/gui/j2f/leaderboards/leaderboards_main.png";
    private static final int mDU = 31;
    private static final int mDV = 100;
    private static final int mDW = 42;
    private static final int mDX = 0;
    private static final int mDY = -16;
    private static final String mDZ = "/dfdata/texture/gui/j2f/leaderboards/leaderboards_background.png";
    private static final int mEa = 0;
    private static final int mEb = 0;
    private static final int mEc = 130;
    private static final int mEd = 31;
    private static final int mEe = 31;
    private static final int mEf = 1;
    private boolean lkK;
    private isd mEg;
    private jad mEh = null;
    private jag mEi = null;
    private jae mEj = null;
    private jaf mEk = null;
    private jac[] mEl = null;

    public jab() {
        super("LeaderboardsWindow", "J2FWindow.swf");
        this.OQ(jnz.nGi);
        this.setResizable(false);
    }

    @Override
    public boolean isOpen() {
        return this.lkK;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lkK) {
            return;
        }
        this.lkK = bl;
        this.setVisible(this.lkK);
        if (this.lkK) {
            this.cqF();
            this.cFc();
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.Rz(31);
        this.RA(100);
        this.a(new ipb(mDT), 0, -16, 42, lxh.tce.bD(new Object[0]));
        this.cXM().qp(true);
        this.cXE().a(irl.dnr());
        this.cXE().W(new a(this));
        this.mEg = new b(this, null);
        this.mEh = new jad(this);
        this.mEg.c(this.mEh.duj(), this.mEh);
        if (dwh.bCC().bCD()) {
            this.mEi = new jag(this);
            this.mEg.c(this.mEi.duj(), this.mEi);
            this.mEj = new jae(this);
            this.mEg.c(this.mEj.duj(), this.mEj);
            this.mEk = new jaf(this);
            this.mEg.c(this.mEk.duj(), this.mEk);
        }
        this.mEl = new jac[]{this.mEh, this.mEi, this.mEj, this.mEk};
        this.mEg.SH(0);
        this.cXE().W(ipx.l(this.mEg, ipx.a(31, 1, new ipf[0])));
        this.pack();
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected void cGR() {
        jab.cyJ().cHw().a(hyc.lnd, false);
    }

    public void receiveMessage(dxq dxq2) {
        boolean bl = false;
        for (int i = 0; i < this.mEl.length; ++i) {
            if (this.mEl[i] == null || !this.mEl[i].l(dxq2)) continue;
            this.mEl[i].receiveMessage(dxq2);
            bl = true;
        }
        if (!bl) {
            super.receiveMessage(dxq2);
        }
    }

    static /* synthetic */ isd a(jab jab2) {
        return jab2.mEg;
    }
}

