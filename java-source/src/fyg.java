/*
 * Decompiled with CFR.
 */
public class fyg {
    public fyf Iq(int n) {
        fyf fyf2 = null;
        switch (n) {
            case 13569: {
                fyf2 = new fyh();
                break;
            }
            case 13570: {
                fyf2 = new fyi();
                break;
            }
            default: {
                lfn.b(5, "SFPermissionMessageFactory", "createPermissionMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fyf2;
    }
}

