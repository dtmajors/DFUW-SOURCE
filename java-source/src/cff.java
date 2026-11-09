/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 */
public class cff
extends btk
implements bto {
    public static final float etX = 1.5707964f;
    private static final float etY = 1.0f;
    private final cex aaY;
    private float eir = 0.0f;
    private ljq Position = null;
    private double etZ = 0.0;
    private fdt eua = null;
    private int SkillType = -1;

    public cff(cex cex2) {
        this.aaY = cex2;
    }

    private boolean uX() {
        if (this.aaY == null) {
            return false;
        }
        if (this.aaY.aAG() == null) {
            return false;
        }
        if (this.aaY.aKu() == null) {
            return false;
        }
        if (this.aaY.aMA() == null) {
            return false;
        }
        if (this.aaY.aMA().hk() == null) {
            return false;
        }
        if (this.aaY.aAG().azb() == null) {
            return false;
        }
        if (this.aaY.aJD() == null) {
            return false;
        }
        if (this.aaY.aJD().aEP() == null) {
            return false;
        }
        return this.MessageDelegator != null;
    }

    private void aNl() {
        this.Position = null;
        this.eir = 0.0f;
        this.etZ = 0.0;
        this.eua = null;
        this.SkillType = -1;
    }

    private float o(lgl lgl2) {
        if (lgl2 == null) {
            return 0.0f;
        }
        float f2 = lgl2.eqU();
        if (f2 < 0.0f) {
            f2 = (float)(Math.PI * 2 + (double)f2);
        }
        return f2;
    }

    public void aNm() {
        this.fW(false);
        this.aNn();
        this.aNl();
    }

    @Override
    public void doTick(ldz ldz2) {
        float f2;
        if (this.eua == null) {
            return;
        }
        if (!this.uX()) {
            this.fW(false);
            this.aNn();
            this.aNl();
            return;
        }
        if (!this.eua.bOv() && !((cat)this.aaY.aKu()).aGR()) {
            this.fW(false);
            this.aNn();
            this.aNl();
            return;
        }
        if (this.SkillType != -1 || this.aaY.aJD().aEP().Ow()) {
            this.fW(false);
            this.aNn();
            this.aNl();
            return;
        }
        float f3 = this.Position.eA(this.aaY.aAG().azb());
        if (f3 > 1.0f) {
            this.fW(false);
            this.aNn();
            this.aNl();
            return;
        }
        if (!this.eua.bOy() && ((f2 = (float)((double)(f2 = Math.abs(this.o(this.aaY.aAG().aw()) - this.eir)) > Math.PI ? Math.PI * 2 - (double)f2 : (double)f2)) > this.eua.bOz() || f3 > 1.0f)) {
            this.fW(false);
            this.aNn();
            this.aNl();
            return;
        }
        if (ldz2.rgz > this.etZ) {
            this.fW(true);
            this.aNn();
            this.aNl();
        }
    }

    public void pF(int n) {
        this.SkillType = n;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9250: {
                this.a((fdt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void fW(boolean bl) {
        if (this.eua == null || this.MessageDelegator == null) {
            return;
        }
        if (bl && !this.eua.bOx()) {
            return;
        }
        fdu fdu2 = (fdu)this.MessageDelegator.h(9251, this.eua.amk(), this.eua.aO());
        this.MessageDelegator.b(this.eua, fdu2);
        fdu2.kW(bl);
        this.MessageDelegator.F(fdu2);
    }

    private void aNn() {
        if (this.aaY == null || this.aaY.aMA() == null || this.aaY.aMA().hk() == null || this.MessageDelegator == null) {
            return;
        }
        ldv ldv2 = lcr.ak((ldv)this.aaY.getGUID(), (int)this.aaY.aMA().hk().ib());
        eeu eeu2 = (eeu)this.MessageDelegator.h(12808, this.GUID, ldv2);
        eeu2.inN = cxd.k.getProgressTypeToMessage(cxd.k.fRK);
        eeu2.aCK = ldv2;
        eeu2.dBp = 0.0;
        this.MessageDelegator.E(eeu2);
    }

    private void bp(double d2) {
        if (this.aaY == null || this.aaY.aMA() == null || this.aaY.aMA().hk() == null || this.MessageDelegator == null) {
            return;
        }
        ldv ldv2 = lcr.ak((ldv)this.aaY.getGUID(), (int)this.aaY.aMA().hk().ib());
        eeu eeu2 = (eeu)this.MessageDelegator.h(12808, this.GUID, ldv2);
        eeu2.inN = cxd.k.getProgressTypeToMessage(cxd.k.fRK);
        eeu2.aCK = ldv2;
        eeu2.ioa = false;
        eeu2.aXq = this.MessageDelegator.arc().rgz;
        eeu2.dBo = this.etZ;
        eeu2.dBp = this.etZ;
        this.MessageDelegator.E(eeu2);
    }

    private void a(fdt fdt2) {
        if (this.eua != null) {
            this.fW(false);
            this.aNn();
            this.aNl();
            this.eua = fdt2;
            this.fW(false);
            this.aNl();
            return;
        }
        this.eua = fdt2;
        this.SkillType = -1;
        if (!this.uX()) {
            this.fW(false);
            this.aNl();
            return;
        }
        this.Position = this.aaY.aAG().av();
        this.eir = this.o(this.aaY.aAG().azc());
        this.etZ = this.MessageDelegator.arc().rgz + fdt2.bOw();
        this.bp(fdt2.bOw());
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.eua != null) {
            this.fW(false);
        }
    }
}

