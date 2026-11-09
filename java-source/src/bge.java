/*
 * Decompiled with CFR.
 */
public class bge
extends bgd {
    private bgd[] diu = null;

    public bgd[] aoy() {
        return this.diu;
    }

    void a(bgd[] bgdArray) {
        this.diu = bgdArray;
    }

    public bge() {
    }

    bge(ldv ldv2, String string, bgd[] bgdArray) {
        super(ldv2, string, 0.0f, false);
        for (bgd bgd2 : this.diu = bgdArray) {
            this.dir += bgd2.aou();
            this.dis |= bgd2.aov();
        }
    }

    @Override
    void a(float f2, ldv ldv2, String string, boolean bl) {
        int n = -1;
        for (int i = 0; i < this.diu.length; ++i) {
            if (!this.diu[i].getGUID().equals(ldv2)) continue;
            n = i;
        }
        if (n < 0) {
            bgd bgd2 = new bgd(ldv2, string, 0.0f, false);
            bgd[] bgdArray = new bgd[this.diu.length + 1];
            for (int i = 0; i < this.diu.length; ++i) {
                bgdArray[i] = this.diu[i];
            }
            this.diu = bgdArray;
            n = this.diu.length - 1;
            this.diu[n] = bgd2;
        }
        this.dir += f2;
        this.dis |= bl;
        this.diu[n].a(f2, ldv2, string, bl);
        this.aoz();
    }

    private void aoz() {
        int n = this.diu.length - 1;
        boolean bl = false;
        while (!bl) {
            bl = true;
            for (int i = 0; i < n; ++i) {
                if (!(this.diu[i].aou() < this.diu[i + 1].aou())) continue;
                bgd bgd2 = this.diu[i + 1];
                this.diu[i + 1] = this.diu[i];
                this.diu[i] = bgd2;
                bl = false;
            }
            --n;
        }
    }

    public bge aoA() {
        bgd[] bgdArray = new bgd[this.diu.length];
        for (int i = 0; i < this.diu.length; ++i) {
            bgdArray[i] = this.diu[i].aox();
        }
        return new bge(this.GUID, this.Name, bgdArray);
    }

    @Override
    public /* synthetic */ bgd aox() {
        return this.aoA();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aoA();
    }
}

