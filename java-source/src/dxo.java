/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dxo {
    private dxp hss;
    private ldv hst;
    private String hsu;
    long hsv;
    private boolean hsw;
    private int di = -1;
    private String hsx;

    dxo(dxp dxp2, ldv ldv2, boolean bl, String string, String string2) {
        this.hss = dxp2;
        this.hst = ldv2;
        this.hsw = bl;
        this.hsv = 0L;
        this.hsu = string;
        this.hsx = string2;
        this.bEr();
    }

    public int ib() {
        if (this.di == -1) {
            this.di = lcr.abS((int)this.hst.enw());
        }
        return this.di;
    }

    public String toString() {
        String string = "PSOGuid " + this.hst.toString() + " - InternalLogin " + this.hsw + " - LastUseTime " + this.hsv + " SessionKey " + this.hsu;
        return string;
    }

    public boolean bEm() {
        return this.hsw;
    }

    public long bEn() {
        return this.hsv;
    }

    public dxp bEo() {
        return this.hss;
    }

    public ldv bEp() {
        return this.hst;
    }

    public String bEq() {
        return this.hsu;
    }

    public void bEr() {
        this.hss.a(this);
    }

    public String bEs() {
        return this.hsx;
    }
}

