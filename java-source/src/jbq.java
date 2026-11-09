/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvy
 *  hyn
 *  hzo
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;
import spenefett.hid.gui.serialization.dto.SFStringsPlayerRoleManagementDTO;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class jbq
extends hzk
implements bto,
hvx,
hyy.c,
hzq {
    private static final boolean mOX = true;
    protected List<cjx> mOY = null;
    protected float bWP;
    protected float bWQ;
    protected float lhI;
    protected float bWR;
    protected float[] mOZ = new float[]{0.0f, 0.0f, 0.0f};
    protected a mPa = new a(this, null);
    protected a mPb = new a(this, null);
    protected int[] mPc = null;
    protected Map<Integer, Integer> mPd = lcn.emw();
    protected int mPe;
    private ew mPf = null;
    protected double jgV = -1.0;
    protected hwv[][] mPg = null;
    private int mPh = -1;
    int mPi = -1;

    public jbq() {
        super("playerrolemanagement", "PlayerRoleManagement.swf");
        this.OQ(jnz.nGr);
        this.a(hyb.lmC);
        this.mOY = lcn.emv();
        this.mOY.addAll(lea.epx().aQE());
        for (int i = 0; i < this.mOY.size(); ++i) {
            Collection<ckf> collection = lea.epx().qR(i);
            int n = 0;
            for (ckf ckf2 : collection) {
                int n2 = cxj.b(ckf2.aQO(), cxd.l.fRP);
                this.mPd.put(n2, n++);
            }
        }
        this.mPc = new int[]{14172945, 5935849, 10861106, 11339888};
        this.mPg = new hwv[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}};
    }

    protected void cEk() {
        super.cEk();
        this.cQB();
    }

    private void cQB() {
        String string = String.format("#%x", this.mPc[this.mPb.mPl]);
        SFStringsPlayerRoleManagementDTO sFStringsPlayerRoleManagementDTO = new SFStringsPlayerRoleManagementDTO();
        sFStringsPlayerRoleManagementDTO.ActivateChanges = lvp.sYi.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Pools = lvp.sYb.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Roles = lvp.sYc.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Schools = lvp.sYd.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Boosters = lvp.sYe.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Purchase = lvp.sYf.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.CurrentRole = "<font color=\"" + string + "\">" + lvm.sXc.bD(this.mOY.get(this.mPb.mPl).getIndex()).exA() + "</font>";
        sFStringsPlayerRoleManagementDTO.Health = lvm.sWX.bD(352).exA();
        sFStringsPlayerRoleManagementDTO.Stamina = lvm.sWX.bD(400).exA();
        sFStringsPlayerRoleManagementDTO.Mana = lvm.sWX.bD(384).exA();
        sFStringsPlayerRoleManagementDTO.Strength = lvp.sYp.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Dexterity = lvp.sYq.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Intelligence = lvp.sYr.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.Wisdom = lvp.sYs.bD(new Object[0]).exA();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        sFStringsPlayerRoleManagementDTO.UpgradeCostStrength = this.G(n, string);
        sFStringsPlayerRoleManagementDTO.UpgradeCostDexterity = this.G(n2, string);
        sFStringsPlayerRoleManagementDTO.UpgradeCostWisdom = this.G(n4, string);
        sFStringsPlayerRoleManagementDTO.UpgradeCostIntelligence = this.G(n3, string);
        sFStringsPlayerRoleManagementDTO.ActivateToBoost = lvp.sYk.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.ColumnActivateAttribute = lvp.sYl.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.ColumnUpgrade = lvp.sYm.bD(new Object[0]).exA();
        sFStringsPlayerRoleManagementDTO.ColumnCost = lvp.sYn.bD(new Object[0]).exA();
        this.a("updateStrings", new Object[]{sFStringsPlayerRoleManagementDTO});
        this.a("setRoleColor", new Object[]{this.mPc[this.mPb.mPl]});
    }

    private String G(int n, String string) {
        return "<font color=\"" + string + "\">" + String.valueOf(n) + "</font>";
    }

    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hvx)this);
        hzo hzo2 = (hzo)jbq.cxO();
        if (!lea.epx().aQH()) {
            hzo2.cHx().a(hyy.a.lrn, this);
        }
    }

    public void cleanUp() {
        hzo hzo2;
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hvx)this);
        }
        if (jbq.cxO() instanceof hzo && (hzo2 = (hzo)jbq.cxO()).cHx() != null) {
            hzo2.cHx().b(hyy.a.lrn);
        }
    }

    protected void kr(float f2) {
        this.a("setHeight", new Object[]{Float.valueOf(f2)});
    }

    protected void cBa() {
        super.cBa();
        this.mPb.a(this.mPa);
        this.cQM();
        this.dwO();
    }

    private void cQM() {
        int n;
        this.cQB();
        lox[] loxArray = new lox[]{lvp.sYp, lvp.sYq, lvp.sYr, lvp.sYs};
        for (int i = 0; i < 4; ++i) {
            n = ckk.aV(i, this.mPe);
            Object object = loxArray[i].bD(new Object[0]).exA();
            if (n > 0) {
                object = (String)object + " " + n;
                ckk ckk2 = lea.epw().aW(i, n - 1);
                List<String> list = jeo.a(ckk2);
                object = (String)object + "<p align = \"left\"><FONT size = \"9\">";
                for (String string : list) {
                    object = (String)object + "\n" + string.toUpperCase();
                }
                object = (String)object + "<</FONT></p>";
            }
            boolean bl = this.mPb.mPm == i;
            boolean bl2 = this.mPa.mPm == i;
            this.a("setBoosterSelectionData", new Object[]{i, n > 0, bl, bl2, object});
        }
        Collection<ckf> collection = lea.epx().qR(this.mPb.mPl);
        n = 0;
        for (ckf ckf2 : collection) {
            Iterator<String> iterator;
            hwv hwv2 = this.mPg[this.mPb.mPl][n];
            if (hwv2 == null) {
                iterator = cxj.yq(ckf2.aQO());
                int n2 = ((dcw)((Object)iterator)).a(cxd.l.fRP);
                lhg lhg2 = (lhg)lea.enZ().acv(n2);
                this.mPg[this.mPb.mPl][n] = hwv2 = new hwv(lhg2);
            }
            iterator = hwv2.cBj();
            ((SFGUIElementDTO)((Object)iterator)).id = n;
            if (!ckf2.isEnabled()) {
                ((SFGUIElementDTO)((Object)iterator)).state = 2;
            }
            this.a("setSchool", new Object[]{n++, iterator});
        }
        for (int i = 0; i < 2; ++i) {
            int n3 = -1;
            if (this.mPb.mPn[i] != null) {
                n3 = this.mPg[this.mPb.mPl][this.mPb.mPn[i]].awK().getType();
            }
            this.fk(i, n3);
        }
        this.dwN();
        this.dwM();
    }

    @llk
    protected void getSpecializations(int n) {
        cjx cjx2 = lea.epx().qU(n);
        if (cjx2 != null) {
            Map<Integer, ckd> map = cjx2.aQx();
            for (Map.Entry<Integer, ckd> entry : map.entrySet()) {
                String string = entry.getValue().getDisplayName();
                int n2 = entry.getValue().getIndex();
                this.a("addSpecialization", new Object[]{n2, string});
            }
            this.a("updateSpecializationDropdown", new Object[0]);
        }
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 30980) {
            this.a((ggm)dxq2);
        } else if (dxq2.bEz() == 30978) {
            this.a((ggq)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    public void a(ggq ggq2) {
        loz loz2;
        switch (ggq2.bUS()) {
            case 3: {
                loz2 = lvp.scW.bD(new Object[0]);
                this.jgV = ggq2.bUT();
                break;
            }
            case 0: {
                loz2 = lvp.sYt.bD(new Object[0]);
                this.a("setCanActivateChanges", new Object[]{true});
                break;
            }
            case 1: {
                loz2 = lvp.scU.bD(new Object[0]);
                this.a("setCanActivateChanges", new Object[]{true});
                break;
            }
            case 2: {
                loz2 = lvp.scV.bD(new Object[0]);
                this.a("setCanActivateChanges", new Object[]{true});
                break;
            }
            case 4: {
                loz2 = lvp.scX.bD(new Object[0]);
                this.a("setCanActivateChanges", new Object[]{true});
                break;
            }
            case 5: {
                loz2 = lvp.sYu.bD(new Object[0]);
                this.a("setCanActivateChanges", new Object[]{true});
                break;
            }
            case 6: {
                loz2 = lvp.scZ.bD(new Object[0]);
                this.a("setCanActivateChanges", new Object[]{true});
                break;
            }
            default: {
                loz2 = lvp.scV.bD(new Object[0]);
                this.a("setCanActivateChanges", new Object[]{true});
            }
        }
        jbq.cxP().v(loz2);
    }

    public void a(ggm ggm2) {
    }

    @llk
    protected void activateChanges(String string) {
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            int n2 = ckk.aV(i, this.mPe);
            if (n2 <= 0) continue;
            ++n;
        }
        if (this.jgV != -1.0) {
            if (lcw.emW() && lcw.emX()) {
                hso.cxK().cxP().czv().a(jgl.a.nak, -1, -1, true);
            }
            return;
        }
        if (this.mPb.mPm == this.mPa.mPm && this.mPb.mPl != this.mPa.mPl && (this.mPb.mPm == -1 && n > 0 || this.mPb.mPm != -1 && n > 1)) {
            hzs hzs2 = jbq.cyJ().cHy();
            jbq jbq2 = this;
            hzs2.a(new hzq(this, jbq2){
                final /* synthetic */ jbq mPj;
                final /* synthetic */ jbq mPk;
                {
                    this.mPk = jbq2;
                    this.mPj = jbq3;
                }

                public void O(float f2, float f3) {
                    this.mPj.O(f2, f3);
                }

                public void oH(boolean bl) {
                    if (bl) {
                        this.mPj.dwL();
                    }
                    hyn.cyJ().cHy().setVisible(false);
                }
            });
            jnx jnx2 = new jnx(string);
            hzs2.a(lyi.tER.bD(new Object[0]).exA(), (int)(this.cEE() + jnx2.x) + 1, (int)(this.cEF() + jnx2.y + 1.0f), (int)jnx2.width, (int)jnx2.height);
        } else {
            this.dwL();
        }
    }

    public void dwL() {
        ldv ldv2 = hso.cxK().bAn().Tr;
        ggp ggp2 = (ggp)this.MessageDelegator.h(30977, this.getGUID(), ldv2);
        ggp2.rc(this.mPb.mPl);
        cjx cjx2 = lea.epx().qU(this.mPb.mPl);
        ArrayList<ckf> arrayList = lcn.emv();
        arrayList.addAll(lea.epx().qR(this.mPb.mPl));
        int n = ((ckf)arrayList.get(this.mPb.mPn[0])).aQO();
        int n2 = ((ckf)arrayList.get(this.mPb.mPn[1])).aQO();
        int n3 = cjx2.aT(n, n2);
        ggp2.Jr(n3);
        if (this.mPb.mPm != -1) {
            ggp2.Jn(this.mPb.mPm);
            ggp2.Jo(ckk.aV(this.mPb.mPm, this.mPe) - 1);
        }
        this.MessageDelegator.F(ggp2);
        if (!lcw.emW() || !lcw.emX()) {
            this.a("setCanActivateChanges", new Object[]{false});
        }
    }

    public void kl() {
        this.jgV = this.MessageDelegator.arc().rgz - (double)lea.epx().aQG();
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        if (ej2.getType() == 11568) {
            ff ff2 = (ff)ej2;
            String string = ff2.getStringValue();
            ckk ckk2 = lea.epw().hz(string);
            if (ckk2 == null) {
                this.mPa.mPm = -1;
                this.mPb.mPm = -1;
            } else {
                this.mPa.mPm = ckk2.aQS().ordinal();
                this.mPb.mPm = ckk2.aQS().ordinal();
            }
            this.cQM();
        } else if (ej2.getType() == 11888) {
            this.mPf = (ew)ej2;
            this.mPe = this.mPf.fQ();
            this.dwO();
            this.cQM();
        } else if (ej2.getType() == 11552) {
            ff ff3 = (ff)ej2;
            String string = ff3.getStringValue();
            cjx cjx2 = lea.epx().hu(string);
            this.mPa.mPl = cjx2.getIndex();
            this.mPb.mPl = cjx2.getIndex();
            this.cQM();
        } else if (ej2.getType() == 11872) {
            this.dwO();
        } else if (ej2.getType() == 11536) {
            ff ff4 = (ff)ej2;
            String string = ff4.getStringValue();
            lfs<Integer, Integer> lfs2 = lea.epx().hw(string);
            if (lfs2 != null) {
                this.mPa.mPn[0] = this.mPd.get(cxj.b(lfs2.getFirst(), cxd.l.fRP));
                this.mPa.mPn[1] = this.mPd.get(cxj.b(lfs2.eqz(), cxd.l.fRP));
                this.mPb.mPn[0] = this.mPd.get(cxj.b(lfs2.getFirst(), cxd.l.fRP));
                this.mPb.mPn[1] = this.mPd.get(cxj.b(lfs2.eqz(), cxd.l.fRP));
            }
            this.cQM();
        } else if (ej2.getType() == 208) {
            et et2 = (et)ej2;
            this.bWP = et2.fN();
            this.dwN();
        } else if (ej2.getType() == 160) {
            et et3 = (et)ej2;
            this.bWQ = et3.fN();
            this.dwN();
        } else if (ej2.getType() == 240) {
            et et4 = (et)ej2;
            this.lhI = et4.fN();
            this.dwN();
        } else if (ej2.getType() == 176) {
            et et5 = (et)ej2;
            this.bWR = et5.fN();
            this.dwN();
        } else if (ej2.getType() == 354) {
            et et6 = (et)ej2;
            this.mOZ[0] = et6.fN();
            this.dwN();
        } else if (ej2.getType() == 402) {
            et et7 = (et)ej2;
            this.mOZ[1] = et7.fN();
            this.dwN();
        } else if (ej2.getType() == 386) {
            et et8 = (et)ej2;
            this.mOZ[2] = et8.fN();
            this.dwN();
        }
    }

    @llk
    public void changeRole(int n) {
        this.mPb.mPl += n;
        if (this.mPb.mPl < 0) {
            this.mPb.mPl = this.mOY.size() - 1;
        } else if (this.mPb.mPl >= this.mOY.size()) {
            this.mPb.mPl = 0;
        }
        if (!this.mOY.get(this.mPb.mPl).isEnabled()) {
            this.changeRole(n);
            return;
        }
        if (this.mPb.mPl == this.mPa.mPl) {
            this.mPb.mPn = (Integer[])this.mPa.mPn.clone();
        } else {
            this.mPb.mPn[1] = null;
            this.mPb.mPn[0] = null;
        }
        this.cQM();
    }

    @llk
    public void setSelectedBooster(int n) {
        this.mPb.mPm = n;
        this.dwN();
        this.dwM();
    }

    @llk
    public void reset() {
        this.mPb.a(this.mPa);
        this.cQM();
    }

    @Override
    protected boolean og(String string) {
        hwl hwl2 = new hwl(string);
        if (hwl2.cck == -1) {
            return false;
        }
        if (hwl2.cck >= 1000) {
            return false;
        }
        if (hwl2.cck >= 2) {
            // empty if block
        }
        return true;
    }

    @Override
    protected ifg of(String string) {
        hwl hwl2 = new hwl(string);
        if (hwl2.cck < 0 || hwl2.cck > 3) {
            return null;
        }
        ifh ifh2 = new ifh(this.mPg[this.mPb.mPl][hwl2.cck], hwl2.lir, hwl2.lis);
        return ifh2;
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("primary") || string.startsWith("secondary");
    }

    @Override
    public boolean b(hzk hzk2, ifg ifg2, String string) {
        if (hzk2 != this) {
            return false;
        }
        int n = -1;
        if (string.startsWith("primary")) {
            n = 0;
        } else if (string.startsWith("secondary")) {
            n = 1;
        } else {
            return false;
        }
        ifh ifh2 = (ifh)ifg2;
        hwm hwm2 = ifh2.cQm();
        if (!(hwm2 instanceof hwv)) {
            return false;
        }
        hwv hwv2 = (hwv)hwm2;
        this.fk(n, hwv2.awK().getType());
        this.dwM();
        return true;
    }

    protected void fk(int n, int n2) {
        if (n2 == -1) {
            this.a("setSelectedSchool", new Object[]{n, null});
            return;
        }
        Integer n3 = this.mPd.get(n2);
        if (n3 == null) {
            return;
        }
        int n4 = n3;
        this.mPb.mPn[n] = n4;
        hwv hwv2 = this.mPg[this.mPb.mPl][n4];
        SFGUIElementDTO sFGUIElementDTO = hwv2.cBj();
        sFGUIElementDTO.id = n4;
        this.a("setSelectedSchool", new Object[]{n, sFGUIElementDTO});
        Integer n5 = null;
        Collection<ckf> collection = lea.epx().qR(this.mPb.mPl);
        for (ckf object : collection) {
            if (cxj.b(object.aQO(), cxd.l.fRP) != n2) continue;
            n5 = this.mPd.get(cxj.b(object.aQP(), cxd.l.fRP));
        }
        for (ckf ckf2 : collection) {
            if (ckf2.isEnabled() || this.mPd.get(cxj.b(ckf2.aQO(), cxd.l.fRP)) != n5) continue;
            n5 = null;
            break;
        }
        if (this.mPb.mPn[1 - n] == this.mPb.mPn[n] || n5 != null && this.mPb.mPn[1 - n] == n5) {
            this.mPb.mPn[1 - n] = null;
            this.a("setSelectedSchool", new Object[]{1 - n, null});
        }
        if (n5 != null) {
            hwv hwv3 = this.mPg[this.mPb.mPl][n5];
            SFGUIElementDTO sFGUIElementDTO2 = hwv3.cBj();
            sFGUIElementDTO2.state = 1;
            sFGUIElementDTO2.id = n5;
            this.a("setSchool", new Object[]{n5, sFGUIElementDTO2});
        }
        this.a("setSchool", new Object[]{n4, sFGUIElementDTO});
    }

    protected void dwM() {
        boolean bl = false;
        if (!this.mPb.b(this.mPa)) {
            bl = true;
        }
        if (this.mPb.mPn[0] == null || this.mPb.mPn[1] == null) {
            bl = false;
        }
        if (!(this.jgV == -1.0 || lcw.bcB == 2 && lcw.emX())) {
            bl = false;
        }
        this.a("setCanActivateChanges", new Object[]{bl});
    }

    protected void dwN() {
        int n;
        cjx cjx2 = this.mOY.get(this.mPb.mPl);
        String string = cjx2.getName();
        int[] nArray = new int[]{352, 400, 384};
        String[] stringArray = new String[]{"#993333", "#cc9933", "#006699"};
        int n2 = -1;
        if (this.mPb.mPm != -1) {
            n = ckk.aV(this.mPb.mPm, this.mPe);
            ckk ckk2 = lea.epw().aW(this.mPb.mPm, n - 1);
            if (ckk2 != null) {
                n2 = ckk2.getID();
            }
        }
        for (n = 0; n < 3; ++n) {
            int n3 = nArray[n];
            float f2 = cer.p(n3, string);
            float f3 = cer.pv(n3);
            this.a("setPoolMaxValue", new Object[]{n, 0, Float.valueOf(f3)});
            this.a("setPoolValue", new Object[]{n, 0, Float.valueOf(f2)});
            float f4 = this.bWP;
            float f5 = this.bWQ;
            float f6 = this.lhI;
            float f7 = this.bWR;
            if (this.mPa.mPm == 0) {
                f4 -= (float)(ckk.aV(0, this.mPe) * 10);
            } else if (this.mPa.mPm == 1) {
                f5 -= (float)(ckk.aV(1, this.mPe) * 10);
            } else if (this.mPa.mPm == 2) {
                f7 -= (float)(ckk.aV(2, this.mPe) * 10);
            } else if (this.mPa.mPm == 3) {
                f6 -= (float)(ckk.aV(3, this.mPe) * 10);
            }
            float f8 = cer.a(n3, f4, f5, f6, f7);
            float f9 = cer.pw(n3);
            this.a("setPoolMaxValue", new Object[]{n, 1, Float.valueOf(f9)});
            this.a("setPoolValue", new Object[]{n, 1, Float.valueOf(f8)});
            float f10 = cer.aF(n3, n2);
            float f11 = cer.px(n3);
            this.a("setPoolMaxValue", new Object[]{n, 2, Float.valueOf(f11)});
            this.a("setPoolValue", new Object[]{n, 2, Float.valueOf(f10)});
            float f12 = f2 + f8 + f10;
            float f13 = f12 - this.mOZ[n];
            String string2 = "" + Math.round(f13);
            if (f13 > 0.0f) {
                string2 = "+" + string2;
            }
            String string3 = "<font color=\"" + stringArray[n] + "\">" + (int)f12;
            if ((int)f13 != 0) {
                string3 = string3 + "<font size = \"11\">(" + string2 + ")</font>";
            }
            string3 = string3 + "</font>";
            this.a("setPoolTextValue", new Object[]{n, string3});
        }
    }

    @Override
    public void b(hyy.b b2, int n) {
        hzo hzo2 = (hzo)jbq.cxO();
        if (b2.equals((Object)hyy.b.lrW)) {
            hzo2.cHw().a(hyc.lmO, false);
        } else if (b2.equals((Object)hyy.b.lrX)) {
            this.reset();
        }
    }

    public hyn s(int n, int n2, String string) {
        hwm hwm2;
        if (string == null) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        if (hwl2.cck < 0) {
            return null;
        }
        if (hwl2.cck == 500) {
            return null;
        }
        if (hwl2.cck >= 1000) {
            int n3 = hwl2.cck - 1000;
            ckk ckk2 = lea.epw().aW(n3 / 4, n3 % 4);
            SFTooltipBaseDTO sFTooltipBaseDTO = new SFTooltipBaseDTO();
            sFTooltipBaseDTO.header = false;
            sFTooltipBaseDTO.table = true;
            sFTooltipBaseDTO.autoSizeColumns = true;
            sFTooltipBaseDTO.width = 300;
            sFTooltipBaseDTO.columnCount = 1;
            sFTooltipBaseDTO.tableCellsHTMLText = lcn.emv();
            List<String> list = jeo.a(ckk2);
            sFTooltipBaseDTO.rowCount = list.size();
            for (String string2 : list) {
                sFTooltipBaseDTO.tableCellsHTMLText.add("<p align = \"left\"><FONT size = \"12\">" + string2.toUpperCase() + "<</FONT></p>");
            }
            Object object = new iae(sFTooltipBaseDTO, n, n2 + 55);
            return object;
        }
        ifh ifh2 = new ifh(this.mPg[this.mPb.mPl][hwl2.cck], hwl2.lir, hwl2.lis);
        if (ifh2 != null && (hwm2 = ifh2.cQm()) != null && hwm2 instanceof hwv) {
            hwv hwv2 = (hwv)hwm2;
            return new iag(hwv2.zg(), n, n2, true);
        }
        return null;
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    @llk
    public void boosterButtonClicked(int n, String string) {
        if (this.mPh == n) {
            return;
        }
        this.mPh = n;
        hzs hzs2 = jbq.cyJ().cHy();
        hzs2.a(this);
        jnx jnx2 = new jnx(string);
        hzs2.a(lyi.tEQ.bD(new Object[0]).exA(), (int)(this.cEE() + jnx2.x) + 3, (int)(this.cEF() + jnx2.y), (int)jnx2.width, (int)jnx2.height);
    }

    protected void dwO() {
        if (!this.cDj()) {
            return;
        }
        hvy hvy2 = hso.cxK().cxP().cyZ();
        int n = hvy2.akj();
        for (int i = 0; i < 4; ++i) {
            int n2;
            int n3 = ckk.aV(i, this.mPe);
            int n4 = 0;
            for (n2 = 0; n2 < 4; n2 += 1) {
                if (i == n2 || ckk.aV(n2, this.mPe) <= n3) continue;
                ++n4;
            }
            n2 = 0;
            for (int k = 0; k < 4; ++k) {
                boolean bl = true;
                int n5 = k + 1;
                if (k + 1 > n3) {
                    n5 = (int)lea.epw().aX(k, n4);
                    bl = false;
                }
                if (k == n3 && n5 <= n) {
                    n2 = 1;
                }
                this.a("setBoosterData", new Object[]{i * 4 + k, String.valueOf(n5), n2 != 0, bl});
                n2 = 0;
            }
        }
    }

    @Override
    public void oH(boolean bl) {
        if (bl) {
            ldv ldv2 = hso.cxK().bAn().Tr;
            ggl ggl2 = (ggl)this.MessageDelegator.h(30979, this.getGUID(), ldv2);
            ggl2.Jn(this.mPh / 4);
            ggl2.Jo(this.mPh % 4);
            ggl2.lZ(true);
            this.MessageDelegator.E(ggl2);
            hzs hzs2 = jbq.cyJ().cHy();
            hzs2.setVisible(false);
        } else {
            this.mPh = -1;
        }
    }

    @Override
    public void O(float f2, float f3) {
        hzs hzs2 = jbq.cyJ().cHy();
        hzs2.setVisible(true);
        hzs2.cqF();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.jgV != -1.0) {
            int n;
            double d2 = lea.epx().aQG();
            int n2 = (int)(d2 - (ldz2.rgz - this.jgV));
            if (n2 < 0) {
                this.jgV = -1.0;
                this.a("updateCoolDown", new Object[]{""});
                this.dwM();
            } else if ((n = ++n2 % 60) != this.mPi) {
                String string;
                String string2 = "" + n2 / 60;
                if (string2.length() == 1) {
                    string2 = "0" + string2;
                }
                if ((string = "" + n).length() == 1) {
                    string = "0" + string;
                }
                String string3 = lvp.sYj.bD(new Object[0]).exA() + "" + string2 + ":" + string;
                this.a("updateCoolDown", new Object[]{string3});
                this.mPi = n;
            }
        }
    }
}

