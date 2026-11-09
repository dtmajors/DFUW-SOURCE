/*
 * Decompiled with CFR.
 */
public class gvq {
    public gvp KL(int n) {
        gvp gvp2 = null;
        switch (n) {
            case 4353: {
                gvp2 = new gvm();
                break;
            }
            case 4354: {
                gvp2 = new gvn();
                break;
            }
            case 4355: {
                gvp2 = new gvr();
                break;
            }
            case 4356: {
                gvp2 = new gvs();
                break;
            }
            case 4357: {
                gvp2 = new gvt();
                break;
            }
            case 4358: {
                gvp2 = new gvo();
                break;
            }
            case 4359: {
                gvp2 = new gvu();
                break;
            }
            case 4360: {
                gvp2 = new gvv();
                break;
            }
            default: {
                lfn.b(5, "SFTimerMessageFactory", "createTimerMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return gvp2;
    }
}

