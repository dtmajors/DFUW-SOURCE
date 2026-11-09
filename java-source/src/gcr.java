/*
 * Decompiled with CFR.
 */
public final class gcr
extends Enum<gcr> {
    public static final /* enum */ gcr jdj = new gcr();
    public static final /* enum */ gcr jdk = new gcr();
    public static final /* enum */ gcr jdl = new gcr();
    public static final /* enum */ gcr jdm = new gcr();
    public static final /* enum */ gcr jdn = new gcr();
    public static final /* enum */ gcr jdo = new gcr();
    public static final /* enum */ gcr jdp = new gcr();
    public static final /* enum */ gcr jdq = new gcr();
    public static final /* enum */ gcr jdr = new gcr();
    public static final /* enum */ gcr jds = new gcr();
    public static gcr[] jdt;
    private static final /* synthetic */ gcr[] jdu;

    public static gcr[] values() {
        return (gcr[])jdu.clone();
    }

    public static gcr valueOf(String string) {
        return Enum.valueOf(gcr.class, string);
    }

    public static final int getValueCount() {
        return jdt.length;
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < gcr.getValueCount();
    }

    public static final gcr getValueByOrdinal(int n) {
        if (gcr.isValidOrdinal(n)) {
            return jdt[n];
        }
        assert (false);
        return jdj;
    }

    static {
        jdu = new gcr[]{jdj, jdk, jdl, jdm, jdn, jdo, jdp, jdq, jdr, jds};
        jdt = (gcr[])gcr.class.getEnumConstants();
    }
}

