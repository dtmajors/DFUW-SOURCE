/*
 * Decompiled with CFR.
 */
public enum jc {
    aje(del.gkM, true),
    ajf(del.gkN, true),
    ajg(del.gkL, true),
    ajh(del.gkL, false),
    aji(del.gkJ, false),
    ajj(del.gkK, false),
    ajk(del.gkO, false),
    ajl(del.gkP, false),
    ajm(del.gkQ, false),
    ajn(del.gkR, false),
    ajo(del.gkS, false),
    ajp(del.gkT, false),
    ajq(del.gkU, false),
    ajr(del.gkV, false),
    ajs(del.gkI, false),
    ajt(del.gkW, false),
    aju(del.gkX, false),
    ajv(del.gkY, false),
    ajw(del.gkZ, false),
    ajx(del.gla, false),
    ajy(del.glb, false);

    private int SpecialEffectType = -1;
    private boolean ajz = false;

    public int getSpecialEffectType() {
        return this.SpecialEffectType;
    }

    public boolean nR() {
        return this.ajz;
    }

    private jc(int n2, boolean bl) {
        this.SpecialEffectType = n2;
        this.ajz = bl;
    }

    public static jc getValueByOrdinal(int n) {
        return n < 0 || n >= jc.values().length ? null : jc.values()[n];
    }
}

