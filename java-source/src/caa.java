/*
 * Decompiled with CFR.
 */
public class caa
extends cai {
    private cak.b eez = cak.b.efB;

    public caa() {
        super(cai.a.eeM);
    }

    public final cak.b aFI() {
        return this.eez;
    }

    public final void a(cak.b b2) {
        assert (b2 != null);
        this.eez = b2;
    }

    @Override
    protected final void a(cai cai2) {
        super.a(cai2);
        caa caa2 = (caa)cai2;
        caa2.a(this.eez);
    }
}

