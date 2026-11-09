/*
 * Decompiled with CFR.
 */
public class eso {
    public dxq CW(int n) {
        dxq dxq2;
        switch (n) {
            case 18177: {
                dxq2 = new esr();
                break;
            }
            case 18178: {
                dxq2 = new esp();
                break;
            }
            case 18184: {
                dxq2 = new esq();
                break;
            }
            case 18179: {
                dxq2 = new est();
                break;
            }
            case 18183: {
                dxq2 = new esu();
                break;
            }
            case 18180: {
                dxq2 = new esv();
                break;
            }
            case 18181: {
                dxq2 = new esw();
                break;
            }
            case 18182: {
                dxq2 = new ess();
                break;
            }
            default: {
                lfn.b(5, "SFConfirmationMessageFactory", "createMessage() Invalid confirmationmessage requested: " + n);
                return null;
            }
        }
        assert (dxq2.bED() == 18176);
        assert (dxq2.bEz() == n);
        return dxq2;
    }
}

