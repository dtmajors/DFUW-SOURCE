/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  lcr
 */
public class dkf
extends dgj {
    private String gCV = null;
    private String gCW = null;
    private String gCX = null;
    private String gCY = null;
    private String gCZ = null;
    private String gDa = null;
    private String gDb = null;
    private String gDc = null;
    private boolean gDd = false;
    private ldv bbA = null;

    dkf() {
        this.gqB = 82;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        if (this.gDd) {
            if (this.bbA == null) {
                return;
            }
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
            glj2.jkV = 1;
            glj2.aUa = this.bbA;
            this.MessageDelegator.F(glj2);
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
    }

    protected int getMainEffectObjectType() {
        return 6;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.startTheSFX();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dkf dkf2 = (dkf)dgj2;
        dkf2.gCV = this.gCV;
        dkf2.gCW = this.gCW;
        dkf2.gCX = this.gCX;
        dkf2.gCY = this.gCY;
        dkf2.gCZ = this.gCZ;
        dkf2.gDa = this.gDa;
        dkf2.gDb = this.gDb;
        dkf2.gDc = this.gDc;
        dkf2.gDd = this.gDd;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gCV = null;
        this.gCW = null;
        this.gCX = null;
        this.gCY = null;
        this.gCZ = null;
        this.gDa = null;
        this.gDb = null;
        this.gDc = null;
        this.gDd = false;
    }

    private void startTheSFX() {
        int n;
        int n2;
        String[] stringArray = new String[]{this.gCV, this.gCW, this.gCX, this.gCY, this.gCZ, this.gDa, this.gDb, this.gDc};
        int n3 = 0;
        for (n2 = 0; n2 < 8 && stringArray[n2] != null && !stringArray[n2].equals("") && (n = del.dr(stringArray[n2])) > 0; ++n2) {
            ++n3;
        }
        if (n3 <= 0) {
            return;
        }
        n2 = lew.fW(0, n3);
        assert (n2 < n3);
        String string = stringArray[n2];
        this.startTheSFX(string);
    }

    private void startTheSFX(String string) {
        if (this.gDd) {
            this.bbA = !this.isRelationEffect() ? this.startGenericMainEffectReturnGUID(string, this.getTargetPosition()) : this.startGenericRelationEffectReturnGUID(string, this.getTargetPosition(), this.getTargetObjectGUID());
        } else if (!this.isRelationEffect()) {
            this.startGenericMainEffect(string, this.getTargetPosition());
        } else {
            this.startGenericRelationEffect(string, this.getTargetPosition(), this.getTargetObjectGUID());
        }
    }

    public String getSFXName_1() {
        return this.gCV;
    }

    public void setSFXName_1(String string) {
        this.gCV = string;
    }

    public String getSFXName_2() {
        return this.gCW;
    }

    public void setSFXName_2(String string) {
        this.gCW = string;
    }

    public String getSFXName_3() {
        return this.gCX;
    }

    public void setSFXName_3(String string) {
        this.gCX = string;
    }

    public String getSFXName_4() {
        return this.gCY;
    }

    public void setSFXName_4(String string) {
        this.gCY = string;
    }

    public String getSFXName_5() {
        return this.gCZ;
    }

    public void setSFXName_5(String string) {
        this.gCZ = string;
    }

    public String getSFXName_6() {
        return this.gDa;
    }

    public void setSFXName_6(String string) {
        this.gDa = string;
    }

    public String getSFXName_7() {
        return this.gDb;
    }

    public void setSFXName_7(String string) {
        this.gDb = string;
    }

    public String getSFXName_8() {
        return this.gDc;
    }

    public void setSFXName_8(String string) {
        this.gDc = string;
    }

    public boolean isRemoveSFXOnCleanUp() {
        return this.gDd;
    }

    public void setRemoveSFXOnCleanUp(boolean bl) {
        this.gDd = bl;
    }
}

