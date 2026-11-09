/*
 * Decompiled with CFR.
 */
public class liv
extends liu {
    private static long roC = 60L;
    private static long roD = roC * 60L;
    private static long roE = roD * 24L;

    protected liv() {
    }

    public liv(double d2) {
        super(d2);
    }

    @Override
    public String esy() {
        StringBuilder stringBuilder = new StringBuilder();
        long l = (long)this.Pq;
        long l2 = l / roE;
        long l3 = l / roD;
        long l4 = l / roC;
        l %= roC;
        if (l2 != 0L) {
            stringBuilder.append(l2);
            stringBuilder.append(' ');
            stringBuilder.append(l2 == 1L ? "day" : "days");
        }
        if (l3 != 0L) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(l3);
            stringBuilder.append(' ');
            stringBuilder.append(l3 == 1L ? "hour" : "hours");
        }
        if (l4 != 0L) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(l4);
            stringBuilder.append(' ');
            stringBuilder.append(l4 == 1L ? "minute" : "minutes");
        }
        if (l != 0L) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" and ");
            }
            stringBuilder.append(l);
            stringBuilder.append(' ');
            stringBuilder.append(l == 1L ? "second" : "seconds");
        }
        return stringBuilder.toString();
    }
}

