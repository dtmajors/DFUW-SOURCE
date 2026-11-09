/*
 * Decompiled with CFR.
 */
public enum jey {
    mWF("bow"),
    mWG("daggers"),
    mWH("fire"),
    mWI("harvesting"),
    mWJ("heal"),
    mWK("helmet"),
    mWL("monster"),
    mWM("pvp"),
    mWN("shield"),
    mWO("staff");

    public static jey mWP;
    private String mWQ;

    private jey(String string2) {
        this.mWQ = string2;
    }

    public String getId() {
        return this.mWQ;
    }

    static {
        mWP = mWM;
    }
}

