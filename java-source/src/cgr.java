/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  ep
 */
import java.util.List;

public class cgr {
    public int eyG;
    public int eyL;
    public int adk;
    public cgj eyM = cgj.exY;
    public String Name;
    public lox DisplayName;
    public boolean bdP;
    public List<String> eyN;
    public float eyO;
    public boolean eyP;
    public boolean eyQ;
    public boolean eyR;
    public boolean eyS;
    public cgv eyT;
    public lox bfJ;
    public che eyU;
    public cgs eyV;
    public cgt eyK;
    public boolean eyW = false;
    public String eyX;
    public Object[] Parameters = null;
    public String eyY;
    public String eyZ;

    public Object[] getParameters() {
        if (this.Parameters != null) {
            return this.Parameters;
        }
        if (this.eyU == null) {
            return null;
        }
        int n = (int)this.eyU.aFv;
        switch (this.eyU.aOG()) {
            case ATTRIBUTE: {
                chd chd2 = (chd)this.eyU;
                int n2 = chd2.ResourceType != -1 ? chd2.ResourceType : cug.fkp;
                String string = chd2.bnM != -1 ? ep.aM((int)chd2.bnM) : ep.aM((int)2112);
                int n3 = chd2.ezX != -1 ? chd2.ezX : cug.fkp;
                int n4 = chd2.SkillType != -1 ? chd2.SkillType : cxd.fIx;
                int n5 = cug.fkp;
                int n6 = cug.fkp;
                String string2 = lea.epw().ro(0).getName();
                String string3 = "";
                String string4 = "";
                this.Parameters = new Object[]{n2, n3, n4, n5, n6, n, string2, "", "", string};
                break;
            }
            case BREAK_ITEM: {
                chf chf2 = (chf)this.eyU;
                int n7 = chf2.ResourceType != -1 ? chf2.ResourceType : cug.fkp;
                String string = ep.aM((int)2112);
                int n8 = cug.fkp;
                int n9 = cxd.fIx;
                int n10 = cug.fkp;
                int n11 = cug.fkp;
                String string5 = lea.epw().ro(0).getName();
                String string6 = "";
                String string7 = "";
                this.Parameters = new Object[]{n7, n8, n9, n10, n11, n, string5, "", "", string};
                break;
            }
            case CRAFTING: {
                chh chh2 = (chh)this.eyU;
                int n12 = chh2.ResourceType != -1 ? chh2.ResourceType : cug.fkp;
                String string = ep.aM((int)2112);
                int n13 = cug.fkp;
                int n14 = chh2.SkillType != -1 ? chh2.SkillType : cxd.fIx;
                int n15 = cug.fkp;
                int n16 = cug.fkp;
                String string8 = lea.epw().ro(0).getName();
                String string9 = "";
                String string10 = "";
                this.Parameters = new Object[]{n12, n13, n14, n15, n16, n, string8, "", "", string};
                break;
            }
            case EXPLORATION: {
                chj chj2 = (chj)this.eyU;
                int n17 = cug.fkp;
                String string = ep.aM((int)2112);
                int n18 = cug.fkp;
                int n19 = cxd.fIx;
                int n20 = cug.fkp;
                int n21 = cug.fkp;
                String string11 = lea.epw().ro(0).getName();
                String string12 = chj2.ezY != null ? chj2.ezY.toLowerCase() : "";
                String string13 = chj2.ezY != null ? chj2.ezY.toLowerCase() : "";
                this.Parameters = new Object[]{n17, n18, n19, n20, n21, n, string11, string12, string13, string};
                break;
            }
            case BUY: {
                chg chg2 = (chg)this.eyU;
                int n22 = cug.fkp;
                String string = ep.aM((int)2112);
                int n23 = cug.fkp;
                int n24 = cxd.fIx;
                String string14 = lea.epw().ro(0).getName();
                cgd cgd2 = cgd.getValueByOrdinal(chg2.ObjectType);
                switch (cgd2) {
                    case ewS: {
                        string14 = chg2.bSL != -1 ? lea.epw().ro(chg2.bSL).getName() : string14;
                        break;
                    }
                    case ewT: {
                        n24 = chg2.bSL != -1 ? chg2.bSL : cxd.fIx;
                        break;
                    }
                    case ewU: {
                        n22 = chg2.bSL != -1 ? chg2.bSL : cug.fkp;
                    }
                }
                int n25 = cug.fkp;
                int n26 = cug.fkp;
                String string15 = "";
                String string16 = "";
                this.Parameters = new Object[]{n22, n23, n24, n25, n26, n, string14, "", "", string};
                break;
            }
            case HARVEST: {
                chm chm2 = (chm)this.eyU;
                int n27 = chm2.ResourceType != -1 ? chm2.ResourceType : cug.fkp;
                String string = ep.aM((int)2112);
                int n28 = cug.fkp;
                int n29 = cxd.fIx;
                int n30 = chm2.eAc != -1 ? chm2.eAc : cug.fkp;
                int n31 = cug.fkp;
                String string17 = lea.epw().ro(0).getName();
                String string18 = "";
                String string19 = "";
                this.Parameters = new Object[]{n27, n28, n29, n30, n31, n, string17, "", "", string};
                break;
            }
            case OPEN_CHEST: {
                chp chp2 = (chp)this.eyU;
                int n32 = chp2.cwg;
                String string = ep.aM((int)2112);
                int n33 = cug.fkp;
                int n34 = cxd.fIx;
                int n35 = cug.fkp;
                int n36 = cug.fkp;
                String string20 = lea.epw().ro(0).getName();
                String string21 = "";
                String string22 = "";
                this.Parameters = new Object[]{n32, n33, n34, n35, n36, n, string20, "", "", string};
                break;
            }
            case LIFE_MODE_CHANGES: {
                cho cho2 = (cho)this.eyU;
                int n37 = cho2.ResourceType != -1 ? cho2.ResourceType : cug.fkp;
                String string = ep.aM((int)2112);
                int n38 = cho2.ezX != -1 ? cho2.ezX : cug.fkp;
                int n39 = cho2.SkillType != -1 ? cho2.SkillType : cxd.fIx;
                int n40 = cug.fkp;
                int n41 = cug.fkp;
                String string23 = lea.epw().ro(0).getName();
                String string24 = "";
                String string25 = "";
                this.Parameters = new Object[]{n37, n38, n39, n40, n41, n, string23, "", "", string};
                break;
            }
            case SKILL: {
                cht cht2 = (cht)this.eyU;
                int n42 = cht2.ResourceType != -1 ? cht2.ResourceType : cug.fkp;
                String string = ep.aM((int)2112);
                int n43 = cug.fkp;
                int n44 = cht2.SkillType != -1 ? cht2.SkillType : cxd.fIx;
                int n45 = cug.fkp;
                int n46 = cug.fkp;
                String string26 = lea.epw().ro(0).getName();
                String string27 = "";
                String string28 = "";
                this.Parameters = new Object[]{n42, n43, n44, n45, n46, n, string26, "", "", string};
                break;
            }
            case SKILL_LEVEL: {
                chs chs2 = (chs)this.eyU;
                int n47 = cug.fkp;
                String string = ep.aM((int)2112);
                int n48 = cug.fkp;
                int n49 = chs2.SkillType != -1 ? chs2.SkillType : cxd.fIx;
                int n50 = cug.fkp;
                int n51 = cug.fkp;
                String string29 = lea.epw().ro(0).getName();
                String string30 = "";
                String string31 = "";
                this.Parameters = new Object[]{n47, n48, n49, n50, n51, n, string29, "", "", string};
                break;
            }
            case ATTRIBUTE_LEVEL: {
                chc chc2 = (chc)this.eyU;
                int n52 = cug.fkp;
                String string = chc2.bnM != -1 ? ep.aM((int)chc2.bnM) : ep.aM((int)2112);
                int n53 = cug.fkp;
                int n54 = cxd.fIx;
                int n55 = cug.fkp;
                int n56 = cug.fkp;
                String string32 = lea.epw().ro(0).getName();
                String string33 = "";
                String string34 = "";
                this.Parameters = new Object[]{n52, n53, n54, n55, n56, n, string32, "", "", string};
                break;
            }
            case SKIN: {
                chu chu2 = (chu)this.eyU;
                int n57 = chu2.ResourceType != -1 ? chu2.ResourceType : cug.fkp;
                String string = ep.aM((int)2112);
                int n58 = cug.fkp;
                int n59 = cxd.fIx;
                int n60 = cug.fkp;
                int n61 = cug.fkp;
                String string35 = lea.epw().ro(0).getName();
                String string36 = "";
                String string37 = "";
                this.Parameters = new Object[]{n57, n58, n59, n60, n61, n, string35, "", "", string};
                break;
            }
            case SPAWNING: {
                chw chw2 = (chw)this.eyU;
                int n62 = chw2.ResourceType != -1 ? chw2.ResourceType : cug.fkp;
                String string = ep.aM((int)2112);
                int n63 = cug.fkp;
                int n64 = cxd.fIx;
                int n65 = cug.fkp;
                int n66 = cug.fkp;
                String string38 = lea.epw().ro(0).getName();
                String string39 = "";
                String string40 = "";
                this.Parameters = new Object[]{n62, n63, n64, n65, n66, n, string38, "", "", string};
                break;
            }
            case TRANSFER: {
                chx chx2 = (chx)this.eyU;
                int n67 = chx2.ResourceType != -1 ? chx2.ResourceType : cug.fkp;
                int n68 = chx2.eAk != -1 ? chx2.eAk : cug.fkp;
                String string = ep.aM((int)2112);
                int n69 = cug.fkp;
                int n70 = cxd.fIx;
                int n71 = cug.fkp;
                String string41 = lea.epw().ro(0).getName();
                String string42 = "";
                String string43 = "";
                this.Parameters = new Object[]{n67, n69, n70, n71, n68, n, string41, "", "", string};
                break;
            }
            default: {
                this.Parameters = new Object[]{cug.fkp, cug.fkp, cxd.fIx, cug.fkp, cug.fkp, n, "", "", "", ep.aM((int)2112)};
                break;
            }
            case SELL: {
                chr chr2 = (chr)this.eyU;
                int n72 = chr2.ResourceType != -1 ? chr2.ResourceType : cug.fkp;
                this.Parameters = new Object[]{n72, cug.fkp, cxd.fIx, cug.fkp, cug.fkp, n, "", "", "", ep.aM((int)2112)};
            }
        }
        return this.Parameters;
    }

    public loz aOC() {
        return this.DisplayName != null ? this.DisplayName.bD(this.getParameters()) : null;
    }

    public String getDisplayName() {
        return this.DisplayName != null ? this.DisplayName.bD(this.getParameters()).exA() : "";
    }

    public String aOD() {
        return this.getDisplayName() + " Stat";
    }

    public String aOE() {
        return this.Name.replace(" ", "_").toLowerCase() + "_stat";
    }

    public String aOF() {
        return this.Name.replace(" ", "_").toUpperCase();
    }

    public String getDescription() {
        return this.bfJ != null ? this.bfJ.bD(this.getParameters()).exA() : "";
    }
}

