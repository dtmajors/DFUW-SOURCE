/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;
import java.util.Map;

public class iou<T> {
    private T _value;
    private Map<Integer, WeakReference<iot>> mpf = lcn.emw();
    private Map<T, Integer> mpg = lcn.emw();
    private Map<Integer, T> mph = lcn.emw();

    public iou() {
    }

    public iou(T t) {
        this._value = t;
    }

    public void a(iot iot2, T t) {
        this.mpf.put(iot2.hashCode(), new WeakReference<iot>(iot2));
        this.mpg.put(t, iot2.hashCode());
        this.mph.put(iot2.hashCode(), t);
        if (this._value == t) {
            iot2.hX(true);
        }
    }

    public void a(iot iot2) {
        this.mpf.remove(iot2.hashCode());
        this.mpg.remove(this.mph.get(iot2.hashCode()));
        this.mph.remove(iot2.hashCode());
    }

    public T getValue() {
        return this._value;
    }

    public void setValue(T t) {
        if (t == this._value) {
            return;
        }
        if (this._value != null) {
            this.U(this._value).hX(false);
        }
        this._value = t;
        if (this._value != null) {
            this.U(this._value).hX(true);
        }
        this.S(t);
    }

    public void setInitialValue(T t) {
        if (t == this._value) {
            return;
        }
        if (this._value != null) {
            this.U(this._value).hX(false);
        }
        this._value = t;
        if (this._value != null) {
            this.U(this._value).hX(true);
        }
    }

    public void S(T t) {
    }

    private iot U(T t) {
        Integer n = this.mpg.get(t);
        WeakReference<iot> weakReference = this.mpf.get(n);
        return (iot)weakReference.get();
    }
}

