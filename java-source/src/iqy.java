/*
 * Decompiled with CFR.
 */
public class iqy
extends iqz {
    private ire msb;
    private int mug;

    public iqy(ire ire2, int n) {
        this.msb = ire2;
        this.mug = n;
    }

    public ire dlY() {
        return this.msb;
    }

    public int dni() {
        return this.mug;
    }

    @Override
    public void e(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        int n = 0;
        int n2 = 0;
        if (this.msb == ire.muk) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            for (int i = 0; i < iph2.bfn(); ++i) {
                ipf ipf3 = iph2.RO(i);
                if (ipf3.djO()) {
                    n4 += ipf3.getWidth();
                    n3 = Math.max(n3, ipf3.getHeight());
                }
                if (++n5 != this.mug) continue;
                n = Math.max(n, n4);
                n2 += n3;
                n4 = 0;
                n3 = 0;
                n5 = 0;
            }
            n = Math.max(n, n4);
            if (iph2.bfn() % this.mug > 0) {
                n2 += n3;
            }
        } else {
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            for (int i = 0; i < iph2.bfn(); ++i) {
                ipf ipf4 = iph2.RO(i);
                if (ipf4.djO()) {
                    n7 += ipf4.getHeight();
                    n6 = Math.max(n6, ipf4.getWidth());
                }
                if (++n8 != this.mug) continue;
                n2 = Math.max(n2, n7);
                n += n6;
                n6 = 0;
                n7 = 0;
                n8 = 0;
            }
            n2 = Math.max(n2, n7);
            if (iph2.bfn() % this.mug > 0) {
                n += n6;
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
            ipf ipf3;
            int n3;
            int n4 = this.mug;
            int n5 = (iph2.bfn() + n4 - 1) / n4;
            int[] nArray = new int[n4];
            int[] nArray2 = new int[n5];
            boolean[] blArray = new boolean[n4];
            int n6 = 0;
            boolean[] blArray2 = new boolean[n5];
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            for (n3 = 0; n3 < iph2.bfn(); ++n3) {
                ipf3 = iph2.RO(n3);
                if (ipf3.dkj()) {
                    blArray[n8] = true;
                    blArray2[n9] = true;
                    ++n7;
                    ++n6;
                }
                if (ipf3.djO()) {
                    nArray[n8] = Math.max(nArray[n8], ipf3.getWidth());
                    nArray2[n9] = Math.max(nArray2[n9], ipf3.getHeight());
                }
                if (++n8 != n4) continue;
                n8 = 0;
                ++n9;
            }
            this.a(iph2, n4, nArray, blArray, n6, n5, nArray2, blArray2, n7);
            n8 = 0;
            n9 = 0;
            for (n3 = 0; n3 < iph2.bfn(); ++n3) {
                ipf3 = iph2.RO(n3);
                if (ipf3.djO()) {
                    ipf3.r(n, n2, nArray[n8], nArray2[n9]);
                }
                n += nArray[n8];
                if (++n8 != n4) continue;
                n = 0;
                n2 += nArray2[n9];
                n8 = 0;
                ++n9;
            }
        } else {
            ipf ipf4;
            int n10;
            int n11 = this.mug;
            int n12 = (iph2.bfn() + n11 - 1) / n11;
            int[] nArray = new int[n12];
            int[] nArray3 = new int[n11];
            boolean[] blArray = new boolean[n12];
            int n13 = 0;
            boolean[] blArray3 = new boolean[n11];
            int n14 = 0;
            int n15 = 0;
            int n16 = 0;
            for (n10 = 0; n10 < iph2.bfn(); ++n10) {
                ipf4 = iph2.RO(n10);
                if (ipf4.dkj()) {
                    blArray[n15] = true;
                    blArray3[n16] = true;
                    ++n14;
                    ++n13;
                }
                if (ipf4.djO()) {
                    nArray[n15] = Math.max(nArray[n15], ipf4.getWidth());
                    nArray3[n16] = Math.max(nArray3[n16], ipf4.getHeight());
                }
                if (++n16 != n11) continue;
                n16 = 0;
                ++n15;
            }
            this.a(iph2, n12, nArray, blArray, n13, n11, nArray3, blArray3, n14);
            n15 = 0;
            n16 = 0;
            for (n10 = 0; n10 < iph2.bfn(); ++n10) {
                ipf4 = iph2.RO(n10);
                if (ipf4.djO()) {
                    ipf4.r(n, n2, nArray[n15], nArray3[n16]);
                }
                n2 += nArray3[n16];
                if (++n16 != n11) continue;
                n2 = 0;
                n += nArray[n15];
                n16 = 0;
                ++n15;
            }
        }
    }

    private void a(iph iph2, int n, int[] nArray, boolean[] blArray, int n2, int n3, int[] nArray2, boolean[] blArray2, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        if (n2 > 0) {
            n8 = 0;
            for (n7 = 0; n7 < n; ++n7) {
                if (blArray[n7]) {
                    nArray[n7] = 0;
                    continue;
                }
                n8 += nArray[n7];
            }
            n7 = iph2.getWidth() - n8;
            while (n7 > 0) {
                n6 = Math.max(n7 / n2, 1);
                for (n5 = 0; n5 < n && n7 > 0; ++n5) {
                    if (!blArray[n5]) continue;
                    int n9 = n5;
                    nArray[n9] = nArray[n9] + n6;
                    n7 -= n6;
                }
            }
        }
        if (n4 > 0) {
            n8 = 0;
            for (n7 = 0; n7 < n3; ++n7) {
                if (blArray2[n7]) {
                    nArray2[n7] = 0;
                    continue;
                }
                n8 += nArray2[n7];
            }
            n7 = iph2.getHeight() - n8;
            while (n7 > 0) {
                n6 = Math.max(n7 / n4, 1);
                for (n5 = 0; n5 < n3 && n7 > 0; ++n5) {
                    if (!blArray2[n5]) continue;
                    int n10 = n5;
                    nArray2[n10] = nArray2[n10] + n6;
                    n7 -= n6;
                }
            }
        }
    }
}

