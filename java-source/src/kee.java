/*
 * Decompiled with CFR.
 */
public abstract class kee {
    protected int piO = 2;
    protected String piP = "";
    protected String piQ = "";
    protected lef piR = null;
    protected boolean bdP = false;

    public abstract int dVG();

    public lef dVH() {
        return this.piR;
    }

    public void e(lef lef2) {
        if (this.piR == null) {
            this.piR = lef2;
        } else {
            lfn.print("SFModulePipe: #ERROR#Cannot set new PipeKey!");
        }
    }

    public String dVI() {
        return this.piP;
    }

    public void wF(String string) {
        this.piP = string;
    }

    public String dVJ() {
        return this.piQ;
    }

    public void wG(String string) {
        this.piQ = string;
    }

    public int getDirection() {
        return this.piO;
    }

    protected void setDirection(int n) {
        this.piO = n;
    }

    public void aB(boolean bl) {
        this.bdP = bl;
    }

    public boolean isLocked() {
        return this.bdP;
    }

    public abstract boolean isEmpty();

    public String toString() {
        return "SFModulePipe: Key = " + this.piR + ", InModule= " + this.piP + ", OutModule= " + this.piQ;
    }

    public Object dVK() {
        assert (false);
        return null;
    }
}

