/*
 * Decompiled with CFR.
 */
public class crx
extends crj {
    public int eZh;
    public int eZi;
    public int eZj;
    public cry eZk = new cry();

    @Override
    public Object clone() {
        crx crx2 = (crx)super.clone();
        crx2.eZk = (cry)this.eZk.clone();
        return crx2;
    }

    public void b(kgy kgy2) {
        this.tH(kgy2.eZh);
        this.tI(kgy2.eZi);
        this.tJ(kgy2.eZj);
    }

    public void tH(int n) {
        this.eZh = n;
        this.eZk.tK(n);
    }

    public void tI(int n) {
        this.eZi = n;
        this.eZk.tL(n);
    }

    public void tJ(int n) {
        this.eZj = n;
        this.eZk.tM(n);
    }
}

