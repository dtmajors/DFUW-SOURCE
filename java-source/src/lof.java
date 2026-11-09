/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;

public class lof
extends loc {
    public final Object rFi;

    public lof(a a2, Object object) {
        super(a2);
        this.rFi = object;
    }

    public lof(lof lof2) {
        this(lof2.ewE(), lof2.rFi);
    }

    public final a ewE() {
        return (a)this.evb();
    }

    @Override
    protected final String ewA() {
        String string;
        Field field = this.ewE().rFm;
        boolean bl = field.isAccessible();
        if (!bl) {
            field.setAccessible(true);
        }
        try {
            string = (String)field.get(this.rFi);
        }
        catch (Exception exception) {
            assert (false);
            string = null;
        }
        if (!bl) {
            field.setAccessible(false);
        }
        return string;
    }

    @Override
    protected final void AP(String string) {
        boolean bl;
        Field field;
        block4: {
            field = this.ewE().rFm;
            bl = field.isAccessible();
            if (!bl) {
                field.setAccessible(true);
            }
            try {
                field.set(this.rFi, string);
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

