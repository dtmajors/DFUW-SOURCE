/*
 * Decompiled with CFR.
 */
public class ksw
extends ktf {
    private int ew;
    private String aNb;
    private int ResourceType;
    private ldv Rs = null;
    private ljq Position = null;
    private lgl Rotation = null;

    public ksw() {
        this.qbm = 4;
    }

    public int getResult() {
        return this.ew;
    }

    public String getErrorString() {
        return this.aNb;
    }

    public int az() {
        return this.ResourceType;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
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

