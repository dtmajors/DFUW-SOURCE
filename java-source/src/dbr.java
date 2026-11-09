/*
 * Decompiled with CFR.
 */
public class dbr
extends dcl {
    private ait gct = null;

    public dbr() {
        this.gcU = cxd.o.fRY;
    }

    public void a(ait ait2) {
        this.gct = ait2;
    }

    @Override
    public void Ca() {
        assert (this.gct != null);
        assert (this.gct.BV() > 0);
        if (ctg.fff) {
            return;
        }
        float f2 = this.gct.BY();
        if (f2 <= 0.0f) {
            lfn.b(5, "SFAttributeValueConsume", "doConsume() RequiredAttributeValue is invalid: " + f2);
            return;
        }
        this.gct.Co().aJz().bgQ().fi().a(this.gct.BV(), -f2);
    }

    @Override
    protected void a(dcl dcl2) {
        super.a(dcl2);
        dbr dbr2 = (dbr)dcl2;
    }
}

