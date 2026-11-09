/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class aos
extends aqu {
    private final ary bJQ;
    private final double oV;
    private boolean bJX;
    private boolean bJY;
    private boolean bJZ;

    public aos(anf anf2, aqu.b b2, boolean bl) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 2.3;
        this.oV = this.bFP.Jp().rgz;
        this.bFP.hg(65907);
        if (this.bFP.JF()) {
            int n = (int)(this.bFP.getGUID().eny() + (long)(31 * cug.fhe));
            this.bFP.hi(n);
            arz.SH().a(n, cug.fhe, this.bFP.av().esF(), this.bFP.aw().eqV());
            this.bJQ = new ary(n, 0.5, 0.0, -2.5f, -0.3f);
        } else {
            this.bJQ = null;
        }
        this.bJX = false;
    }

    @Override
    public void O(double d2) {
        if (d2 < 1.5) {
            this.bJZ = true;
        }
    }

    @Override
    public boolean execute() {
        if (this.bJQ != null) {
            this.bJQ.d(this.bFP.av(), true);
        }
        if (this.bFP.Jp().rgz < this.oV + 1.8) {
            return this.PL();
        }
        if (!this.bJY) {
            if (this.bFP.IZ().LA() > 4.0f) {
                this.bFP.a(true, null, ani.a.bFk);
            } else if (this.Qy()) {
                this.bFP.a(true, null, ani.a.bFj);
            } else {
                this.bFP.a(true, null);
            }
            this.bJY = true;
        }
        if (!this.bJX) {
            this.bFP.hk(1);
            this.bJX = true;
        }
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.Qt();
        if (this.bJZ) {
            this.PL();
        } else {
            this.v(this.bFP.IZ().Ly());
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.Ko();
        this.bJY = false;
        this.bJZ = false;
        this.Qs();
    }

    @Override
    public String name() {
        return "DIGGER MELEE";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

