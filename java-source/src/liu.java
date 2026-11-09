/*
 * Decompiled with CFR.
 */
public abstract class liu
extends lip {
    public final double Pq;

    protected liu() {
        this.Pq = 0.0;
    }

    public liu(double d2) {
        this.Pq = d2;
    }

    public boolean a(liu liu2) {
        return ldf.r(this.Pq, liu2.Pq);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof liu) {
            return this.a((liu)object);
        }
        return super.equals(object);
    }

    public final int b(liu liu2) {
        double d2 = this.Pq - liu2.Pq;
        return (int)Math.signum(d2);
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof liu) {
            return this.b((liu)lip2);
        }
        return this.esy().compareTo(lip2.esy());
    }
}

