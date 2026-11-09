/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  ep
 *  hvy
 *  hyn
 *  iak
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import spenefett.hid.gui.serialization.dto.SFContextMenuOptionDTO;
import spenefett.hid.gui.serialization.dto.SFContextMenuOptionListDTO;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;
import spenefett.hid.gui.serialization.dto.SFTargetInformationDTO;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class hyw
extends hzk
implements bto,
hwb {
    private static boolean lqx = false;
    private static boolean lqy = false;
    private hzu lqz;
    protected float eTM = 0.0f;
    protected int lqA = -1;
    protected hwc lgs = null;
    protected int lqB = -1;
    private String lqC = null;
    private ldv dtj = null;
    private boolean lqD = false;
    private float lqE = 0.0f;
    private SFTargetInformationDTO lqF = null;
    private lie lqG = null;
    private float lqH = 1.0f;
    private boolean lqI = false;
    private boolean lqJ = false;
    private boolean gpD = true;
    private List<Integer> lqK = lcn.emv();
    private lie lqL = null;
    private boolean lqM = false;
    private int lqN = 0;
    private ffk lqO = null;
    private double lqP = 0.0;
    private int lqQ = 0;
    private int lqR = 0;
    iad lqS = null;
    int[] lqT = new int[]{13152, cug.fue, -1, 13168, cug.fuf, -1, 12912, cug.ftZ, -1, 13136, cug.fug, -1};
    float lqU = 0.0f;
    float lqV = -1.0f;
    private hyi lqW;
    private boolean lqX = true;

    public static boolean cGt() {
        return lqx;
    }

    public static void pj(boolean bl) {
        lqx = bl;
    }

    public static boolean cGu() {
        return lqy;
    }

    public static void pk(boolean bl) {
        lqy = bl;
    }

    public hyw() {
        super("HUD", "hud.swf");
        this.OQ(jnz.nGe | jnz.nGl | jnz.nGi);
        this.a(hyb.lmC);
        this.lqz = hyw.cxP().lee;
    }

    public void initialize() {
        super.initialize();
        this.lgs = new hwc();
        this.lgs.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.lgs);
        this.lgs.a(this);
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.lgs != null) {
            this.MessageDelegator.hd(this.lgs.getGUID());
        }
    }

    protected void cBa() {
        super.cBa();
        this.a(hya.lmt, false);
        this.cGz();
        this.OT(0);
        this.OU(0);
        for (int j = 0; j < this.lqT.length / 3; ++j) {
            this.lqT[j * 3 + 2] = -1;
        }
        this.a("setTargetingElementsVisible", new Object[]{this.lqX});
    }

    protected void cEa() {
        this.cGz();
    }

    protected void b(int n, int n2, int n3, String string) {
        this.a("handleMouseMove", new Object[]{n, n2});
    }

    public void kg(float f) {
        if (f != this.eTM) {
            this.eTM = f;
            this.a("setProgress", new Object[]{Float.valueOf(f)});
        }
    }

    public void OS(int n) {
        this.a("setProgressColor", new Object[]{n});
    }

    public void kv(float f) {
        this.a("setBreath", new Object[]{Float.valueOf(f)});
    }

    public void b(ffk ffk2) {
        this.lqO = null;
        boolean bl = false;
        this.lqC = null;
        this.dtj = ffk2.dtj;
        if (this.dtj == null) {
            this.lqA = -1;
            this.cGx();
        }
        if (this.dtj != null && hso.cxK().bAn() != null && this.dtj.equals(hso.cxK().bAn().gYY)) {
            this.lqA = -1;
            this.cGx();
            return;
        }
        if (!this.lqX) {
            return;
        }
    }

    private void a(float f, SFTargetInformationDTO sFTargetInformationDTO) {
        this.a("setHealth", new Object[]{Float.valueOf(f)});
        this.a("setTargetInformation", new Object[]{sFTargetInformationDTO});
    }

    private void cGv() {
        if (this.lqG == null) {
            return;
        }
        this.lqG.stop();
        this.lqG = null;
        this.kw(this.lqH);
        this.lqF = null;
    }

    private void kw(float f) {
        this.a("setFadeoutAlpha", new Object[]{Float.valueOf(f)});
    }

    private void b(float f, SFTargetInformationDTO sFTargetInformationDTO) {
        this.lqE = f;
        this.lqF = sFTargetInformationDTO;
        this.kw(this.lqH);
        this.lqG = new lie(this, 0.016666668f * (1.0f / this.lqH), true){
            final /* synthetic */ hyw lqY;
            {
                this.lqY = hyw2;
                super(d2, bl);
            }

            public void dh(double d2) {
                if (d2 < (double)hyw.a(this.lqY)) {
                    hyw.a(this.lqY, hyw.a(this.lqY) - (float)d2);
                } else {
                    hyw.a(this.lqY, hyw.b(this.lqY), hyw.c(this.lqY));
                    hyw.d(this.lqY);
                }
            }
        };
        this.lqG.e(this.getMessageDelegator());
    }

    public void OT(int n) {
        this.lqN = n;
    }

    public void OU(int n) {
        this.a("setCriticalState", new Object[]{n});
    }

    public void cGw() {
        this.gpD = false;
    }

    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 2567: {
                this.b((ffr)dxq2);
                break;
            }
            case 4876: {
                this.b((gaz)dxq2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(ffr ffr2) {
        if (this.gpD) {
            gba gba2 = (gba)this.MessageDelegator.h(4877, this.getGUID(), hso.cxK().bAn().gYY);
            this.MessageDelegator.F(gba2);
            return;
        }
        this.gpD = true;
        this.lqJ = true;
        this.lqK.clear();
        SFContextMenuOptionListDTO sFContextMenuOptionListDTO = new SFContextMenuOptionListDTO();
        SFContextMenuOptionDTO sFContextMenuOptionDTO = null;
        boolean bl = false;
        block7: for (hcn hcn2 : ffr2.bOT()) {
            int n = hcn2.ipx;
            cvq.a a2 = cvq.a.getContextCommandType(n);
            if (!bl) {
                bl = a2.bcC();
            }
            if (a2 != null) {
                switch (a2) {
                    case fAd: {
                        if (hyw.cxP() == null || hyw.cxP().cyJ() == null || hyw.cxP().cyJ().cIm() == null || !hyw.cxP().cyJ().cIm().rJ(ffr2.dtj)) break;
                        continue block7;
                    }
                    case fAg: {
                        Object object = lcr.abW((int)ffr2.dtj.enw());
                        if (hyw.cxP() == null || hyw.cxP().cyJ() == null || hyw.cxP().cyJ().cHM() == null || !hyw.cxP().cyJ().cHM().rN((ldv)object)) break;
                        continue block7;
                    }
                    case fAc: {
                        if (this.lqC == null) break;
                        continue block7;
                    }
                    case fAq: {
                        if (hyw.cxP() == null || hyw.cxP().cyJ() == null || hyw.cxP().cyJ().cHM() == null) break;
                        Object object = lcr.abW((int)ffr2.dtj.enw());
                        if (!hyw.cxP().cyJ().cHM().rL((ldv)object) && !hyw.cxP().cyJ().cHM().rN((ldv)object) && !hyw.cxP().cyJ().cHM().rO((ldv)object) && !hyw.cxP().cyJ().cHM().rM((ldv)object)) break;
                        continue block7;
                    }
                    case fAm: {
                        Object object = hc.getAccessLevelType(hso.cxK().cxP().cyZ().cAv());
                        if (object == null || !((hc)((Object)object)).li()) continue block7;
                    }
                }
            }
            sFContextMenuOptionDTO = new SFContextMenuOptionDTO();
            sFContextMenuOptionDTO.text = hcn2.jHa.exA();
            sFContextMenuOptionDTO.iconName = cvq.a(cvq.a.getContextCommandType(hcn2.ipx));
            sFContextMenuOptionListDTO.list.add(sFContextMenuOptionDTO);
            this.lqK.add(hcn2.ipx);
        }
        if (bl) {
            this.lqL = new lie(this, 0.1, false, sFContextMenuOptionListDTO){
                final /* synthetic */ SFContextMenuOptionListDTO lqZ;
                final /* synthetic */ hyw lqY;
                {
                    this.lqY = hyw2;
                    this.lqZ = sFContextMenuOptionListDTO;
                    super(d2, bl);
                }

                public void dh(double d2) {
                    if (d2 > 0.1) {
                        hyw.a(this.lqY, this.lqZ);
                        if (hyw.e(this.lqY) != null) {
                            hyw.e(this.lqY).stop();
                            hyw.a(this.lqY, null);
                        }
                    }
                }
            };
            this.lqL.e(this.getMessageDelegator());
            return;
        }
        this.a(sFContextMenuOptionListDTO);
    }

    private void a(SFContextMenuOptionListDTO sFContextMenuOptionListDTO) {
        if (this.lqM) {
            if (!this.cGy()) {
                gba gba2 = (gba)this.MessageDelegator.h(4877, this.getGUID(), hso.cxK().bAn().gYY);
                this.MessageDelegator.F(gba2);
            }
            this.lqM = false;
            this.gpD = true;
            this.cGx();
            return;
        }
        this.lqI = true;
        hso.cxK().a(jnz.nFL);
        hso.cxK().cxP().g((hyn)this);
        this.a("setContextOptions", new Object[]{sFContextMenuOptionListDTO});
    }

    private void b(gaz gaz2) {
        this.lqM = false;
        this.gpD = true;
        this.cGx();
    }

    public void cGx() {
        if (!this.gpD) {
            this.lqM = true;
            return;
        }
        boolean bl = this.lqI;
        if (!this.lqJ) {
            this.gpD = true;
            return;
        }
        this.lqJ = false;
        if (this.lqL != null) {
            this.lqL.stop();
            this.lqL = null;
        }
        if (this.lqI) {
            this.lqI = false;
            this.a("removeContextOptions", new Object[0]);
            hso.cxK().cxP().h((hyn)this);
            hso.cxK().cxP().oJ(false);
            hso.cxK().a(jnz.nFE);
        }
        if (this.lqA != -1) {
            Integer n = this.lqK.get(this.lqA);
            if (n == null) {
                this.lqA = -1;
                return;
            }
            gaw gaw2 = (gaw)this.MessageDelegator.h(4873, this.getGUID(), hso.cxK().bAn().gYY);
            gaw2.jcL = n;
            this.MessageDelegator.F(gaw2);
            this.lqA = -1;
        } else {
            if (!bl && this.cGy()) {
                return;
            }
            gba gba2 = (gba)this.MessageDelegator.h(4877, this.getGUID(), hso.cxK().bAn().gYY);
            this.MessageDelegator.F(gba2);
        }
    }

    private boolean cGy() {
        for (Integer n : this.lqK) {
            cvq.a a2 = cvq.a.getContextCommandType(n);
            if (!a2.bcC()) continue;
            gaw gaw2 = (gaw)this.MessageDelegator.h(4873, this.getGUID(), hso.cxK().bAn().gYY);
            gaw2.jcL = n;
            this.MessageDelegator.F(gaw2);
            return true;
        }
        return false;
    }

    @llk
    public void optionSelected(int n) {
        this.lqA = n;
    }

    protected void cGz() {
        this.a("setScreenSize", new Object[]{Float.valueOf(this.cEN().W), Float.valueOf(this.cEN().H)});
    }

    public float beq() {
        return this.eTM;
    }

    @Override
    public void m(alu alu2) {
    }

    @Override
    public void n(alu alu2) {
    }

    @Override
    public void a(List<hvz> list, List<hvz> list2, List<hvz> list3) {
        for (hvz hvz2 : list2) {
            hwt hwt2 = new hwt(hvz2);
            SFGUIElementDTO sFGUIElementDTO = hwt2.cBj();
            this.a("addModifier", new Object[]{sFGUIElementDTO.id, sFGUIElementDTO.iconName, hwt2.cCq() ? 0.42 : 1.0});
        }
        for (hvz hvz2 : list3) {
            if (hvz2.getId() == this.lqB && this.lqS != null) {
                this.lqS.setVisible(false);
                this.lqB = -1;
            }
            this.a("removeModifier", new Object[]{hvz2.getId()});
        }
    }

    @Override
    public void a(List<hvz> list, float[] fArray) {
        for (int j = 0; j < list.size(); ++j) {
            if (!(fArray[j] >= 0.0f)) continue;
            this.a("setModifierProgress", new Object[]{list.get(j).getId(), Float.valueOf(fArray[j])});
        }
    }

    @Override
    public int cAQ() {
        return this.lqB;
    }

    @Override
    public void a(hvz hvz2, List<Integer> list, List<Integer> list2) {
        this.lqS.a(hvz2, list, list2);
    }

    @Override
    public void a(hvz hvz2, float[] fArray) {
        for (int j = 0; j < fArray.length; ++j) {
            if (this.lqS == null) continue;
            this.lqS.a(hvz2, fArray);
        }
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        if (string.startsWith("shop")) {
            SFTooltipBaseDTO sFTooltipBaseDTO = new SFTooltipBaseDTO();
            sFTooltipBaseDTO.header = true;
            sFTooltipBaseDTO.headerHTMLText = "<font size=\"14\" COLOR=\"#C7B299\">" + lxf.tod.bD(cug.ftU).exA().toUpperCase() + "</font>";
            sFTooltipBaseDTO.footer = true;
            sFTooltipBaseDTO.footerHTMLText = "<font size=\"13\">" + lxf.tof.bD(cug.ftU).exA() + "</font>";
            iae iae2 = new iae(sFTooltipBaseDTO, n, n2, 32, 32);
            return iae2;
        }
        if (string.startsWith("selentine")) {
            SFTooltipBaseDTO sFTooltipBaseDTO;
            String[] stringArray = string.split(";");
            int n3 = Integer.valueOf(stringArray[1]);
            int n4 = this.lqT[n3 * 3 + 1];
            String string2 = lxf.tof.bD(n4).exA();
            if (n4 != cug.fug) {
                string2 = string2 + "\n";
                sFTooltipBaseDTO = hyw.cxP().cyZ();
                int n5 = (int)((double)sFTooltipBaseDTO.Ow(this.lqT[n3 * 3]) - sFTooltipBaseDTO.cAC());
                int n6 = n5 / 86400;
                int n7 = (n5 -= n6 * 3600 * 24) / 3600;
                int n8 = (n5 -= n7 * 3600) / 60;
                int n9 = n5 -= n8 * 60;
                String string3 = lxz.tBR.bD(new Object[0]).exA();
                if (n6 > 0) {
                    string3 = string3 + " " + n6 + " " + lxz.tqC.bD(new Object[0]).exA();
                }
                if (n7 > 0 || n6 > 0) {
                    string3 = string3 + " " + n7 + " " + lxz.tqF.bD(new Object[0]).exA();
                }
                if (n8 > 0 || n6 > 0 || n7 > 0) {
                    string3 = string3 + " " + n8 + " " + lxz.tBS.bD(new Object[0]).exA() + " " + lxz.tBU.bD(new Object[0]).exA();
                }
                string3 = string3 + " " + n9 + " " + lxz.tBT.bD(new Object[0]).exA();
                string2 = string2 + string3 + "\n";
                ep.b b2 = hyw.cxP().cyZ().cAI();
                string2 = string2 + b2.fA().bD(new Object[0]).exA().toUpperCase();
            }
            sFTooltipBaseDTO = new SFTooltipBaseDTO();
            sFTooltipBaseDTO.header = true;
            sFTooltipBaseDTO.headerHTMLText = "<font size=\"14\" COLOR=\"#C7B299\">" + lxf.tod.bD(n4).exA().toUpperCase() + "</font>";
            sFTooltipBaseDTO.footer = true;
            sFTooltipBaseDTO.footerHTMLText = "<font size=\"13\">" + string2 + "</font>";
            return new iae(sFTooltipBaseDTO, n, n2, 32, 32);
        }
        hwl hwl2 = new hwl(string);
        if (hwl2.cck == -1) {
            return null;
        }
        this.lqB = hwl2.cck;
        if (this.lgs.cAT() != null) {
            for (hvz hvz2 : this.lgs.cAT()) {
                if (hvz2.getId() != this.lqB) continue;
                this.lqS = new iad(n, n2 + 10);
                ArrayList<Integer> arrayList = lcn.emv();
                for (int j = 0; j < hvz2.cAN(); ++j) {
                    arrayList.add(j);
                }
                ArrayList<Integer> arrayList2 = lcn.emv();
                this.lqS.a(hvz2, arrayList, arrayList2);
                return this.lqS;
            }
        }
        return null;
    }

    protected void b(jnz jnz2, jnz jnz3) {
        this.a("setVisible", new Object[]{jnz3 == jnz.nFE || jnz3 == jnz.nFL});
    }

    public void kx(float f) {
        this.lqH = Math.max(Math.min(f, 1.0f), 0.0f);
        if (this.lqD) {
            this.kw(f);
        }
    }

    public void t(float f, float f2) {
        this.a("setCrosshairOffset", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lqO != null && ldz2.rgz - this.lqP > 1.0) {
            this.b(this.lqO);
            this.lqP = ldz2.rgz;
        }
        this.aC(ldz2);
        if (lcw.emX()) {
            this.cGA();
        }
    }

    protected void cGA() {
        for (int j = 0; j < this.lqT.length / 3; ++j) {
            int n;
            hvy hvy2 = hyw.cxP().cyZ();
            int n2 = this.lqT[j * 3];
            eo eo2 = ep.bc((int)n2);
            if (eo2.kM == 0) {
                n = hvy2.Ox(this.lqT[j * 3]);
                if (n != 0) {
                    if (this.lqT[j * 3 + 2] == -1) {
                        lgw lgw2 = (lgw)lea.enW().acv(this.lqT[j * 3 + 1]);
                        this.a("updateSelentineBuff", new Object[]{j, "", "texture/dds/" + lgw2.atw().Name});
                        this.lqT[j * 3 + 2] = 0;
                    }
                } else if (this.lqT[j * 3 + 2] == 0) {
                    this.a("removeSelentineBuff", new Object[]{j});
                    this.lqT[j * 3 + 2] = -1;
                }
                return;
            }
            n = hvy2.Ow(this.lqT[j * 3]);
            int n3 = (int)((double)n - hvy2.cAC());
            if (n3 > 0) {
                int n4 = 0;
                String string = "";
                String string2 = "";
                string = "D";
                string2 = "#7da82a";
                n4 = n3 / 86400;
                if (n4 == 0) {
                    string = "H";
                    string2 = "#938c7d";
                    n4 = (n3 %= 86400) / 3600;
                    if (n4 == 0) {
                        string = "M";
                        string2 = "#ba891f";
                        n4 = (n3 %= 3600) / 60;
                        if (n4 == 0) {
                            string = "S";
                            string2 = "#d74118";
                            n4 = n3 %= 60;
                        }
                    }
                }
                if (n4 == this.lqT[j * 3 + 2]) continue;
                lgw lgw3 = (lgw)lea.enW().acv(this.lqT[j * 3 + 1]);
                this.a("updateSelentineBuff", new Object[]{j, String.format("%02d <FONT COLOR=\"%s\">%s</FONT>", n4, string2, string), "texture/dds/" + lgw3.atw().Name});
                this.lqT[j * 3 + 2] = n4;
                continue;
            }
            if (this.lqT[j * 3 + 2] == -1) continue;
            this.a("removeSelentineBuff", new Object[]{j});
            this.lqT[j * 3 + 2] = -1;
        }
    }

    protected void aC(ldz ldz2) {
        hso hso2 = hso.cxK();
        if (hso2.bAn() == null) {
            return;
        }
        cew cew2 = (cew)this.MessageDelegator.bzx().bzt().d(hso2.bAn().gYY);
        if (cew2 == null) {
            return;
        }
        cyu cyu2 = cew2.aJX();
        if (cyu2 == null) {
            return;
        }
        float f = cyu2.bhg() == 0.0 ? 0.0f : (float)(ldz2.rgz - cyu2.bhg());
        float f2 = cew2.eq(f);
        float f3 = lew.A(20.0f * (float)ldz2.qwh, 0.0f, 1.0f);
        this.lqU += (f2 - this.lqU) * f3;
        if (hso.cxK().cxN() == jnz.nFE && this.lqU != this.lqV) {
            this.a("setNewCrosshairOffset", new Object[]{Float.valueOf(this.lqU * 3700.0f * (float)lcw.qFU / 768.0f)});
        }
        this.lqV = this.lqU;
    }

    protected void u(float f, float f2, float f3) {
        super.S(f, f2);
        double d2 = (f - this.cEJ()) / 2.0f;
        double d3 = (f2 - this.cDc()) / 2.0f;
        this.a("setSFMoviePosition2", new Object[]{d2, d3});
        if (lcw.emX() && lcw.emW()) {
            iak iak2 = hyw.cyJ().cHN();
            jjd jjd2 = hyw.cyJ().cHH();
            int n = 0;
            if (iak2 != null && iak2.cEU() && jjd2 != null && !jjd2.dId()) {
                n = 50;
            }
            this.a("setSelentineShopButtonPosition", new Object[]{(double)(f - 69.0f) - d2, (double)(f3 - 46.0f) - d3 - (double)n});
            this.a("setSelentineShopButtonState", new Object[]{hyw.cyJ().cIa().isVisible()});
            int n2 = hso.cxK().cxN().ordinal();
            this.a("setActionMode", new Object[]{n2 == jnz.nFE.ordinal() || n2 == jnz.nFH.ordinal()});
        }
    }

    @llk
    public void onSelentineButtonClicked(boolean bl) {
        hyw.cyJ().cHw().a(hyc.lmY, bl);
    }

    protected boolean d(int n, int n2, String string) {
        return string != null && (string.startsWith("selentine") || string.startsWith("shop"));
    }

    public hyn f(int n, int n2, String string) {
        if (string == null || !string.startsWith("selentine")) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray == null || stringArray.length < 2) {
            return null;
        }
        int n3 = Integer.valueOf(stringArray[1]);
        if (n3 * 3 + 1 >= this.lqT.length) {
            return null;
        }
        int n4 = this.lqT[n3 * 3 + 1];
        if (cug.fuf != n4 && cug.fue != n4) {
            return null;
        }
        String string2 = ep.b.Pj.fA().bD(new Object[0]).exA().toUpperCase();
        String string3 = ep.b.Pk.fA().bD(new Object[0]).exA().toUpperCase();
        String string4 = ep.b.Pl.fA().bD(new Object[0]).exA().toUpperCase();
        ep.b b2 = hyw.cxP().cyZ().cAI();
        if (b2 == ep.b.Pl) {
            string4 = "<FONT COLOR=\"" + this.lqz.cJM() + "\">" + string4 + "</FONT>";
        } else if (b2 == ep.b.Pk) {
            string3 = "<FONT COLOR=\"" + this.lqz.cJM() + "\">" + string3 + "</Font>";
        } else {
            string2 = "<FONT COLOR=\"" + this.lqz.cJM() + "\">" + string2 + "</FONT>";
        }
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add(string2);
        arrayList.add(string3);
        arrayList.add(string4);
        hwk hwk2 = new hwk(string);
        int n5 = n;
        int n6 = n2;
        this.lqW = new hyi(n5, n6, new hyk(this, arrayList){
            final /* synthetic */ List lra;
            final /* synthetic */ hyw lqY;
            {
                this.lqY = hyw2;
                this.lra = list;
            }

            public String[] cDR() {
                return this.lra.toArray(new String[this.lra.size()]);
            }

            public void a(int n, String string, int n2, int n3, int n4, int n5) {
                hyw.a(this.lqY, n);
            }

            public void cDU() {
            }
        });
        return this.lqW;
    }

    private void OV(int n) {
        this.lqW = null;
        hyw.cxP().czi();
        ep.b b2 = ep.b.getValueFromOrdinal(n);
        if (b2 == null) {
            return;
        }
        ghg ghg2 = (ghg)this.MessageDelegator.h(32513, this.getGUID(), hso.cxK().bAn().gYX);
        ghg2.cZn = cio.eCJ.ordinal();
        ghg2.jhw = b2.ordinal();
        this.MessageDelegator.E(ghg2);
    }

    public void pl(boolean bl) {
        if (bl == this.lqX) {
            return;
        }
        this.lqX = bl;
        if (this.cDj()) {
            this.a("setTargetingElementsVisible", new Object[]{this.lqX});
        }
    }

    static /* synthetic */ float a(hyw hyw2) {
        return hyw2.lqH;
    }

    static /* synthetic */ void a(hyw hyw2, float f) {
        hyw2.kw(f);
    }

    static /* synthetic */ float b(hyw hyw2) {
        return hyw2.lqE;
    }

    static /* synthetic */ SFTargetInformationDTO c(hyw hyw2) {
        return hyw2.lqF;
    }

    static /* synthetic */ void a(hyw hyw2, float f, SFTargetInformationDTO sFTargetInformationDTO) {
        hyw2.a(f, sFTargetInformationDTO);
    }

    static /* synthetic */ void d(hyw hyw2) {
        hyw2.cGv();
    }

    static /* synthetic */ void a(hyw hyw2, SFContextMenuOptionListDTO sFContextMenuOptionListDTO) {
        hyw2.a(sFContextMenuOptionListDTO);
    }

    static /* synthetic */ lie e(hyw hyw2) {
        return hyw2.lqL;
    }

    static /* synthetic */ lie a(hyw hyw2, lie lie2) {
        hyw2.lqL = lie2;
        return hyw2.lqL;
    }

    static /* synthetic */ void a(hyw hyw2, int n) {
        hyw2.OV(n);
    }
}

