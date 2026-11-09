/*
 * Decompiled with CFR.
 */
public class jex {
    private jen mUK;
    private jew[] mWA = new jew[10];
    private jew mWB;
    private jew mWC;
    private boolean mWD = false;

    public jex(jen jen2) {
        this.mUK = jen2;
        this.mUK.mVc.b(new jlq<jex>(this, this){
            final /* synthetic */ jex mWE;
            {
                this.mWE = jex2;
                super(jex3);
            }

            public void c(jex jex2) {
                jex.a(jex2);
            }

            public /* synthetic */ void R(Object object) {
                this.c((jex)object);
            }
        });
        this.mUK.mVk.a((jlg<jew, Integer>)new jls<jex, jew, Integer>(this, this){
            final /* synthetic */ jex mWE;
            {
                this.mWE = jex2;
                super(jex3);
            }

            public void a(jex jex2, jew jew2, Integer n) {
                jex.b((jex)this.mWE).mVl.dLF();
            }
        });
    }

    public jen dzB() {
        return this.mUK;
    }

    public void d(jew jew2) {
        assert (jew2.mVs == null);
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] != null) continue;
            jew2.mVs = this;
            this.mWA[i] = jew2;
            this.mUK.mVg.k(jew2, i);
            return;
        }
    }

    public jew sd(String string) {
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] == null || !this.mWA[i].getName().equalsIgnoreCase(string)) continue;
            return this.mWA[i];
        }
        return null;
    }

    public void se(String string) {
        this.mWC = this.sd(string);
    }

    public void e(jew jew2) {
        assert (jew2.mVs == null);
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] != null) continue;
            jew2.mVs = this;
            this.mWA[i] = jew2;
            this.mUK.mVd.k(jew2, i);
            return;
        }
    }

    public void f(jew jew2) {
        assert (jew2.mVs == this);
        assert (this.dAj() > 1);
        assert (jew2 != this.mWC);
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] != jew2) continue;
            jew2.mVs = null;
            this.mWA[i] = null;
            this.mUK.mVe.k(jew2, i);
            if (jew2 == this.mWB) {
                for (i = 0; i < 10; ++i) {
                    if (this.mWA[i] == null) continue;
                    this.h(this.mWA[i]);
                }
            }
            return;
        }
    }

    public int g(jew jew2) {
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] != jew2) continue;
            return i;
        }
        return -1;
    }

    public int dAj() {
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] == null) continue;
            ++n;
        }
        return n;
    }

    public jew Uj(int n) {
        return this.mWA[n];
    }

    public jew dAk() {
        return this.mWB;
    }

    public void h(jew jew2) {
        assert (jew2 != null);
        if (jew2 == this.mWB) {
            return;
        }
        this.mWB = jew2;
        this.mWD = true;
        this.mWB.c(this.mUK.dzM());
        this.mUK.mVj.k(this.mWB, this.mWB != null ? this.mWB.dzZ() : -1);
        this.mWD = false;
    }

    public jew dAl() {
        return this.mWC;
    }

    public boolean dzG() {
        return this.dAm() || this.dAn();
    }

    public boolean dAm() {
        return this.mWC != this.mWB;
    }

    public boolean dAn() {
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] == null || !this.mWA[i].dzG()) continue;
            return true;
        }
        return false;
    }

    public void dzF() {
        this.mWC = this.mWB;
    }

    public boolean a(jew jew2, String string) {
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] == null || this.mWA[i] == jew2 || !this.mWA[i].getName().equalsIgnoreCase(string)) continue;
            return false;
        }
        return true;
    }

    public void dAg() {
        for (int i = 0; i < 10; ++i) {
            if (this.mWA[i] == null) continue;
            this.mWA[i].dAg();
        }
    }

    private void dAo() {
        if (!this.mWD && this.mWB != null) {
            this.mWB.b(jen.dzL().dzM());
        }
    }

    static /* synthetic */ void a(jex jex2) {
        jex2.dAo();
    }

    static /* synthetic */ jen b(jex jex2) {
        return jex2.mUK;
    }
}

