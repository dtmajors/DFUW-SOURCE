/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  en
 *  ep
 */
public abstract class ex
extends et {
    private et PD = null;
    private et PE = null;
    protected boolean PF = true;

    public ex() {
        this.DP = 5;
    }

    public final et fS() {
        return this.PD;
    }

    public final void b(et et2) {
        this.PD = et2;
    }

    public final et fT() {
        return this.PE;
    }

    public final void c(et et2) {
        this.PE = et2;
    }

    public final boolean fU() {
        return this.PF;
    }

    public final void y(boolean bl) {
        if (this.PF == bl) {
            return;
        }
        if (!bl || this.DQ == null) {
            this.PF = bl;
            return;
        }
        assert (bl);
        assert (this instanceof ez);
        ((ez)this).gn();
        this.PF = true;
        this.DQ.a(this, this.fN());
    }

    public final boolean fV() {
        return this.fN() == this.fX();
    }

    public final float fW() {
        if (this.PD == null) {
            return 0.0f;
        }
        if (!(this.PD instanceof ex)) {
            return this.PD.fN();
        }
        return ((ex)this.PD).fX();
    }

    public final float fX() {
        if (this.PD != null) {
            return this.PD.fN();
        }
        return 0.0f;
    }

    public final float fY() {
        if (this.PE != null) {
            return this.PE.fN();
        }
        return 0.0f;
    }

    @Override
    public final void reset() {
        this.p(1.0f);
    }

    public void p(float f) {
        assert (this.PD != null);
        super.reset();
        float f2 = this.fX() * f;
        this.o(f2);
    }

    @Override
    public void o(float f) {
        if (Float.isNaN(f)) {
            f = 1.0f;
        }
        if (this.Pz == f) {
            return;
        }
        if (this.DQ == null) {
            this.Pz = f;
            return;
        }
        assert (this.PD != null);
        assert (this.PE != null);
        float f2 = this.Pz;
        this.Pz = f;
        this.a(f2, this.Pz);
        if (this.PF) {
            this.DQ.a(this, f2);
        }
    }

    public final void fZ() {
        assert (this.PE != null);
        float f = this.PE.fN() - 4.0f;
        this.o(f);
    }

    public final void ga() {
        assert (this.PD != null);
        float f = this.PD.fN();
        this.o(f);
    }

    public final void gb() {
        assert (this.PE != null);
        float f = this.PE.fN();
        this.o(f);
    }

    protected final boolean gc() {
        return ep.aI((int)this.Type);
    }

    protected final boolean gd() {
        return ep.aK((int)this.Type);
    }

    private void a(float f, float f2) {
        assert (this.DQ != null);
        float f3 = this.fX();
        if (f2 > f3) {
            if (this.gc() && this.PF) {
                ((en)this.DQ).a((et)this);
            }
            this.Pz = f3;
            return;
        }
        float f4 = this.fY();
        if (f2 < f4) {
            if (this.gd() && this.PF) {
                ((en)this.DQ).a(this);
            }
            this.Pz = f4;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof ex)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ex ex2 = (ex)object;
        if (this.fX() != ex2.fX()) {
            return false;
        }
        if (this.fW() != ex2.fW()) {
            return false;
        }
        return this.fY() == ex2.fY();
    }
}

