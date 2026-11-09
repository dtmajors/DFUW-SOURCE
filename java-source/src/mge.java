/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mge {
    private int gwX = 10;
    private float dKD = 1.0f;
    private List<ljq> Dvb = null;
    private boolean gwy = true;
    private boolean gwz = true;
    private boolean gwP = true;
    private boolean gwJ = false;
    private ljq mz = null;

    public void eyl() {
        this.eym();
    }

    public void updatePoints() {
        this.eyn();
    }

    private ljq bpa() {
        ljq ljq2 = new ljq(this.mz);
        ljq2.normalize();
        return ljq2;
    }

    private void eym() {
        ljq ljq2;
        assert (this.mz != null);
        this.Dvb = lcn.abH(this.gwX);
        ljq ljq3 = this.bpa();
        float f = this.mz.eqN();
        float f2 = f / (float)this.gwX;
        double d2 = Math.PI / (double)this.gwX;
        for (int i = 0; i < this.gwX; ++i) {
            float f3;
            ljq2 = new ljq(ljq3);
            ljq2.nm((float)i * f2);
            if (this.gwy) {
                f3 = lew.eqr();
                ljq2.y += f3 * this.dKD;
            }
            if (this.gwz) {
                f3 = lew.eqr();
                ljq2.x += f3 * this.dKD;
            }
            if (this.gwP) {
                f3 = lew.eqr();
                ljq2.rlV += f3 * this.dKD;
            }
            this.Dvb.add(ljq2);
        }
        ljq ljq4 = this.Dvb.get(0);
        ljq4.y = 0.0f;
        ljq4.rlV = 0.0f;
        ljq4.x = 0.0f;
        ljq2 = this.Dvb.get(this.gwX - 1);
        ljq2.x = this.mz.x;
        ljq2.y = this.mz.y;
        ljq2.rlV = this.mz.rlV;
    }

    private void eyn() {
        ljq ljq2;
        ljq ljq3 = this.bpa();
        float f = this.mz.eqN();
        float f2 = f / (float)this.gwX;
        for (int i = 1; i < this.gwX - 1; ++i) {
            float f3;
            ljq2 = this.Dvb.get(i);
            ljq ljq4 = new ljq(ljq3);
            ljq4.nm((float)i * f2);
            if (this.gwy) {
                f3 = lew.eqr();
                ljq4.y += f3 * this.dKD;
            }
            if (this.gwz) {
                f3 = lew.eqr();
                ljq4.x += f3 * this.dKD;
            }
            if (this.gwP) {
                f3 = lew.eqr();
                ljq4.rlV += f3 * this.dKD;
            }
            ljq2.x = ljq4.x;
            ljq2.y = ljq4.y;
            ljq2.rlV = ljq4.rlV;
        }
        ljq ljq5 = this.Dvb.get(this.gwX - 1);
        ljq5.x = this.mz.x;
        ljq5.y = this.mz.y;
        ljq5.rlV = this.mz.rlV;
        ljq5 = this.Dvb.get(this.gwX - 2);
        ljq5.x = this.mz.x;
        ljq5.y = this.mz.y;
        ljq5.rlV = this.mz.rlV;
        if (this.gwJ) {
            ljq2 = this.Dvb.get(this.gwX - 1);
            if (this.gwy) {
                float f4 = lew.eqr();
                ljq2.y += f4 * this.dKD;
            }
            if (this.gwz) {
                float f5 = lew.eqr();
                ljq2.x += f5 * this.dKD;
            }
            if (this.gwP) {
                float f6 = lew.eqr();
                ljq2.rlV += f6 * this.dKD;
            }
            ljq2 = this.Dvb.get(this.gwX - 2);
            if (this.gwy) {
                float f7 = lew.eqr();
                ljq2.y += f7 * this.dKD;
            }
            if (this.gwz) {
                float f8 = lew.eqr();
                ljq2.x += f8 * this.dKD;
            }
            if (this.gwP) {
                float f9 = lew.eqr();
                ljq2.rlV += f9 * this.dKD;
            }
        }
    }

    public int getMaxNumBranchPoints() {
        return this.gwX;
    }

    public void setMaxNumBranchPoints(int n) {
        this.gwX = n;
    }

    public float getMaxRadius() {
        return this.dKD;
    }

    public void setMaxRadius(float f) {
        this.dKD = f;
    }

    public List<ljq> eyo() {
        return this.Dvb;
    }

    public void cf(List<ljq> list) {
        this.Dvb = list;
    }

    public boolean isYAxisDeviation() {
        return this.gwy;
    }

    public void setYAxisDeviation(boolean bl) {
        this.gwy = bl;
    }

    public boolean isXAxisDeviation() {
        return this.gwz;
    }

    public void setXAxisDeviation(boolean bl) {
        this.gwz = bl;
    }

    public boolean isZAxisDeviation() {
        return this.gwP;
    }

    public void setZAxisDeviation(boolean bl) {
        this.gwP = bl;
    }

    public boolean isAnimateEndPoint() {
        return this.gwJ;
    }

    public void setAnimateEndPoint(boolean bl) {
        this.gwJ = bl;
    }

    public ljq eyt() {
        return this.mz;
    }

    public void eN(ljq ljq2) {
        this.mz = ljq2;
    }
}

