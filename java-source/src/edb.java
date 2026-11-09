/*
 * Decompiled with CFR.
 */
public class edb {
    public eda DG(int n2) {
        eda eda2 = null;
        switch (n2) {
            case 2049: {
                eda2 = new edc();
                break;
            }
            case 2050: {
                eda2 = new edd();
                break;
            }
            case 2051: {
                eda2 = new ecy();
                break;
            }
            case 2052: {
                eda2 = new ecz();
                break;
            }
            default: {
                lfn.b(5, "SFCameraMessageFactory", "createCameraMessage() Invalid messagetype provided: " + n2);
                return null;
            }
        }
        return eda2;
    }
}

