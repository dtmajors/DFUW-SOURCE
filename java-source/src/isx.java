/*
 * Decompiled with CFR.
 */
public enum isx {
    myo("center"),
    myp("end"),
    myq("justify"),
    myr("left"),
    mys("right"),
    myt("start");

    private String mqF;

    private isx(String string2) {
        this.mqF = string2;
    }

    public String getValue() {
        return this.mqF;
    }
}

