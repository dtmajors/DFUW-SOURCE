/*
 * Decompiled with CFR.
 */
public class gto {
    private lfn ga = lfn.eqw();

    public gtn KD(int n) {
        gtn gtn2 = null;
        switch (n) {
            case 8961: {
                gtn2 = new gsz();
                break;
            }
            case 8962: {
                gtn2 = new gtd();
                break;
            }
            case 8963: {
                gtn2 = new gti();
                break;
            }
            case 8964: {
                gtn2 = new gtj();
                break;
            }
            case 8965: {
                gtn2 = new gtk();
                break;
            }
            case 8966: {
                gtn2 = new gtl();
                break;
            }
            case 8967: {
                gtn2 = new gtm();
                break;
            }
            case 8968: {
                gtn2 = new gta();
                break;
            }
            case 8969: {
                gtn2 = new gtb();
                break;
            }
            case 8970: {
                gtn2 = new gtc();
                break;
            }
            case 8972: {
                gtn2 = new gtg();
                break;
            }
            case 8973: {
                gtn2 = new gtf();
                break;
            }
            case 8974: {
                gtn2 = new gtp();
                break;
            }
            default: {
                lfn.b(5, "SFSystemUpdateMessageFactory", "createSystemUpdateMessage() Invalid messagetype provided [" + n + "]!");
                return null;
            }
        }
        return gtn2;
    }
}

