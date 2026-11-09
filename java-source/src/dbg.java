/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bxm
 *  cdb
 *  cex
 *  cyt
 *  lcr
 */
public class dbg
extends dbb {
    private dbm gbV = null;

    public dbg(daz daz2, dbm dbm2) {
        super(daz2);
        this.gbV = dbm2;
    }

    @Override
    public dbj biG() {
        return this.gbV;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.biK();
    }

    @Override
    protected void a(fuu fuu2) {
        ddu ddu2 = this.gbV.mt(fuu2.aO());
        if (ddu2 == null) {
            return;
        }
        if (!ddu2.Ui.equals(fuu2.aO())) {
            return;
        }
        ddu2.dtj = fuu2.dtj;
        this.gbV.mu(ddu2.Ui);
        if (ddu2.dtj == null) {
            ddu2.dtj = lcr.qEk;
        }
        if (this.gbV.biS()) {
            this.a(this.gbV.biT());
        }
    }

    @Override
    protected void a(kuo kuo2) {
        if (kuo2.ev == null) {
            return;
        }
        if (kuo2.jnv == null) {
            return;
        }
        if (kuo2.qdO == null) {
            return;
        }
        if (kuo2.ilP == null) {
            return;
        }
        if (kuo2.bqd == null) {
            return;
        }
        if (kuo2.qdP == null) {
            return;
        }
        if (ctg.ffj) {
            this.biJ();
            return;
        }
        ldv[] ldvArray = kuo2.jnv;
        ldv[] ldvArray2 = kuo2.qdO;
        ljq[] ljqArray = kuo2.ilP;
        int[] nArray = kuo2.bqd;
        int[] nArray2 = kuo2.qdP;
        float[] fArray = kuo2.qdQ;
        assert (ldvArray.length == ldvArray2.length);
        assert (ljqArray.length == ldvArray2.length);
        assert (nArray.length == ldvArray2.length);
        assert (nArray2.length == ldvArray2.length);
        assert (fArray.length == ldvArray2.length);
        int n2 = 0;
        if (ldvArray.length > 0) {
            for (int i2 = 0; i2 < ldvArray.length; ++i2) {
                Object object;
                if (this.e(ldvArray[i2], ldvArray2[i2], nArray[i2])) {
                    ++n2;
                    continue;
                }
                ddu ddu2 = new ddu();
                ddu2.Ui = ldvArray2[i2];
                ddu2.ResourceType = nArray[i2];
                ddu2.dph = ljqArray[i2];
                ddu2.dur = cxd.f.getHitLocationTypeForHitLocation(nArray2[i2]);
                ddu2.dus = fArray[i2];
                ddu2.aYH = this.gbV.Ec();
                ddu2.gev = false;
                this.gbV.d(ddu2);
                if (ldvArray2[i2].equals(lcr.qAC)) {
                    ddu2.Ui = ldvArray[i2];
                    ddu2.dtj = lcr.qEk;
                    this.gbV.mu(ddu2.Ui);
                    continue;
                }
                this.bG(ddu2.Ui);
                ddq ddq2 = (ddq)this.gbV.bhM();
                float f2 = this.b(ddq2);
                ljq ljq2 = new ljq(ddu2.dph);
                ljq2.et(this.gbV.aGr());
                ljq2.y = 0.0f;
                ljq2.normalize();
                if (ljq2.isZero()) {
                    ljq2 = new ljq(Math.random(), Math.random(), Math.random());
                    ljq2.normalize();
                } else {
                    ljq2.y += 1.0f;
                    ljq2.normalize();
                }
                ldv ldv2 = null;
                cdb cdb2 = this.gbT.biE().bgQ();
                if (cdb2 instanceof cex && (object = (cex)cdb2).mA() != null) {
                    ldv2 = object.mA().getGUID();
                }
                object = (gje)this.MessageDelegator.h(4622, this.GUID, lcr.qCt);
                object.Ui = ddu2.Ui;
                object.mx = ljq2;
                object.gen = f2;
                object.jiZ = ldv2;
                this.MessageDelegator.F((dxq)object);
            }
            if (this.gbV.biT() == null) {
                assert (n2 == ldvArray.length);
                this.CA();
            } else if (this.gbV.biS()) {
                this.a(this.gbV.biT());
            }
        } else {
            this.CA();
        }
    }

    @Override
    protected void lU(ldv ldv2) {
        ddu ddu2 = this.gbV.mt(ldv2);
        if (ddu2 == null) {
            return;
        }
        if (!ddu2.Ui.equals(ldv2)) {
            return;
        }
        this.gbV.mv(ldv2);
        if (this.gbV.biT() == null) {
            this.CA();
        } else if (this.gbV.biS()) {
            this.a(this.gbV.biT());
        }
    }

    private void biK() {
        assert (this.gbV != null);
        assert (this.gbV.bhM() != null);
        assert (this.gbV.bhM() instanceof ddq);
        byv byv2 = this.gbT.biE().bgQ().aJD().aEP();
        if (byv2.vO() != 4) {
            this.CA();
            return;
        }
        ddq ddq2 = (ddq)this.gbV.bhM();
        ljq ljq2 = this.a(ddq2);
        float f2 = ddq2.Radius;
        kjo kjo2 = (kjo)this.MessageDelegator.h(2819);
        kjo2.ec = this.GUID;
        kjo2.pDY = 0;
        kjo2.ipF = ljq2;
        kjo2.gBJ = f2;
        kjo2.dtb = true;
        kjo2.pFi = 10;
        kjo2.pFj = false;
        this.MessageDelegator.a(kjo2);
    }

    private ljq a(ddq ddq2) {
        assert (this.gbV != null);
        assert (this.gbV.bhM() != null);
        ljq ljq2 = this.c(ddq2);
        lgl lgl2 = new lgl(this.gbV.biO());
        lgl lgl3 = new lgl(0.0f, (float)Math.PI, 0.0f);
        ljq2 = lgl3.eq(ljq2);
        ljq ljq3 = lgl2.eq(ljq2);
        ljq3.y += ddq2.get;
        ljq ljq4 = new ljq(this.gbV.aGr());
        ljq4.es(ljq3);
        return ljq4;
    }

    private float b(ddq ddq2) {
        int n2 = this.a(this.gbT.biE());
        switch (n2) {
            case 1: 
            case 2: 
            case 5: {
                return 0.5f;
            }
            case 3: 
            case 4: {
                return 2.0f;
            }
        }
        return 1.0f;
    }

    private ljq c(ddq ddq2) {
        int n2 = this.a(this.gbT.biE());
        ljq ljq2 = null;
        switch (n2) {
            case 1: {
                ljq2 = new ljq(-1.0f, 0.0f, 0.75f);
                ljq2.nm(ddq2.geo);
                break;
            }
            case 2: {
                ljq2 = new ljq(1.0f, 0.0f, 0.75f);
                ljq2.nm(ddq2.geo);
                break;
            }
            case 3: {
                ljq2 = new ljq(0.0f, 0.0f, 1.0f);
                ljq2.nm(ddq2.gep);
                break;
            }
            case 4: {
                ljq2 = new ljq(0.0f, 0.0f, -1.0f);
                ljq2.nm(ddq2.geq);
                break;
            }
            case 5: {
                ljq2 = new ljq(0.0f, 0.0f, 1.0f);
                ljq2.nm(ddq2.ger);
                ljq2.y += ddq2.ges;
                break;
            }
            default: {
                ljq2 = new ljq();
            }
        }
        return ljq2;
    }

    private int a(cyt cyt2) {
        byv byv2 = cyt2.bgQ().aJD().aEP();
        if (byv2.vO() != 4) {
            return 3;
        }
        switch (byv2.vL()) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                if (cyt2.bgQ() instanceof cex) {
                    bxm bxm2 = ((cex)cyt2.bgQ()).aLU().aFi();
                    if (bxm2.aDB()) {
                        return 4;
                    }
                    if (bxm2.aDC()) {
                        return 5;
                    }
                    return 3;
                }
                return 3;
            }
        }
        return -1;
    }
}

