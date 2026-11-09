/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ipx
extends iph {
    public ipx() {
    }

    public ipx(iqz iqz2) {
        this.a(iqz2);
    }

    @Override
    public void dkh() {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            ipf2.dkh();
        }
    }

    public static ipx b(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqz.dnj());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx a(iqz iqz2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqz2);
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx c(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqv.dnf());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx a(ipn ipn2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqv.dnf());
        ipx2.a(ipn2);
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx a(int n, int n2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new iqu(n, n2));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx b(int n, int n2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new irm(n, n2));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx a(int n, int n2, ire ire2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new irm(n, n2, ire2));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx d(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqp.dmW());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx b(ipn ipn2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqp.dmW());
        ipx2.a(ipn2);
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx e(ipf ... ipfArray) {
        ipx ipx2 = new ipx(irg.dnk());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx f(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqp.dmX());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx g(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqp.dmY());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx h(ipf ... ipfArray) {
        ipx ipx2 = new ipx(irl.dnr());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx i(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqm.dmQ());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx j(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqo.dmT());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx c(ipn ipn2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqo.dmT());
        ipx2.a(ipn2);
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx k(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqo.dmV());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx l(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqo.dmS());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx m(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqo.dmU());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx a(int n, int n2, int n3, int n4, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new iqr(n, n2, n3, n4));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx b(int n, int n2, int n3, int n4, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new iqs(n, n2, n3, n4));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx dmu() {
        return ipx.c(0, 0, 0, 0, new ipf[0]);
    }

    public static ipx n(ipf ... ipfArray) {
        return ipx.c(0, 0, 0, 0, ipfArray);
    }

    public static ipx c(int n, int n2, int n3, int n4, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new iqx(n, n2, n3, n4));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx o(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqx.dnh());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx c(int n, int n2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new ird(n, n2));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx p(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqw.dng());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx q(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iri.dnl());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx r(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iri.dnm());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx d(int n, int n2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new iql(n, n2));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx e(int n, int n2, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new irb(n, n2));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx a(ire ire2, int n, ipf ... ipfArray) {
        ipx ipx2 = new ipx(new iqy(ire2, n));
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx s(ipf ... ipfArray) {
        ipx ipx2 = new ipx(iqn.dmR());
        for (ipf ipf2 : ipfArray) {
            ipx2.W(ipf2);
        }
        return ipx2;
    }

    public static ipx a(ipx ipx2, boolean bl) {
        ipx2.rF(bl);
        return ipx2;
    }

    @Override
    public void dA(int n, int n2) {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            this.Y(ipf2);
        }
    }

    @Override
    public void did() {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            ipf2.did();
        }
    }

    @Override
    public void djn() {
        this.dkm();
    }

    @Override
    public void dkm() {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            ipf2.RM(this.getX() + this.djU());
            ipf2.RN(this.getY() + this.djV());
        }
    }

    @Override
    public void djo() {
    }

    @Override
    public void dkn() {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            ipf2.rl(this.djL() && this.djW());
        }
    }

    @Override
    public void dko() {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            ipf2.kL(this.getAlpha() * this.djX());
        }
    }

    @Override
    public void dkp() {
    }

    public void dmv() {
    }

    @Override
    public void dmf() {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            ipf2.rm(this.djR() && this.djY());
        }
    }

    @Override
    public void er(int n, int n2) {
        List<ipf> list = this.getChildren();
        for (ipf ipf2 : list) {
            ipf2.dkK();
        }
    }

    @Override
    boolean isVirtual() {
        return true;
    }

    @Override
    int RR(int n) {
        return n;
    }

    @Override
    int RS(int n) {
        return n;
    }

    @Override
    int dkG() {
        return this.dlA();
    }

    @Override
    void dkH() {
    }

    @Override
    void dkI() {
    }

    @Override
    void dlB() {
        super.dlB();
        this.djJ().dlB();
    }

    @Override
    void dlC() {
        super.dlC();
        this.djJ().dlC();
    }

    @Override
    void dkJ() {
    }

    @Override
    final int a(StringBuilder stringBuilder, int n) {
        if (this.dhV()) {
            List<ipf> list = this.getChildren();
            for (ipf ipf2 : list) {
                n = ipf2.a(stringBuilder, n);
            }
        }
        return n;
    }

    @Override
    void Y(ipf ipf2) {
        ipf2.RM(this.getX() + this.djU());
        ipf2.RN(this.getY() + this.djV());
        ipf2.rl(this.djL() && this.djW());
        ipf2.kL(this.getAlpha() * this.djX());
        ipf2.rm(this.djR() && this.djY());
    }
}

