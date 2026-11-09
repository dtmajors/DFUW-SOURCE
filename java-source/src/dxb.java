/*
 * Decompiled with CFR.
 */
import java.util.List;

public class dxb
extends dwx
implements dwb {
    private dwp hmw = null;
    private List<dwn> euM = null;

    public dwp bDJ() {
        return this.hmw;
    }

    public dxb(dvh dvh2, dwf dwf2, dwp dwp2) {
        super(dvh2, dwf2);
        this.hmw = dwp2;
    }

    private void bDX() {
        if (this.euM == null) {
            lfn.b(5, this.getClass().getSimpleName(), "assignRanks() : Entries Are Null!");
            assert (false);
            this.bDQ();
        }
        dwl dwl2 = dwl.values()[dwl.values().length - 1];
        int n2 = dwl2.bCS();
        for (dwn dwn2 : this.euM) {
            dwn2.d(dwl2);
            if (n2 > 0) {
                --n2;
            }
            if (n2 != 0) continue;
            dwl2 = dwl.getValueByOrdinal(dwl2.ordinal() - 1);
            n2 = dwl2.bCS();
        }
        dws dws2 = dws.b(this.euM, this.hmw.bDr(), this.hmw.bDt());
        if (dws2 == null) {
            this.bDP();
        } else {
            dws2.a(this);
            this.bDN().a(dws2);
        }
    }

    @Override
    public void sO() {
        dws dws2 = dws.CO(this.hmw.bDr());
        dws2.a(this);
        this.bDN().a(dws2);
    }

    @Override
    public void c(dvy dvy2) {
        if (dvy2 instanceof dws) {
            if (this.euM == null) {
                this.euM = ((dws)dvy2).bDH();
                this.bDX();
            } else {
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

