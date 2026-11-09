/*
 * Decompiled with CFR.
 */
public class iom<T>
extends iot<T> {
    private iox lUa;
    private ist lUP;

    public iom(iou<T> iou2, T t, String string) {
        super(iou2, t);
        this.a(iqo.dmS());
        this.W(ipx.a(16, 1, new ipf[0]));
        this.W(ipx.d(this.cPn()));
        this.W(ipx.a(4, 1, new ipf[0]));
        this.W(ipx.d(this.qN(string)));
        this.W(ipx.c(new ipf[0]));
        this.aTg();
    }

    @Override
    public void aTg() {
        if (this.lUP == null) {
            return;
        }
        this.lUa.ri(this.dkb());
        this.lUa.hX(this.dir());
        this.lUa.qZ(this.dil());
        if (this.dir()) {
            if (this.dkb()) {
                this.lUP.Rk(13087385);
            } else {
                this.lUP.Rk(12357465);
            }
        } else if (this.dkb()) {
            this.lUP.Rk(0xC0C0C0);
        } else {
            this.lUP.Rk(0xABABAB);
        }
    }

    private ipf cPn() {
        this.lUa = new iol();
        this.lUa.hX(this.dir());
        return this.lUa;
    }

    private ipf qN(String string) {
        this.lUP = new ist();
        this.lUP.a(isf.mwO, 14);
        this.lUP.setText(string);
        this.lUP.Rk(0xABABAB);
        return this.lUP;
    }
}

