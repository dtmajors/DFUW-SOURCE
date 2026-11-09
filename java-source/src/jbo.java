/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 *  hyn
 *  hzo
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;
import spenefett.hid.gui.serialization.dto.SFPartyMemberDTO;

public class jbo
extends hzk
implements hsn,
hyy.d,
hzq {
    private static final String TC = "SFPartyMemberBarWindow";
    private static final String mOv = "texture/gui/runtime/party/leader.png";
    private static final String mOw = "texture/gui/runtime/party/dot.png";
    private boolean mOx = false;
    private ldv mOy = null;
    private ldv mOz = null;
    private TreeMap<Integer, jbn> mOA = lcn.emG();
    private TreeMap<Integer, cbi> mOB = lcn.emG();
    private TreeMap<Integer, SFPartyMemberDTO> mOC = lcn.emG();
    protected iad lqS = null;
    protected int lqB = -1;
    private dsu alW = null;
    private boolean aYb = false;
    private Integer mOD = null;
    private int fb = 600;
    private int fc = 64;
    private hyi lqW;
    private jbm mOE;
    private boolean mOF = true;
    private float lJO = 0.1f;
    private lox mOG;
    private hyy.b mOH;
    private HashMap<Integer, joa> mOI = new HashMap();

    public jbo() {
        super("PartyMemberBarWindow", "PartyMemberBarWindow.swf");
        this.OQ(jnz.nGC);
        this.a(hyb.lmC);
        this.setVisible(false);
    }

    public boolean dwA() {
        return this.mOC != null && this.mOC.size() > 0;
    }

    public boolean rJ(ldv ldv2) {
        for (cbi cbi2 : this.mOB.values()) {
            if (!cbi2.afF.equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public boolean rK(ldv ldv2) {
        for (cbi cbi2 : this.mOB.values()) {
            if (cbi2.afF.enw() != ldv2.enw()) continue;
            return true;
        }
        return false;
    }

    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 17944: {
                this.b((fxx)dxq2);
                break;
            }
            case 17943: {
                this.b((fwy)dxq2);
                break;
            }
            case 17942: {
                this.b((fws)dxq2);
            }
        }
    }

    private void b(fws fws2) {
        this.mOy = fws2.aO();
        this.mOz = fws2.cRI;
    }

    private void b(fxx fxx2) {
        this.alW = hso.cxK().bAn();
        if (this.alW == null) {
            return;
        }
        cbi[] cbiArray = fxx2.jaP;
        boolean bl = false;
        if (this.mOC.isEmpty() && cbiArray.length > 0) {
            bl = true;
        }
        ArrayList<Object> arrayList = null;
        Iterator<Map.Entry<Integer, SFPartyMemberDTO>> iterator = this.mOC.entrySet().iterator();
        while (iterator.hasNext()) {
            boolean bl2 = false;
            Object object = iterator.next();
            for (cbi cbi2 : cbiArray) {
                if (cbi2.eiK != (Integer)object.getKey()) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            if (arrayList == null) {
                arrayList = lcn.emv();
            }
            arrayList.add(object.getKey());
            this.mOB.remove(object.getKey());
            iterator.remove();
        }
        if (arrayList != null) {
            for (Object object : arrayList) {
                this.a("removePartyMember", new Object[]{String.valueOf(object)});
            }
        }
        for (cbi cbi3 : cbiArray) {
            SFXMLSerializable sFXMLSerializable;
            int n = !this.alW.gYY.equals(cbi3.afF) || this.mOx ? 1 : 0;
            int n2 = cxj.b(cbi3.aYc, cxd.l.fRP);
            bsn bsn2 = (bsn)((Object)lea.enZ().acv(n2));
            float f2 = cbi3.aGr / cbi3.aGA;
            cbi cbi4 = this.mOB.get(cbi3.eiK);
            if (cbi4 != null) {
                if (!cbi4.a(cbi3)) continue;
                sFXMLSerializable = this.mOC.get(cbi3.eiK);
                if (sFXMLSerializable == null) {
                    assert (false);
                    continue;
                }
                if (cbi3.aXX && n != 0) {
                    jbn jbn2 = this.mOA.get(cbi3.eiK);
                    jbn2.b(cbi3.aXY);
                }
                boolean bl3 = cbi4.b(cbi3);
                boolean bl4 = cbi4.c(cbi3);
                boolean bl5 = cbi4.d(cbi3);
                if (cbi3.aYe) {
                    this.a("creditKill", new Object[]{String.valueOf(cbi4.eiK)});
                }
                if (bl5) {
                    this.a("excludeFromRoundRobin", new Object[]{String.valueOf(cbi4.eiK), cbi3.RoundRobinExcluded});
                }
                if (bl3 && !bl4) {
                    ((SFPartyMemberDTO)sFXMLSerializable).MainSchool.progress = f2;
                    this.a("updateHealth", new Object[]{Float.valueOf(f2), String.valueOf(cbi4.eiK)});
                } else if (bl4) {
                    ((SFPartyMemberDTO)sFXMLSerializable).Changed = true;
                    ((SFPartyMemberDTO)sFXMLSerializable).LeaderIconName = this.e(cbi3);
                    ((SFPartyMemberDTO)sFXMLSerializable).Name = cbi3.eiq.esy();
                    ((SFPartyMemberDTO)sFXMLSerializable).MainSchool.iconName = lcw.aQH() ? "" : "texture/dds/" + bsn2.atw().Name;
                    ((SFPartyMemberDTO)sFXMLSerializable).MainSchool.changed = !lcw.aQH();
                    ((SFPartyMemberDTO)sFXMLSerializable).MainSchool.state = 0;
                    ((SFPartyMemberDTO)sFXMLSerializable).RoundRobinExcluded = cbi3.RoundRobinExcluded;
                    this.a("updatePartyMember", new Object[]{sFXMLSerializable, cbi3.aYb});
                }
                this.mOB.put(cbi3.eiK, cbi3);
            } else {
                sFXMLSerializable = new SFGUIElementDTO();
                sFXMLSerializable.iconName = lcw.aQH() ? "" : "texture/dds/" + bsn2.atw().Name;
                sFXMLSerializable.quantity = 1;
                sFXMLSerializable.text = lcw.aQH() ? "" : lya.tCp.bD(bsn2.getType()).exA();
                sFXMLSerializable.progressShape = 12;
                sFXMLSerializable.progress = f2;
                sFXMLSerializable.changed = true;
                sFXMLSerializable.state = 0;
                SFPartyMemberDTO sFPartyMemberDTO = new SFPartyMemberDTO();
                sFPartyMemberDTO.ID = String.valueOf(cbi3.eiK);
                sFPartyMemberDTO.LeaderIconName = this.e(cbi3);
                sFPartyMemberDTO.MainSchool = sFXMLSerializable;
                sFPartyMemberDTO.Name = cbi3.eiq.esy();
                sFPartyMemberDTO.RoundRobinExcluded = false;
                this.mOB.put(cbi3.eiK, cbi3);
                this.mOC.put(cbi3.eiK, sFPartyMemberDTO);
                hwc hwc2 = null;
                if (n != 0) {
                    hwc2 = new hwc();
                    hwc2.setGUID(this.MessageDelegator.bzv());
                    this.MessageDelegator.a(hwc2);
                }
                if (!this.isVisible() && !jbo.cyJ().cIt().isOpen()) {
                    this.setVisible(true);
                }
                this.a("addPartyMember", new Object[]{sFPartyMemberDTO, cbi3.aYb});
                jbn jbn3 = new jbn(this, hwc2, cbi3);
                this.mOA.put(cbi3.eiK, jbn3);
                if (cbi3.aXY != null && cbi3.aXY.length > 0) {
                    jbn3.b(cbi3.aXY);
                }
            }
            if (!this.alW.gYY.equals(cbi3.afF)) continue;
            this.aYb = cbi3.aYb;
            this.a("setLeader", new Object[]{this.aYb});
        }
        this.dwB();
        if (bl) {
            jbo.cyJ().updateLayout();
        }
    }

    private String e(cbi cbi2) {
        return cbi2.aYb ? mOv : mOw;
    }

    private cbi[] a(cbi[] cbiArray) {
        cbi[] cbiArray2 = new cbi[3];
        cbiArray2[0] = cbiArray[0];
        cbi cbi2 = new cbi();
        cbi cbi3 = new cbi();
        cbi2.aYb = false;
        cbi2.aYc = cbiArray[0].aYc;
        cbi2.eiK = cbiArray[0].eiK + 1;
        cbi2.aGr = cbiArray[0].aGr;
        cbi2.aGA = cbiArray[0].aGA;
        cbi2.eiq = new ljg("Player 1");
        cbi2.afF = new ldv(0, 0, 1);
        cbi3.aYb = false;
        cbi3.aYc = cbiArray[0].aYc;
        cbi3.eiK = cbiArray[0].eiK + 2;
        cbi3.aGr = cbiArray[0].aGr;
        cbi3.aGA = cbiArray[0].aGA;
        cbi3.eiq = new ljg("Player 2");
        cbi3.afF = new ldv(0, 0, 2);
        cbiArray2[1] = cbi2;
        cbiArray2[2] = cbi3;
        cbiArray2[0].aYb = true;
        return cbiArray2;
    }

    private void b(fwy fwy2) {
        this.mOB.clear();
        this.mOA.clear();
        this.mOy = null;
        this.alW = null;
        this.aYb = false;
        this.mOD = null;
        for (Integer n : this.mOC.keySet()) {
            this.a("removePartyMember", new Object[]{String.valueOf(n)});
        }
        hzo hzo2 = (hzo)jbo.cxO();
        if (hzo2 != null && hzo2.cHx() != null) {
            hzo2.cHx().a(hyy.a.lrP, false);
        }
        this.mOC.clear();
        this.setVisible(false);
    }

    public ldv jM() {
        return this.mOz;
    }

    @llk
    public void updatePosition(double d2, double d3) {
        this.fb = (int)d2;
        this.fc = (int)d3;
    }

    @llk
    public void toggleParticipationInRoundRobin(String string) {
        if (jbo.cxN() == jnz.nFE) {
            return;
        }
        int n = -1;
        try {
            n = Integer.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        cbi cbi2 = this.mOB.get(n);
        if (cbi2 == null) {
            assert (false);
            return;
        }
        this.mOD = n;
        this.TM(cbi2.RoundRobinExcluded ? 4 : 3);
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    public void dwB() {
    }

    @Override
    public void b(hyy.b b2, int n) {
        switch (b2) {
            case lvg: {
                this.a("toggleModifiers", new Object[0]);
                break;
            }
            case lvj: {
                this.a(hyy.b.lvj, lxs.txu);
                break;
            }
            case lvh: {
                this.a(hyy.b.lvh, lxs.tac);
                break;
            }
            case lvi: {
                this.a(hyy.b.lvi, lxs.taf);
                break;
            }
            default: {
                assert (false) : "Invalid button : " + b2.name();
                break;
            }
        }
    }

    protected void g(int n, int n2, String string) {
        if (string == null || string.isEmpty() || !string.contains("party")) {
            return;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return;
        }
        int n3 = -1;
        try {
            n3 = Integer.valueOf(stringArray[1]);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        cbi cbi2 = this.mOB.get(n3);
        if (cbi2 == null) {
            return;
        }
        this.a(this.mOD, "texture/dds/gui/mapindicator/mm_marker_party_player.dds");
        this.mOD = n3;
        this.a(this.mOD, "texture/dds/gui/mapindicator/mm_marker_party_player_selected.dds");
        this.a("bringMemberToFront", new Object[]{String.valueOf(this.mOD)});
        this.dwB();
    }

    private void a(Integer n, String string) {
        if (n == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        cbi cbi2 = this.mOB.get(n);
        if (cbi2 == null) {
            return;
        }
        jjh jjh2 = hso.cxK().cxT().dIR().ab("text", cbi2.eiq.esy());
        if (jjh2 == null) {
            return;
        }
        jjh2.sA(string);
    }

    protected void j(int n, int n2, String string) {
        if (string == null || string.isEmpty() || !string.contains("party")) {
            return;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return;
        }
        int n3 = -1;
        try {
            n3 = Integer.valueOf(stringArray[1]);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        cbi cbi2 = this.mOB.get(n3);
        if (cbi2 == null) {
            return;
        }
        this.mOD = n3;
        this.a("bringMemberToFront", new Object[]{String.valueOf(this.mOD)});
        this.dwB();
    }

    public hyn f(int n, int n2, String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return null;
        }
        int n3 = -1;
        try {
            n3 = Integer.valueOf(stringArray[1]);
        }
        catch (Exception exception) {
            return null;
        }
        if (n3 < 1) {
            return null;
        }
        cbi cbi2 = this.mOB.get(n3);
        if (cbi2 == null) {
            return null;
        }
        this.mOD = n3;
        ArrayList<String> arrayList = lcn.emv();
        boolean bl = cbi2.afF.equals(this.alW.gYY);
        arrayList.add(bl ? jbm.mOp.getName() : jbm.mOi.getName());
        if (this.aYb) {
            if (!bl) {
                arrayList.add(jbm.mOk.getName());
                arrayList.add(jbm.mOj.getName());
            }
            arrayList.add(jbm.mOo.getName());
        }
        if (this.mOB.size() > 1) {
            arrayList.add(jbm.mOn.getName());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hwk hwk2 = new hwk(string);
        int n4 = (int)((double)this.cEE() + hwk2.cBe() + hwk2.getX() / 2.0) + 12;
        int n5 = (int)((double)this.cEF() + hwk2.cBf() + hwk2.getY() / 2.0);
        this.lqW = new hyi(this, n4, n5, new hyk(this, arrayList){
            final /* synthetic */ List lra;
            final /* synthetic */ jbo mOJ;
            {
                this.mOJ = jbo2;
                this.lra = list;
            }

            public String[] cDR() {
                return this.lra.toArray(new String[this.lra.size()]);
            }

            public void a(int n, String string, int n2, int n3, int n4, int n5) {
                jbm jbm2 = jbm.getValueByName(string);
                switch (jbm2) {
                    case mOk: {
                        jbo.a(this.mOJ, jbm2);
                        break;
                    }
                    case mOj: {
                        jbo.a(this.mOJ, jbm2);
                        break;
                    }
                    case mOp: {
                        jbo.a(this.mOJ, jbm2);
                        break;
                    }
                    case mOi: {
                        jbo.a(this.mOJ);
                        if (jbo.dwJ() != null) {
                            jbo.cOH().czi();
                        }
                        if (hyn.cyJ() == null) break;
                        hyn.cyJ().cHy().setVisible(false);
                        break;
                    }
                    case mOn: {
                        jbo.a(this.mOJ, !jbo.b(this.mOJ));
                        this.mOJ.a("toggleModifiers", new Object[]{jbo.b(this.mOJ)});
                        if (jbo.cOJ() != null) {
                            jbo.cOK().czi();
                        }
                        if (hyn.cyJ() == null) break;
                        hyn.cyJ().cHy().setVisible(false);
                        break;
                    }
                    case mOo: {
                        jbo.a(this.mOJ, 2);
                        if (jbo.cOM() != null) {
                            jbo.dwK().czi();
                        }
                        if (hyn.cyJ() == null) break;
                        hyn.cyJ().cHy().setVisible(false);
                        break;
                    }
                }
            }

            public void cDU() {
            }
        }){
            final /* synthetic */ jbo mOJ;
            {
                this.mOJ = jbo2;
                super(n, n2, hyk2);
            }

            protected void a(jnx jnx2) {
                jbo.a(this.mOJ, jnx2);
            }
        };
        this.lqW.a(hyi.a.lnZ);
        return this.lqW;
    }

    private void a(jbm jbm2) {
        this.mOE = jbm2;
        String[] stringArray = this.lqW.cDR();
        assert (stringArray != null);
        int n = -1;
        if (stringArray != null) {
            for (int i = 0; i < stringArray.length; ++i) {
                String string = stringArray[i];
                if (!string.equals(jbm2.getName())) continue;
                n = i;
                break;
            }
        }
        assert (n != -1);
        this.lqW.OR(n);
    }

    private void b(jnx jnx2) {
        String[] stringArray = this.lqW.cDR();
        assert (stringArray != null);
        if (jnx2.id < 0 || jnx2.id >= stringArray.length) {
            return;
        }
        this.G((int)(this.lqW.cEE() + jnx2.x), (int)(this.lqW.cEF() + jnx2.y), (int)jnx2.width, (int)jnx2.height);
    }

    private void G(int n, int n2, int n3, int n4) {
        hzs hzs2 = jbo.cyJ().cHy();
        hzs2.a(this);
        hzs2.a(this.mOE.name(), n, n2, 0, n4);
    }

    private void dwC() {
        hzo hzo2;
        idf idf2;
        if (this.mOD == null) {
            return;
        }
        cbi cbi2 = this.mOB.get(this.mOD);
        if (cbi2 == null) {
            assert (false);
            return;
        }
        if (jbo.cxP() != null && jbo.cxP().cxO() != null && jbo.cxP().cxO() instanceof hzo && (idf2 = (hzo2 = (hzo)jbo.cxP().cxO()).cHJ()) != null) {
            idf2.setVisible(true);
            idf2.cqF();
            idf2.oh(cbi2.eiq.esy());
        }
    }

    private void dwD() {
        if (this.alW == null) {
            lfn.b(5, this.getClass().getSimpleName(), "sendLeavePartyMessage() Client info is null");
            return;
        }
        fxl fxl2 = (fxl)this.MessageDelegator.h(17938, this.GUID, this.alW.Tr);
        this.MessageDelegator.F(fxl2);
    }

    private void TM(int n) {
        if (this.alW == null) {
            lfn.b(5, this.getClass().getSimpleName(), "sendMemberManagementRequestMessage() Client info is null");
            return;
        }
        if (this.mOD == null) {
            return;
        }
        cbi cbi2 = this.mOB.get(this.mOD);
        if (cbi2 == null) {
            return;
        }
        if (!this.aYb) {
            assert (false) : "You shouldn't be able to see this button";
            return;
        }
        fwz fwz2 = (fwz)this.MessageDelegator.h(17952, this.GUID, this.mOy);
        fwz2.DV(n);
        fwz2.pY(this.alW.Tr);
        fwz2.pZ(lcr.abW((int)cbi2.afF.enw()));
        this.MessageDelegator.F(fwz2);
    }

    public hyn s(int n, int n2, String string) {
        if (string == null || !string.contains("modifier")) {
            return null;
        }
        hwk hwk2 = new hwk(string);
        if (hwk2.getId() == -1) {
            return null;
        }
        this.lqB = hwk2.getId();
        lfn.b(5, this.getClass().getSimpleName(), "onTooltip() setting observed modifier " + this.lqB);
        List<hvz> list = null;
        for (jbn object : this.mOA.values()) {
            if (!object.TL(this.lqB)) continue;
            list = object.dwz();
            break;
        }
        if (list != null) {
            for (hvz hvz2 : list) {
                if (hvz2.getId() != this.lqB) continue;
                this.lqS = new iad(n, n2);
                ArrayList<Integer> arrayList = lcn.emv();
                for (int i = 0; i < hvz2.cAN(); ++i) {
                    arrayList.add(i);
                }
                ArrayList<Integer> arrayList2 = lcn.emv();
                this.lqS.a(hvz2, arrayList, arrayList2);
                return this.lqS;
            }
        }
        return null;
    }

    public void initialize() {
        super.initialize();
        hso.cxK().a(this);
        hzo hzo2 = (hzo)jbo.cxO();
        if (hzo2 != null && hzo2.cHx() != null) {
            hzo2.cHx().a(hyy.a.lrP, this);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        hso.cxK().b(this);
        hzo hzo2 = (hzo)jbo.cxO();
        if (hzo2 != null && hzo2.cHx() != null) {
            hzo2.cHx().b(hyy.a.lrP);
        }
    }

    public void cBa() {
        super.cBa();
        this.a("setIconNames", new Object[]{mOv, mOw});
        if (!this.mOC.isEmpty()) {
            for (SFPartyMemberDTO sFPartyMemberDTO : this.mOC.values()) {
                cbi cbi2 = this.mOB.get(Integer.valueOf(sFPartyMemberDTO.ID));
                this.a("addPartyMember", new Object[]{sFPartyMemberDTO, cbi2.aYb});
                jbn jbn2 = this.mOA.get(Integer.valueOf(sFPartyMemberDTO.ID));
                boolean bl = !this.alW.gYY.equals(cbi2.afF) || this.mOx;
                if (!bl) continue;
                jbn2.b(cbi2.aXY);
            }
        }
    }

    public int dwE() {
        return this.fb;
    }

    public int dwF() {
        return this.fc;
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
        if (jnz3 == jnz.nFE) {
            this.mOD = null;
            this.a("setGameModeBackgroundAlpha", new Object[]{Float.valueOf(this.lJO)});
        }
    }

    @Override
    public void oo() {
        this.alW = hso.cxK().bAn();
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public boolean op() {
        return this.isInitialized();
    }

    public void c(String string, Object ... objectArray) {
        this.a(string, objectArray);
    }

    public TreeMap<Integer, cbi> dwG() {
        return this.mOB;
    }

    private void a(hyy.b b2, lox lox2) {
        this.mOG = lox2;
        this.mOH = b2;
        jbo.cyJ().cHx().OR(b2.ordinal());
    }

    @Override
    public void a(hyy.b b2, jnx jnx2) {
        switch (b2) {
            case lvj: 
            case lvh: 
            case lvi: {
                hzs hzs2 = jbo.cyJ().cHy();
                hzs2.a(this);
                hzs2.a(this.mOG.bD(new Object[0]).exA(), (int)(jbo.cyJ().cHx().cEE() + jnx2.x + 8.0f), (int)(jbo.cyJ().cHx().cEF() + jnx2.y), (int)jnx2.width, (int)jnx2.height);
                break;
            }
            default: {
                assert (false) : "Invalid button : " + b2.name();
                break;
            }
        }
    }

    @Override
    public void oH(boolean bl) {
        if (jbo.cxP() != null) {
            jbo.cxP().czi();
        }
        if (jbo.cyJ() != null) {
            jbo.cyJ().cHy().setVisible(false);
        }
        if (!bl) {
            return;
        }
        if (this.mOH != null) {
            switch (this.mOH) {
                case lvj: {
                    this.dwD();
                    break;
                }
                case lvh: {
                    this.TM(1);
                    break;
                }
                case lvi: {
                    this.TM(0);
                    break;
                }
                default: {
                    assert (false) : "Invalid button : " + this.mOH.name();
                    break;
                }
            }
            this.mOH = null;
        } else if (this.mOE != null) {
            switch (this.mOE) {
                case mOj: {
                    this.TM(1);
                    break;
                }
                case mOp: {
                    this.dwD();
                    break;
                }
                case mOk: {
                    this.TM(0);
                    break;
                }
                default: {
                    assert (false);
                    break;
                }
            }
            this.mOE = null;
        }
    }

    @Override
    public void O(float f2, float f3) {
    }

    @Override
    public boolean b(hyy.b b2) {
        return false;
    }

    public boolean dwH() {
        return this.aYb;
    }

    @llk
    private void _setPartyMemberBarRect(int n, double d2, double d3, double d4, double d5) {
        this.mOI.put(n, new joa((float)d2, (float)d3, (float)d4, (float)d5));
    }

    @llk
    private void _clearPartyMemberBarRects() {
        this.mOI.clear();
    }

    protected boolean d(int n, int n2, String string) {
        for (joa joa2 : this.mOI.values()) {
            float f2;
            float f3;
            float f4;
            float f5 = joa2.X + this.cEE();
            if (!joa.b(f5, f4 = joa2.Y + this.cEF(), f3 = f5 + joa2.W, f2 = f4 + joa2.H, n, n2)) continue;
            return true;
        }
        return false;
    }

    public void kz(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.lJO = f2;
    }

    public float cOx() {
        return this.lJO;
    }

    private void pT(boolean bl) {
        this.a("setGameModeEnabled", new Object[]{bl, Float.valueOf(this.lJO)});
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (this.cEU()) {
            this.pT(jnz3 == jnz.nFE);
        }
    }

    public final boolean dwI() {
        return this.mOF;
    }

    static /* synthetic */ void a(jbo jbo2, jbm jbm2) {
        jbo2.a(jbm2);
    }

    static /* synthetic */ void a(jbo jbo2) {
        jbo2.dwC();
    }

    static /* synthetic */ hvj dwJ() {
        return jbo.cxP();
    }

    static /* synthetic */ hvj cOH() {
        return jbo.cxP();
    }

    static /* synthetic */ boolean a(jbo jbo2, boolean bl) {
        jbo2.mOF = bl;
        return jbo2.mOF;
    }

    static /* synthetic */ boolean b(jbo jbo2) {
        return jbo2.mOF;
    }

    static /* synthetic */ hvj cOJ() {
        return jbo.cxP();
    }

    static /* synthetic */ hvj cOK() {
        return jbo.cxP();
    }

    static /* synthetic */ void a(jbo jbo2, int n) {
        jbo2.TM(n);
    }

    static /* synthetic */ hvj cOM() {
        return jbo.cxP();
    }

    static /* synthetic */ hvj dwK() {
        return jbo.cxP();
    }

    static /* synthetic */ void a(jbo jbo2, jnx jnx2) {
        jbo2.b(jnx2);
    }
}

