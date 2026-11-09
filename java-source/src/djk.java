/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  lkv
 */
public class djk
extends dgj {
    protected String gBL = "normal_idle";

    public djk() {
        this.gqB = 105;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djk djk2 = (djk)dgj2;
        djk2.gBL = this.gBL;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (this.akX == null) {
            return;
        }
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.akX);
        dzv2.dTs = lkv.AG((String)this.gBL);
        this.MessageDelegator.I(dzv2);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        if (this.akX == null) {
            return;
        }
        dzw dzw2 = (dzw)this.MessageDelegator.h(7426, this.GUID, this.akX);
        dzw2.ijH = lkv.AG((String)this.gBL);
        this.MessageDelegator.I(dzw2);
    }

    public String getAnimationState() {
        return this.gBL;
    }

    public void setAnimationState(String string) {
        this.gBL = string;
    }
}

