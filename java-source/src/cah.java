/*
 * Decompiled with CFR.
 */
public class cah {
    private cak.d eeE = cak.d.egA;
    private cag eeF = null;
    private cav eeG = null;
    private dus eeH = null;
    private bzy eeI = null;

    public cak.d aFS() {
        return this.eeE;
    }

    public void a(cak.d d2) {
        assert (d2 != null);
        this.eeE = d2;
    }

    public cag aFT() {
        return this.eeF;
    }

    public void b(cag cag2) {
        assert (cag2 != null);
        this.eeF = cag2;
    }

    public cav aFU() {
        return this.eeG;
    }

    public void a(cav cav2) {
        assert (cav2 != null);
        this.eeG = cav2;
    }

    public dus aFV() {
        return this.eeH;
    }

    public void a(dus dus2) {
        this.eeH = dus2;
    }

    public bzy aFW() {
        return this.eeI;
    }

    public void a(bzy bzy2) {
        this.eeI = bzy2;
    }

    public cah aFX() {
        cah cah2 = new cah();
        cah2.a(this.eeE);
        cah2.b(this.eeF.aFQ());
        cah2.a(this.eeG.aHb());
        if (this.eeH != null) {
            cah2.a(this.eeH.bBp());
        }
        cah2.a(this.eeI);
        return cah2;
    }

    public boolean equals(Object object) {
        assert (this.eeF != null);
        assert (this.eeG != null);
        assert (this.eeF.aFO() == this.eeG.aFO());
        if (object instanceof cah) {
            cah cah2 = (cah)object;
            if (cah2.aFS().getValue() != this.eeE.getValue()) {
                return false;
            }
            if (!cah2.aFT().equals(this.eeF)) {
                return false;
            }
            return cah2.aFU().equals(this.eeG);
        }
        return false;
    }

    public int aFO() {
        assert (this.eeF != null);
        assert (this.eeG != null);
        assert (this.eeF.aFO() == this.eeG.aFO());
        return this.eeF.aFO();
    }

    public void c(cag cag2) {
        assert (this.eeF != null);
        assert (cag2 != null);
        cag cag3 = this.eeF;
        this.eeF = cag2;
    }

    public void b(cav cav2) {
        assert (this.eeG != null);
        assert (cav2 != null);
        cav cav3 = this.eeG;
        this.eeG = cav2;
    }

    public void reset() {
        this.eeE = cak.d.egA;
        this.eeF = null;
        this.eeG = null;
        this.eeH = null;
        this.eeI = null;
    }

    public void oo(int n) {
        assert (n >= 0);
        assert (this.eeF != null);
        assert (this.eeG != null);
        this.eeF.oo(n);
        this.eeG.oo(n);
    }

    public String toString() {
        assert (this.eeE != null);
        assert (this.eeF != null);
        assert (this.eeG != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMaterialShaderPair:");
        stringBuilder.append(" PriorityLevel='");
        stringBuilder.append(this.eeE.name());
        stringBuilder.append("' ");
        if (this.eeF == null) {
            stringBuilder.append("MaterialItem=null");
        } else {
            stringBuilder.append(this.eeF);
        }
        stringBuilder.append(" ");
        if (this.eeG == null) {
            stringBuilder.append("ShaderItem=null");
        } else {
            stringBuilder.append(this.eeG);
        }
        return stringBuilder.toString();
    }
}

