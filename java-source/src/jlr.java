/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;

public abstract class jlr<T, T1>
extends WeakReference<T>
implements jlf<T1> {
    public jlr(T t) {
        super(t);
    }

    @Override
    public boolean T(T1 T1) {
        Object t = this.get();
        if (t == null) {
            return false;
        }
        this.h(t, T1);
        return true;
    }

    public abstract void h(T var1, T1 var2);
}

