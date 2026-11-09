/*
 * Decompiled with CFR.
 */
public class bgd {
    protected ldv GUID = null;
    protected String Name = null;
    protected float dir = 0.0f;
    protected boolean dis = false;
    protected boolean dit = false;

    public ldv getGUID() {
        return this.GUID;
    }

    void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public String getName() {
        return this.Name;
    }

    void setName(String string) {
        this.Name = string;
    }

    public float aou() {
        return this.dir;
    }

    void cN(float f2) {
        this.dir = f2;
    }

    public boolean aov() {
        return this.dis;
    }

    void df(boolean bl) {
        this.dis = bl;
    }

    public boolean aow() {
        return this.dit;
    }

    void dg(boolean bl) {
        this.dit = bl;
    }

    public bgd() {
    }

    bgd(ldv ldv2, String string, float f2, boolean bl) {
        this.GUID = ldv2;
        this.Name = string;
        this.dir = f2;
        this.dis = bl;
    }

    void a(float f2, ldv ldv2, String string, boolean bl) {
        if (!this.GUID.equals(ldv2)) {
            return;
        }
        this.dir += f2;
        this.dis |= bl;
    }

    public bgd aox() {
        bgd bgd2 = new bgd(this.GUID, this.Name, this.dir, this.dis);
        bgd2.dit = this.dit;
        return bgd2;
    }

    public /* synthetic */ Object clone() {
        return this.aox();
    }
}

