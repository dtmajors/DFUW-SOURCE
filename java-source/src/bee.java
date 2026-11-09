/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class bee
extends bec {
    public static final float dcV = 30.0f;
    public static final float dcW = 10.0f;
    public static final float dcX = 0.7853982f;
    public static final float dcY = 1.0471976f;
    private final byk dcZ = (byk)this.amN().aJD();
    private ldg[] dcp = null;

    public bee(cdb cdb2) {
        super(7, cdb2);
    }

    public boolean l(int n, float f2) {
        if (!this.amP()) {
            return false;
        }
        klw klw2 = (klw)this.MessageDelegator.h(3350);
        klw2.ec = this.GUID;
        klw2.Rs = this.amQ();
        klw2.pKw = n;
        switch (n) {
            case 16: {
                klw2.dcc = f2;
                break;
            }
            case 32: {
                klw2.pKC = f2;
                break;
            }
            case 64: {
                klw2.pKD = f2;
                break;
            }
            case 128: {
                klw2.pKz = f2;
                break;
            }
            case 256: {
                klw2.pKA = f2;
                break;
            }
            case 512: {
                klw2.pKB = f2;
                break;
            }
            default: {
                return false;
            }
        }
        this.MessageDelegator.a(klw2);
        return true;
    }

    public boolean j(int n, ljq ljq2) {
        if (!this.amP()) {
            return false;
        }
        klw klw2 = (klw)this.MessageDelegator.h(3350);
        klw2.ec = this.GUID;
        klw2.Rs = this.amQ();
        klw2.pKw = n;
        switch (n) {
            case 2048: {
                klw2.pKE = ljq2;
                break;
            }
            default: {
                return false;
            }
        }
        this.MessageDelegator.a(klw2);
        return true;
    }

    @Override
    public void amv() {
        assert (this.Initialized);
        klw klw2 = (klw)this.MessageDelegator.h(3350);
        klw2.iBr = true;
        klw2.ec = this.GUID;
        klw2.Rs = this.GUID;
        klw2.pKw = 145;
        klw2.dsK = true;
        klw2.dcc = 30.0f;
        klw2.pKz = 0.7853982f;
        this.MessageDelegator.a(klw2);
        this.he(klw2.getGUID());
    }

    @Override
    public void aL(ljq ljq2) {
    }

    @Override
    public void a(ldg[] ldgArray) {
        assert (this.amQ() != null);
        assert (ldgArray != null);
        assert (ldgArray.length > 0);
        if (!this.bGn) {
            return;
        }
        this.dcp = ldgArray;
        klw klw2 = (klw)this.MessageDelegator.h(3350);
        klw2.iBr = false;
        klw2.ec = this.GUID;
        klw2.Rs = this.amQ();
        klw2.pKw = 8;
        klw2.pKx = this.dcp;
        this.MessageDelegator.a(klw2);
        this.dcZ.b(this.dcp[0]);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5383: {
                this.a((kve)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void amK() {
        klw klw2 = (klw)this.MessageDelegator.h(3350);
        klw2.iBr = false;
        klw2.ec = this.GUID;
        klw2.Rs = this.amQ();
        klw2.pKw = 2;
        this.MessageDelegator.a(klw2);
    }

    private ldg ko(int n) {
        assert (this.dcp != null);
        int n2 = this.dcp.length;
        for (int i = 0; i < n2; ++i) {
            if (this.dcp[i].cck != n) continue;
            return this.dcp[i];
        }
        return null;
    }

    private void a(kve kve2) {
        int n = kve2.qeu;
        switch (n) {
            case 1: {
                ldg ldg2 = this.ko(kve2.qev);
                if (ldg2 == null) {
                    return;
                }
                this.dcZ.b(this.ko(ldg2.cck + 1));
                break;
            }
            case 2: {
                break;
            }
            case 4: {
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void cV(boolean bl) {
        klw klw2 = (klw)this.MessageDelegator.h(3350);
        klw2.iBr = false;
        klw2.ec = this.GUID;
        klw2.Rs = this.amQ();
        klw2.pKw = 4;
        klw2.Active = bl;
        this.MessageDelegator.a(klw2);
    }
}

