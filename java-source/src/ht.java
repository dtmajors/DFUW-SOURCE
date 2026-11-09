/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  dta
 *  dtc
 *  ha
 *  lcr
 *  lcw
 */
import java.util.Iterator;
import java.util.List;

public class ht
extends btk {
    private final List<go> adO = lcn.emv();
    private gn adP = null;
    private dtc fy = null;

    public void a(gn gn2) {
        this.adP = gn2;
    }

    public void b(dtc dtc2) {
        this.fy = dtc2;
    }

    public void ch(int n) {
        if (n <= 0) {
            lfn.b(5, "SFSessionManager", "endMonsterSessions() NodeID is invalid.");
            return;
        }
        for (go go2 : this.adO) {
            if (go2.Sy.ib() != n) continue;
            this.aV(go2.Ts);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11016: {
                this.a((gqi)dxq2);
                break;
            }
            case 11031: {
                this.a((grx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gqi gqi2) {
        if (gqi2.jpn == null) {
            lfn.b(5, "SFSessionManager", "handleCreateSessionRequest() SystemOSGUID is null.");
            return;
        }
        if (gqi2.Xe == null) {
            lfn.b(5, "SFSessionManager", "handleCreateSessionRequest() NotifyObjectGUID is null.");
            return;
        }
        switch (gqi2.jpm) {
            case 1: {
                this.a(gqi2.jpn, gqi2.Xe);
                break;
            }
            case 2: {
                this.a(gqi2.jpn, gqi2.aO(), gqi2.bBh, gqi2.jpo, gqi2.ccY, gqi2.RB);
                break;
            }
            case 3: {
                this.b(gqi2.jpn, gqi2.Xe);
                break;
            }
            default: {
                lfn.b(5, "SFSessionManager", "handleCreateSessionRequest() Invalid SessionType provided: " + gqi2.jpm);
                assert (false);
                return;
            }
        }
    }

    private void a(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        ldw ldw2 = ldx.enG().enI();
        dta dta2 = new dta();
        dta2.setGUID(ldw2.enA());
        dta2.a(ldw2);
        dta2.setActive(true);
        dta2.jF(true);
        this.fy.c(dta2);
        go go2 = new go();
        go2.Ts = this.MessageDelegator.lL(dta2.getGUID());
        go2.Sy = ldv2;
        go2.Xe = ldv3;
        this.adO.add(go2);
        hw hw2 = new hw();
        hw2.setGUID(go2.Ts);
        hw2.ae(go2.Sy);
        hw2.aX(go2.Xe);
        hw2.setDirectoryName(null);
        hw2.R(true);
        this.MessageDelegator.a(hw2);
        this.a(ldv2, true, hw2.getGUID(), ldv3, null);
    }

    private void a(ldv ldv2, ldv ldv3, int n, ljq ljq2, int n2, int n3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (n > 0);
        assert (ljq2 != null);
        hc hc2 = hc.getAccessLevelType(n2);
        if (hc2 == null) {
            hc2 = hc.aaz;
        }
        ldw ldw2 = ldx.enG().aci(20000000 + ldv3.enw());
        dta dta2 = new dta();
        dta2.setGUID(ldw2.enA());
        dta2.a(ldw2);
        dta2.setActive(true);
        dta2.jF(true);
        this.fy.c(dta2);
        go go2 = new go();
        go2.Ts = this.MessageDelegator.lL(dta2.getGUID());
        go2.Sy = ldv2;
        go2.Xe = ldv3;
        this.adO.add(go2);
        hy hy2 = new hy();
        hy2.setGUID(go2.Ts);
        hy2.ae(go2.Sy);
        hy2.aY(go2.Xe);
        hy2.setDirectoryName(null);
        hy2.R(true);
        hy2.ci(n);
        hy2.R(ljq2);
        hy2.b(new lgl());
        hy2.d(hc2);
        hy2.bU(n3);
        this.MessageDelegator.a(hy2);
        this.a(ldv2, true, hy2.getGUID(), ldv3, null);
    }

    public void aT(ldv ldv2) {
        assert (ldv2 != null);
        assert (lcw.enb());
        fv fv2 = this.adP.ar(ldv2);
        if (fv2 == null) {
            this.a(ldv2, false, null, null, null);
            return;
        }
        this.fy.a(fv2.hn());
        ha ha2 = new ha();
        ha2.setGUID(fv2.gO());
        ha2.aM(fv2.hl());
        ha2.aN("");
        ha2.bU(ldv2.ib());
        ha2.bT(fv2.az());
        ha2.O(fv2.av());
        ha2.a(new mc(ha2));
        ha2.aR("");
        ha2.a("dunno", 1);
        ha2.ae(ldv2);
        ha2.iL();
        this.MessageDelegator.a((amf)ha2);
        fv2.ag(ha2.hm());
        ha2.a(null);
    }

    private void b(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        ldw ldw2 = ldx.enG().enI();
        dta dta2 = new dta();
        dta2.setGUID(ldw2.enA());
        dta2.a(ldw2);
        dta2.setActive(true);
        dta2.jF(true);
        this.fy.c(dta2);
        go go2 = new go();
        go2.Ts = this.MessageDelegator.lL(dta2.getGUID());
        go2.Sy = ldv2;
        go2.Xe = ldv3;
        this.adO.add(go2);
        hz hz2 = new hz();
        hz2.setGUID(go2.Ts);
        hz2.ae(go2.Sy);
        hz2.aX(go2.Xe);
        this.MessageDelegator.a(hz2);
        this.a(ldv2, true, hz2.getGUID(), ldv3, null);
    }

    private void a(grx grx2) {
        if (grx2.ija <= 0) {
            lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() UpdateType is invalid.");
            return;
        }
        if (grx2.jqt) {
            this.b(grx2);
            return;
        }
        this.c(grx2);
    }

    private void b(grx grx2) {
        ldv ldv2 = grx2.Sy;
        if (ldv2 == null) {
            lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() Returned SystemOSGUID is null for SessionObjectGUID " + grx2.aO());
            return;
        }
        fv fv2 = this.adP.ar(ldv2);
        if (fv2 == null) {
            lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() No clientobject mapped to SystemOSGUID " + ldv2);
            return;
        }
        switch (grx2.ija) {
            case 1: {
                if (grx2.afF == null) {
                    lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() PlayerObjectGUID is null from sessionobject " + grx2.aO() + " for client " + fv2.hk());
                    return;
                }
                if (!grx2.jqu) {
                    lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() Update is not completed.");
                    this.a(fv2, 1);
                    return;
                }
                ldv ldv3 = null;
                ldv3 = lcw.qOS ? lcr.p((ldv)lcr.qDy, (int)fv2.hk().ib(), (int)grx2.afF.enw()) : lcr.p((ldv)lcr.qCM, (int)fv2.hk().ib(), (int)grx2.afF.enw());
                ehl ehl2 = (ehl)this.MessageDelegator.h(2330, this.GUID, lcr.qAL);
                ehl2.hC = grx2.afF;
                ehl2.bc = fv2.hl();
                ehl2.ipW = cug.va((int)fv2.az());
                ehl2.Sz = ldv3;
                ehl2.hB = fv2.aN();
                ehl2.Nationality = grx2.Nationality;
                ehl2.ff = fv2.hf() != null ? fv2.hf().ordinal() : 0;
                this.MessageDelegator.E(ehl2);
                break;
            }
            case 2: {
                fv2.c(grx2.Position);
                fv2.a(new lgl());
                ldv ldv4 = null;
                ldv4 = lcw.qOS ? lcr.p((ldv)lcr.qDy, (int)fv2.hk().ib(), (int)grx2.afF.enw()) : lcr.p((ldv)lcr.qCM, (int)fv2.hk().ib(), (int)grx2.afF.enw());
                if (fv2.hf() != null && fv2.hf().lh()) {
                    for (go go2 : this.adO) {
                        if (!go2.Sy.equals(ldv2)) continue;
                        grw grw2 = (grw)this.MessageDelegator.h(11030, ldv2, go2.Ts);
                        this.MessageDelegator.E(grw2);
                    }
                }
                ehm ehm2 = (ehm)this.MessageDelegator.h(2331, this.GUID, lcr.qAL);
                ehm2.Sz = ldv4;
                this.MessageDelegator.E(ehm2);
                this.adP.as(ldv2);
                break;
            }
            case 3: {
                ldv ldv5 = null;
                ldv5 = lcw.qOS ? lcr.p((ldv)lcr.qDy, (int)fv2.hk().ib(), (int)grx2.afF.enw()) : lcr.p((ldv)lcr.qCM, (int)fv2.hk().ib(), (int)grx2.afF.enw());
                eht eht2 = (eht)this.MessageDelegator.h(2345, this.GUID, lcr.qAL);
                eht2.hC = grx2.afF;
                eht2.iqE = fv2.hl();
                eht2.iqF = grx2.YL;
                eht2.Sz = ldv5;
                eht2.hB = fv2.aN();
                this.MessageDelegator.E(eht2);
                fv2 = this.adP.ar(ldv2);
                fv2.d(grx2.YL);
                break;
            }
            default: {
                lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() Invalid UpdateType provided from " + grx2.aO() + ": " + grx2.ija);
                return;
            }
        }
    }

    private void c(grx grx2) {
        switch (grx2.ija) {
            case 1: {
                if (grx2.Sy != null) break;
                lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() SystemOSGUID is null.");
                return;
            }
            case 2: {
                this.aU(grx2.aO());
                break;
            }
            default: {
                lfn.b(5, "SFSessionManager", "handleSessionUpdateMessage() Invalid UpdateType provided from " + grx2.aO() + ": " + grx2.ija);
                return;
            }
        }
    }

    private void aU(ldv ldv2) {
        assert (ldv2 != null);
        Iterator<go> iterator = this.adO.iterator();
        while (iterator.hasNext()) {
            go go2 = iterator.next();
            if (!go2.Ts.equals(ldv2)) continue;
            iterator.remove();
        }
    }

    private void a(fv fv2, int n) {
        fp fp2 = this.adP.bM(fv2.hk().ib());
        if (fp2 == null) {
            lfn.b(5, "SFSessionManager", "sendErrorClientAccountMessage() AccountInfo is null for systemOSGUID=" + fv2.hk());
            return;
        }
        fav fav2 = (fav)this.MessageDelegator.h(5890, this.GUID, lcr.qAO);
        fav2.Gi(n);
        fav2.v(fp2.hB);
        fav2.cS(fp2.SN);
        fav2.d(fp2.hE);
        this.MessageDelegator.F(fav2);
        fav2 = (fav)this.MessageDelegator.h(5890, this.GUID, fv2.hk());
        fav2.Gi(n);
        fav2.v(fp2.hB);
        fav2.cS(fp2.SN);
        fav2.d(fp2.hE);
        this.MessageDelegator.F(fav2);
    }

    private void a(ldv ldv2, boolean bl, ldv ldv3, ldv ldv4, String string) {
        assert (ldv2 != null);
        gqj gqj2 = (gqj)this.MessageDelegator.h(11017, this.GUID, ldv2);
        gqj2.jns = bl;
        gqj2.Ts = ldv3;
        gqj2.Xe = ldv4;
        gqj2.YL = string;
        this.MessageDelegator.I(gqj2);
    }

    private void aV(ldv ldv2) {
        assert (ldv2 != null);
        grw grw2 = (grw)this.MessageDelegator.h(11030, this.GUID, ldv2);
        this.MessageDelegator.F(grw2);
    }
}

