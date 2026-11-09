/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;

public abstract class jls<T, T1, T2>
extends WeakReference<T>
implements jlg<T1, T2> {
    public jls(T t) {
        super(t);
    }

    @Override
    public boolean j(T1 T1, T2 T2) {
        Object t = this.get();
        if (t == null) {
            return false;
        }
        this.a(t, T1, T2);
        return true;
    }

    public abstract void a(T var1, T1 var2, T2 var3);
}

