/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class awf {
    private final awh crs;
    private final boolean crt;
    private final awm cru;
    private final String Value;
    private final boolean crv;
    private static awu[] crw = new awu[]{new axb(), new axe(), new aww(), new awv(), new awx(), new axh(), new axf(), new axi(), new axg(), new axj(), new awy(), new axc(), new awz(), new axd(), new axa()};

    public awf(awh awh2, boolean bl, awm awm2, String string, boolean bl2) {
        this.crs = awh2;
        this.crt = bl;
        this.cru = awm2;
        this.Value = string;
        this.crv = bl2;
    }

    public String toString() {
        return "SFChatFilterMatchItem[Type=" + (Object)((Object)this.crs) + ", Inverted=" + this.crt + ", Var=" + (Object)((Object)this.cru) + ", Value='" + this.Value + "'" + ", CheckAll=" + this.crv + "]";
    }

    public boolean c(awi awi2) {
        awu awu2 = crw[this.crs.ordinal()];
        awj awj2 = awi2.b(this.cru);
        if (awj2 == null) {
            assert (false);
            return false;
        }
        if (awj2.crA.crD == awq.crM) {
            awp awp2 = (awp)awj2;
            Set<String> set = awp2.Xq();
            if (set == null) {
                boolean bl = awu2.d(null, awi2.ez(this.Value));
                if (this.crt) {
                    bl = !bl;
                }
                return bl;
            }
            boolean bl = false;
            if (this.crv) {
                bl = true;
                for (String string : set) {
                    boolean bl2 = awu2.d(string, awi2.ez(this.Value));
                    if (this.crt) {
                        bl2 = !bl2;
                    }
                    bl = bl && bl2;
                }
            } else {
                for (String string : set) {
                    boolean bl3 = awu2.d(string, awi2.ez(this.Value));
                    if (this.crt) {
                        boolean bl4 = bl3 = !bl3;
                    }
                    if (!bl3) continue;
                    bl = true;
                    break;
                }
            }
            return bl;
        }
        boolean bl = awu2.d(awj2.get(), awi2.ez(this.Value));
        if (this.crt) {
            bl = !bl;
        }
        return bl;
    }
}

