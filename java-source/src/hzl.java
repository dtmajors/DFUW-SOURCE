/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public abstract class hzl
extends btk
implements hsn {
    private boolean lwk = false;

    protected boolean cHh() {
        return this.lwk;
    }

    protected hzl() {
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().a(this);
    }

    @Override
    public void cleanUp() {
        this.cHj();
        if (hso.cxK() != null) {
            hso.cxK().b(this);
        }
        super.cleanUp();
    }

    public abstract void cHi();

    protected abstract void cHj();

    public joa cHk() {
        return hso.cxK().cxY();
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public void oo() {
    }

    public void u(hyn hyn2) {
    }

    public void v(hyn hyn2) {
    }

    @Override
    public boolean op() {
        return true;
    }

    public void w(hyn hyn2) {
    }

    public boolean cHl() {
        return false;
    }

    public boolean cFo() {
        return false;
    }

    public boolean cFv() {
        return false;
    }

    public void cHm() {
    }

    public void cHn() {
        this.lwk = true;
    }

    public void cHo() {
        this.lwk = false;
    }
}

