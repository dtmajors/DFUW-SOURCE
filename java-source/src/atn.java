/*
 * Decompiled with CFR.
 */
public class atn
extends ato {
    public static final boolean bYN = false;
    public static final boolean bYO = true;
    private static boolean bYP = false;
    private static boolean bYQ = true;

    @Override
    public void a(atk atk2) {
        if (atk2.Vk().getValue() != atn.Vt()) {
            atn.bW(atk2.Vk().getValue());
        }
        if (atk2.Vl().getValue() != atn.Vu()) {
            atn.bX(atk2.Vl().getValue());
        }
    }

    public static boolean Vt() {
        return bYP;
    }

    public static void bW(boolean bl) {
        bYP = bl;
    }

    public static final boolean Vu() {
        return bYQ;
    }

    public static final void bX(boolean bl) {
        bYQ = bl;
    }
}

