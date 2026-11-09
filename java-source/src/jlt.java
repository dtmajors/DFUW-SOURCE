/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;

public abstract class jlt<T, T1, T2, T3>
extends WeakReference<T>
implements jlh<T1, T2, T3> {
    public jlt(T t) {
        super(t);
    }

    @Override
    public boolean b(T1 T1, T2 T2, T3 T3) {
        Object t = this.get();
        if (t == null) {
            return false;
        }
        this.a(t, T1, T2, T3);
        return true;
    }

    public abstract void a(T var1, T1 var2, T2 var3, T3 var4);
}

