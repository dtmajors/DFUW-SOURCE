/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class bjo
extends btk
implements btn {
    private final bjx dpf;
    private List<cnc> dpg = lcn.emv();

    public bjo(bjx bjx2) {
        this.dpf = bjx2;
    }

    public void b(String string, ldv ldv2) {
        for (cnc cnc2 : this.dpg) {
            cnc2.hC(string);
        }
    }

    public void apO() {
        for (cnc cnc2 : this.dpg) {
            cnc2.hC(this.dpf.abk());
        }
    }

    public void apP() {
        if (!this.dpf.aqS().aqb()) {
            return;
        }
        List<bjp> list = this.dpf.aqS().aqc();
        assert (!list.isEmpty());
        for (bjp bjp2 : list) {
            glt glt2 = (glt)this.MessageDelegator.h(25089, this.getGUID(), lcr.qBH);
            glt2.l(bjp2.az());
            glt2.c(bjp2.apU());
            glt2.a(bjp2.apV());
            glt2.jS(true);
            glt2.oF(this.getGUID());
            this.MessageDelegator.F(glt2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25090: {
                this.a((glu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(glu glu2) {
        assert (glu2.bVP() != null);
        cnc cnc2 = glu2.bVP();
        cnc2.c(this);
        cnc2.Hy();
        this.MessageDelegator.a((amf)((Object)cnc2));
        this.dpg.add(cnc2);
        if (this.dpf.abj() != null && this.dpf.abk() != null) {
            cnc2.hC(this.dpf.abk());
        }
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        if (!(btk2 instanceof cnc)) {
            return false;
        }
        switch (dxq2.bEz()) {
            case 25092: {
                this.a((glx)dxq2, (cnc)((Object)btk2));
                return true;
            }
        }
        return false;
    }

    private void a(glx glx2, cnc cnc2) {
        gly gly2 = (gly)this.MessageDelegator.h(25093, cnc2.getGUID(), glx2.aO());
        this.MessageDelegator.b(glx2, gly2);
        gly2.ade = this.dpf.abj();
        gly2.add = this.dpf.abk();
        this.MessageDelegator.F(gly2);
    }
}

