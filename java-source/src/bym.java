/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cbx
 *  cxd
 */
public abstract class bym
extends byx {
    private static final boolean dZj = false;
    private static final boolean dtQ = false;
    protected final cdt dZk;
    protected bxk dZl = null;
    private static les aqN = lea.enZ();

    public bym(cdt cdt2) {
        assert (cdt2 != null);
        this.dZk = cdt2;
    }

    public final cdt aDX() {
        return this.dZk;
    }

    @Override
    public final bxh aDc() {
        return this.dZl;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.MessageDelegator.hd(this.dZl.getGUID());
    }

    public void doTick(ldz ldz2) {
        this.dZl.nh();
    }

    public final bxk aDY() {
        return this.dZl;
    }

    @Override
    public final cbx aDd() {
        return this.dZk;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dZl = new bxk(this);
        this.dZl.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dZl);
    }

    @Override
    public final boolean isServerObject() {
        return this.dZk.isServerObject();
    }

    @Override
    public void a(byv byv2, boolean bl) {
        this.dZl.aDh();
        this.dZk.b(byv2, bl);
    }

    @Override
    public final void a(ljq ljq2, ljq ljq3, ljq ljq4) {
        if (ljq3.x != 0.0f) {
            double d2 = (double)ljq3.x / (Math.PI * 2);
            ((bvf)this.dZk.aAG()).bd(d2);
        }
        if (ljq2 != null && ljq2.y != 0.0f) {
            this.dZk.aAG().aY(ljq2);
            if (this.ecS.aEP().vN() == 1) {
                // empty if block
            }
        }
    }

    @Override
    public final void a(int n, boolean[] blArray) {
        if (n <= 0) {
            return;
        }
        if (blArray == null) {
            return;
        }
        boolean bl = false;
        int n2 = blArray.length;
        for (int i = 0; i < n2; ++i) {
            if (!blArray[i]) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return;
        }
        assert (this.ecU.length == blArray.length);
        if (this.ecV != n) {
            this.ecV = n;
            this.d(blArray);
            this.b(byw.c.ebT);
        }
    }

    @Override
    public final void nF(int n) {
        if (n <= 0) {
            return;
        }
        if (this.ecV == n) {
            this.ecV = 0;
            this.d(new boolean[6]);
            this.b(byw.c.ebU);
        }
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecF: {
                this.dZl.aDh();
                break;
            }
            case ecG: {
                this.a(byz2);
                break;
            }
            case ecH: {
                this.dZl.ax(byz2.ecZ, byz2.eda);
                break;
            }
            case ecI: {
                this.aw(byz2.ecZ, byz2.eda);
                break;
            }
            case ecJ: {
                this.c(byz2);
                break;
            }
            case ecL: {
                this.d(byz2);
                break;
            }
            case ecN: {
                this.e(byz2);
                break;
            }
            case ecO: {
                this.f(byz2);
                break;
            }
            case ecP: {
                this.b(byz2);
                break;
            }
            default: {
                super.a(d2, byz2);
            }
        }
    }

    protected abstract void a(byz var1);

    private void c(byz byz2) {
        switch (byz2.eda) {
            case 3: {
                if (!this.isServerObject()) break;
                this.dZk.aJM().oV(byz2.eda);
                break;
            }
            case 6: {
                if (this.isServerObject()) {
                    if (byz2.ecZ != 3) break;
                    this.dZk.aJM().oV(byz2.eda);
                    break;
                }
                if (byz2.ecZ != 7) break;
                this.dZk.aJN().oW(1);
                break;
            }
            case 7: {
                if (this.isServerObject()) break;
                break;
            }
            default: {
                return;
            }
        }
        if (!(this.isServerObject() || byz2.ecZ != 1 && byz2.ecZ != 4)) {
            this.a(byw.c.ecq);
        }
    }

    private void d(byz byz2) {
        assert (byz2.bpX == 7);
        switch (byz2.eda) {
            case 2: 
            case 4: {
                this.dZl.aDr();
            }
        }
    }

    private void e(byz byz2) {
        assert (byz2.bpX == 1);
        switch (byz2.eda) {
            case 1: {
                if (this.ecS.aEP().Uv()) break;
                this.dZl.nG(589905);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                switch (byz2.ecZ) {
                    case 1: 
                    case 2: 
                    case 5: {
                        if (this.ecS.aEP().Uv()) break;
                        this.dZl.nG(590123);
                    }
                }
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                if (this.ecS.aEP().Uv()) {
                    this.dZl.nG(262383);
                    break;
                }
                this.dZl.nG(590134);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void f(byz byz2) {
        assert (!this.isServerObject());
        switch (byz2.eda) {
            case 3: 
            case 6: {
                this.dZk.aJN().oW(1);
                break;
            }
        }
    }

    @Override
    protected final void b(int n, String string, String string2) {
    }

    private void nN(int n) {
        if (n == cxd.fHH) {
            n = cxd.fHE;
        }
        this.dZk.aJz().a(n, null);
    }

    private void aw(int n, int n2) {
        block0 : switch (n2) {
            case 1: {
                if (n == 2) {
                    if (this.dZk.aAG() == null) {
                        return;
                    }
                    this.dZl.nG(196686);
                    this.dZk.aKk();
                    break;
                }
                if (n != 4) break;
                this.zO();
                this.dZk.aKj();
                break;
            }
            case 3: {
                if (n == 1) {
                    this.dZl.nG(1442110);
                    this.dZk.fH(true);
                    break;
                }
                this.dZl.nG(1442189);
                this.dZk.fH(false);
                break;
            }
            case 4: {
                switch (n) {
                    case 2: {
                        this.dZk.aKl();
                        break;
                    }
                    case 3: {
                        this.dZk.aKl();
                        if (!this.isServerObject()) break block0;
                        this.aEb();
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
            case 3: {
                switch (byz2.ecZ) {
                    case 2: {
                        this.nN(cxd.fHr);
                        break block0;
                    }
                    case 3: {
                        this.nN(cxd.fHE);
                        break block0;
                    }
                }
                return;
            }
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
            case 7: {
                break;
            }
            default: {
                return;
            }
        }
    }
}

