/*
 * Decompiled with CFR.
 */
public class il {
    public final gw.a afT;
    public final ia afU;
    public final ik Rc;
    private int Rl;

    il(ia ia2, ik ik2, gw.a a2) {
        this.afT = a2;
        this.afU = ia2;
        this.Rc = ik2;
        this.Rl = 0;
    }

    public final int bx(ldv ldv2) {
        ++this.afU.Rl;
        ++this.Rl;
        return this.Rl;
    }

    public final int by(ldv ldv2) {
        --this.Rl;
        --this.afU.Rl;
        if (this.Rl == 0) {
            this.afU.aeX.a(this);
        }
        return this.Rl;
    }

    public final boolean isIgnore() {
        return this.afT == gw.a.Yl;
    }

    public final boolean nm() {
        return this.afT == gw.a.Ym;
    }

    public String toString() {
        return "[ConfigType=" + (Object)((Object)this.afT) + ", Subscriber=" + this.Rc.GUID + ", RefCount=" + this.Rl + ", SharedInfo=" + this.afU + "]";
    }
}

