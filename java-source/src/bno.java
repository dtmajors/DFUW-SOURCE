/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bno
extends btk {
    private Map<String, lfs<ldv, ldv>> dwB = lcn.emw();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11789: {
                this.a((fjz)dxq2);
                break;
            }
            case 11790: {
                this.a((fjx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fjz fjz2) {
        if (fjz2.iOv == 1) {
            if (!this.dwB.containsKey(fjz2.dBi)) {
                lfs lfs2 = new lfs();
                lfs2.reX = fjz2.aO();
                lfs2.reY = fjz2.dtj;
                this.dwB.put(fjz2.dBi, lfs2);
            }
        } else if (fjz2.iOv == 2 && this.dwB.containsKey(fjz2.dBi)) {
            this.dwB.remove(fjz2.dBi);
        }
    }

    private void a(fjx fjx2) {
        if (this.dwB.containsKey(fjx2.arX())) {
            lfs<ldv, ldv> lfs2 = this.dwB.get(fjx2.arX());
            if (fjx2.bQc()) {
                fjx fjx3 = (fjx)this.MessageDelegator.h(11790, fjx2.aO(), (ldv)lfs2.reX);
                fjx3.ga(fjx2.arX());
                fjx3.lf(true);
                fjx3.jM(true);
                this.MessageDelegator.F(fjx3);
                return;
            }
            fjy fjy2 = (fjy)this.MessageDelegator.h(11791, this.GUID, fjx2.aO());
            fjy2.ga(fjx2.arX());
            fjy2.iA((ldv)lfs2.reX);
            fjy2.iz((ldv)lfs2.reY);
            this.MessageDelegator.F(fjy2);
        } else {
            fjy fjy3 = (fjy)this.MessageDelegator.h(11791, this.GUID, fjx2.aO());
            fjy3.ga(fjx2.arX());
            fjy3.iA(lcr.qAC);
            fjy3.iz(lcr.qAC);
            this.MessageDelegator.F(fjy3);
        }
    }
}

