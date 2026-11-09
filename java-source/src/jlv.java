/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;

public abstract class jlv<T, T1, T2, T3, T4, T5>
extends WeakReference<T>
implements jlj<T1, T2, T3, T4, T5> {
    public jlv(T t) {
        super(t);
    }

    @Override
    public boolean b(T1 T1, T2 T2, T3 T3, T4 T4, T5 T5) {
        Object t = this.get();
        if (t == null) {
            return false;
        }
        this.a(t, T1, T2, T3, T4, T5);
        return true;
    }

    public abstract void a(T var1, T1 var2, T2 var3, T3 var4, T4 var5, T5 var6);
}

