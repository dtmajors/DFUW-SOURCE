/*
 * Decompiled with CFR.
 */
public class jfa {
    private hwo[] mWS = new hwo[2];

    public jfa() {
    }

    public jfa(hwo[] hwoArray) {
        for (int i = 0; i < this.mWS.length; ++i) {
            this.mWS[i] = hwoArray[i] != null ? (hwo)hwoArray[i].cBl() : null;
        }
    }

    public jfa(hwo hwo2, jfa jfa2) {
        if (this.t(hwo2)) {
            hwo hwo3 = jfa2.mWS[1];
            this.mWS[1] = this.s(hwo3) ? hwo3 : null;
            this.mWS[0] = (hwo)hwo2.cBl();
        } else if (this.s(hwo2)) {
            hwo hwo4 = jfa2.mWS[0];
            this.mWS[0] = this.t(hwo4) ? hwo4 : null;
            this.mWS[1] = (hwo)hwo2.cBl();
        } else {
            this.mWS[0] = hwo2 != null ? (hwo)hwo2.cBl() : null;
        }
    }

    public hwo Ql(int n) {
        return this.mWS[n];
    }

    public int a(hwo hwo2, boolean bl) {
        if (hwo2 != null) {
            for (int i = 0; i < 2; ++i) {
                if (!hwo.a(this.mWS[i], hwo2)) continue;
                if (bl) {
                    hwo hwo3 = new hwo(this.mWS[i].cBq(), this.mWS[i].cBo());
                    hwo3.cBj();
                    this.mWS[i] = hwo3;
                } else {
                    this.mWS[i] = null;
                }
                return i;
            }
        }
        return -1;
    }

    public boolean b(bsj bsj2) {
        for (int i = 0; i < 2; ++i) {
            if (bsi.b(this.mWS[i] != null ? this.mWS[i].cBq().getType() : -1, bsj2)) continue;
            return false;
        }
        return true;
    }

    public static boolean a(jfa jfa2, jfa jfa3) {
        if (jfa2 == jfa3) {
            return true;
        }
        if (jfa2 != null && jfa3 != null) {
            for (int i = 0; i < 2; ++i) {
                if (jfa.b(jfa2.mWS[i], jfa3.mWS[i])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public void b(int n, hwo hwo2) {
        this.mWS[n] = hwo2 != null ? (hwo)hwo2.cBl() : null;
    }

    public jfa dAq() {
        return new jfa(this.mWS);
    }

    public static int q(hwo hwo2) {
        if (hwo2 == null) {
            return -1;
        }
        if (hwo2.cBu() != null) {
            return hwo2.cBu().az();
        }
        return hwo2.cBq().getType();
    }

    public static long r(hwo hwo2) {
        if (hwo2 == null) {
            return -1L;
        }
        return hwo2.cBo();
    }

    private boolean s(hwo hwo2) {
        return hwo2 != null && (hwo2.cBR() || bsi.mA(hwo2.cBq().getType()));
    }

    private boolean t(hwo hwo2) {
        return hwo2 != null && (hwo2.cBP() || bsi.my(hwo2.cBq().getType()));
    }

    private static boolean b(hwo hwo2, hwo hwo3) {
        if (hwo2 == null && hwo3 == null) {
            return true;
        }
        if (hwo2 == null || hwo3 == null) {
            return false;
        }
        bsh bsh2 = hwo2.cBu();
        bsh bsh3 = hwo3.cBu();
        if (bsh2 == null && bsh3 != null || bsh2 != null && bsh3 == null) {
            return false;
        }
        int n = jfa.q(hwo2);
        long l2 = jfa.r(hwo2);
        int n2 = jfa.q(hwo3);
        long l3 = jfa.r(hwo3);
        return n == n2 && l2 == l3;
    }

    public /* synthetic */ Object clone() {
        return this.dAq();
    }
}

