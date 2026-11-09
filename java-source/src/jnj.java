/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jnk
 */
import java.util.Set;

public class jnj
extends jnl {
    ayp sQ(ldv ldv2) {
        if (!this.nDv.dNI()) {
            return null;
        }
        for (int j = 0; j < this.nDF.abb().length; ++j) {
            if (!this.nDF.abb()[j].getGUID().equals(ldv2)) continue;
            return this.nDF.abb()[j];
        }
        return null;
    }

    int aay() {
        if (!this.nDv.dNI()) {
            return 0;
        }
        int n = 0;
        for (int j = 0; j < this.nDF.abb().length; ++j) {
            if (!this.nDE.nc(this.nDF.abb()[j].getGUID())) continue;
            ++n;
        }
        return n;
    }

    int d(ayb ayb2) {
        if (!this.nDv.dNI()) {
            return 0;
        }
        int n = 0;
        for (int j = 0; j < this.nDF.abb().length; ++j) {
            if (this.nDF.abb()[j].abi() != ayb2 || !this.nDE.nc(this.nDF.abb()[j].getGUID())) continue;
            ++n;
        }
        return n;
    }

    boolean sQ(String string) {
        if (!this.nDv.dNI()) {
            return false;
        }
        for (ayp ayp2 : this.nDF.abb()) {
            if (!ayp2.getID().equals(string)) continue;
            return true;
        }
        return false;
    }

    jnj(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
    }

    @Override
    void dND() {
        super.dND();
    }

    @Override
    void dNE() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void dNF() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void bqx() {
        this.nDF = null;
    }

    void a(ldv ldv2, ays ays2, cla cla2, ayx ayx2, azf azf2, ldv[] ldvArray, azh azh2, boolean bl, boolean bl2, ayx ayx3, htn htn2) {
        int n;
        if (ldv2 == null || htn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "updateClanCityConfiguration() : Invalid Parameters!!!... CityGUID = " + ldv2 + ", UpdateHandler = " + htn2);
            assert (false);
            return;
        }
        if (!this.nDv.dNI()) {
            htn2.nv(aza.cCJ.YF().bD(new Object[0]).exA());
            return;
        }
        ayp ayp2 = null;
        for (ayp ayp3 : this.nDF.abb()) {
            if (!ayp3.getGUID().equals(ldv2)) continue;
            ayp2 = ayp3;
            break;
        }
        if (ayp2 == null) {
            htn2.nv(aza.cCL.YF().bD(new Object[0]).exA());
            return;
        }
        boolean bl3 = hso.cxK().bAn().Tr.equals(ayp2.YS());
        int n2 = 0;
        int n3 = 0;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        if (ayp2.YS() == null && ays2 != null || ayp2.YS() != null && ays2 == null || ayp2.YS() != null && ays2 != null && !ayp2.YS().equals(ays2.abB())) {
            if (!this.nDF.b(bca.cUL) && !bl3) {
                htn2.nv(aza.cCK.YF().bD(new Object[0]).exA());
                return;
            }
            n2 = 1;
        }
        if (cla2 != ayp2.abl()) {
            if (!this.nDF.b(bca.cUR) && !bl3) {
                htn2.nv(aza.cCK.YF().bD(new Object[0]).exA());
                return;
            }
            if (cla2 == null) {
                htn2.nv(aza.cCN.YF().bD(new Object[0]).exA());
                return;
            }
            n3 = 1;
        }
        if (ayx2 != ayp2.abm()) {
            if (!this.nDF.b(bca.cUP) && !bl3) {
                htn2.nv(aza.cCK.YF().bD(new Object[0]).exA());
                return;
            }
            if (ayx2 == null) {
                htn2.nv(aza.cCO.YF().bD(new Object[0]).exA());
                return;
            }
            bl4 = true;
        }
        if (ayx3 != ayp2.abn()) {
            if (!this.nDF.b(bca.cUV) && !bl3) {
                htn2.nv(aza.cCK.YF().bD(new Object[0]).exA());
                return;
            }
            if (ayx3 == null) {
                htn2.nv(aza.cCO.YF().bD(new Object[0]).exA());
                return;
            }
            bl5 = true;
        }
        if (azf2 != ayp2.Zr()) {
            if (!this.nDF.b(bca.cUU) && !bl3) {
                htn2.nv(aza.cCK.YF().bD(new Object[0]).exA());
                return;
            }
            if (azf2 == null) {
                htn2.nv(aza.cCP.YF().bD(new Object[0]).exA());
                return;
            }
            bl6 = true;
        }
        if (azh2 != ayp2.abr()) {
            if (!this.nDF.b(bca.cUT) && !bl3) {
                htn2.nv(aza.cCK.YF().bD(new Object[0]).exA());
                return;
            }
            n = jng.itG.a(ayp2.abi(), azh2, bl2, ayp2.Xx());
            if (this.nDF.aaq() < n) {
                htn2.nv(aza.cCR.YF().bD(new Object[0]).exA());
                return;
            }
            if (this.nDE.nc(ayp2.getGUID())) {
                htn2.nv(aza.cCS.YF().bD(new Object[0]).exA());
                return;
            }
            bl7 = true;
        }
        if (bl != ayp2.abs()) {
            if (!this.nDF.b(bca.cUT) && !bl3) {
                htn2.nv(aza.cCK.YF().bD(new Object[0]).exA());
                return;
            }
            bl8 = true;
        }
        int n4 = n = ldvArray != null && ldvArray.length > 0;
        if (!(n2 || n3 || bl4 || bl6 || n || bl7 || bl8 || bl5)) {
            htn2.nv(aza.cCI.YF().bD(new Object[0]).exA());
            return;
        }
        this.nDC.a(htn2);
        this.a(ldv2, n2 != 0, ays2 == null ? null : ays2.abB(), n3 != 0, cla2, bl4, ayx2, bl5, ayx3, bl6, azf2, n != 0, ldvArray == null ? new ldv[]{} : ldvArray, bl7, azh2, bl2, bl8, bl);
    }

    void a(ldv ldv2, aze aze2, aya aya2, htq htq2) {
        int n;
        if (ldv2 == null || aze2 == null || aya2 == null || htq2 == null) {
            if (htq2 != null) {
                htq2.nx(axz.cuC.YF().bD(new Object[0]).exA());
            }
            return;
        }
        if (!this.nDv.dNI()) {
            htq2.nx(axz.cuD.YF().bD(new Object[0]).exA());
            return;
        }
        ayp ayp2 = null;
        for (n = 0; n < this.nDF.abb().length; ++n) {
            if (!this.nDF.abb()[n].getGUID().equals(ldv2)) continue;
            ayp2 = this.nDF.abb()[n];
            break;
        }
        if (ayp2 == null) {
            htq2.nx(axz.cuF.YF().bD(new Object[0]).exA());
            return;
        }
        if (!this.nDF.b(bca.cUH) && !hso.cxK().bAn().Tr.equals(ayp2.getGUID())) {
            htq2.nx(axz.cuE.YF().bD(new Object[0]).exA());
            return;
        }
        n = 0;
        for (int j = 0; j < ayp2.abo().length; ++j) {
            if (ayp2.abo()[j].getID() != aze2.getID()) continue;
            n = 1;
            break;
        }
        if (n == 0) {
            htq2.nx(axz.cuK.YF().bD(new Object[0]).exA());
            return;
        }
        switch (aya2) {
            case cvd: {
                if (aze2.acK()) {
                    htq2.nx(axz.cuM.YF().bD(new Object[0]).exA());
                    return;
                }
                if (aze2.acL()) break;
                htq2.nx(axz.cuU.YF().bD(new Object[0]).exA());
                return;
            }
            case cve: {
                if (!aze2.acK()) {
                    htq2.nx(axz.cuV.YF().bD(new Object[0]).exA());
                    return;
                }
                if (aze2.XS() != aze2.XT()) break;
                htq2.nx(axz.cuP.YF().bD(new Object[0]).exA());
                return;
            }
            case cvf: {
                if (!aze2.acK()) {
                    htq2.nx(axz.cuW.YF().bD(new Object[0]).exA());
                    return;
                }
                if (aze2.XS() != 0) break;
                htq2.nx(axz.cuS.YF().bD(new Object[0]).exA());
                return;
            }
            case cvg: {
                if (aze2.acK()) break;
                htq2.nx(axz.cuX.YF().bD(new Object[0]).exA());
                return;
            }
        }
        this.nDC.a(htq2);
        this.b(ldv2, aze2.getID(), aya2);
    }

    private void a(ldv ldv2, boolean bl, ldv ldv3, boolean bl2, cla cla2, boolean bl3, ayx ayx2, boolean bl4, ayx ayx3, boolean bl5, azf azf2, boolean bl6, ldv[] ldvArray, boolean bl7, azh azh2, boolean bl8, boolean bl9, boolean bl10) {
        assert (this.nDv.dNI());
        assert (ldv2 != null);
        assert (bl || bl2 || bl4 || bl3 || bl6 || bl5 || bl7 || bl9);
        ekm ekm2 = (ekm)this.MessageDelegator.h(13904, this.GUID, this.nDF.iG());
        ekm2.ci(ldv2);
        ekm2.oS(hso.cxK().bAn().Tr);
        ekm2.ds(ldv3);
        ekm2.d(cla2);
        ekm2.c(ayx2);
        ekm2.d(ayx3);
        ekm2.b(azf2);
        ekm2.r(ldvArray);
        ekm2.a(azh2);
        ekm2.kx(bl10);
        ekm2.ky(bl8);
        if (bl) {
            ekm2.bHQ();
        }
        if (bl2) {
            ekm2.bHT();
        }
        if (bl3) {
            ekm2.bHW();
        }
        if (bl4) {
            ekm2.bHX();
        }
        if (bl5) {
            ekm2.bIc();
        }
        if (bl6) {
            ekm2.bIa();
        }
        if (bl7) {
            ekm2.bIf();
        }
        if (bl9) {
            ekm2.bIh();
        }
        this.MessageDelegator.F(ekm2);
    }

    private void b(ldv ldv2, int n, aya aya2) {
        assert (this.nDv.dNI());
        assert (ldv2 != null);
        assert (n >= 0);
        assert (aya2 != null);
        eko eko2 = (eko)this.MessageDelegator.h(13902, this.GUID, this.nDF.iG());
        eko2.oS(hso.cxK().bAn().Tr);
        eko2.ci(ldv2);
        eko2.El(n);
        eko2.a(aya2);
        this.MessageDelegator.F(eko2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000) {
            this.a((eqr)dxq2);
            return;
        }
        switch (dxq2.bEz()) {
            case 13905: {
                this.a((ekn)dxq2);
                break;
            }
            case 13903: {
                this.a((ekp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eqr eqr2) {
        switch (eqr2.bHc()) {
            case 1025: {
                this.a((epb)eqr2);
                break;
            }
            case 1026: {
                this.a((epi)eqr2);
                break;
            }
            case 1027: {
                this.a((epk)eqr2);
                break;
            }
            case 1028: {
                this.a((epm)eqr2);
                break;
            }
            case 1029: {
                this.a((epa)eqr2);
                break;
            }
            case 1030: {
                this.a((epc)eqr2);
                break;
            }
            case 1031: {
                this.a((epe)eqr2);
                break;
            }
            case 1032: {
                this.a((epd)eqr2);
                break;
            }
            case 1033: {
                this.a((eph)eqr2);
                break;
            }
            case 1034: {
                this.a((eoz)eqr2);
                break;
            }
            case 1038: {
                this.a((epj)eqr2);
                break;
            }
            case 1035: {
                this.a((epg)eqr2);
                break;
            }
            case 1036: {
                this.a((epf)eqr2);
                break;
            }
            case 1037: {
                this.a((epl)eqr2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanClientUpdateMessage() : Unknown Update Type (" + eqr2.bHc() + ") Received!!!");
                assert (false);
                return;
            }
        }
    }

    private void a(epb epb2) {
        this.nDF.a(epb2.bKm());
        Set<hts> set = this.nDC.c(hts.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hts hts2 : set) {
                hts2.c(this.nDF);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epi epi2) {
        this.nDF.eB(epi2.afl());
        Set<hts> set = this.nDC.c(hts.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hts hts2 : set) {
                hts2.c(this.nDF);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epk epk2) {
        ayp ayp2 = this.sQ(epk2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingMayorChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ays ays2 = this.nDv.sB(epk2.bKu());
        if (epk2.bKu() != null && ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingMayorChangedMessage() : New Mayor GUID Exists, But Mayor's Clan Member Cannot Be Found!!!");
            assert (false);
            return;
        }
        ayp2.j(epk2.bKu(), ays2 != null ? ays2.getName() : null);
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epm epm2) {
        ayp ayp2 = this.sQ(epm2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHodlingStructureUpdatedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        Set<aze> set = ayp2.a(epm2.bKw());
        Set<htr> set2 = this.nDC.c(htr.class);
        if (!set2.isEmpty()) {
            this.nDC.ir(true);
            for (htr htr2 : set2) {
                htr2.a(this.nDF, ayp2, set);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epa epa2) {
        ayp ayp2 = this.sQ(epa2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingCapacityUpdatedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.iT(epa2.bKl());
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epc epc2) {
        ayp ayp2 = this.sQ(epc2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingCitizenAddedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.a(epc2.bKn());
        Set<htp> set = this.nDC.c(htp.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htp htp2 : set) {
                htp2.e(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epe epe2) {
        ayp ayp2 = this.sQ(epe2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingCitizenRemovedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.et(epe2.bKp());
        Set<htp> set = this.nDC.c(htp.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htp htp2 : set) {
                htp2.e(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epd epd2) {
        ayp ayp2 = this.sQ(epd2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingCitizenDetailsChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.b(epd2.bKo());
        Set<htp> set = this.nDC.c(htp.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htp htp2 : set) {
                htp2.e(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(eph eph2) {
        ayp ayp2 = this.sQ(eph2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingGuardPolicyChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.b(eph2.bKs());
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(eoz eoz2) {
        ayp ayp2 = this.sQ(eoz2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingBankAccessPolicyChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.a(eoz2.bKk());
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epj epj2) {
        ayp ayp2 = this.sQ(epj2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingBankAccessPolicyChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.b(epj2.bKt());
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epg epg2) {
        ayp ayp2 = this.sQ(epg2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingGateControlPolicyChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.a(epg2.bKr());
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epf epf2) {
        ayp ayp2 = this.sQ(epf2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingConquestProtectionsChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.a(epf2.abr(), epf2.bKq(), epf2.abs(), epf2.aiq());
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epl epl2) {
        ayp ayp2 = this.sQ(epl2.afl());
        if (ayp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientHoldingConquestProtectionsChangedMessage() : Holding Update Message Received, But Holding Not Found!!!");
            return;
        }
        ayp2.iU(epl2.bKv());
        Set<hto> set = this.nDC.c(hto.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hto hto2 : set) {
                hto2.d(ayp2);
            }
            this.nDC.ir(false);
        }
    }

    private void a(ekn ekn2) {
        Set<htn> set = this.nDC.c(htn.class);
        if (set.isEmpty()) {
            return;
        }
        this.nDC.ir(true);
        for (htn htn2 : set) {
            if (ekn2.bIi().vA()) {
                htn2.nu(ekn2.bIi().YF().bD(new Object[0]).exA());
                continue;
            }
            htn2.nv(ekn2.bIi().YF().bD(new Object[0]).exA());
        }
        this.nDC.ir(false);
    }

    private void a(ekp ekp2) {
        Set<htq> set = this.nDC.c(htq.class);
        if (set.isEmpty()) {
            return;
        }
        this.nDC.ir(true);
        for (htq htq2 : set) {
            if (ekp2.bHF().vA()) {
                htq2.nw(ekp2.bIk());
                continue;
            }
            htq2.nx(ekp2.bIk());
        }
        this.nDC.ir(false);
    }
}

