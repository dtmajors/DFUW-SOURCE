/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hvy
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public enum jgu {
    nbh("REMOVE", lyf.tgZ, null),
    nbi("BLOCK_PLAYER", lyf.tDt, null),
    nbj("SUMMON_PLAYER_ENABLED", lyf.tDu, lyf.tDv),
    nbk("SUMMON_PLAYER_DISABLED", lyf.tDu, lyf.tDw),
    nbl("WHISPER_PLAYER_ENABLED", lyf.tDz, lyf.tDA),
    nbm("WHISPER_PLAYER_DISABLED", lyf.tDz, lyf.tDB),
    nbn("SEARCH_TOGGLE", lyf.tDC, lyf.tDD),
    nbo("CLEAR_SEARCH", lyf.tDE, lyf.tDF),
    nbp("PLAYER_SELECTION", lyf.tDG, lyf.tDH),
    nbq("SEND_REQUESTS", lyf.tDI, lyf.tDJ),
    nbr("ACCEPT_REQUEST", lyf.tDK, lyf.tDL),
    nbs("UNBLOCK_PLAYER", lyf.tDM, lyf.tDN),
    nbt("BLOCK_PLAYERS", lyf.tDO, lyf.tDP);

    public final String nbu;
    public final lox lXY;
    public final lox nbv;
    public static final List<jgu> lml;
    public static final Map<String, jgu> lmm;

    public static jgu getValueFromId(String string) {
        return lmm.get(string);
    }

    public static lfs<String, String> expandStrings(jgu jgu2) {
        if (jgu2 == null) {
            return null;
        }
        lfs<String, String> lfs2 = new lfs<String, String>();
        lfs2.reX = jgu2.lXY.bD(new Object[0]).exA();
        if (jgu2 == nbk) {
            cxc cxc2;
            hvy hvy2 = hso.cxK().cxP().cyZ();
            if (hvy2 != null && (cxc2 = hvy2.ht(cxd.fHi)) != null) {
                lfs2.reY = hvy2.re(cxc2.getGUID()) ? lyf.tDy.bD(hvy2.rf(cxc2.getGUID())).exA() : (!hvy2.cj(cxc2) ? lyf.tDx.bD(new Object[0]).exA() : lyf.tDw.bD(new Object[0]).exA());
            }
        } else if (jgu2.nbv != null) {
            lfs2.reY = jgu2.nbv.bD(new Object[0]).exA();
        }
        return lfs2;
    }

    private jgu(String string2, lox lox2, lox lox3) {
        this.nbu = string2;
        this.lXY = lox2;
        this.nbv = lox3;
    }

    static {
        lml = Collections.unmodifiableList(Arrays.asList(jgu.class.getEnumConstants()));
        lmm = lcn.emw();
        for (jgu jgu2 : lml) {
            lmm.put(jgu2.nbu, jgu2);
        }
    }
}

