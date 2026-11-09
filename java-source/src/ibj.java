/*
 * Decompiled with CFR.
 */
public class ibj
extends ihm {
    private lox lES;
    private String lET;
    private int lEU;
    private int lEV;
    private int lEW;
    private int lEX;
    private int lEY;
    private ipx lEZ;
    private ipx lFa;
    private ipx lFb;

    public ibj(String string, String string2, ioa ioa2, joa joa2, lox lox2, String string3, int n, int n2, int n3, int n4, int n5) {
        super(string, string2, ioa2, joa2, 2, 3);
        this.lES = lox2;
        this.lET = string3;
        this.lEU = n;
        this.lEV = n2;
        this.lEW = n3;
        this.lEX = n4;
        this.lEY = n5;
        this.a(iod.moE);
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(36, 0, 36, 70);
        this.cXC().f(this.lES);
        this.cXC().QT(12);
        this.cXC().QU(0);
        this.lEZ = ipx.j(new ipf[0]);
        this.cXE().W(ipx.c(new ipf[]{this.lEZ}));
        this.lFa = ipx.a(1, 4, new ipf[0]);
        this.cXE().W(this.lFa);
        ipx ipx2 = new ipx(iqo.dmS());
        this.cXE().W(ipx2);
        ipx2.W(new ipx(iqv.dnf()));
        ivc ivc2 = new ivc(this){
            final /* synthetic */ ibj lFc;
            {
                this.lFc = ibj2;
            }

            public void cLq() {
                this.lFc.close();
            }
        };
        ipx2.W(ivc2);
        this.lFb = ipx.a(5, 1, new ipf[0]);
        ipx2.W(this.lFb);
        this.cXE().W(ipx.a(1, this.lEY, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        iqa iqa2 = new iqa(this.lET, this.lEU, this.lEV, this.lEW, this.lEX);
        iqa2.a(iqb.mtp);
        return iqa2;
    }

    protected ipx cMt() {
        return this.lEZ;
    }

    protected int cMu() {
        return ((iqu)this.lFa.djQ()).getHeight();
    }

    protected void PG(int n) {
        this.lFa.a(new iqu(1, n));
    }

    protected int cMv() {
        return ((iqu)this.lFb.djQ()).getWidth();
    }

    protected void PH(int n) {
        this.lFb.a(new iqu(n, 1));
    }

    protected String cMw() {
        return this.lET;
    }
}

