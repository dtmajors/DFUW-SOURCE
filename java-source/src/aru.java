/*
 * Decompiled with CFR.
 */
public class aru
implements asm {
    private boolean bRK = true;
    private boolean bRL = false;
    private boolean bRM = false;
    private final ldv bRN;
    private final boolean bRO;

    public aru(Integer n, Boolean bl, ldv ldv2, boolean bl2, boolean bl3, boolean bl4) {
        if (n != null && bl != null) {
            this.bRK = n >= 0 && bl == false;
        }
        this.bRN = ldv2;
        this.bRL = bl2;
        this.bRM = bl3;
        this.bRO = bl4;
    }

    public ldv Sq() {
        return this.bRN;
    }

    public boolean Sr() {
        return this.bRK;
    }

    public boolean lh() {
        return this.bRL;
    }

    public boolean Ss() {
        return this.bRM;
    }

    @Override
    public boolean St() {
        return this.bRN != null;
    }

    public boolean isAlive() {
        return this.bRO;
    }
}

