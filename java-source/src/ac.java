/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class ac
extends ab {
    public static void main(String[] stringArray) {
        jrw jrw2 = new jrw(lcw.qLb + "/" + "xml-files/gamelogicinfo/" + "use_old_middleware.txt");
        if (jrw2.exists()) {
            lcw.qGb = false;
        }
        System.loadLibrary(lcw.qGb ? "SFMW" : "SFMiddleware");
        loi.exd().adQ(1);
    }
}

