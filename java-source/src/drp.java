/*
 * Decompiled with CFR.
 */
public class drp
extends drq {
    @Override
    public void jT(ldv ldv2) {
        if (this.gUf == null) {
            this.gUg = ldv2;
            this.gUf = this.MessageDelegator.bzv();
            if (mje.DBp) {
                if (this.GUID.equals(ldv2)) {
                    return;
                }
                kni kni2 = (kni)this.MessageDelegator.h(782);
                kni2.ehv = this.GUID;
                kni2.ehw = ldv2;
                kni2.biE = new ljq();
                kni2.biF = new lgl();
                kni2.doP = this.gUf;
                kni2.pPN = 8;
                kni2.ec = this.GUID;
                this.MessageDelegator.a(kni2);
            }
        }
    }
}

