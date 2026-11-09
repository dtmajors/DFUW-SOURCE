/*
 * Decompiled with CFR.
 */
public class glr {
    public glq JU(int n) {
        gls gls2 = null;
        switch (n) {
            case 21249: {
                gls2 = new gls();
                break;
            }
            default: {
                lfn.b(5, "SFStateObjectMessageFactory", "createStateObjectMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return gls2;
    }
}

