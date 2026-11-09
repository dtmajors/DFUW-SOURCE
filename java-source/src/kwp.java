/*
 * Decompiled with CFR.
 */
public class kwp
extends kwr {
    private int gfj = -1;
    private ljq Position = null;
    private lgl Rotation = null;

    public kwp() {
        this.qbN = 516;
    }

    public int bkF() {
        return this.gfj;
    }

    public void zQ(int n) {
        this.gfj = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    @Override
    public String toString() {
        return " WindowCounter=" + this.gfj + " Position=" + this.Position + " Rotation=" + this.Rotation;
    }
}

