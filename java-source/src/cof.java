/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dtn
 *  lcr
 */
import java.util.Map;

public class cof
extends coe {
    private bwa eld = null;
    private fuj ele = null;
    private boolean eHe = false;
    private ljq eHf;
    private lgl eHg;
    private String eHh;
    private ldv ePn = null;
    private int dj = -1;

    public cof() {
        super(false);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.eld != null) {
            this.eld.doTick(ldz2);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eld != null) {
            this.eld.cleanUp();
        }
        this.eld = null;
        if (this.ePn != null) {
            this.lj(this.ePn);
        }
        this.ePn = null;
        this.aRo();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1038: {
                this.a((fuj)dxq2);
                break;
            }
            case 27140: {
                this.a((gwd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fuj fuj2) {
        if (this.aAG() == null) {
            this.ele = fuj2;
            return;
        }
        this.b(fuj2);
        this.ele = null;
    }

    private void a(gwd gwd2) {
        assert (this.dj != -1);
        gwd2.jsF = lcr.ak((ldv)this.getGUID(), (int)this.dj);
        dtn dtn2 = (dtn)this.MessageDelegator.bzx().bzt().od(lcr.qzp);
        if (dtn2 != null && dtn2.bAn().Tr != null) {
            gwd2.on(dtn2.bAn().Tr);
            this.MessageDelegator.F(gwd2);
        }
    }

    @Override
    protected void aIw() {
        super.aIw();
        this.aRp();
        this.aRn();
        this.ePn = this.hH(this.aUZ().aVd());
        if (this.ele != null) {
            this.b(this.ele);
            this.ele = null;
        }
    }

    private void aRn() {
        if (this.aIj() == null) {
            return;
        }
        if (!this.aIj().ad(10432)) {
            return;
        }
        ej ej2 = this.aIj().ae(10432);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ff)) {
            return;
        }
        ff ff2 = (ff)ej2;
        this.hA(ff2.getStringValue());
    }

    private void b(fuj fuj2) {
        assert (this.aAG() != null);
        if (this.eld != null) {
            this.eld.cleanUp();
        }
        this.eld = new bwa();
        this.eld.setServerObject(false);
        this.eld.eL(false);
        this.eld.d(this.aAG());
        this.eld.setMessageDelegator(this.MessageDelegator);
        this.eld.bf(fuj2.eKm);
        this.eld.bc(fuj2.gon);
        this.eld.l(fuj2.iWX);
        this.eld.bd(fuj2.goo);
        this.eld.m(fuj2.iWY);
        this.eld.o(fuj2.oV);
        this.eld.initialize();
    }

    public void b(ff ff2) {
        if (ff2.getType() == 10432) {
            this.hA(ff2.getStringValue());
        }
        super.b(ff2);
    }

    private void hA(String string) {
        if (this.eHf == null || this.eHg == null) {
            this.aRp();
        }
        if (this.eHe && this.eHh != null && this.eHh.equalsIgnoreCase(string)) {
            return;
        }
        this.aRo();
        this.hB(string);
    }

    private void aRo() {
        if (!this.eHe) {
            return;
        }
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.ec = this.GUID;
        klb2.iWE = klb.iHB;
        klb2.hC(this.GUID);
        this.MessageDelegator.a(klb2);
        this.eHe = false;
    }

    private void hB(String string) {
        if (string == null) {
            return;
        }
        if (string.isEmpty()) {
            return;
        }
        if (this.eHf == null || this.eHg == null) {
            return;
        }
        assert (!this.eHe);
        this.eHh = string;
        kko kko2 = (kko)this.MessageDelegator.h(1041);
        kko2.iBr = false;
        kko2.hsP = false;
        kko2.ec = this.getGUID();
        kko2.Rs = this.getGUID();
        kko2.aFo = string;
        mhh.b(kko2);
        kko2.Position = this.eHf;
        kko2.Rotation = this.eHg;
        this.MessageDelegator.a(kko2);
        this.eHe = true;
    }

    private void aRp() {
        if (this.eHf != null && this.eHg != null) {
            return;
        }
        assert (this.aAG() != null);
        if (this.aAG() == null) {
            return;
        }
        Map<String, eh> map = ei.ao(this.aAG().getFileName());
        if (map == null) {
            return;
        }
        eh eh2 = map.get("AttachPoint Object Owner Display");
        if (eh2 == null) {
            return;
        }
        this.eHf = new ljq();
        this.eHg = new lgl();
        eh2.a(this.aAG().azb(), this.aAG().azc(), this.eHf, this.eHg);
    }

    private void aVa() {
        assert (this.aUZ() != null);
    }

    private ldv hH(String string) {
        ldv ldv2 = this.MessageDelegator.bzv();
        krr krr2 = (krr)this.MessageDelegator.j(1);
        assert (krr2 != null);
        krr2.aaz(1);
        krr2.aaA(2);
        krr2.xC(true);
        krr2.xc(string);
        krr2.hC(ldv2);
        krr2.setObjectType(0);
        krr2.ts(this.getGUID());
        krr2.xe("");
        krr2.xd("");
        krr2.c(this.aAG().av());
        krr2.a(this.aAG().aw());
        this.MessageDelegator.a(krr2);
        return ldv2;
    }

    private void lj(ldv ldv2) {
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        assert (klb2 != null);
        klb2.hC(ldv2);
        klb2.ts(this.getGUID());
        klb2.HX(klb.iHB);
        this.MessageDelegator.a(klb2);
        this.MessageDelegator.oa(ldv2);
    }

    public void initialize() {
        super.initialize();
    }

    public final int aso() {
        return this.dj;
    }

    public final void fb(int n) {
        this.dj = n;
    }
}

