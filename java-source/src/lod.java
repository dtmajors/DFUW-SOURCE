/*
 * Decompiled with CFR.
 */
public final class lod
extends loc {
    private String Value;

    public lod() {
        super(a.rGh);
    }

    public lod(String string) {
        this();
        this.Value = string;
    }

    public lod(lod lod2) {
        this();
        this.b(lod2);
    }

    @Override
    protected final String ewA() {
        return this.Value;
    }

    @Override
    protected final void AP(String string) {
        this.Value = string;
    }
}

