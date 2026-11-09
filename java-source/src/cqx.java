/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cqx
extends btk
implements bto {
    private boolean fE = true;
    private boolean eWj = false;
    private boolean eWk = false;
    private csm eWl = new csm();
    private csp eWm = new csp();
    private csn eWn = new csn();
    private csi eWo = new csi();
    private csu eWp = new csu();
    private csj eWq = new csj();
    private csl eWr = new csl();
    private css eWs = new css();
    private csr eWt = new csr();
    private cst eWu = new cst();
    private csq eWv = new csq();
    private csk eWw = new csk();
    private csh eWx = new csh();

    public cqx() {
        this.eWx.a(this);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    private void aZF() {
        this.eWl.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWl);
        this.eWm.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWm);
        this.eWn.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWn);
        this.eWo.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWo);
        this.eWp.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWp);
        this.eWq.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWq);
        this.eWr.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWr);
        this.eWs.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWs);
        this.eWt.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWt);
        this.eWu.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWu);
        this.eWv.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWv);
        this.eWw.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eWw);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.MessageDelegator.hd(this.eWl.getGUID());
        this.MessageDelegator.hd(this.eWm.getGUID());
        this.MessageDelegator.hd(this.eWn.getGUID());
        this.MessageDelegator.hd(this.eWo.getGUID());
        this.MessageDelegator.hd(this.eWp.getGUID());
        this.MessageDelegator.hd(this.eWq.getGUID());
        this.MessageDelegator.hd(this.eWr.getGUID());
        this.MessageDelegator.hd(this.eWs.getGUID());
        this.MessageDelegator.hd(this.eWt.getGUID());
        this.MessageDelegator.hd(this.eWu.getGUID());
        this.MessageDelegator.hd(this.eWv.getGUID());
        this.MessageDelegator.hd(this.eWx.getGUID());
        this.MessageDelegator.hd(this.eWw.getGUID());
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            this.fE = false;
            this.eWx.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.eWx);
            this.aZF();
        }
        if (this.eWk) {
            if (!this.eWj) {
                return;
            }
            this.Vg();
            this.eWk = false;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2575: {
                this.a((ffg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void Vg() {
        cqu cqu2 = new cqu();
        this.eWl.b(cqu2);
        this.eWm.b(cqu2);
        this.eWn.b(cqu2);
        this.eWo.b(cqu2);
        this.eWp.b(cqu2);
        this.eWq.b(cqu2);
        this.eWr.b(cqu2);
        this.eWs.b(cqu2);
        this.eWt.b(cqu2);
        this.eWu.b(cqu2);
        this.eWv.b(cqu2);
        this.eWw.b(cqu2);
        ffg ffg2 = (ffg)this.MessageDelegator.h(2575, this.getGUID(), lcr.acL);
        ffg2.iKW = cqu2;
        this.MessageDelegator.F(ffg2);
    }

    private void a(ffg ffg2) {
        if (ffg2.iKW == null) {
            this.eWj = true;
            return;
        }
        cqu cqu2 = ffg2.iKW;
        if (ffg2.iKI) {
            this.eWl.a(cqu2);
            this.eWm.a(cqu2);
            this.eWn.a(cqu2);
            this.eWo.a(cqu2);
            this.eWp.a(cqu2);
            this.eWr.a(cqu2);
            this.eWs.a(cqu2);
            this.eWt.a(cqu2);
            this.eWu.a(cqu2);
            this.eWw.a(cqu2);
            return;
        }
        this.eWl.a(cqu2);
        this.eWm.a(cqu2);
        this.eWn.a(cqu2);
        this.eWo.a(cqu2);
        this.eWp.a(cqu2);
        this.eWq.a(cqu2);
        this.eWr.a(cqu2);
        this.eWs.a(cqu2);
        this.eWt.a(cqu2);
        this.eWu.a(cqu2);
        this.eWv.a(cqu2);
        this.eWw.a(cqu2);
    }

    public csm aZG() {
        return this.eWl;
    }

    public csp aZH() {
        return this.eWm;
    }

    public csn aZI() {
        return this.eWn;
    }

    public csi aZJ() {
        return this.eWo;
    }

    public csu aZK() {
        return this.eWp;
    }

    public csj aZL() {
        return this.eWq;
    }

    public csl aZM() {
        return this.eWr;
    }

    public css aZN() {
        return this.eWs;
    }

    public csr aZO() {
        return this.eWt;
    }

    public cst aZP() {
        return this.eWu;
    }

    public csq aZQ() {
        return this.eWv;
    }

    public csh aZR() {
        return this.eWx;
    }

    public csk aZS() {
        return this.eWw;
    }

    public boolean aZT() {
        return this.eWk;
    }

    public void gJ(boolean bl) {
        this.eWk = bl;
    }
}

