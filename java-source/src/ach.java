/*
 * Decompiled with CFR.
 */
public class ach {
    private int ID = -1;
    private String aZO = null;
    private String bdM = null;
    private String bdN = null;
    private wy bbg = null;
    private loq bdO = null;

    public int getID() {
        return this.ID;
    }

    public wy wF() {
        return this.bbg;
    }

    public boolean isLocked() {
        return true;
    }

    public String getImageFileName() {
        return this.isLocked() ? this.yI() : this.yJ();
    }

    public String yI() {
        return this.bdM;
    }

    public String yJ() {
        return this.bdN;
    }

    public loz vT() {
        return this.isLocked() ? this.yK() : this.yL();
    }

    public loz yK() {
        return lvm.sXt.bD(this.yO());
    }

    public loz yL() {
        return lvm.sXu.bD(this.yO());
    }

    public loz vU() {
        return this.isLocked() ? this.yM() : this.yN();
    }

    public loz yM() {
        return lvm.sXv.bD(this.yO());
    }

    public loz yN() {
        return lvm.sXw.bD(this.yO());
    }

    private loq yO() {
        if (this.bdO == null) {
            this.bdO = new loq(this.bbg.getID(), this.ID);
        }
        return this.bdO;
    }

    protected String ym() {
        return this.aZO;
    }

    public ach(int n, String string, String string2, wy wy2) {
        this.ID = n;
        this.bdM = string;
        this.bdN = string2;
        this.bbg = wy2;
    }

    public ach(int n, String string, String string2, wy wy2, String string3) {
        this(n, string, string2, wy2);
    }

    public aci yP() {
        return new aci(this, this.aZO);
    }
}

