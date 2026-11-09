/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  lcr
 */
import java.util.Map;

public class dnk
extends btk {
    private dni gKP = null;
    private Map<Integer, dnj> gKQ = lcn.emw();
    private int dBF = 1;

    public dnk(dni dni2) {
        this.gKP = dni2;
    }

    public dni bry() {
        return this.gKP;
    }

    @Override
    public void cleanUp() {
        if (this.gKQ.isEmpty()) {
            return;
        }
        lfn.b(5, "SFTransactionSessionManager", "cleanUp() TransactionSessionMap is not empty for " + this.GUID);
        for (dnj dnj2 : this.gKQ.values()) {
            lfn.b(5, "SFTransactionSessionManager", "cleanUp() " + dnj2);
        }
    }

    public void a(don don2) {
        assert (this.gKP != null);
        assert (don2 != null);
        assert (don2.brK() != null);
        this.a(don2.brK().gKN);
    }

    public void b(don don2) {
        assert (this.gKP != null);
        assert (don2 != null);
        assert (don2.brK() != null);
        dxq dxq2 = don2.is(false);
        if (dxq2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "notifyInfoAssemblerFailed() ResponseMessage is null.");
            lfn.b(5, "SFTransactionSessionManager", "notifyInfoAssemblerFailed() InfoAssembler: " + don2.getClass().getName());
        } else {
            this.MessageDelegator.F(dxq2);
        }
        don2.brL();
        this.MessageDelegator.hd(don2.getGUID());
        this.gKQ.remove(don2.brK().aYH);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11266: {
                this.a((gxy)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void a(ldv ldv2, fky fky2) {
        Object object;
        if (ldv2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() RequestorClientGUID is null.");
            return;
        }
        if (fky2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() Message is null.");
            return;
        }
        assert (fky2.dxt != null);
        Object object2 = null;
        don don2 = null;
        switch (fky2.cZn) {
            case 1: {
                object = new dnn();
                ((dnn)object).gKS = this.gKP.asf().auk().az();
                ((dnn)object).dAu = fky2.dxt;
                ((dnn)object).aXQ = fky2.dxt;
                ((dnn)object).dJc = fky2.dJc;
                ((dnn)object).gKW = fky2.gKW;
                ((dnn)object).gKX = fky2.iPi;
                object2 = object;
                don2 = new doe();
                break;
            }
            case 2: {
                object = new dnp();
                ((dnp)object).gKS = this.gKP.asf().auk().az();
                ((dnp)object).dAu = fky2.dxt;
                ((dnp)object).aXQ = fky2.dxt;
                ((dnp)object).dJc = fky2.dJc;
                ((dnp)object).gLa = fky2.gLa;
                ((dnp)object).gKW = fky2.gKW;
                ((dnp)object).gKX = fky2.iPi;
                object2 = object;
                don2 = new dog();
                break;
            }
            case 3: {
                assert (fky2.aCK != null);
                object = new doa();
                ((doa)object).GUID = fky2.aCK;
                ((doa)object).ResourceType = fky2.aRX;
                ((doa)object).asi = fky2.iPh;
                ((doa)object).aXV = fky2.iPi * (float)fky2.iPh;
                assert (this.gKP.asf() instanceof brl);
                brl brl2 = (brl)this.gKP.asf();
                bqb bqb2 = brl2.avR();
                dny dny2 = new dny();
                dny2.GUID = bqb2.getGUID();
                dns dns2 = new dns();
                dns2.gKS = this.gKP.asf().auk().az();
                dns2.gLc = this.gKP.asf().getGUID();
                dns2.gLd = this.gKP.asf().getGUID();
                dns2.gLk = object;
                dns2.gLl = dny2;
                dns2.gLf = fky2.dxt;
                dns2.gLg = fky2.dxt;
                object2 = dns2;
                don2 = new doj();
                break;
            }
            default: {
                lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() Invalid transactiontype provided: " + fky2.cZn);
                return;
            }
        }
        ((dnl)object2).gKR = this.MessageDelegator.bzv();
        ((dnl)object2).ec = this.GUID;
        object = new dnj();
        ((dnj)object).aYH = this.brz();
        ((dnj)object).gKM = ldv2;
        ((dnj)object).aqs = fky2.aVk();
        ((dnj)object).gKN = object2;
        ((dnj)object).gKO = don2;
        this.gKQ.put(((dnj)object).aYH, (dnj)object);
        don2.setGUID(this.MessageDelegator.bzv());
        don2.a(this);
        don2.a((dnj)object);
        this.MessageDelegator.a(don2);
    }

    public void a(ldv ldv2, flj flj2) {
        if (ldv2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() RequestorClientGUID is null.");
            return;
        }
        if (flj2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() Message is null.");
            return;
        }
        assert (flj2.aCK != null);
        assert (flj2.dJc >= 0);
        dod dod2 = new dod();
        dod2.GUID = flj2.aCK;
        dod2.dJc = flj2.dJc;
        dno dno2 = new dno();
        dno2.gKT = this.gKP.asf().auk().az();
        dno2.dAu = this.gKP.asf().getGUID();
        dno2.gKZ = dod2;
        dof dof2 = new dof();
        dno2.gKR = this.MessageDelegator.bzv();
        dno2.ec = this.GUID;
        dno2.gKS = this.gKP.asf().auk().az();
        dnj dnj2 = new dnj();
        dnj2.aYH = this.brz();
        dnj2.gKM = ldv2;
        dnj2.aqs = flj2.aVk();
        dnj2.gKN = dno2;
        dnj2.gKO = dof2;
        this.gKQ.put(dnj2.aYH, dnj2);
        dof2.setGUID(this.MessageDelegator.bzv());
        dof2.a(this);
        dof2.a(dnj2);
        this.MessageDelegator.a(dof2);
    }

    public void a(ldv ldv2, flz flz2) {
        Object object;
        if (ldv2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() RequestorClientGUID is null.");
            return;
        }
        if (flz2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() Message is null.");
            return;
        }
        assert (flz2.gLy != null);
        assert (flz2.iPE != null);
        dnl dnl2 = null;
        don don2 = null;
        if (flz2.iPF == null) {
            object = new dny();
            ((dny)object).GUID = flz2.iPE;
            dnr dnr2 = new dnr();
            dnr2.gKT = this.gKP.asf().auk().az();
            dnr2.dAu = this.gKP.asf().getGUID();
            dnr2.aXQ = flz2.gLy;
            dnr2.gLi = object;
            dnr2.Tr = flz2.Tr;
            dnr2.gLj = true;
            dnr2.b(bqy.dHs);
            dnl2 = dnr2;
            don2 = new doi();
        } else if (this.gKP.asf().getGUID().equals(flz2.iPF)) {
            assert (flz2.gLz != null);
            object = new dod();
            ((dod)object).GUID = flz2.iPE;
            ((dod)object).dJc = flz2.dJc;
            dnx dnx2 = new dnx();
            dnx2.gKT = this.gKP.asf().auk().az();
            dnx2.dAu = this.gKP.asf().getGUID();
            dnx2.gLy = flz2.gLy;
            dnx2.gKZ = object;
            dnx2.gLz = flz2.gLz;
            bri bri2 = (bri)this.gKP.asf();
            bqs bqs2 = bri2.iK(flz2.iPE);
            ((dod)object).aRX = bqs2.az();
            dnx2.gLv = bqs2.auW();
            if (flz2.iPH != null) {
                dnx2.gLz = flz2.iPH;
                bqe bqe2 = bri2.aun().awa();
                if (bqe2 != null && dnx2.gLz.equals(bqe2.getGUID())) {
                    dnx2.gLv = false;
                }
            }
            dnl2 = dnx2;
            don2 = new dop();
        } else {
            assert (flz2.gLz != null);
            object = new dod();
            ((dod)object).GUID = flz2.iPE;
            ((dod)object).dJc = flz2.dJc;
            dnw dnw2 = new dnw();
            dnw2.gLc = this.gKP.asf().getGUID();
            dnw2.gLd = flz2.gLy;
            dnw2.gLt = object;
            dnw2.gLf = flz2.iPF;
            dnw2.gLg = flz2.gLz;
            dnw2.gLu = flz2.iPG;
            dnw2.gLw = flz2.gLw;
            bri bri3 = (bri)this.gKP.asf();
            bqs bqs3 = bri3.iK(flz2.iPE);
            if (bri3.auk() instanceof cex) {
                cex cex2 = (cex)bri3.auk();
                hc hc2 = cex2.jT();
                dnw2.gLx = hc2 != null ? hc2.ordinal() : hc.aaz.ordinal();
            }
            ((dod)object).gLD = bqs3.avT().aws();
            ((dod)object).gLE = bqs3.avT().awt();
            ((dod)object).aRX = bqs3.az();
            if (flz2.iPH != null) {
                dnw2.gLg = flz2.iPH;
                dnw2.gLv = bqs3.auW();
            }
            dnl2 = dnw2;
            don2 = new doo();
        }
        dnl2.gKR = this.MessageDelegator.bzv();
        dnl2.ec = this.GUID;
        dnl2.gKS = this.gKP.asf().auk().az();
        object = new dnj();
        ((dnj)object).aYH = this.brz();
        ((dnj)object).gKM = ldv2;
        ((dnj)object).aqs = flz2.aVk();
        ((dnj)object).gKN = dnl2;
        ((dnj)object).gKO = don2;
        this.gKQ.put(((dnj)object).aYH, (dnj)object);
        don2.setGUID(this.MessageDelegator.bzv());
        don2.a(this);
        don2.a((dnj)object);
        this.MessageDelegator.a(don2);
    }

    public void a(ldv ldv2, fme fme2) {
        Object object;
        if (ldv2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() RequestorClientGUID is null.");
            return;
        }
        if (fme2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() Message is null.");
            return;
        }
        assert (fme2.gLy != null);
        assert (fme2.iPE != null);
        dnl dnl2 = null;
        don don2 = null;
        switch (fme2.ilu) {
            case 1: {
                object = new dny();
                ((dny)object).GUID = fme2.iPE;
                dny dny2 = new dny();
                dny2.GUID = fme2.iPQ;
                int n = 3;
                if (this.gKP.asf().getGUID().equals(fme2.iPF)) {
                    n = 4;
                }
                dnq dnq2 = new dnq(n);
                dnq2.gLc = this.gKP.asf().getGUID();
                dnq2.gLd = fme2.gLy;
                dnq2.gLe = object;
                dnq2.gLf = fme2.iPF;
                dnq2.gLg = fme2.gLz;
                dnq2.gLh = dny2;
                dnl2 = dnq2;
                don2 = new doh();
                break;
            }
            case 2: {
                object = (bri)this.gKP.asf();
                bqs bqs2 = object.iK(fme2.iPE);
                doc doc2 = new doc();
                doc2.GUID = fme2.iPE;
                doc2.gLB = fme2.iPP;
                doc2.gLC = fme2.gLC;
                doc2.dJc = fme2.dJc;
                doc2.aRX = bqs2.az();
                int n = 7;
                if (this.gKP.asf().getGUID().equals(fme2.iPF)) {
                    n = 11;
                }
                dnt dnt2 = new dnt(n);
                dnt2.gLc = this.gKP.asf().getGUID();
                dnt2.gLd = fme2.gLy;
                dnt2.gLn = doc2;
                dnt2.gLf = fme2.iPF;
                dnt2.gLg = fme2.gLz;
                dnt2.gLo = this.MessageDelegator.bzv();
                doc2.gLD = bqs2.avT().aws();
                doc2.gLE = bqs2.avT().awt();
                if (fme2.iPR != null) {
                    dnt2.gLg = fme2.iPR;
                    dnt2.gLp = fme2.iPS && bqs2.auW();
                }
                dnl2 = dnt2;
                don2 = new dom();
                break;
            }
            case 4: {
                object = new dob();
                ((dob)object).GUID = fme2.iPE;
                ((dob)object).gLB = fme2.iPP;
                ((dob)object).gLC = fme2.gLC;
                dnu dnu2 = new dnu();
                dnu2.gKT = this.gKP.asf().auk().az();
                dnu2.dAu = this.gKP.asf().getGUID();
                dnu2.aXQ = fme2.gLy;
                dnu2.gLr = object;
                dnu2.Tr = fme2.Tr;
                dnl2 = dnu2;
                don2 = new dok();
                break;
            }
            case 8: {
                object = new dob();
                ((dob)object).GUID = fme2.iPE;
                ((dob)object).gLB = fme2.iPP;
                ((dob)object).gLC = fme2.gLC;
                dny dny3 = new dny();
                dny3.GUID = fme2.iPQ;
                int n = 9;
                if (this.gKP.asf().getGUID().equals(fme2.iPF)) {
                    n = 10;
                }
                dnv dnv2 = new dnv(n);
                dnv2.gLc = this.gKP.asf().getGUID();
                dnv2.gLd = fme2.gLy;
                dnv2.gLs = object;
                dnv2.gLf = fme2.iPF;
                dnv2.gLg = fme2.gLz;
                dnv2.gLh = dny3;
                dnl2 = dnv2;
                don2 = new dol();
                break;
            }
            default: {
                lfn.b(5, "SFTransactionSessionManager", "startTransactionSession() Invalid operationtype provided: " + fme2.ilu);
                return;
            }
        }
        dnl2.gKR = this.MessageDelegator.bzv();
        dnl2.ec = this.GUID;
        dnl2.gKS = this.gKP.asf().auk().az();
        object = new dnj();
        ((dnj)object).aYH = this.brz();
        ((dnj)object).gKM = ldv2;
        ((dnj)object).aqs = fme2.aVk();
        ((dnj)object).gKN = dnl2;
        ((dnj)object).gKO = don2;
        this.gKQ.put(((dnj)object).aYH, (dnj)object);
        don2.setGUID(this.MessageDelegator.bzv());
        don2.a(this);
        don2.a((dnj)object);
        this.MessageDelegator.a(don2);
    }

    private dnj nv(ldv ldv2) {
        assert (ldv2 != null);
        for (dnj dnj2 : this.gKQ.values()) {
            if (!dnj2.gKN.gKR.equals(ldv2)) continue;
            return dnj2;
        }
        return null;
    }

    private int brz() {
        return this.dBF++;
    }

    private void a(gxy gxy2) {
        if (gxy2.gKN == null) {
            lfn.b(5, "SFTransactionInfoAssembler", "handleTransactionResponse() Info is null.");
            return;
        }
        dnj dnj2 = this.nv(gxy2.gKN.gKR);
        if (dnj2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "handleTransactionResponse() TransactionSession was not found.");
            lfn.b(5, "SFTransactionSessionManager", "handleTransactionResponse() " + gxy2.gKN);
            return;
        }
        assert (dnj2.gKM != null);
        assert (dnj2.gKN != null);
        assert (dnj2.gKO != null);
        don don2 = dnj2.gKO;
        dxq dxq2 = don2.is(gxy2.iPj);
        if (dxq2 == null) {
            lfn.b(5, "SFTransactionSessionManager", "handleTransactionResponse() ResponseMessage is null.");
            lfn.b(5, "SFTransactionSessionManager", "handleTransactionResponse() InfoAssembler: " + don2.getClass().getName());
        } else {
            this.MessageDelegator.F(dxq2);
        }
        this.MessageDelegator.hd(don2.getGUID());
        this.gKQ.remove(dnj2.aYH);
        this.MessageDelegator.oa(gxy2.gKN.gKR);
    }

    private void a(dnl dnl2) {
        assert (dnl2 != null);
        gxx gxx2 = (gxx)this.MessageDelegator.h(11265, this.GUID, lcr.qEj);
        gxx2.gMn = dnl2;
        this.MessageDelegator.E(gxx2);
    }
}

