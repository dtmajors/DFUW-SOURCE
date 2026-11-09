/*
 * Decompiled with CFR.
 */
public enum ifm {
    lRr,
    lRs,
    lRt;


    public static ifm getNextState(ifm ifm2) {
        return ifm2.ordinal() + 1 < ifm.values().length ? ifm.values()[ifm2.ordinal() + 1] : ifm.values()[0];
    }
}

