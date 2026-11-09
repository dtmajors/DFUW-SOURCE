/*
 * Decompiled with CFR.
 */
import java.util.Map;

public enum jhv {
    nfP(lyy.tMa, ain.bnr),
    nfQ(lyy.tMb, ain.bns, ain.bnt, ain.bnu, ain.bnv, ain.bnw, ain.bnx, ain.bny, ain.bnz, ain.bnA, ain.bnB),
    nfR(lyy.tMc, ain.bnC),
    nfS(lyy.tMd, ain.bnD);

    public final lox nfT;
    public final ain[] nfU;
    public static final Map<ain, jhv> nfV;

    private jhv(lox lox2, ain ... ainArray) {
        this.nfT = lox2;
        this.nfU = ainArray;
    }

    public boolean a(jhw jhw2) {
        boolean bl = false;
        for (ain ain2 : this.nfU) {
            bl = jid.dHb().e(ain2).a(jhw2) || bl;
        }
        return bl;
    }

    public boolean a(jib jib2) {
        boolean bl = false;
        for (ain ain2 : this.nfU) {
            bl = jid.dHb().e(ain2).a(jib2) || bl;
        }
        return bl;
    }

    public boolean dGG() {
        for (ain ain2 : this.nfU) {
            jhy jhy2 = jid.dHb().e(ain2);
            if (jhy2 == null || !jid.dHb().e(ain2).dGG()) continue;
            return true;
        }
        return false;
    }

    public boolean b(ain ain2) {
        return nfV.get((Object)ain2) == this;
    }

    public String cCU() {
        String string = "";
        switch (this) {
            case nfP: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_category_mounts/button_category_mounts_off_normal.png";
                break;
            }
            case nfQ: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_category_weapons/button_category_weapons_off_normal.png";
                break;
            }
            case nfR: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_category_shields/button_category_shields_off_normal.png";
                break;
            }
            case nfS: {
                string = "/dfdata/texture/gui/j2f/gearguise/button_category_gank/button_category_gank_off_normal.png";
            }
        }
        return string;
    }

    static {
        nfV = lcn.emw();
        for (jhv jhv2 : jhv.values()) {
            for (ain ain2 : jhv2.nfU) {
                nfV.put(ain2, jhv2);
            }
        }
    }
}

