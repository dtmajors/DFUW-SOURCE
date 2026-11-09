/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ika {
    public static final int mfa = 8;
    public static final int mfb = 8;
    public static final int mfc = 8;
    public static final int mfd = 4;
    public static final int mfe = 22;
    public static final int mff = 16;
    private static final Map<ikd, ikc> mfg = lcn.emw();
    private static final Map<ikc, List<ikd>> mfh = lcn.emw();

    public static Map<ikd, ikc> dbW() {
        return Collections.unmodifiableMap(mfg);
    }

    public static Map<ikc, List<ikd>> dbX() {
        return Collections.unmodifiableMap(mfh);
    }

    public static int a(ikd ikd2) {
        ikc ikc2 = mfg.get((Object)ikd2);
        if (ikc2 == null) {
            return -1;
        }
        List<ikd> list = mfh.get((Object)ikc2);
        if (list == null) {
            return -1;
        }
        return list.indexOf((Object)ikd2);
    }

    private static void a(ikc ikc2, ikd ikd2) {
        mfg.put(ikd2, ikc2);
        List<ikd> list = mfh.get((Object)ikc2);
        if (list == null) {
            list = lcn.emv();
            mfh.put(ikc2, list);
        }
        list.add(ikd2);
    }

    private static void a(ikc ikc2, ikd ... ikdArray) {
        for (ikd ikd2 : ikdArray) {
            ika.a(ikc2, ikd2);
        }
    }

    static {
        ika.a(ikc.mfj, new ikd[]{ikd.mft});
        ika.a(ikc.mfk, ikd.mfu, ikd.mfv, ikd.mfw);
        ika.a(ikc.mfl, ikd.mfx, ikd.mfy, ikd.mfz, ikd.mfE, ikd.mfF, ikd.mfG);
        ika.a(ikc.mfm, new ikd[]{ikd.mfA});
        ika.a(ikc.mfn, new ikd[]{ikd.mfB});
        ika.a(ikc.mfo, new ikd[]{ikd.mfC});
        ika.a(ikc.mfp, new ikd[]{ikd.mfD});
    }
}

