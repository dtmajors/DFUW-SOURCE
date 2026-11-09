/*
 * Decompiled with CFR.
 */
public class lgi {
    public ljp[] rlJ;

    public lgi(int n) {
        assert (n > 2);
        this.rlJ = new ljp[n];
        for (int i = 0; i < this.rlJ.length; ++i) {
            this.rlJ[i] = new ljp();
        }
    }

    public lgi(ljp[] ljpArray) {
        assert (ljpArray.length > 2);
        this.rlJ = new ljp[ljpArray.length];
        System.arraycopy(ljpArray, 0, this.rlJ, 0, ljpArray.length);
    }

    public lgi(ljp ljp2, ljp ljp3) {
        this.rlJ = new ljp[4];
        this.rlJ[0] = new ljp(ljp2);
        this.rlJ[1] = new ljp(ljp2.x, ljp3.y);
        this.rlJ[2] = new ljp(ljp3);
        this.rlJ[3] = new ljp(ljp3.x, ljp2.y);
    }

    public final boolean eqG() {
        return true;
    }

    public final boolean eqH() {
        return true;
    }

    public final boolean s(ljp ljp2) {
        assert (this.eqG());
        assert (this.eqH());
        boolean bl = false;
        int n = 0;
        int n2 = this.rlJ.length - 1;
        while (n < this.rlJ.length) {
            if (this.rlJ[n].y <= ljp2.y && ljp2.y < this.rlJ[n2].y && (this.rlJ[n2].y - this.rlJ[n].y) * (ljp2.x - this.rlJ[n].x) < (this.rlJ[n2].x - this.rlJ[n].x) * (ljp2.y - this.rlJ[n].y) || this.rlJ[n2].y <= ljp2.y && ljp2.y < this.rlJ[n].y && (this.rlJ[n2].y - this.rlJ[n].y) * (ljp2.x - this.rlJ[n].x) > (this.rlJ[n2].x - this.rlJ[n].x) * (ljp2.y - this.rlJ[n].y)) {
                bl = !bl;
            }
            n2 = n++;
        }
        return bl;
    }

    public final lik a(int n, ljp ljp2) {
        assert (this.eqG());
        assert (this.eqH());
        assert (this.s(ljp2));
        return new lik(this.rlJ[n], this.rlJ[n + 1 < this.rlJ.length ? n + 1 : 0], ljp2);
    }

    public final int a(ljp ljp2, ljp ljp3) {
        assert (this.eqG());
        assert (this.eqH());
        assert (this.s(ljp2));
        assert (this.s(ljp3));
        for (int i = 0; i < this.rlJ.length; ++i) {
            lik lik2 = this.a(i, ljp3);
            if (!lik2.s(ljp2)) continue;
            return i;
        }
        assert (false);
        return -1;
    }
}

