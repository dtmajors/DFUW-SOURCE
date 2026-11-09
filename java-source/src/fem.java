/*
 * Decompiled with CFR.
 */
public class fem
extends feo
implements dxu {
    private int aqs = -1;
    public int ResourceType = 0;
    public boolean ikP = false;
    public ljq Position;
    public lgl Rotation;
    public double iKA = 0.0;
    public ldv ilU = null;

    fem() {
        super(25345);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final boolean bFj() {
        return this.ikP;
    }

    public final void jS(boolean bl) {
        this.ikP = bl;
    }

    public final ljq av() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public final lgl aw() {
        return this.Rotation;
    }

    public final void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public final ldv bFz() {
        return this.ilU;
    }

    public final void oF(ldv ldv2) {
        this.ilU = ldv2;
    }

    public final double bOK() {
        return this.iKA;
    }

    public final void cA(double d2) {
        this.iKA = d2;
    }
}

