/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class lnc
extends lnb {
    private Object rFp;

    public lnc(a a2, Object object) {
        super(a2, new ArrayList<lmv>());
        assert (object != null);
        assert (object.getClass().isArray());
        assert (this.evC().rFr.isInstance(object));
        assert (this.evC().evD().isAssignableFrom(object.getClass().getComponentType()));
        this.rFp = object;
        int n = Array.getLength(object);
        lmu lmu2 = this.evC().rFs;
        for (int i = 0; i < n; ++i) {
            Object object2 = Array.get(object, i);
            lmv lmv2 = object2 == null ? null : (lmu2 instanceof lmr ? ((lmr)((Object)lmu2)).a(this, i) : (lmu2 instanceof lms ? ((lms)((Object)lmu2)).ap(Array.get(object, i)) : lmu2.euX()));
            this.c(i, lmv2);
        }
    }

    public final a evC() {
        return (a)this.evy();
    }

    public final void notifyChanged() {
        super.cdX();
    }

    public final Object getObject(int n) {
        return Array.get(this.rFp, n);
    }

    public final void setObject(int n, Object object) {
        Array.set(this.rFp, n, object);
    }

    public final boolean getBoolean(int n) {
        return Array.getBoolean(this.rFp, n);
    }

    public final void setBoolean(int n, boolean bl) {
        Array.setBoolean(this.rFp, n, bl);
    }

    public final int getInteger(int n) {
        return Array.getInt(this.rFp, n);
    }

    public final void gg(int n, int n2) {
        Array.setInt(this.rFp, n, n2);
    }

    public final float getFloat(int n) {
        return Array.getFloat(this.rFp, n);
    }

    public final void setFloat(int n, float f) {
        Array.setFloat(this.rFp, n, f);
    }

    public final long getLong(int n) {
        return Array.getLong(this.rFp, n);
    }

    public final void setLong(int n, long l) {
        Array.setLong(this.rFp, n, l);
    }

    public final double getDouble(int n) {
        return Array.getDouble(this.rFp, n);
    }

    public final void setDouble(int n, double d2) {
        Array.setDouble(this.rFp, n, d2);
    }

    @Override
    protected boolean a(lob lob2) {
        lnb lnb2 = (lnb)lob2;
        List<lmv> list = lnb2.ewx();
        int n = list.size();
        if (Array.getLength(this.rFp) != n) {
            Object object = Array.newInstance(this.rFp.getClass().getComponentType(), n);
            System.arraycopy(this.rFp, 0, object, 0, Math.min(Array.getLength(this.rFp), n));
            this.rFp = object;
        }
        return super.a(lob2);
    }
}

