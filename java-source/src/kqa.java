/*
 * Decompiled with CFR.
 */
public class kqa {
    private lfn ga = lfn.eqw();

    public kpz aap(int n) {
        kpz kpz2 = null;
        switch (n) {
            case 3585: {
                kpz2 = new kpt();
                break;
            }
            case 3586: {
                kpz2 = new kpx();
                break;
            }
            case 3587: {
                kpz2 = new kpv();
                break;
            }
            case 3588: {
                kpz2 = new kpu();
                break;
            }
            case 3589: {
                kpz2 = new kps();
                break;
            }
            case 3590: {
                kpz2 = new kpr();
                break;
            }
            case 3591: {
                kpz2 = new kpw();
                break;
            }
            case 3592: {
                kpz2 = new kpy();
                break;
            }
            default: {
                lfn.b(5, "SFShaderRequestFactory", "createShaderRequest() Unknown RequestType provided: " + n);
            }
        }
        return kpz2;
    }
}

