/*
 * Decompiled with CFR.
 */
public class asr {
    private final int Size;
    private int ayO;
    private double[] value;
    private int[] bVR;

    private void c(int n, double d2) {
        int n2 = 0;
        double d3 = n;
        for (int i = 0; i < this.Size; ++i) {
            if (!((double)this.bVR[i] <= d3)) continue;
            d3 = this.bVR[i];
            n2 = i;
        }
        this.bVR[n2] = n;
        this.value[n2] = d2;
    }

    private double hY(int n) {
        int n2 = 0;
        double d2 = 0.0;
        for (int i = 0; i < this.Size; ++i) {
            if (n - this.bVR[i] > this.ayO) continue;
            d2 += this.value[i];
            ++n2;
        }
        if (n2 < 1) {
            return 0.0;
        }
        return d2 / (double)n2;
    }

    public double d(int n, double d2) {
        this.c(n, d2);
        return this.hY(n);
    }

    public asr(int n, int n2) {
        this.Size = n;
        this.ayO = n2;
        this.value = new double[this.Size];
        this.bVR = new int[this.Size];
        for (int i = 0; i < this.Size; ++i) {
            this.bVR[i] = -1;
            this.value[i] = 0.0;
        }
    }
}

