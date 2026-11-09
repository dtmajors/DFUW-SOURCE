/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class cnb
extends cna {
    private boolean eHe = false;
    private ljq eHf;
    private lgl eHg;
    private String eHh;

    public cnb() {
        super(false);
    }

    public void cleanUp() {
        super.cleanUp();
        this.aRo();
    }

    private void aRn() {
        if (this.aIj() == null) {
            assert (false);
            return;
        }
        if (!this.aIj().ad(10432)) {
            assert (false);
            return;
        }
        ej ej2 = this.aIj().ae(10432);
        if (ej2 == null) {
            assert (false);
            return;
        }
        if (!(ej2 instanceof ff)) {
            assert (false);
            return;
        }
        ff ff2 = (ff)ej2;
        this.hA(ff2.getStringValue());
    }

    public void b(ff ff2) {
        super.b(ff2);
        if (ff2.getType() == 10432) {
            this.hA(ff2.getStringValue());
        }
    }

    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    private void hA(String string) {
        if (this.eHf == null || this.eHg == null) {
            this.aqR();
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
        this.eHh = null;
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
        this.aqR();
        this.aRn();
    }

    private void aqR() {
        assert (this.aAG() != null);
        if (this.aAG() == null) {
            return;
        }
        Map<String, eh> map = ei.ao(this.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint Object Owner Display");
        if (eh2 == null) {
            assert (false);
            return;
        }
        this.eHf = new ljq();
        this.eHg = new lgl();
        eh2.a(this.aAG().azb(), this.aAG().azc(), this.eHf, this.eHg);
    }
}

