/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.HashMap;

public class bne
extends btk {
    protected static lfo ct = new lfo("GuiTest");
    private final String Name;
    private final ldv dvT;
    private final bqm.b dvU;
    private final ldv aXQ;
    private final bqm.b dvV;

    public bne(String string, ldv ldv2, ldv ldv3, bqm.b b2, ldv ldv4, bqm.b b3) {
        this.Name = string;
        this.setGUID(ldv2);
        this.dvT = ldv4;
        this.dvU = b3;
        this.aXQ = ldv3;
        this.dvV = b2;
    }

    public final void activate() {
        gnx gnx2 = (gnx)this.MessageDelegator.h(9985, this.GUID, lcr.acL);
        gnx2.dAu = this.dvT;
        gnx2.aXQ = this.aXQ;
        gnx2.jnt = this.GUID;
        gnx2.big = this.dvU;
        gnx2.jnu = this.dvV;
        gnx2.dBu = new ljg(this.Name);
        this.MessageDelegator.F(gnx2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2 instanceof fvp) {
            this.c((fvp)dxq2);
            return;
        }
        if (dxq2 instanceof flr) {
            this.a((flr)dxq2);
            return;
        }
        super.receiveMessage(dxq2);
    }

    private void c(fvp fvp2) {
        assert (lda.by(fvp2));
    }

    private void a(flr flr2) {
        fls fls2 = (fls)this.MessageDelegator.h(7945, this.GUID, flr2.aO());
        fls2.aXQ = this.aXQ;
        fls2.iPy = 100.0f;
        fls2.iPz = 90.0f;
        fls2.iPx = new HashMap<ldv, bsf>();
        this.MessageDelegator.F(fls2);
    }
}

