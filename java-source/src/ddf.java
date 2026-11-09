/*
 * Decompiled with CFR.
 */
public class ddf {
    public dde[] gee = null;

    public ddf bjV() {
        assert (this.gee != null);
        assert (this.gee[0] instanceof ddd) : this.gee[0].getClass().getName();
        ddf ddf2 = new ddf();
        dde[] ddeArray = new dde[this.gee.length];
        int n2 = this.gee.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ddeArray[i2] = this.gee[i2].bjU();
        }
        ddf2.gee = ddeArray;
        return ddf2;
    }

    public int bjW() {
        assert (this.gee != null);
        assert (this.gee[0] instanceof ddd);
        ddd ddd2 = (ddd)this.gee[0];
        return ddd2.bjQ().aDI();
    }

    public ddh bjX() {
        assert (this.gee != null);
        int n2 = this.gee.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(this.gee[i2] instanceof ddh)) continue;
            return (ddh)this.gee[i2];
        }
        return null;
    }
}

