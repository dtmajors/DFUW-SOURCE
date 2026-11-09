/*
 * Decompiled with CFR.
 */
public class lif {
    private double rom;
    private double ron;
    private double roo;
    private long rop;

    public lif(double d2, double d3, boolean bl) {
        this.ron = d2;
        this.roo = d3;
        this.rom = bl ? this.ron : 0.0;
        this.rop = System.currentTimeMillis();
    }

    public double esj() {
        this.eso();
        return this.rom;
    }

    public double esk() {
        return this.ron;
    }

    public double esl() {
        return this.roo;
    }

    public void ei(double d2) {
        assert (d2 >= 0.01);
        this.ron = d2;
        if (this.rom > this.ron) {
            this.rom = this.ron;
        }
    }

    public void ej(double d2) {
        assert (d2 > 0.0);
        this.roo = d2;
    }

    public boolean ek(double d2) {
        return this.esj() >= d2;
    }

    public boolean el(double d2) {
        this.eso();
        if (d2 > this.rom) {
            return false;
        }
        this.rom -= d2;
        return true;
    }

    public double esm() {
        this.eso();
        double d2 = this.rom;
        this.rom = 0.0;
        return d2;
    }

    public void esn() {
        this.eso();
        this.rom = this.ron;
    }

    private void eso() {
        long l = System.currentTimeMillis();
        if (l <= this.rop + 10L) {
            return;
        }
        double d2 = (double)(l - this.rop) / 1000.0;
        this.rom += this.roo * d2;
        if (this.rom > this.ron) {
            this.rom = this.ron;
        }
        this.rop = l;
    }
}

