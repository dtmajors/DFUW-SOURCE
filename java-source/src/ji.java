/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 *  lcr
 */
public class ji
extends btk {
    private final ha aer;
    private boolean akG = false;
    private int akH = 0;
    private ldv akI = null;
    private ljq akJ = null;
    private boolean akK = true;
    private static final ljq akL = new ljq(0.0f, -1.0f, 0.0f);
    private static final float akM = 0.5f;
    private static final float akN = 0.2f;
    private static final float akO = 0.75f;
    private static final float akP = 0.25f;
    private static final float akQ = 10.0f;
    private static final ljq akR = new ljq(0.0f, 1.0f, 0.0f);

    public ji(ha ha2) {
        this.aer = ha2;
    }

    public void cz(int n) {
        if (this.aer.jf() == null) {
            return;
        }
        if (this.aer.jf().aAG() == null) {
            return;
        }
        if (!this.aer.jf().aAG().isReadyToRun()) {
            return;
        }
        if (this.aer.iG() == null || lcr.qAC.equals(this.aer.iG())) {
            this.aer.c(mao.ucq.bD(new Object[0]));
            return;
        }
        if (this.akG) {
            this.aer.c(mao.ucr.bD(new Object[0]));
            return;
        }
        if (!this.aer.a(bca.cUA)) {
            this.aer.c(mao.ubr.bD(new Object[0]));
            return;
        }
        if (this.aer.jf().aJD().aEP().vK() != 3) {
            this.aer.c(mao.ucz.bD(new Object[0]));
            return;
        }
        if (this.aer.jf().aJD().aEP().vN() != 1) {
            this.aer.c(mao.ucz.bD(new Object[0]));
            return;
        }
        if (this.aer.jf().aJD().aEP().vO() != 6) {
            this.aer.c(mao.ucz.bD(new Object[0]));
            return;
        }
        if (this.aer.kg().lu()) {
            this.aer.c(mao.ucB.bD(new Object[0]));
            return;
        }
        this.akG = true;
        this.akH = n;
        ljq ljq2 = this.aer.jf().aAG().av();
        ljq2.y += 0.5f;
        this.akK = true;
        this.b(ljq2, akL, 0.75f);
    }

    private void a(kva kva2) {
        if (this.aer.iG() == null || lcr.qAC.equals(this.aer.iG())) {
            this.akG = false;
            this.aer.c(mao.ucq.bD(new Object[0]));
            return;
        }
        if (!this.aer.a(bca.cUA)) {
            this.akG = false;
            this.aer.c(mao.ubr.bD(new Object[0]));
            return;
        }
        if (!kva2.qeo) {
            this.akG = false;
            this.aer.c(mao.ucs.bD(new Object[0]));
            return;
        }
        this.akJ = kva2.qem;
        this.akI = this.aer.iG();
        euz euz2 = (euz)this.MessageDelegator.h(19973, this.getGUID(), this.aer.iG());
        euz2.diQ = this.aer.getGUID();
        euz2.iDp = this.akH;
        euz2.iDo = this.akJ;
        this.MessageDelegator.F(euz2);
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (this.aer.iG() == null || lcr.qAC.equals(this.aer.iG())) {
            this.akG = false;
            this.aer.c(mao.ucq.bD(new Object[0]));
            return;
        }
        if (!this.aer.a(bca.cUA)) {
            this.akG = false;
            this.aer.c(mao.ubr.bD(new Object[0]));
            return;
        }
        if (kuj2.bqd == null || kuj2.bqd.length == 0) {
            this.akG = false;
            this.aer.c(mao.ucs.bD(new Object[0]));
            return;
        }
        if (this.akK) {
            int n = -1;
            float f2 = Float.MAX_VALUE;
            for (int j = 0; j < kuj2.bqd.length; ++j) {
                if (kuj2.bqd[j] != cug.fkr || !(kuj2.pJh[j] < f2)) continue;
                f2 = kuj2.pJh[j];
                n = j;
            }
            if (n < 0) {
                this.akG = false;
                this.aer.c(mao.ucs.bD(new Object[0]));
                return;
            }
            this.akJ = kuj2.ilP[n];
            this.akK = false;
            ljq ljq2 = new ljq(this.akJ);
            ljq2.y += 0.25f;
            this.b(ljq2, akR, 10.0f);
            return;
        }
        int n = -1;
        for (int j = 0; j < kuj2.bqd.length; ++j) {
            if (lea.enW().isDescendant(kuj2.bqd[j], cug.fgz) || lea.enW().isDescendant(kuj2.bqd[j], cug.fpV)) continue;
            n = j;
            break;
        }
        if (n >= 0) {
            this.akG = false;
            this.aer.c(mao.ucs.bD(new Object[0]));
            return;
        }
        this.akI = this.aer.iG();
        euz euz2 = (euz)this.MessageDelegator.h(19973, this.getGUID(), this.aer.iG());
        euz2.diQ = this.aer.getGUID();
        euz2.iDp = this.akH;
        euz2.iDo = this.akJ;
        this.MessageDelegator.F(euz2);
    }

    private void a(eva eva2) {
        assert (eva2.ew != 0);
        this.akG = false;
        switch (eva2.ew) {
            case 1: {
                this.aer.c(mao.ucq.bD(new Object[0]));
                return;
            }
            case 2: {
                this.aer.c(mao.ubr.bD(new Object[0]));
                return;
            }
            case 3: {
                this.aer.c(mao.uct.bD(new Object[0]));
                return;
            }
            case 4: {
                this.aer.c(mao.ucu.bD(new Object[0]));
                return;
            }
            case 5: {
                this.aer.c(mao.ucv.bD(new Object[0]));
                return;
            }
            case 6: {
                this.aer.c(mao.ucw.bD(new Object[0]));
                return;
            }
            case 7: {
                this.aer.c(mao.ucr.bD(new Object[0]));
                return;
            }
            case 8: {
                this.aer.c(mao.ucx.bD(new Object[0]));
                return;
            }
            case 9: {
                this.aer.c(mao.ucy.bD(new Object[0]));
                return;
            }
            case 10: {
                this.aer.c(mao.ucA.bD(new Object[0]));
                return;
            }
            case 12: {
                this.aer.c(mao.ucB.bD(new Object[0]));
                return;
            }
        }
        this.akG = true;
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), this.aer.getGUID());
        fne2.hsP = true;
        fne2.aqs = this.akH;
        fne2.ResourceType = this.akH;
        fne2.asi = 1;
        fne2.b(bqy.dHw);
        this.aer.receiveMessage((dxq)fne2);
    }

    private void a(fnf fnf2) {
        assert (this.akI != null);
        this.akG = false;
        evc evc2 = (evc)this.MessageDelegator.h(19975, this.getGUID(), this.akI);
        evc2.diQ = this.aer.getGUID();
        evc2.iDp = this.akH;
        evc2.akJ = this.akJ;
        evc2.YL = this.aer.iU();
        evc2.iDF = fnf2.iQM;
        this.MessageDelegator.F(evc2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19974: {
                this.a((eva)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            case 1030: {
                this.a((kva)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void b(ljq ljq2, ljq ljq3, float f2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq3);
        kji2.setLength(f2);
        this.MessageDelegator.a(kji2);
    }

    private void T(ljq ljq2) {
        klk klk2 = (klk)this.MessageDelegator.h(1042);
        int[] nArray = new int[]{cug.fkr};
        klk2.pIT = nArray;
        klk2.Position = ljq2;
        klk2.pCY = -4098;
        klk2.pIU = 1.0f;
        klk2.pIX = 1.5707964f;
        this.MessageDelegator.a(klk2);
    }
}

