/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Random;

public class cmy {
    private static final int eNf = 10;
    private static final int eNg = 10;
    private static final int eNh = 100;
    private double[] eNi = new double[8];
    private double[] eNj = new double[8];
    private double[] eNk = new double[8];
    private double[] eNl = new double[8];
    private double[] eNm = new double[8];
    private double[] eNn = new double[8];
    private int eNo;
    private int eNp;
    private int eNq;
    private int eNr = 7;
    private static double eNs = 0.85f;
    private static double eNt = 0.55f;
    private static Random eNu = new Random();

    public cmy() {
        this.initialize();
    }

    public void initialize() {
        int n;
        this.eNm[6] = 1.0;
        this.eNm[5] = 1.25;
        this.eNm[4] = 1.5;
        this.eNm[3] = 1.75;
        this.eNm[2] = 2.0;
        this.eNm[1] = 10.0;
        this.eNm[0] = 35.0;
        this.eNn[6] = 1.0;
        this.eNn[5] = 1.25;
        this.eNn[4] = 1.5;
        this.eNn[3] = 1.75;
        this.eNn[2] = 2.0;
        this.eNn[1] = 12.5;
        this.eNn[0] = 50.0;
        double d2 = eNs / (double)(this.eNm.length - 1);
        for (int i = 0; i < this.eNm.length - 1; ++i) {
            this.eNi[i] = d2 / this.eNm[i];
        }
        double d3 = 0.0;
        for (n = 0; n < this.eNm.length - 1; ++n) {
            d3 += this.eNi[n];
        }
        this.eNk[0] = this.eNi[0];
        for (n = 1; n < this.eNm.length - 1; ++n) {
            this.eNk[n] = this.eNk[n - 1] + this.eNi[n];
        }
        d2 = eNs / (double)(this.eNn.length - 1);
        for (n = 0; n < this.eNn.length - 1; ++n) {
            this.eNj[n] = d2 / this.eNn[n];
        }
        d3 = 0.0;
        for (n = 0; n < this.eNn.length - 1; ++n) {
            d3 += this.eNj[n];
        }
        this.eNl[0] = this.eNj[0];
        for (n = 1; n < this.eNn.length - 1; ++n) {
            this.eNl[n] = this.eNl[n - 1] + this.eNj[n];
        }
        this.eNo = (int)(8.0 * eNu.nextDouble());
        this.eNp = (int)(8.0 * eNu.nextDouble());
        this.eNq = (int)(8.0 * eNu.nextDouble());
    }

    public void aTX() {
        int n;
        this.initialize();
        int n2 = 10000000;
        int n3 = cug.frc;
        int n4 = 0;
        for (n = 0; n < n2; ++n) {
            n4 += this.rU(n3);
        }
        n = n2 * this.rV(n3);
        int n5 = n4 - n;
    }

    private double[] rS(int n) {
        double[] dArray = this.eNk;
        if (n == cug.frb) {
            dArray = this.eNk;
        } else if (n == cug.frc) {
            dArray = this.eNl;
        } else assert (false);
        return dArray;
    }

    private double[] rT(int n) {
        double[] dArray = this.eNm;
        if (n == cug.frb) {
            dArray = this.eNm;
        } else if (n == cug.frc) {
            dArray = this.eNn;
        } else assert (false);
        return dArray;
    }

    public int rU(int n) {
        int n2;
        double d2 = eNu.nextDouble();
        double d3 = 0.0;
        for (n2 = 0; n2 < 7; ++n2) {
            double d4 = this.rS(n)[n2] - d3;
            assert (d4 > 0.0);
            if (d2 >= d3 && d2 < this.rS(n)[n2]) {
                this.eNp = this.eNq = n2;
                this.eNo = this.eNq;
                int n3 = (int)(this.rT(n)[this.eNo] * (double)this.rV(n));
                return n3;
            }
            d3 = this.rS(n)[n2];
        }
        if (eNu.nextDouble() <= eNt) {
            this.eNo = this.eNp = (n2 = (int)(eNu.nextDouble() * 8.0));
            this.eNq = (int)(8.0 * eNu.nextDouble());
            while (this.eNq == this.eNo) {
                this.eNq = (int)(8.0 * eNu.nextDouble());
            }
        } else {
            this.eNo = (int)(8.0 * eNu.nextDouble());
            this.eNp = (int)(8.0 * eNu.nextDouble());
            this.eNq = (int)(8.0 * eNu.nextDouble());
        }
        while (this.eNo == this.eNp && this.eNo == this.eNq) {
            this.eNo = (int)(8.0 * eNu.nextDouble());
            this.eNp = (int)(8.0 * eNu.nextDouble());
            this.eNq = (int)(8.0 * eNu.nextDouble());
        }
        return 0;
    }

    public int aTY() {
        return cug.fkb;
    }

    public int rV(int n) {
        if (n == cug.frb) {
            return 10;
        }
        if (n == cug.frc) {
            return 100;
        }
        return 10;
    }

    public int aTZ() {
        return cug.fkb;
    }

    public void aUa() {
        this.eNp = this.eNq = this.eNr;
        this.eNo = this.eNq;
    }

    public int aUb() {
        return this.eNo;
    }

    public int aUc() {
        return this.eNp;
    }

    public int aUd() {
        return this.eNq;
    }
}

