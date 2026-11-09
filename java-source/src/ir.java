/*
 * Decompiled with CFR.
 */
public abstract class ir
extends btk
implements bto {
    private static final double agr = 0.02;
    private double agt = 0.0;
    private double agu = 0.0;
    protected int agv = 1;

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz < this.agt) {
            return;
        }
        this.nh();
        this.agu = this.agt;
        double d2 = Math.floor((ldz2.rgz - this.agu) / 0.02);
        this.agt += (d2 + 1.0) * 0.02;
        ++this.agv;
        this.nn();
    }

    protected abstract void nh();

    protected abstract void nn();
}

