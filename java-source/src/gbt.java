/*
 * Decompiled with CFR.
 */
public class gbt {
    public gbs ID(int n) {
        gbs gbs2 = null;
        switch (n) {
            case 28674: {
                gbs2 = new gbu();
                break;
            }
            case 28673: {
                gbs2 = new gbv();
                break;
            }
            case 28675: {
                gbs2 = new gbw();
                break;
            }
            default: {
                assert (false) : "Unhandled Message Type : " + n;
                break;
            }
        }
        return gbs2;
    }
}

