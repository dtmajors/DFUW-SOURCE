/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  iba
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFCharacterSchoolDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterSchoolListDTO;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;
import spenefett.hid.gui.serialization.dto.SFGUIElementListDTO;

public class ibe
extends iax {
    public static final int lEj = 666;
    public static final int lEk = 999;
    public static final int lEl = 100;
    public static final int lEm = 200;
    public static final int lEn = 300;
    private Map<Integer, Integer> lEo = lcn.emw();
    private Map<Integer, Integer> lEp = lcn.emw();
    private SFCharacterSchoolListDTO lEq = new SFCharacterSchoolListDTO();
    private SFGUIElementListDTO lEr = new SFGUIElementListDTO();
    private SFGUIElementListDTO lEs = new SFGUIElementListDTO();
    private List<hwv> lEt = lcn.emv();
    private List<hwv> lEu = lcn.emv();
    private List<hwv> lEv = lcn.emv();

    public ibe(iba iba2) {
        super("CharacterCreatorSchool", "CharacterCreatorSchool.swf", iba2);
    }

    @Override
    protected void cBa() {
        super.cBa();
    }

    protected void cEc() {
        super.cEc();
        if (this.cEU()) {
            this.cEk();
            this.cMo();
            this.cLu();
            this.cMk();
        }
    }

    @Override
    protected void b(int n, int n2, int n3, String string) {
        super.b(n, n2, n3, string);
        if (this.lDa != 0.0f) {
            this.lwn.ky(this.lDa);
        }
    }

    protected void a(int n, int n2, int n3, int n4, String string) {
        if (this.Pz(n)) {
            this.lwn.v(n3 > 0 ? -0.05f : 0.05f, -0.5f, 0.5f);
        }
    }

    @Override
    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        hyn hyn2 = super.s(n, n2, string);
        if (hyn2 != null) {
            return hyn2;
        }
        hwl hwl2 = new hwl(string);
        if (hwl2.cck >= 100 && hwl2.cck < 100 + this.lEt.size()) {
            SFCharacterSchoolDTO sFCharacterSchoolDTO = this.lEq.list.get(hwl2.cck - 100);
            if (sFCharacterSchoolDTO == null) {
                return null;
            }
            int n3 = lea.enZ().getType(sFCharacterSchoolDTO.name);
            return new iag(n3, n, n2, true);
        }
        if (hwl2.cck >= 200 && hwl2.cck < 200 + this.lEu.size()) {
            hwv hwv2 = this.lEu.get(hwl2.cck - 200);
            if (hwv2 == null) {
                return null;
            }
            return new iag(hwv2.zg(), n - hwl2.cf, n2 - hwl2.cg, true);
        }
        if (hwl2.cck >= 300 && hwl2.cck < 300 + this.lEv.size()) {
            hwv hwv3 = this.lEv.get(hwl2.cck - 300);
            if (hwv3 == null) {
                return null;
            }
            return new iag(hwv3.zg(), n - hwl2.cf, n2 - hwl2.cg, true);
        }
        return null;
    }

    @Override
    protected boolean og(String string) {
        hwv hwv2;
        hwl hwl2 = new hwl(string);
        if (hwl2.cck >= 100 && hwl2.cck < 100 + this.lEt.size() && (hwv2 = this.lEt.get(hwl2.cck - 100)) != null) {
            return hwv2.cCt();
        }
        return false;
    }

    @Override
    protected ifg of(String string) {
        hwl hwl2 = new hwl(string);
        if (hwl2.cck < 100 || hwl2.cck >= 100 + this.lEt.size()) {
            return null;
        }
        ifh ifh2 = new ifh(this.lEt.get(hwl2.cck - 100), hwl2.lir, hwl2.lis);
        return ifh2;
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith(String.valueOf(666)) || string.startsWith(String.valueOf(999));
    }

    @Override
    public boolean b(hzk hzk2, ifg ifg2, String string) {
        if (string == null) {
            return false;
        }
        if (string.startsWith(String.valueOf(666)) || string.startsWith(String.valueOf(999))) {
            ifh ifh2 = (ifh)ifg2;
            hwm hwm2 = ifh2.cQm();
            if (!(hwm2 instanceof hwv)) {
                return false;
            }
            hwv hwv2 = (hwv)hwm2;
            SFGUIElementDTO sFGUIElementDTO = hwv2.cBj();
            if (string.startsWith(String.valueOf(666))) {
                sFGUIElementDTO.id = 666;
                this.lwn.PC(this.lEo.get(hwv2.awK().getType()).intValue());
                int n = cxj.b(this.lwn.cLM(), cxd.l.fRP);
                int n2 = cxj.b(this.lwn.cLN(), cxd.l.fRP);
                this.lEr = new SFGUIElementListDTO();
                this.lEu = lcn.emv();
                this.a("setPrimarySlotData", new Object[]{sFGUIElementDTO, lvm.sXf.bD(hwv2.zg()).exA()});
                this.a("setPrimarySkillsData", new Object[]{this.a(hwv2.awK().getType(), this.lEr, this.lEu, 200, true)});
                if (n2 != -1 && (this.lEp.get(n2) == n || n2 == n)) {
                    this.cMq();
                }
            } else {
                sFGUIElementDTO.id = 999;
                this.lwn.PD(this.lEo.get(hwv2.awK().getType()).intValue());
                int n = cxj.b(this.lwn.cLM(), cxd.l.fRP);
                int n3 = cxj.b(this.lwn.cLN(), cxd.l.fRP);
                this.lEs = new SFGUIElementListDTO();
                this.lEv = lcn.emv();
                this.a("setSecondarySlotData", new Object[]{sFGUIElementDTO, lvm.sXf.bD(hwv2.zg()).exA()});
                this.a("setSecondarySkillsData", new Object[]{this.a(hwv2.awK().getType(), this.lEs, this.lEv, 300, false)});
                if (n != -1 && (this.lEp.get(n) == n3 || n == n3)) {
                    this.cMp();
                }
            }
            this.cMk();
            return true;
        }
        return false;
    }

    private void cMo() {
        this.lEq = new SFCharacterSchoolListDTO();
        this.lEt = lcn.emv();
        this.lEo = lcn.emw();
        this.lEp = lcn.emw();
        int n = -1;
        int n2 = -1;
        Collection<ckf> collection = lea.epx().qR(this.lwn.cLL());
        for (ckf ckf2 : collection) {
            n = cxj.b(ckf2.aQO(), cxd.l.fRP);
            n2 = cxj.b(ckf2.aQP(), cxd.l.fRP);
            this.lEo.put(n, ckf2.aQO());
            this.lEp.put(n, n2);
            hwv hwv2 = new hwv((lhg)lea.enZ().acv(n));
            hwv2.setEnabled(ckf2.isEnabled());
            if (!ckf2.isEnabled()) continue;
            this.lEt.add(hwv2);
        }
        for (int j = 0; j < this.lEt.size(); ++j) {
            this.lEq.list.add(this.a(this.lEt.get(j), 100 + j));
        }
    }

    private void cMp() {
        this.lwn.PC(-1);
        this.a("setPrimarySlotData", new Object[]{this.PF(666), lvq.sZk.bD(new Object[0]).exA()});
        this.a("setPrimarySkillsData", new Object[]{new SFGUIElementListDTO()});
    }

    private void cMq() {
        this.lwn.PD(-1);
        this.a("setSecondarySlotData", new Object[]{this.PF(999), lvq.sZk.bD(new Object[0]).exA()});
        this.a("setSecondarySkillsData", new Object[]{new SFGUIElementListDTO()});
    }

    private void cLu() {
        this.cMp();
        this.cMq();
        this.a("setLabelData", new Object[]{lvq.sZc.bD(this.lwn.cLK()).exA(), lvq.sZd.bD(new Object[0]).exA(), lvq.sZe.bD(new Object[0]).exA(), lvq.sZf.bD(new Object[0]).exA()});
        this.a("setContentData", new Object[]{this.lEq});
    }

    private void cMk() {
        this.a("setNextButtonVisible", new Object[]{this.lwn.cLM() != -1 && this.lwn.cLN() != -1});
    }

    private SFGUIElementListDTO a(int n, SFGUIElementListDTO sFGUIElementListDTO, List<hwv> list, int n2, boolean bl) {
        ArrayList<ler> arrayList = lcn.emv();
        ler ler2 = lea.eob().acv(n);
        for (int j = 0; j < 5; ++j) {
            ler2 = lea.eob().h(ler2);
            if (ler2 == null || lea.epx().qV(ler2.getType()) && !bl) continue;
            arrayList.add(ler2);
        }
        for (ler ler3 : arrayList) {
            list.add(new hwv((ldy)ler3));
        }
        for (int j = 0; j < list.size(); ++j) {
            sFGUIElementListDTO.list.add(this.b(list.get(j), n2 + j));
        }
        return sFGUIElementListDTO;
    }

    private SFCharacterSchoolDTO a(hwv hwv2, int n) {
        SFCharacterSchoolDTO sFCharacterSchoolDTO = new SFCharacterSchoolDTO();
        sFCharacterSchoolDTO.element = this.b(hwv2, n);
        sFCharacterSchoolDTO.name = hwv2.getName();
        sFCharacterSchoolDTO.description = hwv2.getDescription();
        return sFCharacterSchoolDTO;
    }

    private SFGUIElementDTO b(hwv hwv2, int n) {
        SFGUIElementDTO sFGUIElementDTO = hwv2.cBj();
        sFGUIElementDTO.id = n;
        return sFGUIElementDTO;
    }

    private SFGUIElementDTO PF(int n) {
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        sFGUIElementDTO.id = n;
        return sFGUIElementDTO;
    }

    @Override
    public iay.a cLv() {
        return iay.a.lDw;
    }

    @Override
    protected void cEk() {
        if (this.cEU()) {
            this.f(lvm.sXh.bD(this.lwn.cLA()).exA() + " - " + lvm.sXc.bD(this.lwn.cLL()).exA(), lvq.sYA.bD(new Object[0]).exA(), lvq.sYI.bD(new Object[0]).exA());
            this.cMo();
            this.cLu();
        }
    }
}

