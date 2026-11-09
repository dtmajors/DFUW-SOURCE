/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class djy
extends dgj {
    dfc gry = null;
    private float bpE = 0.0f;
    private float aSc = 0.0f;
    private int eMf = 360;
    private int eMg = 360;
    private ljq eMh = null;
    private long dKH = 0L;
    private boolean eMi = true;
    private boolean eMj = false;
    private String gnK = null;

    djy() {
        this.gqB = 10;
        this.gqA = Float.valueOf(-1.0f);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeAudio();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected int getMainEffectObjectType() {
        return 3;
    }

    protected void superInitializeSpecialEffect() {
        super.initializeSpecialEffect();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.gry = this.createAudio(this.gnK);
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gry.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djy djy2 = (djy)dgj2;
        djy2.bpE = this.bpE;
        djy2.aSc = this.aSc;
        djy2.eMf = this.eMf;
        djy2.eMg = this.eMg;
        djy2.eMh = this.eMh;
        djy2.dKH = this.dKH;
        djy2.eMi = this.eMi;
        djy2.eMj = this.eMj;
        djy2.gnK = this.gnK;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.bpE = 100.0f;
        this.aSc = 0.0f;
        this.eMf = 360;
        this.eMg = 360;
        this.eMh = new ljq(0.0f, 1.0f, 0.0f);
        this.dKH = 0L;
        this.eMi = true;
        this.eMj = false;
        this.gnK = null;
    }

    protected dfc createAudio(String string) {
        return this.createAudio(string, this.getMainAtomGuid());
    }

    protected dfc createAudio(String string, ldv ldv2) {
        dfc dfc2 = null;
        dfc2 = (dfc)dKP.Af(4);
        dfc2.setGUID(ldv2);
        dfc2.setActive(true);
        dfc2.setConeOrientation(this.eMh);
        dfc2.setConeOutsideVolume(this.dKH);
        dfc2.setInsideConeAngle(this.eMf);
        dfc2.setLooping(this.eMi);
        dfc2.hO(false);
        dfc2.setMaxDistance(this.bpE);
        dfc2.setMinDistance(this.aSc);
        dfc2.setMode(0);
        dfc2.setOutsideConeAngle(this.eMg);
        dfc2.setPlayingOnce(this.eMj);
        dfc2.bi(new ljq());
        dfc2.setXMLFileName(string);
        if (this.getTargetPosition() != null) {
            dfc2.bK(this.getTargetPosition());
        } else {
            dfc2.bK(new ljq());
        }
        dfc2.c(this);
        this.MessageDelegator.a(dfc2);
        return dfc2;
    }

    public void setEnabled(boolean bl) {
        if (this.avz == bl) {
            return;
        }
        this.avz = bl;
        if (!this.dwG && this.avz) {
            this.play();
        }
    }

    protected void removeAudio() {
        if (this.gry == null) {
            return;
        }
        dey.bls().b(this.gry);
        this.gry = null;
    }

    public void play() {
        if (this.gry != null) {
            this.gry.play();
        }
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

    public void setConeOutsideVolume(long l) {
        this.dKH = l;
    }

    public int getInsideConeAngle() {
        return this.eMf;
    }

    public void setInsideConeAngle(int n) {
        this.eMf = n;
    }

    public boolean isLooping() {
        return this.eMi;
    }

    public void setLooping(boolean bl) {
        this.eMi = bl;
    }

    public float getMaxDistance() {
        return this.bpE;
    }

    public void setMaxDistance(float f) {
        this.bpE = f;
    }

    public float getMinDistance() {
        return this.aSc;
    }

    public void setMinDistance(float f) {
        this.aSc = f;
    }

    public int getOutsideConeAngle() {
        return this.eMg;
    }

    public void setOutsideConeAngle(int n) {
        this.eMg = n;
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

    public dey getAtom(int n) {
        return this.gry;
    }

    public int getAtomCount() {
        return 1;
    }
}

