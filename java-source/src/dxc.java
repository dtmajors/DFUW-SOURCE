/*
 * Decompiled with CFR.
 */
public class dxc
extends dwx
implements dwb {
    private dwo hmH = null;
    private dwo hmI = null;
    private dwo hmJ = null;

    public dwo bDY() {
        return this.hmH;
    }

    public dwo bDZ() {
        return this.hmI;
    }

    public dwo bEa() {
        return this.hmJ;
    }

    public dxc(dvh dvh2, dwf dwf2) {
        super(dvh2, dwf2);
    }

    @Override
    public void sO() {
        dwt dwt2 = dwt.CP(this.bDO().bCA());
        dwt2.a(this);
        this.bDN().a(dwt2);
    }

    @Override
    public void c(dvy dvy2) {
        if (dvy2 instanceof dwt) {
            dwt dwt2 = (dwt)dvy2;
            if (this.hmH == null) {
                this.hmH = dwt2.bDI();
                dwt dwt3 = dwt.CQ(this.bDO().bCB());
                dwt3.a(this);
                this.bDN().a(dwt3);
            } else if (this.hmI == null) {
                this.hmI = dwt2.bDI();
                dwt dwt4 = dwt.CR(this.bDO().bCB() - 1);
                dwt4.a(this);
                this.bDN().a(dwt4);
            } else {
                this.hmJ = dwt2.bDI();
                this.bDP();
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "workComplete() : Unhandled DB Worker Reported Work Complete!");
            assert (false);
            this.bDQ();
        }
    }

    @Override
    public void b(dvy dvy2) {
        lfn.b(5, this.getClass().getSimpleName(), "workFailed() : Database Worker Failed!");
        assert (false);
        this.bDQ();
    }
}

