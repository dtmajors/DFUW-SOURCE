/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class blh
extends bke {
    public blh() {
        this.dsy = bkd.a.dsr;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFPerformCleanDebuffsFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        fcw fcw2 = (fcw)fdo2;
        if (fcw2.aYH <= 0) {
            lfn.b(5, "SFPerformCleanDebuffsFO", "doFunction() SessionID is invalid.");
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        cbx cbx2 = (cbx)this.MessageDelegator.d(fdo2.akX);
        if (cbx2 == null) {
            lfn.b(5, "SFPerformCleanDebuffsFO", "doFunction() Could not find targetobject " + fdo2.akX);
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        this.H(fdo2.akX, fcw2.aYG);
        if (fdo2.bOs()) {
            this.a(fdo2, true);
        }
        this.Vc();
    }

    private void H(ldv ldv2, int n) {
        frj frj2 = (frj)this.MessageDelegator.h(5378, this.GUID, ldv2);
        frj2.aYG = n;
        this.MessageDelegator.F(frj2);
    }
}

