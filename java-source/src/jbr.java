/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class jbr
extends hzk
implements hvx,
hwb {
    private static final int mPo = -999;
    private float bWF;
    private float bWG;
    private float aGr;
    private float bWk;
    private float bWs;
    private float bWt;
    private final int mPp = 19;
    private final int mPq = 0;
    private final int mPr = 1;
    private Map<Integer, hwt> mOu = lcn.emw();
    private List<hvz> mOt = null;
    private String lqa = "";
    private int ija = 0;
    private boolean mPs = false;
    private dmi gIH = null;
    iad lqS = null;
    int lqB = -1;

    public jbr() {
        super("PlayerStats", "playerstats.swf");
        this.OQ(jnz.nGe | jnz.nGi | jnz.nGf | jnz.nGy);
        this.a(hyb.lmC);
    }

    public List<hvz> gh() {
        return this.mOt;
    }

    protected void cBa() {
        Object object;
        super.cBa();
        if (this.mOt != null) {
            object = lcn.emv();
            this.a(this.mOt, this.mOt, (List<hvz>)object);
        }
        if (!lcw.aQH()) {
            ckd ckd2;
            object = hso.cxK().cxP().cyZ().ki();
            if (object != null) {
                this.a("setRoleText", new Object[]{lvm.sXc.bD(((cjx)object).getIndex()).exA()});
            }
            if ((ckd2 = hso.cxK().cxP().cyZ().kj()) != null) {
                this.rU(ckd2.getName());
            }
            if (this.lqa.length() > 0) {
                this.rU(this.lqa);
            }
        } else {
            this.a("setRoleText", new Object[]{""});
        }
    }

    protected void cEk() {
        cjx cjx2;
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null && !lcw.aQH() && (cjx2 = hso.cxK().cxP().cyZ().ki()) != null) {
            this.a("setRoleText", new Object[]{lvm.sXc.bD(cjx2.getIndex()).exA()});
        }
    }

    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hvx)this);
        hso.cxK().cxP().cyZ().cAk().a(this);
    }

    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hvx)this);
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null && hso.cxK().cxP().cyZ().cAk() != null) {
            hso.cxK().cxP().cyZ().cAk().b(this);
        }
    }

    private void r(ej ej2) {
        switch (ej2.getType()) {
            case 11552: {
                if (lcw.aQH()) {
                    return;
                }
                ff ff2 = (ff)ej2;
                String string = ff2.getStringValue();
                cjx cjx2 = lea.epx().hu(string);
                if (cjx2 == null) break;
                this.a("setRoleText", new Object[]{lvm.sXc.bD(cjx2.getIndex()).exA()});
                break;
            }
            case 11536: {
                ff ff3 = (ff)ej2;
                this.lqa = ff3.getStringValue();
                this.rU(this.lqa);
                break;
            }
            case 13536: {
                if (this.mOu.isEmpty()) break;
                for (hwt hwt2 : this.mOu.values()) {
                    this.a("setModifierStacks", new Object[]{hwt2.getID(), hwt2.cCp()});
                }
                break;
            }
            case 1680: {
                if (this.mOu.isEmpty()) break;
                for (hwt hwt3 : this.mOu.values()) {
                    this.a("setModifierStacks", new Object[]{hwt3.getID(), hwt3.but()});
                }
                break;
            }
        }
    }

    public void rU(String string) {
        if (lcw.aQH()) {
            return;
        }
        lfs<Integer, Integer> lfs2 = lea.epx().hw(string);
        if (lfs2 != null) {
            int n = cxj.b(lfs2.getFirst(), cxd.l.fRP);
            int n2 = cxj.b(lfs2.eqz(), cxd.l.fRP);
            lhg lhg2 = (lhg)lea.enZ().acv(n);
            lhg lhg3 = (lhg)lea.enZ().acv(n2);
            this.a("setSchoolIcons", new Object[]{"texture/dds/" + lhg2.atw().Name, "texture/dds/" + lhg3.atw().Name});
        }
    }

    @Override
    public void q(ej ej2) {
        this.r(ej2);
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void m(alu alu2) {
        if (this.mOu.isEmpty()) {
            return;
        }
        for (hwt hwt2 : this.mOu.values()) {
            this.a("setModifierStacks", new Object[]{hwt2.getID(), hwt2.but()});
        }
    }

    @Override
    public void n(alu alu2) {
    }

    @Override
    public void a(List<hvz> list, List<hvz> list2, List<hvz> list3) {
        hwt hwt2;
        if (this.ija > 1) {
            return;
        }
        for (hvz hvz2 : list2) {
            hwt2 = new hwt(hvz2);
            SFGUIElementDTO sFGUIElementDTO = hwt2.cBj();
            if (this.cDj()) {
                this.a("addModifier", new Object[]{sFGUIElementDTO.id, sFGUIElementDTO.iconName, hwt2.cCq() ? 0.42 : 1.0, hwt2.cCp(), !hvz2.cAM()});
            }
            this.mOu.put(hvz2.getId(), hwt2);
        }
        for (hvz hvz2 : list3) {
            if (hvz2.getId() == this.lqB && this.lqS != null) {
                this.lqS.setVisible(false);
                this.lqB = -1;
            }
            hwt2 = this.mOu.remove(hvz2.getId());
            if (!this.cDj()) continue;
            this.a("removeModifier", new Object[]{hvz2.getId()});
        }
        this.mOt = list;
        this.bB(list);
    }

    protected void bB(List<hvz> list) {
        if (list == null) {
            return;
        }
        int n = this.mPs ? 1 : 0;
        int n2 = 0;
        for (hvz hvz2 : list) {
            this.a("setModifierSlot", new Object[]{hvz2.getId(), hvz2.cAM() ? 1 : 0, hvz2.cAM() ? n2++ : n++});
        }
    }

    @Override
    public void a(hvz hvz2, List<Integer> list, List<Integer> list2) {
        this.lqS.a(hvz2, list, list2);
    }

    @Override
    public int cAQ() {
        return this.lqB;
    }

    @Override
    public void a(List<hvz> list, float[] fArray) {
        if (this.ija > 0) {
            return;
        }
        int n = 0;
        for (hvz hvz2 : list) {
            if (fArray[n] >= 0.0f && (fArray[n] - hvz2.cAP() > 0.05f || fArray[n] - hvz2.cAP() < 0.0f)) {
                this.a("setModifierProgress", new Object[]{hvz2.getId(), Float.valueOf(fArray[n])});
                hvz2.ke(fArray[n]);
            }
            ++n;
        }
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        this.lqB = hwl2.cck;
        if (this.lqB == -999) {
            this.lqS = new iad(n, n2 + 10);
            this.lqS.a(this.gIH);
            return this.lqS;
        }
        if (this.mOt != null) {
            for (hvz hvz2 : this.mOt) {
                if (hvz2.getId() != this.lqB) continue;
                this.lqS = new iad(n, n2 + 10);
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

    @Override
    public void a(hvz hvz2, float[] fArray) {
        for (int i = 0; i < fArray.length; ++i) {
            if (this.lqS == null) continue;
            this.lqS.a(hvz2, fArray);
        }
    }

    public int bHc() {
        return this.ija;
    }

    public void Eh(int n) {
        this.ija = n;
    }

    public void b(dmi dmi2) {
        this.gIH = dmi2;
        if (dmi2 == null || !dmi2.bpZ()) {
            if (this.mPs) {
                this.a("removeModifier", new Object[]{-999});
                this.mPs = false;
                this.bB(this.mOt);
            }
        } else if (!this.mPs) {
            this.a("addModifier", new Object[]{-999, "texture/dds/gui/effectsnew/territorial_bonuses.png", 0.42, 0, true});
            this.mPs = true;
            this.bB(this.mOt);
            this.a("setModifierSlot", new Object[]{-999, 0, 0});
        }
    }

    public void rV(String string) {
        this.rW(string);
    }

    private void rW(String string) {
        this.a("setRoleText", new Object[]{string});
    }
}

