/*
 * Decompiled with CFR.
 */
public class fpv {
    public fpu Hp(int n) {
        switch (n) {
            case 31233: {
                return new fpx();
            }
            case 31234: {
                return new fpy();
            }
            case 31235: {
                return new fpw();
            }
        }
        lfn.b(5, "SFMarkerMessageFactory", "createMessage: Invalid messagetype " + n);
        return null;
    }
}

