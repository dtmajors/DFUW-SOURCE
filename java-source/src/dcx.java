/*
 * Decompiled with CFR.
 */
public class dcx {
    private int gdA = 0;
    private cxd.p fZr = null;
    private boolean bnQ = true;
    private int gdB = 0;
    private int gdC = 0;
    private boolean gdD = false;
    private ldv atv = null;
    private double eNV = 0.0;

    public int bjw() {
        return this.gdA;
    }

    public void zE(int n2) {
        this.gdA = n2;
    }

    public cxd.p biV() {
        return this.fZr;
    }

    public void j(cxd.p p2) {
        this.fZr = p2;
    }

    public boolean Cb() {
        return this.bnQ;
    }

    public void aW(boolean bl) {
        this.bnQ = bl;
    }

    public int bjx() {
        return this.gdB;
    }

    public void zF(int n2) {
        this.gdB = n2;
    }

    public int bjy() {
        return this.gdC;
    }

    public void zG(int n2) {
        this.gdC = n2;
    }

    public boolean bjz() {
        return this.gdD;
    }

    public ldv bjA() {
        return this.atv;
    }

    public void mx(ldv ldv2) {
        this.atv = ldv2;
    }

    public double bjB() {
        return this.eNV;
    }

    public final dcx bjC() {
        dcx dcx2;
        block2: {
            dcx2 = null;
            try {
                Class<?> clazz = this.getClass();
                dcx2 = (dcx)clazz.newInstance();
                this.b(dcx2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFSkillTimer", "createCopy() Unable to create copy of skilltimer.");
                lfn.b(5, "SFSkillTimer", "createCopy() Exception: " + exception);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return dcx2;
    }

    public boolean bjD() {
        switch (this.gdA) {
            case 2: 
            case 3: {
                return true;
            }
        }
        return false;
    }

    public final void bJ(double d2) {
        assert (!this.gdD);
        assert (this.atv == null);
        assert (this.eNV == 0.0);
        assert (d2 > 0.0);
        this.gdD = true;
        this.eNV = d2;
    }

    public final void reset() {
        this.gdD = false;
        this.atv = null;
        this.eNV = 0.0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFSkillTimer: Timer='");
        stringBuilder.append(dxj.CU(this.gdA));
        stringBuilder.append("' SkillPart='");
        stringBuilder.append(this.fZr.name());
        stringBuilder.append("' TimerLengthSkillFunction='");
        stringBuilder.append(cxh.fH(this.gdB));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    protected void b(dcx dcx2) {
        dcx2.zE(this.gdA);
        dcx2.j(this.fZr);
        dcx2.aW(this.bnQ);
        dcx2.zF(this.gdB);
        dcx2.zG(this.gdC);
    }
}

