/*
 * Decompiled with CFR.
 */
public class exd {
    public exc FB(int n) {
        exc exc2 = null;
        switch (n) {
            case 5121: {
                exc2 = new exa();
                break;
            }
            case 5122: {
                exc2 = new exb();
                break;
            }
            case 5123: {
                exc2 = new ewz();
                break;
            }
            default: {
                lfn.b(5, "SFControllerMessageFactory", "createControllerMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return exc2;
    }
}

