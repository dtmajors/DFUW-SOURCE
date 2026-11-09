/*
 * Decompiled with CFR.
 */
public class itp {
    public static int t(ipf ... ipfArray) {
        int n = 0;
        for (ipf ipf2 : ipfArray) {
            if (ipf2 == null) continue;
            ++n;
        }
        return n;
    }
}

