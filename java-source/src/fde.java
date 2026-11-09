/*
 * Decompiled with CFR.
 */
public abstract class fde
extends dxq {
    public static final int iJN = 1;
    public static final int iJO = 2;
    public static final int iJP = 4;
    public static final int iJQ = 8;
    public static final int iJR = 16;
    public static final int iJS = 32;
    public int dul = 0;
    public int aqs = -1;

    private fde() {
        super(9216);
    }

    fde(int n) {
        super(n);
    }

    public final int aVk() {
        return this.aqs;
    }

    public final void sk(int n) {
        this.aqs = n;
    }

    public final boolean bOp() {
        return (this.dul & 1) > 0;
    }

    public final boolean bOq() {
        return (this.dul & 2) > 0;
    }

    public final boolean bOr() {
        return (this.dul & 4) > 0;
    }

    public final boolean bOs() {
        return (this.dul & 8) > 0;
    }

    public final boolean bOt() {
        return (this.dul & 0x10) > 0;
    }

    public final boolean bOu() {
        return (this.dul & 0x20) > 0;
    }
}

