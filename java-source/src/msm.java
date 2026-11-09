/*
 * Decompiled with CFR.
 */
public class msm {
    public mss b(msf msf2) {
        cgr cgr2 = msf2.eNq();
        cgi cgi2 = cgr2.eyU.aOG();
        if (cgi2 == null) {
            return null;
        }
        switch (cgi2) {
            case ATTRIBUTE_LEVEL: {
                return new msq(msf2).eOc();
            }
            case BREAK_ITEM: {
                return new mst(msf2).eOc();
            }
            case BUY: {
                return new msu(msf2).eOc();
            }
            case CRAFTING: {
                return new msv(msf2).eOc();
            }
            case ATTRIBUTE: {
                return new msr(msf2).eOc();
            }
            case LIFE_MODE_CHANGES: {
                return new mtc(msf2).eOc();
            }
            case EXPLORATION: {
                return new msx(msf2).eOc();
            }
            case FEAT: {
                return new msy(msf2).eOc();
            }
            case GUI: {
                return new msz(msf2).eOc();
            }
            case HARVEST: {
                return new mta(msf2).eOc();
            }
            case HOUSING: {
                return new mtb(msf2).eOc();
            }
            case PROWESS_GAIN: {
                return new mtd(msf2).eOc();
            }
            case SELL: {
                return new mte(msf2).eOc();
            }
            case SKILL_LEVEL: {
                return new mtf(msf2).eOc();
            }
            case SKILL: {
                return new mtg(msf2).eOc();
            }
            case SKIN: {
                return new mth(msf2).eOc();
            }
            case SOCIAL: {
                return new mti(msf2).eOc();
            }
            case SPAWNING: {
                return new mtj(msf2).eOc();
            }
            case TRANSFER: {
                return new mtk(msf2).eOc();
            }
        }
        return new mtl(msf2).eOc();
    }
}

