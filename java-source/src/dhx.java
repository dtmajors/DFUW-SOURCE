/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.List;

public class dhx
extends dgj {
    private dfk gws = null;
    private float dum = 1.0f;
    private int gwA = 10;
    private List gwR = null;
    private float gwS = 1.0f;
    private boolean gwF = false;
    private lcq gwT = null;
    private boolean gwH = true;
    private String fFC = "";
    private boolean gwI = false;
    private ljq Position = null;
    private lgl Rotation = null;

    dhx() {
        this.gqB = 6;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObjects();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateObjects();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.createObjects();
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gws.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhx dhx2 = (dhx)dgj2;
    }

    protected void createObjects() {
    }

    protected void removeObjects() {
        if (this.gws != null) {
            dey.bls().b(this.gws);
            this.gws = null;
        }
    }

    protected void updateObjects() {
    }
}

