/*
 * Decompiled with CFR.
 */
public enum jks {
    ntj(1.0f, 0xFFFFFF, 0.7f, 0x101010, ipd.mqz, false, 0.0f, 0, true, 1),
    ntk(0.4f, 0, 0.0f, 0, ipd.mqA, false, 0.0f, 0, false, 1),
    ntl(0.0f, 0, 1.0f, 0, ipd.mqA, false, 0.0f, 0, false, 1),
    ntm(0.0f, 0, 0.35f, 0, ipd.mqA, false, 0.0f, 0, false, 1);

    private int nmb;
    private int ntn;
    private int myb;
    private float nto;
    private float ntp;
    private ipd mqV;
    private boolean ntq;
    private float ntr;
    private int nts;
    private boolean ntt;
    private int ntu;

    private jks(float f2, int n2, float f3, int n3, ipd ipd2, boolean bl, float f4, int n4, boolean bl2, int n5) {
        this.nto = f2;
        this.ntn = n2;
        this.ntp = f3;
        this.myb = n3;
        this.mqV = ipd2;
        this.ntq = bl;
        this.ntr = f4;
        this.nts = n4;
        this.ntt = bl2;
        this.ntu = n5;
    }

    public float dLm() {
        return this.nto;
    }

    public int dLn() {
        return this.ntn;
    }

    public float cDd() {
        return this.ntp;
    }

    public int dqs() {
        return this.myb;
    }

    public ipd djT() {
        return this.mqV;
    }

    public boolean dLo() {
        return this.ntq;
    }

    public float dLp() {
        return this.ntr;
    }

    public int dLq() {
        return this.nts;
    }

    public boolean dLr() {
        return this.ntt;
    }

    public int dLs() {
        return this.ntu;
    }
}

