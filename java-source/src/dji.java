/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  dgj
 *  dta
 *  dtn
 *  lcr
 */
public class dji
extends dgj {
    private dfp gBv = null;
    private boolean gBD = true;
    private float gBE = 0.1f;
    private boolean gBF = false;
    private float gBG = 1.0f;
    private float gBH = 1.0f;
    private float gBI = 1.0f;

    dji() {
        this.gqB = 69;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeForceField();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createForceField();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dji dji2 = (dji)dgj2;
        dji2.gBD = this.gBD;
        dji2.gBE = this.gBE;
        dji2.gBF = this.gBF;
        dji2.gBG = this.gBG;
        dji2.gBI = this.gBI;
        dji2.gBH = this.gBH;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gBD = true;
        this.gBE = 0.1f;
        this.gBF = false;
        this.gBG = 1.0f;
        this.gBI = 1.0f;
        this.gBH = 1.0f;
    }

    private void createForceField() {
        Object object;
        ljq ljq2;
        assert (this.getSourcePosition() != null);
        float f = 1.0f;
        dta dta2 = this.MessageDelegator.bzx().bzt().od(lcr.qzp);
        if (dta2 != null && dta2 instanceof dtn && (ljq2 = (dtn)dta2).bzt() != null && ljq2.bAn() != null && (object = ljq2.bzt().d(ljq2.bAn().gYZ)) instanceof bvi) {
            bvi bvi2 = (bvi)((Object)object);
            cbx cbx2 = bvi2.aze();
            if (cbx2 == null) {
                return;
            }
            boolean bl = cbx2.aIq();
            boolean bl2 = cbx2.km(this.aZG);
            if (bl && !bl2) {
                return;
            }
            if (cbx2.fi() != null) {
                boolean bl3 = cbx2.fi().ag(12688);
                if (bl3) {
                    return;
                }
                f = 1.0f - cbx2.fi().al(13264);
                if (f == 0.0f) {
                    return;
                }
            }
        }
        ljq2 = this.createDirection();
        this.gBI *= f;
        object = this.createOBB3Box(new ljq(ljq2));
        this.gBv = (dfp)dKP.Af(26);
        this.gBv.setGUID(this.getMainAtomGuid());
        this.gBv.setActive(true);
        this.gBv.setDefaultValues();
        this.gBv.setDirectionalAcceleration(this.gBI);
        this.gBv.setForceDirection(ljq2);
        this.gBv.Ah(16);
        this.gBv.a((lfh)object);
        this.MessageDelegator.a(this.gBv);
    }

    private ljq createDirection() {
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.et(this.getSourcePosition());
        ljq2.normalize();
        if (this.gBF) {
            ljq2.nm(-1.0f);
            ljq2.normalize();
        }
        if (this.gBD) {
            ljq2.y = 0.0f;
            ljq2.normalize();
            ljq2.y = this.gBE;
            ljq2.normalize();
        }
        if ((double)ljq2.eqN() < 1.0E-5) {
            ljq2 = new ljq(0.0f, 1.0f, 0.0f);
        }
        return ljq2;
    }

    private lfh createOBB3Box(ljq ljq2) {
        assert (this.getSourcePosition() != null);
        lfh lfh2 = new lfh();
        lfh2.mZ = new ljq(this.getTargetPosition());
        lfh2.rkf = new ljq(1.0f, 0.0f, 0.0f);
        lfh2.rkg = new ljq(0.0f, 1.0f, 0.0f);
        lfh2.rkh = new ljq(0.0f, 0.0f, 1.0f);
        ljq2.nm(this.gBG);
        ljq ljq3 = new ljq(1.0f, 1.0f, 1.0f);
        ljq3.nm(this.gBH);
        ljq2.es(ljq3);
        lfh2.rki = ljq3;
        return lfh2;
    }

    private void removeForceField() {
        if (this.gBv != null) {
            dey.bls().b(this.gBv);
            this.gBv = null;
        }
    }

    public boolean isCapForceToXZPlane() {
        return this.gBD;
    }

    public void setCapForceToXZPlane(boolean bl) {
        this.gBD = bl;
    }

    public float getCapForceToXZPlaneYElevation() {
        return this.gBE;
    }

    public void setCapForceToXZPlaneYElevation(float f) {
        this.gBE = f;
    }

    public boolean isAttractForce() {
        return this.gBF;
    }

    public void setAttractForce(boolean bl) {
        this.gBF = bl;
    }

    public float getForceDirectionScale() {
        return this.gBG;
    }

    public void setForceDirectionScale(float f) {
        this.gBG = f;
    }

    public float getForceAcceleration() {
        return this.gBI;
    }

    public void setForceAcceleration(float f) {
        this.gBI = f;
    }

    public float getUnitBoxScale() {
        return this.gBH;
    }

    public void setUnitBoxScale(float f) {
        this.gBH = f;
    }
}

