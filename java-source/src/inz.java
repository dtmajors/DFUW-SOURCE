/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class inz
extends ioa {
    ioa mnN;
    private joa mnO;
    private int mnP;
    private int mnQ;
    private ipb mnR;
    private ipb mnS;
    private int mnT;
    private iod mnU = iod.moF;
    private joa mnV;

    public inz(String string, String string2, ioa ioa2, joa joa2, int n, int n2) {
        super(string, string2);
        this.OQ(-1);
        this.a(hya.lmp, true);
        this.mnN = ioa2;
        this.mnO = joa2;
        this.mnP = n;
        this.mnQ = n2;
        if (this.mnN != null) {
            this.mnN.mor = this;
        }
    }

    public void cFa() {
    }

    public void close() {
        this.cGR();
    }

    public iod dhB() {
        return this.mnU;
    }

    public void a(iod iod2) {
        this.mnU = iod2;
    }

    public ioa dhC() {
        return this.mnN;
    }

    @Override
    protected void cEf() {
        super.cEf();
        if (this.mnN != null) {
            this.close();
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        if (this.mnP == 1 || this.mnP == 2) {
            this.mnR = this.dhD();
            this.mnS = this.dhE();
        }
        this.pack();
    }

    protected ipb dhD() {
        return new ipb("/dfdata/texture/gui/j2f/common/popups/popup_arrow_pointer_left.png");
    }

    protected ipb dhE() {
        return new ipb("/dfdata/texture/gui/j2f/common/popups/popup_arrow_pointer_right.png");
    }

    @Override
    protected void cYd() {
        super.cYd();
        if (this.a(hya.lmw)) {
            this.cEZ();
        }
    }

    @Override
    protected void dhx() {
        if (this.mnV != null) {
            this.dhJ().setSize((int)Math.min((float)this.dhJ().getWidth(), this.mnV.W), (int)Math.min((float)this.dhJ().getHeight(), this.mnV.H));
        }
        super.dhx();
    }

    @Override
    protected void cKg() {
        joa joa2;
        super.cKg();
        this.mnV = joa2 = hze.a(this.mnO, new joa(this.cEE(), this.cEF(), this.cFw(), this.cFx()), this.mnP, this.mnQ, this.cXH(), this.cXI(), this.dhN(), this.dhO());
        this.g(joa2.X, joa2.Y, joa2.W, joa2.H);
        this.dhJ().r(0, 0, (int)joa2.W, (int)joa2.H);
        if (this.mnR != null) {
            this.mnR.setVisible(joa2.X > this.mnO.X - (float)this.cXH());
            this.mnS.setVisible(!this.mnR.djL());
            int n = Math.min(Math.max((int)(this.mnO.Y - this.cEF() + this.mnO.H / 2.0f - (float)(this.mnR.getHeight() / 2)), 0), (int)this.cFx() - this.dhO() - this.mnR.getHeight() - 32);
            if (this.mnR.djL()) {
                this.Rw(n);
            } else {
                this.Rx(n);
            }
        }
        this.cqF();
    }

    protected joa dhF() {
        return this.mnO;
    }

    protected joa dhG() {
        return this.mnV;
    }

    protected void Rw(int n) {
        this.mnR.ek(this.cXH() - this.mnR.getWidth() + 4, n);
    }

    protected void Rx(int n) {
        this.mnS.ek(-this.mnS.getWidth() - 12, n);
    }

    protected void cGR() {
        if (this.mor != null) {
            this.mor.close();
        }
        if (this.a(hya.lmw) && hso.cxK().cxP() != null && hso.cxK().cxP().m((hyn)this)) {
            super.cFa();
        }
        if (this.mnN != null) {
            this.mnN.mor = null;
            if (hso.cxK().cxP() != null && hso.cxK().cxP().m((hyn)this.mnN)) {
                if (this.mnN instanceof inz) {
                    this.mnN.cEZ();
                }
                this.mnN.cFc();
            }
            this.mnN = null;
        }
        if (this.MessageDelegator != null && this.MessageDelegator.d(this.getGUID()) == this) {
            this.MessageDelegator.hd(this.getGUID());
        }
    }

    @Override
    protected void g(int n, int n2, String string) {
        switch (this.mnU) {
            case moE: {
                if (this.d(n, n2, string)) {
                    super.g(n, n2, string);
                    break;
                }
                this.close();
                break;
            }
            default: {
                super.g(n, n2, string);
            }
        }
    }

    protected ipb dhH() {
        return this.mnR;
    }

    protected ipb dhI() {
        return this.mnS;
    }

    protected void Ry(int n) {
        this.mnT = n;
    }
}

