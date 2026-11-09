/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class jff {
    private jem mVP;
    private jfd[] mXk = new jfd[lea.epx().aQI()];

    public jff(jem jem2) {
        for (int i = 0; i < this.mXk.length; ++i) {
            this.mXk[i] = new jfd(this, i);
        }
        this.mVP = jem2;
        jem2.dzB().mUU.a((jlh<jfd, jfc, jfc>)new jlt<jff, jfd, jfc, jfc>(this, this){
            final /* synthetic */ jff mXl;
            {
                this.mXl = jff2;
                super(jff3);
            }

            public void a(jff jff2, jfd jfd2, jfc jfc2, jfc jfc3) {
                jff2.dzV().dzB().mVb.dLF();
            }
        });
        jem2.dzB().mUY.c((jlf<jfd>)new jlr<jff, jfd>(this, this){
            final /* synthetic */ jff mXl;
            {
                this.mXl = jff2;
                super(jff3);
            }

            public void a(jff jff2, jfd jfd2) {
                jff2.dzV().dzB().mVb.dLF();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jff)object, (jfd)object2);
            }
        });
        jem2.dzB().mUX.c((jlf<jfd>)new jlr<jff, jfd>(this, this){
            final /* synthetic */ jff mXl;
            {
                this.mXl = jff2;
                super(jff3);
            }

            public void a(jff jff2, jfd jfd2) {
                jff2.dzV().dzB().mVb.dLF();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jff)object, (jfd)object2);
            }
        });
        jem2.dzB().mUW.c((jlf<jfd>)new jlr<jff, jfd>(this, this){
            final /* synthetic */ jff mXl;
            {
                this.mXl = jff2;
                super(jff3);
            }

            public void a(jff jff2, jfd jfd2) {
                jff2.dzV().dzB().mVb.dLF();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jff)object, (jfd)object2);
            }
        });
        jem2.dzB().mUV.c((jlf<jfd>)new jlr<jff, jfd>(this, this){
            final /* synthetic */ jff mXl;
            {
                this.mXl = jff2;
                super(jff3);
            }

            public void a(jff jff2, jfd jfd2) {
                jff2.dzV().dzB().mVb.dLF();
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jff)object, (jfd)object2);
            }
        });
    }

    public jem dzV() {
        return this.mVP;
    }

    public jfd Ur(int n) {
        return this.mXk[n];
    }

    public int dAM() {
        int n = 0;
        for (jfd jfd2 : this.mXk) {
            jfc jfc2 = jfd2.dAu();
            if (jfc2 == null) continue;
            ++n;
        }
        return n;
    }

    public int dAN() {
        int n = 0;
        for (jfd jfd2 : this.mXk) {
            jfc jfc2 = jfd2.dAu();
            if (!(jfc2 instanceof jfg)) continue;
            ++n;
        }
        return n;
    }

    public int dAO() {
        int n = 0;
        for (jfd jfd2 : this.mXk) {
            jfc jfc2 = jfd2.dAu();
            if (!(jfc2 instanceof jfb)) continue;
            ++n;
        }
        return n;
    }

    public void dzF() {
        for (jfd jfd2 : this.mXk) {
            jfd2.dzF();
        }
    }

    public boolean dzG() {
        for (jfd jfd2 : this.mXk) {
            if (!jfd2.dzG()) continue;
            return true;
        }
        return false;
    }

    public boolean dAP() {
        for (int i = 0; i < lea.epx().aQI() / 2; ++i) {
            if (!this.mXk[i].dzG()) continue;
            return true;
        }
        return false;
    }

    public boolean dAQ() {
        for (int i = lea.epx().aQI() / 2; i < lea.epx().aQI(); ++i) {
            if (!this.mXk[i].dzG()) continue;
            return true;
        }
        return false;
    }

    public boolean tg(boolean bl) {
        for (jfd jfd2 : this.mXk) {
            if (bl && jfd2.dAA() || !(jfd2.dAu() != null ? !this.e(jfd2.dAu()) : jfd2.dAL() != null && !this.f(jfd2.dAL()))) continue;
            return true;
        }
        return false;
    }

    public boolean a(boolean bl, Set<Integer> set) {
        boolean bl2 = false;
        for (jfd jfd2 : this.mXk) {
            if (bl && jfd2.dAA()) continue;
            if (jfd2.dAu() != null) {
                if (this.e(jfd2.dAu())) continue;
                set.add(jfd2.dAu().bjd().zg());
                bl2 = true;
                continue;
            }
            if (jfd2.dAL() == null || this.f(jfd2.dAL())) continue;
            set.add(jfd2.dAL().bjd().zg());
            bl2 = true;
        }
        return bl2;
    }

    public boolean e(jfc jfc2) {
        if (jfc2 != null) {
            for (jfd jfd2 : this.mXk) {
                if (!jfc.a(jfc2, jfd2.dAL())) continue;
                return true;
            }
        }
        return false;
    }

    public boolean f(jfc jfc2) {
        if (jfc2 != null) {
            for (jfd jfd2 : this.mXk) {
                if (!jfc.a(jfc2, jfd2.dAu())) continue;
                return true;
            }
        }
        return false;
    }

    public boolean d(int n, bsj bsj2) {
        if (!this.mXk[n].c(bsj2)) {
            return false;
        }
        int n2 = ((bsn)bsj2.awE()).getType();
        return true;
    }

    public boolean e(bsj bsj2) {
        assert (bsj2 != null);
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            jfc jfc2 = this.mXk[i].dAu();
            if (jfc2 == null || !bsk.a(bsj2, jfc2.cCs())) continue;
            return true;
        }
        return false;
    }

    public jfd g(jfc jfc2) {
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            if (!jfc.a(this.mXk[i].dAu(), jfc2)) continue;
            return this.mXk[i];
        }
        return null;
    }

    public jfd h(jfc jfc2) {
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            if (!jfc.a(this.mXk[i].dAL(), jfc2)) continue;
            return this.mXk[i];
        }
        return null;
    }

    void c(jfd jfd2, jfc jfc2) {
        if (jfc.a(jfd2.dAu(), jfc2)) {
            return;
        }
        jfc jfc3 = jfd2.dAu();
        if (jfc2 != null) {
            jfd jfd3 = this.d(jfd2, jfc2);
            if (jfd3 != null) {
                this.c(jfd2, jfd3);
                if (jfc3 != null) {
                    this.dzV().dzB().mVp.k(jfd3, jfd2);
                } else {
                    this.dzV().dzB().mVo.k(jfd3, jfd2);
                }
            } else {
                jfd2.d(jfc2);
                if (!jfd2.dAv().b(jfc2.cCs())) {
                    jfd2.a(null);
                }
                if (jfc3 != null) {
                    this.dzV().dzB().mVn.k(jfd2, jfc3);
                } else {
                    this.dzV().dzB().mVm.V(jfd2);
                }
            }
        } else {
            jfd2.d(null);
            this.dzV().dzB().mVq.k(jfd2, jfc3);
        }
    }

    private jfd d(jfd jfd2, jfc jfc2) {
        for (jfd jfd3 : this.mXk) {
            if (jfd3 == jfd2 || !jfc.a(jfd3.dAu(), jfc2)) continue;
            return jfd3;
        }
        return null;
    }

    private void a(jfd jfd2, jfc jfc2, jfd jfd3, jfc jfc3) {
        jfd2.d(jfc3);
        jfd3.d(jfc2);
    }

    public boolean hu(int n) {
        for (int i = 0; i < this.mXk.length; ++i) {
            if (this.mXk[i] == null || this.mXk[i].dAu() == null || this.mXk[i].dAu().bjd().zg() != n) continue;
            return true;
        }
        return false;
    }

    private void c(jfd jfd2, jfd jfd3) {
        jfd2.j(jfd3);
        this.mVP.dzB().mUU.c(jfd2, jfd2.dAu(), jfd3.dAu());
        this.mVP.dzB().mUY.V(jfd2);
        this.mVP.dzB().mUU.c(jfd3, jfd3.dAu(), jfd2.dAu());
        this.mVP.dzB().mUY.V(jfd3);
    }
}

