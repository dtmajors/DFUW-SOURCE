/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lcw
 */
public class cuv
extends btk
implements bto {
    public static final lhf fyk = new lhf(20, 20);
    public static final ljq fyl = new ljq((0.0f - (float)(cuv.fyk.rmN / 2)) * lcw.qGD.x, -4000.0f, (0.0f - (float)(cuv.fyk.H / 2)) * lcw.qGD.rlV);
    public static final ljq fym = new ljq((float)(0 + cuv.fyk.rmN / 2) * lcw.qGD.x, 4000.0f, (float)(0 + cuv.fyk.H / 2) * lcw.qGD.rlV);
    public static final ljq fyn = new ljq(cuv.fym.x - cuv.fyl.x, cuv.fym.y - cuv.fyl.y, cuv.fym.rlV - cuv.fyl.rlV);
    private static final boolean fyo = false;
    private static final double fyp = 5.0;
    protected static final ljq akL = new ljq(0.0, -1.0, 0.0);
    protected static final float akO = 2000.0f;
    protected final cuu fyq;
    protected int fyr = -1;
    protected kji fys = null;
    protected ecr fyt = null;
    protected double cvV = 3000.0;
    protected double fyu = 3600.0;
    private ldv fyv = null;
    private double fyw = -this.cvV;
    private double fyx = 0.0;

    public cuv(cuu cuu2) {
        assert (cuu2 != null);
        this.fyq = cuu2;
    }

    public boolean bcd() {
        if (this.fyv != null) {
            return true;
        }
        return this.fyt != null;
    }

    public boolean bce() {
        return this.fys != null;
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bcg();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19458: {
                this.a((ecs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public boolean bcf() {
        if (!this.bcd()) {
            return false;
        }
        if (this.fyv == null) {
            return false;
        }
        this.H(this.fyv, false);
        this.fyv = null;
        return true;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    private void bcg() {
        if (this.bcd()) {
            if (this.fyw + this.fyu < this.MessageDelegator.arc().rgz && this.fyv != null) {
                this.H(this.fyv, true);
                this.fyv = null;
            }
        } else if (!this.bce() && !this.isScheduledForRemoval() && this.fyw + this.cvV < this.MessageDelegator.arc().rgz && this.fyx + 5.0 < this.MessageDelegator.arc().rgz) {
            this.fyx = this.MessageDelegator.arc().rgz + Math.random();
            this.aCY();
        }
    }

    protected ljq bch() {
        float f2 = lew.o(cuv.fyl.x, cuv.fym.x, (float)Math.random());
        float f3 = lew.o(cuv.fyl.rlV, cuv.fym.rlV, (float)Math.random());
        return new ljq(f2, 1000.0f, f3);
    }

    private void aCY() {
        ljq ljq2 = this.bch();
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(1);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(akL);
        kji2.setLength(2000.0f);
        this.MessageDelegator.a(kji2);
        this.fys = kji2;
    }

    protected void handleLineContainmentResponse(kuj kuj2) {
        assert (this.fys != null);
        this.fys = null;
        if (kuj2.bqd == null) {
            return;
        }
        if (kuj2.bqd.length <= 0) {
            return;
        }
        if (kuj2.bqd.length != 1) {
            // empty if block
        }
        if (kuj2.bqd[0] != cug.fkp && kuj2.bqd[0] != cug.fly && kuj2.bqd[0] != cug.fkr) {
            return;
        }
        assert (kuj2.ilP[0] != null);
        this.bA(kuj2.ilP[0]);
    }

    protected void bA(ljq ljq2) {
        assert (this.fyt == null);
        ldv ldv2 = null;
        if (lcw.enb()) {
            ldv2 = lcr.qBq;
        } else {
            this.fyr = this.fyq.bbl();
            ldv2 = lcr.ak((ldv)lcr.qBq, (int)this.fyr);
        }
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), ldv2);
        ecr2.sk(0);
        ecr2.l(cug.fjM);
        ecr2.c(ljq2);
        float f2 = (float)(Math.PI * Math.random());
        ecr2.a(new lgl(new ljq(0.0f, f2, 0.0f)));
        ecr2.jS(true);
        ecr2.oF(null);
        this.MessageDelegator.F(ecr2);
        this.fyt = ecr2;
    }

    private void a(ecs ecs2) {
        assert (this.fyt != null);
        assert (this.fyv == null);
        assert (ecs2.aIU() != null);
        this.fyv = ecs2.aIU();
        this.fyw = this.MessageDelegator.arc().rgz;
        this.fyt = null;
        this.fyq.a(this.fyv, this, ecs2.Ky());
    }

    private void H(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        ldv ldv3 = null;
        ldv3 = lcw.enb() ? lcr.qBq : lcr.ak((ldv)lcr.qBq, (int)this.fyr);
        ecx ecx2 = (ecx)this.MessageDelegator.h(19459, this.getGUID(), ldv3);
        ecx2.jV(false);
        ecx2.ku(ldv2);
        this.MessageDelegator.F(ecx2);
        this.fyq.a(ldv2, this, bl);
    }
}

