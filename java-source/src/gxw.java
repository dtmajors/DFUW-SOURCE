/*
 * Decompiled with CFR.
 */
public class gxw {
    public gxv KT(int n) {
        gxv gxv2 = null;
        switch (n) {
            case 11265: {
                gxv2 = new gxx();
                break;
            }
            case 11266: {
                gxv2 = new gxy();
                break;
            }
            default: {
                lfn.b(5, "SFTransactionMessageFactory", "createTransactionMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return gxv2;
    }
}

