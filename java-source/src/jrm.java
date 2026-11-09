/*
 * Decompiled with CFR.
 */
public class jrm
extends jro {
    private int nUw;
    private int PC;
    private int nuD;

    jrm() {
        super(5);
    }

    public int dRz() {
        return this.nUw;
    }

    public void VQ(int n) {
        this.nUw = n;
    }

    public int dRA() {
        return this.nuD;
    }

    public void VR(int n) {
        this.nuD = n;
    }

    public int getValue() {
        return this.PC;
    }

    public void setValue(int n) {
        this.PC = n;
    }
}

