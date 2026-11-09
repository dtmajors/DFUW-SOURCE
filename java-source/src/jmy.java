/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum jmy {
    nCw(0, "w", lvt.sZX),
    nCx(nCw),
    nCy(1, "r", lvt.sZY),
    nCz(nCy),
    nCA(2, "party_invite", lvt.sZZ),
    nCB(nCA),
    nCC(3, "p", lvt.taa),
    nCD(nCC),
    nCE(4, "c", lvt.tab),
    nCF(nCE),
    nCG(5, "party_kick", lvt.tac),
    nCH(nCG),
    nCI(6, "friend_add", lvt.tad),
    nCJ(7, "friend_block", lvt.tae),
    nCK(8, "party_promote", lvt.taf),
    nCL(9, "clan_invite", lvt.tag),
    nCM(10, "clan_kick", lvt.tah),
    nCN(11, "gmhelp", lvt.tai),
    nCO(12, "gmreport", lvt.taj),
    nCP(13, "roll", lvt.tak),
    nCQ(14, "stuck", lvt.tal),
    nCR(15, "banplayer", lvt.tam),
    nCS(16, "kickplayer", lvt.tan),
    nCT(17, "attachtoplayer", lvt.tao),
    nCU(18, "teleporttoplayer", lvt.tap),
    nCV(19, "quickteleporttoplayer", lvt.taq);

    public final int cck;
    public final String akV;
    public final lox lOI;
    public static final List<jmy> Values;

    public static jmy getValueById(int n) {
        for (jmy jmy2 : Values) {
            if (jmy2.cck != n) continue;
            return jmy2;
        }
        return null;
    }

    public static jmy getValueByName(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        for (jmy jmy2 : Values) {
            if (!jmy2.lOI.bD(new Object[0]).exA().toLowerCase().equals(string.toLowerCase())) continue;
            return jmy2;
        }
        return null;
    }

    private jmy(int n2, String string2, lox lox2) {
        this.cck = n2;
        this.akV = string2;
        this.lOI = lox2;
    }

    private jmy(jmy jmy2) {
        this.cck = jmy2.cck;
        this.akV = jmy2.akV;
        this.lOI = jmy2.lOI;
    }

    static {
        Values = Collections.unmodifiableList(Arrays.asList(jmy.class.getEnumConstants()));
    }
}

