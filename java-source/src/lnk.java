/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;

public class lnk
extends lnh {
    private Object rFi;

    public lnk(a a2, Object object) {
        super(a2);
        this.rFi = object;
    }

    public lnk(lnk lnk2) {
        super(lnk2.evP());
    }

    public a evP() {
        return (a)this.evb();
    }

    @Override
    protected final double evL() {
        double d2;
        Field field = this.evP().rFm;
        boolean bl = field.isAccessible();
        if (!bl) {
            field.setAccessible(true);
        }
        try {
            d2 = field.getDouble(this.rFi);
        }
        catch (Exception exception) {
            assert (false);
            d2 = 0.0;
        }
        if (!bl) {
            field.setAccessible(false);
        }
        return d2;
    }

    @Override
    protected final void et(double d2) {
        boolean bl;
        Field field;
        block4: {
            field = this.evP().rFm;
            bl = field.isAccessible();
            if (!bl) {
                field.setAccessible(true);
            }
            try {
                field.setDouble(this.rFi, d2);
            }
            catch (Exception exception) {
                if ($assertionsDisabled) break block4;
                throw new AssertionError();
            }
        }
        if (!bl) {
            field.setAccessible(false);
        }
    }
}

