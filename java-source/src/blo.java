/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cxd
 */
public class blo
extends bke {
    public blo() {
        this.dsy = bkd.a.dsu;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFPerformResetCoolDownsFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        fcw fcw2 = (fcw)fdo2;
        if (fcw2.aYH <= 0) {
            lfn.b(5, "SFPerformResetCoolDownsFO", "doFunction() SessionID is invalid.");
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        cbx cbx2 = (cbx)this.MessageDelegator.d(fdo2.akX);
        if (cbx2 == null) {
            lfn.b(5, "SFPerformResetCoolDownsFO", "doFunction() Could not find targetobject " + fdo2.akX);
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        if (!(cbx2 instanceof cex)) {
            lfn.b(5, "SFPerformResetCoolDownsFO", "doFunction() targetobject is not a player server object : " + fdo2.akX);
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        cex cex2 = (cex)cbx2;
        cyv cyv2 = cex2.jk();
        if (cyv2 == null) {
            lfn.b(5, "SFPerformResetCoolDownsFO", "doFunction()  player server object skill manager is null");
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        cyv2.zb(cxd.fKF);
        cyv2.y(cxd.fIv, cxd.fPL);
        if (fdo2.bOs()) {
            this.a(fdo2, true);
        }
        this.Vc();
    }
}

