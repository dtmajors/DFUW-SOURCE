/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.text.DecimalFormat;
import java.util.Calendar;

public class ldz {
    public static final double rgg = 0.001;
    public static final double rgh = 1.0;
    public static final double rgi = 60.0;
    public static final double rgj = 300.0;
    public static final double rgk = 600.0;
    public static final double rgl = 1800.0;
    public static final double rgm = 3600.0;
    public static final double rgn = 86400.0;
    public static final double rgo = 604800.0;
    public static final double rgp = 3.14496E7;
    private static final boolean bC = false;
    public static final long rgq = 1000L;
    public static final long rgr = 60000L;
    public static final long rgs = 300000L;
    public static final long rgt = 600000L;
    public static final long rgu = 1800000L;
    public static final long rgv = 3600000L;
    public static final long rgw = 86400000L;
    public static final long rgx = 604800000L;
    public static final long rgy = 31449600000L;
    public final double qwh;
    public final double rgz;
    public final int lpr;
    private a dfu;
    protected static DecimalFormat rgA = new DecimalFormat("##0.0000");

    public ldz() {
        this.qwh = 0.0;
        this.rgz = 0.0;
        this.lpr = 0;
    }

    public ldz(double d2, double d3, int n) {
        this.qwh = d2;
        this.rgz = d3;
        this.lpr = n;
    }

    public int enO() {
        return mfz.ex(this.rgz);
    }

    public ldz enP() {
        return new ldz(this.qwh, this.rgz, this.lpr);
    }

    public String toString() {
        return "TotalTime: " + rgA.format(this.rgz) + ", FrameTime: " + this.qwh + ", TickCount: " + this.lpr;
    }

    public static int dS(double d2) {
        return (int)(d2 / 3.14496E7);
    }

    public static int dT(double d2) {
        return (int)(d2 / 604800.0);
    }

    public static int dU(double d2) {
        return (int)(d2 / 86400.0);
    }

    public static int dV(double d2) {
        return (int)(d2 / 3600.0);
    }

    public static int dW(double d2) {
        return (int)(d2 / 60.0);
    }

    public static double dX(double d2) {
        return d2 / 60.0;
    }

    public static String dY(double d2) {
        return ldz.e(d2, true);
    }

    public static String e(double d2, boolean bl) {
        if (d2 <= 0.0) {
            return "00:00:00";
        }
        double d3 = d2;
        int n = ldz.dU(d3);
        int n2 = ldz.dV(d3 -= (double)n * 86400.0);
        int n3 = ldz.dW(d3 -= (double)n2 * 3600.0);
        int n4 = (int)(d3 -= (double)n3 * 60.0);
        StringBuilder stringBuilder = new StringBuilder();
        if (bl && n > 0) {
            stringBuilder.append(n);
            stringBuilder.append("d ");
        }
        if (n2 < 10) {
            stringBuilder.append('0');
        }
        stringBuilder.append(n2);
        stringBuilder.append(':');
        if (n3 < 10) {
            stringBuilder.append('0');
        }
        stringBuilder.append(n3);
        stringBuilder.append(':');
        if (n4 < 10) {
            stringBuilder.append('0');
        }
        stringBuilder.append(n4);
        return stringBuilder.toString();
    }

    public static double zs(String string) {
        String[] stringArray = string.split(":");
        double d2 = 0.0;
        if (stringArray.length == 4) {
            d2 = (double)Integer.parseInt(stringArray[0]) * 86400.0;
            d2 += (double)Integer.parseInt(stringArray[1]) * 3600.0;
            d2 += (double)Integer.parseInt(stringArray[2]) * 60.0;
            d2 += (double)Integer.parseInt(stringArray[3]) * 1.0;
        } else if (stringArray.length == 3) {
            d2 = (double)Integer.parseInt(stringArray[0]) * 3600.0;
            d2 += (double)Integer.parseInt(stringArray[1]) * 60.0;
            d2 += (double)Integer.parseInt(stringArray[2]) * 1.0;
        }
        return d2;
    }

    public a enQ() {
        int n = this.enR();
        if ((n /= 60) >= 259 && n < 360) {
            return a.rgB;
        }
        if (n >= 360 && n < 1296) {
            return a.rgC;
        }
        if (n >= 1296 && n < 1440) {
            return a.rgD;
        }
        if (n >= 0 && n < 28) {
            return a.rgD;
        }
        if (n >= 28 && n < 259) {
            return a.rgE;
        }
        return a.rgC;
    }

    public int enR() {
        double d2 = this.rgz;
        double d3 = 50400.0 + d2 * lcw.qPM;
        double d4 = d3 % 86400.0;
        return (int)d4;
    }

    public static String b(long l, boolean bl) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        int n = calendar.get(11);
        int n2 = calendar.get(12);
        int n3 = calendar.get(13);
        String string = bl ? String.format("%02d:%02d:%02d", n, n2, n3) : String.format("%02d:%02d", n, n2);
        return string;
    }
}

