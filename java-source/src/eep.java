/*
 * Decompiled with CFR.
 */
public class eep
extends eea
implements dxu {
    private int aqs = -1;
    private int ew = tu.aVn.ordinal();
    private int inL = 0;
    private int inM = 0;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public tu bGo() {
        return tu.getValueByOrdinal(this.ew);
    }

    public void a(tu tu2) {
        this.ew = tu2 == null ? tu.aVn.ordinal() : tu2.ordinal();
    }

    public float bGp() {
        return this.inL;
    }

    public void iI(float f2) {
        this.inL = (int)f2;
    }

    public float bGq() {
        return this.inM;
    }

    public void iJ(float f2) {
        this.inM = (int)f2;
    }

    eep() {
        super(12835);
    }
}

