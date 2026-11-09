/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  lcr
 */
import java.util.Map;

public class bqa
extends btk
implements bto {
    private a dBs = a.dBy;
    private bqm.b dvV = null;
    private bql dBt = null;
    private ldv aXQ = null;
    private lip dBu = null;
    private boolean dBv = false;
    private boolean dBw = false;
    private lex dBx = null;

    public bqm.b atW() {
        return this.dvV;
    }

    public void b(bqm.b b2) {
        this.dvV = b2;
    }

    public bqk asf() {
        return this.dBt;
    }

    public void a(bql bql2) {
        this.dBt = bql2;
    }

    public ldv AW() {
        return this.aXQ;
    }

    public void iD(ldv ldv2) {
        this.aXQ = ldv2;
    }

    public lip atX() {
        return this.dBu;
    }

    public void d(lip lip2) {
        this.dBu = lip2;
    }

    public boolean atY() {
        return this.dBv;
    }

    public void dK(boolean bl2) {
        this.dBv = bl2;
    }

    public boolean atZ() {
        return this.dBw;
    }

    public void dL(boolean bl2) {
        this.dBw = bl2;
    }

    @Override
    public final void doTick(ldz ldz2) {
        assert (this.dBs == a.dBA);
        this.Active = false;
        this.MessageDelegator.hd(this.GUID);
    }

    @Override
    public final void initialize() {
        assert (this.dBs == a.dBy);
        super.initialize();
        if (this.dBw) {
            this.auc();
            this.dBs = a.dBz;
        }
        this.Active = false;
    }

    public final void ln(int n) {
        switch (n) {
            case 1: {
                if (this.dBx == null || this.dBx.rjR >= this.MessageDelegator.arc().lpr) break;
                this.I(this.dBx.iHR, this.dBx.dTe);
                this.dBx.rjR = this.MessageDelegator.arc().lpr;
                break;
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7944: {
                this.b((flr)dxq2);
                break;
            }
            case 12289: {
                this.a((fvp)dxq2);
                break;
            }
            case 12290: {
                this.a((fvv)dxq2);
                break;
            }
            case 9987: {
                this.a((gnw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public final void Ci() {
        if (this.dBs != a.dBz) {
            return;
        }
        this.aub();
        this.dBs = a.dBA;
        this.Active = true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFContainerViewManager: GUID=");
        stringBuilder.append(this.GUID);
        if (this.dBu != null) {
            stringBuilder.append(" '");
            stringBuilder.append(this.dBu.esy());
            stringBuilder.append("'");
        }
        return stringBuilder.toString();
    }

    private float aua() {
        brm brm2 = this.dBt.iF(this.aXQ);
        if (brm2 == null) {
            return 0.0f;
        }
        if (brm2 instanceof bpy) {
            return ((bpy)brm2).aXy;
        }
        return ((bqs)brm2).getWeight();
    }

    private void b(flr flr2) {
        assert (this.Initialized);
        assert (this.aXQ != null);
        Map<ldv, bsf> map = null;
        map = this.dBv ? this.dBt.aun().j(this.aXQ, this.dBt.auw()) : this.dBt.aun().jm(this.aXQ);
        fls fls2 = (fls)this.MessageDelegator.h(7945, this.GUID, flr2.aO());
        this.MessageDelegator.b(flr2, fls2);
        fls2.iPx = map;
        fls2.aXQ = this.aXQ;
        fls2.iPy = this.dBt.aum();
        fls2.iPz = this.aua();
        this.MessageDelegator.F(fls2);
    }

    private void a(fvp fvp2) {
        if (fvp2.dTe <= 0) {
            return;
        }
        if (fvp2.iTm <= 0) {
            return;
        }
        switch (fvp2.iTm) {
            case 1: {
                if (this.dBx != null) {
                    return;
                }
                this.dBx = new lex();
                this.dBx.iHR = fvp2.aO();
                this.dBx.dTe = fvp2.dTe;
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(fvv fvv2) {
        if (fvv2.iTm <= 0) {
            return;
        }
        switch (fvv2.iTm) {
            case 1: {
                if (this.dBx == null) {
                    return;
                }
                this.dBx = null;
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(gnw gnw2) {
        if (!gnw2.aO().equals(lcr.acL)) {
            return;
        }
        if (this.dBs == a.dBz) {
            this.Ci();
            this.dBt.iR(this.aXQ);
        } else {
            lfn.b(5, "SFContainerViewManager", "handleStorageSessionEndRequestMessage() Session is not active: " + (Object)((Object)this.dBs) + ". ContainerItemGUID =" + this.aXQ + ", GUID = " + this.GUID);
        }
    }

    private void I(ldv ldv2, int n) {
        fvt fvt2 = (fvt)this.MessageDelegator.h(12291, this.GUID, ldv2);
        fvt2.dTe = n;
        this.MessageDelegator.F(fvt2);
    }

    private void aub() {
        assert (this.dBs == a.dBz);
        assert (this.dBt != null);
        assert (this.aXQ != null);
        gnv gnv2 = (gnv)this.MessageDelegator.h(9986, this.GUID, lcr.acL);
        gnv2.aXQ = this.aXQ;
        gnv2.dAu = this.dBt.getGUID();
        this.MessageDelegator.F(gnv2);
    }

    private void auc() {
        assert (this.dBs == a.dBy);
        assert (this.dBt != null);
        assert (this.aXQ != null);
        gnx gnx2 = (gnx)this.MessageDelegator.h(9985, this.GUID, lcr.acL);
        gnx2.jnt = this.GUID;
        gnx2.dAu = this.dBt.getGUID();
        gnx2.aXQ = this.aXQ;
        gnx2.dBu = this.dBu;
        gnx2.jnu = this.dBt.alX();
        gnx2.big = this.dvV;
        this.MessageDelegator.F(gnx2);
    }
}

