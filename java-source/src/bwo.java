/*
 * Decompiled with CFR.
 */
import java.util.List;

public class bwo {
    private String Name = null;
    private int Type = 0;
    private int SkillType = 0;
    private int ResourceType = 0;
    private boolean dWx = false;
    private boolean dWy = false;
    private float akO = 0.0f;
    private float dWz = 0.0f;
    private float dWA = 0.0f;
    private float bit = 0.0f;
    private float bzb = 0.0f;
    private float biv = 0.0f;
    private List<bwt> dWB = lcn.emv();
    private boolean dWC = true;
    private bwu dWD = null;

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public int zg() {
        return this.SkillType;
    }

    public void eI(int n) {
        this.SkillType = n;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public boolean aCj() {
        return this.dWx;
    }

    public void fa(boolean bl) {
        this.dWx = bl;
    }

    public boolean aCk() {
        return this.dWy;
    }

    public void fb(boolean bl) {
        this.dWy = bl;
    }

    public float aCc() {
        return this.akO;
    }

    public void dy(float f2) {
        this.akO = f2;
    }

    public float aCl() {
        return this.dWz;
    }

    public void dC(float f2) {
        this.dWz = f2;
    }

    public float aCm() {
        return this.dWA;
    }

    public void dD(float f2) {
        this.dWA = f2;
    }

    public float aCn() {
        return this.bit;
    }

    public void ab(float f2) {
        this.bit = f2;
    }

    public float getMaxVelocity() {
        return this.bzb;
    }

    public void setMaxVelocity(float f2) {
        this.bzb = f2;
    }

    public float aCo() {
        return this.biv;
    }

    public void ac(float f2) {
        this.biv = f2;
    }

    public bwt[] aCp() {
        bwt[] bwtArray = new bwt[this.dWB.size()];
        int n = this.dWB.size();
        for (int i = 0; i < n; ++i) {
            bwtArray[i] = this.dWB.get(i);
        }
        return bwtArray;
    }

    public void a(bwt[] bwtArray) {
        this.dWB.clear();
        int n = bwtArray.length;
        for (int i = 0; i < n; ++i) {
            this.dWB.add(bwtArray[i]);
        }
    }

    public bwu aCq() {
        return this.dWD;
    }

    public void a(bwu bwu2) {
        this.dWD = bwu2;
    }

    public boolean nz(int n) {
        if (this.dWB == null) {
            return false;
        }
        return this.nA(n) >= 0;
    }

    public bwo aCr() {
        bwo bwo2 = new bwo();
        bwo2.setName(this.Name);
        bwo2.setType(this.Type);
        bwo2.eI(this.SkillType);
        bwo2.l(this.ResourceType);
        bwo2.fa(this.dWx);
        bwo2.fb(this.dWy);
        bwo2.dy(this.akO);
        bwo2.dC(this.dWz);
        bwo2.dD(this.dWA);
        bwo2.ab(this.bit);
        bwo2.setMaxVelocity(this.bzb);
        bwo2.ac(this.biv);
        bwo2.fc(this.dWC);
        if (this.dWB != null) {
            bwt[] bwtArray = new bwt[this.dWB.size()];
            for (int i = 0; i < this.dWB.size(); ++i) {
                bwtArray[i] = this.dWB.get(i).aCG();
            }
            bwo2.a(bwtArray);
        }
        return bwo2;
    }

    public int nA(int n) {
        if (this.dWB == null) {
            return -1;
        }
        for (int i = 0; i < this.dWB.size(); ++i) {
            if (this.dWB.get((int)i).dWW != n) continue;
            return i;
        }
        return -1;
    }

    public int aCs() {
        assert (this.dWB != null);
        int n = this.nA(3);
        bwt bwt2 = this.dWB.get(n);
        if (bwt2 == null) {
            return -1;
        }
        return bwt2.SpecialEffectType;
    }

    public final String Bu() {
        assert (this.SkillType >= 0);
        return lea.enZ().getName(this.SkillType);
    }

    public final String pa() {
        assert (this.ResourceType >= 0);
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        return "SFMissileInfo: Name='" + this.Name + "' Type=" + this.Type + " " + this.aCt();
    }

    public String aCt() {
        return "Skill='" + this.Bu() + "' Resource='" + this.pa() + "'";
    }

    public boolean aCu() {
        return this.dWC;
    }

    public void fc(boolean bl) {
        this.dWC = bl;
    }
}

