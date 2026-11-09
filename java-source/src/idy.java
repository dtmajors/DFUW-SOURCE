/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 */
public abstract class idy
extends ioa
implements idv {
    protected hzo lLk = null;
    protected jng leq = null;
    protected jnr ler = null;
    protected dmn lLl = null;
    protected hyy lLm = null;
    protected boolean lLn = false;
    protected iee lLo = iee.lMt;
    protected hyy.a lLp = null;
    protected int lLq = 0;
    protected int lLr = 0;
    protected int fc = 0;
    protected int fb = 0;
    protected boolean lLs = true;
    protected idz lLt = null;

    @Override
    public jnz cOS() {
        return jnz.nFI;
    }

    @Override
    public boolean cPa() {
        return !this.lLn;
    }

    protected idy(String string, String string2, iee iee2, boolean bl, int n, hyb hyb2, hxy hxy2, int n2) {
        super(string, string2);
        this.lLo = iee2;
        this.fb = n2;
        this.a(hya.lmp, bl);
        this.OQ(n);
        this.a(hyb2);
        this.a(hxy2);
    }

    @Override
    public void initialize() {
        super.initialize();
        if (idy.cxO() != null && idy.cxO() instanceof hzo) {
            this.lLk = (hzo)idy.cxO();
        }
        if (idy.cFj() != null && idy.cFj().cxP() != null) {
            this.leq = hso.cxK().cxP().czb();
        }
        if (idy.cFj() != null && idy.cFj().cxP() != null) {
            this.ler = hso.cxK().cxP().czc();
        }
        if (idy.cFj() != null && idy.cFj().cxP() != null) {
            this.lLl = hso.cxK().cxP().czd();
        }
        if (this.lLk != null) {
            this.lLm = this.lLk.cHx();
        }
        this.lLt = new a(this);
    }

    @Override
    public void cleanUp() {
        if (this instanceof htm) {
            this.leq.b(this);
        }
        if (this instanceof hut) {
            this.ler.b((hut)((Object)this));
        }
        if (this instanceof huy) {
            this.lLl.b((huy)((Object)this));
        }
        super.cleanUp();
    }

    protected void cON() {
        this.lLt.cON();
    }

    @Override
    public final void b(hyy.b b2, int n) {
        this.lLt.b(b2, n);
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    protected void c(hyy.b b2, int n) {
    }

    @Override
    public void zO() {
        this.lLs = true;
    }

    @Override
    @llk
    public void closeWindow() {
        if (!this.lLn) {
            this.lLk.pq(false);
        }
    }

    @Override
    public void oj() {
    }

    @Override
    public void cBa() {
        super.cBa();
        this.lLs = true;
    }

    @Override
    public void cEc() {
        super.cEc();
        this.cON();
    }
}

