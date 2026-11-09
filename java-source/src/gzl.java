/*
 * Decompiled with CFR.
 */
public class gzl {
    public gzk KW(int n) {
        gzk gzk2 = null;
        switch (n) {
            case 10497: {
                gzk2 = new gzj();
                break;
            }
            case 10498: {
                gzk2 = new gzm();
                break;
            }
            case 10499: {
                gzk2 = new gzn();
                break;
            }
            default: {
                lfn.b(5, "SFWebMessageFactory", "createUpdateMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return gzk2;
    }
}

