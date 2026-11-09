/*
 * Decompiled with CFR.
 */
public class izy
extends ist {
    private static final int mDR = 0xABABAB;
    private static final int mDS = 0x208820;

    public izy(String string) {
        super(string);
        this.a(isf.mwO, 14);
        this.Rk(0xABABAB);
    }

    public izy(String string, boolean bl) {
        super(string);
        this.a(isf.mwO, 14);
        this.Rk(bl ? 0x208820 : 0xABABAB);
    }

    public izy(lox lox2) {
        super(lox2);
        this.a(isf.mwO, 14);
        this.Rk(0xABABAB);
    }

    public izy(loz loz2) {
        super(loz2);
        this.a(isf.mwO, 14);
        this.Rk(0xABABAB);
    }

    public izy() {
        this.a(isf.mwO, 14);
        this.Rk(0xABABAB);
    }
}

