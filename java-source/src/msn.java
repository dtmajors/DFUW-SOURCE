/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class msn {
    public static che e(cgi cgi2) {
        if (cgi2 == null) {
            return null;
        }
        switch (cgi2) {
            case ATTRIBUTE_LEVEL: {
                return new chc();
            }
            case BREAK_ITEM: {
                return new chf();
            }
            case BUY: {
                return new chg();
            }
            case CRAFTING: {
                return new chh();
            }
            case ATTRIBUTE: {
                return new chd();
            }
            case LIFE_MODE_CHANGES: {
                return new cho();
            }
            case EXPLORATION: {
                return new chj();
            }
            case FEAT: {
                return new chk();
            }
            case GUI: {
                return new chl();
            }
            case HARVEST: {
                return new chm();
            }
            case HOUSING: {
                return new chn();
            }
            case PROWESS_GAIN: {
                return new chq();
            }
            case SELL: {
                return new chr();
            }
            case SKILL_LEVEL: {
                return new chs();
            }
            case SKILL: {
                return new cht();
            }
            case SKIN: {
                return new chu();
            }
            case SOCIAL: {
                return new chv();
            }
            case SPAWNING: {
                return new chw();
            }
            case TRANSFER: {
                return new chx();
            }
        }
        return new chc();
    }

    public static che a(che che2) {
        cgi cgi2 = che2.aOG();
        if (cgi2 == null) {
            return null;
        }
        switch (cgi2) {
            case ATTRIBUTE_LEVEL: {
                chc chc2 = new chc();
                chc chc3 = (chc)che2;
                chc2.ezI = chc3.ezI;
                chc2.bnM = chc3.bnM;
                chc2.aFv = chc3.aFv;
                return chc2;
            }
            case BREAK_ITEM: {
                chf chf2 = new chf();
                chf chf3 = (chf)che2;
                chf2.aFv = chf3.aFv;
                chf2.ResourceType = chf3.ResourceType;
                return chf2;
            }
            case BUY: {
                chg chg2 = new chg();
                chg chg3 = (chg)che2;
                chg2.aFv = chg3.aFv;
                chg2.ezM = chg3.ezM;
                chg2.ezN = chg3.ezN;
                chg2.bSL = chg3.bSL;
                chg2.ObjectType = chg3.ObjectType;
                chg2.ezO = chg3.ezO;
                return chg2;
            }
            case CRAFTING: {
                chh chh2 = new chh();
                chh chh3 = (chh)che2;
                chh2.aFv = chh3.aFv;
                chh2.ezP = chh3.ezP;
                chh2.ResourceType = chh3.ResourceType;
                chh2.SkillType = chh3.SkillType;
                return chh2;
            }
            case ATTRIBUTE: {
                chd chd2 = new chd();
                chd chd3 = (chd)che2;
                chd2.aFv = chd3.aFv;
                chd2.bnM = chd3.bnM;
                chd2.ezV = chd3.ezV;
                chd2.ezS = chd3.ezS;
                chd2.ezJ = chd3.ezJ;
                chd2.ezQ = chd3.ezQ;
                chd2.ezR = chd3.ezR;
                chd2.ezW = chd3.ezW;
                chd2.ResourceType = chd3.ResourceType;
                chd2.SkillType = chd3.ResourceType;
                chd2.ezU = chd3.ezU;
                chd2.ezT = chd3.ezT;
                chd2.ezK = chd3.ezK;
                chd2.ezX = chd3.ezX;
                return chd2;
            }
            case LIFE_MODE_CHANGES: {
                cho cho2 = new cho();
                cho cho3 = (cho)che2;
                cho2.aFv = cho3.aFv;
                cho2.eAe = cho3.eAe;
                cho2.ezV = cho3.ezV;
                cho2.ezS = cho3.ezS;
                cho2.dtZ = cho3.dtZ;
                cho2.ezQ = cho3.ezQ;
                cho2.ezR = cho3.ezR;
                cho2.ezW = cho3.ezW;
                cho2.ResourceType = cho3.ResourceType;
                cho2.SkillType = cho3.ResourceType;
                cho2.ezU = cho3.ezU;
                cho2.ezT = cho3.ezT;
                cho2.ezX = cho3.ezX;
                return cho2;
            }
            case EXPLORATION: {
                chj chj2 = new chj();
                chj chj3 = (chj)che2;
                chj2.aFv = chj3.aFv;
                chj2.ezY = chj3.ezY;
                chj2.abr = chj3.abr;
                return chj2;
            }
            case FEAT: {
                chk chk2 = new chk();
                chk chk3 = (chk)che2;
                chk2.aFv = chk3.aFv;
                chk2.ezZ = new ArrayList<String>();
                for (String string : chk3.ezZ) {
                    chk2.ezZ.add(string);
                }
                return chk2;
            }
            case GUI: {
                chl chl2 = new chl();
                chl chl3 = (chl)che2;
                chl2.aFv = chl3.aFv;
                chl2.eAa = chl3.eAa;
                chl2.eAb = chl3.eAb;
                return chl2;
            }
            case HARVEST: {
                chm chm2 = new chm();
                chm chm3 = (chm)che2;
                chm2.aFv = chm3.aFv;
                chm2.eAc = chm3.eAc;
                chm2.ResourceType = chm3.ResourceType;
                return chm2;
            }
            case HOUSING: {
                chn chn2 = new chn();
                chn chn3 = (chn)che2;
                chn2.aFv = chn3.aFv;
                chn2.eAd = chn3.eAd;
                return chn2;
            }
            case PROWESS_GAIN: {
                chq chq2 = new chq();
                chq chq3 = (chq)che2;
                chq2.aFv = chq3.aFv;
                chq2.eAf = chq3.eAf;
                chq2.cZn = chq3.cZn;
                return chq2;
            }
            case SELL: {
                chr chr2 = new chr();
                chr chr3 = (chr)che2;
                chr2.aFv = chr3.aFv;
                chr2.ResourceType = chr3.ResourceType;
                return chr2;
            }
            case SKILL_LEVEL: {
                chs chs2 = new chs();
                chs chs3 = (chs)che2;
                chs2.aFv = chs3.aFv;
                chs2.SkillLevel = chs3.SkillLevel;
                chs2.SkillType = chs3.SkillType;
                return chs2;
            }
            case SKILL: {
                cht cht2 = new cht();
                cht cht3 = (cht)che2;
                cht2.aFv = cht3.aFv;
                cht2.eAh = cht3.eAh;
                cht2.eAg = cht3.eAg;
                cht2.ResourceType = cht3.ResourceType;
                cht2.SkillType = cht3.SkillType;
                return cht2;
            }
            case SKIN: {
                chu chu2 = new chu();
                chu chu3 = (chu)che2;
                chu2.aFv = chu3.aFv;
                chu2.ResourceType = chu3.ResourceType;
                chu2.bBh = chu3.bBh;
                return chu2;
            }
            case SOCIAL: {
                chv chv2 = new chv();
                chv chv3 = (chv)che2;
                chv2.aFv = chv3.aFv;
                chv2.eAi = chv3.eAi;
                return chv2;
            }
            case SPAWNING: {
                chw chw2 = new chw();
                chw chw3 = (chw)che2;
                chw2.aFv = chw3.aFv;
                chw2.ResourceType = chw3.ResourceType;
                return chw2;
            }
            case TRANSFER: {
                chx chx2 = new chx();
                chx chx3 = (chx)che2;
                chx2.aFv = chx3.aFv;
                chx2.ResourceType = chx3.ResourceType;
                chx2.eAk = chx3.eAk;
                chx2.eAj = chx3.eAj;
                chx2.eyI = chx3.eyI;
                return chx2;
            }
        }
        return null;
    }
}

