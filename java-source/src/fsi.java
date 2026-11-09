/*
 * Decompiled with CFR.
 */
public class fsi {
    public fsh HN(int n) {
        fsh fsh2 = null;
        switch (n) {
            case 20481: {
                fsh2 = new fse();
                break;
            }
            case 20482: {
                fsh2 = new fsg();
                break;
            }
            case 20483: {
                fsh2 = new fsj();
                break;
            }
            case 20484: {
                fsh2 = new fsf();
                break;
            }
            default: {
                lfn.b(5, "SFMovementMessageFactory", "createMovementMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fsh2;
    }
}

