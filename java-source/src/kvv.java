/*
 * Decompiled with CFR.
 */
public class kvv
extends kwr {
    private int iSj;
    private boolean iSk;
    private int ipH;

    public kvv() {
        this.qbN = 524;
    }

    public boolean bQF() {
        return this.iSk;
    }

    public void ll(boolean bl) {
        this.iSk = bl;
    }

    public int bQG() {
        return this.iSj;
    }

    public void Hf(int n) {
        this.iSj = n;
    }

    public int Wb() {
        return this.ipH;
    }

    public void Hg(int n) {
        this.ipH = n;
    }

    @Override
    public String toString() {
        return "LoadCount = " + this.iSj + ", TotalCount = " + this.ipH + ", AllLoaded = " + this.iSk;
    }
}

