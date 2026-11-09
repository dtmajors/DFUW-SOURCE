/*
 * Decompiled with CFR.
 */
public class lni
extends lnh {
    private double Pq;

    public lni() {
        this(a.rFz, 0.0);
    }

    public lni(double d2) {
        this(a.rFz, d2);
    }

    public lni(a a2) {
        this(a2, a2.ew(0.0));
    }

    public lni(a a2, double d2) {
        super(a2);
        assert (d2 >= a2.kLl);
        assert (d2 <= a2.kLm);
        this.Pq = d2;
    }

    public lni(lni lni2) {
        super(lni2.evK());
    }

    public final a evN() {
        return (a)this.evb();
    }

    @Override
    protected final double evL() {
        return this.Pq;
    }

    @Override
    protected final void et(double d2) {
        this.Pq = d2;
    }
}

