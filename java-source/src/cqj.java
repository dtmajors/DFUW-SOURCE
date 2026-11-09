/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
public class cqj
extends cqi {
    public cqj(hc hc2, int n, String string, boolean bl, lch lch2, lip lip2) {
        super(hc2, n, string, bl, lch2, lch.class, lip2);
    }

    @Override
    protected Object hQ(String string) {
        return lch.yZ(string);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof lch);
        return ((lch)object).booleanValue() ? lcy.qUT : lcy.qUU;
    }

    @Override
    protected uk aYJ() {
        return new tz();
    }

    @Override
    protected Object y(Object object) {
        assert (object instanceof lch);
        return new lch(((lch)object).booleanValue());
    }
}

