/*
 * Decompiled with CFR.
 */
public class mgj
extends mgf {
    private ljq[] Dvq = new ljq[]{new ljq(), new ljq()};
    private float Dvs;
    private float Dvv;
    private float Dvw;
    private float Dvx;
    private float Dvy;
    private float Dvz;
    private boolean DvA;
    private float DvB;
    private float DvC;
    private boolean DvD;
    private boolean Dvp = false;
    private boolean DvE;
    private double Dvu;
    private ljq[] DvF = new ljq[]{new ljq(), new ljq(), new ljq()};

    public mgj() {
        this.setDefaultValues();
    }

    private ljq eyv() {
        ljq ljq2 = new ljq();
        ljq2.x = this.Dvq[1].x - this.Dvq[0].x;
        ljq2.y = this.Dvq[1].y - this.Dvq[0].y;
        ljq2.rlV = this.Dvq[1].rlV - this.Dvq[0].rlV;
        if (!this.DvE) {
            ljq2.reverse();
        }
        return ljq2;
    }

    private ljq eyw() {
        ljq ljq2 = this.eyv();
        ljq2.normalize();
        return ljq2;
    }

    @Override
    public ljq ez(double d2) {
        ljq ljq2;
        ljq ljq3;
        float f;
        float f2;
        ljq ljq4 = new ljq();
        if (this.Dvq[0].equals(this.Dvq[1])) {
            ljq4.ex(this.Dvq[0]);
            return ljq4;
        }
        if (!this.Dvp) {
            this.Dvp = true;
            this.DvE = true;
            this.Dvu = d2;
            this.DvF[0].ex(this.Dvq[0]);
            this.DvF[1].ex(this.Dvq[0]);
            this.DvF[2].ex(this.Dvq[0]);
            this.DvB = 0.0f;
        }
        if (d2 >= this.Dvu) {
            float f3;
            float f4;
            f2 = (float)Math.random();
            if (this.DvD) {
                f4 = this.DvC - this.Dvz * 2.0f * f2;
                f3 = this.DvC - this.Dvz * f2;
                f = lew.aj(f4, f3);
            } else {
                f4 = this.DvC + this.Dvz * f2;
                f3 = this.DvC + this.Dvz * f2 * 2.0f;
                f = lew.aj(f4, f3);
            }
            if (f > this.Dvx) {
                f = this.Dvx;
                this.DvD = true;
            } else if (f < -this.Dvx) {
                f = -this.Dvx;
                this.DvD = false;
            }
            this.DvC = f;
            f4 = lew.aj(this.Dvv, this.Dvw);
            f3 = lew.aj(-this.Dvy, this.Dvy);
            this.DvB += f4;
            ljq3 = this.DvE ? this.Dvq[0] : this.Dvq[1];
            ljq2 = this.DvE ? this.Dvq[1] : this.Dvq[0];
            ljq ljq5 = this.eyv();
            float f5 = ljq5.eqN();
            if (Math.abs(f5) < 0.001f) {
                ljq4.ex(this.Dvq[0]);
                return ljq4;
            }
            ljq5.normalize();
            if (this.DvB > f5) {
                this.DvE = !this.DvE;
                this.DvF[0] = this.DvF[1];
                this.DvF[1] = this.DvF[2];
                this.DvF[2].ex(ljq2);
                this.DvB = 0.0f;
            } else {
                ljq ljq6 = ljq.eC(ljq5);
                assert (lew.ak(ljq.u(ljq6, ljq5), 0.001f));
                ljq6.normalize();
                ljq ljq7 = ljq.w(ljq6, ljq5);
                assert (lew.ak(ljq.u(ljq7, ljq5), 0.001f));
                assert (lew.ak(ljq.u(ljq7, ljq6), 0.001f));
                float f6 = (float)(Math.cos(f3) * (double)ljq6.x + Math.sin(f3) * (double)ljq7.x);
                float f7 = (float)(Math.cos(f3) * (double)ljq6.y + Math.sin(f3) * (double)ljq7.y);
                float f8 = (float)(Math.cos(f3) * (double)ljq6.rlV + Math.sin(f3) * (double)ljq7.rlV);
                this.DvF[0] = this.DvF[1];
                this.DvF[1].ex(this.DvF[2]);
                this.DvF[2].x = ljq3.x + this.DvB * ljq5.x + f * f6;
                this.DvF[2].y = ljq3.y + this.DvB * ljq5.y + f * f7;
                this.DvF[2].rlV = ljq3.rlV + this.DvB * ljq5.rlV + f * f8;
            }
            this.Dvu = d2 + (double)this.Dvs;
        }
        f = (float)this.Dvu - this.Dvs;
        f2 = lew.A((float)(d2 - (double)f) / this.Dvs, 0.0f, 1.0f);
        if (this.DvA) {
            ljq.a(this.DvF[1], this.DvF[2], f2, ljq4);
            return ljq4;
        }
        ljq ljq8 = ljq.x(this.DvF[0], this.DvF[1]);
        ljq ljq9 = ljq.x(this.DvF[1], this.DvF[2]);
        ljq3 = new ljq();
        ljq2 = new ljq();
        ljq3.x = 0.5f * (this.DvF[1].x - this.DvF[0].x);
        ljq3.y = 0.5f * (this.DvF[1].y - this.DvF[0].y);
        ljq3.rlV = 0.5f * (this.DvF[1].rlV - this.DvF[0].rlV);
        ljq2.x = 0.5f * (this.DvF[2].x - this.DvF[1].x);
        ljq2.y = 0.5f * (this.DvF[2].y - this.DvF[1].y);
        ljq2.rlV = 0.5f * (this.DvF[2].rlV - this.DvF[1].rlV);
        ljq4.ex(ljq.a(ljq8, ljq9, ljq3, ljq2, f2));
        return ljq4;
    }

    public void setDefaultValues() {
        this.Dvq[0].x = -1.0f;
        this.Dvq[1].x = 1.0f;
        this.Dvq[1].y = 0.0f;
        this.Dvq[0].y = 0.0f;
        this.Dvs = 0.2f;
        this.Dvv = 0.1f;
        this.Dvw = 0.3f;
        this.Dvx = 0.5f;
        this.Dvy = 1.5707964f;
        this.Dvz = 0.1f;
        this.Dvp = false;
        this.DvE = true;
        this.Dvu = -1.0;
        this.DvC = 0.0f;
        this.DvD = true;
        this.DvA = false;
    }

    public void eyx() {
        this.DvA = true;
    }

    public void eyy() {
        this.DvA = false;
    }

    public void setLinearInterpolation(boolean bl) {
        this.DvA = bl;
    }

    public void C(ljq ljq2, ljq ljq3) {
        this.Dvq[0] = ljq2;
        this.Dvq[1] = ljq3;
    }

    public void eP(ljq ljq2) {
        this.Dvq[0] = ljq2;
    }

    public void setPoint1(ljq ljq2) {
        this.Dvq[1] = ljq2;
    }

    public void setSpeed(float f) {
        this.Dvs = f;
    }

    public void setStepLengthMin(float f) {
        this.Dvv = f;
    }

    public void setStepLengthMax(float f) {
        this.Dvw = f;
    }

    public void setRadius(float f) {
        this.Dvx = f;
        this.DvC = 0.0f;
    }

    public void setMaxTurnAngle(float f) {
        this.Dvy = f;
    }

    public void setMaxRadiusDelta(float f) {
        this.Dvz = f;
    }

    public ljq eyz() {
        return new ljq(this.Dvq[0]);
    }

    public ljq getPoint1() {
        return new ljq(this.Dvq[1]);
    }

    public ljq eyA() {
        return this.Dvq[0];
    }

    public ljq eyB() {
        return this.Dvq[1];
    }

    public boolean eyC() {
        return this.DvE;
    }
}

