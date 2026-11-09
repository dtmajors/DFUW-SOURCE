/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
public class bmt
extends bke {
    public bmt() {
        this.dsy = bkd.a.dsg;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        fda fda2 = (fda)fdo2;
        if (fda2.Position == null) {
            this.Vc();
            return;
        }
        cex cex2 = (cex)this.d(fdo2.akX);
        if (cex2 == null) {
            this.Vc();
            return;
        }
        ldv ldv2 = cex2.aJP().getGUID();
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.GUID, ldv2);
        gqt2.a(hx.a.aeK);
        gqt2.Position = fda2.Position;
        gqt2.jpN = true;
        this.MessageDelegator.F(gqt2);
    }
}

