/*
 * Decompiled with CFR.
 */
public class ipv
extends ipx {
    private ipk msD;
    private ire msb = ire.muk;
    private int mod = 8;
    private int moe = 8;
    private int mof = 8;
    private int lEY = 8;

    public ipv() {
        this.msD = new ipk(0x313131);
    }

    public ipv(int n, int n2) {
        this.msD = new ipk(n);
        this.moe = this.lEY = n2;
        this.mof = this.lEY;
        this.mod = this.lEY;
    }

    public int Hr() {
        return this.msD.Hr();
    }

    public void setColor(int n) {
        this.msD.setColor(n);
    }

    public ire dlY() {
        return this.msb;
    }

    public void b(ire ire2) {
        if (ire2 == this.msb) {
            return;
        }
        this.msb = ire2;
        this.pack();
    }

    public int cXH() {
        return this.mod;
    }

    public void QT(int n) {
        if (n == this.mod) {
            return;
        }
        this.mod = n;
        this.pack();
    }

    public int cXI() {
        return this.moe;
    }

    public void QU(int n) {
        if (n == this.moe) {
            return;
        }
        this.moe = n;
        this.pack();
    }

    public int dhN() {
        return this.mof;
    }

    public void Rz(int n) {
        if (n == this.mof) {
            return;
        }
        this.mof = n;
        this.pack();
    }

    public int dhO() {
        return this.lEY;
    }

    public void RA(int n) {
        if (n == this.lEY) {
            return;
        }
        this.lEY = n;
        this.pack();
    }

    public void RD(int n) {
        this.QT(n);
        this.QU(n);
        this.Rz(n);
        this.RA(n);
    }

    @Override
    public void cPj() {
        this.setSize(this.mod + this.mof, this.moe + this.lEY);
    }

    @Override
    public void cPk() {
        switch (this.msb) {
            case muk: {
                this.msD.r(this.mod, this.getHeight() / 2, this.getWidth() - this.mod - this.mof, 1);
                break;
            }
            case mul: {
                this.msD.r(this.getWidth() / 2, this.moe, 1, this.getHeight() - this.moe - this.lEY);
            }
        }
    }
}

