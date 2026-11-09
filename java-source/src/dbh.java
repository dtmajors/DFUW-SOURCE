/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dbh
extends dbb {
    private dbm gbV = null;

    public dbh(daz daz2, dbm dbm2) {
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
        this.biM();
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

    private ldv biM() {
        assert (this.gbV != null);
        assert (this.gbV.bhM() != null);
        assert (this.gbV.bhM() instanceof ddr);
        ddr ddr2 = (ddr)this.gbV.bhM();
        kjo kjo2 = (kjo)this.MessageDelegator.h(2819);
        kjo2.ec = this.GUID;
        kjo2.pDY = 0;
        kjo2.ipF = this.gbV.aGr();
        kjo2.gBJ = ddr2.Radius;
        kjo2.dtb = ddr2.dtb;
        kjo2.pFi = 10;
        kjo2.pFj = false;
        kjo2.pEs = new ldv[]{this.gbT.biE().bgQ().aAG().axa()};
        this.MessageDelegator.a(kjo2);
        return kjo2.getGUID();
    }
}

