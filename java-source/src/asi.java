/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  ash
 */
import java.util.List;

public class asi {
    public static boolean bVw = false;
    private static List<lfs<ash, ari>> bVx = lcn.emv();

    public static void a(ash ash2, ard ard2) {
        if (bVx.isEmpty()) {
            return;
        }
        lfs<ash, ari> lfs2 = bVx.remove(0);
        assert (lfs2.reX == ash2);
        ((ari)lfs2.reY).a(ard2);
        ((ash)asi.bVx.get((int)0).reX).Tr();
    }

    public static void a(ash ash2, ari ari2) {
        lfs<ash, ari> lfs2 = new lfs<ash, ari>(ash2, ari2);
        bVx.add(lfs2);
        if (bVx.size() > 1) {
            bVw = true;
        } else {
            ash2.Tr();
        }
    }

    public static void TM() {
        if (bVx.isEmpty()) {
            return;
        }
        ((ash)asi.bVx.remove((int)0).reX).Tr();
    }

    private asi() {
    }
}

