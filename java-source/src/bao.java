/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFConquestMercenaryContractDTO;

public final class bao
extends bbb {
    private ldv cMX = null;
    private String cMY = null;
    private bar[] cMZ = null;
    private float aEM = -1.0f;

    public ldv aiK() {
        return this.cMX;
    }

    public String aiL() {
        return this.cMY;
    }

    public ldv a(bbc bbc2) {
        bar bar2 = this.b(bbc2);
        if (bar2 == null) {
            assert (false);
            return null;
        }
        return bar2.aiP();
    }

    public void a(bbc bbc2, ldv ldv2) {
        bar bar2 = this.b(bbc2);
        if (bar2 != null) {
            bar2.gg(ldv2);
        }
    }

    public float afP() {
        return this.aEM;
    }

    public void cq(float f) {
        this.aEM = f;
    }

    private bao(bbe bbe2, bar bar2, bar bar3) {
        super(bbe2);
        this.cMZ = new bar[2];
        this.cMZ[bbc.cPP.getArrayIndex()] = bar2;
        this.cMZ[bbc.cPQ.getArrayIndex()] = bar3;
    }

    @Deprecated
    bao() {
    }

    bao(nq nq2) {
        super(bbe.getValueByOrdinal(nq2.aEC));
        this.cMX = nq2.aEF;
        this.cMY = nq2.aEG;
        this.aED = nq2.aED;
        this.aEE = nq2.aEE;
        this.cPN = nq2.aEL;
        this.aEM = nq2.aEM;
        bar bar2 = new bar(nq2.aEA);
        bar2.jP(nq2.aEH);
        bar2.jQ(nq2.aEI);
        bar bar3 = new bar(nq2.aEB);
        bar3.jP(nq2.aEJ);
        bar3.jQ(nq2.aEK);
        this.cMZ = new bar[2];
        this.cMZ[bbc.cPP.getArrayIndex()] = bar2;
        this.cMZ[bbc.cPQ.getArrayIndex()] = bar3;
    }

    nq aiM() {
        nq nq2 = new nq();
        nq2.aEC = this.aEC;
        nq2.aED = this.aED;
        nq2.aEE = this.aEE;
        nq2.aEF = this.cMX;
        nq2.aEG = this.cMY;
        nq2.aEA = this.g(bbc.cPP);
        nq2.aEH = this.f(bbc.cPP);
        nq2.aEI = this.i(bbc.cPP);
        nq2.aEB = this.g(bbc.cPQ);
        nq2.aEJ = this.f(bbc.cPQ);
        nq2.aEK = this.i(bbc.cPQ);
        nq2.aEL = this.cPN;
        nq2.aEM = this.aEM;
        return nq2;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (this.cMX == null ? 0 : this.cMX.hashCode());
    }

    @Override
    public boolean equals(Object object) {
        return object != null && object instanceof bao ? this.z((bao)object) : false;
    }

    public boolean z(bao bao2) {
        if (!super.b(bao2)) {
            return false;
        }
        if (this.cMX == null && bao2.cMX != null || this.cMX != null && bao2.cMX == null) {
            return false;
        }
        return this.cMX == null || bao2.cMX == null || this.cMX.equals(bao2.cMX);
    }

    protected bar b(bbc bbc2) {
        if (bbc2 == null || bbc2.getArrayIndex() < 0 || bbc2.getArrayIndex() >= this.cMZ.length) {
            return null;
        }
        return this.cMZ[bbc2.getArrayIndex()];
    }

    @Override
    public bca c(bbc bbc2) {
        if (bbc2 == null) {
            return null;
        }
        switch (bbc2) {
            case cPP: {
                return bca.cUC;
            }
            case cPQ: {
                return bca.cUD;
            }
        }
        return null;
    }

    @Override
    public bca d(bbc bbc2) {
        if (bbc2 == null) {
            return null;
        }
        switch (bbc2) {
            case cPP: {
                return bca.cUE;
            }
            case cPQ: {
                return bca.cUF;
            }
        }
        return null;
    }

    public bao aiN() {
        bao bao2 = new bao(this.ajs(), this.b(bbc.cPP), this.b(bbc.cPQ));
        bao2.aED = this.aED;
        bao2.aEE = this.aEE;
        bao2.cPN = this.cPN;
        bao2.aEM = this.aEM;
        bao2.cMX = this.cMX;
        bao2.cMY = this.cMY;
        return bao2;
    }

    static bao a(int n, ldv ldv2, ldv ldv3, String string, ldv ldv4, bbe bbe2) {
        switch (bbe2) {
            case cPU: {
                return bao.b(n, ldv2, ldv3, string, ldv4);
            }
            case cPV: {
                return bao.a(n, ldv2, ldv3, string, ldv4);
            }
        }
        return null;
    }

    static bao a(int n, ldv ldv2, ldv ldv3, String string, ldv ldv4) {
        if (n < 0 || ldv2 == null || ldv3 == null || string == null || ldv4 == null) {
            lfn.b(5, bao.class.getSimpleName(), "newMercenaryContract() : Contract Fields are Invalid!!!");
            assert (false);
            return null;
        }
        bar bar2 = new bar(ldv4);
        bar bar3 = new bar(ldv2);
        bar3.jP(n);
        bao bao2 = new bao(bbe.cPV, bar2, bar3);
        bao2.cMX = ldv3;
        bao2.cMY = string;
        return bao2;
    }

    static bao b(int n, ldv ldv2, ldv ldv3, String string, ldv ldv4) {
        if (n < 0 || ldv2 == null || ldv3 == null || string == null || ldv4 == null) {
            lfn.b(5, bao.class.getSimpleName(), "newEmployerContract() : Contract Fields are Invalid!!!");
            assert (false);
            return null;
        }
        bar bar2 = new bar(ldv2);
        bar2.jP(n);
        bar bar3 = new bar(ldv4);
        bao bao2 = new bao(bbe.cPU, bar2, bar3);
        bao2.cMX = ldv3;
        bao2.cMY = string;
        return bao2;
    }

    public baa aiO() {
        baa baa2 = new baa();
        baa2.fF(this.g(bbc.cPQ));
        baa2.fd(this.h(bbc.cPQ));
        baa2.jG(this.cPN);
        baa2.cq(this.aEM);
        return baa2;
    }

    public SFConquestMercenaryContractDTO s(ldv ldv2, boolean bl) {
        SFConquestMercenaryContractDTO sFConquestMercenaryContractDTO = new SFConquestMercenaryContractDTO();
        sFConquestMercenaryContractDTO.clanName = this.h(this.gk(ldv2).ajz());
        sFConquestMercenaryContractDTO.flatFeeAmount = this.cPN;
        sFConquestMercenaryContractDTO.wagerPercentageAmount = this.aEM;
        sFConquestMercenaryContractDTO.receivedContract = bl;
        return sFConquestMercenaryContractDTO;
    }

    @Override
    protected /* synthetic */ bbd e(bbc bbc2) {
        return this.b(bbc2);
    }
}

