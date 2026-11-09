/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dkg
extends dgj {
    private String gCv = null;
    private int gDe = 0;

    dkg() {
        this.gqB = 88;
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (!dhk.Am(this.gDe)) {
            return;
        }
        this.startGenericMainEffect(this.gCv, this.getTargetPosition());
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkg dkg2 = (dkg)dgj2;
        dkg2.gCv = this.gCv;
        dkg2.gDe = this.gDe;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gCv = "";
        this.gDe = 0;
    }

    public String getNewSpecialEffectName() {
        return this.gCv;
    }

    public void setNewSpecialEffectName(String string) {
        this.gCv = string;
    }

    public int getSpecialEffectFlag() {
        return this.gDe;
    }

    public void setSpecialEffectFlag(int n) {
        this.gDe = n;
    }
}

