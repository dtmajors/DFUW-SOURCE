/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jnk
 *  lcr
 */
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanCityStanceToPlayerDTO;
import spenefett.hid.gui.serialization.dto.SFClanConfigurationValuesDTO;
import spenefett.hid.gui.serialization.dto.SFClanCreationValuesDTO;
import spenefett.hid.gui.serialization.dto.SFClanDetailedInformationDTO;
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;
import spenefett.hid.gui.serialization.dto.SFClanToClanPoliticalStanceDTO;

public class jng
extends btk {
    public static ayj itE = null;
    public static azj itG = null;
    public static final double nDn = 30.0;
    public static final double nDo = 60.0;
    private Map<Class, Set> nDp = lcn.emw();
    private boolean gIC = false;
    private Set<htm> gID = null;
    private Set<htm> gIE = null;
    private boolean nDq = false;
    private ayq[] lJT = null;
    private List<elq> nDr = null;
    private double nDs = 0.0;
    private Set<ldv> nDt = null;
    private Map<ldv, lfs<aym, Double>> nDu = null;
    private jnr ler = null;
    private dmn lLl = null;
    private jnk nDv = null;
    private Map<ldv, Set<ayp>> nDw = null;

    public boolean HT() {
        return this.nDv.dNH() && itE != null && this.ler.HT();
    }

    public boolean sM(String string) {
        if (this.lJT != null) {
            for (int j = 0; j < this.lJT.length; ++j) {
                if (this.lJT[j].iV().compareToIgnoreCase(string) != 0) continue;
                return true;
            }
        }
        return false;
    }

    public boolean dNh() {
        return this.nDv.dNI();
    }

    public boolean sz(ldv ldv2) {
        return this.nDv.sz(ldv2);
    }

    public boolean sA(ldv ldv2) {
        return this.nDv.sR(ldv2);
    }

    public ayt dNi() {
        return this.nDv.dNJ();
    }

    public SFClanDetailedInformationDTO db(ljq ljq2) {
        return this.nDv.dc(ljq2);
    }

    public ldv ack() {
        return this.nDv.iG();
    }

    public String acl() {
        return this.nDv.iV();
    }

    public String dNj() {
        return this.nDv.ZK();
    }

    public String dNk() {
        return this.nDv.ZL();
    }

    public int dNl() {
        return this.nDv.akw();
    }

    public String dNm() {
        return this.nDv.aby();
    }

    public String dNn() {
        return this.nDv.abx();
    }

    public ays dNo() {
        return this.nDv.abT();
    }

    public ays dNp() {
        return this.nDv.abU();
    }

    public boolean Vm(int n) {
        return this.nDv.Vn(n);
    }

    public boolean dNq() {
        return this.nDv.dNK();
    }

    public EnumSet<ayw> dNr() {
        return this.nDv.ZO();
    }

    public int dNs() {
        return this.nDv.aaq();
    }

    public boolean i(bca bca2) {
        return this.nDv.i(bca2);
    }

    public bcb dNt() {
        return this.nDv.dNt();
    }

    public boolean f(ays ays2) {
        return this.nDv.f(ays2);
    }

    public ays dNu() {
        return this.nDv.dNu();
    }

    public ays sB(ldv ldv2) {
        return this.nDv.sB(ldv2);
    }

    public ays sN(String string) {
        return this.nDv.sN(string);
    }

    public ays a(SFClanMemberInformationDTO sFClanMemberInformationDTO) {
        return this.nDv.a(sFClanMemberInformationDTO);
    }

    public void a(hua hua2) {
        this.nDv.b(hua2);
    }

    public void a(hsz hsz2) {
        this.nDv.b(hsz2);
    }

    public boolean sC(ldv ldv2) {
        return this.nDv.sS(ldv2);
    }

    public bcm[] dNv() {
        return this.nDv.dNM();
    }

    public bcm[] dNw() {
        return this.nDv.dNN();
    }

    public bcm[] dNx() {
        return this.nDv.dNO();
    }

    public SFClanToClanPoliticalStanceDTO u(ayq ayq2) {
        return this.nDv.u(ayq2);
    }

    public bcr sD(ldv ldv2) {
        return this.nDv.sT(ldv2);
    }

    public bcr sO(String string) {
        return this.nDv.sO(string);
    }

    public bcr sE(ldv ldv2) {
        return this.nDv.sE(ldv2);
    }

    public int a(ayb ayb2, int n, ldv ldv2, azz azz2) {
        return this.nDv.a(ayb2, n, ldv2, azz2);
    }

    public bao[] d(azz azz2) {
        return this.nDv.f(azz2);
    }

    public bao[] e(azz azz2) {
        return this.nDv.g(azz2);
    }

    public bao z(ldv ldv2, String string) {
        return this.nDv.C(ldv2, string);
    }

    public bao A(ldv ldv2, String string) {
        return this.nDv.D(ldv2, string);
    }

    public boolean R(ldv ldv2, boolean bl) {
        return this.nDv.S(ldv2, bl);
    }

    public boolean al(ldv ldv2, ldv ldv3) {
        return this.nDv.ap(ldv2, ldv3);
    }

    public boolean dNy() {
        return this.nDv.dNP();
    }

    public int sF(ldv ldv2) {
        return this.nDv.sL(ldv2);
    }

    public float sG(ldv ldv2) {
        return this.nDv.sM(ldv2);
    }

    public float sH(ldv ldv2) {
        return this.nDv.sN(ldv2);
    }

    public int am(ldv ldv2, ldv ldv3) {
        return this.nDv.aq(ldv2, ldv3);
    }

    public azw[] an(ldv ldv2, ldv ldv3) {
        return this.nDv.ar(ldv2, ldv3);
    }

    public int ao(ldv ldv2, ldv ldv3) {
        return this.nDv.as(ldv2, ldv3);
    }

    public int dNz() {
        return this.nDv.aay();
    }

    public int m(ayb ayb2) {
        return this.nDv.d(ayb2);
    }

    public boolean sI(ldv ldv2) {
        return this.nDv.sP(ldv2);
    }

    public boolean sP(String string) {
        return this.nDv.sQ(string);
    }

    public void a(hub hub2, ayq ayq2) {
        this.nDv.a(hub2, ayq2);
    }

    public void a(htk htk2, SFClanCreationValuesDTO sFClanCreationValuesDTO) {
        this.nDv.a(htk2, sFClanCreationValuesDTO);
    }

    public void a(htd htd2, SFClanConfigurationValuesDTO sFClanConfigurationValuesDTO) {
        this.nDv.a(htd2, sFClanConfigurationValuesDTO);
    }

    public void a(htu htu2) {
        this.nDv.a(htu2);
    }

    public void b(htu htu2) {
        this.nDv.b(htu2);
    }

    public void a(ldv ldv2, boolean bl, htt htt2) {
        this.nDv.a(ldv2, bl, htt2);
    }

    public void a(ldv ldv2, bcb bcb2, bcb bcb3, hty hty2) {
        this.nDv.a(ldv2, bcb2, bcb3, hty2);
    }

    public void a(hun hun2, ayq ayq2, int n) {
        this.nDv.a(hun2, ayq2, n);
    }

    public void a(ldv ldv2, ays ays2, cla cla2, ayx ayx2, ayx ayx3, azf azf2, ldv[] ldvArray, azh azh2, boolean bl, boolean bl2, htn htn2) {
        this.nDv.a(ldv2, ays2, cla2, ayx2, azf2, ldvArray, azh2, bl, bl2, ayx3, htn2);
    }

    public void a(ldv ldv2, aze aze2, aya aya2, htq htq2) {
        this.nDv.a(ldv2, aze2, aya2, htq2);
    }

    public void a(ldv[] ldvArray, ldv[] ldvArray2, ldv[] ldvArray3, ldv[] ldvArray4, ldv[] ldvArray5, ldv[] ldvArray6, huk huk2) {
        this.nDv.a(ldvArray, ldvArray2, ldvArray3, ldvArray4, ldvArray5, ldvArray6, huk2);
    }

    public void a(bbo[] bboArray, bbo[] bboArray2, huo huo2) {
        this.nDv.a(bboArray, bboArray2, huo2);
    }

    public void a(ayp ayp2, int n, hti hti2) {
        this.nDv.a(ayp2, n, hti2);
    }

    public void a(bao bao2, hue hue2) {
        this.nDv.a(bao2, hue2);
    }

    public void b(bao bao2, hue hue2) {
        this.nDv.b(bao2, hue2);
    }

    public void c(bao bao2, hue hue2) {
        this.nDv.c(bao2, hue2);
    }

    public void a(bao bao2, int n, float f2, hue hue2) {
        this.nDv.a(bao2, n, f2, hue2);
    }

    public void a(ldv ldv2, String string, int n, float f2, ldv[] ldvArray, hud hud2) {
        this.nDv.a(ldv2, string, n, f2, ldvArray, hud2);
    }

    public void a(hur hur2) {
        this.nDv.b(hur2);
    }

    public void a(hur hur2, boolean bl) {
        this.nDv.b(hur2, bl);
    }

    public void a(hur hur2, boolean bl, int n) {
        this.nDv.b(hur2, bl, n);
    }

    public void a(htm htm2) {
        if (htm2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gID == null) {
                this.gID = lcn.emx();
            }
            this.gID.add(htm2);
            if (this.gIE != null) {
                this.gIE.remove(htm2);
            }
        } else {
            Class<?>[] classArray = htm2.getClass().getInterfaces();
            for (int j = 0; j < classArray.length; ++j) {
                this.a(classArray[j], htm2);
            }
        }
    }

    private void a(Class<?> clazz, htm htm2) {
        if (!htm.class.isAssignableFrom(clazz)) {
            return;
        }
        Set<htm> set = this.nDp.get(clazz);
        if (set == null) {
            set = lcn.emx();
            this.nDp.put(clazz, set);
        }
        if (!set.contains(htm2)) {
            set.add(htm2);
        }
        Class<?>[] classArray = clazz.getInterfaces();
        for (int j = 0; j < classArray.length; ++j) {
            this.a(classArray[j], htm2);
        }
    }

    <T> Set<T> c(Class<T> clazz) {
        return this.nDp.containsKey(clazz) ? this.nDp.get(clazz) : new HashSet();
    }

    public void b(htm htm2) {
        if (htm2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gIE == null) {
                this.gIE = lcn.emx();
            }
            this.gIE.add(htm2);
            if (this.gID != null) {
                this.gID.remove(htm2);
            }
        } else {
            for (Set set : this.nDp.values()) {
                set.remove(htm2);
            }
        }
    }

    void ir(boolean bl) {
        if (bl == this.gIC) {
            return;
        }
        this.gIC = bl;
        if (!this.gIC) {
            if (this.gID != null) {
                for (htm htm2 : this.gID) {
                    this.a(htm2);
                }
            }
            if (this.gIE != null) {
                for (htm htm2 : this.gIE) {
                    this.b(htm2);
                }
            }
        }
    }

    public jng() {
        if (job.nGF) {
            job.dOm().dOy();
            this.lJT = job.dOm().dOu();
        }
        this.ler = hso.cxK().cxP().czc();
        this.lLl = hso.cxK().cxP().czd();
        this.nDv = new jnk(this, this.ler, this.lLl);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.nDv.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)this.nDv);
    }

    @Override
    public void cleanUp() {
        this.MessageDelegator.hd(this.nDv.getGUID());
        super.cleanUp();
    }

    public void dNA() {
        this.nDv.dNQ();
    }

    public void sJ(ldv ldv2) {
        lfs<aym, Double> lfs2;
        lfs<aym, Double> lfs3 = lfs2 = this.nDu == null ? null : this.nDu.get(ldv2);
        if (lfs2 != null) {
            if (this.nDt != null && this.nDt.contains(ldv2)) {
                return;
            }
            if (this.nDt == null) {
                this.nDt = lcn.emx();
            }
            this.nDt.add(ldv2);
            this.sK(ldv2);
        }
    }

    public void B(ldv ldv2, String string) {
        lfs<aym, Double> lfs2;
        if (this.lJT != null) {
            for (int j = 0; j < this.lJT.length; ++j) {
                if (!ldv.au(this.lJT[j].iG(), ldv2)) continue;
                this.lJT[j].eT(string);
            }
        }
        lfs<aym, Double> lfs3 = lfs2 = this.nDu == null ? null : this.nDu.get(ldv2);
        if (lfs2 != null) {
            ((aym)lfs2.reX).eT(string);
        }
    }

    public void a(htv htv2) {
        if (htv2 == null) {
            return;
        }
        this.a((htm)htv2);
        if (job.nGF) {
            this.dNB();
            return;
        }
        if (this.lJT != null && this.MessageDelegator.arc().rgz - this.nDs < 30.0) {
            this.dNB();
        } else {
            this.dNC();
        }
    }

    private void dNB() {
        Set<htv> set = this.c(htv.class);
        if (set.isEmpty()) {
            return;
        }
        this.ir(true);
        for (htv htv2 : set) {
            htv2.b(this.lJT);
        }
        this.ir(false);
    }

    public void a(htl htl2, ayq ayq2) {
        lfs<aym, Double> lfs2;
        if (htl2 == null || ayq2 == null) {
            return;
        }
        this.a(htl2);
        if (job.nGF) {
            aym aym2 = job.dOm().w(ayq2);
            Set<htl> set = this.c(htl.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (htl htl3 : set) {
                    htl3.b(aym2);
                }
                this.ir(false);
            }
            return;
        }
        lfs<aym, Double> lfs3 = lfs2 = this.nDu == null ? null : this.nDu.get(ayq2.iG());
        if (lfs2 == null || this.MessageDelegator.arc().rgz - (Double)lfs2.reY > 60.0) {
            if (this.nDt != null && this.nDt.contains(ayq2.iG())) {
                return;
            }
            if (this.nDt == null) {
                this.nDt = lcn.emx();
            }
            this.nDt.add(ayq2.iG());
            this.sK(ayq2.iG());
        } else {
            Set<htl> set = this.c(htl.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (htl htl4 : set) {
                    htl4.b((aym)lfs2.reX);
                }
                this.ir(false);
            }
        }
    }

    public void a(htl htl2, bcp bcp2) {
        lfs<aym, Double> lfs2;
        if (htl2 == null || bcp2 == null) {
            return;
        }
        this.a(htl2);
        if (job.nGF) {
            aym aym2 = job.dOm().y(bcp2);
            Set<htl> set = this.c(htl.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (htl htl3 : set) {
                    htl3.b(aym2);
                }
                this.ir(false);
            }
            return;
        }
        lfs<aym, Double> lfs3 = lfs2 = this.nDu == null ? null : this.nDu.get(bcp2.iG());
        if (lfs2 == null || this.MessageDelegator.arc().rgz - (Double)lfs2.reY > 60.0) {
            if (this.nDt != null && this.nDt.contains(bcp2.iG())) {
                return;
            }
            if (this.nDt == null) {
                this.nDt = lcn.emx();
            }
            this.nDt.add(bcp2.iG());
            this.sK(bcp2.iG());
        } else {
            Set<htl> set = this.c(htl.class);
            if (!set.isEmpty()) {
                this.ir(true);
                for (htl htl4 : set) {
                    htl4.b((aym)lfs2.reX);
                }
                this.ir(false);
            }
        }
    }

    aym v(ayq ayq2) {
        if (job.nGF) {
            return job.dOm().w(ayq2);
        }
        lfs<aym, Double> lfs2 = this.nDu == null ? null : this.nDu.get(ayq2.iG());
        return lfs2 == null ? null : (aym)lfs2.reX;
    }

    public void a(ldv ldv2, ayp ayp2, hta hta2) {
        if (hta2 == null) {
            return;
        }
        if (this.dNh() && ldv2.equals(this.nDv.iG())) {
            boolean bl = hso.cxK().bAn().Tr.equals(ayp2.YS());
            SFClanCityStanceToPlayerDTO sFClanCityStanceToPlayerDTO = new SFClanCityStanceToPlayerDTO();
            sFClanCityStanceToPlayerDTO.isPlayersClansCity = true;
            sFClanCityStanceToPlayerDTO.canPlayerBind = true;
            sFClanCityStanceToPlayerDTO.canPlayerBind = true;
            sFClanCityStanceToPlayerDTO.isPlayerBound = ayp2.es(hso.cxK().bAn().Tr);
            sFClanCityStanceToPlayerDTO.canPlayerEditMayor = this.nDv.i(bca.cUL) || bl;
            sFClanCityStanceToPlayerDTO.canPlayerEditConquest = this.nDv.i(bca.cUy);
            sFClanCityStanceToPlayerDTO.canPlayerIssueMercenaries = this.nDv.i(bca.cUC);
            sFClanCityStanceToPlayerDTO.canPlayerEditMercenaries = this.nDv.i(bca.cUE);
            sFClanCityStanceToPlayerDTO.canPlayerBuildCity = this.nDv.i(bca.cUH) || bl;
            sFClanCityStanceToPlayerDTO.canPlayerEditGuardPolicy = this.nDv.i(bca.cUR) || bl;
            sFClanCityStanceToPlayerDTO.canPlayerEditBankAccessPolicy = this.nDv.i(bca.cUP) || bl;
            sFClanCityStanceToPlayerDTO.canPlayerEditMarketAccessPolicy = this.nDv.i(bca.cUV) || bl;
            sFClanCityStanceToPlayerDTO.canPlayerEditCitizens = this.nDv.i(bca.cUN) || bl;
            sFClanCityStanceToPlayerDTO.canPlayerEditGateControlPolicy = this.nDv.i(bca.cUU) || bl;
            sFClanCityStanceToPlayerDTO.canPlayerEditCityProtection = this.nDv.i(bca.cUT) || bl;
            hta2.a(ldv2, ayp2.getGUID(), sFClanCityStanceToPlayerDTO);
        } else {
            lfs<aym, Double> lfs2;
            lfs<aym, Double> lfs3 = lfs2 = this.nDu == null ? null : this.nDu.get(ldv2);
            if (job.nGF && lfs2 == null) {
                return;
            }
            if (lfs2 == null || this.MessageDelegator.arc().rgz - (Double)lfs2.reY > 60.0) {
                Set<ayp> set;
                this.a(hta2);
                if (this.nDw == null) {
                    this.nDw = lcn.emw();
                }
                if ((set = this.nDw.get(ldv2)) == null) {
                    set = lcn.emx();
                    this.nDw.put(ldv2, set);
                }
                if (!set.contains(ayp2)) {
                    set.add(ayp2);
                }
                if (this.nDt != null && this.nDt.contains(ldv2)) {
                    return;
                }
                if (this.nDt == null) {
                    this.nDt = lcn.emx();
                }
                this.nDt.add(ldv2);
                this.sK(ldv2);
            } else {
                SFClanCityStanceToPlayerDTO sFClanCityStanceToPlayerDTO = new SFClanCityStanceToPlayerDTO();
                sFClanCityStanceToPlayerDTO.isPlayersClansCity = false;
                sFClanCityStanceToPlayerDTO.canPlayerEnter = !((aym)lfs2.reX).eu(hso.cxK().bAn().Tr);
                sFClanCityStanceToPlayerDTO.canPlayerBind = ((aym)lfs2.reX).ew(hso.cxK().bAn().Tr);
                sFClanCityStanceToPlayerDTO.isPlayerBound = ayp2.es(hso.cxK().bAn().Tr);
                sFClanCityStanceToPlayerDTO.canPlayerEditMayor = false;
                sFClanCityStanceToPlayerDTO.canPlayerEditConquest = this.nDv.i(bca.cUy);
                sFClanCityStanceToPlayerDTO.canPlayerIssueMercenaries = this.nDv.i(bca.cUD);
                sFClanCityStanceToPlayerDTO.canPlayerEditMercenaries = this.nDv.i(bca.cUF);
                sFClanCityStanceToPlayerDTO.canPlayerBuildCity = false;
                sFClanCityStanceToPlayerDTO.canPlayerEditGuardPolicy = false;
                sFClanCityStanceToPlayerDTO.canPlayerEditBankAccessPolicy = false;
                sFClanCityStanceToPlayerDTO.canPlayerEditCitizens = false;
                sFClanCityStanceToPlayerDTO.canPlayerEditGateControlPolicy = false;
                sFClanCityStanceToPlayerDTO.canPlayerEditCityProtection = false;
                hta2.a(ldv2, ayp2.getGUID(), sFClanCityStanceToPlayerDTO);
            }
        }
    }

    public void a(String string, hup hup2) {
        if (hup2 == null) {
            return;
        }
        this.a(hup2);
        this.aw(string);
    }

    private void dNC() {
        if (this.nDq) {
            return;
        }
        elp elp2 = (elp)this.MessageDelegator.h(13884, this.GUID, lcr.hac);
        this.MessageDelegator.F(elp2);
        this.nDq = true;
        if (this.nDr == null) {
            this.nDr = lcn.emA();
        }
    }

    private void sK(ldv ldv2) {
        assert (ldv2 != null);
        eld eld2 = (eld)this.MessageDelegator.h(13890, this.GUID, ldv2);
        this.MessageDelegator.F(eld2);
    }

    private void aw(String string) {
        assert (string != null);
        ma ma2 = new ma();
        ma2.afj = 3;
        ma2.awJ = string;
        fvc fvc2 = (fvc)this.MessageDelegator.h(26884, this.GUID, lcr.qAN);
        fvc2.Yb = ma2;
        this.MessageDelegator.F(fvc2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000 && dxq2.bEz() != 32001) {
            this.nDv.receiveMessage(dxq2);
            return;
        }
        switch (dxq2.bEz()) {
            case 13916: {
                this.a((eky)dxq2);
                break;
            }
            case 32001: {
                this.a((eof)dxq2);
                break;
            }
            case 13885: {
                this.a((elq)dxq2);
                break;
            }
            case 13891: {
                this.a((ele)dxq2);
                break;
            }
            case 26885: {
                this.a((fvd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                return;
            }
        }
    }

    private void a(eky eky2) {
        if (itE != null) {
            if (jnr.itF != null && itG != null) {
                return;
            }
        }
        itE = eky2.bIu();
        jnr.itF = eky2.bIv();
        itG = eky2.bIw();
        if (this.HT()) {
            this.ir(true);
            for (Set set : this.nDp.values()) {
                for (Object e2 : set) {
                    ((htm)e2).oj();
                }
            }
            this.ir(false);
        }
    }

    private void a(eof eof2) {
        this.nDv.E(eof2.bJW());
        if (this.nDv.dNH()) {
            Set<htl> set;
            Object object;
            ldv ldv2 = this.nDv.iG();
            if (job.nGF) {
                object = job.dOm();
                if (job.dOm() == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleClanClientBulkUpdateMessage() : 'UseTestData' is 'true' but SFTestDataGenerator.getInstance() returned 'null'!!!... WTF!!!");
                    assert (false);
                } else {
                    eof2.bJV().a(((job)object).dOv());
                    eof2.bJV().a(((job)object).abR());
                    eof2.bJV().a(((job)object).dNM(), ((job)object).dNN(), ((job)object).dOw());
                }
            }
            this.nDv.d(eof2.bJV());
            object = this.nDv.iG();
            if (!ldv.au(ldv2, (ldv)object)) {
                this.nDs = 0.0;
            }
            if (eof2.bJV() != null && !(set = this.c(htl.class)).isEmpty()) {
                this.ir(true);
                for (htl htl2 : set) {
                    htl2.b(eof2.bJV());
                }
                this.ir(false);
            }
        } else {
            this.nDv.c(eof2.bJV());
            if (this.HT()) {
                this.ir(true);
                for (Set set : this.nDp.values()) {
                    for (Object e2 : set) {
                        ((htm)e2).oj();
                    }
                }
                this.ir(false);
            }
        }
    }

    private void a(elq elq2) {
        this.nDr.add(elq2);
        if (this.nDr.size() == elq2.bIK()) {
            int n = 0;
            for (elq object : this.nDr) {
                n += object.bII().length;
            }
            ayq[] ayqArray = new ayq[n];
            n = 0;
            for (elq elq3 : this.nDr) {
                for (int j = 0; j < elq3.bII().length; ++j) {
                    ayqArray[n++] = elq3.bII()[j];
                }
            }
            this.nDr.clear();
            this.nDq = false;
            this.lJT = ayqArray;
            this.nDs = this.MessageDelegator.arc().rgz;
            this.dNB();
        }
    }

    private void a(ele ele2) {
        Object object;
        Object object2;
        if (this.nDu == null) {
            this.nDu = lcn.emw();
        }
        this.nDu.put(ele2.aO(), new lfs<aym, Double>(ele2.bID(), this.MessageDelegator.arc().rgz));
        Set<htl> set = this.c(htl.class);
        if (!set.isEmpty()) {
            this.ir(true);
            object2 = set.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                object.b(ele2.bID());
            }
            this.ir(false);
        }
        if (this.nDw != null && (object2 = this.nDw.remove(ele2.bID().iG())) != null && !object2.isEmpty()) {
            object = object2.iterator();
            block1: while (object.hasNext()) {
                ayp ayp2 = (ayp)object.next();
                for (int j = 0; j < ele2.bID().abb().length; ++j) {
                    if (!ayp2.getGUID().equals(ele2.bID().abb()[j].getGUID())) continue;
                    SFClanCityStanceToPlayerDTO sFClanCityStanceToPlayerDTO = new SFClanCityStanceToPlayerDTO();
                    sFClanCityStanceToPlayerDTO.isPlayersClansCity = false;
                    sFClanCityStanceToPlayerDTO.canPlayerEnter = !ele2.bID().eu(hso.cxK().bAn().Tr);
                    sFClanCityStanceToPlayerDTO.canPlayerBind = ele2.bID().ew(hso.cxK().bAn().Tr);
                    sFClanCityStanceToPlayerDTO.isPlayerBound = ele2.bID().abb()[j].es(hso.cxK().bAn().Tr);
                    sFClanCityStanceToPlayerDTO.canPlayerEditMayor = false;
                    sFClanCityStanceToPlayerDTO.canPlayerEditConquest = this.nDv.i(bca.cUy);
                    sFClanCityStanceToPlayerDTO.canPlayerIssueMercenaries = this.nDv.i(bca.cUD);
                    sFClanCityStanceToPlayerDTO.canPlayerEditMercenaries = this.nDv.i(bca.cUF);
                    sFClanCityStanceToPlayerDTO.canPlayerBuildCity = false;
                    sFClanCityStanceToPlayerDTO.canPlayerEditGuardPolicy = false;
                    sFClanCityStanceToPlayerDTO.canPlayerEditBankAccessPolicy = false;
                    sFClanCityStanceToPlayerDTO.canPlayerEditCitizens = false;
                    Set<hta> set2 = this.c(hta.class);
                    if (set2.isEmpty()) continue block1;
                    this.ir(true);
                    for (hta hta2 : set2) {
                        hta2.a(ele2.bID().iG(), ele2.bID().abb()[j].getGUID(), sFClanCityStanceToPlayerDTO);
                    }
                    this.ir(false);
                    continue block1;
                }
            }
            object2.clear();
        }
        if (this.nDt != null) {
            this.nDt.remove(ele2.aO());
        }
    }

    private void a(fvd fvd2) {
        Set<hup> set = this.c(hup.class);
        if (set.isEmpty()) {
            return;
        }
        this.ir(true);
        for (hup hup2 : set) {
            hup2.a(fvd2.iXC);
        }
        this.ir(false);
    }

    public void b(dqg dqg2) {
        this.nDv.b(dqg2);
    }
}

