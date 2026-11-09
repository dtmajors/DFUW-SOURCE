/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  bvf
 *  bxm
 *  cbx
 *  cew
 *  cex
 *  cxd
 */
public abstract class bzf
extends byx {
    protected final cev bnF;
    protected bxm edz = null;
    private static les aqN = lea.enZ();
    Double edA = 0.0;
    float edB = 0.0f;
    Float edC = null;
    boolean edD = false;
    int edE = 0;
    float edF = (float)Math.PI;

    public bzf(cev cev2) {
        this.bnF = cev2;
    }

    public final cev aFh() {
        return this.bnF;
    }

    @Override
    public final bxh aDc() {
        return this.edz;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.MessageDelegator.hd(this.edz.getGUID());
    }

    public static float dI(float f2) {
        while (f2 > 6.283f) {
            f2 -= 6.283f;
        }
        while (f2 < 0.0f) {
            f2 += 6.283f;
        }
        return f2;
    }

    public void doTick(ldz ldz2) {
        assert (this.bnF != null);
        if (!this.isServerObject() && this.bnF.aJI() && this.bnF.aAG() != null) {
            byv byv2 = this.ecS.aEP();
            if (byv2.vN() == 1) {
                int n = 65541;
                int n2 = 65539;
                if (byv2.vO() == 3) {
                    n = 131092;
                    n2 = 131091;
                } else if (byv2.vQ() == 2) {
                    // empty if block
                }
                if (this.edD) {
                    if (this.edE > 4) {
                        this.edE = 0;
                    }
                } else {
                    ++this.edE;
                }
            } else {
                ++this.edE;
            }
            this.edD = false;
        }
        this.edz.nh();
    }

    public final bxm aFi() {
        return this.edz;
    }

    @Override
    public final cbx aDd() {
        return this.bnF;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.edz = new bxm(this);
        this.edz.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)this.edz);
    }

    @Override
    public final boolean isServerObject() {
        return this.bnF.isServerObject();
    }

    @Override
    public void a(byv byv2, boolean bl) {
        this.edz.aDh();
        this.bnF.b(byv2, bl);
    }

    @Override
    public final void a(ljq ljq2, ljq ljq3, ljq ljq4) {
        double d2 = (double)ljq4.x + 1.5707963267948966;
        double d3 = d2 / Math.PI;
        d3 = 1.0 - d3;
        ((bvf)this.bnF.aAG()).bd(d3);
        if (ljq2 != null && ljq2.y != 0.0f) {
            if (!this.isServerObject() && this.bnF.aJI()) {
                float f2;
                this.edF = f2 = ljq4.y + (float)Math.PI;
            } else {
                lgl lgl2 = new lgl(0.0f, ljq4.y + (float)Math.PI, 0.0f);
                this.bnF.aAG().a(lgl2);
            }
            this.edD = true;
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
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!blArray[i2]) continue;
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
            if (this.aEP().Uu()) {
                if (!this.isServerObject()) {
                    if (this.bnF.aLX().aKT()) {
                        cop cop2 = (cop)this.bnF.aLX().Wm();
                        cop2.aVp().a(n, blArray);
                    } else if (this.bnF.aLX().aKV()) {
                        cpa cpa2 = (cpa)this.bnF.aLX().Wm();
                        cpa2.aWH().a(n, blArray);
                    } else if (this.bnF.aLX().aKX()) {
                        col col2 = (col)this.bnF.aLX().Wm();
                        col2.aVf().a(n, blArray);
                    } else if (this.bnF.aLX().aKY()) {
                        cpi cpi2 = (cpi)this.bnF.aLX().Wm();
                        cpi2.aXY().a(n, blArray);
                    }
                }
            } else {
                if (this.aEP().Uv() && !this.isServerObject()) {
                    cpe cpe2 = (cpe)this.bnF.aLX().Wm();
                    cpe2.aWW().a(n, blArray);
                }
                this.b(byw.c.ebT);
            }
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
            if (this.aEP().Uu()) {
                if (!this.isServerObject()) {
                    if (this.bnF.aLX().aKT()) {
                        cop cop2 = (cop)this.bnF.aLX().Wm();
                        cop2.aVp().nF(n);
                    } else if (this.bnF.aLX().aKV()) {
                        cpa cpa2 = (cpa)this.bnF.aLX().Wm();
                        cpa2.aWH().nF(n);
                    } else if (this.bnF.aLX().aKX()) {
                        col col2 = (col)this.bnF.aLX().Wm();
                        col2.aVf().nF(n);
                    }
                }
            } else if (this.aEP().Uv()) {
                if (!this.isServerObject()) {
                    cpe cpe2 = (cpe)this.bnF.aLX().Wm();
                    cpe2.aWW().nF(n);
                }
            } else {
                this.b(byw.c.ebU);
            }
        }
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecF: {
                this.edz.aDh();
                break;
            }
            case ecG: {
                this.a(byz2);
                break;
            }
            case ecH: {
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
                if (this.isServerObject()) break;
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
        if (!this.isServerObject()) {
            hso.cxK().cxP().cyZ().cW(byz2.ecZ, byz2.eda);
        }
        if (byz2.ecZ == 1 || byz2.ecZ == 4) {
            if (this.isServerObject()) {
                this.bnF.aJz().Xh();
            } else {
                ((cew)this.bnF).aMi().aNk();
                hso.cxK().cxP().cyZ().Os(-1);
            }
        } else if (byz2.ecZ == 3 && this.isServerObject()) {
            this.bnF.fi().i(14080, 0);
        }
        switch (byz2.eda) {
            case 1: {
                if (this.isServerObject()) {
                    brg brg2 = (brg)this.bnF.aJC().asf();
                    brg2.avG();
                    break;
                }
                if (this.bnF.aLX().aKU()) {
                    cxo cxo2 = (cxo)((Object)this.bnF.aJz().ht(cxd.fJY));
                    if (cxo2 == null) {
                        return;
                    }
                    hso.cxK().cxP().cyZ().Os(cxd.fJY);
                    ((cew)this.bnF).a(cxo2, cdy.eod);
                    break;
                }
                if (this.bnF.aLX().aKV()) {
                    cxo cxo3 = (cxo)((Object)this.bnF.aJz().ht(cxd.fJY));
                    if (cxo3 == null) {
                        return;
                    }
                    hso.cxK().cxP().cyZ().Os(cxd.fJY);
                    ((cew)this.bnF).a(cxo3, cdy.eod);
                    break;
                }
                if (this.bnF.aLX().aKT()) {
                    cxo cxo4 = (cxo)((Object)this.bnF.aJz().ht(cxd.fJV));
                    if (cxo4 == null) {
                        return;
                    }
                    ((cew)this.bnF).a(cxo4, cdy.eod);
                    break;
                }
                if (!this.bnF.aLX().aKY()) break;
                cxo cxo5 = (cxo)((Object)this.bnF.aJz().ht(cxd.fKc));
                if (cxo5 == null) {
                    return;
                }
                hso.cxK().cxP().cyZ().Os(cxd.fKc);
                ((cew)this.bnF).a(cxo5, cdy.eod);
                break;
            }
            case 2: {
                if (this.isServerObject()) break;
                this.bnF.aJN().oW(5);
                break;
            }
            case 3: {
                if (!this.isServerObject()) break;
                this.bnF.fi().i(14080, 3);
                break;
            }
            case 4: {
                if (this.isServerObject()) {
                    bqm.d d2;
                    cex cex2 = (cex)this.aFh();
                    if (cex2 == null || this.aEP() == null || cex2.aJC() == null || cex2.aJC().asf() == null || !this.aEP().Uv() || cex2.aJB() == null || !cex2.aJB().bkq() || bqm.d.isMeleeWeapon(d2 = bqm.d.getWeaponType(cex2.aJB().aRX)) && bqm.d.isOneHandedWeapon(d2)) break;
                    ((brg)cex2.aJC().asf()).avG();
                    break;
                }
                if (!this.aEP().Ow()) break;
                bzc bzc2 = this.aDe().aFa();
                bzc2.edl = true;
                bzc2.edn = true;
                this.b(bzc2);
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                if (this.isServerObject()) break;
                switch (byz2.ecZ) {
                    case 1: {
                        this.bnF.aJN().oW(1);
                        break;
                    }
                    case 4: {
                        this.bnF.aJN().oW(1);
                        break;
                    }
                    case 7: {
                        this.bnF.aJN().oW(1);
                    }
                }
                break;
            }
            case 7: {
                if (this.isServerObject()) break;
                this.bnF.aJN().oW(3);
                break;
            }
            default: {
                lfn.b(5, "SFPlayerStateManager", "handlePostureModeChanged() Invalid posturemode provided: '" + byw.nV(byz2.eda) + "'");
                assert (false);
                return;
            }
        }
        this.bnF.aJM().oV(byz2.eda);
        if (!this.isServerObject()) {
            this.h(byz2.bpX, byz2.ecZ, byz2.eda);
            if (byz2.ecZ == 1 || byz2.ecZ == 4) {
                this.a(byw.c.ecq);
            }
        }
    }

    private void d(byz byz2) {
        assert (byz2.bpX == 7);
        switch (byz2.eda) {
            case 2: 
            case 3: 
            case 4: {
                this.edz.aDr();
                break;
            }
            case 1: {
                switch (byz2.ecZ) {
                    case 2: 
                    case 3: 
                    case 4: {
                        this.edz.aDF();
                    }
                }
            }
        }
    }

    private void e(byz byz2) {
        assert (byz2.bpX == 1);
        byv byv2 = this.ecS.aEP();
        if (!byv2.isAlive()) {
            return;
        }
        switch (byz2.eda) {
            case 1: {
                if (byv2.Uv()) break;
                this.edz.nG(589905);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                switch (byz2.ecZ) {
                    case 1: 
                    case 2: 
                    case 5: 
                    case 6: {
                        if (byv2.Uv()) break;
                        this.edz.nG(590123);
                    }
                }
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                if (byv2.Uv()) {
                    this.edz.nG(262383);
                    break;
                }
                this.edz.nG(590134);
                break;
            }
            case 6: {
                break;
            }
            default: {
                lfn.b(5, "SFPlayerStateManager", "startFlyingAnimation() Invalid flyingmode found: " + byz2.eda);
                return;
            }
        }
    }

    private void f(byz byz2) {
        assert (!this.isServerObject());
        switch (byz2.eda) {
            case 3: 
            case 6: {
                this.bnF.aJN().oW(1);
                break;
            }
            case 7: {
                this.bnF.aJN().oW(3);
            }
        }
    }

    protected final void h(int n, int n2, int n3) {
        assert (!this.isServerObject());
        assert (n > 0);
        assert (n2 > 0);
        assert (n3 > 0);
        cew cew2 = (cew)this.bnF;
        if (!cew2.aJI()) {
            return;
        }
        assert (cew2.aMj() != null);
        switch (n) {
            case 1: {
                cew2.aMj().pp(n3);
                break;
            }
            case 5: {
                if (this.aEP().Uu() || this.aEP().Uv()) {
                    ceg ceg2 = (ceg)this.bnF.aJM();
                    cew2.aMj().b(n2, n3, ceg2.aKR(), ceg2.aLa());
                    break;
                }
                cew2.aMj().b(n2, n3, null, 0);
                break;
            }
            case 6: {
                cew2.aMj().aE(n2, n3);
                break;
            }
            default: {
                lfn.b(5, "SFPlayerStateManager", "notifyObjectStateListener() Invalid modetype provided: " + n);
                assert (false);
                return;
            }
        }
    }

    private void aw(int n, int n2) {
        block0 : switch (n2) {
            case 1: {
                if (n == 2) {
                    if (this.bnF.aAG() == null) {
                        return;
                    }
                    this.edz.nG(196686);
                    this.bnF.aMd();
                } else if (n == 4) {
                    this.zO();
                    this.bnF.aMc();
                }
                this.bnF.aJM().oU(n2);
                break;
            }
            case 2: {
                if (this.bnF.aAG() == null) {
                    return;
                }
                this.edz.nG(1442063);
                this.bnF.aMa();
                this.bnF.aJM().oU(n2);
                if (this.ecS.aEP().vK() != 3) break;
                this.edz.aDi();
                break;
            }
            case 3: {
                if (n == 1) {
                    this.edz.nG(1442110);
                    this.bnF.fQ(true);
                    break;
                }
                this.edz.nG(1442189);
                this.bnF.fQ(false);
                break;
            }
            case 4: {
                switch (n) {
                    case 2: {
                        this.bnF.aLZ();
                        break;
                    }
                    case 3: {
                        this.bnF.aLZ();
                        if (!this.isServerObject()) break block0;
                        this.aEb();
                        break;
                    }
                }
                break;
            }
            case 5: {
                this.ecS.aEP().fj(false);
                this.bnF.aMb();
                break;
            }
            case 6: {
                break;
            }
            default: {
                return;
            }
        }
    }

    private void nN(int n) {
        if (n == cxd.fHH) {
            n = cxd.fHE;
        }
        this.bnF.aJz().a(n, null);
    }

    private void b(byz byz2) {
        byv byv2 = this.aEP();
        block0 : switch (byv2.vO()) {
            case 1: 
            case 2: {
                break;
            }
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
            case 4: {
                switch (byz2.ecZ) {
                    case 2: {
                        this.nN(cxd.fHD);
                        break block0;
                    }
                    case 3: {
                        this.nN(cxd.fHB);
                        break block0;
                    }
                    case 4: {
                        this.nN(cxd.fHB);
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

