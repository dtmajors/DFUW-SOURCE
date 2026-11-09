/*
 * Decompiled with CFR.
 */
public enum ish {
    mwR("left"),
    mwS("right"),
    mwT("justify"),
    mwU("center");

    private String mwV;

    private ish(String string2) {
        this.mwV = string2;
    }

    public String dpu() {
        return this.mwV;
    }
}

