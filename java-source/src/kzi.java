/*
 * Decompiled with CFR.
 */
public class kzi {
    public int lnR = 10;
    public int lnS = 10;
    public int pgr = 900;
    public int pgs = 750;
    public boolean qnT = true;
    public boolean qnU = true;
    public boolean qnV = true;
    public boolean qnW = true;
    public boolean qnX = true;
    public boolean qnY = true;
    public boolean qnZ = true;
    public boolean qoa = true;
    public boolean qob = true;
    public boolean qoc = true;
    public boolean qod = true;
    public String qoe = null;
    public String qof = null;
    public int qog = 10000;
    public boolean qoh = false;

    public void eke() {
        this.setState(false);
    }

    public void ekf() {
        this.setState(true);
    }

    private void setState(boolean bl) {
        this.qnT = bl;
        this.qnU = bl;
        this.qnV = bl;
        this.qnW = bl;
        this.qnX = bl;
        this.qnY = bl;
        this.qnZ = bl;
        this.qoa = bl;
        this.qob = bl;
        this.qoc = bl;
        this.qod = bl;
    }
}

