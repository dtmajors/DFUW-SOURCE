/*
 * Decompiled with CFR.
 */
public class fbe {
    public fbd Gm(int n) {
        fbd fbd2 = null;
        switch (n) {
            case 12545: {
                fbd2 = new fbb();
                break;
            }
            case 12546: {
                fbd2 = new fba();
                break;
            }
            case 12547: {
                fbd2 = new fbg();
                break;
            }
            case 12548: {
                fbd2 = new fbf();
                break;
            }
            case 12549: {
                fbd2 = new fay();
                break;
            }
            case 12550: {
                fbd2 = new faz();
                break;
            }
            case 12551: {
                fbd2 = new fbc();
                break;
            }
            default: {
                lfn.b(5, "SFEventMessageFactory", "createEventMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fbd2;
    }
}

