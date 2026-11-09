/*
 * Decompiled with CFR.
 */
public class mgi
extends mgf {
    private boolean Dvp;
    private ljq[] Dvq = new ljq[]{new ljq(), new ljq(), new ljq()};
    private ljq[] Dvr = new ljq[]{new ljq(), new ljq()};
    private ljq Dvi = new ljq();
    private float Dvs;
    private float Dvt;
    private double Dvu;

    public mgi() {
        this.setDefaultValues();
        this.Dvp = false;
    }

    @Override
    public ljq ez(double d2) {
        if (!this.Dvp) {
            this.Dvp = true;
            this.Dvu = d2 + 1.0E-4;
            this.Dvq[1] = this.Dvq[2] = ljq.esL();
            this.Dvq[0] = this.Dvq[2];
        }
        if (d2 >= this.Dvu) {
            while (d2 >= this.Dvu) {
                this.Dvu += (double)this.Dvs;
            }
            this.Dvq[0] = this.Dvq[1];
            this.Dvq[1] = this.Dvq[2];
            this.Dvq[2] = ljq.C(this.Dvq[2], this.Dvt);
            this.Dvr[0] = this.Dvr[1];
            this.Dvr[1] = ljq.e(this.Dvq[1], this.Dvq[2], 0.5f);
        }
        float f = lew.A(1.0f - (float)(this.Dvu - d2) / this.Dvs, 0.0f, 1.0f);
        ljq ljq2 = ljq.c(this.Dvr[0], this.Dvq[1], this.Dvr[1], f);
        ljq2.normalize();
        ljq2.x *= this.Dvi.x;
        ljq2.y *= this.Dvi.y;
        ljq2.rlV *= this.Dvi.rlV;
        return ljq2;
    }

    public void setDefaultValues() {
        this.Dvq[2].x = 1.0f;
        this.Dvq[1].x = 1.0f;
        this.Dvq[0].x = 1.0f;
        this.Dvq[2].y = 0.0f;
        this.Dvq[1].y = 0.0f;
        this.Dvq[0].y = 0.0f;
        this.Dvq[2].rlV = 0.0f;
        this.Dvq[1].rlV = 0.0f;
        this.Dvq[0].rlV = 0.0f;
        this.Dvi.rlV = 1.0f;
        this.Dvi.y = 1.0f;
        this.Dvi.x = 1.0f;
        this.Dvi.y = 0.5f;
        this.Dvi.x = 0.5f;
        this.Dvt = 1.5707964f;
        this.Dvs = 0.07957747f;
    }

    public void setMoveAngle(float f) {
        this.Dvt = f;
    }

    public void K(float f, float f2, float f3) {
        this.Dvi.x = f;
        this.Dvi.y = f2;
        this.Dvi.rlV = f3;
    }

    public void setRadius(ljq ljq2) {
        this.Dvi = ljq2;
    }

    public void setSpeed(float f) {
        this.Dvs = f;
    }
}

