/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import spenefett.util.jni.SFJNIUtils;

public class kzd {
    public kzd() {
        this.init();
    }

    public void P(String[] stringArray) {
        new kzb();
        try {
            Thread.sleep(500L);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void init() {
        lfn.eqw().a(lfp.a.rku);
        lcw.qHF = 2;
        String string = SFJNIUtils.getBasePath();
        if (!string.endsWith("\\")) {
            string = string + "/";
        }
        lcw.qLb = string + "dfdata" + "/";
        lcw.qLb = string + "dfdata" + "/";
        lfn.b(0, "SFSpeneTester", "init() " + lcw.qLb);
        ldx.enG().bN(3);
    }

    public static void main(String[] stringArray) {
        kzd kzd2 = new kzd();
        kzd2.P(stringArray);
    }
}

