/*
 * Decompiled with CFR.
 */
public class ecd
extends ecm {
    public int ResourceType = 0;
    public int dpl = 0;
    public ljq Position = null;
    public lgl Rotation = null;
    public String aGB = null;
    public float aGr = 0.0f;
    public ldv eTp;
    public long aXU = 0L;
    public pa aPp;
    private int dVG = 0;
    private int ilr = 0;

    ecd() {
        super(3073);
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n2) {
        this.ResourceType = n2;
    }

    public int aBX() {
        return this.dVG;
    }

    public void DB(int n2) {
        this.dVG = n2;
    }

    public int bFt() {
        return this.ilr;
    }

    public void DC(int n2) {
        this.ilr = n2;
    }

    public int bFu() {
        return this.dpl;
    }

    public void DD(int n2) {
        this.dpl = n2;
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
}

