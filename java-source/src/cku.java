/*
 * Decompiled with CFR.
 */
public class cku
extends ckp {
    private static final String TC = "SFDungeonGateServer";
    private ckt eHc;
    private amv eHd;
    private bsx bBe;

    public cku() {
        super(true);
    }

    public void b(bsx bsx2) {
        this.bBe = bsx2;
        this.aIw();
        this.eHd = new amv(this.bBe, this);
        this.eHd.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eHd);
        this.eHd.Hy();
        boolean bl = this.fi().af(1408).getBooleanValue();
        this.eHc = new ckt(this);
        this.eHc.fy(bl);
        this.eHc.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eHc);
        String string = this.eHd.HC();
        this.fi().b(1328, string != null ? string : "");
        this.fi().a(12384, 0.0);
        this.fi().i(12752, 0);
        this.fi().i(12768, this.eHd.HB());
    }

    public void aRk() {
        if (!this.aIe()) {
            assert (false);
            return;
        }
        if (this.eHc != null) {
            this.eHc.rr(this.eHd.bh(true));
        }
    }

    public void aRl() {
        if (this.aIe()) {
            assert (false);
            return;
        }
        if (this.eHc != null) {
            this.eHc.rr(this.eHd.bh(false));
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eHc != null) {
            this.eHc.remove();
            this.eHc = null;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.eHc != null) {
            this.eHc.doTick(ldz2);
        }
    }

    public double Hz() {
        return this.eHd != null ? this.eHd.Hz() : 0.0;
    }

    public int bh(boolean bl) {
        return this.eHd != null ? this.eHd.bh(bl) : -1;
    }

    public final boolean aIe() {
        return this.eHc.aIe();
    }

    public final boolean aRm() {
        return this.eHc.aRi();
    }

    public final double aRj() {
        return this.eHc.aRj();
    }
}

