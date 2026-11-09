/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class diq
extends dip {
    private ljq goo = null;
    private String gAl = "";
    private String gAm = "";
    private float gAn = 0.5f;
    private float bqb = 15.0f;
    private float gAo = 1.0f;
    private float gAp = 1.0f;
    private String gAq = "";
    private String gAr = "";
    private String gAs = "";
    private String gAt = "";
    private String gAu = "";
    private String gAv = "";
    private String gAw = "";

    public diq() {
        this.gqB = 91;
    }

    @Override
    public void initializeSpecialEffect() {
        if (this.gAo != 0.0f && this.gAp != 0.0f) {
            lgl lgl2 = this.getSourceRotation();
            if (lgl2 == null) {
                lgl2 = new lgl(0.0f, 0.0f, 0.0f, 1.0f);
                lgl2.F(-1.57f, 0.0f, 0.0f);
                this.setSourceRotation(lgl2);
            }
            ljq ljq2 = lgl2.eqT();
            float f2 = ((float)Math.random() - 0.5f) * this.gAo;
            float f3 = ((float)Math.random() - 0.5f) * this.gAp;
            ljq2.x += f2;
            ljq2.y += f3;
            lgl lgl3 = new lgl();
            lgl3.ep(ljq2);
            this.setSourceRotation(lgl3);
        }
        super.initializeSpecialEffect();
        this.createVelocityAutoTimer(this.grP.getGUID());
    }

    private void createVelocityAutoTimer(ldv ldv2) {
        krj krj2 = (krj)this.MessageDelegator.h(2308);
        krj2.pXN = false;
        krj2.dsK = false;
        krj2.pYp = true;
        krj2.hsP = false;
        krj2.gEV = (float)this.MessageDelegator.arc().rgz;
        krj2.pXO = true;
        krj2.biw = new ldv[0];
        krj2.pCY = 0;
        krj2.akO = 100.0f;
        krj2.bit = 1000.0f;
        ljq ljq2 = new ljq(0.0f, 0.0f, 1.0f);
        ljq2.normalize();
        krj2.bis = ljq2;
        krj2.Position = this.aZD;
        krj2.Rotation = this.getSourceRotation();
        krj2.pXT = this.bqb;
        krj2.atv = ldv2;
        krj2.Rs = ldv2;
        krj2.aCE = ldv2;
        krj2.ec = ldv2;
        this.MessageDelegator.a(krj2);
        ljq ljq3 = krj2.bis.esF();
        ljq3 = krj2.Rotation.eq(ljq3);
        ljq3.nm(krj2.pXT * this.getDuration());
        this.goo = this.aZD.esF();
        this.goo.es(ljq3);
    }

    @Override
    public void cleanUpSpecialEffect() {
        if (this.goo != null) {
            if (!this.gAl.trim().equals("")) {
                this.startGenericMainEffect(this.gAl, this.goo);
            }
            if (!this.gAq.trim().equals("")) {
                this.startGenericMainEffect(this.gAq, this.goo);
            }
            if (!this.gAr.trim().equals("")) {
                this.startGenericMainEffect(this.gAr, this.goo);
            }
            if (!this.gAs.trim().equals("")) {
                this.startGenericMainEffect(this.gAs, this.goo);
            }
            if (!this.gAt.trim().equals("")) {
                this.startGenericMainEffect(this.gAt, this.goo);
            }
            if (!this.gAu.trim().equals("")) {
                this.startGenericMainEffect(this.gAu, this.goo);
            }
            if (!this.gAv.trim().equals("")) {
                this.startGenericMainEffect(this.gAv, this.goo);
            }
            if (!this.gAw.trim().equals("")) {
                this.startGenericMainEffect(this.gAw, this.goo);
            }
        }
        if (Math.random() > (double)(1.0f - this.gAn) && this.goo != null && !this.gAm.trim().equals("")) {
            this.startGenericMainEffect(this.gAm, this.goo);
        }
        krk krk2 = (krk)this.MessageDelegator.h(2310);
        krk2.ec = this.grP.getGUID();
        krk2.atv = this.grP.getGUID();
        this.MessageDelegator.a(krk2);
        super.cleanUpSpecialEffect();
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
        this.gAl = "";
        this.bqb = 15.0f;
        this.gAo = 1.0f;
        this.gAp = 1.0f;
        this.gAm = "";
        this.gAn = 0.5f;
        this.gAq = "";
        this.gAr = "";
        this.gAs = "";
        this.gAt = "";
        this.gAu = "";
        this.gAv = "";
        this.gAw = "";
    }

    @Override
    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        diq diq2 = (diq)dgj2;
        diq2.setNextEffectName(this.getNextEffectName());
        diq2.setRandomConeRadius1(this.getRandomConeRadius1());
        diq2.setRandomConeRadius2(this.getRandomConeRadius2());
        diq2.setVelocity(this.getVelocity());
        diq2.setRandomEffectName(this.getRandomEffectName());
        diq2.setRandomEffectChance(this.getRandomEffectChance());
        diq2.setMoreEffects1(this.getMoreEffects1());
        diq2.setMoreEffects2(this.getMoreEffects2());
        diq2.setMoreEffects3(this.getMoreEffects3());
        diq2.setMoreEffects4(this.getMoreEffects4());
        diq2.setMoreEffects5(this.getMoreEffects5());
        diq2.setMoreEffects6(this.getMoreEffects6());
        diq2.setMoreEffects7(this.getMoreEffects7());
    }

    public float getRandomConeRadius1() {
        return this.gAo;
    }

    public void setRandomConeRadius1(float f2) {
        this.gAo = f2;
    }

    public float getRandomConeRadius2() {
        return this.gAp;
    }

    public void setRandomConeRadius2(float f2) {
        this.gAp = f2;
    }

    public float getVelocity() {
        return this.bqb;
    }

    public void setVelocity(float f2) {
        this.bqb = f2;
    }

    public String getNextEffectName() {
        return this.gAl;
    }

    public void setNextEffectName(String string) {
        this.gAl = string;
    }

    public void setRandomEffectName(String string) {
        this.gAm = string;
    }

    public String getRandomEffectName() {
        return this.gAm;
    }

    public void setRandomEffectChance(float f2) {
        this.gAn = f2;
    }

    public float getRandomEffectChance() {
        return this.gAn;
    }

    public void setMoreEffects1(String string) {
        this.gAq = string;
    }

    public String getMoreEffects1() {
        return this.gAq;
    }

    public void setMoreEffects2(String string) {
        this.gAr = string;
    }

    public String getMoreEffects2() {
        return this.gAr;
    }

    public void setMoreEffects3(String string) {
        this.gAs = string;
    }

    public String getMoreEffects3() {
        return this.gAs;
    }

    public void setMoreEffects4(String string) {
        this.gAt = string;
    }

    public String getMoreEffects4() {
        return this.gAt;
    }

    public void setMoreEffects5(String string) {
        this.gAu = string;
    }

    public String getMoreEffects5() {
        return this.gAu;
    }

    public void setMoreEffects6(String string) {
        this.gAv = string;
    }

    public String getMoreEffects6() {
        return this.gAv;
    }

    public void setMoreEffects7(String string) {
        this.gAw = string;
    }

    public String getMoreEffects7() {
        return this.gAw;
    }
}

