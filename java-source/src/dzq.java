/*
 * Decompiled with CFR.
 */
public class dzq
extends dzi
implements dxu {
    private int aqs = -1;
    private int ijz = 0;
    private int dVm = 0;
    private int Qw = 0;
    private boolean ijA = false;
    private double eNV = 0.0;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void f(hc hc2) {
        this.ijz = hc2.ordinal();
    }

    public int bEO() {
        return this.dVm;
    }

    public void Dh(int n2) {
        this.dVm = n2;
    }

    public int getAlignment() {
        return this.Qw;
    }

    public void setAlignment(int n2) {
        this.Qw = n2;
    }

    public boolean bEQ() {
        return this.ijA;
    }

    public void jP(boolean bl) {
        this.ijA = bl;
    }

    public double bjB() {
        return this.eNV;
    }

    public void by(double d2) {
        this.eNV = d2;
    }

    dzq() {
        super(23305);
    }
}

