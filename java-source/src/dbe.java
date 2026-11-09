/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 */
public class dbe
extends dbb {
    private dbm gbV = null;

    public dbe(daz daz2, dbm dbm2) {
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
    protected void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.dXg() == null) {
            return;
        }
        if (kuj2.jnv == null) {
            return;
        }
        if (kuj2.qdO == null) {
            return;
        }
        if (kuj2.pJh == null) {
            return;
        }
        if (kuj2.ilP == null) {
            return;
        }
        if (kuj2.bqd == null) {
            return;
        }
        if (kuj2.qdP == null) {
            return;
        }
        assert (this.gbV != null);
        if (ctg.ffj) {
            this.biJ();
            return;
        }
        ldv[] ldvArray = kuj2.jnv;
        ldv[] ldvArray2 = kuj2.qdO;
        float[] fArray = kuj2.pJh;
        ljq[] ljqArray = kuj2.ilP;
        int[] nArray = kuj2.bqd;
        int[] nArray2 = kuj2.qdP;
        float[] fArray2 = kuj2.qdQ;
        assert (ldvArray.length == ldvArray2.length);
        assert (fArray.length == ldvArray2.length);
        assert (ljqArray.length == ldvArray2.length);
        assert (nArray.length == ldvArray2.length);
        assert (nArray2.length == ldvArray2.length);
        assert (fArray2.length == ldvArray2.length);
        int n2 = 0;
        if (ldvArray.length > 0) {
            int n3 = ldvArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.e(ldvArray[i2], ldvArray2[i2], nArray[i2])) {
                    ++n2;
                    continue;
                }
                if (!lea.enW().isDescendant(nArray[i2], cug.fgz) && !lea.enW().isDescendant(nArray[i2], cug.fkw)) {
                    ++n2;
                    break;
                }
                ddu ddu2 = new ddu();
                ddu2.Ui = ldvArray2[i2];
                ddu2.ResourceType = nArray[i2];
                ddu2.dph = ljqArray[i2];
                ddu2.dNb = fArray[i2];
                ddu2.dur = cxd.f.getHitLocationTypeForHitLocation(nArray2[i2]);
                ddu2.dus = fArray2[i2];
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
            ddu[] dduArray = this.gbV.biT();
            if (this.gbV.biT() == null) {
                this.CA();
            } else if (this.gbV.biS()) {
                this.a(dduArray);
            }
        } else {
            this.CA();
        }
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
        bvd bvd2 = this.gbT.biE().bgQ().aAG();
        ddo ddo2 = (ddo)this.gbV.bhM();
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(4);
        kji2.ca(this.gbV.aGr());
        kji2.pEN = true;
        if (this.gbV.biP()) {
            kji2.cq(dba.gbx);
        } else {
            kji2.cq(dba.gby);
        }
        kji2.a(this.gbV.biO());
        kji2.setLength(ddo2.dum);
        kji2.pEL = false;
        if (!cxd.ya((int)this.gbV.biQ().zg()) && this.gbT.biE().bgQ().aJB().bFz > 0.0f) {
            kji2.setLength(this.gbT.biE().bgQ().aJB().bFz);
        }
        this.MessageDelegator.a(kji2);
        return kji2.getGUID();
    }
}

