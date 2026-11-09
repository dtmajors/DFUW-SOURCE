/*
 * Decompiled with CFR.
 */
public class esd {
    public esc ES(int n) {
        esc esc2 = null;
        switch (n) {
            case 20993: {
                esc2 = new esa();
                break;
            }
            case 20994: {
                esc2 = new esb();
                break;
            }
            case 20995: {
                esc2 = new ese();
                break;
            }
            case 20996: {
                esc2 = new esf();
                break;
            }
            default: {
                lfn.b(5, "SFCompositeMessageFactory", "createCompositeMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return esc2;
    }
}

