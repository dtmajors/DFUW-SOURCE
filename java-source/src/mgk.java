/*
 * Decompiled with CFR.
 */
public class mgk
extends mgf {
    private float gwm;
    private float gwn;
    private float gwo;
    private float gwp;
    private float gwq;
    public static final int DvG = 0;
    public static final int DvH = 1;
    public static final int DvI = 2;
    private int gwr = 0;

    public mgk() {
        this.setDefaultValues();
    }

    public void setDefaultValues() {
        this.gwm = 1.0f;
        this.gwn = 1.0f;
        this.gwo = 1.0f;
        this.gwp = 1.0f;
        this.gwq = 1.0f;
    }

    private ljq eA(double d2) {
        float f = this.gwm * (float)Math.abs(Math.sin((d2 *= (double)((float)(Math.PI * 2 / (double)this.gwo))) * (double)this.gwp * 0.5));
        float f2 = this.gwn * (float)Math.abs(Math.sin(d2 * (double)this.gwq * 0.5));
        ljq ljq2 = new ljq();
        ljq2.x = (float)Math.cos(d2) * f;
        ljq2.y = 0.0f;
        ljq2.rlV = (float)Math.sin(d2) * f2;
        return ljq2;
    }

    @Override
    public ljq ez(double d2) {
        ljq ljq2 = this.eA(d2);
        if (this.gwr == 1) {
            ljq2.y = ljq2.rlV;
            ljq2.rlV = 0.0f;
        } else if (this.gwr == 2) {
            ljq2.y = ljq2.x;
            ljq2.x = 0.0f;
        }
        return ljq2;
    }

    public float getRadius_1() {
        return this.gwm;
    }

    public void setRadius_1(float f) {
        this.gwm = f;
    }

    public float getRadius_2() {
        return this.gwn;
    }

    public void setRadius_2(float f) {
        this.gwn = f;
    }

    public float getTimeOfOneRevolution() {
        return this.gwo;
    }

    public void setTimeOfOneRevolution(float f) {
        this.gwo = f;
    }

    public float getSpiralFrequency_1() {
        return this.gwp;
    }

    public void setSpiralFrequency_1(float f) {
        this.gwp = f;
    }

    public float getSpiralFrequency_2() {
        return this.gwq;
    }

    public void setSpiralFrequency_2(float f) {
        this.gwq = f;
    }

    public int getTrajectoryPlane() {
        return this.gwr;
    }

    public void setTrajectoryPlane(int n) {
        this.gwr = n;
    }
}

