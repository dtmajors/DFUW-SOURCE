/*
 * Decompiled with CFR.
 */
public class cmx
extends cmw {
    float[] eMY = new float[8];
    private static final int eMZ = 7;
    private static final float eNa = 0.33333334f;
    private gkg eNb = null;
    private static final float eNc = 2.0f;
    private static final float eNd = 0.5f;
    private int eNe = 0;

    public cmx() {
        super(false);
    }

    public void initialize() {
        super.initialize();
    }

    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.aAG() != null && this.aAG().ayZ()) {
            this.aTV();
        }
    }

    protected void aIw() {
        super.aIw();
        this.aTW();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26120: {
                this.a((gkg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gkg gkg2) {
        this.eNb = gkg2;
        this.oM(del.gjr);
    }

    private int rO(int n) {
        assert (this.eNb != null);
        if (this.eNb == null) {
            return 0;
        }
        switch (n) {
            case 0: {
                return this.eNb.jjP;
            }
            case 1: {
                return this.eNb.jjQ;
            }
            case 2: {
                return this.eNb.jjR;
            }
        }
        assert (false);
        return 0;
    }

    private int rP(int n) {
        ew ew2 = null;
        switch (n) {
            case 0: {
                ew2 = this.fi().ao(10544);
                if (ew2 == null) break;
                return ew2.fQ();
            }
            case 1: {
                ew2 = this.fi().ao(10560);
                if (ew2 == null) break;
                return ew2.fQ();
            }
            case 2: {
                ew2 = this.fi().ao(10576);
                if (ew2 == null) break;
                return ew2.fQ();
            }
            default: {
                assert (false);
                return 0;
            }
        }
        assert (false);
        return 0;
    }

    private void aTV() {
        if (this.eNb != null) {
            float f2 = (float)((this.MessageDelegator.arc().rgz - this.eNb.oV) / this.eNb.eKm);
            if (f2 < 1.0f) {
                f2 = lew.A(f2, 0.0f, 1.0f);
                for (int i = 0; i < 3; ++i) {
                    if (!(f2 >= 0.33333334f * (float)i) || !(f2 < 0.33333334f * (float)(i + 1))) continue;
                    while (this.eNe < i) {
                        this.rQ(this.eNe);
                        ++this.eNe;
                    }
                    this.eNe = i;
                    float f3 = (f2 - 0.33333334f * (float)i) / 0.33333334f;
                    f3 = lew.A(f3, 0.0f, 1.0f);
                    int n = this.rP(i);
                    int n2 = this.rO(i);
                    float f4 = (float)n / 8.0f;
                    float f5 = (float)n2 / 8.0f;
                    this.v(i, this.m(f4, f5, f3));
                }
            } else {
                this.rQ(2);
                if (this.eNb.jjP == this.eNb.jjQ && this.eNb.jjP == this.eNb.jjR) {
                    this.oM(del.gjs);
                }
                this.eNe = 0;
                this.eNb = null;
            }
        }
    }

    private void rQ(int n) {
        assert (this.eNb != null);
        if (this.eNb == null) {
            return;
        }
        assert (n >= 0 && n < 3);
        switch (n) {
            case 0: {
                this.bc(this.eNb.jjP, 0);
                this.oM(del.gjt);
                break;
            }
            case 1: {
                this.bc(this.eNb.jjQ, 1);
                this.oM(del.gju);
                break;
            }
            case 2: {
                this.bc(this.eNb.jjR, 2);
                this.oM(del.gjv);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private float m(float f2, float f3, float f4) {
        float f5;
        if (f2 > f3) {
            f3 += 1.0f;
        }
        if ((f5 = Math.abs(f3 - f2)) < 1.0f) {
            f3 += 1.0f;
        }
        float f6 = lew.o(f2, f3, f4);
        f6 -= (float)Math.floor(f6);
        return f6;
    }

    public void c(ew ew2, int n) {
        super.c(ew2, n);
        if (ew2.getType() == 10544) {
            this.bc(ew2.fQ(), 0);
            if (this.eNb != null) assert (this.eNb.jjP == ew2.fQ());
            this.eNb = null;
            this.eNe = 0;
        } else if (ew2.getType() == 10560) {
            this.bc(ew2.fQ(), 1);
            if (this.eNb != null) assert (this.eNb.jjQ == ew2.fQ());
            this.eNb = null;
            this.eNe = 0;
        } else if (ew2.getType() == 10576) {
            this.bc(ew2.fQ(), 2);
            if (this.eNb != null) assert (this.eNb.jjR == ew2.fQ());
            this.eNb = null;
            this.eNe = 0;
        }
    }

    private void aTW() {
        ew ew2 = this.fi().ao(10544);
        if (ew2 != null) {
            this.bc(ew2.fQ(), 0);
        }
        if ((ew2 = this.fi().ao(10560)) != null) {
            this.bc(ew2.fQ(), 1);
        }
        if ((ew2 = this.fi().ao(10576)) != null) {
            this.bc(ew2.fQ(), 2);
        }
    }

    private void bc(int n, int n2) {
        float f2 = (float)n / 8.0f;
        this.v(n2, f2);
    }

    private void v(int n, float f2) {
        switch (n) {
            case 0: {
                n = 2;
                break;
            }
            case 1: {
                n = 0;
                break;
            }
            case 2: {
                n = 1;
            }
        }
        kps kps2 = (kps)this.MessageDelegator.h(3589);
        kps2.jM(false);
        kps2.wD(false);
        kps2.hC(this.aAG().axa());
        kps2.ts(this.getGUID());
        kps2.aam(32);
        kps2.f(new ljr(0.0f, f2, 0.0f, 0.0f));
        kps2.aan(7 + n);
        kps2.eA(0);
        this.MessageDelegator.a(kps2);
    }

    private float rR(int n) {
        return 0.125f * (float)n;
    }
}

