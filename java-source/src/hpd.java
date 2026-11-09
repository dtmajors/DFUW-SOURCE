/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class hpd
extends how {
    public final a kUw;
    protected final List<hqx> kUx = new ArrayList<hqx>();
    private final ldl kUy = new ldl();
    public final boolean kUz;
    public final boolean kUA;
    private boolean Initialized;
    private int kUB = -1;
    private boolean kUC;

    public hpd(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, boolean bl, boolean bl2) {
        super(hnc2, string, lgg2, lhf2, a2.jGJ);
        this.kUw = a2;
        this.kUz = bl;
        this.kUA = bl2;
    }

    public final lbl<lbn> cuR() {
        return this.kUy;
    }

    public final boolean c(hmi hmi2) {
        return this.d(hmi2) != -1;
    }

    public final void a(hmi hmi2) {
        this.a(hmi2, (hmi)null);
    }

    public final void a(hmi hmi2, hmi hmi3) {
        assert (hmi2 != null);
        assert (!this.c(hmi2));
        assert (hmi3 == null || this.c(hmi3));
        int n = this.d(hmi3);
        this.a(hmi2, n);
    }

    public final void b(hmi hmi2) {
        assert (hmi2 != null);
        assert (this.c(hmi2));
        int n = this.d(hmi2);
        hqx hqx2 = this.kUx.get(n);
        this.T(-1, false);
        hqx2.remove();
        this.kUx.remove(n);
        if (n < this.kUx.size()) {
            this.T(n, false);
        } else {
            this.T(n - 1, false);
        }
        this.ccm();
    }

    public final void a(hmi hmi2, boolean bl) {
        assert (this.Initialized);
        int n = this.d(hmi2);
        this.T(n, bl);
    }

    public final int cuS() {
        return this.kUB;
    }

    public final hmi cuM() {
        assert (this.Initialized);
        if (this.kUB == -1) {
            return null;
        }
        return this.kUx.get((int)this.kUB).kZG;
    }

    public final void oi(boolean bl) {
        int n = this.kUB + 1;
        if (n >= this.kUx.size()) {
            n = 0;
        }
        this.T(n, bl);
    }

    public final void oj(boolean bl) {
        int n = this.kUB - 1;
        if (n < 0) {
            n = this.kUx.size() - 1;
        }
        this.T(n, bl);
    }

    public final hmi H(lgg lgg2) {
        int n = this.I(lgg2);
        if (n == -1 || n >= this.kUx.size()) {
            return null;
        }
        return this.kUx.get((int)n).kZG;
    }

    public final boolean cuT() {
        return this.kUC;
    }

    public final int getTabCount() {
        return this.kUx.size();
    }

    public final void T(int n, boolean bl) {
        if (this.kUB == n) {
            return;
        }
        this.NI(n);
        this.kUC = bl;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.ccm();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected int a(ldb ldb2) {
        switch (ldb2) {
            case reo: {
                return 32;
            }
            case rep: {
                return 0;
            }
        }
        assert (false);
        return 0;
    }

    protected hqx a(hmi hmi2, String string) {
        return new hqx(this.kLu, string, hmi2, this.kUw.kUF, this.kUz, this.kUA);
    }

    protected void cml() {
        this.ccm();
        this.kUy.enp();
    }

    private void NI(int n) {
        hqx hqx2;
        assert (n < this.kUx.size());
        if (n == this.kUB) {
            return;
        }
        if (this.kUB != -1) {
            hqx2 = this.kUx.get(this.kUB);
            hqx2.on(false);
            hqx2.mZ(false);
        }
        this.kUB = n;
        if (this.kUB != -1) {
            hqx2 = this.kUx.get(this.kUB);
            hqx2.cqF();
            hqx2.on(true);
            hqx2.mZ(true);
        }
        if (this.Initialized) {
            this.cml();
        }
    }

    public void a(hmi hmi2, int n) {
        assert (hmi2 != null);
        assert (!this.c(hmi2));
        hqx hqx2 = this.a(hmi2, (String)null);
        this.j(hqx2);
        if (n == -1) {
            n = this.kUx.size();
        }
        this.kUx.add(n, hqx2);
        this.ccm();
    }

    protected final void ccm() {
        hqx hqx2 = this.kUB == -1 ? null : this.kUx.get(this.kUB);
        int n = 0;
        for (hqx hqx3 : this.kUx) {
            lhf lhf2 = this.kLu.a(this.kUw.kUF.jHz.kiK.jFE, hqx3.kZG.cgO());
            int n2 = lhf2.rmN;
            if (hqx3 == hqx2 && hqx3.kZI) {
                n2 += this.kUw.kUF.kZM.kLY.rmN + 2;
            }
            if (hqx3 == hqx2 && hqx3.kZJ) {
                n2 += this.kUw.kUF.kZN.kLY.rmN + 2;
            }
            hqx3.h(n, 0, n2 + this.kUw.kUE * 2, this.kUw.kUD);
            n += n2 + this.kUw.kUE;
        }
        if (this.kUx.size() > 0) {
            n += this.kUw.kUE;
        }
        this.Ng(n);
        if (hqx2 != null) {
            hqx2.cqF();
        }
    }

    protected final int d(hmi hmi2) {
        for (int i = 0; i < this.kUx.size(); ++i) {
            if (this.kUx.get((int)i).kZG != hmi2) continue;
            return i;
        }
        return -1;
    }

    protected final int I(lgg lgg2) {
        hpx hpx2 = this.a(lgg2, hpx.class);
        int n = 0;
        while (true) {
            if (n >= this.kUx.size()) {
                return -1;
            }
            if (this.kUx.get(n) == hpx2) break;
            ++n;
        }
        if (lgg2.cf >= hpx2.cqw().cf + hpx2.getWidth() / 2) {
            ++n;
        }
        return n;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

