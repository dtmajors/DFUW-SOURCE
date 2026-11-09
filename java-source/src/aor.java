/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aor
extends aqu {
    private final ary bJQ;
    private final double oV;
    private boolean bJR;
    private ljq aet;
    private a bJS;

    public aor(anf anf2, aqu.b b2, boolean bl) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 4.0;
        this.oV = this.bFP.Jp().rgz;
        this.bJR = false;
        if (!bl && this.bFP.JF()) {
            this.bFP.hg(65908);
            int n = (int)(this.bFP.getGUID().eny() + (long)(31 * cug.fhe));
            this.bFP.hi(n);
            arz.SH().a(n, cug.fhe, this.bFP.av().esF(), this.bFP.aw().eqV());
            this.bJQ = new ary(n, 4.0, 0.0, -0.3f, -2.5f);
            this.bJQ.ad(1.0);
        } else {
            this.bJQ = null;
        }
        this.bFP.hk(2);
    }

    private ljq Pw() {
        if (this.bFP.IZ().LC() == null) {
            return null;
        }
        ljq ljq2 = this.bFP.IZ().LC().esF();
        float f = (float)(Math.PI * 2 * arw.Sw());
        float f2 = 1.0f + arw.Sx();
        ljq2.x = (float)((double)ljq2.x + (double)f2 * Math.cos(f));
        ljq2.y += 1.0f;
        ljq2.rlV = (float)((double)ljq2.rlV + (double)f2 * Math.sin(f));
        return ljq2;
    }

    void Px() {
        this.bFP.a("Digger teleport random", null, -1, false);
        this.bJS = a.bJV;
    }

    void av(ljq ljq2) {
        this.bFP.a("Digger teleport on target", ljq2, -1, false);
        this.bJS = a.bJV;
    }

    @Override
    public boolean c(ljq ljq2, boolean bl) {
        if (this.bJS != a.bJU) {
            return false;
        }
        if (this.aet == null) {
            return false;
        }
        if (!this.aet.equals(ljq2)) {
            return false;
        }
        if (bl) {
            this.av(this.aet);
        } else {
            this.Px();
        }
        return true;
    }

    @Override
    public boolean execute() {
        if (this.bJQ != null) {
            this.bJQ.d(this.bFP.av(), true);
        }
        if (this.bFP.JE()) {
            if (this.bFP.Jp().rgz < this.oV + 0.8) {
                return this.Ql();
            }
            if (!this.bJR) {
                this.bFP.hg(65908);
                this.bJR = true;
            }
        }
        if (this.bFP.Jp().rgz < this.oV + 2.5) {
            return true;
        }
        this.bFP.Kk();
        this.bFP.Kq();
        if (this.bFP.Jp().rgz < this.oV + 3.0) {
            return true;
        }
        if (this.bJS == a.bJT) {
            this.aet = this.Pw();
            if (!this.bFP.ao(this.aet)) {
                this.Px();
            } else {
                this.bJS = a.bJU;
            }
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(false, null);
        this.Qs();
        this.bJS = a.bJT;
    }

    @Override
    public String name() {
        return "DIGGER IDLE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

