/*
 * Decompiled with CFR.
 */
public class fgc {
    public fgb GD(int n) {
        fgb fgb2 = null;
        switch (n) {
            case 8449: {
                fgb2 = new ffy();
                break;
            }
            case 8450: {
                fgb2 = new fgd();
                break;
            }
            case 8451: {
                fgb2 = new ffz();
                break;
            }
            case 8452: {
                fgb2 = new fga();
                break;
            }
            case 8453: {
                fgb2 = new fge();
                break;
            }
            case 8454: {
                fgb2 = new fgf();
                break;
            }
            case 8455: {
                fgb2 = new ffw();
                break;
            }
            case 8456: {
                fgb2 = new ffx();
                break;
            }
            default: {
                lfn.b(5, "SFGunMessageFactory", "createGunMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fgb2;
    }
}

