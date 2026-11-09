/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  lcr
 */
import java.util.Collection;
import java.util.Map;

public class btx
extends btk
implements bto {
    private Map<ldv, btw> dMs = lcn.emw();
    private cew dLR = null;
    private double Ec = -1.0;
    private btw dMt = null;
    private double dMu = -1.0;
    private static final double dMv = 0.1;

    public cew axF() {
        return this.dLR;
    }

    public void b(cew cew2) {
        this.dLR = cew2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dLR == null) {
            return;
        }
        if (this.dLR.aAG() == null) {
            return;
        }
        if (ldz2.rgz < this.Ec) {
            return;
        }
        this.Ec = ldz2.rgz + 0.1;
        btw btw2 = this.axI();
        if (this.dMt == null) {
            if (btw2 != null) {
                this.dMt = btw2;
                this.dMu = this.dMt.dMr.aIR();
                this.axJ();
            }
        } else if (btw2 == null) {
            this.axK();
            this.dMt = null;
            this.dMu = -1.0;
        } else if (btw2 != this.dMt) {
            this.dMt = btw2;
            this.dMu = this.dMt.dMr.aIR();
            this.axJ();
        } else if (this.dMu != this.dMt.dMr.aIR()) {
            this.dMu = this.dMt.dMr.aIR();
            this.axL();
        }
    }

    public void a(cci cci2) {
        assert (cci2 != null);
        btw btw2 = this.dMs.get(cci2.getGUID());
        if (btw2 != null) {
            lfn.b(5, "SFClanStoneManagement", "notifyClanStoneCreated() ClanStoneInfo for clanstone " + cci2.getGUID() + " already exists.");
            return;
        }
        btw2 = new btw();
        btw2.dMr = cci2;
        this.dMs.put(btw2.dMr.getGUID(), btw2);
        lfn.b(0, "SFClanStoneManagement", "notifyClanStoneCreated() Created " + btw2);
    }

    public void jH(ldv ldv2) {
        assert (ldv2 != null);
        btw btw2 = this.dMs.remove(ldv2);
        if (btw2 == null) {
            lfn.b(5, "SFClanStoneManagement", "notifyClanStoneRemoved() Could not find clanstoneinfo for clanstone " + ldv2);
            return;
        }
        if (btw2 == this.dMt) {
            this.dMt = null;
        }
        lfn.b(0, "SFClanStoneManagement", "notifyClanStoneRemoved() Removed " + btw2);
    }

    private btw axI() {
        float f2 = Float.MAX_VALUE;
        btw btw2 = null;
        Collection<btw> collection = this.dMs.values();
        for (btw btw3 : collection) {
            if (btw3.dMr.Xv() == null) continue;
            ljq ljq2 = this.dLR.aAG().av();
            ljq2.et(btw3.dMr.Xv());
            float f3 = ljq2.eqN();
            if (!(f3 <= btw3.dMr.Xu()) || !(f3 < f2)) continue;
            f2 = f3;
            btw2 = btw3;
        }
        return btw2;
    }

    private void axJ() {
        if (this.dMt.dMr.aIQ() == null || this.dMt.dMr.aIQ().isEmpty()) {
            this.k(may.ugP.bD(new Object[]{this.dMt.dMr.Xz(), this.dMt.dMr.Xt()}));
        }
    }

    private void axK() {
        if (this.dMt.dMr.aIQ() == null || this.dMt.dMr.aIQ().isEmpty()) {
            this.k(may.ugQ.bD(new Object[]{this.dMt.dMr.Xz(), this.dMt.dMr.Xt()}));
        }
    }

    private void k(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void axL() {
        if (this.dMt.dMr.aIQ() != null && !this.dMt.dMr.aIQ().isEmpty()) {
            this.k(may.ugR.bD(new Object[]{this.dMt.dMr.Xz(), this.dMt.dMr.Xt(), this.dMt.dMr.aIQ()}));
        } else {
            this.k(may.ugS.bD(new Object[]{this.dMt.dMr.Xz(), this.dMt.dMr.Xt()}));
        }
    }
}

