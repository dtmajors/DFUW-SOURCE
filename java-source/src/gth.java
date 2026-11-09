/*
 * Decompiled with CFR.
 */
public abstract class gth
extends gtn {
    protected lco gUA = null;
    protected lco gUB = null;
    protected lco gUC = null;
    protected boolean gUH = true;
    protected boolean gUI = true;
    protected boolean gUJ = false;

    gth() {
        super(8975);
    }

    gth(int n) {
        super(n);
    }

    public lco bws() {
        return this.gUA;
    }

    public void i(lco lco2) {
        this.gUA = lco2;
    }

    public lco bwo() {
        return this.gUB;
    }

    public void j(lco lco2) {
        this.gUB = lco2;
    }

    public lco bwp() {
        return this.gUC;
    }

    public void k(lco lco2) {
        this.gUC = lco2;
    }

    public boolean bwq() {
        return this.gUH;
    }

    public void jg(boolean bl) {
        this.gUH = bl;
    }

    public boolean isOn() {
        return this.gUI;
    }

    public void hX(boolean bl) {
        this.gUI = bl;
    }

    public boolean bwr() {
        return this.gUJ;
    }

    public void jh(boolean bl) {
        this.gUJ = bl;
    }
}

