/*
 * Decompiled with CFR.
 */
public class arx
implements asm {
    private final ldv bRN;
    private final Boolean bSD;
    private final boolean bRL;

    public arx(Boolean bl, ldv ldv2, boolean bl2) {
        this.bSD = bl;
        this.bRN = ldv2;
        this.bRL = bl2;
    }

    public ldv Sq() {
        return this.bRN;
    }

    @Override
    public boolean St() {
        return this.bSD != null && this.bRN != null;
    }

    public boolean SC() {
        return this.bSD;
    }
}

