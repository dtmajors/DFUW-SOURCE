/*
 * Decompiled with CFR.
 */
public enum ipd {
    mqq("add"),
    mqr("alpha"),
    mqs("darken"),
    mqt("difference"),
    mqu("erase"),
    mqv("hardlight"),
    mqw("invert"),
    mqx("layer"),
    mqy("lighten"),
    mqz("multiply"),
    mqA("normal"),
    mqB("overlay"),
    mqC("screen"),
    mqD("shader"),
    mqE("subtract");

    private String mqF;

    private ipd(String string2) {
        this.mqF = string2;
    }

    public String getValue() {
        return this.mqF;
    }
}

