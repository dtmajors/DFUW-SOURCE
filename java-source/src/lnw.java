/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;

public class lnw
extends lnt {
    private Object rFi;

    public lnw(a a2, Object object) {
        super(a2);
        this.rFi = object;
    }

    public lnw(lnw lnw2) {
        super(lnw2.ewo());
    }

    public a ewo() {
        return (a)this.evb();
    }

    @Override
    protected final int ewi() {
        int n;
        Field field = this.ewo().rFm;
        boolean bl = field.isAccessible();
        if (!bl) {
            field.setAccessible(true);
        }
        try {
            n = field.getInt(this.rFi);
        }
        catch (Exception exception) {
            assert (false);
            n = 0;
        }
        if (!bl) {
            field.setAccessible(false);
        }
        return n;
    }

    @Override
    protected final void adK(int n) {
        boolean bl;
        Field field;
        block4: {
            field = this.ewo().rFm;
            bl = field.isAccessible();
            if (!bl) {
                field.setAccessible(true);
            }
            try {
                field.setInt(this.rFi, n);
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

