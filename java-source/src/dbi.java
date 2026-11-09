/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dbi
extends dbb
implements bto {
    private static final int gbZ = 2;
    private dbm gbV = null;
    private int gca = 2;
    private int gcb = 0;
    private day[] gcc = null;
    private double gcd = 0.0;
    private double gce = 0.0;

    public dbi(daz daz2, dbm dbm2) {
        super(daz2);
        this.gbV = dbm2;
    }

    @Override
    public dbj biG() {
        return this.gbV;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gca == 0) {
            this.Active = false;
            return;
        }
        int n2 = this.gcc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.gcc[i2].gbs || !(ldz2.rgz >= this.gcc[i2].gbt)) continue;
            this.a(this.gcc[i2]);
            this.gcc[i2].gbs = true;
            --this.gca;
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.init();
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
        if (this.gcb == 2) {
            assert (this.gbV.biT() != null);
            if (this.gbV.biS()) {
                this.a(this.gbV.biT());
            }
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
        assert (this.gbV != null);
        if (ctg.ffj) {
            this.biJ();
            return;
        }
        ++this.gcb;
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
            int n3 = ldvArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.e(ldvArray[i2], ldvArray2[i2], nArray[i2])) {
                    ++n2;
                    continue;
                }
                ddu ddu2 = new ddu();
                if (ldvArray2[i2].equals(lcr.qAC)) {
                    ddu2.Ui = ldvArray[i2];
                    ddu2.dtj = lcr.qEk;
                } else {
                    ddu2.Ui = ldvArray2[i2];
                    ddu2.dtj = null;
                }
                if (this.gbV.mw(ddu2.Ui)) continue;
                ddu2.ResourceType = nArray[i2];
                ddu2.dph = ljqArray[i2];
                ddu2.dur = cxd.f.getHitLocationTypeForHitLocation(nArray2[i2]);
                ddu2.dus = fArray[i2];
                ddu2.aYH = this.gbV.Ec();
                ddu2.gev = false;
                this.gbV.d(ddu2);
                if (ldvArray2[i2].equals(lcr.qAC)) {
                    this.gbV.mu(ddu2.Ui);
                    continue;
                }
                this.bG(ddu2.Ui);
            }
        }
        if (this.gcb == 2) {
            if (this.gbV.biT() == null) {
                this.CA();
            } else if (this.gbV.biS()) {
                this.a(this.gbV.biT());
            }
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

    private void init() {
        assert (this.gbV != null);
        assert (this.gbV.bhM() != null);
        assert (this.gbV.bhM() instanceof ddt);
        assert (this.gbV.biQ() instanceof czj);
        czj czj2 = (czj)this.gbV.biQ();
        double d2 = czj2.c(cxd.p.fSe);
        if (d2 <= 0.0) {
            return;
        }
        this.gcd = this.MessageDelegator.arc().rgz;
        this.gce = (double)0.2f * d2;
        float f2 = 2.0f;
        ddx ddx2 = this.gbT.biE().bgQ().aJB();
        if (ddx2.bFz > 0.0f) {
            f2 = ddx2.bFz;
        }
        this.gcc = new day[this.gca];
        int n2 = this.gcc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.gcc[i2] = new day();
            this.gcc[i2].gbs = false;
            this.gcc[i2].gbt = this.gcd + this.gce * (double)i2;
            this.gcc[i2].gbu = f2;
        }
    }

    private void a(day day2) {
        assert (!day2.gbs);
        assert (this.gca > 0);
        kjo kjo2 = (kjo)this.MessageDelegator.h(2819);
        kjo2.ec = this.GUID;
        kjo2.pDY = 0;
        kjo2.ipF = this.gbV.aGr();
        kjo2.gBJ = day2.gbu;
        kjo2.dtb = false;
        kjo2.pFi = 10;
        kjo2.pFj = false;
        this.MessageDelegator.a(kjo2);
    }
}

