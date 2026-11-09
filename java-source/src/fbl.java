/*
 * Decompiled with CFR.
 */
public class fbl {
    public fbk Gn(int n) {
        fbk fbk2 = null;
        switch (n) {
            case 16897: {
                fbk2 = new fbh();
                break;
            }
            case 16898: {
                fbk2 = new fbi();
                break;
            }
            case 16899: {
                fbk2 = new fbj();
                break;
            }
            case 16900: {
                fbk2 = new fbm();
                break;
            }
            default: {
                lfn.b(5, "SFExternalObjectMessageFactory", "createExternalObjectMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fbk2;
    }
}

