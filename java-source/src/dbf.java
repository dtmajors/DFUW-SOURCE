/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  lcr
 */
public class dbf
extends dbb {
    private dbn gbY = null;

    public dbf(daz daz2, dbn dbn2) {
        super(daz2);
        this.gbY = dbn2;
    }

    @Override
    public dbj biG() {
        return this.gbY;
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
        assert (this.gbY != null);
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
        if (ldvArray.length > 0 && fArray.length > 0) {
            int n2 = this.a(fArray, ldvArray, ldvArray2, nArray);
            if (n2 < 0) {
                this.CA();
                return;
            }
            ddu ddu2 = new ddu();
            ddu2.Ui = ldvArray2[n2];
            ddu2.ResourceType = nArray[n2];
            ddu2.dph = ljqArray[n2];
            ddu2.dNb = fArray[n2];
            ddu2.dur = cxd.f.getHitLocationTypeForHitLocation(nArray2[n2]);
            ddu2.dus = fArray2[n2];
            ddu2.aYH = this.gbY.Ec();
            ddu2.gev = false;
            this.gbY.d(ddu2);
            if (ldvArray2[n2].equals(lcr.qAC)) {
                ddu2.Ui = ldvArray[n2];
                ddu2.dtj = lcr.qEk;
                this.gbY.mu(ddu2.Ui);
                this.a(new ddu[]{ddu2});
            } else {
                this.bG(ddu2.Ui);
            }
        } else {
            this.CA();
        }
    }

    @Override
    protected void a(fuu fuu2) {
        ddu ddu2 = this.gbY.mt(fuu2.aO());
        if (ddu2 == null) {
            return;
        }
        if (!ddu2.Ui.equals(fuu2.aO())) {
            return;
        }
        ddu2.dtj = fuu2.dtj;
        this.gbY.mu(ddu2.Ui);
        if (ddu2.dtj == null) {
            ddu2.dtj = lcr.qEk;
        }
        this.a(new ddu[]{ddu2});
    }

    @Override
    protected void lU(ldv ldv2) {
        ddu ddu2 = this.gbY.mt(ldv2);
        if (ddu2 == null) {
            return;
        }
        if (!ddu2.Ui.equals(ldv2)) {
            return;
        }
        this.gbY.mv(ldv2);
        this.CA();
    }

    private ldv biM() {
        bvd bvd2 = this.gbT.biE().bgQ().aAG();
        ddo ddo2 = (ddo)this.gbY.bhM();
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(4);
        kji2.ca(this.gbY.aGr());
        if (this.gbY.biP()) {
            kji2.cq(dba.gbx);
        } else {
            kji2.cq(dba.gby);
        }
        kji2.a(this.gbY.biO());
        kji2.setLength(ddo2.dum);
        if (!cxd.ya((int)this.gbY.biQ().zg()) && this.gbT.biE().bgQ().aJB().bFz > 0.0f) {
            kji2.setLength(this.gbT.biE().bgQ().aJB().bFz);
        }
        kji2.pEL = true;
        this.MessageDelegator.a(kji2);
        return kji2.getGUID();
    }
}

