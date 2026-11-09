/*
 * Decompiled with CFR.
 */
public class hrl<FIELD>
extends hrk<FIELD, FIELD> {
    public final int laj;

    public hrl(lij<FIELD> lij2, int n) {
        super(lij2);
        this.laj = n;
    }

    @Override
    public int getFieldCount() {
        return this.laj;
    }

    @Override
    public FIELD a(FIELD FIELD, int n) {
        assert (n >= 0 && n < this.laj);
        return FIELD;
    }
}

