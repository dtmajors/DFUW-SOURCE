/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;

public abstract class jlq<T>
extends WeakReference<T>
implements jle {
    public jlq(T t) {
        super(t);
    }

    @Override
    public boolean dwQ() {
        Object t = this.get();
        if (t == null) {
            return false;
        }
        this.R(t);
        return true;
    }

    public abstract void R(T var1);
}

