/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class dfp
extends dey {
    private kmf goV = null;

    dfp() {
        this.gnv = 26;
        this.ObjectType = cug.fmY;
        this.goV = (kmf)gnw.h(3340);
        this.goV.wD(false);
        this.goV.jM(false);
        this.goV.dsK = false;
        this.goV.Active = true;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bmD();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.bmE();
            }
            this.CleanedUp = true;
        }
    }

    private void bmD() {
        this.goV.ts(this.getGUID());
        this.goV.hC(this.getGUID());
        this.goV.pMp |= 1;
        kmf kmf2 = (kmf)gnw.h(3340);
        kmf2.a(this.goV);
        kmf2.pMp |= 1;
        this.MessageDelegator.a(kmf2);
    }

    private void bmE() {
        this.goV.pMp = 2;
        this.MessageDelegator.a(this.goV);
    }

    public void setDirectionalAcceleration(float f2) {
        this.goV.gBB = f2;
    }

    public float getDirectionalAcceleration() {
        return this.goV.gBB;
    }

    public void setRadialAcceleration(float f2) {
        this.goV.gBC = f2;
    }

    public float getRadialAcceleration() {
        return this.goV.gBC;
    }

    public void setForceDirection(ljq ljq2) {
        this.goV.gBw = ljq2;
    }

    public ljq getForceDirection() {
        return this.goV.gBw;
    }

    public void a(lcv lcv2) {
        this.goV.pMq = lcv2;
    }

    public lcv bmF() {
        return this.goV.pMq;
    }

    public void a(lhl lhl2) {
        this.goV.pMs = lhl2;
    }

    public lhl bmG() {
        return this.goV.pMs;
    }

    public void a(lfh lfh2) {
        this.goV.pMr = lfh2;
    }

    public lfh bmH() {
        return this.goV.pMr;
    }

    public void Ah(int n2) {
        this.goV.pMp = n2;
    }
}

