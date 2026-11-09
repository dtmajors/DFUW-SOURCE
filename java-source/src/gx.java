/*
 * Decompiled with CFR.
 */
import java.util.List;

public class gx {
    public boolean Yo = false;
    public ldv GUID = null;
    public int Yp = 0;
    public int Yq = 1;
    public boolean Yr = false;
    public boolean Ys = false;
    public boolean Yt = false;
    public boolean Yu = false;
    public List<ldv> Yv = lcn.emv();

    public boolean isLocked() {
        return this.Ys || this.Yt;
    }

    public boolean iC() {
        return this.GUID != null;
    }

    public boolean aA(ldv ldv2) {
        assert (ldv2 != null);
        if (this.GUID == null) {
            return false;
        }
        return this.GUID.equals(ldv2);
    }

    public void reset() {
        this.GUID = null;
        this.Yp = 0;
        this.Yq = 1;
        this.Yr = false;
        this.Ys = false;
        this.Yt = false;
        this.Yu = false;
        this.Yo = false;
        this.Yv.clear();
    }
}

