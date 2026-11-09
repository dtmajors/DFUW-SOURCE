/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Map;

public class bix
extends btk
implements bto {
    private int dnu = 0;
    private boolean dnv = false;
    private Map<ldv, a> dnw = lcn.emw();
    private Map<ldv, a> dnx = lcn.emw();
    private Map<ldv, b> dny = lcn.emw();

    ldv a(int n, bjb bjb2) {
        b b2 = new b(this);
        b2.GUID = this.MessageDelegator.bzv();
        b2.dnD = bjb2;
        b2.dnE = n;
        b2.dnF = 0;
        b2.dnG = 0;
        this.dny.put(b2.GUID, b2);
        return b2.GUID;
    }

    boolean w(ldv ldv2, boolean bl2) {
        b b2 = this.dny.remove(ldv2);
        if (b2 == null) {
            return false;
        }
        if (bl2) {
            b2.dnD.apw();
        }
        this.MessageDelegator.oa(b2.GUID);
        return true;
    }

    ldv a(biy biy2, float f, float f2, float f3, float f4) {
        a a2 = new a(this);
        a2.GUID = this.MessageDelegator.bzv();
        a2.dnA = biy2;
        kos kos2 = (kos)this.MessageDelegator.h(532);
        kos2.pTa = true;
        kos2.ts(this.GUID);
        kos2.wD(true);
        kos2.lQ(true);
        kos2.xt(true);
        kos2.sy(ldv.rfe);
        kos2.Ue = f4;
        kos2.pTs = new ljq(f, f2, f3);
        this.MessageDelegator.a(kos2);
        a2.dnz = kos2;
        this.dnw.put(a2.GUID, a2);
        return a2.GUID;
    }

    void x(ldv ldv2, boolean bl2) {
        a a2 = this.dnw.get(ldv2);
        if (a2.dnz != null) {
            a2.ScheduledForRemoval = true;
        } else {
            this.hB(a2.GUID);
        }
        if (bl2) {
            a2.dnA.apt();
        }
    }

    void hB(ldv ldv2) {
        a a2 = this.dnw.remove(ldv2);
        assert (a2.Ud != null);
        assert (a2.dnz == null);
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.ts(this.GUID);
        kov2.wD(false);
        kov2.sy(a2.Ud);
        this.MessageDelegator.a(kov2);
        this.MessageDelegator.oa(ldv2);
        this.dnx.remove(a2.Ud);
    }

    public void a(kwr kwr2) {
        for (a a2 : this.dnw.values()) {
            if (a2.dnz == null || !a2.dnz.getGUID().equals(kwr2.ev)) continue;
            a2.dnz = null;
            if (kwr2.getResult() != 0) {
                a2.Ud = ldv.rfd;
            } else {
                a2.Ud = kwr2.axa();
                this.dnx.put(a2.Ud, a2);
            }
            return;
        }
    }

    public void a(kvx kvx2) {
        a a2 = this.dnx.get(kvx2.dJs);
        if (a2 == null) {
            return;
        }
        boolean bl2 = false;
        if (kvx2.qfe != null && kvx2.qfe.length != 0) {
            for (ldv ldv2 : kvx2.qfe) {
                if (!a2.dnB.remove(ldv2)) continue;
                bl2 = true;
            }
        }
        if (kvx2.qfb != null && kvx2.qfb.length != 0) {
            int n = kvx2.qfb.length;
            for (int i = 0; i < n; ++i) {
                ldv ldv2;
                int n2 = kvx2.qfc[i];
                if (!cug.vM((int)n2) || a2.dnB.contains(ldv2 = kvx2.qfb[i])) continue;
                a2.dnB.add(ldv2);
                bl2 = true;
            }
        }
        if (bl2) {
            a2.dnA.kM(a2.dnB.size());
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 530: {
                this.a((kvx)ktv2);
                break;
            }
            case 531: {
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    void a(gpx gpx2) {
        this.dnv = false;
        for (b b2 : this.dny.values()) {
            if (b2.dnF + b2.dnE > this.dnu) continue;
            b2.dnF = this.dnu;
            b2.dnG = gpx2.ctJ;
            b2.dnD.kN(b2.dnG);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11086: {
                this.a((gpx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dny.isEmpty()) {
            return;
        }
        if (this.dnv) {
            return;
        }
        if (ldz2.rgz - (double)this.dnu >= 1.0) {
            this.dnu = (int)ldz2.rgz;
            gpw gpw2 = (gpw)this.MessageDelegator.h(11085, this.getGUID(), lcr.hac);
            this.MessageDelegator.I(gpw2);
            this.dnv = true;
        }
    }
}

