/*
 * Decompiled with CFR.
 */
public class clq {
    private int ResourceType;
    private ljq Position;
    private lgl Rotation;

    public clq() {
    }

    public clq(int n, ljq ljq2, lgl lgl2) {
        this.ResourceType = n;
        this.Position = ljq2;
        this.Rotation = lgl2;
    }

    public final ljq av() {
        return this.Position;
    }

    public final lgl aw() {
        return this.Rotation;
    }

    public final int az() {
        return this.ResourceType;
    }
}

