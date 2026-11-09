/*
 * Decompiled with CFR.
 */
public class fdz
extends fed
implements dxu {
    private int iFT;
    private int dJE;
    private int aqs = -1;
    private int Type;

    fdz() {
        super(27905);
    }

    public int bOB() {
        return this.iFT;
    }

    public int axg() {
        return this.dJE;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    public int getType() {
        return this.Type;
    }

    public void Gs(int n) {
        this.iFT = n;
    }

    public void Gt(int n) {
        this.dJE = n;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public void setType(int n) {
        this.Type = n;
    }
}

