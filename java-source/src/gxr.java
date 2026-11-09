/*
 * Decompiled with CFR.
 */
public class gxr {
    public gxs KS(int n) {
        gxs gxs2 = null;
        switch (n) {
            case 29185: {
                gxs2 = new gxu();
                break;
            }
            case 29186: {
                gxs2 = new gxt();
                break;
            }
            case 29187: {
                gxs2 = new gxp();
                break;
            }
            case 29188: {
                gxs2 = new gxq();
                break;
            }
            default: {
                assert (false) : "Unhandled Message Type : " + n;
                break;
            }
        }
        return gxs2;
    }
}

