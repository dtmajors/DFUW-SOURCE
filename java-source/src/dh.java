/*
 * Decompiled with CFR.
 */
public class dh
extends btk {
    private ldv ma = null;
    private ljq Position = new ljq();

    public void c(ljq ljq2) {
        this.Position = ljq2;
        this.cO();
    }

    public void cO() {
    }

    public void cP() {
        this.ma = this.MessageDelegator.lL(this.GUID);
        ksk ksk2 = (ksk)this.MessageDelegator.j(8);
        ksk2.hC(this.ma);
        ksk2.xc("3DAudioSpellStart.xml");
        this.MessageDelegator.a(ksk2);
    }
}

