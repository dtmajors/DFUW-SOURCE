/*
 * Decompiled with CFR.
 */
public class ecn {
    public ecm DE(int n2) {
        ecm ecm2 = null;
        switch (n2) {
            case 3073: {
                ecm2 = new ecd();
                break;
            }
            case 3074: {
                ecm2 = new ecp();
                break;
            }
            case 3075: {
                ecm2 = new ece();
                break;
            }
            case 3076: {
                ecm2 = new ecf();
                break;
            }
            case 3077: {
                ecm2 = new ecg();
                break;
            }
            case 3078: {
                ecm2 = new ech();
                break;
            }
            case 3079: {
                ecm2 = new eci();
                break;
            }
            case 3080: {
                ecm2 = new eck();
                break;
            }
            case 3081: {
                ecm2 = new ecj();
                break;
            }
            case 3082: {
                ecm2 = new eco();
                break;
            }
            case 3083: {
                ecm2 = new ecq();
                break;
            }
            case 3086: {
                ecm2 = new ecl();
                break;
            }
            case 3087: {
                ecm2 = new ecc();
                break;
            }
            default: {
                lfn.b(5, "SFBoatMessageFactory", "createBoatMessage() Invalid messagetype provided: " + n2);
                return null;
            }
        }
        return ecm2;
    }
}

