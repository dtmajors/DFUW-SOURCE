/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cbx
 *  cxd
 */
public abstract class bxp
extends byx {
    private static final boolean dtQ = false;
    protected final cdg dYT;
    protected bxi dYU = null;
    protected boolean dYV = false;
    protected boolean dYW = false;
    private ljq dYX = null;
    private ljq Qe = null;
    private static les aqN = lea.enZ();

    public bxp(cdg cdg2) {
        assert (cdg2 != null);
        this.dYT = cdg2;
    }

    public final cdg aDL() {
        return this.dYT;
    }

    @Override
    public final bxh aDc() {
        return this.dYU;
    }

    public final boolean aDM() {
        return this.dYV;
    }

    public final ljq aDN() {
        return this.dYX;
    }

    public final ljq Up() {
        return this.Qe;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.MessageDelegator.hd(this.dYU.getGUID());
    }

    public void doTick(ldz ldz2) {
        if (!this.isServerObject()) {
            this.dYU.bh(ldz2.rgz);
        }
    }

    public final bxi aDO() {
        return this.dYU;
    }

    @Override
    public final cbx aDd() {
        return this.dYT;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYU = new bxi(this);
        this.dYU.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dYU);
    }

    @Override
    public final boolean isServerObject() {
        return this.dYT.isServerObject();
    }

    @Override
    public void a(byv byv2, boolean bl) {
        this.dYU.aDh();
        this.dYT.b(byv2, bl);
    }

    @Override
    public final void a(ljq ljq2, ljq ljq3, ljq ljq4) {
        if (ljq3.x != 0.0f) {
            double d2 = (double)ljq3.x / (Math.PI * 2);
            ((bvf)this.dYT.aAG()).bd(d2);
        }
        if (ljq2 != null && ljq2.y != 0.0f) {
            this.dYT.aAG().aY(ljq2);
            if (this.ecS.aEP().vN() == 1) {
                // empty if block
            }
        }
    }

    @Override
    public final void nL(int n) {
        if (n <= 0) {
            return;
        }
        if (this.ecV != n) {
            this.ecV = n;
            this.b(byw.c.ebR);
        }
    }

    @Override
    public final void nM(int n) {
        if (n <= 0) {
            return;
        }
        if (this.ecV == n) {
            this.ecV = 0;
            this.b(byw.c.ebS);
        }
    }

    public final void aM(ljq ljq2) {
        this.dYX = this.Qe;
        this.Qe = ljq2;
        this.dYU.aDh();
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecG: {
                this.a(byz2);
                break;
            }
            case ecI: {
                this.aw(byz2.ecZ, byz2.eda);
                break;
            }
            default: {
                super.a(d2, byz2);
            }
        }
    }

    protected abstract void a(byz var1);

    @Override
    protected final void b(int n, String string, String string2) {
    }

    private void nN(int n) {
        this.dYT.aJz().a(n, null);
    }

    private void aw(int n, int n2) {
        block0 : switch (n2) {
            case 1: {
                if (n == 2) {
                    if (this.dYT.aAG() == null) {
                        return;
                    }
                    this.dYU.nG(196686);
                    this.dYT.aKk();
                    break;
                }
                if (n != 4) break;
                this.zO();
                this.dYT.aKj();
                break;
            }
            case 3: {
                if (n == 1) {
                    this.dYU.nG(1442110);
                    this.dYT.fH(true);
                    break;
                }
                this.dYU.nG(1442189);
                this.dYT.fH(false);
                break;
            }
            case 4: {
                switch (n) {
                    case 2: {
                        this.dYT.aKl();
                        break;
                    }
                    case 3: {
                        this.dYT.aKl();
                        if (!this.isServerObject() || !this.dYV) break block0;
                        this.dYW = true;
                        break;
                    }
                }
                break;
            }
            default: {
                return;
            }
        }
    }

    private void b(byz byz2) {
        byv byv2 = this.aEP();
        block0 : switch (byv2.vO()) {
            case 6: {
                switch (byz2.ecZ) {
                    case 2: {
                        this.nN(cxd.fHK);
                        break block0;
                    }
                    case 3: {
                        this.nN(cxd.fHE);
                        break block0;
                    }
                    case 4: {
                        this.nN(cxd.fHH);
                        break block0;
                    }
                }
                return;
            }
            default: {
                return;
            }
        }
    }
}

