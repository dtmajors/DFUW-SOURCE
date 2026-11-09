/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;

public class ly {
    private static String[] awC = new String[]{"F14", "Z15", "F06", "F19", "Z20", "U26", "Y11", "O06", "Z06", "Q26"};
    private static final List<String> awD = lcn.emv();
    private static boolean Initialized = false;

    private static void ql() {
        for (String string : awC) {
            awD.add(string);
        }
    }

    public static boolean Z(ljq ljq2) {
        boolean bl;
        if (!Initialized) {
            ly.ql();
            Initialized = true;
        }
        boolean bl2 = bl = ljq2.y <= -1000.0f;
        if (!bl) {
            return false;
        }
        String string = lcw.dZ((ljq)ljq2);
        if (string == null) {
            return false;
        }
        return awD.contains(string);
    }
}

