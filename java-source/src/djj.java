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
public class djj
extends dgj {
    private dfp gBv = null;
    private ljq gsF = null;
    private float gBJ = 2.0f;
    private float gBC = 1.0f;
    private boolean gBK = false;

    djj() {
        this.gqB = 89;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeForceField();
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
        djj djj2 = (djj)dgj2;
        djj2.gsF = this.gsF;
        djj2.gBJ = this.gBJ;
        djj2.gBC = this.gBC;
        djj2.gBK = this.gBK;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gsF = new ljq();
        this.gBJ = 2.0f;
        this.gBC = 1.0f;
        this.gBK = false;
    }

    protected void createForceField() {
        Object object;
        assert (this.getTargetPosition() != null);
        dta dta2 = this.MessageDelegator.bzx().bzt().od(lcr.qzp);
        if (dta2 == null) {
            lfn.b(5, "SFSpecialEffectPhysicsSphereForce", "createForceField() : system os is null");
            return;
        }
        if (!(dta2 instanceof dtn)) {
            lfn.b(5, "SFSpecialEffectPhysicsSphereForce", "createForceField() : os is not system");
            return;
        }
        dtn dtn2 = (dtn)dta2;
        if (dtn2.bAn() == null) {
            lfn.b(5, "SFSpecialEffectPhysicsSphereForce", "createForceField() :client info is null ");
            return;
        }
        if (dtn2.bAn().gYZ == null) {
            return;
        }
        if (dtn2.bAn().gYZ.equals(this.getTargetObjectGUID()) && this.gBK) {
            return;
        }
        float f = 1.0f;
        if (dtn2.bzt() != null && (object = dtn2.bzt().d(dtn2.bAn().gYZ)) instanceof bvi) {
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
                this.gBC *= f;
            }
        }
        this.gBv = (dfp)dKP.Af(26);
        this.gBv.setGUID(this.getMainAtomGuid());
        this.gBv.setActive(true);
        this.gBv.setDefaultValues();
        this.gBv.setRadialAcceleration(this.gBC);
        this.gBv.Ah(32);
        object = new lhl();
        ((lhl)object).mZ = new ljq(this.gsF);
        if (this.getTargetPosition() != null) {
            ((lhl)object).mZ.es(this.getTargetPosition());
        } else assert (false);
        ((lhl)object).Radius = this.gBJ;
        this.gBv.a((lhl)object);
        this.MessageDelegator.a(this.gBv);
    }

    protected void removeForceField() {
        if (this.gBv != null) {
            dey.bls().b(this.gBv);
            this.gBv = null;
        }
    }

    public final ljq getTargetPositionOffset() {
        return this.gsF;
    }

    public final void setTargetPositionOffset(ljq ljq2) {
        this.gsF = ljq2;
    }

    public final float getSphereRadius() {
        return this.gBJ;
    }

    public final void setSphereRadius(float f) {
        this.gBJ = f;
    }

    public final float getRadialAcceleration() {
        return this.gBC;
    }

    public final void setRadialAcceleration(float f) {
        this.gBC = f;
    }

    public final boolean isIgnoreSourcePlayer() {
        return this.gBK;
    }

    public final void setIgnoreSourcePlayer(boolean bl) {
        this.gBK = bl;
    }
}

