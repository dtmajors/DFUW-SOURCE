/*
 * Decompiled with CFR.
 */
public class ldk {
    public static final int reC = 0;
    public static final int reD = -1;
    public static final int reE = -2;
    public static final int reF = -3;
    public static final int reG = -4;
    public static final int reH = -5;
    public static final int reI = -6;
    public static final int reJ = 1;
    public static final int reK = 3;
    public static final int reL = -100;
    public static final int reM = -101;
    public static final int reN = -102;
    public static final int reO = -103;
    public static final int reP = -104;
    public static final int reQ = -105;
    public static final int reR = -106;
    public static final int reS = -107;
    public static final int reT = -108;

    private ldk() {
    }

    public static String getName(int n) {
        switch (n) {
            case 0: {
                return "SF_OK";
            }
            case -1: {
                return "SF_ERROR";
            }
            case -2: {
                return "SF_BAD_INPUT_VALUES";
            }
            case -3: {
                return "SF_NOT_SUPPORTED";
            }
            case -4: {
                return "SF_NOT_ENOUGH_INFORMATION";
            }
            case -5: {
                return "SF_NOT_FOUND";
            }
            case -6: {
                return "SF_WRONG_OBJECT_TYPE";
            }
            case 1: {
                return "SF_NOTHING_TO_DO";
            }
            case 3: {
                return "SF_NODE_NOT_RESPONSIBLE";
            }
            case -100: {
                return "SF_DX_DEVICE_LOST";
            }
            case -101: {
                return "SF_DX_DEVICE_NOT_RESET";
            }
            case -102: {
                return "SF_DX_INTERNAL_DRIVER_ERROR";
            }
            case -103: {
                return "SF_DX_OUT_OF_VIDEO_MEMORY";
            }
            case -104: {
                return "SF_DX_DEVICE_REMOVED";
            }
            case -105: {
                return "SF_DX_GENERIC_ERROR";
            }
            case -106: {
                return "SF_DX_DRIVER_INVALID_CALL";
            }
            case -107: {
                return "SF_DX_DEVICE_HUNG";
            }
            case -108: {
                return "SF_DX_INVALID_DEVICE";
            }
        }
        return "unknown(" + n + ")";
    }
}

