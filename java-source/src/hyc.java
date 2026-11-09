/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum hyc {
    lmI(0, "BACKPACK", lyi.tEk, jmq.nzR),
    lmJ(1, "WORLDMAP", lyi.tEl, jmq.nAb),
    lmK(2, "MINIMAP", null, null),
    lmL(3, "CHAT", lyi.tEm, jmq.nzS),
    lmM(4, "SKILLS_LIST", lyi.tEn, jmq.nzT),
    lmN(5, "VIDEO_OPTIONS", lyi.tEo, jmq.nAa),
    lmO(6, "ROLE_MANAGEMENT", lyi.tEp, jmq.nzW),
    lmP(7, "CLAN_MENU", lyi.tEq, null),
    lmQ(8, "FEATS", lyi.tEs, jmq.nzY),
    lmR(9, "PAPERDOLL", lyi.tEt, jmq.nzV),
    lmS(10, "SOCIAL", lyi.tiP, null),
    lmT(11, "QUIT", lyi.tEu, null),
    lmU(12, "HOUSING", lyi.tEw, null),
    lmV(13, "HELP", lyi.tEy, null),
    lmW(14, "MARKET", lyi.trt, null),
    lmX(15, "TRACKER", lyi.tEz, null),
    lmY(16, "SHOP", lyi.tBp, null),
    lmZ(17, "EDIT_HUD", lyi.tFg, null),
    lna(18, "UNLOCKABLES", lyi.tFh, null),
    lnb(19, "QUESTS", lyi.txQ, null),
    lnc(20, "EVENTS", lyi.tFi, null),
    lnd(21, "LEADERBOARDS", lyi.tFj, null);

    public final int cck;
    public final String Name;
    public final lox lne;
    public final jmq lnf;
    public static final List<hyc> Values;

    public static final int getValueCount() {
        return Values.size();
    }

    public static boolean isValidId(int n) {
        for (hyc hyc2 : Values) {
            if (hyc2.cck != n) continue;
            return true;
        }
        return false;
    }

    public static hyc getValueById(int n) {
        for (hyc hyc2 : Values) {
            if (hyc2.cck != n) continue;
            return hyc2;
        }
        return null;
    }

    public static hyc getValueByName(String string) {
        for (hyc hyc2 : Values) {
            if (!hyc2.Name.equalsIgnoreCase(string)) continue;
            return hyc2;
        }
        return null;
    }

    private hyc(int n2, String string2, lox lox2, jmq jmq2) {
        this.lne = lox2;
        this.cck = n2;
        this.Name = string2;
        this.lnf = jmq2;
    }

    public String cDL() {
        loz loz2;
        if (this.lnf != null && (loz2 = jjd.h(this.lnf)) != null) {
            return loz2.exA();
        }
        return "";
    }

    static {
        Values = Collections.unmodifiableList(Arrays.asList(hyc.class.getEnumConstants()));
    }
}

