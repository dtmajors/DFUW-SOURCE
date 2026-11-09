/*
 * Decompiled with CFR.
 */
public class cmm
extends cml {
    private static final String eKj = "shaderwatercoast.xml";
    private static final String eKk = "shaderdefault.xml";
    private String eKl = null;

    public cmm() {
        super(false);
    }

    public void aIw() {
        super.aIw();
        this.eKl = eKk;
        String string = this.aAG().getObjectDescriptionFilename();
        String string2 = "xml/" + string;
        jxa jxa2 = new jxa();
        String string3 = jxa2.uY(string2);
        if (string3 != null) {
            this.eKl = string3;
        }
    }

    public void b(eq eq2, boolean bl) {
        if (eq2.getType() == 1280) {
            this.eKl = eq2.getBooleanValue() ? eKj : eKk;
            this.hE(this.eKl);
        }
    }

    private void hE(String string) {
        assert (this.isReadyToRun());
        assert (string != null);
        if (this.MessageDelegator == null) {
            return;
        }
        kpt kpt2 = (kpt)this.MessageDelegator.h(3585);
        kpt2.ts(this.GUID);
        kpt2.hC(this.aAG().axa());
        kpt2.gW(string);
        kpt2.JD(1);
        kpt2.mc(true);
        this.MessageDelegator.a(kpt2);
    }
}

