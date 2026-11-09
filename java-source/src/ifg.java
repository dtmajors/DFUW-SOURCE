/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ifg
extends hyn {
    private int lwa;
    private int lwb;
    private int lwc;
    private int lwd;
    private int lir;
    private int lis;
    private boolean lRc = false;

    protected ifg(String string, int n, int n2) {
        super("Draggable", string);
        this.a(hya.lmp, true);
        this.a(hya.lmt, false);
        this.setVisible(false);
        this.lir = n;
        this.lis = n2;
    }

    protected ifg(String string) {
        this(string, 0, 0);
    }

    public void dC(int n, int n2) {
        this.lwa = n;
        this.lwb = n2;
        this.R(this.lwa - this.lir, this.lwb - this.lis);
    }

    public final boolean cSf() {
        return this.lRc;
    }

    public final void qd(boolean bl) {
        this.lRc = bl;
    }

    public hxv cFf() {
        if (this.lRc) {
            return hxv.llh;
        }
        return hxv.llm;
    }

    protected void cBa() {
        super.cBa();
    }

    public void m(int n, int n2, String string) {
        super.m(n, n2, string);
        this.lwa = n;
        this.lwb = n2;
        this.lwc = n;
        this.lwd = n2;
    }

    public void p(int n, int n2, String string) {
        super.p(n, n2, string);
        ifg.cxP().a(this);
    }

    public void c(int n, int n2, int n3, String string) {
        super.c(n, n2, n3, string);
        this.lwc = n;
        this.lwd = n2;
        this.cqF();
    }

    public void cEw() {
        super.cEw();
        this.cSg();
    }

    private void cSg() {
        int n = this.lwc - this.lwa;
        int n2 = this.lwd - this.lwb;
        if (n != 0 || n2 != 0) {
            float f = this.cEE() + (float)n;
            float f2 = this.cEF() + (float)n2;
            this.R(f, f2);
            this.lwa = this.lwc;
            this.lwb = this.lwd;
        }
    }

    public int cSh() {
        return this.lwc;
    }

    public int cSi() {
        return this.lwd;
    }

    public int cMD() {
        return this.lir;
    }

    public int cME() {
        return this.lis;
    }

    public void dD(int n, int n2) {
        this.lwc = n;
        this.lwd = n2;
    }
}

