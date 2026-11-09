/*
 * Decompiled with CFR.
 */
public class lik
extends lgi {
    public lik() {
        super(3);
    }

    public lik(ljp[] ljpArray) {
        super(ljpArray);
        assert (ljpArray.length == 3);
    }

    public lik(ljp ljp2, ljp ljp3, ljp ljp4) {
        super(new ljp[]{ljp2, ljp3, ljp4});
    }

    public float esu() {
        double d2 = this.rlJ[0].x(this.rlJ[1]);
        double d3 = this.rlJ[1].x(this.rlJ[2]);
        double d4 = this.rlJ[2].x(this.rlJ[0]);
        double d5 = (d2 + d3 + d4) / 2.0;
        float f = (float)Math.sqrt(d5 * (d5 - d2) * (d5 - d3) * (d5 - d4));
        float f2 = this.esv();
        assert (f > f2 - 1.0f && f < f2 + 1.0f);
        return f;
    }

    public float esv() {
        float f = this.rlJ[0].x;
        float f2 = this.rlJ[0].y;
        float f3 = this.rlJ[1].x;
        float f4 = this.rlJ[1].y;
        float f5 = this.rlJ[2].x;
        float f6 = this.rlJ[2].y;
        return Math.abs(f3 * f2 - f * f4 + (f5 * f4 - f3 * f6) + (f * f6 - f5 * f2)) / 2.0f;
    }
}

