/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;

public class loa
extends lnx {
    private Object rFi;

    public loa(a a2, Object object) {
        super(a2);
        this.rFi = object;
    }

    public loa(loa loa2) {
        super(loa2.eww());
    }

    public a eww() {
        return (a)this.evb();
    }

    @Override
    protected final long ewq() {
        long l;
        Field field = this.eww().rFm;
        boolean bl = field.isAccessible();
        if (!bl) {
            field.setAccessible(true);
        }
        try {
            l = field.getLong(this.rFi);
        }
        catch (Exception exception) {
            assert (false);
            l = 0L;
        }
        if (!bl) {
            field.setAccessible(false);
        }
        return l;
    }

    @Override
    protected final void ay(long l) {
        boolean bl;
        Field field;
        block4: {
            field = this.eww().rFm;
            bl = field.isAccessible();
            if (!bl) {
                field.setAccessible(true);
            }
            try {
                field.setLong(this.rFi, l);
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

