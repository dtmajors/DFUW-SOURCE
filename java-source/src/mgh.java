/*
 * Decompiled with CFR.
 */
public class mgh
extends mgf {
    private float Dvl;
    private float Dvm;
    private float Dvn;
    private lgl gED = null;
    private ljq Dvo = new ljq(0.0f, 0.0f, -1.0f);

    public mgh() {
        this.setDefaultValues();
    }

    private ljq eA(double d2) {
        ljq ljq2 = new ljq(this.Dvl, 0.0f, 0.0f);
        ljq ljq3 = new ljq(0.0f, 0.0f, this.Dvm);
        ljq ljq4 = new ljq();
        ljq4.x = (float)(Math.cos(d2 *= (double)((float)(Math.PI * 2 / (double)this.Dvn))) * (double)ljq2.x + Math.sin(d2) * (double)ljq3.x);
        ljq4.y = 0.0f;
        ljq4.rlV = (float)(Math.cos(d2) * (double)ljq2.rlV + Math.sin(d2) * (double)ljq3.rlV);
        return ljq4;
    }

    @Override
    public ljq ez(double d2) {
        ljq ljq2 = this.eA(d2);
        ljq ljq3 = new ljq();
        ljq3.x = ljq2.rlV;
        ljq3.y = 0.0f;
        ljq3.rlV = -ljq2.x;
        ljq3.normalize();
        this.gED = lgl.q(this.Dvo, ljq3);
        this.gED.normalize();
        return ljq2;
    }

    public void setDefaultValues() {
        this.Dvl = 1.0f;
        this.Dvm = 2.0f;
        this.Dvn = 2.0f;
    }

    public void og(float f) {
        this.Dvl = f;
    }

    public void hp(float f) {
        this.Dvm = f;
    }

    public void setTimeOfOneRevolution(float f) {
        this.Dvn = f;
    }

    public lgl Bd() {
        return this.gED;
    }

    public ljq eyu() {
        return this.Dvo;
    }

    public void eO(ljq ljq2) {
        this.Dvo = ljq2;
    }
}

