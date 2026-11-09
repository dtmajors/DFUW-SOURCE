/*
 * Decompiled with CFR.
 */
public class fpf {
    lfn ga = lfn.eqw();

    public fpe Hk(int n) {
        fpe fpe2 = null;
        switch (n) {
            case 1537: {
                fpe2 = new fpg();
                break;
            }
            case 1538: {
                fpe2 = new fph();
                break;
            }
            case 1539: {
                fpe2 = new fpd();
                break;
            }
            default: {
                lfn.b(5, "SFLightMessageFactory", "createMessage() : Invalid messagetype provided [" + n + "]!");
            }
        }
        return fpe2;
    }
}

