/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jnk
 */
import java.util.Map;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;

public class jnm
extends jnl {
    private static final int nDU = 1;
    private static final int nDV = 2;
    private Map<Integer, emh> nDW = null;
    private int nDX = 0;
    private long nDY = 0L;
    private lil<ldv, bcb, bcb> nDZ = null;

    ays dNu() {
        return this.nDv.dNI() ? this.nDF.abQ() : null;
    }

    ays sB(ldv ldv2) {
        if (ldv2 == null || !this.nDv.dNI()) {
            return null;
        }
        for (ays ays2 : this.nDF.abO()) {
            if (!ays2.abB().equals(ldv2)) continue;
            return ays2;
        }
        return null;
    }

    ays sN(String string) {
        if (string == null || !this.nDv.dNI()) {
            return null;
        }
        for (ays ays2 : this.nDF.abO()) {
            if (ays2.getName().compareToIgnoreCase(string) != 0) continue;
            return ays2;
        }
        return null;
    }

    ays a(SFClanMemberInformationDTO sFClanMemberInformationDTO) {
        if (sFClanMemberInformationDTO == null || !this.nDv.dNI()) {
            return null;
        }
        for (ays ays2 : this.nDF.abO()) {
            if (ays2.getName().compareToIgnoreCase(sFClanMemberInformationDTO.name) != 0) continue;
            return ays2;
        }
        return null;
    }

    boolean dNL() {
        return this.nDv.dNI() ? this.nDF.abR() != null && this.nDF.abR().length > 0 : false;
    }

    int akw() {
        return this.nDv.dNI() ? this.nDF.abw() : 0;
    }

    String aby() {
        return this.nDv.dNI() ? this.nDF.aby() : null;
    }

    String abx() {
        return this.nDv.dNI() ? this.nDF.abx() : null;
    }

    ays abT() {
        return this.nDv.dNI() ? this.nDF.abT() : null;
    }

    ays abU() {
        return this.nDv.dNI() ? this.nDF.abU() : null;
    }

    boolean f(ays ays2) {
        return ays2 == null || !this.nDv.dNI() ? false : this.nDF.ex(ays2.abB());
    }

    boolean sS(ldv ldv2) {
        return this.nDv.dNI() ? this.nDF.dQ(ldv2) : false;
    }

    void b(hua hua2) {
        Set<hua> set;
        if (hua2 == null) {
            return;
        }
        this.nDC.a((htm)hua2);
        if (this.nDv.dNI() && !(set = this.nDC.c(hua.class)).isEmpty()) {
            this.nDC.ir(true);
            for (hua hua3 : set) {
                hua3.b(this.nDF.abO());
            }
            this.nDC.ir(false);
        }
    }

    void b(hsz hsz2) {
        Set<hsz> set;
        if (hsz2 == null) {
            return;
        }
        this.nDC.a((htm)hsz2);
        if (this.nDv.dNI() && !(set = this.nDC.c(hsz.class)).isEmpty()) {
            this.nDC.ir(true);
            for (hsz hsz3 : set) {
                hsz3.b(this.nDF.abR());
            }
            this.nDC.ir(false);
        }
    }

    boolean sV(ldv ldv2) {
        boolean bl;
        boolean bl2;
        ays ays2 = this.sB(ldv2);
        if (ays2 == null) {
            return false;
        }
        bcb bcb2 = this.nDF.qq();
        if (!bcb2.d(bca.cTW)) {
            return false;
        }
        boolean bl3 = bcb2.d(bca.cTj);
        boolean bl4 = bl3;
        if (!bl4) {
            for (bca bca2 : bcb2) {
                if (!bca2.akN()) continue;
                bl4 = true;
                break;
            }
        }
        if (!(bl2 = (bl = ays2.b(bca.cTj)))) {
            for (bca bca3 : ays2.abG()) {
                if (!bca3.akN()) continue;
                bl2 = true;
                break;
            }
        }
        if (!bl4 && !bl2) {
            return true;
        }
        if (bl4 && !bl2) {
            return true;
        }
        return bl3;
    }

    jnm(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
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

    void a(htu htu2) {
        if (htu2 == null) {
            return;
        }
        long l = jng.itE.aaS() - (this.MessageDelegator.bzy().getTimeInMillis() - this.nDY);
        if (l > 0L) {
            htu2.nB(mbj.ujP.bD(l / 1000L).exA());
            return;
        }
        this.nDC.a((htm)htu2);
        this.a(hso.cxK().bAn().Tr, bbt.cRO);
    }

    void b(htu htu2) {
        if (htu2 == null) {
            return;
        }
        this.nDC.a((htm)htu2);
        this.a(hso.cxK().bAn().Tr, bbt.cRT);
        this.nDY = this.MessageDelegator.bzy().getTimeInMillis();
    }

    void a(ldv ldv2, boolean bl, htt htt2) {
        if (htt2 == null) {
            return;
        }
        if (!this.sV(ldv2)) {
            htt2.nz(mbm.ubr.bD(new Object[0]).exA());
            return;
        }
        this.nDC.a(htt2);
        this.a(ldv2, bl ? bbt.cRN : bbt.cRM);
    }

    void a(ldv ldv2, bcb bcb2, bcb bcb3, hty hty2) {
        if (hty2 == null) {
            return;
        }
        if (this.nDZ != null) {
            hty2.nF(mbm.uka.bD(new Object[0]).exA());
            return;
        }
        if (bcb3.isEmpty()) {
            if (bcb2.isEmpty()) {
                hty2.nF(mbm.udA.bD(new Object[0]).exA());
                return;
            }
            this.a(ldv2, bcb2, bcg.cVO, 2);
        } else {
            this.a(ldv2, bcb3, bcg.cVP, 1);
        }
        this.nDZ = new lil<ldv, bcb, bcb>(ldv2, bcb2, bcb3);
        this.nDC.a(hty2);
    }

    void a(bbo[] bboArray, bbo[] bboArray2, huo huo2) {
        int n;
        if (huo2 == null) {
            return;
        }
        this.nDC.a(huo2);
        ldv[] ldvArray = new ldv[bboArray.length + bboArray2.length];
        int[] nArray = new int[ldvArray.length];
        for (n = 0; n < bboArray.length; ++n) {
            ldvArray[n] = bboArray[n].ach();
            nArray[n] = bbt.cRP.ordinal();
        }
        for (n = 0; n < bboArray2.length; ++n) {
            ldvArray[bboArray.length + n] = bboArray2[n].ach();
            nArray[bboArray.length + n] = bbt.cRR.ordinal();
        }
        this.a(ldvArray, nArray);
    }

    private void a(ldv ldv2, bbt bbt2) {
        assert (this.nDv.dNI());
        assert (ldv2 != null);
        assert (bbt2 != null);
        emh emh2 = (emh)this.MessageDelegator.h(13831, this.GUID, this.nDF.iG());
        emh2.sk(this.nDX++);
        emh2.gw(ldv2);
        emh2.oS(hso.cxK().bAn().Tr);
        emh2.a(bbt2);
        this.MessageDelegator.F(emh2);
        if (this.nDW == null) {
            this.nDW = lcn.emw();
        }
        this.nDW.put(emh2.aVk(), emh2);
    }

    private void a(ldv ldv2, bcb bcb2, bcg bcg2, int n) {
        assert (this.nDv.dNI());
        assert (ldv2 != null);
        assert (bcb2 != null);
        assert (bcg2 != null);
        enf enf2 = (enf)this.MessageDelegator.h(13880, this.GUID, this.nDF.iG());
        enf2.sk(n);
        enf2.a(bcg2);
        enf2.oS(hso.cxK().bAn().Tr);
        enf2.oZ(ldv2);
        enf2.e(bcb2);
        this.MessageDelegator.F(enf2);
    }

    private void a(ldv[] ldvArray, int[] nArray) {
        assert (this.nDv.dNI());
        assert (ldvArray != null);
        assert (nArray != null);
        assert (ldvArray.length == nArray.length);
        assert (ldvArray.length > 0);
        eme eme2 = (eme)this.MessageDelegator.h(13829, this.GUID, this.nDF.iG());
        eme2.isO = hso.cxK().bAn().Tr;
        eme2.iuD = ldvArray;
        eme2.iuE = nArray;
        eme2.iuF = false;
        this.MessageDelegator.F(eme2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000) {
            this.a((eqr)dxq2);
            return;
        }
        switch (dxq2.bEz()) {
            case 13832: {
                this.a((emi)dxq2);
                break;
            }
            case 13881: {
                this.a((eng)dxq2);
                break;
            }
            case 13830: {
                this.a((emf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eqr eqr2) {
        switch (eqr2.bHc()) {
            case 769: {
                this.a((epq)eqr2);
                break;
            }
            case 770: {
                this.a((epr)eqr2);
                break;
            }
            case 771: {
                this.a((eps)eqr2);
                break;
            }
            case 772: {
                this.a((epv)eqr2);
                break;
            }
            case 774: {
                this.a((epp)eqr2);
                break;
            }
            case 775: {
                this.a((ept)eqr2);
                break;
            }
            case 773: {
                this.a((epw)eqr2);
                break;
            }
            case 776: {
                this.a((epo)eqr2);
                break;
            }
            case 777: {
                this.a((epz)eqr2);
                break;
            }
            case 778: {
                this.a((epy)eqr2);
                break;
            }
            case 779: {
                this.a((epx)eqr2);
                break;
            }
            case 780: {
                this.a((epu)eqr2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanClientUpdateMessage() : Unknown Update Type (" + eqr2.bHc() + ") Received!!!");
                assert (false);
                return;
            }
        }
    }

    private void a(epq epq2) {
        Object object;
        Object object2;
        this.nDF.b(epq2.bKz());
        Set<hua> set = this.nDC.c(hua.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            object2 = set.iterator();
            while (object2.hasNext()) {
                object = (hua)object2.next();
                object.b(this.nDF.abO());
            }
            this.nDC.ir(false);
        }
        if (!(object2 = this.nDC.c(huc.class)).isEmpty()) {
            this.nDC.ir(true);
            object = object2.iterator();
            while (object.hasNext()) {
                huc huc2 = (huc)object.next();
                huc2.cyA();
            }
            this.nDC.ir(false);
        }
    }

    private void a(epr epr2) {
        ays ays2 = this.sB(epr2.abB());
        if (ays2 == null) {
            return;
        }
        ays2.y(epr2.bKA() < 0 ? -1L : this.MessageDelegator.bzy().getTimeInMillis() - (long)(this.MessageDelegator.arc().rgz - epr2.bKB()) * 1000L);
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htw htw2 : set) {
                htw2.a(ays2, htw.a.ldw);
            }
            this.nDC.ir(false);
        }
    }

    private void a(eps eps2) {
        Object object;
        Object object2;
        this.nDF.ez(eps2.abB());
        Set<hua> set = this.nDC.c(hua.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            object2 = set.iterator();
            while (object2.hasNext()) {
                object = (hua)object2.next();
                object.b(this.nDF.abO());
            }
            this.nDC.ir(false);
        }
        if (!(object2 = this.nDC.c(huc.class)).isEmpty()) {
            this.nDC.ir(true);
            object = object2.iterator();
            while (object.hasNext()) {
                huc huc2 = (huc)object.next();
                huc2.cyA();
            }
            this.nDC.ir(false);
        }
    }

    private void a(epv epv2) {
        ays ays2 = this.sB(epv2.abB());
        if (ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientMemberOnlineStatusChangedMessage() : Member Update Received, But Indicated Member Not Found!!!");
            return;
        }
        ays2.a(epv2.bKE(), epv2.bKF(), epv2.bKG());
        this.nDF.c(ays2);
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htw htw2 : set) {
                htw2.a(ays2, htw.a.ldq);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epp epp2) {
        ays ays2 = this.sB(epp2.abB());
        if (ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientMemberConquestKillsChangedMessage() : Member Update Received, But Indicated Member Not Found!!!");
            return;
        }
        ays2.iX(epp2.bKy());
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htw htw2 : set) {
                htw2.a(ays2, htw.a.ldt);
            }
            this.nDC.ir(false);
        }
    }

    private void a(ept ept2) {
        ays ays2 = this.sB(ept2.abB());
        if (ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientMemberMilitaryRankChangedMessage() : Member Update Received, But Indicated Member Not Found!!!");
            return;
        }
        ays2.a(ept2.bIQ());
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htw object : set) {
                object.a(ays2, htw.a.ldu);
            }
            this.nDC.ir(false);
        }
        if (this.f(ays2)) {
            Set<htz> set2 = this.nDC.c(htz.class);
            if (!set2.isEmpty()) {
                this.nDC.ir(true);
                for (htz htz2 : set2) {
                    htz2.cyz();
                }
                this.nDC.ir(false);
            }
            if (hso.cxK() != null && hso.cxK().cxP() != null) {
                hso.cxK().cxP().v(mbe.uiL.bD(new Object[]{this.nDF.abP()}));
            }
        }
    }

    private void a(epw epw2) {
        Object object;
        Object object2;
        ays ays2 = this.sB(epw2.abB());
        if (ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientMemberPermissionsChangedMessage() : Member Update Received, But Indicated Member Not Found!!!");
            return;
        }
        ays2.a(epw2.qq());
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            object2 = set.iterator();
            while (object2.hasNext()) {
                object = (htw)object2.next();
                object.a(ays2, htw.a.ldx);
            }
            this.nDC.ir(false);
        }
        if (this.f(ays2) && !(object2 = this.nDC.c(htx.class)).isEmpty()) {
            this.nDC.ir(true);
            object = object2.iterator();
            while (object.hasNext()) {
                htx htx2 = (htx)object.next();
                htx2.cyy();
            }
            this.nDC.ir(false);
        }
    }

    private void a(epo epo2) {
        ays ays2 = this.sB(epo2.abB());
        if (ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientMemberClanPointsEarnedChangedMessage() : Member Update Received, But Indicated Member Not Found!!!");
            return;
        }
        ays2.iY(epo2.bKx());
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htw htw2 : set) {
                htw2.a(ays2, htw.a.lds);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epx epx2) {
        ays ays2 = this.sB(epx2.abB());
        if (ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientMemberClanPointsEarnedChangedMessage() : Member Update Received, But Indicated Member Not Found!!!");
            return;
        }
        ays2.iZ(epx2.bKH());
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htw htw2 : set) {
                htw2.a(ays2, htw.a.ldr);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epu epu2) {
        ays ays2 = this.sB(epu2.abB());
        if (ays2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanClientMemberNameChangedMessage() : Member Update Recieved, But Indicated Member Not Found!!!");
            return;
        }
        if (ays2 == this.abU()) {
            this.nDF.eX(cg.c(epu2.bKC(), epu2.bKD()));
        }
        ays2.eU(cg.c(epu2.bKC(), epu2.bKD()));
        Set<htw> set = this.nDC.c(htw.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (htw htw2 : set) {
                htw2.a(ays2, htw.a.ldy);
            }
            this.nDC.ir(false);
        }
    }

    private void a(epz epz2) {
        this.nDF.a(epz2.bKJ());
        Set<hsz> set = this.nDC.c(hsz.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hsz hsz2 : set) {
                hsz2.b(this.nDF.abR());
            }
            this.nDC.ir(false);
        }
        this.nDv.dNQ();
    }

    private void a(epy epy2) {
        this.nDF.eA(epy2.bKI());
        Set<hsz> set = this.nDC.c(hsz.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hsz hsz2 : set) {
                hsz2.b(this.nDF.abR());
            }
            this.nDC.ir(false);
        }
        this.nDv.dNQ();
    }

    private void a(emi emi2) {
        emh emh2;
        emh emh3 = emh2 = this.nDW == null ? null : this.nDW.remove(emi2.aVk());
        if (emh2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanMemberManagementResponseMessage() : No Request Found for Received Response!!!");
            assert (false);
            return;
        }
        switch (emh2.bIN()) {
            case cRM: 
            case cRN: {
                Set<htt> set = this.nDC.c(htt.class);
                if (set.isEmpty()) {
                    return;
                }
                if (emi2.bIO().abZ()) {
                    this.nDC.ir(true);
                    for (htt htt2 : set) {
                        htt2.ny(emi2.bIO().aca().bD(new Object[0]).exA());
                    }
                    this.nDC.ir(false);
                    break;
                }
                this.nDC.ir(true);
                for (htt htt3 : set) {
                    htt3.nz(emi2.bIO().aca().bD(new Object[0]).exA());
                }
                this.nDC.ir(false);
                break;
            }
            case cRO: 
            case cRT: {
                Set<htu> set = this.nDC.c(htu.class);
                if (set.isEmpty()) {
                    return;
                }
                if (emi2.bIO().abZ()) {
                    this.nDC.ir(true);
                    for (htu htu2 : set) {
                        htu2.nA(emi2.bIO().aca().bD(new Object[0]).exA());
                    }
                    this.nDC.ir(false);
                    break;
                }
                this.nDC.ir(true);
                for (htu htu3 : set) {
                    htu3.nB(emi2.bIO().aca().bD(new Object[0]).exA());
                }
                this.nDC.ir(false);
                break;
            }
        }
    }

    private void a(eng eng2) {
        block12: {
            block11: {
                if (this.nDZ == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleClanPermissionsMemberOperationResponseMessage() : No Processing Values Found for Received Response!!!");
                    assert (false);
                    return;
                }
                if (eng2.bJe().vA()) break block11;
                Set<hty> set = this.nDC.c(hty.class);
                if (set.isEmpty()) break block12;
                this.nDC.ir(true);
                for (hty hty2 : set) {
                    hty2.nF(eng2.bJe().YF().bD(new Object[0]).exA());
                }
                this.nDC.ir(false);
                break block12;
            }
            switch (eng2.aVk()) {
                case 1: {
                    if (((bcb)this.nDZ.reY).isEmpty()) {
                        Set<hty> set = this.nDC.c(hty.class);
                        if (set.isEmpty()) break;
                        this.nDC.ir(true);
                        for (hty hty3 : set) {
                            hty3.nE(eng2.bJe().YF().bD(new Object[0]).exA());
                        }
                        this.nDC.ir(false);
                        break;
                    }
                    this.a((ldv)this.nDZ.reX, (bcb)this.nDZ.reY, bcg.cVO, 2);
                    return;
                }
                case 2: {
                    Set<hty> set = this.nDC.c(hty.class);
                    if (set.isEmpty()) break;
                    this.nDC.ir(true);
                    for (hty hty4 : set) {
                        hty4.nE(eng2.bJe().YF().bD(new Object[0]).exA());
                    }
                    this.nDC.ir(false);
                    break;
                }
                default: {
                    lfn.b(5, this.getClass().getSimpleName(), "handleClanPermissionsMemberOperationResponseMessage() : Unhandled Message Tag Received With Response!!!... MessageTag = " + eng2.aVk());
                    assert (false);
                    break;
                }
            }
        }
        this.nDZ = null;
    }

    private void a(emf emf2) {
        boolean bl = false;
        for (int j = 0; j < emf2.iuI.length; ++j) {
            Object object = ayv.getValueByOrdinal(emf2.iuI[j]);
            bl |= object != ayv.cBq && object != ayv.cBr;
        }
        Set<huo> set = this.nDC.c(huo.class);
        if (set.isEmpty()) {
            return;
        }
        this.nDC.ir(true);
        for (huo huo2 : set) {
            if (bl) {
                huo2.nP(mbh.ujx.bD(new Object[0]).exA());
                continue;
            }
            huo2.nO(mbh.ujy.bD(new Object[0]).exA());
        }
        this.nDC.ir(false);
    }
}

