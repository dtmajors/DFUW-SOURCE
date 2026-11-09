/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.util.List;

public class dtw
implements dsy {
    private dta hcm = null;

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13569: {
                this.a((fyh)dxq2);
                break;
            }
            default: {
                lfn.b(5, "SFPermissionManager", "receiveMessage() Unhandled message received from " + dxq2.aO() + ": " + dxq2.getClass().getName());
                return;
            }
        }
    }

    public dxq c(dxq dxq2, boolean bl) {
        if (bl) {
            if (this.X(dxq2)) {
                return dxq2;
            }
            return null;
        }
        if (this.W(dxq2)) {
            return dxq2;
        }
        return null;
    }

    private boolean W(dxq dxq2) {
        return true;
    }

    private boolean X(dxq dxq2) {
        return true;
    }

    public boolean a(ldv ldv2, List list) {
        return true;
    }

    public boolean a(ldv ldv2, ldv ldv3, List list) {
        return true;
    }

    public boolean b(ldv ldv2, ldv ldv3, int n, int n2) {
        return true;
    }

    private void a(fyh fyh2) {
        boolean bl = true;
        fyi fyi2 = (fyi)this.hcm.h(13570, this.hcm.getGUID(), fyh2.aO());
        fyi2.lC(bl);
        this.hcm.F((dxq)fyi2);
    }

    @Override
    public dxq g(dxq dxq2) {
        return dxq2;
    }

    @Override
    public dxq h(dxq dxq2) {
        return dxq2;
    }

    @Override
    public boolean c(amf amf2) {
        return true;
    }

    @Override
    public void d(amf amf2) {
    }

    @Override
    public void e(amf amf2) {
    }

    @Override
    public boolean f(amf amf2) {
        return true;
    }

    @Override
    public void b(dta dta2) {
        this.hcm = dta2;
    }
}

