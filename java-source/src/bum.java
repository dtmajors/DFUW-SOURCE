/*
 * Decompiled with CFR.
 */
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bum {
    private static ljq if = null;
    private static Map<ldv, lgl> dOb = null;
    private static bul dOc = null;
    private static bum dOd = new bum();
    private static boolean dOe = false;
    private static boolean dOf = false;
    private static lgl dOg = new lgl(0.0f, 0.0f, 0.0f, 1.0f);

    private bum() {
        if = new ljq();
        dOb = lcn.emw();
        dOc = new bul();
    }

    public static ljq getCameraPosition() {
        return if;
    }

    public static void aU(ljq ljq2) {
        if (ljq2 == null) {
            lfn.b(5, "SFTargetingInfo", "setCameraPosition() Position is null.");
            return;
        }
        if = ljq2;
    }

    public static lgl jN(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFTargetingInfo", "getPlayerViewDirection() PlayerGUID is null.");
            return null;
        }
        lgl lgl2 = dOb.get(ldv2);
        if (lgl2 == null) {
            lfn.b(5, "SFTargetingInfo", "getPlayerViewDirection() There is no view direction for player guid : " + ldv2);
            for (ldv ldv3 : dOb.keySet()) {
                lfn.b(5, "SFTargetingInfo", "getPlayerViewDirection() View direction for guid : " + ldv2);
            }
            return null;
        }
        lgl lgl3 = dOg.eqV();
        lgl3.Y(dOb.get(ldv2).eqV());
        lgl3.normalize();
        return lgl3;
    }

    public static void g(lgl lgl2) {
        dOg = lgl2;
    }

    public static void a(ldv ldv2, lgl lgl2) {
        if (ldv2 == null) {
            lfn.b(5, "SFTargetingInfo", "setPlayerViewDirection() PlayerGUID is null.");
            return;
        }
        if (lgl2 == null) {
            lfn.b(5, "SFTargetingInfo", "setPlayerViewDirection() ViewDirection is null.");
            return;
        }
        dOb.put(ldv2, lgl2);
    }

    public static bul aym() {
        return dOc;
    }

    public static boolean ayn() {
        return dOe;
    }

    public static void el(boolean bl2) {
        dOe = bl2;
    }

    public static boolean ayo() {
        return dOf;
    }

    public static void em(boolean bl2) {
        dOf = bl2;
    }
}

