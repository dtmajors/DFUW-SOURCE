/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  dtc
 */
import java.util.List;

public class iq
extends ip
implements dsy {
    private dtc agw = null;
    private List<dxq> agx = lcn.emv();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11029: {
                break;
            }
            case 11032: {
                this.a((gsn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void nh() {
        if (this.agx.isEmpty()) {
            return;
        }
        dxq dxq2 = null;
        int n = this.agx.size();
        for (int i = 0; i < n; ++i) {
            dxq2 = this.agx.get(i);
            this.agw.E(dxq2);
        }
        this.agx.clear();
    }

    @Override
    protected void a(gsn gsn2) {
        super.a(gsn2);
        if ((gsn2.bWY() & 4) > 0) {
            // empty if block
        }
    }

    private dxq f(dxq dxq2) {
        if (dxq2.amk().ib() == this.GUID.ib()) {
            return dxq2;
        }
        switch (dxq2.bEz()) {
            case 1042: 
            case 4617: 
            case 4618: 
            case 4620: 
            case 4627: 
            case 4873: 
            case 4874: 
            case 4879: 
            case 5122: 
            case 6403: 
            case 7959: 
            case 7960: 
            case 7969: 
            case 7985: 
            case 7999: 
            case 8008: 
            case 8009: 
            case 8195: 
            case 11521: 
            case 12805: 
            case 12821: 
            case 16643: 
            case 18440: 
            case 23553: 
            case 23562: {
                return dxq2;
            }
            case 4619: {
                return dxq2;
            }
            case 20482: 
            case 20483: {
                return dxq2;
            }
            case 11010: {
                return dxq2;
            }
        }
        return dxq2;
    }

    private int cp(int n) {
        int n2 = -1;
        int n3 = this.agx.size();
        for (int i = 0; i < n3; ++i) {
            dxq dxq2 = this.agx.get(i);
            if (dxq2.bEz() != n) continue;
            return i;
        }
        return n2;
    }

    @Override
    public dxq g(dxq dxq2) {
        return dxq2;
    }

    @Override
    public dxq h(dxq dxq2) {
        return this.f(dxq2);
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
        this.agw = dta2.bzt();
    }
}

