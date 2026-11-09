/*
 * Decompiled with CFR.
 */
public class igy
extends ipx {
    public igy(String string, int n) {
        this.a(iqo.dmS());
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(ipx.d(this.QP(n)));
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(new ihh());
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(ipx.d(ipx.a(32, 32, this.qh(string))));
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(ipx.d(this.qi(string)));
        this.W(ipx.c(new ipf[0]));
        this.W(ipx.a(8, 1, new ipf[0]));
    }

    private ipf QP(int n) {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 14);
        ist2.Rk(12357465);
        ist2.sv(false);
        ist2.a(isu.mxQ);
        ist2.setSize(30, 20);
        ist2.setText(n + "x");
        return ist2;
    }

    private ipf qh(String string) {
        lgw lgw2 = (lgw)lea.enW().zx(string);
        String string2 = "/dfdata/texture/dds/" + lgw2.enm();
        return new ipb(string2);
    }

    private ipf qi(String string) {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 14);
        ist2.Rk(0xABABAB);
        ist2.o(lww.tjG.bD(string));
        return ist2;
    }
}

