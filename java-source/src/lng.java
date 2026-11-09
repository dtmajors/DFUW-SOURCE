/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;

public class lng
extends lnd {
    public final Object rFi;

    public lng(a a2, Object object) {
        super(a2);
        this.rFi = object;
    }

    public lng(lng lng2) {
        this(lng2.evJ(), lng2.rFi);
    }

    public final a evJ() {
        return (a)this.evb();
    }

    @Override
    protected final boolean evF() {
        boolean bl;
        Field field = this.evJ().rFm;
        boolean bl2 = field.isAccessible();
        if (!bl2) {
            field.setAccessible(true);
        }
        try {
            bl = field.getBoolean(this.rFi);
        }
        catch (Exception exception) {
            assert (false);
            bl = false;
        }
        if (!bl2) {
            field.setAccessible(false);
        }
        return bl;
    }

    @Override
    protected final void yQ(boolean bl) {
        boolean bl2;
        Field field;
        block4: {
            field = this.evJ().rFm;
            bl2 = field.isAccessible();
            if (!bl2) {
                field.setAccessible(true);
            }
            try {
                field.setBoolean(this.rFi, bl);
            }
            catch (Exception exception) {
                if ($assertionsDisabled) break block4;
                throw new AssertionError();
            }
        }
        if (!bl2) {
            field.setAccessible(false);
        }
    }
}

