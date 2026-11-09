/*
 * Decompiled with CFR.
 */
public class fre {
    public frd HJ(int n) {
        frf frf2 = null;
        switch (n) {
            case 14081: {
                frf2 = new frf();
                break;
            }
            default: {
                lfn.b(5, "SFMissileMessageFactory", "createMissileMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return frf2;
    }
}

