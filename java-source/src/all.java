/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class all {
    private int brT = 0;
    private int brU = 0;
    private int bnM = 0;
    private int aYG = 0;
    private int ResourceType = 0;
    private int SkillType = 0;
    private float brV = 0.0f;

    public int DG() {
        return this.brT;
    }

    public void fU(int n) {
        this.brT = n;
    }

    public int DH() {
        return this.brU;
    }

    public void fV(int n) {
        this.brU = n;
    }

    public int BV() {
        return this.bnM;
    }

    public void fC(int n) {
        this.bnM = n;
    }

    public int CD() {
        return this.aYG;
    }

    public void fJ(int n) {
        this.aYG = n;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public int zg() {
        return this.SkillType;
    }

    public void eI(int n) {
        this.SkillType = n;
    }

    public float DD() {
        return this.brV;
    }

    public void ap(float f2) {
        this.brV = f2;
    }

    public all DI() {
        all all2 = new all();
        all2.fU(this.brT);
        all2.fV(this.brU);
        all2.fC(this.bnM);
        all2.fJ(this.aYG);
        all2.l(this.ResourceType);
        all2.eI(this.SkillType);
        all2.ap(this.brV);
        return all2;
    }

    public boolean equals(Object object) {
        if (object instanceof all) {
            all all2 = (all)object;
            if (this.brT != all2.DG()) {
                return false;
            }
            if (this.brU != all2.DH()) {
                return false;
            }
            if (this.bnM != all2.BV()) {
                return false;
            }
            if (this.aYG != all2.CD()) {
                return false;
            }
            if (this.ResourceType != all2.az()) {
                return false;
            }
            return this.SkillType == all2.zg();
        }
        return false;
    }

    public String DJ() {
        assert (this.brT > 0);
        return aln.fX(this.brT);
    }

    public String DK() {
        assert (this.brU > 0);
        return aln.fY(this.brU);
    }

    public String getAttributeName() {
        assert (this.bnM > 0);
        return ep.aM((int)this.bnM);
    }

    public String CE() {
        assert (this.aYG > 0);
        return lea.enT().getName(this.aYG);
    }

    public String DL() {
        assert (this.bnM > 0);
        int n = ep.k((int)this.bnM, (int)0);
        return ep.aM((int)n);
    }

    public String DM() {
        assert (this.bnM > 0);
        int n = ep.aP((int)this.bnM);
        return ep.aQ((int)n);
    }

    public String pa() {
        assert (this.ResourceType > 0);
        return lea.enW().getName(this.ResourceType);
    }

    public String Bu() {
        assert (this.SkillType > 0);
        return lea.enZ().getName(this.SkillType);
    }

    public void reset() {
        this.brT = 0;
        this.brU = 0;
        this.bnM = 0;
        this.aYG = 0;
        this.ResourceType = 0;
        this.SkillType = 0;
        this.brV = 0.0f;
    }

    public String toString() {
        assert (this.brT > 0);
        assert (this.brU > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEnchantmentConfiguration: EnchantmentClass='");
        stringBuilder.append(this.DJ());
        stringBuilder.append("' ItemClass='");
        stringBuilder.append(this.DK());
        stringBuilder.append("' ");
        switch (this.brT) {
            case 1: {
                assert (this.SkillType > 0);
                assert (this.aYG > 0);
                stringBuilder.append("Skill='");
                stringBuilder.append(this.Bu());
                stringBuilder.append("' Effect='");
                stringBuilder.append(this.CE());
                stringBuilder.append("' EnchantmentMagnitude=");
                stringBuilder.append(this.brV);
                break;
            }
            case 2: {
                assert (this.SkillType > 0);
                stringBuilder.append("Skill='");
                stringBuilder.append(this.Bu());
                stringBuilder.append("' EnchantmentMagnitude=");
                stringBuilder.append(this.brV);
                break;
            }
            case 3: {
                assert (this.ResourceType > 0);
                stringBuilder.append("Resource='");
                stringBuilder.append(this.pa());
                stringBuilder.append("' EnchantmentMagnitude=");
                stringBuilder.append(this.brV);
                break;
            }
            case 4: {
                assert (this.bnM > 0);
                stringBuilder.append("Attribute='");
                stringBuilder.append(this.getAttributeName());
                stringBuilder.append("' EnchantmentMagnitude=");
                stringBuilder.append(this.brV);
                break;
            }
            case 5: {
                assert (this.bnM > 0);
                stringBuilder.append("Attribute='");
                stringBuilder.append(this.getAttributeName());
                stringBuilder.append("' EnchantmentMagnitude=");
                stringBuilder.append(this.brV);
                break;
            }
            case 6: {
                assert (this.SkillType > 0);
                stringBuilder.append("Skill='");
                stringBuilder.append(this.Bu());
                stringBuilder.append("'");
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        return stringBuilder.toString();
    }
}

