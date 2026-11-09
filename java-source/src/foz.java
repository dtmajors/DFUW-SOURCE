/*
 * Decompiled with CFR.
 */
public class foz {
    public foy Hh(int n) {
        foy foy2 = null;
        switch (n) {
            case 3841: {
                foy2 = new fox();
                break;
            }
            case 3842: {
                foy2 = new fpb();
                break;
            }
            case 3843: {
                foy2 = new fov();
                break;
            }
            case 3844: {
                foy2 = new fpa();
                break;
            }
            case 3845: {
                foy2 = new fow();
                break;
            }
            case 3846: {
                foy2 = new fpc();
                break;
            }
            default: {
                lfn.b(5, "SFLevelMessageFactory", "createLevelMessage() Invalid messagetype provided " + n);
                return null;
            }
        }
        return foy2;
    }
}

