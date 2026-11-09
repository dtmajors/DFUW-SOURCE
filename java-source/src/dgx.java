/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgx
extends dgj {
    private ljq gtC = null;
    private boolean gpD = false;

    public dgx() {
        this.gqB = 94;
    }

    public void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (this.gqP == null) {
            return;
        }
        if (!this.gqP.isRelationEffect()) {
            ljq ljq2 = this.gqP.getTargetPosition().esF();
            ljq2.es(this.gtC);
            this.gqP.setTargetPosition(ljq2);
            this.gpD = true;
        } else {
            this.gqP.setDeltaPos(this.gtC);
        }
    }

    public void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    public void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgx dgx2 = (dgx)dgj2;
        dgx2.setOffsetPos(this.gtC.esF());
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.setInheritDuration(true);
        this.gtC = new ljq();
    }

    public void setOffsetPos(ljq ljq2) {
        this.gtC = ljq2;
    }

    public ljq getOffsetPos() {
        return this.gtC;
    }
}

