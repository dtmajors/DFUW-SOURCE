/*
 * Decompiled with CFR.
 */
public class jly {
    public static final int nuk = 17;
    public static final int nul = 18;
    public static final int num = 19;
    public static final int nun = 20;
    public static final int nuo = 21;
    public static final int nup = 22;
    public static final int nuq = 23;
    public static final int nur = 24;
    public static final int nus = 25;
    public static final int nut = 26;
    public static final int nuu = 27;
    public static final int nuv = 28;

    public static String Vj(int n) {
        switch (n) {
            case 17: {
                return "DEVICE";
            }
            case 18: {
                return "MOUSE";
            }
            case 19: {
                return "KEYBOARD";
            }
            case 20: {
                return "JOYSTICK";
            }
            case 21: {
                return "GAMEPAD";
            }
            case 22: {
                return "DRIVING";
            }
            case 23: {
                return "FLIGHT";
            }
            case 24: {
                return "1STPERSON";
            }
            case 25: {
                return "DEVICECTRL";
            }
            case 26: {
                return "SCREENPOINTER";
            }
            case 27: {
                return "REMOTE";
            }
            case 28: {
                return "SUPPLEMENTAL";
            }
        }
        return "UNKNOWN_" + n;
    }
}

