/*
 * Decompiled with CFR.
 */
public class aze {
    private String ResourceName = null;
    private int ResourceType = -1;
    private boolean cDN = false;
    private int cDO = axp.CATEGORY_NONE.ordinal();
    private int ID = -1;
    private int aDw = -1;
    private int csL = -1;
    private boolean cDP = false;
    private ljq cDQ = null;
    private lgl Rotation = null;
    private int cDR = 0;
    private int[] cDS = null;
    private int[] cDT = null;
    private boolean avz = false;
    private float aDv = 0.0f;
    private float cDU = 0.0f;
    private boolean cDV = false;

    public String pa() {
        return this.ResourceName;
    }

    public void eY(String string) {
        this.ResourceName = string;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public boolean acI() {
        return this.cDN;
    }

    public void cs(boolean bl) {
        this.cDN = bl;
    }

    public axp acJ() {
        return axp.getCategoryByOrdinal(this.cDO);
    }

    public void b(axp axp2) {
        this.cDO = axp2 == null ? this.cDO : axp2.ordinal();
    }

    public int getID() {
        return this.ID;
    }

    public void hG(int n) {
        this.ID = n;
    }

    public int XS() {
        return this.aDw;
    }

    public void iB(int n) {
        this.aDw = n;
    }

    public int XT() {
        return this.csL;
    }

    public void iz(int n) {
        this.csL = n;
    }

    public boolean acK() {
        return this.aDw >= 0;
    }

    public boolean acL() {
        return this.cDP;
    }

    public void ct(boolean bl) {
        this.cDP = bl;
    }

    public ljq acM() {
        return this.cDQ;
    }

    public void aG(ljq ljq2) {
        this.cDQ = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public int acN() {
        return this.cDR;
    }

    public void jh(int n) {
        this.cDR = n;
    }

    public int[] acO() {
        return this.cDS;
    }

    public void n(int[] nArray) {
        this.cDS = nArray;
    }

    public int[] acP() {
        return this.cDT;
    }

    public void o(int[] nArray) {
        this.cDT = nArray;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }

    public float Yd() {
        return this.aDv;
    }

    public void cg(float f) {
        this.aDv = f;
    }

    public float acQ() {
        return this.cDU;
    }

    public void cj(float f) {
        this.cDU = f;
    }

    public boolean acR() {
        return this.cDV;
    }

    public void cu(boolean bl) {
        this.cDV = bl;
    }

    public boolean c(aze aze2) {
        if (aze2 == null || this.ID != aze2.ID) {
            return false;
        }
        if (this.aDw != aze2.aDw) {
            return true;
        }
        if (this.cDP != aze2.cDP) {
            return true;
        }
        if (this.cDR != aze2.cDR) {
            return true;
        }
        if (this.avz != aze2.avz) {
            return true;
        }
        return this.aDv != aze2.aDv;
    }
}

