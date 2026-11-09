/*
 * Decompiled with CFR.
 */
public class ira {
    public static void a(iph iph2) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (!ipf2.djO()) continue;
            n = Math.max(n, ipf2.getWidth());
            n2 = Math.max(n2, ipf2.getHeight());
        }
        iph2.setSize(n, n2);
    }

    public static void a(iph iph2, int n, int n2, int n3, int n4) {
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (ipf2 == null || !ipf2.djO()) continue;
            ipf2.r(n, n2, n3, n4);
        }
    }

    public static void b(iph iph2) {
        ira.a(iph2, 0, 0, iph2.getWidth(), iph2.getHeight());
    }

    public static void b(iph iph2, int n, int n2, int n3, int n4) {
        for (int i = 0; i < iph2.bfn(); ++i) {
            int n5;
            int n6;
            double d2;
            ipf ipf2 = iph2.RO(i);
            if (!ipf2.djO()) continue;
            if (ipf2.getWidth() > ipf2.getHeight()) {
                d2 = ipf2.getWidth() > 0 ? (double)ipf2.getHeight() / (double)ipf2.getWidth() : 0.0;
                n6 = n3;
                n5 = (int)(d2 * (double)n4);
            } else if (ipf2.getWidth() < ipf2.getHeight()) {
                d2 = ipf2.getHeight() > 0 ? (double)ipf2.getWidth() / (double)ipf2.getHeight() : 0.0;
                n6 = (int)(d2 * (double)n3);
                n5 = n4;
            } else {
                n6 = n3;
                n5 = n4;
            }
            ipf2.r(n + n3 / 2 - n6 / 2, n2 + n4 / 2 - n5 / 2, n6, n5);
        }
    }

    public static void c(iph iph2) {
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (!ipf2.djO()) continue;
            ipf2.ek(iph2.getWidth() / 2 - ipf2.getWidth() / 2, iph2.getHeight() / 2 - ipf2.getHeight() / 2);
        }
    }

    public static void d(iph iph2) {
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (!ipf2.djO()) continue;
            ipf2.r(iph2.getWidth() / 2 - ipf2.getWidth() / 2, 0, ipf2.getWidth(), iph2.getHeight());
        }
    }

    public static void e(iph iph2) {
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (!ipf2.djO()) continue;
            ipf2.r(0, iph2.getHeight() / 2 - ipf2.getHeight() / 2, iph2.getWidth(), ipf2.getHeight());
        }
    }

    public static void f(iph iph2) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (!ipf2.djO()) continue;
            n = Math.max(n, ipf2.getX() + ipf2.getWidth());
            n2 = Math.max(n2, ipf2.getY() + ipf2.getHeight());
        }
        iph2.setSize(n, n2);
    }

    public static void a(iph iph2, int n, int n2) {
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf2 = iph2.RO(i);
            if (!ipf2.djO()) continue;
            ipf2.ek(ipf2.getX() + n, ipf2.getY() + n2);
        }
    }
}

