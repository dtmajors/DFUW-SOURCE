/*
 * Decompiled with CFR.
 */
public class gv {
    public final ldv Yc;
    public final a Yd;
    public final boolean Ye;
    public final boolean Yf;

    public gv(ldv ldv2, a a2, boolean bl) {
        this(ldv2, a2, bl, false);
    }

    public gv(ldv ldv2, a a2, boolean bl, boolean bl2) {
        assert (ldv2 != null);
        assert (a2 != null);
        this.Yc = ldv2;
        this.Yd = a2;
        this.Ye = bl;
        this.Yf = bl2;
    }

    public final boolean isIgnore() {
        return this.Yd == a.Yg;
    }

    public final boolean iB() {
        return this.Yd == a.Yh;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFObjectSpaceInfo: GUID=");
        stringBuilder.append(this.Yc);
        stringBuilder.append(" ConfigType=");
        stringBuilder.append((Object)this.Yd);
        stringBuilder.append(" PlayerOS=");
        stringBuilder.append(this.Ye);
        return stringBuilder.toString();
    }
}

