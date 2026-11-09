/*
 * Decompiled with CFR.
 */
public final class igm
extends Enum<igm> {
    public static final /* enum */ igm lSB = new igm(hyy.b.lsz, "CHARACTER_DEVELOPMENT", 16738581, "CharacterDevelopmentLarge.png", "CharacterDevelopmentSmall.png", lww.tjh);
    public static final /* enum */ igm lSC = new igm(hyy.b.lsv, "CLAN", 9802753, "ClanLarge.png", "ClanSmall.png", lww.tji);
    public static final /* enum */ igm lSD = new igm(hyy.b.lst, "CRAFTING", 8669186, "CraftingLarge.png", "CraftingSmall.png", lww.tjc);
    public static final /* enum */ igm lSE = new igm(null, "EVENTS", 8341239, "EventsLarge.png", "EventsSmall.png", lww.tjl);
    public static final /* enum */ igm lSF = new igm(hyy.b.lsw, "EXPLORATION", 2722024, "ExplorationLarge.png", "ExplorationSmall.png", lww.tje);
    public static final /* enum */ igm lSG = new igm(hyy.b.lss, "HARVESTING", 8489596, "HarvestingLarge.png", "HarvestingSmall.png", lww.tjd);
    public static final /* enum */ igm lSH = new igm(hyy.b.lsx, "HOUSING", 8341239, "HousingLarge.png", "HousingSmall.png", lww.tjk);
    public static final /* enum */ igm lSI = new igm(hyy.b.lsr, "PVE", 720200, "PvELarge.png", "PvESmall.png", lww.tjf);
    public static final /* enum */ igm lSJ = new igm(hyy.b.lsu, "PVP", 13969470, "PvPLarge.png", "PvPSmall.png", lww.tjg);
    public static final /* enum */ igm lSK = new igm(hyy.b.lsy, "SOCIAL", 9818623, "SocialLarge.png", "SocialSmall.png", lww.tjj);
    public static final /* enum */ igm lSL = new igm(hyy.b.lsq, "START", 0xFFFFFF, "StartLarge.png", "StartSmall.png", lww.tjb);
    private hyy.b lSM;
    private String lRG;
    private int lSN;
    private String lSO;
    private String lSP;
    private lox lGm;
    private static final /* synthetic */ igm[] lSQ;

    public static igm[] values() {
        return (igm[])lSQ.clone();
    }

    public static igm valueOf(String string) {
        return Enum.valueOf(igm.class, string);
    }

    private igm(hyy.b b2, String string2, int n2, String string3, String string4, lox lox2) {
        this.lSM = b2;
        this.lRG = string2;
        this.lSN = n2;
        this.lSO = "texture/gui/runtime/feats/" + string3;
        this.lSP = "texture/gui/runtime/feats/" + string4;
        this.lGm = lox2;
    }

    public hyy.b cTj() {
        return this.lSM;
    }

    public String ym() {
        return this.lRG;
    }

    public int Hr() {
        return this.lSN;
    }

    public String cTk() {
        return this.lSO;
    }

    public String cTl() {
        return this.lSP;
    }

    public lox cNq() {
        return this.lGm;
    }

    public static igm findCategoryFromTag(String string) {
        for (igm igm2 : igm.values()) {
            if (!igm2.ym().equalsIgnoreCase(string)) continue;
            return igm2;
        }
        return null;
    }

    public String cTm() {
        switch (this) {
            case lSL: {
                return "starting";
            }
            case lSI: {
                return "pve";
            }
            case lSG: {
                return "harvesting";
            }
            case lSD: {
                return "crafting";
            }
            case lSJ: {
                return "pvp";
            }
            case lSC: {
                return "clan";
            }
            case lSF: {
                return "exploration";
            }
            case lSH: {
                return "housing";
            }
            case lSE: {
                return "events";
            }
            case lSK: {
                return "social";
            }
            case lSB: {
                return "character";
            }
        }
        assert (false);
        return null;
    }

    public String cTn() {
        return "texture/gui/runtime/featsnew/category_icons_main_" + this.cTm() + "/category_icons_main_" + this.cTm() + "_off_normal.png";
    }

    public String cTo() {
        return "texture/gui/runtime/featsnew/category_framed/category_icons_framed_" + this.cTm() + ".png";
    }

    public String cTp() {
        return "texture/gui/runtime/featsnew/category_framed_17x17/category_icons_framed_" + this.cTm() + "_17x17.png";
    }

    static {
        lSQ = new igm[]{lSB, lSC, lSD, lSE, lSF, lSG, lSH, lSI, lSJ, lSK, lSL};
    }
}

