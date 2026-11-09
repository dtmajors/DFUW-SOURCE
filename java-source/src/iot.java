/*
 * Decompiled with CFR.
 */
public class iot<T>
extends iox {
    private iou mpd;
    private T _value;
    private boolean mpe = false;

    public iot(iou<T> iou2, T t) {
        this._value = t;
        this.mpd = iou2;
        if (this.mpd != null) {
            this.mpd.a(this, t);
        }
    }

    public T getValue() {
        return this._value;
    }

    public void setValue(T t) {
        if (itq.i(t, this._value)) {
            return;
        }
        if (this._value != null && this.mpd != null) {
            this.mpd.a(this);
        }
        this._value = t;
        if (this._value != null && this.mpd != null) {
            this.mpd.a(this, this._value);
        }
    }

    public iou<T> diw() {
        return this.mpd;
    }

    public void a(iou<T> iou2) {
        if (iou2 == this.mpd) {
            return;
        }
        if (this.mpd != null) {
            this.mpd.a(this);
        }
        this.mpd = iou2;
        if (this.mpd != null) {
            this.mpd.a(this, this._value);
        }
    }

    public boolean dix() {
        return this.mpe;
    }

    public void rb(boolean bl) {
        this.mpe = bl;
    }

    @Override
    public void cLq() {
        if (!this.dir()) {
            this.hX(true);
            if (this.mpd != null) {
                this.mpd.setValue(this._value);
            }
        } else if (this.mpe) {
            this.hX(false);
            if (this.mpd != null) {
                this.mpd.setValue(null);
            }
        }
    }
}

