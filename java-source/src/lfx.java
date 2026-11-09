/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class lfx
extends lfu {
    private final lht rkG;
    private final DecimalFormatSymbols rkH = new DecimalFormatSymbols(Locale.US);
    private final DecimalFormat rkI = new DecimalFormat("0.0######", this.rkH);
    private final DecimalFormat rkJ = new DecimalFormat("0.0###", this.rkH);

    public lfx(lht lht2) {
        assert (lht2 != null);
        this.rkG = lht2;
    }

    @Override
    protected Object b(String string, Object object, Class<?> clazz) {
        String string2;
        lht lht2;
        assert (lin.An(string));
        assert (object == null || object.getClass().isAssignableFrom(clazz));
        assert (clazz == null || !clazz.isAssignableFrom(lbr.class));
        lht lht3 = this.zE(string);
        if (lht3 == null) {
            lht3 = new lht(string);
            this.rkG.add(lht3);
        }
        if (object == null) {
            this.rkG.remove(lht3);
            return null;
        }
        assert (clazz != null);
        lht lht4 = lht2 = lht3.size() == 0 ? null : (lht)lht3.get(0);
        if (object instanceof lbr) {
            lbr lbr2 = (lbr)object;
            lfx lfx2 = new lfx(lht3);
            lbr2.a(lfx2);
            return object;
        }
        if (clazz.isArray()) {
            assert (false);
            if (lht2 != null) {
                this.rkG.remove(lht2);
            }
            Object[] objectArray = (Object[])object;
            int n = objectArray.length;
            lfu lfu2 = this.zD(string);
            lfu2.ad("Count", n);
            for (int i = 0; i < n; ++i) {
                lfu2.f("Element" + i, objectArray[i]);
            }
            return object;
        }
        if (object instanceof String) {
            string2 = (String)object;
        } else if (object instanceof Boolean) {
            string2 = ((Boolean)object).toString();
        } else if (object instanceof Integer) {
            string2 = ((Integer)object).toString();
        } else if (object instanceof Long) {
            string2 = ((Long)object).toString();
        } else if (object instanceof Float) {
            float f = ((Float)object).floatValue();
            string2 = this.rkJ.format(f);
        } else if (object instanceof Double) {
            double d2 = (Double)object;
            string2 = this.rkI.format(d2);
        } else if (object instanceof Enum) {
            Enum enum_ = (Enum)object;
            string2 = enum_.name();
        } else {
            assert (false);
            string2 = "???";
        }
        lht lht5 = new lht(string2);
        if (lht2 == null) {
            lht3.add(lht5);
        } else {
            lht3.set(0, lht5);
        }
        return object;
    }

    @Override
    protected lfu zD(String string) {
        assert (lin.An(string));
        lht lht2 = this.zE(string);
        if (lht2 == null) {
            lht2 = new lht(string);
            this.rkG.add(lht2);
        }
        return new lfx(lht2);
    }

    @Override
    protected boolean eqC() {
        return false;
    }

    public String toString() {
        return null;
    }

    private lht zE(String string) {
        for (lht lht2 : this.rkG) {
            if (!lht2.aFo.equals(string)) continue;
            return lht2;
        }
        return null;
    }
}

