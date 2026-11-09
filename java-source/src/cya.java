/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  cyt
 */
public class cya
extends cxv {
    private static final boolean bC = false;
    private ljq[] fXG = null;
    private boolean fXH = false;
    private int fXI = -1;
    private float fXJ = 0.0f;
    private float fXK = 0.0f;
    private et fXL = null;
    private boolean[] ecU = null;
    private a fXM = a.fXR;
    private boolean qW = true;
    private static final double fXN = 1.0;
    private double fXO = 0.0;
    private boolean fXP = false;

    public ljq[] bgv() {
        return this.fXG;
    }

    public void d(ljq[] ljqArray) {
        this.fXG = ljqArray;
    }

    public boolean bgw() {
        return this.fXH;
    }

    public void hn(boolean bl) {
        this.fXH = bl;
    }

    public int bgx() {
        return this.fXI;
    }

    public void yC(int n2) {
        this.fXI = n2;
    }

    public float bgy() {
        return this.fXJ;
    }

    public void fE(float f2) {
        this.fXJ = f2;
    }

    public float bgz() {
        return this.fXK;
    }

    public void fF(float f2) {
        this.fXK = f2;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.bef() == cwx.a.fGw && this.qW) {
            if (this.fXH) {
                this.bgA();
            }
            this.Ou();
        }
    }

    public void a(cyt cyt2, boolean bl) {
        super.a(cyt2, bl);
        if (this.fXH) {
            this.bgB();
        }
    }

    @Override
    protected final void e(cxc cxc2) {
        super.e(cxc2);
        cya cya2 = (cya)((Object)cxc2);
        ljq[] ljqArray = new ljq[this.fXG.length];
        int n2 = ljqArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.fXG[i2] == null) continue;
            ljqArray[i2] = this.fXG[i2].esF();
        }
        cya2.d(ljqArray);
        cya2.hn(this.fXH);
        cya2.yC(this.fXI);
        cya2.fE(this.fXJ);
        cya2.fF(this.fXK);
    }

    @Override
    protected void a(cxv.a a2) {
        switch (a2) {
            case fXw: {
                assert (this.fXM == a.fXR);
                if (this.fGh.ecU == null) {
                    return;
                }
                this.ecU = this.fGh.ecU;
                if (this.fXH) {
                    this.bgA();
                }
                if (this.fXM == a.fXS) {
                    this.yD(this.fXI);
                    break;
                }
                this.yD(this.SkillType);
                break;
            }
            case fXx: {
                break;
            }
        }
    }

    @Override
    protected void beO() {
        if (this.fXM == a.fXS) {
            this.nN(this.fXI);
        } else {
            this.nN(this.SkillType);
        }
        super.beO();
    }

    @Override
    protected void bex() {
        super.bex();
        this.ecU = null;
        this.fXM = a.fXR;
        this.qW = true;
    }

    protected final void xg(int n2) {
        assert (this.fXG != null);
        assert (this.fGh.ecU != null);
        assert (this.fXG.length == this.fGh.ecU.length);
        if ((n2 & 1) > 0) {
            int n3;
            boolean bl = false;
            for (n3 = 0; n3 < this.ecU.length; ++n3) {
                if (this.fXG[n3] == null || this.ecU[n3] == this.fGh.ecU[n3]) continue;
                if (this.fGh.ecU[n3]) {
                    // empty if block
                }
                this.ecU[n3] = this.fGh.ecU[n3];
                bl = true;
            }
            n3 = 0;
            for (int i2 = 0; i2 < this.ecU.length; ++i2) {
                if (!this.ecU[i2] || this.fXG[i2] == null) continue;
                n3 = 1;
                break;
            }
            if (n3 == 0) {
                this.beQ();
            } else if (bl) {
                this.emI.bgQ().aJD().e(this.ecU);
                this.bgD();
            }
        }
    }

    private void l(ljq ljq2, ljq ljq3) {
        ljq2.x += ljq3.x;
        ljq2.y += ljq3.y;
        ljq2.rlV += ljq3.rlV;
    }

    private void bgA() {
        assert (this.fXH);
        assert (this.fXL != null);
        switch (this.fXM) {
            case fXR: {
                if (!this.fGh.gcv || !this.bgC()) break;
                float f2 = this.fXL.fN();
                if (f2 < this.fXJ) {
                    this.a(a.fXT);
                    break;
                }
                this.a(a.fXS);
                break;
            }
            case fXS: {
                if (this.fGh.gcv) {
                    float f3 = this.fXL.fN();
                    if (f3 > this.fXJ) {
                        if (this.bgC()) break;
                        this.a(a.fXT);
                        break;
                    }
                    this.a(a.fXT);
                    break;
                }
                this.a(a.fXR);
                break;
            }
            case fXT: {
                float f4 = this.fXL.fN();
                if (!(f4 > this.fXK)) break;
                if (this.fGh.gcv && this.bgC()) {
                    this.a(a.fXS);
                    break;
                }
                this.a(a.fXR);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void Ou() {
        if (this.ecU == null) {
            return;
        }
        ljq ljq2 = new ljq();
        for (int i2 = 0; i2 < this.ecU.length; ++i2) {
            if (!this.ecU[i2] || this.fXG[i2] == null) continue;
            this.l(ljq2, this.fXG[i2]);
        }
        if (this.aJz().yM(this.zg())) {
            return;
        }
        this.emI.bgQ().aJN().aK(ljq2);
    }

    private void bgB() {
        this.fXL = this.emI.bgQ().fi().ah(400);
        if (this.fXL == null) {
            return;
        }
    }

    private boolean bgC() {
        assert (this.ecU != null);
        assert (this.fXH);
        if (!this.ecU[0] || this.ecU[1]) {
            return false;
        }
        if (aqN.isDescendant(this.SkillType, cxd.fHC)) {
            return true;
        }
        if (this.ecU[2] || this.ecU[3]) {
            return false;
        }
        if (this.emI.bgQ().aJx()) {
            return false;
        }
        if (this.SkillType == cxd.fHE && this.emI.yL(cxd.fHH)) {
            return false;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        if (this.fXP) {
            this.fXP = false;
            this.fXO = d2 + 1.0;
        }
        return !(d2 <= this.fXO);
    }

    private void yD(int n2) {
        assert (n2 > 0);
        this.emI.bgQ().aJD().a(n2, this.ecU);
    }

    private void nN(int n2) {
        assert (n2 > 0);
        this.emI.bgQ().aJD().nF(n2);
    }

    private void a(a a2) {
        if (this.fXM == a2) {
            return;
        }
        if (a2 == a.fXS) {
            this.fXM = a2;
            this.yD(this.fXI);
        } else if (this.fXM == a.fXS) {
            this.fXM = a2;
            this.yD(this.SkillType);
        } else {
            this.fXM = a2;
        }
    }

    private void bgD() {
        assert (this.fXG != null);
        assert (this.ecU != null);
        assert (this.fXG.length == this.ecU.length);
        boolean[] blArray = new boolean[this.ecU.length];
        for (int i2 = 0; i2 < this.ecU.length; i2 += 2) {
            blArray[i2] = this.fXG[i2] != null && this.ecU[i2];
            boolean bl = blArray[i2 + 1] = this.fXG[i2 + 1] != null && this.ecU[i2 + 1];
            if (blArray[i2] == blArray[i2 + 1]) continue;
            this.qW = true;
            return;
        }
        this.qW = false;
    }

    public final boolean bgE() {
        return this.fXM == a.fXS;
    }

    public boolean bff() {
        return true;
    }
}

