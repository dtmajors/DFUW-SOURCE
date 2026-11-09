/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 */
public class col
extends cph {
    protected bxe ePt = null;

    public col(boolean bl) {
        super(bl);
        this.ObjectType = 160;
        this.ePt = bl ? new bxg(this) : new bxf(this);
    }

    public bxe aVf() {
        return this.ePt;
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        col col2 = (col)cbx2;
        if (this.ePt != null) {
            this.ePt.b(col2.aVf());
        }
    }

    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.ePt.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.ePt);
            this.Initialized = true;
        }
    }
}

