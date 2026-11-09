/*
 * Decompiled with CFR.
 */
public class fpk {
    public fpj Hn(int n) {
        fpj fpj2 = null;
        switch (n) {
            case 16385: {
                fpj2 = new fpi();
                break;
            }
            case 16386: {
                fpj2 = new fpl();
                break;
            }
            default: {
                lfn.b(5, "SFListenerMessageFactory", "createListenerMessage() Invalid messagetype provided: " + n);
                return null;
            }
        }
        return fpj2;
    }
}

