/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.ArrayList;
import java.util.Locale;

public class djw
extends dgj {
    private dfb gCF = null;
    private boolean gnB = false;
    private boolean gnC = false;
    private boolean gnD = false;
    private int gnE = 0;
    private long gnF = 0L;
    private long gnG = 0L;
    private String gnK = null;
    private boolean eMi = false;
    private boolean gCG = true;
    private String gsl = null;
    private String gsm = null;
    private String gsn = null;
    private String gCg = null;
    private String gCh = null;
    private String gCi = null;
    private String gCj = null;
    private String gCH = "";

    djw() {
        this.gqB = 64;
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
        return 6;
    }

    protected void initializeSpecialEffect() {
        String[] stringArray;
        super.initializeSpecialEffect();
        if (this.gCH.length() > 0 && (stringArray = this.gCH.split(";")).length > 0) {
            Locale locale = lpd.rHs.exJ().get(lpd.rHs.exK());
            boolean bl = false;
            for (String string : stringArray) {
                if (!locale.getLanguage().equalsIgnoreCase(string)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return;
            }
        }
        this.createAudio();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        djw djw2 = (djw)dgj2;
        djw2.gnB = this.gnB;
        djw2.gnC = this.gnC;
        djw2.gnD = this.gnD;
        djw2.gnE = this.gnE;
        djw2.gnF = this.gnF;
        djw2.gnG = this.gnG;
        djw2.gnK = this.gnK;
        djw2.gsl = this.gsl;
        djw2.gsm = this.gsm;
        djw2.gsn = this.gsn;
        djw2.gCg = this.gCg;
        djw2.gCh = this.gCh;
        djw2.gCi = this.gCi;
        djw2.gCj = this.gCj;
        djw2.gCH = this.gCH;
        djw2.eMi = this.eMi;
        djw2.gCG = this.gCG;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gnB = false;
        this.gnC = false;
        this.gnD = false;
        this.gnE = 0;
        this.gnF = 0L;
        this.gnG = 0L;
        this.gnK = "";
        this.eMi = false;
        this.gCG = true;
        this.gCH = "";
    }

    protected void createAudio() {
        ArrayList<String> arrayList = lcn.emv();
        if (this.gnK != null && this.gnK.length() > 0) {
            arrayList.add(this.gnK);
        }
        if (this.gsl != null && this.gsl.length() > 0) {
            arrayList.add(this.gsl);
        }
        if (this.gsm != null && this.gsm.length() > 0) {
            arrayList.add(this.gsm);
        }
        if (this.gsn != null && this.gsn.length() > 0) {
            arrayList.add(this.gsn);
        }
        if (this.gCg != null && this.gCg.length() > 0) {
            arrayList.add(this.gCg);
        }
        if (this.gCh != null && this.gCh.length() > 0) {
            arrayList.add(this.gCh);
        }
        if (this.gCi != null && this.gCi.length() > 0) {
            arrayList.add(this.gCi);
        }
        if (this.gCj != null && this.gCj.length() > 0) {
            arrayList.add(this.gCj);
        }
        if (arrayList.size() == 0) {
            return;
        }
        int n = (int)(Math.random() * (double)arrayList.size()) % arrayList.size();
        this.gCF = (dfb)dKP.Af(3);
        this.gCF.setGUID(this.getMainAtomGuid());
        this.gCF.setActive(true);
        this.gCF.setLooping(this.eMi);
        this.gCF.hO(true);
        this.gCF.setEnableModifyFrequency(this.gnB);
        this.gCF.setFrequency(this.gnE);
        this.gCF.setEnableModifyPan(this.gnC);
        this.gCF.setPan(this.gnF);
        this.gCF.setEnableModifyVolume(this.gnD);
        this.gCF.setVolume(this.gnG);
        this.gCF.setXMLFileName((String)arrayList.get(n));
        this.gCF.hO(true);
        this.gCF.hP(this.gCG);
        this.gCF.setPlayingOnce(true);
        this.gCF.c(this);
        this.MessageDelegator.a(this.gCF);
    }

    protected void removeAudio() {
        if (this.gCF != null) {
            dey.bls().b(this.gCF);
        }
        this.gCF = null;
    }

    public boolean isAutoStartPlayeWhenAssembled() {
        return this.gCG;
    }

    public void setAutoStartPlayeWhenAssembled(boolean bl) {
        this.gCG = bl;
    }

    public boolean isEnableModifyFrequency() {
        return this.gnB;
    }

    public void setEnableModifyFrequency(boolean bl) {
        this.gnB = bl;
    }

    public boolean isEnableModifyPan() {
        return this.gnC;
    }

    public void setEnableModifyPan(boolean bl) {
        this.gnC = bl;
    }

    public boolean isEnableModifyVolume() {
        return this.gnD;
    }

    public void setEnableModifyVolume(boolean bl) {
        this.gnD = bl;
    }

    public int getFrequency() {
        return this.gnE;
    }

    public void setFrequency(int n) {
        this.gnE = n;
    }

    public boolean isLooping() {
        return this.eMi;
    }

    public void setLooping(boolean bl) {
        this.eMi = bl;
    }

    public long getPan() {
        return this.gnF;
    }

    public void setPan(long l) {
        this.gnF = l;
    }

    public long getVolume() {
        return this.gnG;
    }

    public void setVolume(long l) {
        this.gnG = l;
    }

    public String getXMLFileName() {
        return this.gnK;
    }

    public void setXMLFileName(String string) {
        this.gnK = string;
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

    public String getLanguages() {
        return this.gCH;
    }

    public void setLanguages(String string) {
        this.gCH = string;
    }
}

