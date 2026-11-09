/*
 * Decompiled with CFR.
 */
public class jhs
extends ihm {
    private jhl nfq;
    private iuy nfr;
    private iuy nfs;
    private iuy nft;

    public jhs(ioa ioa2, joa joa2, jhl jhl2) {
        super("TrackerOptionsWindow", "TrackerWindow.swf", ioa2, joa2, 2, 3);
        this.nfq = jhl2.dGi();
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(36, 0, 40, 70);
        this.cXC().f(lyx.tLQ);
        this.cXC().QT(10);
        this.cXC().QU(0);
        this.cXE().W(ipx.a(1, 11, new ipf[0]));
        this.cXE().W(this.dGs());
        this.cXE().W(ipx.a(1, 11, new ipf[0]));
        this.cXE().W(ipx.l(ipx.a(1, 1, new ipf[0]), ipx.c(new ipk(0x313131, 1, 1)), ipx.a(12, 1, new ipf[0])));
        this.cXE().W(ipx.a(1, 11, new ipf[0]));
        this.cXE().W(this.dGv());
        this.cXE().W(ipx.a(1, 11, new ipf[0]));
        this.cXE().W(ipx.l(ipx.a(1, 1, new ipf[0]), ipx.c(new ipk(0x313131, 1, 1)), ipx.a(12, 1, new ipf[0])));
        this.cXE().W(ipx.a(1, 11, new ipf[0]));
        this.cXE().W(this.dGy());
        this.cXE().W(ipx.a(1, 11, new ipf[0]));
        this.cXE().W(this.dGB());
        this.cXE().W(ipx.a(1, 70, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        iqa iqa2 = new iqa("window_tracker_options_01", 36, 30, 222, 132, iqb.mtp);
        return iqa2;
    }

    protected void b(jhl jhl2) {
    }

    private ipf dGs() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dGt()));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 21)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dGu()));
        ipx2.W(ipx.a(24, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dGt() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 14);
        ist2.Rk(0xABABAB);
        ist2.o(lyx.tLR.bD(new Object[0]));
        return ist2;
    }

    private ipf dGu() {
        this.nfr = new iuy();
        this.nfr.hX(this.nfq.neZ);
        return this.nfr;
    }

    private ipf dGv() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dGw()));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 21)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dGx()));
        ipx2.W(ipx.a(24, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dGw() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 14);
        ist2.Rk(0xABABAB);
        ist2.o(lyx.tLS.bD(new Object[0]));
        return ist2;
    }

    private ipf dGx() {
        this.nfs = new iuy();
        this.nfs.hX(this.nfq.nfa);
        return this.nfs;
    }

    private ipf dGy() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dGz()));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 21)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dGA()));
        ipx2.W(ipx.a(24, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dGz() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 14);
        ist2.Rk(0xABABAB);
        ist2.o(lyx.tLT.bD(new Object[0]));
        return ist2;
    }

    private ipf dGA() {
        this.nft = new iuy();
        this.nft.hX(this.nfq.nfb);
        return this.nft;
    }

    private ipf dGB() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(new iur(this){
            final /* synthetic */ jhs nfu;
            {
                this.nfu = jhs2;
            }

            public void cLq() {
                jhs.a((jhs)this.nfu).neZ = jhs.b(this.nfu).dir();
                jhs.a((jhs)this.nfu).nfa = jhs.c(this.nfu).dir();
                jhs.a((jhs)this.nfu).nfb = jhs.d(this.nfu).dir();
                this.nfu.close();
                this.nfu.b(jhs.a(this.nfu));
            }
        }));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(new ivc(this){
            final /* synthetic */ jhs nfu;
            {
                this.nfu = jhs2;
            }

            public void cLq() {
                this.nfu.close();
            }
        }));
        ipx2.W(ipx.a(10, 1, new ipf[0]));
        return ipx2;
    }

    static /* synthetic */ jhl a(jhs jhs2) {
        return jhs2.nfq;
    }

    static /* synthetic */ iuy b(jhs jhs2) {
        return jhs2.nfr;
    }

    static /* synthetic */ iuy c(jhs jhs2) {
        return jhs2.nfs;
    }

    static /* synthetic */ iuy d(jhs jhs2) {
        return jhs2.nft;
    }
}

