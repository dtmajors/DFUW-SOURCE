/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 */
public class com
extends col {
    private bdz ePu = null;
    private bzd enN = new bzd(this.ePt);
    private boolean ePv = false;
    private double ePw = 0.0;
    private float dZx = 500.0f;

    public com() {
        super(false);
        this.eSU = new ljq(0.0f, 10.0f, 0.0f);
        this.eSV = new lgl();
        this.byT = 50.0f;
        cuf cuf2 = lea.eov().get(cug.fnu);
        ej ej2 = cuf2.ae(14176);
        if (ej2 instanceof et) {
            this.dZx = ((et)ej2).fN();
        }
    }

    private void aVg() {
        this.ePu = new bdz((cbx)this);
        this.ePu.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.ePu);
    }

    public void doTick(ldz ldz2) {
        if (!this.ePv) {
            if (this.aAG() == null) {
                return;
            }
            if (!this.aAG().isReadyToRun()) {
                return;
            }
            if (this.ePu == null) {
                this.aVg();
            }
            this.ePv = true;
        }
        this.ePu.doTick(ldz2);
        ((bxf)this.ePt).doTick(ldz2);
        this.enN.P(ldz2);
        if (ldz2.rgz - this.ePw >= 1.0 && this.aXG() != null && this.ePu != null) {
            this.ePw = ldz2.rgz;
            this.aVh();
        }
    }

    private void aVh() {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(this.aXG());
        kji2.cq(new ljq(0.0f, -1.0f, 0.0f));
        kji2.setLength(1000.0f);
        this.MessageDelegator.a(kji2);
    }

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

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.bqd != null) {
            float f2 = Float.MAX_VALUE;
            int n = -1;
            for (int i = 0; i < kuj2.bqd.length; ++i) {
                n = kuj2.bqd[i];
                if (n != cug.fqr && n != cug.fkr) continue;
                f2 = kuj2.ilP[i].y;
                break;
            }
            if (f2 < Float.MAX_VALUE) {
                this.ePu.cF(f2 + this.dZx);
            }
        }
    }

    public void cL(float f2) {
        if (this.ePu == null) {
            return;
        }
        if (this.ePu.isActive()) {
            this.ePu.cL(f2);
        }
    }

    public void aK(ljq ljq2) {
        if (this.ePu == null) {
            return;
        }
        if (this.ePu.isActive()) {
            this.ePu.aK(ljq2);
        }
    }

    public void amY() {
    }

    public void aZ(ljq ljq2) {
        ((bxf)this.ePt).dF(ljq2.eqN());
    }

    public final void a(bzc bzc2) {
        this.enN.a(bzc2);
    }

    public void aVi() {
        assert (!this.isServerObject());
        bvm bvm2 = (bvm)this.aAG();
        bvm2.aAj().aAA();
        this.ePu.setActive(true);
        this.aXy();
        bvm2.azx().aAV();
    }

    public void aVj() {
        assert (!this.isServerObject());
        bvm bvm2 = (bvm)this.aAG();
        if (bvm2.aAj() != null) {
            bvm2.aAj().aAy();
        }
        this.ePu.setActive(false);
        if (bvm2.azx() != null) {
            bvm2.azx().aAW();
        }
    }
}

