/*
 * Decompiled with CFR.
 */
public class ecr
extends ect
implements dxu {
    private int aqs = -1;
    public int ResourceType = 0;
    public boolean ikP = false;
    public ljq Position = null;
    public lgl Rotation = null;
    public boolean ilR = false;
    public ljq ilS = null;
    public lgl ilT = null;
    public double aTo = 0.0;
    public ldv ilU = null;

    ecr() {
        super(19457);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n2) {
        this.ResourceType = n2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public boolean bFj() {
        return this.ikP;
    }

    public void jS(boolean bl) {
        this.ikP = bl;
    }

    public ldv bFz() {
        return this.ilU;
    }

    public void oF(ldv ldv2) {
        this.ilU = ldv2;
    }
}

