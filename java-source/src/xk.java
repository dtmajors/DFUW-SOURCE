/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class xk {
    private xk() {
    }

    public static xj a(wy wy2, xl xl2, xm xm2, int n) {
        boolean bl = lcw.ena() || lcw.enb();
        switch (xm2) {
            case bbm: {
                return bl ? new xp(wy2, xl2, n) : new ym(wy2, xl2, n);
            }
            case bbn: {
                return bl ? new xw(wy2, xl2, n) : new yt(wy2, xl2, n);
            }
            case bbo: {
                return bl ? new xq(wy2, xl2, n) : new yn(wy2, xl2, n);
            }
            case bbq: {
                return bl ? new xv(wy2, xl2, n) : new ys(wy2, xl2, n);
            }
            case bbr: {
                return bl ? new xt(wy2, xl2, n) : new yq(wy2, xl2, n);
            }
            case bbs: {
                return bl ? new xs(wy2, xl2, n) : new yp(wy2, xl2, n);
            }
            case bbu: {
                return bl ? new xn(wy2, xl2, n) : new yk(wy2, xl2, n);
            }
            case bbt: {
                return bl ? new xo(wy2, xl2, n) : new yl(wy2, xl2, n);
            }
            case bbv: {
                return new yj(wy2, xl2, n);
            }
            case bbp: {
                return bl ? new xr(wy2, xl2, n) : new yo(wy2, xl2, n);
            }
            case bbw: {
                return bl ? new xu(wy2, xl2, n) : new yr(wy2, xl2, n);
            }
        }
        return null;
    }
}

