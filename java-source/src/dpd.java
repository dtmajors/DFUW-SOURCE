/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;

public abstract class dpd
extends btk {
    public static final int dwD = 1;
    public static final int gMl = 2;
    protected dnh gMm = null;
    protected dnl gMn = null;
    protected int mb = 0;
    protected boolean gMo = false;
    protected boolean gMp = false;

    public final void a(dnh dnh2) {
        this.gMm = dnh2;
    }

    public final dnl brR() {
        return this.gMn;
    }

    public final void b(dnl dnl2) {
        this.gMn = dnl2;
    }

    @Override
    public final void cleanUp() {
        super.cleanUp();
        this.gMp = false;
        if (this.mb == 2) {
            this.brN();
        } else {
            this.brM();
        }
    }

    @Override
    public final void initialize() {
        assert (this.gMm != null);
        assert (this.gMn != null);
        super.initialize();
        this.mb = 1;
        this.gMo = this.gMn.brD();
        this.brO();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11034: {
                this.b((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final String toString() {
        assert (this.gMn != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(this.gMn.brC());
        stringBuilder.append("' GUID=");
        stringBuilder.append(this.GUID);
        return stringBuilder.toString();
    }

    protected abstract void brM();

    protected abstract void brN();

    protected final bro[] a(brv brv2, boolean bl) {
        ArrayList<bro> arrayList = lcn.emv();
        this.a(brv2, bl, arrayList);
        return arrayList.toArray(new bro[arrayList.size()]);
    }

    protected void c(int n, int n2, ldv ldv2, ldv ldv3) {
        this.gMm.b(this, this.gMn);
    }

    protected abstract void brO();

    protected final void a(ldv ldv2, dod dod2) {
        assert (ldv2 != null);
        assert (dod2.GUID != null);
        assert (dod2.dAy != null);
        assert (dod2.dJc >= 0);
        if (dng.gKK && this.gMp) {
            this.B(7984, ldv2);
            return;
        }
        fli fli2 = (fli)this.MessageDelegator.h(7984, this.GUID, ldv2);
        fli2.hsP = true;
        fli2.aCK = dod2.GUID;
        fli2.dIW = dod2.dAy;
        fli2.dJc = dod2.dJc;
        this.MessageDelegator.F(fli2);
    }

    protected final void a(ldv ldv2, dny dny2, int n) {
        assert (ldv2 != null);
        assert (dny2 != null);
        assert (dny2.GUID != null);
        assert (dny2.dAy != null);
        assert (n != 0);
        if (dng.gKK && this.gMp) {
            this.B(7939, ldv2);
            return;
        }
        fln fln2 = (fln)this.MessageDelegator.h(7939, this.GUID, ldv2);
        fln2.hsP = true;
        fln2.aCK = dny2.GUID;
        fln2.dIW = dny2.dAy;
        fln2.iPw = n;
        this.MessageDelegator.F(fln2);
    }

    protected final void a(ldv ldv2, cte cte2, bqy bqy2) {
        assert (ldv2 != null);
        assert (cte2 != null);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, ldv2.bFk());
        fcy2.bst = bkd.dqO;
        fcy2.aZG = this.GUID;
        fcy2.akX = ldv2;
        fcy2.dtP = new cte[]{cte2};
        fcy2.iJG = true;
        fcy2.b(bqy2);
        this.MessageDelegator.F(fcy2);
    }

    protected final void a(ldv ldv2, dny dny2) {
        assert (ldv2 != null);
        assert (dny2 != null);
        this.a(ldv2, new ldv[]{dny2.GUID}, new lef[]{dny2.dAy});
    }

    protected final void a(ldv ldv2, ldv[] ldvArray, lef[] lefArray) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        assert (lefArray != null);
        flw flw2 = (flw)this.MessageDelegator.h(7952, this.GUID, ldv2);
        flw2.iPs = ldvArray;
        flw2.dJh = lefArray;
        this.MessageDelegator.F(flw2);
    }

    protected final void a(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5, int n) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (ldv4 != null);
        assert (ldv5 != null);
        if (dng.gKK && this.gMp) {
            this.B(7973, ldv2);
            return;
        }
        fmi fmi2 = (fmi)this.MessageDelegator.h(7973, this.GUID, ldv2);
        fmi2.hsP = true;
        fmi2.gLy = ldv3;
        fmi2.gLz = ldv4;
        fmi2.aCK = ldv5;
        fmi2.dJc = n;
        this.MessageDelegator.F(fmi2);
    }

    protected final void a(ldv ldv2, ldv ldv3, brm brm2, bqy bqy2) {
        brv brv2 = new brv();
        brv2.dIY = brm2;
        this.a(ldv2, ldv3, new brv[]{brv2}, bqy2);
    }

    protected final void a(ldv ldv2, ldv ldv3, brv[] brvArray, bqy bqy2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (brvArray != null);
        if (dng.gKK && this.gMp) {
            this.B(7974, ldv2);
            return;
        }
        fmj fmj2 = (fmj)this.MessageDelegator.h(7974, this.GUID, ldv2);
        fmj2.hsP = true;
        fmj2.aXQ = ldv3;
        fmj2.gKU = brvArray;
        fmj2.b(bqy2);
        this.MessageDelegator.F(fmj2);
    }

    protected final void a(ldv ldv2, int n, dnz dnz2, boolean bl, bqy bqy2) {
        assert (ldv2 != null);
        assert (dnz2 != null);
        if (dng.gKK && this.gMp) {
            this.f(n, 7953, ldv2);
            return;
        }
        fmb fmb2 = (fmb)this.MessageDelegator.h(7953, this.GUID, ldv2);
        fmb2.hsP = true;
        fmb2.aqs = n;
        fmb2.aCK = dnz2.GUID;
        fmb2.dIW = dnz2.dAy;
        fmb2.iPI = dnz2.asi;
        fmb2.iPJ = bl;
        fmb2.b(bqy2);
        this.MessageDelegator.F(fmb2);
    }

    protected final void a(ldv ldv2, doa doa2, int n, boolean bl, bqy bqy2) {
        assert (ldv2 != null);
        assert (doa2 != null);
        if (dng.gKK && this.gMp) {
            this.B(7953, ldv2);
            return;
        }
        fmb fmb2 = (fmb)this.MessageDelegator.h(7953, this.GUID, ldv2);
        fmb2.hsP = true;
        fmb2.aCK = doa2.GUID;
        fmb2.dIW = doa2.dAy;
        fmb2.iPI = n;
        fmb2.iPJ = bl;
        fmb2.b(bqy2);
        this.MessageDelegator.F(fmb2);
    }

    protected final void a(ldv ldv2, dnz dnz2, bqy bqy2) {
        assert (ldv2 != null);
        assert (dnz2 != null);
        if (dng.gKK && this.gMp) {
            this.B(7995, ldv2);
            return;
        }
        fmd fmd2 = (fmd)this.MessageDelegator.h(7995, this.GUID, ldv2);
        fmd2.aCK = dnz2.GUID;
        fmd2.dIW = dnz2.dAy;
        fmd2.iPK = dnz2.asi;
        fmd2.b(bqy2);
        this.MessageDelegator.F(fmd2);
    }

    protected final void a(ldv ldv2, dny dny2, dny dny3) {
        assert (ldv2 != null);
        assert (dny2 != null);
        assert (dny3 != null);
        if (dng.gKK && this.gMp) {
            this.B(7990, ldv2);
            return;
        }
        fmk fmk2 = (fmk)this.MessageDelegator.h(7990, this.GUID, ldv2);
        fmk2.hsP = true;
        fmk2.iPU = dny2.GUID;
        fmk2.iPV = dny2.dAy;
        fmk2.aCK = dny3.GUID;
        fmk2.dIW = dny3.dAy;
        this.MessageDelegator.F(fmk2);
    }

    protected final void a(ldv ldv2, bqs bqs2, dny dny2) {
        assert (ldv2 != null);
        assert (bqs2 != null);
        assert (dny2 != null);
        if (dng.gKK && this.gMp) {
            this.B(7966, ldv2);
            return;
        }
        fml fml2 = (fml)this.MessageDelegator.h(7966, this.GUID, ldv2);
        fml2.hsP = true;
        fml2.gMb = bqs2;
        fml2.aCK = dny2.GUID;
        fml2.dIW = dny2.dAy;
        this.MessageDelegator.F(fml2);
    }

    protected final void aH(ldv ldv2) {
        fub fub2 = (fub)this.MessageDelegator.h(1027, this.GUID, ldv2);
        this.MessageDelegator.F(fub2);
    }

    protected final void a(ldv ldv2, dny dny2, boolean bl, boolean bl2, bqy bqy2) {
        this.a(ldv2, dny2, bl, false, bl2, false, bqy2, bqm.b.dEm.ordinal());
    }

    protected final void a(ldv ldv2, dny dny2, boolean bl, boolean bl2, boolean bl3, bqy bqy2) {
        this.a(ldv2, dny2, bl, bl2, bl3, false, bqy2, bqm.b.dEm.ordinal());
    }

    protected final void a(ldv ldv2, dny dny2, boolean bl, boolean bl2, boolean bl3, boolean bl4, bqy bqy2, int n) {
        assert (ldv2 != null);
        assert (dny2 != null);
        if (dng.gKK && this.gMp) {
            this.B(7940, ldv2);
            return;
        }
        fmv fmv2 = (fmv)this.MessageDelegator.h(7940, this.GUID, ldv2);
        fmv2.hsP = true;
        fmv2.aCK = dny2.GUID;
        fmv2.dIW = dny2.dAy;
        fmv2.iQA = bl;
        fmv2.iQB = bl2;
        fmv2.iQC = bl3;
        fmv2.gLj = bl4;
        fmv2.b(bqy2);
        fmv2.iQD = n;
        this.MessageDelegator.F(fmv2);
    }

    protected final void b(ldv ldv2, int n, int n2, bqy bqy2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (n2 > 0);
        if (dng.gKK && this.gMp) {
            this.B(7993, ldv2);
            return;
        }
        fmx fmx2 = (fmx)this.MessageDelegator.h(7993, this.GUID, ldv2);
        fmx2.hsP = true;
        fmx2.ResourceType = n;
        fmx2.asi = n2;
        fmx2.aXQ = null;
        fmx2.b(bqy2);
        this.MessageDelegator.F(fmx2);
    }

    protected final void a(ldv ldv2, int n, int n2, ldv ldv3, bqy bqy2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (n2 > 0);
        assert (ldv3 != null);
        if (dng.gKK && this.gMp) {
            this.B(7993, ldv2);
            return;
        }
        fmx fmx2 = (fmx)this.MessageDelegator.h(7993, this.GUID, ldv2);
        fmx2.hsP = true;
        fmx2.ResourceType = n;
        fmx2.asi = n2;
        fmx2.aXQ = ldv3;
        fmx2.b(bqy2);
        this.MessageDelegator.F(fmx2);
    }

    protected final void a(int n, ldv ldv2, ldv ldv3, int n2) {
        assert (n > 0);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.hsP = true;
        gfm2.ResourceType = n;
        gfm2.iSi = 1;
        gfm2.Yc = ldv2 == null ? this.GUID.bFk() : ldv2;
        gfm2.gb = ldv3;
        gfm2.asi = n2;
        this.MessageDelegator.F(gfm2);
    }

    protected final void a(ldv ldv2, dob dob2, dny dny2) {
        assert (ldv2 != null);
        assert (dob2 != null);
        assert (dny2 != null);
        if (dng.gKK && this.gMp) {
            this.B(7991, ldv2);
            return;
        }
        fnl fnl2 = (fnl)this.MessageDelegator.h(7991, this.GUID, ldv2);
        fnl2.hsP = true;
        fnl2.iRa = dob2.GUID;
        fnl2.iRb = dob2.dAy;
        fnl2.gLC = dob2.gLC;
        fnl2.aCK = dny2.GUID;
        fnl2.dIW = dny2.dAy;
        this.MessageDelegator.F(fnl2);
    }

    protected final void a(ldv ldv2, doc doc2, ldv ldv3, ldv ldv4) {
        assert (ldv2 != null);
        assert (doc2 != null);
        assert (ldv3 != null);
        assert (ldv4 != null);
        if (dng.gKK && this.gMp) {
            this.B(7992, ldv2);
            return;
        }
        fnm fnm2 = (fnm)this.MessageDelegator.h(7992, this.GUID, ldv2);
        fnm2.hsP = true;
        fnm2.aCK = doc2.GUID;
        fnm2.dIW = doc2.dAy;
        fnm2.aXQ = ldv3;
        fnm2.iRc = ldv4;
        fnm2.gLC = doc2.gLC;
        fnm2.iRd = doc2.dJc;
        this.MessageDelegator.F(fnm2);
    }

    protected final void a(ldv ldv2, dob dob2, boolean bl) {
        this.a(ldv2, dob2, bl, false);
    }

    protected final void a(ldv ldv2, dob dob2, boolean bl, boolean bl2) {
        assert (ldv2 != null);
        assert (dob2 != null);
        if (dng.gKK && this.gMp) {
            this.B(7967, ldv2);
            return;
        }
        fnn fnn2 = (fnn)this.MessageDelegator.h(7967, this.GUID, ldv2);
        fnn2.hsP = true;
        fnn2.aCK = dob2.GUID;
        fnn2.dIW = dob2.dAy;
        fnn2.gLC = dob2.gLC;
        fnn2.iRe = bl;
        fnn2.iRf = bl2;
        this.MessageDelegator.F(fnn2);
    }

    protected final void a(ldv ldv2, bro[] broArray) {
        assert (ldv2 != null);
        assert (broArray != null);
        assert (broArray.length > 0);
        if (broArray == null) {
            lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Items for Logging is Null!!!");
            assert (false);
            return;
        }
        boolean bl = false;
        for (int i = 0; i < broArray.length; ++i) {
            if (broArray[i] != null) continue;
            lfn.b(5, this.getClass().getSimpleName(), "cleanUpTransaction() : Items for Logging contains a Null element!!!");
            assert (false);
            return;
        }
        gmb gmb2 = (gmb)this.MessageDelegator.h(3585, this.GUID, ldv2);
        gmb2.hh(ldv2);
        gmb2.a(broArray);
        this.MessageDelegator.F(gmb2);
    }

    private void a(brv brv2, boolean bl, List<bro> list) {
        bro bro2 = ((bqs)brv2.dIY).dS(bl);
        list.add(bro2);
        if (brv2 instanceof bpz) {
            bpz bpz2 = (bpz)brv2;
            if (bpz2.dBr == null) {
                return;
            }
            int n = bpz2.dBr.length;
            for (int i = 0; i < n; ++i) {
                this.a(bpz2.dBr[i], bl, list);
            }
        }
    }

    private void b(gre gre2) {
        lfn.b(5, "SFTransactionPerformer", "handleMessageSendingErrorMessage() Failed to deliver a message with MessagType=" + gre2.jqc);
        lfn.b(5, "SFTransactionPerformer", "handleMessageSendingErrorMessage() FromGUID=" + gre2.jqe + " ToGUID=" + gre2.jqf);
        lfn.b(5, "SFTransactionPerformer", "handleMessageSendingErrorMessage() TransactionObject " + this.GUID + " is in state " + this.mb);
        this.c(gre2.jqd, gre2.jqc, gre2.jqe, gre2.jqf);
    }

    private void B(int n, ldv ldv2) {
        this.f(-1, n, ldv2);
    }

    private void f(int n, int n2, ldv ldv2) {
        gre gre2 = (gre)this.MessageDelegator.h(11034, this.GUID, this.GUID);
        gre2.iHL = 1;
        gre2.jqd = n;
        gre2.jqc = n2;
        gre2.jqe = this.GUID;
        gre2.jqf = ldv2;
        this.MessageDelegator.F(gre2);
    }
}

