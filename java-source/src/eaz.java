/*
 * Decompiled with CFR.
 */
public class eaz
extends ebq
implements dxu {
    public int ResourceType = 0;
    public boolean ikP = false;
    public ljq Position = null;
    public lgl Rotation = null;
    public String azF = null;
    private ldv Rr = null;
    private int aqs = -1;

    eaz() {
        super(17411);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n2) {
        this.ResourceType = n2;
    }

    public boolean bFj() {
        return this.ikP;
    }

    public void jS(boolean bl) {
        this.ikP = bl;
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

    public ldv bFk() {
        return this.Rr;
    }

    public void oD(ldv ldv2) {
        this.Rr = ldv2;
    }

    public String rz() {
        return this.azF;
    }

    public void bL(String string) {
        this.azF = string;
    }
}

