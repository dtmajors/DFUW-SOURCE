/*
 * Decompiled with CFR.
 */
public class ddb {
    private cxc gcr = null;
    public static final int gdO = 1;
    public static final int gdP = 2;
    public static final int gdQ = 4;
    public static final int gdR = 8;
    public static final int gdS = 16;
    public static final int gdT = 32;
    public static final int gdU = 64;
    public static final int gdV = 128;
    public static final int gdW = 256;
    private cxd.p fZr = null;
    private cxd.t gcn = null;
    private int SpecialEffectType = 0;
    private double gdX = 0.0;
    private int aZF = 0;

    public cxd.p biV() {
        return this.fZr;
    }

    public void j(cxd.p p2) {
        this.fZr = p2;
    }

    public cxd.t biW() {
        return this.gcn;
    }

    public void c(cxd.t t2) {
        this.gcn = t2;
    }

    public int getSpecialEffectType() {
        return this.SpecialEffectType;
    }

    public int bjG() {
        assert (this.gcr != null);
        if (this.gcr != null) {
            dco dco2 = lea.epK().get(this.gcr.zg());
            if (dco2 != null && this.gcr.aJz().bgR() != null && this.gcr.aJz().bgR().aJB() != null) {
                int n2 = this.gcr.aJz().bgR().aJB().uw();
                return dco2.r(this.fZr.ordinal(), this.gcn.ordinal(), n2);
            }
            assert (false) : "No special effect for : " + this.gcr.Bu();
        }
        return -1;
    }

    public void setSpecialEffectType(int n2) {
        this.SpecialEffectType = n2;
    }

    public double bjH() {
        return this.gdX;
    }

    public void bK(double d2) {
        this.gdX = d2;
    }

    public int aul() {
        return this.aZF;
    }

    public void zI(int n2) {
        this.aZF = n2;
    }

    public ddb bjI() {
        ddb ddb2 = new ddb();
        ddb2.j(this.fZr);
        ddb2.c(this.gcn);
        ddb2.setSpecialEffectType(this.SpecialEffectType);
        ddb2.bK(this.gdX);
        ddb2.zI(this.aZF);
        return ddb2;
    }

    public String bja() {
        if (this.fZr == null) {
            return null;
        }
        return this.fZr.name();
    }

    public String getSpecialEffectName() {
        return this.SpecialEffectType != -1 ? del.zU(this.SpecialEffectType) : del.zU(this.bjG());
    }

    public String bjb() {
        if (this.gcn == null) {
            return null;
        }
        return this.gcn.name();
    }

    public cxd.v bjJ() {
        if ((this.aZF & 1) > 0) {
            return cxd.v.fSU;
        }
        if ((this.aZF & 2) > 0) {
            return cxd.v.fSV;
        }
        if ((this.aZF & 4) > 0) {
            return cxd.v.fSW;
        }
        if ((this.aZF & 8) > 0) {
            return cxd.v.fSX;
        }
        return null;
    }

    public boolean bjK() {
        return (this.aZF & 0x10) > 0;
    }

    public boolean bjL() {
        return (this.aZF & 0x20) > 0;
    }

    public boolean bjM() {
        return (this.aZF & 0x40) > 0;
    }

    public boolean bjN() {
        return (this.aZF & 0x80) > 0;
    }

    public boolean bjO() {
        return (this.aZF & 0x100) > 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSpecialEffectInfo: SkillPart='");
        stringBuilder.append(this.bja());
        stringBuilder.append("' TargetObject='");
        stringBuilder.append(this.bjb());
        stringBuilder.append("' SpecialEffectName='");
        stringBuilder.append(this.getSpecialEffectName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public final void ci(cxc cxc2) {
        this.gcr = cxc2;
    }
}

