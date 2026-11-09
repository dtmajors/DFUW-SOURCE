/*
 * Decompiled with CFR.
 */
public class kjc {
    public khd Yf(int n) {
        kjb kjb2 = null;
        switch (n) {
            case 2818: {
                kjb2 = new kji();
                break;
            }
            case 2819: {
                kjb2 = new kjo();
                break;
            }
            case 2820: {
                kjb2 = new kjn();
                break;
            }
            case 2821: {
                kjb2 = new kje();
                break;
            }
            case 2822: {
                kjb2 = new kjg();
                break;
            }
            case 2823: {
                kjb2 = new kjj();
                break;
            }
            case 2824: {
                kjb2 = new kjk();
                break;
            }
            case 2825: {
                kjb2 = new kjf();
                break;
            }
            case 2826: {
                kjb2 = new kjp();
                break;
            }
            case 2827: {
                kjb2 = new kjh();
                break;
            }
            case 2828: {
                kjb2 = new kjd();
                break;
            }
            case 2829: {
                kjb2 = new kjl();
                break;
            }
            default: {
                lfn.b(5, "SFContainmentRequestFactory", "createContainmentRequest() Invalid requesttype provided: " + n);
                return null;
            }
        }
        return kjb2;
    }
}

