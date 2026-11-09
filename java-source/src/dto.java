/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  dtn
 *  lcr
 *  lcw
 */
import java.util.Map;

public class dto
extends dtn {
    private final Map<ldv, a> hcN = lcn.emw();
    private final Map<ldv, dyc> hcO = lcn.emw();
    private final Map<ldv, dst> hcP = lcn.emw();
    private boolean hcQ = false;
    private int YF = 5;

    public dto(ag ag2) {
        super(ag2);
    }

    public final Map<ldv, dst> bAp() {
        return this.hcP;
    }

    public void doTick(ldz ldz2) {
        this.nx = ldz2;
        super.doTick(ldz2);
        if (lcw.enb() && this.hct == dtn.a.hcH && !this.hcQ) {
            if (lcw.qGX && this.YF > 0) {
                --this.YF;
                return;
            }
            this.bAq();
            this.hcQ = true;
        }
    }

    protected void a(fvr fvr2) {
        switch (fvr2.bEz()) {
            case 12294: {
                this.handleObserverObserveStatusMessage((fvu)fvr2);
                break;
            }
            default: {
                super.a(fvr2);
            }
        }
    }

    protected void a(dst dst2) {
        Object object;
        assert (dst2 != null);
        cbx cbx2 = (cbx)this.fy.d(dst2.afK);
        if (cbx2 == null) {
            lfn.b(5, "SFSystemObjectSpaceAI", "notifyCharacterAssembled() Could not find physicalobject " + dst2.afK);
            assert (false);
            return;
        }
        if (cbx2 instanceof cdw) {
            object = (cdw)((Object)this.fy.d(dst2.afK));
            ((cdw)object).kz(dst2.Xe);
        } else {
            object = (cpz)((Object)this.fy.d(dst2.afK));
            ((cpz)((Object)object)).lH(dst2.Xe);
        }
        object = (dyc)this.h(13314, this.GUID, dst2.Xe);
        if (cbx2 instanceof asd) {
            ((dyc)object).iiC = (asd)cbx2;
        } else {
            ((dyc)object).iiD = (cpz)cbx2;
        }
        this.hcO.put(dst2.Ui, (dyc)object);
        this.sendAddStatusObserverMessage(dst2.Ui);
        ldv ldv2 = dst2.afK.bFk();
        if (this.hcP.containsKey(ldv2)) {
            lfn.b(5, "SFSystemObjectSpaceAI", "notifyCharacterAssembled() COI for " + dst2.afK + " already exists");
        } else {
            this.hcP.put(ldv2, dst2);
        }
    }

    protected final void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11019: {
                this.a((gqm)dxq2);
                break;
            }
            case 11014: {
                this.a((gqf)dxq2);
                break;
            }
            case 11096: {
                this.a((gsw)dxq2);
                break;
            }
            case 11015: {
                this.a((gqg)dxq2);
                break;
            }
            case 11017: {
                this.a((gqj)dxq2);
                break;
            }
            case 11027: {
                this.a((gpa)dxq2);
                break;
            }
            case 11044: {
                this.a((gru)dxq2);
                break;
            }
            case 13318: {
                this.b((dyt)dxq2);
                break;
            }
            case 13330: {
                this.a((dyx)dxq2);
                break;
            }
            case 13320: {
                this.a((dyv)dxq2);
                break;
            }
            case 13322: {
                this.a((dyf)dxq2);
                break;
            }
            case 13326: {
                this.a((dyo)dxq2);
                break;
            }
            case 13313: {
                this.a((dyz)dxq2);
                break;
            }
            case 13336: {
                this.ni();
                break;
            }
            case 13337: {
                this.a((dyh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void aS(ljq ljq2) {
        assert (ljq2 != null);
        dld dld2 = this.aj();
        dld2.setGUID(lcr.rg);
        dld2.c(ljq2);
        dld2.d(new ljq());
        this.a(dld2);
        dle dle2 = this.bAj();
        dle2.setGUID(lcr.qBT);
        dle2.c(dld2.av());
        dle2.a(dld2.aw());
        this.a(dle2);
        this.hcu.dPx();
    }

    private void bAq() {
        assert (lcw.enb()) : "Not standalone";
        fp fp2 = new fp(hc.aaz);
        fp2.di = 7000;
        fp2.hB = 0;
        fp2.SN = 0;
        fp2.hE = "AI";
        fp2.SP = "";
        gpo gpo2 = (gpo)this.fy.h(11059, this.GUID, lcr.Wu);
        gpo2.joL = true;
        gpo2.joK = fp2;
        this.fy.E((dxq)gpo2);
    }

    private void a(gqm gqm2) {
        if (gqm2.jpp) {
            Object object;
            this.hct = dtn.a.hcJ;
            if (!this.hcN.isEmpty()) {
                for (a a2 : this.hcN.values()) {
                    this.b(a2.bBm, a2.Position, a2.hcS);
                }
            }
            if (lcw.enb() && !lcw.qGW) {
                object = new ljq(0.0f, 0.0f, 0.0f);
                this.aS((ljq)object);
            }
            if (!lcw.qGQ) {
                object = (fob)this.h(11521, this.GUID, lcr.qzt);
                ((fof)object).cd("xml-files/worlddata/" + lcw.qHH);
                ((fob)object).lh(false);
                this.F((dxq)object);
            } else {
                object = (fow)this.h(3845, this.GUID, lcr.qEn);
                this.F((dxq)object);
            }
        } else {
            this.hcv.V();
        }
    }

    private void a(dyf dyf2) {
        if (dyf2.aZF <= 0) {
            return;
        }
        String string = null;
        switch (dyf2.aZF) {
            case 36: {
                string = "ATTACK SPEED: VERY FAST";
                arw.bSc = arw.a.bSo;
                break;
            }
            case 37: {
                string = "ATTACK SPEED: FAST";
                arw.bSc = arw.a.bSl;
                break;
            }
            case 38: {
                string = "ATTACK SPEED: NORMAL";
                arw.bSc = arw.a.bSm;
                break;
            }
            case 39: {
                string = "ATTACK SPEED: SLOW";
                arw.bSc = arw.a.bSn;
                break;
            }
            case 40: {
                string = "ATTACK SPEED: VERY SLOW";
                arw.bSc = arw.a.bSp;
                break;
            }
            case 33: {
                string = "ENABLE_IDLE";
                arw.bRW = dyf2.iiE;
                break;
            }
            case 30: {
                string = "ENABLE_BATTLE_ROYAL";
                arw.bRT = dyf2.iiE;
                break;
            }
            case 32: {
                string = "ENABLE_GLOBAL_SPAWNING";
                arw.bRV = dyf2.iiE;
                if (!arw.bRV) break;
                arw.bRU = false;
                break;
            }
            case 31: {
                string = "ENABLE_GLOBAL_DESPAWNING";
                arw.bRU = dyf2.iiE;
                if (!arw.bRU) break;
                arw.bRV = false;
                break;
            }
            case 34: {
                string = "ENABLE_MONSTERS_CHATTER";
                arw.bRX = dyf2.iiE;
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(dyo dyo2) {
        if (dyo2.dVm <= 0) {
            return;
        }
        String string = null;
        switch (dyo2.dVm) {
            case 1: {
                string = "AI_GLOBAL_RESPAWN_DELAY";
                arw.bRP = dyo2.iiT;
                break;
            }
            default: {
                return;
            }
        }
    }

    private void b(dyt dyt2) {
        assert (this.hct != dtn.a.hcH);
        if (dyt2.bBm == null) {
            return;
        }
        if (dyt2.Position == null) {
            return;
        }
        a a2 = this.hcN.get(dyt2.bBm);
        if (a2 != null) {
            dyu dyu2 = (dyu)this.h(13319, this.GUID, dyt2.aO());
            dyu2.acV = false;
            this.F(dyu2);
            return;
        }
        a2 = new a(this);
        a2.bBm = dyt2.bBm;
        a2.Position = dyt2.Position;
        a2.hcS = dyt2.hcS;
        this.hcN.put(dyt2.bBm, a2);
        this.b(a2.bBm, a2.Position, a2.hcS);
        dyu dyu3 = (dyu)this.h(13319, this.GUID, dyt2.aO());
        dyu3.acV = true;
        this.F(dyu3);
    }

    private void a(dyx dyx2) {
        if (dyx2.bBm == null) {
            return;
        }
        if (dyx2.Position == null) {
            return;
        }
        this.c(dyx2.bBm, dyx2.Position, dyx2.hcS);
    }

    private void a(dyv dyv2) {
        assert (this.hct != dtn.a.hcH);
        if (dyv2.bBm == null) {
            return;
        }
        a a2 = this.hcN.remove(dyv2.bBm);
        if (a2 == null) {
            dyw dyw2 = (dyw)this.h(13321, this.GUID, dyv2.aO());
            dyw2.ije = false;
            this.F(dyw2);
            this.hcN.put(dyv2.bBm, a2);
            return;
        }
        if (a2.hcR == null) {
            assert (a2.hcT == null) : a2;
            a2.hcT = dyv2;
            return;
        }
        this.aW(a2.hcR);
        dyw dyw3 = (dyw)this.h(13321, this.GUID, dyv2.aO());
        dyw3.ije = true;
        this.F(dyw3);
    }

    private void a(gqf gqf2) {
        if (gqf2.hcR == null) {
            return;
        }
        if (gqf2.bBm == null) {
            return;
        }
        a a2 = this.hcN.get(gqf2.bBm);
        if (a2 == null) {
            return;
        }
        a2.hcR = gqf2.hcR;
        if (a2.hcT != null) {
            this.a(a2.hcT);
        }
    }

    private void a(gsw gsw2) {
    }

    private void a(gqg gqg2) {
        if (gqg2.Xe == null) {
            return;
        }
        dst dst2 = new dst();
        dst2.Xe = gqg2.Xe;
        dst2.gYI = gqg2;
        this.b(dst2);
        gqi gqi2 = (gqi)this.h(11016, this.GUID, lcr.qAH);
        gqi2.jpn = this.GUID;
        gqi2.Xe = dst2.Xe;
        gqi2.jpm = cug.vX((int)gqg2.Za) ? 3 : 1;
        this.E(gqi2);
    }

    private void a(gqj gqj2) {
        dst dst2;
        if (gqj2.jns) {
            assert (gqj2.Ts != null);
            assert (gqj2.Xe != null);
            dst2 = this.M(gqj2.Xe, true);
            if (dst2 == null) {
                return;
            }
            if (dst2.gYI == null) {
                return;
            }
        } else {
            return;
        }
        dst2.Ts = gqj2.Ts;
        gqg gqg2 = dst2.gYI;
        gqg2.f(this.GUID);
        gqg2.on(dst2.Ts);
        this.F(gqg2);
        dst2.gYI = null;
    }

    private void handleObserverObserveStatusMessage(fvu fvu2) {
        if (fvu2.iXT == null) {
            lfn.b(5, "SFSystemObjectSpaceAI", "handleObserverObserveStatusMessage() ObservedObjectGUID is null.");
            return;
        }
        dyc dyc2 = this.hcO.remove(fvu2.iXT);
        if (dyc2 == null) {
            lfn.b(5, "SFSystemObjectSpaceAI", "handleObserverObserveStatusMessage() No AIMessage mapped to GUID " + fvu2.iXT);
            assert (false);
            return;
        }
        this.F(dyc2);
    }

    private void a(gpa gpa2) {
        switch (gpa2.ilE) {
            case 1: {
                assert (gpa2.aea > 0);
                assert (gpa2.jot != null);
                assert (gpa2.aTc != null);
                assert (gpa2.jou != null);
                assert (gpa2.jov != null);
                assert (gpa2.eFu > 0);
                dst dst2 = this.M(gpa2.aO(), false);
                if (dst2 == null) {
                    lfn.b(5, "SFSystemObjectSpaceAI", "handleCharacterInfoNotificationMessage() Could not find a characterobjectinfo with SessionObjectGUID=" + gpa2.aO());
                    return;
                }
                dst2.afK = this.nU(gpa2.jot);
                dst2.Ui = this.nU(gpa2.aTc);
                dst2.gYJ = this.nU(gpa2.jou);
                dst2.dAu = this.nU(gpa2.jov);
                dst2.eFu = gpa2.eFu;
                dst2.Yc = dst2.afK.bFk();
                dst2.gYK = false;
                dst2.gYL = false;
                dst2.gYM = false;
                dst2.gYN = false;
                dst2.gYO = false;
                dst2.gYP = false;
                dst2.gYQ = false;
                dst2.gYR = false;
                dst2.gYS = 0;
                dyd dyd2 = (dyd)this.h(13317, this.GUID, dst2.Xe);
                dyd2.Ts = dst2.Ts;
                dyd2.SA = dst2.afK;
                dyd2.Ui = dst2.Ui;
                dyd2.dAu = dst2.dAu;
                dyd2.aTc = gpa2.aTc;
                this.F(dyd2);
                break;
            }
            case 4: {
                lfn.b(5, "SFSystemObjectSpaceAI", "handleCharacterInfoNotificationMessage() MonsterObject could not be created.");
                assert (false);
                return;
            }
            case 8: {
                assert (gpa2.aea > 0);
                assert (gpa2.jot != null);
                assert (gpa2.aTc != null);
                dst dst3 = this.M(gpa2.aO(), false);
                if (dst3 == null) {
                    lfn.b(5, "SFSystemObjectSpaceAI", "handleCharacterInfoNotificationMessage() Could not find a characterobjectinfo with SessionObjectGUID=" + gpa2.aO());
                    return;
                }
                dst3.afK = this.nU(gpa2.jot);
                dst3.Ui = this.nU(gpa2.aTc);
                dst3.Yc = dst3.afK.bFk();
                dst3.gYK = false;
                dst3.gYL = false;
                dst3.gYM = false;
                dst3.gYN = true;
                dst3.gYO = true;
                dst3.gYP = false;
                dst3.gYQ = true;
                dst3.gYR = true;
                dst3.gYS = 0;
                dyd dyd3 = (dyd)this.h(13317, this.GUID, dst3.Xe);
                dyd3.Ts = dst3.Ts;
                dyd3.SA = dst3.afK;
                dyd3.Ui = dst3.Ui;
                dyd3.dAu = null;
                dyd3.aTc = gpa2.aTc;
                this.F(dyd3);
                break;
            }
            default: {
                lfn.b(5, "SFSystemObjectSpaceAI", "handleCharacterInfoNotificationMessage() InfoType is invalid: " + gpa2.ilE);
                assert (false);
                return;
            }
        }
        this.ok(gpa2.aO());
    }

    private void a(dyz dyz2) {
        lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "***handleAITestMessage() GUID " + this.getGUID() + " GUIDserver:" + this.bzF() + " numSpawnpoints: " + this.hcN.size());
    }

    private void ni() {
        for (ldv ldv2 : this.hcN.keySet()) {
            dza dza2 = (dza)this.h(13336, this.GUID, ldv2);
            this.F(dza2);
        }
    }

    private void a(dyh dyh2) {
        for (ldv ldv2 : this.hcN.keySet()) {
            dyh dyh3 = (dyh)this.h(13337, this.GUID, ldv2);
            dyh3.Db(dyh2.bEL());
            this.F(dyh3);
        }
    }

    private void b(dyz dyz2) {
        lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "***handleAITestMessage() GUID " + this.getGUID() + " GUIDserver:" + this.bzF() + " numSpawnpoints: " + this.hcN.size());
    }

    private void a(gru gru2) {
        if (gru2.Ui == null) {
            return;
        }
        int n = lcr.Wu.ib();
        grv grv2 = (grv)this.h(11045, this.GUID, gru2.aO());
        this.b(gru2, grv2);
        grv2.Ui = gru2.Ui;
        grv2.dj = n;
        this.F(grv2);
    }

    private void sendAddStatusObserverMessage(ldv ldv2) {
        assert (ldv2 != null);
        fvq fvq2 = (fvq)this.h(12292, this.GUID, this.GUID);
        fvq2.hcg = 2;
        fvq2.hch = ldv2;
        this.a(fvq2);
    }

    private void b(ldv ldv2, ljq ljq2, float f2) {
        assert (ldv2 != null);
        assert (ljq2 != null);
        gqe gqe2 = (gqe)this.h(11013, this.GUID, lcr.qAJ);
        gqe2.Sy = this.GUID;
        gqe2.jpf = false;
        gqe2.bBm = ldv2;
        gqe2.Position = ljq2;
        gqe2.hcS = f2;
        this.E(gqe2);
    }

    private void c(ldv ldv2, ljq ljq2, float f2) {
        assert (ldv2 != null);
        a a2 = this.hcN.get(ldv2);
        if (a2 == null) {
            lfn.b(5, "SFSystemObjectSpaceAI", "sendSystemUpdateAOIRequest(): Could not find SFSpawnPointInfo for " + ldv2);
            return;
        }
        if (a2.hcR == null) {
            lfn.b(5, "SFSystemObjectSpaceAI", "sendSystemUpdateAOIRequest(): AOIGUID is null for " + ldv2);
            return;
        }
        gsv gsv2 = (gsv)this.h(11095, this.GUID, lcr.qAJ);
        gsv2.Sy = this.GUID;
        gsv2.hcR = a2.hcR;
        gsv2.Position = ljq2;
        gsv2.hcS = f2;
        this.E(gsv2);
    }

    private void aW(ldv ldv2) {
        assert (ldv2 != null);
        grq grq2 = (grq)this.h(11046, this.GUID, lcr.qAJ);
        grq2.Sy = this.GUID;
        grq2.hcR = ldv2;
        this.E(grq2);
    }
}

