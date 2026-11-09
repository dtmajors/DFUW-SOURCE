/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class kyo
extends ley {
    public static final String qmc = "java::";
    public static final String qmd = "Modules::Application";
    public static final String qme = "Instance ID";
    private kyt qmf = null;
    private DecimalFormat qmg = null;
    private DecimalFormat qmh = null;

    public kyo(kyt kyt2, int n) {
        super(n);
        this.qmf = kyt2;
        this.qmg = new DecimalFormat("00");
        this.qmg.setMaximumIntegerDigits(2);
        this.qmh = new DecimalFormat("0000");
        this.qmh.setMaximumIntegerDigits(4);
    }

    @Override
    protected void xM(String string) {
        int n;
        byte[] byArray = string.getBytes();
        byte by = byArray[0];
        long l2 = 0L;
        for (n = 0; n < 8; ++n) {
            l2 |= (long)(byArray[13 + n] & 0xFF) << 8 * n;
        }
        n = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            n |= (byArray[9 + i2] & 0xFF) << 4 * i2;
        }
        long l3 = 0L;
        for (int i3 = 0; i3 < 8; ++i3) {
            l3 |= (long)(byArray[13 + i3] & 0xFF) << 8 * i3;
        }
        String string2 = this.au(l2);
        int n2 = 21;
        String string3 = null;
        String string4 = null;
        for (int i4 = n2; i4 < byArray.length; ++i4) {
            byte[] byArray2;
            if (byArray[i4] != 0) continue;
            if (string3 == null) {
                byArray2 = new byte[i4 - n2];
                System.arraycopy(byArray, n2, byArray2, 0, byArray2.length);
                string3 = new String(byArray2);
                n2 = i4 + 1;
                continue;
            }
            byArray2 = new byte[i4 - n2];
            System.arraycopy(byArray, n2, byArray2, 0, byArray2.length);
            string4 = new String(byArray2);
            if (string3.equals(qmd) && string4.equals(qme)) {
                this.qmf.ejU();
            }
            if (string3.startsWith(qmc)) {
                string3 = string3.substring(qmc.length());
            }
            this.qmf.a(string2, "", (int)by, string3, string4);
            return;
        }
    }

    private String au(long l2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date(l2 / 1000L));
        this.qmg = new DecimalFormat("##");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.qmg.format(gregorianCalendar.get(10)));
        stringBuilder.append(":");
        stringBuilder.append(this.qmg.format(gregorianCalendar.get(12)));
        stringBuilder.append(":");
        stringBuilder.append(this.qmg.format(gregorianCalendar.get(13)));
        stringBuilder.append(".");
        stringBuilder.append(this.qmh.format(gregorianCalendar.get(14)));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

