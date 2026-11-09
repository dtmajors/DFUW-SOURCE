/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lpo
 */
import java.util.List;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class iac
extends iai {
    private SFTooltipBaseDTO lAO;
    private iaa lAP = new iaa();
    private final boolean lAQ;
    private final List<String> lAR = lcn.emv();
    private hwo lAS = null;
    private int lAT = 0;
    private int lAU = 2;
    private String jD = null;
    private boolean iTA = false;
    private int fyi;

    public iac(hwo hwo2, int n, int n2, boolean bl, boolean bl2, boolean bl3, int n3) {
        super("TooltipGenericWindow", "TooltipGenericWindow.swf", n, n2, 0, 0);
        assert (hwo2 != null);
        this.lAS = hwo2;
        this.lAQ = bl;
        this.iTA = bl3;
        this.fyi = n3;
        if (bl2) {
            ++this.lAU;
        }
        this.cJY();
    }

    public iac(hwo hwo2, int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        this(hwo2, n, n2, bl, bl2, bl3, -1);
    }

    public iac(int n, int n2, int[] nArray, ljq ljq2, long l2) {
        super("TooltipGenericWindow", "TooltipGenericWindow.swf", n, n2, 0, 0);
        this.lAQ = false;
        if (ljq2 != null) {
            this.a(lxf.toO.bD(new Object[0]).exA(), lxf.toN.bD(ljq2).exA().toUpperCase(), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (nArray != null && nArray.length > 0) {
            this.b(lxf.toP.bD(new Object[0]).exA(), iab.lqz.cJM(), true);
            for (int n3 : nArray) {
                this.b(lxf.tod.bD(n3).exA().toUpperCase(), iab.lqz.cJF(), false);
            }
        }
        this.lAO = new SFTooltipBaseDTO();
        this.lAO.autoSizeColumns = true;
        this.lAO.cellPaddingY = 0;
        this.lAO.cellPaddingX = 2;
        this.lAO.table = !this.lAR.isEmpty();
        this.lAO.header = false;
        this.lAO.columnCount = this.lAR.isEmpty() ? 0 : this.lAU;
        this.lAO.rowCount = this.lAR.isEmpty() ? 0 : this.lAT;
        this.lAO.tableCellsHTMLText = this.lAR;
    }

    public iac(int n, int n2, SFTooltipBaseDTO sFTooltipBaseDTO) {
        super("TooltipGenericWindow", "TooltipGenericWindow.swf", n, n2, 0, 0);
        this.lAQ = false;
        this.lAO = sFTooltipBaseDTO;
    }

    public iac(int n, int n2, iaa iaa2) {
        super("TooltipGenericWindow", "TooltipGenericWindow.swf", n, n2, 0, 0);
        this.lAQ = false;
        this.lAP = iaa2;
        this.lAU = iaa2.lzU;
        this.iTA = true;
        this.cKa();
    }

    public iaa cJX() {
        return this.lAP;
    }

    @Override
    protected void cJU() {
        this.a("setData", new Object[]{iah.d(this.lAO)});
    }

    private void a(lil<Integer, Float, Float> lil2) {
        String string = lvm.sWX.bD(lil2.reX).exA();
        this.lAR.add("<p align = \"left\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + iab.lqz.cJI() + "\">" + string.toUpperCase() + "</FONT></p>");
        this.lAR.add("<p align = \"right\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + iab.lqz.cJK() + "\">" + hso.cxK().cxP().led.format(lil2.reY) + "</FONT></p>");
        if (this.lAU == 3) {
            if (((Float)lil2.reZ).floatValue() != 0.0f) {
                String string2 = ((Float)lil2.reZ).floatValue() > 0.0f ? iab.lqz.cJM() : iab.lqz.cJN();
                String string3 = ((Float)lil2.reZ).floatValue() > 0.0f ? "+" + String.valueOf(hso.cxK().cxP().led.format(lil2.reZ)) : hso.cxK().cxP().led.format(lil2.reZ);
                this.lAR.add("<p align = \"right\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string2 + "\">" + string3 + "</FONT></p>");
            } else {
                this.lAR.add("");
            }
        }
        ++this.lAT;
    }

    private void a(String string, float f, float f2, boolean bl, String string2, String string3) {
        if (string == null || f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.lAR.add("<p align = \"left\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string2 + "\">" + string + "</FONT></p>");
        this.lAR.add("<p align = \"right\"><FONT  size = \"" + this.dOX + "\" COLOR = \"" + string3 + "\">" + String.valueOf(hso.cxK().cxP().led.format(f)) + (bl ? "%" : "") + "</FONT></p>");
        if (this.lAU == 3) {
            if (f2 != 0.0f) {
                String string4;
                String string5 = f2 > 0.0f ? iab.lqz.cJM() : iab.lqz.cJN();
                String string6 = string4 = f2 > 0.0f ? "+" + String.valueOf(hso.cxK().cxP().led.format(f2)) : hso.cxK().cxP().led.format(f2);
                if (bl) {
                    string4 = string4 + "%";
                }
                this.lAR.add("<p align = \"right\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string5 + "\">" + string4 + "</FONT></p>");
            } else {
                this.lAR.add("");
            }
        }
        ++this.lAT;
    }

    private void a(String string, String string2, String string3, String string4) {
        if (string == null || string2 == null) {
            return;
        }
        this.lAR.add("<p align = \"left\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string3 + "\">" + string + "</FONT></p>");
        this.lAR.add("<p align = \"right\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string4 + "\">" + string2 + "</FONT></p>");
        if (this.lAU == 3) {
            this.lAR.add("");
        }
        ++this.lAT;
    }

    private void a(String string, String string2, String string3, String string4, String string5, String string6) {
        if (string == null || string2 == null) {
            return;
        }
        this.lAR.add("<p align = \"left\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string4 + "\">" + string + "</FONT></p>");
        this.lAR.add("<p align = \"right\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string5 + "\">" + string2 + "</FONT></p>");
        this.lAR.add("<p align = \"right\"><FONT size = \"" + this.dOX + "\" COLOR = \"" + string6 + "\">" + string3 + "</FONT></p>");
        this.lAU = 3;
        ++this.lAT;
    }

    private void b(String string, String string2, boolean bl) {
        if (string == null) {
            return;
        }
        if (bl) {
            string = "<U>" + string + "</U>";
        }
        this.lAR.add("<FONT size = \"" + this.dOX + "\" COLOR = \"" + string2 + "\">" + string + "</FONT>");
        this.lAR.add("<FONT size = \"" + this.dOX + "\">" + "" + "</FONT>");
        if (this.lAU == 3) {
            this.lAR.add("<FONT size = \"" + this.dOX + "\">" + "" + "</FONT>");
        }
        ++this.lAT;
    }

    public final void cJY() {
        this.cJZ();
        this.cKa();
    }

    private void cJZ() {
        iab.a(this.lAP, this.lAS, this.lAU, this.lAQ);
    }

    private void cKa() {
        int n;
        ctu ctu2;
        String string;
        Object object;
        Object object2;
        if (this.lAP.primaryDye != 0 || this.lAP.secondaryDye != 0) {
            this.lAU = 3;
        }
        for (lil<Integer, Float, Float> object32 : this.lAP.lzW) {
            this.a(object32);
        }
        if (this.lAP.lzX != null) {
            this.a(lxf.toL.bD(new Object[0]).exA(), String.valueOf((int)this.lAP.lzX.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lzY != null) {
            this.b(this.lAP.lzY == 2 ? lxf.toh.bD(new Object[0]).exA() : lxf.toi.bD(new Object[0]).exA(), iab.lqz.cJJ(), false);
        }
        if (this.lAP.lzZ != null) {
            this.a(lxf.toj.bD(new Object[0]).exA(), String.valueOf(this.lAP.lzZ.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAa != null) {
            this.a(lxf.tok.bD(new Object[0]).exA(), ((Float)this.lAP.lAa.reX).floatValue(), ((Float)this.lAP.lAa.reY).floatValue(), (Boolean)this.lAP.lAa.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAg != null) {
            this.a(lxf.tpa.bD(new Object[0]).exA().toUpperCase(), ((Float)this.lAP.lAg.reX).floatValue(), ((Float)this.lAP.lAg.reY).floatValue(), (Boolean)this.lAP.lAg.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAb != null) {
            this.a(lxf.tol.bD(new Object[0]).exA(), ((Float)this.lAP.lAb.reX).floatValue(), ((Float)this.lAP.lAb.reY).floatValue(), (Boolean)this.lAP.lAb.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAc != null) {
            this.a(lxf.tom.bD(new Object[0]).exA(), ((Float)this.lAP.lAc.reX).floatValue(), ((Float)this.lAP.lAc.reY).floatValue(), (Boolean)this.lAP.lAc.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAd != null) {
            this.a(lxf.tae.bD(new Object[0]).exA(), ((Float)this.lAP.lAd.reX).floatValue(), ((Float)this.lAP.lAd.reY).floatValue(), (Boolean)this.lAP.lAd.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAe != null) {
            this.a(lxf.ton.bD(new Object[0]).exA(), ((Float)this.lAP.lAe.reX).floatValue(), ((Float)this.lAP.lAe.reY).floatValue(), (Boolean)this.lAP.lAe.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAf != null) {
            this.a(lxf.too.bD(new Object[0]).exA(), ((Float)this.lAP.lAf.reX).floatValue(), ((Float)this.lAP.lAf.reY).floatValue(), (Boolean)this.lAP.lAf.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAh > 0) {
            this.a(lzc.tQt.bD(new Object[0]).exA().toUpperCase(), String.valueOf(this.lAP.lAh), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAi != null) {
            this.a(lzc.tNM.bD(new Object[0]).exA().toUpperCase(), this.lAP.lAi, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAj != null) {
            this.a(lzc.tNN.bD(new Object[0]).exA().toUpperCase(), this.lAP.lAj.esI(), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.quantity != 0) {
            this.a(lxf.tfF.bD(new Object[0]).exA(), String.valueOf(this.lAP.quantity), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAk != null) {
            this.a(lxf.tog.bD(new Object[0]).exA(), ((Float)this.lAP.lAk.reX).floatValue(), ((Float)this.lAP.lAk.reY).floatValue(), (Boolean)this.lAP.lAk.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAl != null || this.lAP.lAm != null || this.lAP.lAn != null || this.lAP.lAo != null || this.lAP.lAp != null) {
            this.b(lxf.toM.bD(new Object[0]).exA(), iab.lqz.cJH(), true);
            if (this.lAP.lAl != null) {
                this.a(lpo.rOy.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAl.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
            }
            if (this.lAP.lAm != null) {
                this.a(lpo.rRG.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAm.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
            }
            if (this.lAP.lAn != null) {
                this.a(lpo.rMM.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAn.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
            }
            if (this.lAP.lAo != null) {
                this.a(lpo.rSv.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAo.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
            }
            if (this.lAP.lAp != null) {
                this.a(lpo.rOl.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAp.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
            }
        }
        if (this.lAP.lAq != null) {
            this.a(lxf.toF.bD(new Object[0]).exA(), ((Float)this.lAP.lAq.reX).floatValue(), ((Float)this.lAP.lAq.reY).floatValue(), (Boolean)this.lAP.lAq.reZ, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAr != null) {
            this.a(lxf.toG.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAr.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAu != null) {
            object2 = lxg.tog.bD((int)this.lAP.lAu.floatValue()).exA();
            this.a(lxf.toI.bD(new Object[0]).exA().toUpperCase(), (String)object2, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAv != null) {
            this.a(lxf.toJ.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAv.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAt != null) {
            object2 = lxg.tpD.bD(Float.valueOf(this.lAP.lAt.floatValue())).exA();
            this.a(lxf.toH.bD(new Object[0]).exA().toUpperCase(), (String)object2, iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAs != null) {
            this.a(lxf.toK.bD(new Object[0]).exA().toUpperCase(), String.valueOf((int)this.lAP.lAs.floatValue()), iab.lqz.cJJ(), iab.lqz.cJL());
        }
        if (this.lAP.lAw != null) {
            if (this.lAP.lAx.booleanValue()) {
                this.a(lxf.top.bD(new Object[0]).exA() + " : ", this.lAP.lAw, iab.lqz.cJJ(), iab.lqz.cJL());
            } else {
                this.a(lxf.top.bD(new Object[0]).exA(), this.lAP.lAw, iab.lqz.cJJ(), iab.lqz.cJL());
            }
        }
        if (this.lAP.lAy != null) {
            this.b(lxf.toC.bD(new Object[0]).exA(), iab.lqz.cJH(), true);
            object2 = lvm.sWX.bD((int)this.lAP.lAy).exA();
            this.a(((String)object2).toUpperCase(), String.valueOf(this.lAP.lAz.floatValue()), this.lAP.lAA, this.lAP.lAA);
            if (this.lAP.lAB != null) {
                String n2 = lvm.sWX.bD((int)this.lAP.lAB).exA();
                this.a(n2.toUpperCase(), String.valueOf(this.lAP.lAC.floatValue()), this.lAP.lAD, this.lAP.lAD);
            }
        }
        if (this.lAP.lAE != null) {
            this.b(this.lAP.lAE.toUpperCase(), this.lAP.lAF != false ? iab.lqz.cJN() : iab.lqz.cJM(), false);
        }
        if (this.lAP.lAG != null) {
            this.b(this.lAP.lAG.esI(), iab.lqz.cJR(), false);
        }
        if (this.lAP.lAM != null) {
            this.b(this.lAP.lAM.toUpperCase(), iab.lqz.cJN(), false);
        }
        if (this.lAP.primaryDye != 0) {
            object2 = lea.epO().get(this.lAP.primaryDye);
            String string2 = lxf.toX.bD(new Object[0]).exA().toUpperCase();
            object = lxf.tod.bD(((cab)object2).az()).exA();
            string = lxf.toZ.bD(new Object[0]).exA().toUpperCase();
            this.a(string2, (String)object, string, iab.lqz.cJQ(), iab.lqz.cJQ(), "#" + String.format("%04X", ((cab)object2).aFK()));
        }
        if (this.lAP.secondaryDye != 0) {
            object2 = lea.epO().get(this.lAP.secondaryDye);
            String string3 = lxf.toY.bD(new Object[0]).exA().toUpperCase();
            object = lxf.tod.bD(((cab)object2).az()).exA();
            string = lxf.toZ.bD(new Object[0]).exA().toUpperCase();
            this.a(string3, (String)object, string, iab.lqz.cJQ(), iab.lqz.cJQ(), "#" + String.format("%04X", ((cab)object2).aFK()));
        }
        if (this.lAP.lAI != null) {
            this.b(this.lAP.lAI, iab.lqz.cJN(), false);
        }
        if (this.lAP.lAJ != null) {
            this.b(this.lAP.lAJ, iab.lqz.cJN(), false);
        }
        if (this.lAP.lAK != null) {
            this.b(this.lAP.lAK, iab.lqz.cJN(), false);
        }
        if (this.lAP.lAL != null) {
            this.b(this.lAP.lAL, iab.lqz.cJN(), false);
        }
        object2 = "";
        if (this.lAP.lAH != null) {
            object2 = "\n" + this.lAP.lAH + "\n";
        }
        if (this.fyi >= 0 && (ctu2 = cwy.bm(this.fyi, this.lAP.lzV)) != null) {
            this.lAR.add(isg.b(isf.mwM, this.dOX, 0xFFFFFF, isg.rh(lwt.thK.bD(new Object[0]).exA())));
            this.lAR.add("");
            if (this.lAU == 3) {
                this.lAR.add("");
            }
            ++this.lAT;
            object = ctu2.Ingredients;
            int n3 = ((Object)object).length;
            for (int j = 0; j < n3; ++j) {
                Object object3 = object[j];
                int n4 = ((ctm)object3).asi;
                String string4 = lvm.sXa.bD(((ctm)object3).ResourceType).exA();
                int n5 = hso.cxK().cxP().cza().OJ(((ctm)object3).ResourceType);
                boolean bl = n5 >= n4;
                int n6 = bl ? 0xFFFFFF : 0xFF0000;
                this.lAR.add(isg.b(isf.mwM, this.dOX, n6, n4 + ""));
                this.lAR.add(isg.b(isf.mwM, this.dOX, n6, isg.a(ish.mwS, string4.toUpperCase() + " [" + n5 + "]")));
                if (this.lAU == 3) {
                    this.lAR.add("");
                }
                ++this.lAT;
            }
        }
        if ((object = hc.getAccessLevelType(n = hso.cxK().cxP().cyZ().cAv())) != null && ((hc)((Object)object)).lh()) {
            this.b(lea.enW().getName(this.lAP.lzV), iab.lqz.cJN(), false);
        }
        String string5 = isg.b(isf.mwM, this.dOX + 2, 0xFFFFFF, this.lAS == null || this.lAS.cBu() == null ? lvm.sXa.bD(this.lAP.lzV).exA().toUpperCase() : hwo.z(this.lAS.cBu()).toUpperCase());
        string5 = string5 + "\n";
        string5 = string5 + isg.b(isf.mwM, this.dOX + 2, 0xFFFFFF, lvm.sXb.bD(this.lAP.lzV).exA());
        this.lAO = new SFTooltipBaseDTO();
        this.lAO.autoSizeColumns = true;
        this.lAO.cellPaddingY = 0;
        this.lAO.cellPaddingX = 2;
        this.lAO.table = !this.lAR.isEmpty();
        this.lAO.header = true;
        this.lAO.headerHTMLText = string5;
        this.lAO.columnCount = this.lAR.isEmpty() ? 0 : this.lAU;
        this.lAO.rowCount = this.lAR.isEmpty() ? 0 : this.lAT;
        this.lAO.tableCellsHTMLText = this.lAR;
    }

    public boolean cKb() {
        return !this.lAR.isEmpty() && this.lAT > 0 || this.jD != null;
    }

    public SFTooltipBaseDTO cKc() {
        return this.lAO;
    }
}

