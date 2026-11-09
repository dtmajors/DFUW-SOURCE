/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.Collection;
import java.util.Set;

public class anp {
    public static final float bGX = 0.95f;
    public static final float bGY = 0.6f;
    public static final float bGZ = 0.15f;
    protected anf bFP;
    private final boolean bGn;
    private asv bHa;
    private asv bHb;
    private boolean bHc;
    protected asv bHd;
    protected asv bHe;
    protected asv bHf;

    public void terminate() {
    }

    public boolean bs(boolean bl) {
        return true;
    }

    public boolean Ln() {
        return true;
    }

    public boolean bt(boolean bl) {
        return true;
    }

    public boolean bu(boolean bl) {
        return true;
    }

    public boolean bv(boolean bl) {
        return true;
    }

    public boolean Lo() {
        return true;
    }

    public boolean Lp() {
        return true;
    }

    public boolean Lq() {
        return true;
    }

    public boolean Lr() {
        return true;
    }

    public boolean f(asv asv2) {
        return asv2 != null;
    }

    public float k(asv asv2) {
        return 0.6f;
    }

    public float l(asv asv2) {
        if (asv2.Uw() || this.bFP.Kh()) {
            return 0.95f;
        }
        return 0.15f;
    }

    public boolean Ls() {
        return this.bHa != null;
    }

    public boolean Lt() {
        return false;
    }

    public boolean Lu() {
        return false;
    }

    public boolean bw(boolean bl) {
        return false;
    }

    public void x(ldz ldz2) {
        this.bHd = null;
        this.bHe = null;
        this.bHf = null;
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        for (asv asv2 : this.bFP.IT()) {
            if (asv2.equals(this.bFP.Jl()) || asv2.Ut() || !this.g(asv2)) continue;
            float f4 = this.n(asv2);
            float f5 = asv2.Ua() / f4;
            if (this.bFP.Kh() && this.bFP.av().y - asv2.av().y > 40.0f) continue;
            if (this.s(asv2)) {
                float f6 = ljq.s(asv2.av(), this.bFP.av());
                f6 -= asv2.TX();
                if ((f6 /= f4) <= f3 && (!asv2.Uz() || Math.random() < 0.2)) {
                    this.bHe = asv2;
                    f3 = f6;
                }
                if (!(f5 <= f) || asv2.Uz()) continue;
                this.bHd = asv2;
                f = f5;
                continue;
            }
            if (!(f5 <= f2)) continue;
            this.bHf = asv2;
            f2 = f5;
        }
    }

    public void Lx() {
        this.o(null);
    }

    public void o(asv asv2) {
        this.bHb = this.bHa;
        this.bHa = asv2;
    }

    public void Lv() {
        this.o(this.bHe);
    }

    private float n(asv asv2) {
        float f = 0.0f;
        if (asv2 != null) {
            f = (float)asv2.getPriority() / (float)asv.c.getMaxPriorityValue();
            if (!this.bFP.an(asv2.av())) {
                f /= 4.0f;
            }
        }
        return 1.0f + 7.0f * f;
    }

    public anp(anf anf2) {
        this.bFP = anf2;
        this.bGn = true;
        this.o(null);
        this.bHc = false;
        this.bHd = null;
        this.bHf = null;
        this.bHe = null;
    }

    public boolean HT() {
        return this.bGn;
    }

    public asv Ly() {
        return this.bHa;
    }

    public asv Lz() {
        return this.bHb;
    }

    public float LA() {
        return this.p(this.bHa);
    }

    public boolean LB() {
        if (this.bHa == null) {
            return false;
        }
        return this.bHa.Uz();
    }

    public ljq LC() {
        if (this.bHa == null) {
            return null;
        }
        return this.bHa.av();
    }

    public ljp LD() {
        if (this.bHa == null) {
            return null;
        }
        return this.bHa.Jj();
    }

    public boolean LE() {
        if (this.bHa == null) {
            return false;
        }
        return this.bHa.UA();
    }

    public float LF() {
        if (this.bHa == null) {
            return 1.0f;
        }
        return this.bHa.Uc();
    }

    public float LG() {
        if (this.bHa == null) {
            return 0.0f;
        }
        return anp.a(this.bFP.av(), this.bFP.IV(), this.bHa.av());
    }

    public ljq LH() {
        if (this.bHa == null) {
            return null;
        }
        return this.bHa.Up();
    }

    public float p(asv asv2) {
        if (asv2 == null) {
            return Float.MAX_VALUE;
        }
        return ljq.s(this.bFP.av(), asv2.av());
    }

    public float LI() {
        if (this.bHa == null) {
            return 0.0f;
        }
        return anp.a(this.bHa.av(), this.bHa.IV(), this.bFP.av());
    }

    public float q(asv asv2) {
        return anp.a(asv2.av(), asv2.IV(), this.bFP.av());
    }

    public float r(asv asv2) {
        return anp.a(this.bFP.av(), this.bFP.IV(), asv2.av());
    }

    public static float a(ljq ljq2, float f, ljq ljq3) {
        float f2;
        float f3 = (float)(-Math.atan2(ljq3.x - ljq2.x, -(ljq3.rlV - ljq2.rlV)));
        float f4 = Math.signum(f) != Math.signum(f3) ? ((double)(f2 = Math.abs(f) + Math.abs(f3)) > Math.PI ? (float)(Math.PI * 2 - (double)f2) : f2) : Math.abs(f - f3);
        return f4;
    }

    public boolean s(asv asv2) {
        if (asv2 == null) {
            return false;
        }
        if (arw.bRT) {
            return true;
        }
        boolean bl = this.bFP.Jc().Th().contains(asv2.az());
        return this.bHc ? !bl : bl;
    }

    public void LJ() {
        this.bHc = !this.bHc;
    }

    public boolean LK() {
        return this.bHa != null && !this.bHa.Ut() && this.bFP.b(this.bHa);
    }

    public boolean bt(float f) {
        for (asv asv2 : this.bFP.IT()) {
            if (!asv2.UC() || !(ljq.s(asv2.av(), this.bFP.av()) < f)) continue;
            return true;
        }
        return false;
    }

    public asv LL() {
        asv asv2 = this.bFP.Jl();
        for (asv asv3 : this.bFP.IT()) {
            if (asv3.Ut() || this.s(asv3) || !this.a(asv3, asv2)) continue;
            asv2 = asv3;
        }
        if (asv2.equals(this.bFP.Jl())) {
            return null;
        }
        return asv2;
    }

    public void LM() {
        this.o(this.bHf);
    }

    public boolean LN() {
        if (this.bHf == null) {
            return false;
        }
        return this.bHf.Uz();
    }

    public float LO() {
        if (this.bHf == null) {
            return 1.0f;
        }
        return this.bHf.Uc();
    }

    private boolean a(asv asv2, asv asv3) {
        long l2;
        if (asv3 == null) {
            return true;
        }
        if (asv2 == null) {
            return false;
        }
        if (asv2.Ub() > asv3.Ub()) {
            return true;
        }
        if (asv2.Ub() < asv3.Ub()) {
            return false;
        }
        long l3 = asv2.KY().eny();
        return l3 > (l2 = asv3.KY().eny());
    }

    public asv bu(float f) {
        float f2 = f * f;
        ljq ljq2 = this.bFP.av();
        float f3 = this.bFP.IV();
        for (asv asv2 : this.bFP.IT()) {
            if (asv2.equals(this.bFP.Jl()) || !this.s(asv2) || asv2.Ut() || !(ljq2.eA(asv2.av()) < f2) || !(Math.abs(anp.a(ljq2, f3, asv2.av())) < 1.0f)) continue;
            return asv2;
        }
        return null;
    }

    public boolean a(ljq ljq2, float f, boolean bl) {
        if (ljq2 == null) {
            return false;
        }
        float f2 = f * f;
        for (asv asv2 : this.bFP.IT()) {
            if (asv2.equals(this.bFP.Jl()) || !this.s(asv2) || asv2.Ut() || asv2 == this.bHa && bl || !(ljq2.eA(asv2.av()) < f2)) continue;
            return true;
        }
        return false;
    }

    public int m(ljq ljq2, float f) {
        if (ljq2 == null) {
            return 0;
        }
        int n = 0;
        float f2 = f * f;
        for (asv asv2 : this.bFP.IT()) {
            if (!this.s(asv2) || asv2.Ut() || !asv2.UB() || !(ljq2.eA(asv2.av()) < f2)) continue;
            ++n;
        }
        return n;
    }

    public int n(ljq ljq2, float f) {
        if (ljq2 == null) {
            return 0;
        }
        int n = 0;
        float f2 = f * f;
        for (asv asv2 : this.bFP.IT()) {
            if (asv2.equals(this.bFP.Jl()) || asv2.Ut() || !(ljq2.eA(asv2.av()) < f2)) continue;
            ++n;
        }
        return n;
    }

    public int o(ljq ljq2, float f) {
        if (ljq2 == null) {
            return 0;
        }
        int n = 0;
        float f2 = f * f;
        for (asv asv2 : this.bFP.IT()) {
            if (!this.s(asv2) || asv2.Ut() || !asv2.Uy() || !(ljq2.eA(asv2.av()) < f2)) continue;
            ++n;
        }
        return n;
    }

    public asv p(ljq ljq2, float f) {
        asv asv2 = null;
        if (ljq2 == null) {
            return asv2;
        }
        float f2 = f * f;
        for (asv asv3 : this.bFP.IT()) {
            float f3;
            if (!this.s(asv3) || asv3.Ut() || !((f3 = ljq2.eA(asv3.av())) < f2)) continue;
            f2 = f3;
            asv2 = asv3;
        }
        return asv2;
    }

    public boolean LP() {
        for (asv asv2 : this.bFP.IT()) {
            if (this.s(asv2) || asv2.equals(this.bFP.Jl()) || asv2.Ut()) continue;
            return true;
        }
        return false;
    }

    public boolean b(ljq ljq2, float f, boolean bl) {
        if (ljq2 == null) {
            return false;
        }
        for (asv asv2 : this.bFP.IT()) {
            if (this.s(asv2) || asv2.equals(this.bFP.Jl()) || asv2.Ut() || asv2 == this.bHa && bl || !(ljq2.ez(asv2.av()) < f)) continue;
            return true;
        }
        return false;
    }

    public boolean q(ljq ljq2, float f) {
        if (ljq2 == null) {
            return false;
        }
        float f2 = f * f;
        for (asv asv2 : this.bFP.IT()) {
            if (asv2.equals(this.bFP.Jl()) || asv2.Ut() || !(ljq2.eA(asv2.av()) < f2)) continue;
            return true;
        }
        return false;
    }

    public boolean f(float f, float f2) {
        return this.f(f, (float)Math.sqrt(f2), this.bHa.TX() * 3.0f);
    }

    public boolean g(float f, float f2) {
        return this.f(f, f2, this.bFP.Jl().TX() * 4.0f);
    }

    public boolean f(float f, float f2, float f3) {
        float f4 = f3 / f2;
        double d2 = Math.atan(f4);
        return (double)f <= d2;
    }

    protected boolean g(asv asv2) {
        if (asv2 == null) {
            return false;
        }
        return !asv2.Uq() || this.bFP.Io();
    }

    public float LQ() {
        if (this.bHa == null) {
            return 0.0f;
        }
        return this.bHa.IV();
    }

    public float LR() {
        if (this.bHa == null) {
            return 0.0f;
        }
        return this.bHa.TX();
    }

    public Collection<asv> a(ljq ljq2, float f, boolean bl, asv asv2) {
        Set<asv> set = lcn.emx();
        float f2 = f * f;
        for (asv asv3 : this.bFP.IT()) {
            if (asv3.Ut() || !this.s(asv3) || bl && !this.g(asv3) || asv3 == asv2 || asv3.equals(this.bFP.Jl()) || !(ljq.t(asv3.av(), ljq2) <= f2)) continue;
            set.add(asv3);
        }
        return set;
    }

    public Collection<asv> r(ljq ljq2, float f) {
        Set<asv> set = lcn.emx();
        float f2 = f * f;
        for (asv asv2 : this.bFP.IT()) {
            if (!this.s(asv2) || asv2.Ut() || asv2.equals(this.bFP.Jl()) || !(ljq.t(asv2.av(), ljq2) <= f2)) continue;
            set.add(asv2);
        }
        return set;
    }

    public boolean bx(boolean bl) {
        for (asv asv2 : this.bFP.IT()) {
            if (!this.s(asv2) || asv2.equals(this.bFP.Jl()) || asv2.Ut() || bl && !this.g(asv2)) continue;
            return true;
        }
        return false;
    }

    public boolean by(boolean bl) {
        for (asv asv2 : this.bFP.IT()) {
            if (!this.s(asv2) || asv2.Uz() || asv2.equals(this.bFP.Jl()) || asv2.Ut() || bl && !this.g(asv2)) continue;
            return true;
        }
        return false;
    }
}

