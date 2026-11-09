/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  lcw
 */
public class hdx
extends hdv {
    public static final hdv.a<hdx> kbg = new hdv.a();
    public static final hdx kbF = hdx.LX(cxd.fJp);
    public static final hdx kbG = hdx.LX(cxd.fJq);
    public static final hdx kbH = hdx.LX(cxd.fJj);
    public static final hdx kbI = hdx.LX(cxd.fJs);

    public static hdx LX(int n) {
        hdv hdv2 = hdx.b(n, hdv.b.kbd);
        return hdv2 != null ? (hdx)hdx.b(n, hdv.b.kbd) : null;
    }

    protected hdx(int n) {
        super(n);
    }

    @Override
    public hdv.b cef() {
        return hdv.b.kbd;
    }

    public final boolean ceu() {
        return this.cey().ceu();
    }

    public final hdx cev() {
        ler ler2 = lea.eoa().g(this.cey());
        if (ler2 == null) {
            return null;
        }
        return new hdx(ler2.getType());
    }

    public final hdx cew() {
        ler ler2 = lea.eoa().h(this.cey());
        if (ler2 == null) {
            return null;
        }
        return new hdx(ler2.getType());
    }

    public final boolean cex() {
        return lea.eoa().contains(this.Type);
    }

    @Override
    public lhu atw() {
        return this.cey().atw();
    }

    @Override
    public lhu cej() {
        return this.cey().atw();
    }

    @Override
    public boolean awQ() {
        return this.cey().awQ();
    }

    @Override
    public lcf awS() {
        return lcw.enh();
    }

    @Override
    public lgs awT() {
        return this.cey().awT();
    }

    @Override
    public lgs cel() {
        return this.cey().cel();
    }

    @Override
    public boolean ck(int n, int n2) {
        assert (lda.acc(n + n2));
        return false;
    }

    @Override
    public hdu a(hel hel2, ldv ldv2) {
        return new hea(hel2, ldv2, this);
    }

    @Override
    public hdv LV(int n) {
        return new hdx(n);
    }

    @Override
    protected les ceo() {
        return lea.enZ();
    }

    private lhg cey() {
        return (lhg)lea.enZ().acv(this.Type);
    }
}

