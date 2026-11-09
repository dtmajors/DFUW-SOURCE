/*
 * Decompiled with CFR.
 */
public class inw
extends ifg {
    private ioa mno;

    public inw(int n, int n2, ioa ioa2) {
        super("J2FWindow.swf", n, n2);
        this.OQ(-1);
        this.a(hyb.lmD);
        this.a(hya.lmp, true);
        this.a(hya.lmt, false);
        this.a(hya.lmx, false);
        this.a(hya.lms, false);
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
        this.a(hya.lmr, false);
        this.mno = ioa2;
    }

    public void initialize() {
        super.initialize();
        this.mno.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.mno));
    }

    public void cleanUp() {
        super.cleanUp();
        this.mno.getMessageDelegator().hd(this.mno.getGUID());
    }

    public ioa dhq() {
        return this.mno;
    }

    protected void cEb() {
        this.mno.R(this.cEE(), this.cEF());
    }
}

