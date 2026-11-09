/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
public class ekp
extends emr {
    private int ew = axz.cuC.ordinal();
    private int ith = 0;
    private double hsq = 0.0;
    private int isu = -1;

    public axz bHF() {
        return axz.getValueByOrdinal(this.ew);
    }

    public void a(axz axz2) {
        this.ew = axz2 == null ? this.ew : axz2.ordinal();
    }

    public int bIj() {
        return this.ith;
    }

    public void En(int n) {
        this.ith = n;
    }

    public double bHG() {
        return this.hsq;
    }

    public void ce(double d) {
        this.hsq = d;
    }

    public int bHH() {
        return this.isu;
    }

    public void Em(int n) {
        this.isu = n;
    }

    ekp() {
        super(13903);
    }

    public String bIk() {
        axz axz2 = this.bHF();
        if (!lcw.ena() && !lcw.enb()) {
            return axz2.name();
        }
        switch (axz2) {
            case cuI: {
                return axz2.YF().bD(cug.fqf, this.ith).exA();
            }
            case cuL: {
                return axz2.YF().bD(this.hsq).exA();
            }
            case cuN: 
            case cuO: {
                return axz2.YF().bD(this.isu).exA();
            }
        }
        return axz2.YF().bD(new Object[0]).exA();
    }
}

