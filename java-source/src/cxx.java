/*
 * Decompiled with CFR.
 */
public class cxx
extends cxv {
    private float fXA = 0.0f;
    private float fXB = 0.0f;
    private float fXC = 0.0f;
    private float fXD = 0.0f;
    private float fXE = 0.0f;

    public float bgq() {
        return this.fXA;
    }

    public void fz(float f2) {
        this.fXA = f2;
    }

    public float bgr() {
        return this.fXB;
    }

    public void fA(float f2) {
        this.fXB = f2;
    }

    public float bgs() {
        return this.fXC;
    }

    public void fB(float f2) {
        this.fXC = f2;
    }

    public float bgt() {
        return this.fXD;
    }

    public void fC(float f2) {
        this.fXD = f2;
    }

    public float bgu() {
        return this.fXE;
    }

    public void fD(float f2) {
        this.fXE = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 5: {
                return this.fXA;
            }
            case 6: {
                return this.fXB;
            }
            case 20: {
                return this.fXC;
            }
            case 19: {
                return this.fXD;
            }
            case 21: {
                return this.fXE;
            }
        }
        return super.xo(n2);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        cxx cxx2 = (cxx)((Object)cxc2);
        cxx2.fz(this.fXA);
        cxx2.fA(this.fXB);
        cxx2.fB(this.fXC);
        cxx2.fC(this.fXD);
        cxx2.fD(this.fXE);
    }
}

