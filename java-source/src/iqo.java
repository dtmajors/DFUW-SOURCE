/*
 * Decompiled with CFR.
 */
public class iqo
extends iqz {
    private ire msb;
    private boolean mtM = false;
    private static iqo mtN = new iqo(ire.muk, false);
    private static iqo mtO = new iqo(ire.mul, false);
    private static iqo mtP = new iqo(ire.muk, true);
    private static iqo mtQ = new iqo(ire.mul, true);

    public iqo(ire ire2, boolean bl) {
        this.msb = ire2;
        this.mtM = bl;
    }

    public iqo(ire ire2) {
        this(ire2, false);
    }

    @Override
    public void e(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        int n = 0;
        int n2 = 0;
        if (this.msb == ire.muk) {
            for (int i = 0; i < iph2.bfn(); ++i) {
                ipf ipf3 = iph2.RO(i);
                if (!ipf3.djO()) continue;
                n += ipf3.getWidth();
                n2 = Math.max(n2, ipf3.getHeight());
            }
        } else {
            for (int i = 0; i < iph2.bfn(); ++i) {
                ipf ipf4 = iph2.RO(i);
                if (!ipf4.djO()) continue;
                n = Math.max(n, ipf4.getWidth());
                n2 += ipf4.getHeight();
            }
        }
        iph2.setSize(n, n2);
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        int n = 0;
        int n2 = 0;
        if (this.msb == ire.muk) {
            int n3;
            int n4 = 0;
            int n5 = 0;
            for (n3 = 0; n3 < iph2.bfn(); ++n3) {
                ipf ipf3 = iph2.RO(n3);
                if (!ipf3.djO() || ipf3.djQ() == null) continue;
                if (ipf3.dkj()) {
                    ++n5;
                    continue;
                }
                n4 += ipf3.getWidth();
            }
            if (n5 > 0 && (n3 = iph2.getWidth() - n4) > 0) {
                int n6;
                for (n6 = 0; n6 < iph2.bfn(); ++n6) {
                    ipf ipf4 = iph2.RO(n6);
                    if (!ipf4.djO() || ipf4.djQ() == null || !ipf4.dkj()) continue;
                    ipf4.setWidth(0);
                }
                while (n3 > 0) {
                    n6 = Math.max(n3 / n5, 1);
                    for (int i = 0; i < iph2.bfn() && n3 > 0; ++i) {
                        ipf ipf5 = iph2.RO(i);
                        if (!ipf5.djO() || ipf5.djQ() == null || !ipf5.dkj()) continue;
                        ipf5.setWidth(ipf5.getWidth() + n6);
                        n3 -= n6;
                    }
                }
            }
            if (n4 > iph2.getWidth()) {
                int n7;
                n3 = 0;
                for (n7 = 0; n7 < iph2.bfn(); ++n7) {
                    ipf ipf6 = iph2.RO(n7);
                    if (!ipf6.djO() || !ipf6.dkk()) continue;
                    ++n3;
                }
                if (n3 > 0) {
                    n7 = n4 - iph2.getWidth();
                    while (n7 > 0 && n3 > 0) {
                        int n8 = Math.max(n7 / n3, 1);
                        boolean bl = false;
                        for (int i = 0; i < iph2.bfn() && n7 > 0 && n3 > 0; ++i) {
                            ipf ipf7 = iph2.RO(i);
                            if (!ipf7.djO() || !ipf7.dkk() || ipf7.getWidth() <= 0) continue;
                            int n9 = ipf7.getWidth() - n8;
                            if (n9 > 0) {
                                n7 -= n8;
                                ipf7.setWidth(n9);
                                bl = true;
                                continue;
                            }
                            n7 -= ipf7.getWidth();
                            ipf7.setWidth(0);
                            --n3;
                            bl = true;
                        }
                        if (bl) continue;
                        break;
                    }
                }
                for (n7 = 0; n7 < iph2.bfn(); ++n7) {
                    ipf ipf8 = iph2.RO(n7);
                    if (!ipf8.djO() || !ipf8.dkj()) continue;
                    ipf8.setWidth(0);
                }
            }
            if (!this.mtM) {
                for (n3 = 0; n3 < iph2.bfn(); ++n3) {
                    ipf ipf9 = iph2.RO(n3);
                    if (!ipf9.djO()) continue;
                    ipf9.r(n, 0, ipf9.getWidth(), iph2.getHeight());
                    n += ipf9.getWidth();
                }
            } else {
                for (n3 = iph2.bfn() - 1; n3 >= 0; --n3) {
                    ipf ipf10 = iph2.RO(n3);
                    if (!ipf10.djO()) continue;
                    ipf10.r(n, 0, ipf10.getWidth(), iph2.getHeight());
                    n += ipf10.getWidth();
                }
            }
        } else {
            int n10;
            int n11 = 0;
            int n12 = 0;
            for (n10 = 0; n10 < iph2.bfn(); ++n10) {
                ipf ipf11 = iph2.RO(n10);
                if (!ipf11.djO() || ipf11.djQ() == null) continue;
                if (ipf11.dkj()) {
                    ++n12;
                    continue;
                }
                n11 += ipf11.getHeight();
            }
            if (n12 > 0 && (n10 = iph2.getHeight() - n11) > 0) {
                int n13;
                for (n13 = 0; n13 < iph2.bfn(); ++n13) {
                    ipf ipf12 = iph2.RO(n13);
                    if (!ipf12.djO() || ipf12.djQ() == null || !ipf12.dkj()) continue;
                    ipf12.setHeight(0);
                }
                while (n10 > 0) {
                    n13 = Math.max(n10 / n12, 1);
                    for (int i = 0; i < iph2.bfn() && n10 > 0; ++i) {
                        ipf ipf13 = iph2.RO(i);
                        if (!ipf13.djO() || ipf13.djQ() == null || !ipf13.dkj()) continue;
                        ipf13.setHeight(ipf13.getHeight() + n13);
                        n10 -= n13;
                    }
                }
            }
            if (n11 > iph2.getHeight()) {
                int n14;
                n10 = 0;
                for (n14 = 0; n14 < iph2.bfn(); ++n14) {
                    ipf ipf14 = iph2.RO(n14);
                    if (!ipf14.djO() || !ipf14.dkk()) continue;
                    ++n10;
                }
                if (n10 > 0) {
                    n14 = n11 - iph2.getHeight();
                    while (n14 > 0 && n10 > 0) {
                        int n15 = Math.max(n14 / n10, 1);
                        boolean bl = false;
                        for (int i = 0; i < iph2.bfn() && n14 > 0 && n10 > 0; ++i) {
                            ipf ipf15 = iph2.RO(i);
                            if (!ipf15.djO() || !ipf15.dkk() || ipf15.getHeight() <= 0) continue;
                            int n16 = ipf15.getHeight() - n15;
                            if (n16 > 0) {
                                n14 -= n15;
                                ipf15.setHeight(n16);
                                bl = true;
                                continue;
                            }
                            n14 -= ipf15.getHeight();
                            ipf15.setHeight(0);
                            --n10;
                            bl = true;
                        }
                        if (bl) continue;
                        break;
                    }
                }
                for (n14 = 0; n14 < iph2.bfn(); ++n14) {
                    ipf ipf16 = iph2.RO(n14);
                    if (!ipf16.djO() || !ipf16.dkj()) continue;
                    ipf16.setHeight(0);
                }
            }
            if (!this.mtM) {
                for (n10 = 0; n10 < iph2.bfn(); ++n10) {
                    ipf ipf17 = iph2.RO(n10);
                    if (!ipf17.djO()) continue;
                    ipf17.r(0, n2, iph2.getWidth(), ipf17.getHeight());
                    n2 += ipf17.getHeight();
                }
            } else {
                for (n10 = iph2.bfn() - 1; n10 >= 0; --n10) {
                    ipf ipf18 = iph2.RO(n10);
                    if (!ipf18.djO()) continue;
                    ipf18.r(0, n2, iph2.getWidth(), ipf18.getHeight());
                    n2 += ipf18.getHeight();
                }
            }
        }
    }

    public ire dlY() {
        return this.msb;
    }

    public static iqo dmS() {
        return mtN;
    }

    public static iqo dmT() {
        return mtO;
    }

    public static iqo dmU() {
        return mtP;
    }

    public static iqo dmV() {
        return mtQ;
    }
}

