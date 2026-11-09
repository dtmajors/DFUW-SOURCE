/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  lcr
 *  lcw
 */
public class cwl
extends cwk
implements bto {
    public static final int fFb = 1;
    private cng fFc = null;
    private boolean fFd = false;
    private cng fFe = null;
    private boolean fFf = false;
    private boolean fFg = false;
    private double fFh = 0.0;
    private boolean dOL = false;
    private boolean bpI = false;
    private lex fFi = null;

    public cwl(int n) {
        super(n, false);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.bpI) {
            if (this.fFg && this.fFh <= ldz2.rgz) {
                this.bdC();
                this.ln(1);
            }
        } else {
            if (this.fFc == null || !this.fFc.arY()) {
                return;
            }
            if (this.fFe == null || !this.fFe.arY()) {
                return;
            }
            this.bpI = true;
            if (lcw.enb() && !this.fEU) {
                return;
            }
            this.fFc.aJC().asf().a(new bra(this){
                final /* synthetic */ cwl fFj;
                {
                    this.fFj = cwl2;
                }

                public void avv() {
                    cwl.a(this.fFj, false);
                    cwl.b(this.fFj, false);
                    cwl.a(this.fFj);
                    cwl.a(this.fFj, 1);
                }
            });
            this.fFe.aJC().asf().a(bqm.b.dEI);
            this.fFe.aJC().asf().a(new bra(this){
                final /* synthetic */ cwl fFj;
                {
                    this.fFj = cwl2;
                }

                public void avv() {
                    cwl.a(this.fFj, false);
                    cwl.b(this.fFj, false);
                    cwl.a(this.fFj);
                    cwl.a(this.fFj, 1);
                }
            });
            this.bdE();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12289: {
                this.a((fvp)dxq2);
                break;
            }
            case 12290: {
                this.a((fvv)dxq2);
                break;
            }
            case 4871: {
                this.a((gau)dxq2);
                break;
            }
            case 4878: {
                this.b((gbb)dxq2);
                break;
            }
            case 4879: {
                this.a((gbc)dxq2);
                break;
            }
            case 18438: {
                this.a((gxk)dxq2);
                break;
            }
            case 18440: {
                this.c((gxm)dxq2);
                break;
            }
            case 18441: {
                this.a((gxb)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void lR(ldv ldv2) {
        if (this.fEV.equals(ldv2)) {
            assert (this.fFc == null);
            this.fFc = (cng)((Object)this.d(ldv2));
        } else if (this.fEW.equals(ldv2)) {
            assert (this.fFe == null);
            this.fFe = (cng)((Object)this.d(ldv2));
        } else {
            return;
        }
        this.Active = true;
    }

    private void bdB() {
        this.fFg = true;
        this.fFh = this.MessageDelegator.arc().rgz + 1.0;
    }

    private void bdC() {
        this.fFg = false;
        this.fFh = 0.0;
    }

    private float bdD() {
        assert (this.bpI);
        if (this.fFc == null) {
            return 0.0f;
        }
        if (this.fFe == null) {
            return 0.0f;
        }
        if (this.fFe.aJC() == null) {
            return 0.0f;
        }
        if (this.fFe.aJC().asf() == null) {
            return 0.0f;
        }
        float f2 = this.bdt().aFh().aJC().asf().aun().awj();
        float f3 = this.fFc.aJC().asf().aun().awj();
        float f4 = this.fFe.aJC().asf().aun().awj();
        return f2 - f3 + f4;
    }

    private void a(fvp fvp2) {
        if (fvp2.dTe <= 0) {
            return;
        }
        if (fvp2.iTm <= 0) {
            return;
        }
        switch (fvp2.iTm) {
            case 1: {
                if (this.fFi != null) {
                    return;
                }
                this.fFi = new lex();
                this.fFi.iHR = fvp2.aO();
                this.fFi.dTe = fvp2.dTe;
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(fvv fvv2) {
        if (fvv2.iTm <= 0) {
            return;
        }
        switch (fvv2.iTm) {
            case 1: {
                if (this.fFi == null) {
                    return;
                }
                this.fFi = null;
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(gau gau2) {
        assert (this.fEK == cwg.a.fEM);
        if (gau2.fEV == null) {
            return;
        }
        if (gau2.fEW == null) {
            return;
        }
        if (gau2.fEX == null) {
            return;
        }
        this.fEK = cwg.a.fEO;
        this.fEU = gau2.fEU;
        this.fEV = lcr.ak((ldv)gau2.fEV, (int)this.GUID.ib());
        this.fEW = lcr.ak((ldv)gau2.fEW, (int)this.GUID.ib());
        this.fEX = gau2.fEX;
        this.atc = gau2.atc;
        this.atf = gau2.atf;
        this.fEY = gau2.fEY;
        this.fEZ = gau2.fEZ;
        this.iL(this.fEV);
        this.iL(this.fEW);
    }

    private void b(gbb gbb2) {
        gbb gbb3;
        assert (this.fEK != cwg.a.fEM);
        ldv ldv2 = this.bdv();
        if (!gbb2.aO().tV(ldv2)) {
            return;
        }
        this.fEK = cwg.a.fEQ;
        if (lcw.enb() && !this.fEU) {
            this.fEV = null;
            this.fEW = null;
            this.bdw();
            return;
        }
        if (this.fFc != null) {
            gbb2.f(this.GUID);
            gbb2.on(this.fEV);
            this.MessageDelegator.F(gbb2);
        }
        if (this.fFe != null) {
            gbb3 = (gbb)gbb2.clone();
            gbb3.f(this.GUID);
            gbb3.on(this.fEW);
            this.MessageDelegator.F(gbb3);
        }
        if (this.dOL) {
            gbb3 = (gbb)this.MessageDelegator.h(4878, this.GUID, lcr.acL);
            this.MessageDelegator.F(gbb3);
        }
        this.fEV = null;
        this.fEW = null;
        this.fEX = null;
        this.fFc = null;
        this.fFe = null;
        this.dOL = false;
        this.bdw();
    }

    private void a(gbc gbc2) {
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        this.fEK = cwg.a.fEP;
        gbc2.f(this.GUID);
        gbc2.on(this.bdv());
        this.MessageDelegator.F(gbc2);
        if (!lcw.enb() && !this.fEU) {
            this.fFc = null;
            this.fFe = null;
            return;
        }
        if (lcw.enb()) {
            gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, lcr.acL);
            this.MessageDelegator.F(gbb2);
            gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, this.fEV);
            this.MessageDelegator.F(gbb2);
            gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, this.fEW);
            this.MessageDelegator.F(gbb2);
            this.fFc = null;
            this.fFe = null;
            this.dOL = false;
        }
    }

    private void a(gxb gxb2) {
        switch (gxb2.ija) {
            case 1: {
                this.fFd = gxb2.eOq;
                this.fFf = gxb2.eOq;
                break;
            }
            case 2: {
                if (this.fFf == gxb2.eOq) {
                    return;
                }
                this.fFf = gxb2.eOq;
                break;
            }
            case 3: {
                if (this.fFd == gxb2.eOq) {
                    return;
                }
                this.fFd = gxb2.eOq;
                break;
            }
            default: {
                return;
            }
        }
        if (this.bpI) {
            this.bdB();
            this.ln(1);
        }
    }

    private void a(gxk gxk2) {
        bqk bqk2;
        bqv bqv2;
        cev cev2;
        assert (this.bpI);
        gxl gxl2 = (gxl)this.MessageDelegator.h(18439, this.GUID, gxk2.aO());
        gxl2.fFd = this.fFd;
        gxl2.fFf = this.fFf;
        gxl2.fFg = this.fFg;
        gxl2.bih = bqm.dDz;
        cwc cwc2 = this.bdt();
        if (cwc2 != null && (cev2 = cwc2.aFh()) != null && (bqv2 = cev2.aJC()) != null && (bqk2 = bqv2.asf()) != null) {
            gxl2.bih = bqk2.aum();
        }
        gxl2.jts = this.bdD();
        this.MessageDelegator.F(gxl2);
    }

    private void c(gxm gxm2) {
        if (this.fEK == cwg.a.fEP) {
            return;
        }
        assert (this.bpI);
        assert (this.fFc != null);
        assert (this.fFe != null);
        if (this.fFg) {
            this.ln(1);
            return;
        }
        if (this.fFd == gxm2.eOq) {
            this.ln(1);
            return;
        }
        if (this.fFe.aJC() == null) {
            this.ln(1);
            return;
        }
        if (this.fFe.aJC().asf() == null) {
            this.ln(1);
            return;
        }
        this.fFd = gxm2.eOq;
        this.bdB();
        gxm2.f(this.GUID);
        gxm2.on(this.bdv());
        if (this.fFd) {
            gxm2.eOr = this.fFc.aJC().asf().aun().avX();
            gxm2.eOs = this.fFe.aJC().asf().aun().avX();
            if (gxm2.eOr.length == 0 && gxm2.eOs.length == 0) {
                this.fFd = false;
                this.bdC();
                this.ln(1);
                return;
            }
        }
        this.MessageDelegator.F(gxm2);
        this.ln(1);
    }

    private void ln(int n) {
        switch (n) {
            case 1: {
                if (this.fFi == null || this.fFi.rjR >= this.MessageDelegator.arc().lpr) break;
                this.I(this.fFi.iHR, this.fFi.dTe);
                this.fFi.rjR = this.MessageDelegator.arc().lpr;
                break;
            }
        }
    }

    private void I(ldv ldv2, int n) {
        assert (ldv2 != null);
        fvt fvt2 = (fvt)this.MessageDelegator.h(12291, this.GUID, ldv2);
        fvt2.dTe = n;
        this.MessageDelegator.F(fvt2);
    }

    private void bdE() {
        assert (this.fFc != null);
        assert (this.fFe != null);
        assert (this.bpI);
        assert (!this.dOL);
        gxj gxj2 = (gxj)this.MessageDelegator.h(18437, this.GUID, lcr.acL);
        gxj2.fFl = this.GUID;
        gxj2.fEX = this.fEX;
        boolean bl = lcw.qOR;
        bqa bqa2 = this.fFc.B(this.GUID, bl);
        assert (bqa2 != null);
        gxj2.jti = bqa2.getGUID();
        gxj2.jtj = bqa2.asf().getGUID();
        gxj2.jtk = bqa2.AW();
        gxj2.jtl = bqa2.asf().alX();
        gxj2.jtm = bqa2.atW();
        bqa bqa3 = this.fFe.B(this.GUID, bl);
        assert (bqa3 != null);
        gxj2.jtn = bqa3.getGUID();
        gxj2.jto = bqa3.asf().getGUID();
        gxj2.jtp = bqa3.AW();
        gxj2.jtq = bqa3.asf().alX();
        gxj2.jtr = bqa3.atW();
        gxj2.fEU = this.fEU;
        gxj2.fEY = this.fEY;
        gxj2.atf = this.atf;
        gxj2.atc = this.atc;
        gxj2.fEZ = this.fEZ;
        gxj2.fFa = this.fFa;
        this.MessageDelegator.F(gxj2);
        this.dOL = true;
    }

    static /* synthetic */ boolean a(cwl cwl2, boolean bl) {
        cwl2.fFd = bl;
        return cwl2.fFd;
    }

    static /* synthetic */ boolean b(cwl cwl2, boolean bl) {
        cwl2.fFf = bl;
        return cwl2.fFf;
    }

    static /* synthetic */ void a(cwl cwl2) {
        cwl2.bdB();
    }

    static /* synthetic */ void a(cwl cwl2, int n) {
        cwl2.ln(n);
    }
}

