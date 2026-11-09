/*
 * Decompiled with CFR.
 */
public class jrn
extends jro {
    private int nUx;
    private int nNK;
    private int nNL;
    private int cf;
    private int cg;

    jrn() {
        super(4);
    }

    public int dRB() {
        return this.nNL;
    }

    public void VS(int n) {
        this.nNL = n;
    }

    public int dRC() {
        return this.nUx;
    }

    public void setMessage(int n) {
        this.nUx = n;
    }

    public int dRD() {
        return this.nNK;
    }

    public void VT(int n) {
        this.nNK = n;
    }

    public int getX() {
        return this.cf;
    }

    public void RH(int n) {
        this.cf = n;
    }

    public int getY() {
        return this.cg;
    }

    public void RI(int n) {
        this.cg = n;
    }
}

