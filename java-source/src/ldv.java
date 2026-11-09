/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.StringTokenizer;

public class ldv
implements Cloneable,
Comparable<ldv> {
    public static final ldv rfd = new ldv(-1L);
    public static final ldv rfe = new ldv(1, 1, 1);
    public static final int rff = 16;
    public static final int rfg = 28;
    public static final int rfh = 20;
    public static final int rfi = 15;
    public static final int rfj = 65535;
    public static final int rfk = 0xFFFFFFF;
    public static final int rfl = 1048575;
    public static final int rfm = Short.MAX_VALUE;
    public static final int rfn = 1015808;
    private final long rfo;
    private static lfr Out = lfr.rkC;
    private static Map<ldv, String> rfp;

    private ldv() {
        this.rfo = 0L;
    }

    public static final int ent() {
        return 65535;
    }

    public static final int enu() {
        return 0xFFFFFFF;
    }

    public static final int env() {
        return 1048575;
    }

    public ldv(long l) {
        this.rfo = l;
    }

    public ldv(int n, int n2, int n3) {
        if ((n & 0xFFFF) != n && n != -1) {
            System.out.println("ERROR: SFGUID(int, int, int): Specified NodeID (" + n + ") is more than " + 16 + " bits!!");
            assert (false);
        } else if ((n2 & 0xFFFFFFF) != n2) {
            System.out.println("ERROR: SFGUID(int, int, int): Specified OSGUID (" + n2 + ") is more than " + 28 + " bits!");
            assert (false);
        } else if ((n3 & 0xFFFFF) != n3 && n3 != -1) {
            System.out.println("ERROR: SFGUID(int, int, int): Specified ObjectGUID (" + n3 + ") is more than " + 20 + " bits!");
            assert (false);
        }
        this.rfo = ((long)n << 28 | (long)n2) << 20 | (long)n3;
        if (n3 != 0) {
            // empty if block
        }
    }

    public static boolean acf(int n) {
        return (n & 0xFFFF) == n || n == -1;
    }

    public static boolean acg(int n) {
        return (n & 0xFFFFFFF) == n;
    }

    public static boolean ach(int n) {
        return (n & 0xFFFFF) == n || n == -1;
    }

    public static boolean M(int n, int n2, int n3) {
        return ldv.acf(n) && ldv.acg(n2) && ldv.ach(n3);
    }

    public static boolean tU(ldv ldv2) {
        return ldv2 != null && !ldv2.equals(rfd) && !ldv2.equals(rfe);
    }

    public int ib() {
        int n = (int)(this.rfo >>> 48);
        return n;
    }

    public int enw() {
        long l = this.rfo >>> 20;
        return (int)(l & 0xFFFFFFFL);
    }

    public int enx() {
        return (int)(this.rfo & 0xFFFFFL);
    }

    public long eny() {
        return this.rfo;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.ib());
        stringBuilder.append(",");
        stringBuilder.append(this.enw());
        stringBuilder.append(",");
        stringBuilder.append(this.enx());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String fk() {
        return this.ib() + "." + this.enw() + "." + this.enx();
    }

    public static ldv aw(long l) {
        int n = (int)(l >>> 48 & 0xFFFFL);
        int n2 = (int)(l >>> 20 & 0xFFFFFFFL);
        int n3 = (int)(l & 0xFFFFFL);
        return new ldv(n, n2, n3);
    }

    public static ldv zp(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        try {
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int n2 = Integer.parseInt(stringTokenizer.nextToken());
            int n3 = Integer.parseInt(stringTokenizer.nextToken());
            return new ldv(n, n2, n3);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static ldv zq(String string) {
        int n;
        int n2;
        int n3;
        if (string.charAt(0) != '[') {
            return null;
        }
        int n4 = string.indexOf(44);
        if (n4 == -1) {
            return null;
        }
        int n5 = string.indexOf(44, n4 + 1);
        if (n5 == -1) {
            return null;
        }
        int n6 = string.length() - 1;
        if (string.charAt(n6) != ']') {
            return null;
        }
        String string2 = string.substring(1, n4);
        try {
            n3 = Integer.parseInt(string2.trim());
            string2 = string.substring(n4 + 1, n5);
            n2 = Integer.parseInt(string2.trim());
            string2 = string.substring(n5 + 1, n6);
            n = Integer.parseInt(string2.trim());
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (!ldv.M(n3, n2, n)) {
            return null;
        }
        return new ldv(n3, n2, n);
    }

    public static ldv zr(String string) {
        int n;
        int n2;
        int n3;
        if (string == null) {
            return null;
        }
        int n4 = string.indexOf(46);
        int n5 = string.lastIndexOf(46);
        if (n4 < 0 || n5 == n4) {
            return null;
        }
        try {
            n3 = Integer.parseInt(string.substring(0, n4));
            n2 = Integer.parseInt(string.substring(n4 + 1, n5));
            n = Integer.parseInt(string.substring(n5 + 1));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (!ldv.M(n3, n2, n)) {
            return null;
        }
        return new ldv(n3, n2, n);
    }

    public String enz() {
        return this.ib() + "." + this.enw() + "." + this.enx();
    }

    public final boolean tV(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        return this.ib() == ldv2.ib() && this.enw() == ldv2.enw();
    }

    public final boolean tW(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        return this.enw() == ldv2.enw() && this.enx() == ldv2.enx();
    }

    public int tX(ldv ldv2) {
        if (this.rfo < ldv2.rfo) {
            return -1;
        }
        if (this.rfo == ldv2.rfo) {
            return 0;
        }
        return 1;
    }

    public final ldv bFk() {
        if (this.enx() == 0) {
            return this;
        }
        return new ldv(this.ib(), this.enw(), 0);
    }

    public static final boolean au(ldv ldv2, ldv ldv3) {
        return lin.i(ldv2, ldv3);
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            lfn.log("SFGUID", cloneNotSupportedException);
            return null;
        }
    }

    public static void G(ldv ldv2, String string) {
        Out.error("Do NOT invoke nameGuid() when !SFSpeneConfig.DEBUG");
    }

    public int hashCode() {
        return (int)(this.rfo ^ this.rfo >> 20);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof ldv)) {
            return false;
        }
        ldv ldv2 = (ldv)object;
        return this.rfo == ldv2.rfo;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.tX((ldv)object);
    }
}

