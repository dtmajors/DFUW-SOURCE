/*
 * Decompiled with CFR.
 */
public class fes
extends feu
implements dxu {
    private int ResourceType = 0;
    private boolean ikP = false;
    private ljq Position = null;
    private lgl Rotation = null;
    private ldv ilU = null;
    private int aqs = -1;

    fes() {
        super(19201);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
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

    public void l(int n) {
        this.ResourceType = n;
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

