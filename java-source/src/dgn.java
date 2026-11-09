/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgn
extends dgj {
    private float grL = 1.5707964f;
    private ljq grM = null;
    private float fXV = 0.07957747f;
    private ljq grN = null;
    private float bpE = 20.0f;
    private float aSc = 1.0f;
    private int eMf = 360;
    private int eMg = 360;
    private ljq eMh = null;
    private long dKH = 0L;
    private boolean eMi = true;
    private boolean eMj = false;
    private String gnK = null;
    private dfc gry = null;
    private mgi grO = null;
    private dkx grI = null;

    dgn() {
        this.gqB = 71;
        this.gqA = Float.valueOf(-1.0f);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObject();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.setupTrajectory();
        this.createObject();
        if (this.isRelationEffect()) {
            this.grI = this.setupPositionalRelation(this.getTargetObjectGUID(), this.gry.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateObject();
    }

    protected int getMainEffectObjectType() {
        return 3;
    }

    protected void removeObject() {
        if (this.gry != null) {
            dey.bls().b(this.gry);
            this.gry = null;
        }
        this.grO = null;
    }

    private void setupTrajectory() {
        this.grO = new mgi();
        this.grO.setRadius(this.grM);
        this.grO.setMoveAngle(this.grL);
        this.grO.setSpeed(this.fXV);
    }

    protected void createObject() {
        this.gry = (dfc)dKP.Af(4);
        this.gry.setGUID(this.getMainAtomGuid());
        this.gry.setActive(true);
        this.gry.setConeOrientation(this.eMh);
        this.gry.setConeOutsideVolume(this.dKH);
        this.gry.setInsideConeAngle(this.eMf);
        this.gry.setLooping(this.eMi);
        this.gry.hO(true);
        this.gry.setMaxDistance(this.bpE);
        this.gry.setMinDistance(this.aSc);
        this.gry.setMode(0);
        this.gry.setOutsideConeAngle(this.eMg);
        this.gry.setPlayingOnce(this.eMj);
        this.gry.bi(new ljq());
        this.gry.setXMLFileName(this.gnK);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.grN);
        this.gry.bK(ljq2);
        this.gry.c(this);
        this.MessageDelegator.a(this.gry);
    }

    protected void updateObject() {
        ljq ljq2 = this.grO.ez(this.nx.rgz);
        ljq2.es(this.grN);
        if (this.grI != null) {
            this.grI.setDeltaPos(ljq2);
        } else {
            ljq2.es(this.getTargetPosition());
            this.gry.bK(ljq2);
        }
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.grL = 1.5707964f;
        this.fXV = 0.07957747f;
        this.grM = new ljq(1.0f, 1.0f, 1.0f);
        this.grN = new ljq(0.0f, 0.0f, 0.0f);
        this.bpE = 20.0f;
        this.aSc = 1.0f;
        this.eMf = 360;
        this.eMg = 360;
        this.eMh = new ljq(0.0f, 1.0f, 0.0f);
        this.dKH = 0L;
        this.eMi = true;
        this.eMj = false;
        this.gnK = "";
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgn dgn2 = (dgn)dgj2;
        dgn2.grL = this.grL;
        dgn2.fXV = this.fXV;
        dgn2.grM = this.grM;
        dgn2.grN = this.grN;
        dgn2.bpE = this.bpE;
        dgn2.aSc = this.aSc;
        dgn2.eMf = this.eMf;
        dgn2.eMg = this.eMg;
        dgn2.eMh = this.eMh;
        dgn2.dKH = this.dKH;
        dgn2.eMi = this.eMi;
        dgn2.eMj = this.eMj;
        dgn2.gnK = this.gnK;
    }

    public float getMoveAngle() {
        return this.grL;
    }

    public void setMoveAngle(float f2) {
        this.grL = f2;
    }

    public ljq getRadius() {
        return this.grM;
    }

    public void setRadius(ljq ljq2) {
        this.grM = ljq2;
    }

    public float getSpeed() {
        return this.fXV;
    }

    public void setSpeed(float f2) {
        this.fXV = f2;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public float getMaxDistance() {
        return this.bpE;
    }

    public void setMaxDistance(float f2) {
        this.bpE = f2;
    }

    public float getMinDistance() {
        return this.aSc;
    }

    public void setMinDistance(float f2) {
        this.aSc = f2;
    }

    public int getInsideConeAngle() {
        return this.eMf;
    }

    public void setInsideConeAngle(int n2) {
        this.eMf = n2;
    }

    public int getOutsideConeAngle() {
        return this.eMg;
    }

    public void setOutsideConeAngle(int n2) {
        this.eMg = n2;
    }

    public ljq getConeOrientation() {
        return this.eMh;
    }

    public void setConeOrientation(ljq ljq2) {
        this.eMh = ljq2;
    }

    public long getConeOutsideVolume() {
        return this.dKH;
    }

    public void setConeOutsideVolume(long l2) {
        this.dKH = l2;
    }

    public boolean isLooping() {
        return this.eMi;
    }

    public void setLooping(boolean bl) {
        this.eMi = bl;
    }

    public boolean isPlayingOnce() {
        return this.eMj;
    }

    public void setPlayingOnce(boolean bl) {
        this.eMj = bl;
    }

    public String getXMLFileName() {
        return this.gnK;
    }

    public void setXMLFileName(String string) {
        this.gnK = string;
    }
}

