/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cwx
 *  cxd
 *  ep
 */
import java.util.ArrayList;
import java.util.List;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class iag
extends iai {
    private SFTooltipBaseDTO lAO;
    private iaf lBe = new iaf();
    private final List<String> lAR = lcn.emv();
    private final boolean lBf;
    private boolean lBg = false;
    private int lAT = 0;
    private int lAU = 2;
    private int SkillType = -1;
    public static String lBh = null;

    @Override
    protected void cJU() {
        this.a("setData", new Object[]{iah.d(this.lAO)});
    }

    private void a(String string, float f, String string2, String string3) {
        if (string == null) {
            return;
        }
        String string4 = hso.cxK().cxP().led.format(f);
        this.lAR.add("<FONT size = \"" + this.dOX + "\" COLOR = \"" + string2 + "\">" + string + "</FONT>");
        this.lAR.add("<p align= \"right\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string3 + "\">" + f + "</FONT></p>");
        this.lBg = true;
        ++this.lAT;
    }

    private void J(String string, String string2) {
        if (string == null) {
            return;
        }
        this.lAR.add("<FONT size = \"" + this.dOX + "\" COLOR = \"" + string2 + "\">" + string + "</FONT>");
        this.lAR.add("");
        this.lBg = true;
        ++this.lAT;
    }

    private String K(String string, String string2) {
        if (string == null || string.endsWith("DESCRIPTION IN THE SKILLTREE")) {
            return "<FONT size = \"" + this.dOX + "\" COLOR = \"" + string2 + "\">" + "" + "</FONT>";
        }
        return "<FONT size = \"" + this.dOX + "\" COLOR = \"" + string2 + "\">" + string + "</FONT>";
    }

    public iag(int n, int n2, int n3, boolean bl) {
        super("TooltipGenericWindow", "TooltipGenericWindow.swf", n2, n3, 0, 0);
        this.SkillType = n;
        this.lBf = bl;
        this.lAO = new SFTooltipBaseDTO();
        this.cKd();
    }

    public iag(int n, int n2, iaf iaf2) {
        super("TooltipGenericWindow", "TooltipGenericWindow.swf", n, n2, 0, 0);
        this.SkillType = iaf2.lAY;
        this.lBf = true;
        this.lBe = iaf2;
        this.lAO = new SFTooltipBaseDTO();
        this.cKa();
    }

    private void cKd() {
        this.cJZ();
        this.cKa();
    }

    /*
     * WARNING - void declaration
     */
    private void cJZ() {
        cxc cxc2;
        this.lBe.lAY = this.SkillType;
        lhg lhg2 = (lhg)lea.enZ().acv(this.SkillType);
        if (lhg2 == null) {
            return;
        }
        String string = "";
        string = "<p>" + this.K(lya.tCp.bD(lhg2.getName()).exA(), iab.lqz.cJP()) + "</p>";
        string = string + "<p>" + this.K(lya.tCq.bD(lhg2.getName()).exA() + "</p>", iab.lqz.cJQ());
        cxc cxc3 = cxc2 = hso.cxK().cxP().cyZ() != null ? hso.cxK().cxP().cyZ().ht(this.SkillType) : null;
        if (cxc2 == null) {
            cua[] cuaArray;
            cuo cuo2 = cxj.yw(this.SkillType);
            if (cuo2 != null && (cuaArray = cuo2.Requirements) != null) {
                void object2;
                cua[] cuaArray2 = cuaArray;
                int n = cuaArray2.length;
                boolean bl = false;
                while (object2 < n) {
                    cua cua2;
                    cua cua3 = cuaArray2[object2];
                    if (cua3 instanceof cue) {
                        cua2 = (cue)cua3;
                        int n2 = ((cue)cua2).SkillType;
                        float f = ((cue)cua2).SkillLevel;
                        lhg lhg3 = (lhg)lea.enZ().acv(n2);
                        if (lhg3 != null) {
                            cxc cxc4 = hso.cxK().cxP().cyZ().ht(n2);
                            this.lBe.J(n2, f);
                        }
                    } else if (cua3 instanceof cuc) {
                        cua2 = (cuc)cua3;
                        float f = ((cuc)cua2).AttributeValue;
                        String string2 = ((cuc)cua2).getAttributeName();
                        int n3 = ep.as((String)((cuc)cua2).getAttributeName());
                        this.lBe.K(n3, n3);
                    }
                    ++object2;
                }
            }
        } else {
            cwx cwx2;
            aja[] ajaArray;
            this.lBe.lBa = Float.valueOf(cxc2.Bt());
            if (lea.enZ().isDescendant(cxc2.zg(), cxd.fJq)) {
                if (!(cxc2 instanceof cwx)) {
                    return;
                }
                aja[] ajaArray2 = ((cwx)cxc2).bek();
                if (ajaArray2 == null) {
                    return;
                }
                for (aja n3 : ajaArray2) {
                    if (!(n3 instanceof akc)) continue;
                    akc akc2 = (akc)n3;
                    this.lBe.di(akc2.az(), akc2.Db());
                }
            }
            boolean bl = false;
            aja[] ajaArray3 = this.xU(cxc2.zg());
            if (ajaArray3 != null) {
                int n;
                bsh bsh2 = hso.cxK().cxP().cyZ().cAc();
                int n4 = n = bsh2 != null ? bsh2.az() : -1;
                if (ajaArray3.dTw()) {
                    int n5 = cxj.yr(cxc2.zg());
                    int n6 = n5 == -1 ? -1 : cxj.yA(n5);
                    bl = n5 == -1 ? false : lea.enW().isDescendant(n, n6);
                }
                bl = ajaArray3.Wf(n);
                ArrayList<Integer> arrayList = ajaArray3.dTx();
                if (arrayList != null) {
                    for (Integer n7 : arrayList) {
                        if (n7 == cug.fiL) continue;
                        String string3 = lvm.sXa.bD(n7).exA();
                        this.lBe.oK(string3);
                    }
                }
            }
            if (bl && cxc2 instanceof cwx && (ajaArray = (cwx2 = (cwx)cxc2).bek()) != null) {
                lfs[] lfsArray = new lfs[3];
                block17: for (Object object : ajaArray) {
                    switch (((aja)object).Cl()) {
                        case boy: {
                            ait ait2 = (aiu)object;
                            float f = ait2.BY();
                            if (f > 0.0f) {
                                switch (ait2.BV()) {
                                    case 384: {
                                        lfsArray[0] = new lfs<Integer, Float>(ait2.BV(), Float.valueOf(ait2.BY()));
                                        break;
                                    }
                                    case 400: {
                                        lfsArray[1] = new lfs<Integer, Float>(ait2.BV(), Float.valueOf(ait2.BY()));
                                        break;
                                    }
                                    case 352: {
                                        lfsArray[2] = new lfs<Integer, Float>(ait2.BV(), Float.valueOf(ait2.BY()));
                                    }
                                }
                            }
                            ait2.reset();
                            continue block17;
                        }
                        case boC: {
                            ait ait2 = (aiy)object;
                            float f = ait2.BY();
                            if (!(f > 0.0f)) continue block17;
                            switch (ait2.BV()) {
                                case 384: {
                                    lfsArray[0] = new lfs<Integer, Float>(ait2.BV(), Float.valueOf(ait2.BY()));
                                    break;
                                }
                                case 400: {
                                    lfsArray[1] = new lfs<Integer, Float>(ait2.BV(), Float.valueOf(ait2.BY()));
                                    break;
                                }
                                case 352: {
                                    lfsArray[2] = new lfs<Integer, Float>(ait2.BV(), Float.valueOf(ait2.BY()));
                                }
                            }
                            continue block17;
                        }
                    }
                }
                for (Object object : lfsArray) {
                    if (object == null) continue;
                    this.lBe.L((Integer)((lfs)object).getFirst(), ((Float)((lfs)object).eqz()).floatValue());
                    object = null;
                }
                Object var8_23 = null;
            }
        }
    }

    private void cKa() {
        int n;
        hc hc2;
        lhg lhg2 = (lhg)lea.enZ().acv(this.SkillType);
        if (lhg2 == null) {
            return;
        }
        String string = "<p>" + this.K(lya.tCp.bD(lhg2.getName()).exA(), iab.lqz.cJP()) + "</p>";
        string = string + "<p>" + this.K(lya.tCq.bD(lhg2.getName()).exA() + "</p>", iab.lqz.cJQ());
        if (this.lBe.lBa == null) {
            for (lil<Integer, Integer, Float> object2 : this.lBe.lAZ) {
                switch ((Integer)object2.reX) {
                    case 0: {
                        cxc cxc2 = hso.cxK().cxP().cyZ().ht(((Integer)object2.reY).intValue());
                        lhg lhg3 = (lhg)lea.enZ().acv((Integer)object2.reY);
                        if (cxc2 != null && cxc2.Bt() < ((Float)object2.reZ).floatValue()) {
                            this.a(lya.tCp.bD(lhg3.getName()).exA(), ((Float)object2.reZ).floatValue(), iab.lqz.cJH(), iab.lqz.cJN());
                            break;
                        }
                        this.a(lya.tCp.bD(lhg3.getName()).exA(), ((Float)object2.reZ).floatValue(), iab.lqz.cJH(), iab.lqz.cJM());
                        break;
                    }
                    case 1: {
                        float f = hso.cxK().cxP().cyZ().Oy(((Integer)object2.reY).intValue());
                        String string2 = ep.aM((int)((Integer)object2.reY));
                        if (f > ((Float)object2.reZ).floatValue()) {
                            this.a(string2, ((Float)object2.reZ).floatValue(), iab.lqz.cJH(), iab.lqz.cJN());
                            break;
                        }
                        this.a(string2, ((Float)object2.reZ).floatValue(), iab.lqz.cJH(), iab.lqz.cJM());
                    }
                }
            }
        } else {
            this.a(lya.tCr.bD(new Object[0]).exA(), this.lBe.lBa.floatValue(), iab.lqz.cJJ(), iab.lqz.cJL());
            for (lfs lfs2 : this.lBe.lBc) {
                lgw lgw2 = (lgw)lea.enW().acv((Integer)lfs2.reX);
                this.a(lya.tCs.bD(lgw2.getName()).exA(), ((Integer)lfs2.reY).intValue(), iab.lqz.cJJ(), iab.lqz.cJL());
            }
            for (lfs lfs3 : this.lBe.lBd) {
                this.a(lvm.sWX.bD(lfs3.reX).exA(), ((Float)lfs3.reY).floatValue(), iab.lqz.cJJ(), iab.lqz.cJL());
            }
            if (!this.lBe.lBb.isEmpty()) {
                this.J(lyi.tFk.bD(new Object[0]).exA(), iab.lqz.cJP());
                for (String string3 : this.lBe.lBb) {
                    this.J(string3, iab.lqz.cJL());
                }
            }
        }
        if ((hc2 = hc.getAccessLevelType(n = hso.cxK().cxP().cyZ().cAv())) != null && hc2.lh()) {
            this.J(lhg2.getName(), iab.lqz.cJN());
        }
        this.lAO.autoSizeColumns = true;
        this.lAO.cellPaddingY = 0;
        this.lAO.cellPaddingX = 2;
        this.lAO.header = true;
        this.lAO.headerHTMLText = string;
        this.lAO.table = this.lBg;
        this.lAO.columnCount = this.lBg ? this.lAU : 0;
        this.lAO.rowCount = this.lAT;
        this.lAO.tableCellsHTMLText = this.lAR;
        if (lBh != null) {
            this.lAO.footerHTMLText = lBh;
            this.lAO.footer = true;
            lBh = null;
        }
    }

    public iaf cKe() {
        return this.lBe;
    }

    private jva xU(int n) {
        int n2 = n;
        if (n2 <= 0) {
            lfn.b(5, "SFTooltipSkillWindow", "getSkillConstraintForSkill() SkillType is invalid.");
            return null;
        }
        while (n2 > 0) {
            jva jva2 = lea.epy().get(n2);
            if (jva2 != null) {
                return jva2;
            }
            n2 = lea.enZ().uW(n2);
        }
        return null;
    }

    public SFTooltipBaseDTO cKc() {
        return this.lAO;
    }
}

