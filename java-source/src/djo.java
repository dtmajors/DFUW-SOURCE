/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.List;

public class djo
extends dgj {
    private List gsi = lcn.emI();
    private float bpE = 0.0f;
    private float aSc = 0.0f;
    private int eMf = 360;
    private int eMg = 360;
    private ljq eMh = new ljq(0.0f, 1.0f, 0.0f);
    private long dKH = 0L;
    private String gsk = null;
    private String gsl = null;
    private String gsm = null;
    private String gsn = null;
    private String gCg = null;
    private String gCh = null;
    private String gCi = null;
    private String gCj = null;
    private float gCk = 0.0f;
    private float gCl = 0.0f;
    private double gCm = 0.0;

    djo() {
        this.gqB = 32;
        this.gqA = Float.valueOf(-1.0f);
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        if (this.gsi == null) {
            return;
        }
        for (dfc dfc2 : this.gsi) {
            this.removeAudio(dfc2);
        }
        this.gsi = null;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkAudio();
    }

    protected int getMainEffectObjectType() {
        return 3;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (this.gsk != null && this.gsk != "") {
            this.gsi.add(this.createAudio(this.gsk));
        }
        if (this.gsl != null && this.gsl != "") {
            this.gsi.add(this.createAudio(this.gsl));
        }
        if (this.gsm != null && this.gsm != "") {
            this.gsi.add(this.createAudio(this.gsm));
        }
        if (this.gsn != null && this.gsn != "") {
            this.gsi.add(this.createAudio(this.gsn));
        }
        if (this.gCg != null && this.gCg != "") {
            this.gsi.add(this.createAudio(this.gCg));
        }
        if (this.gCh != null && this.gCh != "") {
            this.gsi.add(this.createAudio(this.gCh));
        }
        if (this.gCi != null && this.gCi != "") {
            this.gsi.add(this.createAudio(this.gCi));
        }
        if (this.gCj != null && this.gCj != "") {
            this.gsi.add(this.createAudio(this.gCj));
        }
        if (this.isRelationEffect()) {
            for (dfc dfc2 : this.gsi) {
                this.setupPositionalRelation(this.getTargetObjectGUID(), dfc2.getGUID(), this.getMainEffectObjectType());
            }
        }
        this.gCm = this.nx.rgz + ((double)this.gCk + Math.random() * (double)(this.gCl - this.gCk));
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djo djo2 = (djo)dgj2;
        djo2.bpE = this.bpE;
        djo2.aSc = this.aSc;
        djo2.eMf = this.eMf;
        djo2.eMg = this.eMg;
        djo2.eMh = this.eMh;
        djo2.dKH = this.dKH;
        djo2.gsk = this.gsk;
        djo2.gsl = this.gsl;
        djo2.gsm = this.gsm;
        djo2.gsn = this.gsn;
        djo2.gCg = this.gCg;
        djo2.gCh = this.gCh;
        djo2.gCi = this.gCi;
        djo2.gCj = this.gCj;
        djo2.gCk = this.gCk;
        djo2.gCl = this.gCl;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.bpE = 20.0f;
        this.aSc = 5.0f;
        this.eMf = 360;
        this.eMg = 360;
        this.eMh = new ljq(0.0f, 1.0f, 0.0f);
        this.dKH = 0L;
        this.gsk = "";
        this.gsl = "";
        this.gsm = "";
        this.gsn = "";
        this.gCg = "";
        this.gCh = "";
        this.gCi = "";
        this.gCj = "";
        this.gCk = 1.0f;
        this.gCl = 10.0f;
    }

    protected dfc createAudio(String string) {
        dfc dfc2 = (dfc)dKP.Af(4);
        dfc2.setGUID(this.getNewEffectGuid());
        dfc2.setActive(true);
        dfc2.setConeOrientation(this.eMh);
        dfc2.setConeOutsideVolume(this.dKH);
        dfc2.setInsideConeAngle(this.eMf);
        dfc2.setLooping(false);
        dfc2.hO(false);
        dfc2.setMaxDistance(this.bpE);
        dfc2.setMinDistance(this.aSc);
        dfc2.setMode(0);
        dfc2.setOutsideConeAngle(this.eMg);
        dfc2.setPlayingOnce(false);
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

    protected void removeAudio(dfc dfc2) {
        if (dfc2 == null) {
            return;
        }
        dey.bls().b(dfc2);
    }

    private void checkAudio() {
        if (this.gCm > this.nx.rgz) {
            return;
        }
        if (this.gsi.isEmpty()) {
            return;
        }
        this.gCm = this.nx.rgz + ((double)this.gCk + Math.random() * (double)(this.gCl - this.gCk));
        int n = (int)(Math.random() * (double)this.gsi.size());
        if (n == this.gsi.size()) {
            --n;
        }
        dfc dfc2 = (dfc)this.gsi.get(n);
        dfc2.play();
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

    public float getMaxDistance() {
        return this.bpE;
    }

    public void setMaxDistance(float f) {
        this.bpE = f;
    }

    public float getMaxTimeDelay() {
        return this.gCl;
    }

    public void setMaxTimeDelay(float f) {
        this.gCl = f;
    }

    public float getMinDistance() {
        return this.aSc;
    }

    public void setMinDistance(float f) {
        this.aSc = f;
    }

    public float getMinTimeDelay() {
        return this.gCk;
    }

    public void setMinTimeDelay(float f) {
        this.gCk = f;
    }

    public int getOutsideConeAngle() {
        return this.eMg;
    }

    public void setOutsideConeAngle(int n) {
        this.eMg = n;
    }

    public String getXMLFileName1() {
        return this.gsk;
    }

    public void setXMLFileName1(String string) {
        this.gsk = string;
    }

    public String getXMLFileName2() {
        return this.gsl;
    }

    public void setXMLFileName2(String string) {
        this.gsl = string;
    }

    public String getXMLFileName3() {
        return this.gsm;
    }

    public void setXMLFileName3(String string) {
        this.gsm = string;
    }

    public String getXMLFileName4() {
        return this.gsn;
    }

    public void setXMLFileName4(String string) {
        this.gsn = string;
    }

    public String getXMLFileName5() {
        return this.gCg;
    }

    public void setXMLFileName5(String string) {
        this.gCg = string;
    }

    public String getXMLFileName6() {
        return this.gCh;
    }

    public void setXMLFileName6(String string) {
        this.gCh = string;
    }

    public String getXMLFileName7() {
        return this.gCi;
    }

    public void setXMLFileName7(String string) {
        this.gCi = string;
    }

    public String getXMLFileName8() {
        return this.gCj;
    }

    public void setXMLFileName8(String string) {
        this.gCj = string;
    }

    public dey getAtom(int n) {
        return (dey)this.gsi.get(n);
    }

    public int getAtomCount() {
        if (this.gsi == null) {
            return 0;
        }
        return this.gsi.size();
    }
}

