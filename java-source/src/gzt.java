/*
 * Decompiled with CFR.
 */
public class gzt {
    public gzs KY(int n) {
        gzs gzs2 = null;
        switch (n) {
            case 8193: {
                gzs2 = new gzo();
                break;
            }
            case 8194: {
                gzs2 = new gzr();
                break;
            }
            case 8195: {
                gzs2 = new gzp();
                break;
            }
            case 8196: {
                gzs2 = new gzq();
                break;
            }
            case 8197: {
                gzs2 = new gzu();
                break;
            }
            case 8198: {
                gzs2 = new gzv();
                break;
            }
            default: {
                lfn.b(5, "SFWiretapMessageFactory", "createWiretapMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return gzs2;
    }
}

