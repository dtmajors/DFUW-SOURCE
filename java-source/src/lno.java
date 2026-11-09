/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;

public class lno<E extends Enum<E>>
extends lnl<E> {
    private Object rFi;

    public lno(a<E> a2, Object object) {
        super(a2);
        this.rFi = object;
    }

    public lno(lno<E> lno2) {
        super(lno2.evX());
    }

    public a<E> evX() {
        return (a)this.evb();
    }

    @Override
    protected final E evS() {
        Enum enum_;
        Field field = this.evX().rFm;
        boolean bl = field.isAccessible();
        if (!bl) {
            field.setAccessible(true);
        }
        try {
            enum_ = (Enum)field.get(this.rFi);
        }
        catch (Exception exception) {
            assert (false);
            enum_ = null;
        }
        if (!bl) {
            field.setAccessible(false);
        }
        return (E)enum_;
    }

    @Override
    protected final void d(E e2) {
        boolean bl;
        Field field;
        block4: {
            field = this.evX().rFm;
            bl = field.isAccessible();
            if (!bl) {
                field.setAccessible(true);
            }
            try {
                field.set(this.rFi, e2);
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

