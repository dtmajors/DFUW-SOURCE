/*
 * Decompiled with CFR.
 */
public class hyg {
    private final hyf lnw;
    private a lnx;

    public hyg(hyf hyf2) {
        this.lnw = hyf2;
        this.lnx = this.cDM();
    }

    public final float kp(float f2) {
        double d2 = this.lnx.lnD * (double)f2 + this.lnx.lnz;
        double d3 = 0.0;
        switch (this.lnw) {
            case lnq: {
                d3 = this.dc(d2);
                break;
            }
            case lnr: {
                d3 = this.dd(d2);
                break;
            }
            case lns: {
                d3 = this.de(d2);
                break;
            }
            case lnt: {
                d3 = this.df(d2);
                break;
            }
            case lnu: {
                d3 = this.dg(d2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        d3 = (d3 - this.lnx.lnB) / this.lnx.lnE;
        assert (d3 >= 0.0);
        assert (d3 <= 1.0);
        return (float)d3;
    }

    private final double dc(double d2) {
        return d2;
    }

    private final double dd(double d2) {
        return Math.sin(d2);
    }

    private final double de(double d2) {
        return Math.tan(d2);
    }

    private final double df(double d2) {
        return Math.log(d2);
    }

    private final double dg(double d2) {
        return Math.exp(d2);
    }

    private final a cDM() {
        switch (this.lnw) {
            case lnq: {
                return new a(0.0, 1.0, 0.0, 1.0);
            }
            case lnr: {
                return new a(-1.5707963267948966, 1.5707963267948966, -1.0, 1.0);
            }
            case lns: {
                return new a(-1.5, 1.5, Math.tan(-1.5), Math.tan(1.5));
            }
            case lnt: {
                return new a(0.1, 4.0, Math.log(0.1), Math.log(4.0));
            }
            case lnu: {
                return new a(0.0, 3.0, Math.exp(0.0), Math.exp(3.0));
            }
        }
        assert (false);
        return null;
    }
}

