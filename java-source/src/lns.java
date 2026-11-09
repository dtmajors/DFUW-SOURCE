/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;

public class lns
extends lnp {
    private Object rFi;

    public lns(a a2, Object object) {
        super(a2);
        this.rFi = object;
    }

    public lns(lns lns2) {
        super(lns2.ewe());
    }

    public a ewe() {
        return (a)this.evb();
    }

    @Override
    protected final float evZ() {
        float f;
        Field field = this.ewe().rFm;
        boolean bl = field.isAccessible();
        if (!bl) {
            field.setAccessible(true);
        }
        try {
            f = field.getFloat(this.rFi);
        }
        catch (Exception exception) {
            assert (false);
            f = 0.0f;
        }
        if (!bl) {
            field.setAccessible(false);
        }
        return f;
    }

    @Override
    protected final void nI(float f) {
        boolean bl;
        Field field;
        block4: {
            field = this.ewe().rFm;
            bl = field.isAccessible();
            if (!bl) {
                field.setAccessible(true);
            }
            try {
                field.setFloat(this.rFi, f);
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

