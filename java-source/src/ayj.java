/*
 * Decompiled with CFR.
 */
public class ayj {
    private long cyc;
    private long cyd;
    private double cyl;
    private long cyn;
    private dpv[] cza = null;

    public long aaP() {
        return this.cyc;
    }

    public long aaQ() {
        return this.cyd;
    }

    public double aaR() {
        return this.cyl;
    }

    public long aaS() {
        return this.cyn;
    }

    public dpv[] aaT() {
        return this.cza;
    }

    public int aaU() {
        int n = 0;
        for (int i = 0; i < this.cza.length; ++i) {
            if (this.cza[i].bsu() <= n) continue;
            n = this.cza[i].bsu();
        }
        return n;
    }

    public void aaV() {
        this.cyc = 86400000L;
        this.cyd = 10000L;
        this.cyl = 2700.0;
        this.cyn = 3600000L;
        this.cza = jvv.dTR();
    }
}

