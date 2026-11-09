/*
 * Decompiled with CFR.
 */
public class krq {
    public khd aay(int n) {
        krp krp2 = null;
        switch (n) {
            case 2305: {
                krp2 = new krm();
                break;
            }
            case 2306: {
                krp2 = new krn();
                break;
            }
            case 2307: {
                krp2 = new kro();
                break;
            }
            case 2308: {
                krp2 = new krj();
                break;
            }
            case 2309: {
                krp2 = new kri();
                break;
            }
            case 2310: {
                krp2 = new krk();
                break;
            }
            case 2311: {
                krp2 = new krl();
                break;
            }
            default: {
                lfn.b(5, "SFTimerRequestFactory", "createTimerRequest() Invalid requesttype provided: " + n);
            }
        }
        return krp2;
    }
}

