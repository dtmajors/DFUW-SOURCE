/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 */
public class bmm
extends bke {
    private fda dvx = null;
    private cex dvy = null;

    public bmm() {
        this.dsy = bkd.a.drR;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        this.dvx = (fda)fdo2;
        if (this.dvx.bBh <= 0) {
            lfn.b(5, "SFPlayMonsterFO", "doFunction() MonsterResourceType is invalid.");
            this.Vc();
            return;
        }
        this.dvy = (cex)this.d(fdo2.akX);
        if (this.dvy == null) {
            lfn.b(5, "SFPlayMonsterFO", "doFunction() TargetObject " + fdo2.akX + " was not found.");
            this.Vc();
            return;
        }
        this.lg(this.dvx.bBh);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6151: {
                this.a((gfv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gfv gfv2) {
        if (gfv2.jgq) {
            lgw lgw2 = (lgw)ResourceTree.acv(this.dvx.bBh);
            assert (lgw2 != null);
            this.lh(this.dvx.bBh);
        } else {
            lfn.b(5, "SFPlayMonsterFO", "handleResourceLoadResponse() Resource '" + ResourceTree.getName(this.dvx.bBh) + "' could not be loaded.");
            this.Vc();
        }
    }

    private void lg(int n) {
        assert (n > 0);
        gfu gfu2 = (gfu)this.MessageDelegator.h(6150, this.GUID, lcr.qCq);
        gfu2.aqs = 1;
        gfu2.ResourceType = n;
        this.MessageDelegator.F(gfu2);
    }

    private void lh(int n) {
        assert (n > 0);
        ldv ldv2 = this.dvy.aJP().getGUID();
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.GUID, ldv2);
        gqt2.a(hx.a.aeF);
        if (this.dvy.aAG() == null) {
            this.Vc();
            return;
        }
        gqt2.Position = this.dvy.aAG().av();
        gqt2.bBh = n;
        this.MessageDelegator.F(gqt2);
    }
}

