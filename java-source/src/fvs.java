/*
 * Decompiled with CFR.
 */
public class fvs {
    public fvr Ie(int n) {
        fvr fvr2 = null;
        switch (n) {
            case 12289: {
                fvr2 = new fvp();
                break;
            }
            case 12290: {
                fvr2 = new fvv();
                break;
            }
            case 12291: {
                fvr2 = new fvt();
                break;
            }
            case 12292: {
                fvr2 = new fvq();
                break;
            }
            case 12293: {
                fvr2 = new fvw();
                break;
            }
            case 12294: {
                fvr2 = new fvu();
                break;
            }
            default: {
                lfn.b(5, "SFObserverMessageFactory", "createObserverMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fvr2;
    }
}

