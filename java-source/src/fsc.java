/*
 * Decompiled with CFR.
 */
public class fsc {
    public fsb HM(int n) {
        fsb fsb2 = null;
        switch (n) {
            case 14593: {
                fsb2 = new fsa();
                break;
            }
            case 14594: {
                fsb2 = new fsd();
                break;
            }
            default: {
                lfn.b(5, "SFMountMessageFactory", "createMountMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fsb2;
    }
}

