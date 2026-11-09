/*
 * Decompiled with CFR.
 */
public class ich
extends ipx {
    private ldj lHg;
    private ipk lGR;

    public ich(ldj ldj2) {
        this.lHg = ldj2;
        this.a(irl.dnr());
        this.lGR = new ipk(0x1A1A1A);
        this.lGR.hz(0.7f);
        this.lGR.setVisible(false);
        this.W(this.lGR);
        ipx ipx2 = ipx.l(new ipf[0]);
        this.W(ipx2);
        ipx2.W(ipx.a(8, 8, new ipf[0]));
        izy izy2 = new izy("/" + ldj2.ipt, ldj2.bdP);
        ipx2.W(izy2);
        ipx2.W(ipx.a(8, 8, new ipf[0]));
    }

    @Override
    public void cND() {
        this.lGR.setVisible(this.dkb());
    }

    @Override
    public boolean du(int n, int n2) {
        this.b(this.lHg);
        return true;
    }

    public void b(ldj ldj2) {
    }
}

