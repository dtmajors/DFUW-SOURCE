/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class ckw
extends ckv {
    private boolean eHe = false;
    private ljq eHf;
    private lgl eHg;
    private String eHh;
    private bwa eld = null;
    private fuj ele = null;

    public ckw() {
        super(false);
    }

    public void cleanUp() {
        super.cleanUp();
        this.aRo();
        if (this.eld != null) {
            this.eld.cleanUp();
        }
        this.eld = null;
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

    public void b(ff ff2) {
        if (ff2.getType() == 10432) {
            this.hA(ff2.getStringValue());
        }
        super.b(ff2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1038: {
                this.a((fuj)dxq2);
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
        mhh.a(kko2);
        kko2.Position = this.eHf;
        kko2.Rotation = this.eHg;
        this.MessageDelegator.a(kko2);
        this.eHe = true;
    }

    protected void aIw() {
        super.aIw();
        this.aRp();
        this.aRn();
        if (this.ele != null) {
            this.b(this.ele);
            this.ele = null;
        }
    }

    protected void aIx() {
        super.aIx();
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
}

