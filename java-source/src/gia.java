/*
 * Decompiled with CFR.
 */
public class gia {
    public ghz Jy(int n) {
        ghz ghz2 = null;
        switch (n) {
            case 7682: {
                ghz2 = new ghw();
                break;
            }
            case 7683: {
                ghz2 = new ghu();
                break;
            }
            case 7684: {
                ghz2 = new ghv();
                break;
            }
            case 7685: {
                ghz2 = new gib();
                break;
            }
            case 7686: {
                ghz2 = new ghx();
                break;
            }
            case 7688: {
                ghz2 = new ghy();
                break;
            }
            default: {
                lfn.b(5, this.getClass().getName(), "createMessage() :  Invalid messagetype provided: " + n);
                return null;
            }
        }
        return ghz2;
    }
}

