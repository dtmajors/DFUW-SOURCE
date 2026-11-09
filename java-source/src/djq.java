/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.ArrayList;

public class djq
extends dgj {
    dfc gry = null;
    private float bpE = 0.0f;
    private float aSc = 0.0f;
    private int eMf = 360;
    private int eMg = 360;
    private ljq eMh = null;
    private long dKH = 0L;
    private boolean eMi = false;
    private boolean eMj = false;
    private float gCo = 0.25f;
    private String gsk = null;
    private String gsl = null;
    private String gsm = null;
    private String gsn = null;
    private String gCg = null;
    private String gCh = null;
    private String gCi = null;
    private String gCj = null;

    djq() {
        this.gqB = 65;
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

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (Math.random() > (double)this.gCo) {
            this.gqA = Float.valueOf(0.1f);
            return;
        }
        if (!this.createAudio()) {
            this.gqA = Float.valueOf(0.1f);
            return;
        }
        if (this.isRelationEffect()) {
            this.setupPositionalRelation(this.getTargetObjectGUID(), this.gry.getGUID(), this.getMainEffectObjectType());
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djq djq2 = (djq)dgj2;
        djq2.bpE = this.bpE;
        djq2.aSc = this.aSc;
        djq2.eMf = this.eMf;
        djq2.eMg = this.eMg;
        djq2.eMh = this.eMh;
        djq2.dKH = this.dKH;
        djq2.eMi = this.eMi;
        djq2.eMj = this.eMj;
        djq2.gCo = this.gCo;
        djq2.gsk = this.gsk;
        djq2.gsl = this.gsl;
        djq2.gsm = this.gsm;
        djq2.gsn = this.gsn;
        djq2.gCg = this.gCg;
        djq2.gCh = this.gCh;
        djq2.gCi = this.gCi;
        djq2.gCj = this.gCj;
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
        this.gsk = "";
        this.gsl = "";
        this.gsm = "";
        this.gsn = "";
        this.gCg = "";
        this.gCh = "";
        this.gCi = "";
        this.gCj = "";
        this.gCo = 0.25f;
    }

    private String getAudio() {
        ArrayList<String> arrayList = lcn.emv();
        if (this.gsk != null && !this.gsk.equalsIgnoreCase("")) {
            arrayList.add(this.gsk);
        }
        if (this.gsl != null && !this.gsl.equalsIgnoreCase("")) {
            arrayList.add(this.gsl);
        }
        if (this.gsm != null && !this.gsm.equalsIgnoreCase("")) {
            arrayList.add(this.gsm);
        }
        if (this.gsn != null && !this.gsn.equalsIgnoreCase("")) {
            arrayList.add(this.gsn);
        }
        if (this.gCg != null && !this.gCg.equalsIgnoreCase("")) {
            arrayList.add(this.gCg);
        }
        if (this.gCh != null && !this.gCh.equalsIgnoreCase("")) {
            arrayList.add(this.gCh);
        }
        if (this.gCi != null && !this.gCi.equalsIgnoreCase("")) {
            arrayList.add(this.gCi);
        }
        if (this.gCj != null && !this.gCj.equalsIgnoreCase("")) {
            arrayList.add(this.gCj);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int n = (int)((double)arrayList.size() * Math.random());
        if (n >= arrayList.size()) {
            n = arrayList.size() - 1;
        }
        return (String)arrayList.get(n);
    }

    protected boolean createAudio() {
        String string = this.getAudio();
        if (string == null) {
            return false;
        }
        this.gry = (dfc)dKP.Af(4);
        this.gry.setGUID(this.getMainAtomGuid());
        this.gry.setActive(true);
        this.gry.setConeOrientation(this.eMh);
        this.gry.setConeOutsideVolume(this.dKH);
        this.gry.setInsideConeAngle(this.eMf);
        this.gry.setLooping(this.eMi);
        this.gry.hO(false);
        this.gry.setMaxDistance(this.bpE);
        this.gry.setMinDistance(this.aSc);
        this.gry.setMode(0);
        this.gry.setOutsideConeAngle(this.eMg);
        this.gry.setPlayingOnce(this.eMj);
        this.gry.bi(new ljq());
        this.gry.setXMLFileName(string);
        if (this.getTargetPosition() != null) {
            this.gry.bK(this.getTargetPosition());
        } else {
            this.gry.bK(new ljq());
        }
        this.gry.c(this);
        this.MessageDelegator.a(this.gry);
        return true;
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

    public float getChanceOfPlaying() {
        return this.gCo;
    }

    public void setChanceOfPlaying(float f) {
        this.gCo = f;
    }

    public dey getAtom(int n) {
        return this.gry;
    }

    public int getAtomCount() {
        return 1;
    }
}

