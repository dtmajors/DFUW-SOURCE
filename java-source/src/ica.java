/*
 * Decompiled with CFR.
 */
public class ica
extends ipx {
    private ibu lGQ;
    private ipk lGR;

    public ica(ibu ibu2) {
        this.lGQ = ibu2;
        this.a(irl.dnr());
        this.lGR = new ipk(0x1A1A1A);
        this.lGR.hz(0.7f);
        this.lGR.setVisible(false);
        this.W(this.lGR);
        ipx ipx2 = ipx.l(new ipf[0]);
        this.W(ipx2);
        ipx2.W(ipx.a(8, 8, new ipf[0]));
        izy izy2 = new izy(ibu2.cNq().bD(new Object[0]).exA());
        ipx2.W(ipx.c(new ipf[]{izy2}));
        ipx2.W(ipx.a(48, 16, new ipf[0]));
        izy izy3 = new izy(ibu2.cNw());
        ipx2.W(ipx.c(new ipf[]{izy3}));
        ipx2.W(ipx.a(8, 8, new ipf[0]));
    }

    @Override
    public void cND() {
        this.lGR.setVisible(this.dkb());
    }

    @Override
    public boolean du(int n, int n2) {
        this.c(this.lGQ);
        return true;
    }

    public void c(ibu ibu2) {
    }
}

