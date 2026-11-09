/*
 * Decompiled with CFR.
 */
public abstract class ajf
extends aja
implements aki {
    protected float bpE = 0.0f;
    protected float aSc = 0.0f;

    public final float getMaxDistance() {
        return this.bpE;
    }

    public final void setMaxDistance(float f2) {
        this.bpE = f2;
    }

    public final float getMinDistance() {
        return this.aSc;
    }

    public final void setMinDistance(float f2) {
        this.aSc = f2;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajf ajf2 = (ajf)aja2;
        ajf2.setMaxDistance(this.bpE);
        ajf2.setMinDistance(this.aSc);
    }

    @Override
    public abstract void Ch();

    @Override
    public abstract void Ci();
}

