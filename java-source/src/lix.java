/*
 * Decompiled with CFR.
 */
abstract class lix
extends lip {
    protected final float Pz;

    protected lix() {
        this.Pz = 0.0f;
    }

    public lix(float f) {
        this.Pz = f;
    }

    public boolean a(lix lix2) {
        return ldq.ai(this.Pz, lix2.Pz);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lix) {
            return this.a((lix)object);
        }
        return super.equals(object);
    }

    public final int b(lix lix2) {
        return (int)(this.Pz - lix2.Pz);
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof lix) {
            return this.b((lix)lip2);
        }
        return this.esy().compareTo(lip2.esy());
    }
}

