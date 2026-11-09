/*
 * Decompiled with CFR.
 */
public class ijr
extends iis {
    private ipb meB = null;
    private ipb meC = null;

    public ijr() {
        super(true, lyu.tKK);
        this.dal().qP("death_bar_background");
        this.dam().qP("death_bar_foreground1");
        this.dan().zY(14);
        this.meC = new ipb("death_bar_background_noise");
        this.cXE().W(this.meC);
        ipx ipx2 = ipx.h(ipx.d(this.dal()), ipx.d(this.dam()));
        this.cXE().W(ipx2);
        this.cXE().W(this.dan());
        this.meB = new ipb("death_bar_skull");
        this.cXE().W(this.meB);
        this.cXE().a(new ijs(ipx2, this.dan(), this.meB));
    }

    @Override
    public ije dae() {
        return new iit(this, ikd.mfz, lwx.tkO.bD(new Object[0]), false, lyu.tKB);
    }

    @Override
    public ikd daf() {
        return ikd.mfz;
    }

    private ipf dbH() {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.meC = new ipb("death_bar_background_noise");
        ipx2.W(ipx.d(this.meC));
        return ipx2;
    }

    private ipf cVk() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.cUv()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dan()));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cUv() {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(ipx.d(this.dal()));
        ipx2.W(ipx.d(this.dam()));
        return ipx2;
    }

    private ipf dbI() {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.meB = new ipb("death_bar_skull");
        ipx2.W(ipx.d(this.meB));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    @Override
    public void daa() {
        super.daa();
        if (this.meB != null) {
            this.meB.hz(this.daE());
        }
        if (this.meC != null) {
            this.meC.hz(this.daE());
        }
    }
}

