/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class ano
extends ann {
    public ano(anf anf2) {
        super(anf2);
    }

    @Override
    public void x(ldz ldz2) {
        this.bHd = null;
        this.bHe = null;
        this.bHf = null;
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        for (asv asv2 : this.bFP.IT()) {
            arw.ct.debug("***target: " + asv2);
            if (asv2.equals(this.bFP.Jl()) || asv2.Ut() || this.m(asv2) || !this.g(asv2)) continue;
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

    private boolean m(asv asv2) {
        if (this.bFP.Jy()) {
            float f = 44.5f;
            float f2 = 51.0f;
            float f3 = 2.0f;
            ljq ljq2 = this.bFP.Ky();
            ljq ljq3 = asv2.av();
            if (ljq3.y < ljq2.y - f3) {
                return true;
            }
            if (ljq3.rlV > ljq2.rlV + f) {
                return true;
            }
            if (ljq3.rlV < ljq2.rlV - f2) {
                return true;
            }
            if (ljq3.x > ljq2.x + f) {
                return true;
            }
            if (ljq3.x < ljq2.x - f) {
                return true;
            }
        }
        return false;
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

    @Override
    protected boolean g(asv asv2) {
        if (asv2 == null) {
            return false;
        }
        return !asv2.Uq() || this.bFP.Io();
    }

    @Override
    public void Lv() {
        this.o(this.bHe);
    }
}

