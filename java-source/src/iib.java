/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hyn
 *  hzo
 *  jju
 *  lcr
 */
import java.util.ArrayList;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;
import spenefett.hid.gui.serialization.dto.SFGUIElementListDTO;
import spenefett.hid.gui.serialization.dto.SFHousingStringsDTO;
import spenefett.hid.gui.serialization.dto.SFTenantPlayerDTO;
import spenefett.hid.gui.serialization.dto.SFTenantPlayerListDTO;

public class iib
extends hzk
implements bto,
hyy.c,
hzq,
jml {
    public static final boolean eqx = true;
    public static final String lYb = "texture/dds/";
    private static final int lYc = 0;
    private static final int lYd = 1;
    private ldv aGQ = null;
    private int atf = -1;
    private boolean atg = false;
    private int lYe = -1;
    private String lYf = "";
    private int iMB = 0;
    private long iMC = 0L;
    private long lYg = 0L;
    private boolean lYh = false;
    private SFTenantPlayerListDTO lYi = new SFTenantPlayerListDTO();
    private SFGUIElementListDTO lYj = new SFGUIElementListDTO();
    private SFGUIElementListDTO lYk = new SFGUIElementListDTO();
    private iae lYl = null;
    private iia lYm = null;
    private double lYn = 0.0;

    public iib() {
        super("HousingWindow", "Housing.swf");
        this.OQ(jnz.nGi);
        this.a(hya.lmu, true);
        this.a(hyb.lmC);
    }

    public void initialize() {
        super.initialize();
        hyy hyy2 = iib.cyJ().cHx();
        if (hyy2 != null) {
            hyy2.a(hyy.a.lrQ, this);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lYl == null || this.lYm == null) {
            return;
        }
        if (ldz2.rgz - this.lYn < 1.0) {
            return;
        }
        this.lYn = ldz2.rgz;
        String string = "<font size='12'>" + this.lYm.cYM().bD(new Object[0]).exA().toUpperCase() + "</font>";
        String string2 = null;
        if (this.lYm.cYN() != null) {
            string2 = "<font size='12'>";
            for (int i = 0; i < this.lYm.cYN().length; ++i) {
                if (i > 0) {
                    string2 = string2 + "<br/>";
                }
                string2 = this.lYm.cYN()[i] == lxa.tlW ? string2 + this.lYm.cYN()[i].bD(this.iMB, cug.fkb).exA() : (this.lYm.cYN()[i] == lxa.tlX ? string2 + this.lYm.cYN()[i].bD(Math.max(0.0, (double)((this.iMC - (System.currentTimeMillis() - this.lYg)) / 1000L))).exA() : string2 + this.lYm.cYN()[i].bD(new Object[0]).exA());
            }
            string2 = string2 + "</font>";
        }
        this.lYl.c(iae.a(string, string2, 0, 0, 0, 0, new String[0]));
    }

    public void cleanUp() {
        hyy hyy2 = iib.cyJ().cHx();
        if (hyy2 != null) {
            hyy2.b(hyy.a.lrQ);
        }
        super.cleanUp();
    }

    public void cBa() {
        super.cBa();
        this.qq(true);
    }

    public void q(hyn hyn2) {
        this.lYl = null;
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length == 0 || stringArray[0] == null || stringArray[0].isEmpty()) {
            return null;
        }
        iia iia2 = iia.getValueByName(stringArray[0]);
        if (iia2 == null) {
            return this.x(n, n2, string);
        }
        float f = stringArray.length < 6 ? 0.0f : Float.valueOf(stringArray[5]).floatValue();
        float f2 = stringArray.length < 7 ? 0.0f : Float.valueOf(stringArray[6]).floatValue();
        f2 += (float)n2 >= iib.cxO().cHk().H / 2.0f ? -55.0f : 55.0f;
        boolean bl = false;
        String string2 = "<font size='12'>" + iia2.cYM().bD(new Object[0]).exA().toUpperCase() + "</font>";
        String string3 = null;
        if (iia2.cYN() != null) {
            string3 = "<font size='12'>";
            for (int i = 0; i < iia2.cYN().length; ++i) {
                if (i > 0) {
                    string3 = string3 + "<br/>";
                }
                if (iia2.cYN()[i] == lxa.tlW) {
                    string3 = string3 + iia2.cYN()[i].bD(this.iMB, cug.fkb).exA();
                    continue;
                }
                if (iia2.cYN()[i] == lxa.tlX) {
                    string3 = string3 + iia2.cYN()[i].bD(Math.max(0.0, (double)((this.iMC - (System.currentTimeMillis() - this.lYg)) / 1000L))).exA();
                    bl = true;
                    continue;
                }
                string3 = string3 + iia2.cYN()[i].bD(new Object[0]).exA();
            }
            string3 = string3 + "</font>";
        }
        iae iae2 = new iae(iae.a(string2, string3, 0, 0, 0, 0, new String[0]), n - (int)f, n2 - (int)f2);
        if (bl) {
            this.lYl = iae2;
            this.lYm = iia2;
        }
        return iae2;
    }

    protected void cEk() {
        String string = null;
        String string2 = null;
        if (this.aGQ != null) {
            string = lvm.sXa.bD(this.atf).exA();
            string2 = lvm.sXb.bD(this.atf).exA();
        }
        this.Q(string, string2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23840: {
                this.a((fhj)dxq2);
                break;
            }
            case 23821: {
                this.a((fim)dxq2);
                break;
            }
            case 23830: {
                this.a((fie)dxq2);
                break;
            }
            case 23815: {
                this.a((fhf)dxq2);
                break;
            }
            case 23817: {
                this.a((fhn)dxq2);
                break;
            }
            case 23819: {
                this.a((fio)dxq2);
                break;
            }
            case 23824: {
                this.a((fhw)dxq2);
                break;
            }
            case 23844: {
                this.a((fic)dxq2);
                break;
            }
            case 23836: {
                this.a((fii)dxq2);
                break;
            }
            case 23832: {
                this.a((fig)dxq2);
                break;
            }
            case 23834: {
                this.a((fhl)dxq2);
                break;
            }
            case 23842: {
                this.a((fhp)dxq2);
                break;
            }
            case 23846: {
                break;
            }
            case 23828: {
                this.a((fij)dxq2);
                break;
            }
            case 23827: {
                this.a((fik)dxq2);
                break;
            }
            case 23850: {
                this.a((fhu)dxq2);
                break;
            }
            case 23848: {
                this.a((fhy)dxq2);
                break;
            }
        }
    }

    @Override
    public void a(jmq jmq2) {
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    @Override
    public void b(hyy.b b2, int n) {
        hzo hzo2 = (hzo)iib.cxO();
        switch (b2) {
            case lvk: {
                this.setVisible(false);
                hzo2.cHw().duC();
                break;
            }
        }
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    @Override
    public void oH(boolean bl) {
        iib.cyJ().cHy().setVisible(false);
        if (bl) {
            switch (this.lYe) {
                case 0: {
                    this.qq(this.lYf);
                    break;
                }
                case 1: {
                    if (this.atg) {
                        this.qp(this.lYf);
                        break;
                    }
                    this.qo(this.lYf);
                    break;
                }
            }
        }
    }

    @Override
    public void O(float f, float f2) {
        hzs hzs2 = iib.cyJ().cHy();
        hzs2.setVisible(true);
        hzs2.cqF();
    }

    @llk
    private void payRent() {
        this.cYT();
    }

    @llk
    private void makeOwner(String string, String string2) {
        if (this.atg) {
            return;
        }
        this.lYe = 0;
        this.lYf = string;
        hzs hzs2 = iib.cyJ().cHy();
        hzs2.a(this);
        jnx jnx2 = new jnx(string2);
        hzs2.a(lwz.tlQ.bD(new Object[0]).exA(), (int)(this.cEE() + jnx2.x), (int)(this.cEF() + jnx2.y), (int)jnx2.width, (int)jnx2.height);
    }

    @llk
    private void setSafeAccess(String string, boolean bl) {
        if (this.atg) {
            return;
        }
        SFTenantPlayerDTO sFTenantPlayerDTO = this.qr(string);
        if (sFTenantPlayerDTO == null) {
            return;
        }
        sFTenantPlayerDTO.safeAccess = bl;
        this.cYU();
    }

    @llk
    private void whisperPlayer(String string) {
        SFTenantPlayerDTO sFTenantPlayerDTO = this.qr(string);
        if (sFTenantPlayerDTO == null) {
            return;
        }
        idf idf2 = iib.cyJ().cHJ();
        if (idf2 != null) {
            idf2.setVisible(true);
            idf2.cqF();
            idf2.cFc();
            idf2.oh(sFTenantPlayerDTO.firstName + " " + sFTenantPlayerDTO.lastName);
        }
    }

    @llk
    private void removeTenant(String string, String string2) {
        Object object;
        if (this.atg && !((String)(object = String.valueOf(hso.cxK().bAn().Tr.eny()))).equals(string)) {
            return;
        }
        this.lYe = 1;
        this.lYf = string;
        object = iib.cyJ().cHy();
        ((hzs)((Object)object)).a(this);
        jnx jnx2 = new jnx(string2);
        ((hzs)((Object)object)).a(this.atg ? lwz.tlS.bD(new Object[0]).exA() : lwz.tlR.bD(new Object[0]).exA(), (int)(this.cEE() + jnx2.x), (int)(this.cEF() + jnx2.y), (int)jnx2.width, (int)jnx2.height);
    }

    private void cYO() {
        this.lYi = new SFTenantPlayerListDTO();
        this.lYj = new SFGUIElementListDTO();
        this.lYk = new SFGUIElementListDTO();
    }

    private void qq(boolean bl) {
        if (!this.lYh) {
            this.lYh = bl;
        }
        this.cYP();
    }

    private void cYP() {
        fhi fhi2 = (fhi)this.MessageDelegator.h(23839, this.GUID, hso.cxK().bAn().Tr);
        this.MessageDelegator.F(fhi2);
    }

    private void cYQ() {
        if (this.aGQ == null) {
            return;
        }
        fht fht2 = (fht)this.MessageDelegator.h(23849, this.GUID, this.aGQ);
        this.MessageDelegator.F(fht2);
    }

    private void cYR() {
        if (this.aGQ == null) {
            return;
        }
        fil fil2 = (fil)this.MessageDelegator.h(23820, this.GUID, this.aGQ);
        this.MessageDelegator.F(fil2);
    }

    private void cYS() {
        if (this.aGQ == null) {
            return;
        }
        fid fid2 = (fid)this.MessageDelegator.h(23829, this.GUID, this.aGQ);
        this.MessageDelegator.F(fid2);
    }

    private void cYT() {
        buo buo2;
        assert (this.aGQ != null && this.iMB > 0);
        bup bup2 = (bup)this.MessageDelegator.bzx().bzt().d(lcr.qBW);
        if (bup2 != null && (buo2 = bup2.jU(hso.cxK().bAn().gYY)) != null) {
            ldv ldv2 = hso.cxK().bAn().Tr;
            fhv fhv2 = (fhv)this.MessageDelegator.h(23823, this.GUID, ldv2);
            fhv2.diQ = ldv2;
            fhv2.YU = buo2.FirstName;
            fhv2.YV = buo2.LastName;
            this.MessageDelegator.F(fhv2);
        }
    }

    private void cYU() {
        assert (this.aGQ != null && this.lYi != null && this.lYi.list != null);
        if (this.lYi.list.isEmpty()) {
            return;
        }
        ArrayList<SFTenantPlayerDTO> arrayList = lcn.emv();
        for (SFTenantPlayerDTO sFTenantPlayerDTO : this.lYi.list) {
            assert (sFTenantPlayerDTO != null);
            if (!sFTenantPlayerDTO.safeAccess) continue;
            arrayList.add(sFTenantPlayerDTO);
        }
        ldv[] ldvArray = new ldv[arrayList.size()];
        for (int i = 0; i < arrayList.size(); ++i) {
            SFTenantPlayerDTO sFTenantPlayerDTO;
            sFTenantPlayerDTO = (SFTenantPlayerDTO)arrayList.get(i);
            assert (sFTenantPlayerDTO != null && sFTenantPlayerDTO.GUID != null && !sFTenantPlayerDTO.GUID.isEmpty());
            try {
                ldvArray[i] = ldv.aw(Long.valueOf(sFTenantPlayerDTO.GUID));
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                return;
            }
        }
        fhx fhx2 = (fhx)this.MessageDelegator.h(23847, this.GUID, this.aGQ);
        fhx2.pG(hso.cxK().bAn().Tr);
        fhx2.D(ldvArray);
        this.MessageDelegator.F(fhx2);
    }

    private void qo(String string) {
        assert (this.aGQ != null && string != null && !string.isEmpty());
        fib fib2 = (fib)this.MessageDelegator.h(23843, this.GUID, this.aGQ);
        fib2.iMM = hso.cxK().bAn().Tr;
        try {
            fib2.iML = ldv.aw(Long.valueOf(string));
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        this.MessageDelegator.F(fib2);
    }

    private void qp(String string) {
        assert (this.aGQ != null && string != null && !string.isEmpty());
        fih fih2 = (fih)this.MessageDelegator.h(23835, this.GUID, hso.cxK().bAn().Tr);
        try {
            fih2.iML = ldv.aw(Long.valueOf(string));
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        this.MessageDelegator.F(fih2);
    }

    private void qq(String string) {
        assert (this.aGQ != null && string != null && !string.isEmpty());
        SFTenantPlayerDTO sFTenantPlayerDTO = this.qr(string);
        ldv ldv2 = null;
        if (sFTenantPlayerDTO == null) {
            return;
        }
        try {
            ldv2 = ldv.aw(Long.valueOf(string));
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        assert (ldv2 != null);
        fho fho2 = (fho)this.MessageDelegator.h(23841, this.GUID, ldv2);
        fho2.iMt = hso.cxK().bAn().Tr;
        fho2.iMu = ldv2;
        fho2.aGQ = this.aGQ;
        fho2.iMv = sFTenantPlayerDTO.firstName;
        fho2.iMw = sFTenantPlayerDTO.lastName;
        this.MessageDelegator.F(fho2);
    }

    private void a(fhj fhj2) {
        jah jah2 = iib.cyJ().cHw();
        jju jju2 = iib.cyJ().cHB();
        this.aGQ = fhj2.aGQ;
        this.atf = fhj2.atf;
        this.atg = fhj2.atg;
        if (this.aGQ == null) {
            this.Q("No house!", null);
            if (jah2 != null) {
                jah2.a(hyc.lmU, false);
                jah2.c(hyc.lmU, false);
            }
            if (jju2 != null) {
                jju2.ud(false);
            }
        } else {
            String string = lvm.sXa.bD(this.atf).exA();
            String string2 = lvm.sXb.bD(this.atf).exA();
            this.Q(string, string2);
            if (this.lYh) {
                this.lYh = false;
                this.cYR();
                this.cYS();
            }
            this.cYQ();
            if (jah2 != null) {
                jah2.c(hyc.lmU, true);
            }
            if (jju2 != null) {
                jju2.ud(true);
            }
        }
    }

    private void a(fhf fhf2) {
        if (fhf2.bPD().vA()) {
            this.qq(true);
        }
    }

    private void a(fhn fhn2) {
        if (fhn2.ew == 1) {
            this.qq(false);
        }
    }

    private void a(fij fij2) {
        jju jju2 = iib.cyJ().cHB();
        if (jju2 != null) {
            jju2.ud(false);
        }
        this.qq(false);
    }

    private void a(fik fik2) {
        this.cYO();
        this.cYV();
        this.qq(false);
    }

    private void a(fhu fhu2) {
        this.iMB = fhu2.iMB;
        this.iMC = fhu2.iMC;
        this.lYg = System.currentTimeMillis();
        this.a("setRentPaid", new Object[]{this.iMB == 0});
    }

    private void a(fhw fhw2) {
        if (fhw2.bPF().vA()) {
            this.qq(false);
        }
    }

    private void a(fie fie2) {
        if (fie2.iMS == null || fie2.iMT == null || fie2.iMU == null || fie2.iMV == null || fie2.iMS.length == 0 || fie2.iMT.length == 0 || fie2.iMU.length == 0 || fie2.iMV.length == 0) {
            this.lYi = new SFTenantPlayerListDTO();
            this.a("replaceTenants", new Object[]{this.lYi});
            return;
        }
        if (fie2.iMS.length != fie2.iMT.length || fie2.iMS.length != fie2.iMU.length || fie2.iMS.length != fie2.iMV.length) {
            return;
        }
        this.lYi = new SFTenantPlayerListDTO();
        for (int i = 0; i < fie2.iMS.length; ++i) {
            SFTenantPlayerDTO sFTenantPlayerDTO = new SFTenantPlayerDTO();
            sFTenantPlayerDTO.GUID = String.valueOf(fie2.iMS[i].eny());
            sFTenantPlayerDTO.firstName = fie2.iMT[i];
            sFTenantPlayerDTO.lastName = fie2.iMU[i];
            sFTenantPlayerDTO.safeAccess = fie2.iMV[i];
            if (this.atg) {
                String string = String.valueOf(hso.cxK().bAn().Tr.eny());
                sFTenantPlayerDTO.makeOwnerButtonEnabled = false;
                sFTenantPlayerDTO.safeAccessButtonEnabled = false;
                sFTenantPlayerDTO.removeButtonEnabled = string.equals(sFTenantPlayerDTO.GUID);
                sFTenantPlayerDTO.chatButtonEnabled = !string.equals(sFTenantPlayerDTO.GUID);
            }
            this.lYi.list.add(sFTenantPlayerDTO);
        }
        this.a("replaceTenants", new Object[]{this.lYi});
    }

    private void a(fim fim2) {
        les les2 = lea.enW();
        if (fim2.iNf == null || fim2.iNf.length == 0 || les2 == null) {
            return;
        }
        this.lYj = new SFGUIElementListDTO();
        this.lYk = new SFGUIElementListDTO();
        for (int i = 0; i < fim2.iNf.length; ++i) {
            SFGUIElementDTO sFGUIElementDTO;
            int n = fim2.iNf[i];
            ler ler2 = les2.acv(n);
            if (!(ler2 instanceof lgw)) continue;
            lgw lgw2 = (lgw)ler2;
            if (les2.isDescendant(n, cug.fgu)) {
                sFGUIElementDTO = this.D(n, lgw2.enm());
                this.lYj.list.add(sFGUIElementDTO);
                continue;
            }
            if (!les2.isDescendant(n, cug.fgv)) continue;
            sFGUIElementDTO = this.D(n, lgw2.enm());
            this.lYk.list.add(sFGUIElementDTO);
        }
        this.a("setExteriorListData", new Object[]{this.lYj});
        this.a("setInteriorListData", new Object[]{this.lYk});
    }

    private void a(fio fio2) {
        if (fio2.bPK().vA()) {
            this.cYR();
        }
    }

    private void a(fig fig2) {
        if (fig2.bPJ().vA()) {
            this.qq(true);
        }
    }

    private void a(fii fii2) {
        if (fii2.ew == 2) {
            this.qq(false);
        }
    }

    private void a(fic fic2) {
        if (fic2.ew == 3) {
            this.cYS();
        }
    }

    private void a(fhl fhl2) {
        if (fhl2.ew == 4) {
            this.cYS();
        }
    }

    private void a(fhp fhp2) {
        if (fhp2.ew == 5) {
            this.qq(true);
        }
    }

    private void a(fhy fhy2) {
        if (fhy2.getResult() == 1) {
            this.cYS();
        }
    }

    private void Q(String string, String string2) {
        SFHousingStringsDTO sFHousingStringsDTO = new SFHousingStringsDTO();
        sFHousingStringsDTO.headerTitle = lwz.tlL.bD(new Object[0]).exA();
        sFHousingStringsDTO.houseName = string;
        sFHousingStringsDTO.houseDescription = string2;
        sFHousingStringsDTO.exteriorTitle = lwz.tlM.bD(new Object[0]).exA();
        sFHousingStringsDTO.interiorTitle = lwz.tlN.bD(new Object[0]).exA();
        sFHousingStringsDTO.tenantsTitle = lwz.tlO.bD(new Object[0]).exA();
        sFHousingStringsDTO.tenantsName = lwz.tlP.bD(new Object[0]).exA();
        this.a("setStrings", new Object[]{sFHousingStringsDTO});
    }

    private void cYV() {
        this.a("replaceTenants", new Object[]{this.lYi});
        this.a("setExteriorListData", new Object[]{this.lYj});
        this.a("setInteriorListData", new Object[]{this.lYk});
    }

    private hyn x(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 5) {
            return null;
        }
        int n3 = Integer.valueOf(stringArray[0]);
        float f = Float.valueOf(stringArray[3]).floatValue();
        float f2 = Float.valueOf(stringArray[4]).floatValue();
        float f3 = (float)n2 >= iib.cxO().cHk().H / 2.0f ? -55.0f : 55.0f;
        String string2 = "<font size='12'>" + lvm.sXa.bD(n3).exA().toUpperCase() + "</font>";
        String string3 = "<font size='12'>" + lvm.sXb.bD(n3).exA() + "</font>";
        iae iae2 = new iae(iae.a(string2, string3, 0, 0, 0, 0, new String[0]), n - (int)f, n2 - (int)(f2 += f3));
        return iae2;
    }

    private SFTenantPlayerDTO qr(String string) {
        if (string == null || string.isEmpty() || this.lYi == null || this.lYi.list == null || this.lYi.list.isEmpty()) {
            return null;
        }
        for (SFTenantPlayerDTO sFTenantPlayerDTO : this.lYi.list) {
            if (sFTenantPlayerDTO == null || !string.equals(sFTenantPlayerDTO.GUID)) continue;
            return sFTenantPlayerDTO;
        }
        return null;
    }

    private SFGUIElementDTO D(int n, String string) {
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        sFGUIElementDTO.id = n;
        sFGUIElementDTO.iconName = lYb + string;
        sFGUIElementDTO.type = hxx.llC.ordinal();
        return sFGUIElementDTO;
    }

    private SFTenantPlayerListDTO cYW() {
        SFTenantPlayerListDTO sFTenantPlayerListDTO = new SFTenantPlayerListDTO();
        for (int i = 0; i < 30; ++i) {
            SFTenantPlayerDTO sFTenantPlayerDTO = new SFTenantPlayerDTO();
            sFTenantPlayerDTO.GUID = String.valueOf(i);
            sFTenantPlayerDTO.firstName = "First" + String.valueOf(i);
            sFTenantPlayerDTO.lastName = "Last" + String.valueOf(i);
            sFTenantPlayerDTO.online = i % 2 == 0;
            sFTenantPlayerDTO.safeAccess = i % 2 != 0;
            sFTenantPlayerDTO.changed = false;
            sFTenantPlayerListDTO.list.add(sFTenantPlayerDTO);
        }
        return sFTenantPlayerListDTO;
    }

    private SFGUIElementListDTO cYX() {
        SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
        SFGUIElementDTO sFGUIElementDTO = this.D(1, "gui/resources/playerhouse_decor_animal_head_01.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        sFGUIElementDTO = this.D(2, "gui/resources/playerhouse_decor_animal_head_03.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        sFGUIElementDTO = this.D(3, "gui/resources/playerhouse_decor_animal_head_05.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        sFGUIElementDTO = this.D(4, "gui/resources/playerhouse_decor_animal_head_07.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        sFGUIElementDTO = this.D(5, "gui/resources/playerhouse_decor_wall_tapestry_small_01.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        sFGUIElementDTO = this.D(6, "gui/resources/playerhouse_decor_flower_pot_01.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        sFGUIElementDTO = this.D(7, "gui/resources/playerhouse_decor_herb_garden_01.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        sFGUIElementDTO = this.D(8, "gui/resources/playerhouse_decor_painting_big_01.dds");
        sFGUIElementListDTO.list.add(sFGUIElementDTO);
        return sFGUIElementListDTO;
    }
}

