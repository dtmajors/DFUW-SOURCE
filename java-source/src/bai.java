/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  baf
 *  lcr
 */
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

final class bai
extends btk {
    private boolean cHr = false;
    private boolean cMt = false;
    private ayd cCy = null;
    private azn cwP = null;
    private bak cxb = null;
    private Set<baf> cHt = null;
    private Set<baf> cHu = null;
    private boolean cHv = true;
    private int cHw = 0;
    private boolean cHx = true;
    private int cHy = 0;
    private boolean cHz = true;
    private int cHA = 0;
    private baf cMu = null;
    private bag cMv = null;
    private etj cMw = null;
    private Set<ldv> cMx = null;
    private Queue<etj> cMy = null;

    bai(ayd ayd2, azn azn2, bak bak2) {
        this.cCy = ayd2;
        this.cwP = azn2;
        this.cxb = bak2;
    }

    boolean aez() {
        return this.cHr;
    }

    boolean fg(ldv ldv2) {
        return this.cxb.eg(ldv2);
    }

    int Y(int n, int n2) {
        return this.cxb.Y(n, n2);
    }

    void o(ldv ldv2, boolean bl) {
        this.cxb.o(ldv2, bl);
    }

    void p(ldv ldv2, boolean bl) {
        this.cxb.p(ldv2, bl);
    }

    double fP(ldv ldv2) {
        return this.cxb.fP(ldv2);
    }

    void r(ldv ldv2, boolean bl) {
        azh azh2 = bl ? azh.cEl : azh.cEm;
        this.cxb.a(ldv2, azh2, false, false);
        azb azb2 = this.cCy.eb(ldv2);
        if (azb2 != null) {
            this.cCy.i(may.ugY.bD(new Object[]{azb2.Xz(), azb2.Xt(), azh2.getLength()}));
        }
    }

    void b(ldv ldv2, String string, bbr bbr2) {
        this.cxb.b(ldv2, string, bbr2);
    }

    boolean dV(ldv ldv2) {
        return this.cCy.dV(ldv2);
    }

    boolean eo(ldv ldv2) {
        baf baf2 = this.fQ(ldv2);
        if (baf2 == null) {
            return true;
        }
        return baf2.aeX();
    }

    boolean aeA() {
        return this.cHt != null && !this.cHt.isEmpty();
    }

    int aeB() {
        return this.aeA() ? this.cHt.size() : 0;
    }

    boolean eg(ldv ldv2) {
        if (!this.aeA() || ldv2 == null) {
            return false;
        }
        for (baf baf2 : this.cHt) {
            if (!baf2.aeP().afQ() || baf2.fG(ldv2) == null) continue;
            return true;
        }
        return false;
    }

    long eh(ldv ldv2) {
        if (!this.aeA() || ldv2 == null) {
            return 0L;
        }
        long l = 0L;
        for (baf baf2 : this.cHt) {
            if (!baf2.aeP().afQ() || baf2.fG(ldv2) == null && !baf2.fI(ldv2) || l >= baf2.aeW()) continue;
            l = baf2.aeW();
        }
        return l;
    }

    boolean ei(ldv ldv2) {
        if (!this.aeA()) {
            bad.a(1, this.getClass().getSimpleName(), this.cCy, "isCityInChallenge", "No challenges are active!");
            return false;
        }
        for (baf baf2 : this.cHt) {
            if (!baf2.acm().equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    boolean fh(ldv ldv2) {
        if (this.cHu != null && !this.cHu.isEmpty()) {
            for (baf baf2 : this.cHu) {
                if (!baf2.acm().equals(ldv2)) continue;
                return true;
            }
        }
        return false;
    }

    baf fQ(ldv ldv2) {
        if (!this.aeA() || ldv2 == null) {
            return null;
        }
        for (baf baf2 : this.cHt) {
            if (!ldv2.equals(baf2.acm())) continue;
            return baf2;
        }
        return null;
    }

    baf fR(ldv ldv2) {
        if (this.cHu != null && !this.cHu.isEmpty()) {
            for (baf baf2 : this.cHu) {
                if (!baf2.acm().equals(ldv2)) continue;
                return baf2;
            }
        }
        return null;
    }

    public bay[] fk(ldv ldv2) {
        if (!this.aeA()) {
            return new bay[0];
        }
        int n = 0;
        for (baf object : this.cHt) {
            if (!object.fb(ldv2)) continue;
            ++n;
        }
        if (n == 0) {
            return new bay[0];
        }
        bay[] bayArray = new bay[n];
        n = 0;
        for (baf baf2 : this.cHt) {
            if (!baf2.fb(ldv2)) continue;
            bayArray[n++] = baf2.fc(ldv2);
        }
        return bayArray;
    }

    public azx[] aaw() {
        if (!this.aeA()) {
            return new azx[0];
        }
        azx[] azxArray = new azx[this.cHt.size()];
        int n = 0;
        for (baf baf2 : this.cHt) {
            azxArray[n++] = baf2.aeo();
        }
        return azxArray;
    }

    boolean aeC() {
        return this.cHw == 0;
    }

    boolean aeD() {
        return this.cHy == 0;
    }

    boolean aeE() {
        return this.cHA == 0;
    }

    void k(ldv ldv2, boolean bl) {
        if (!this.aeA()) {
            bad.a(1, this.getClass().getSimpleName(), this.cCy, "loseConquest", "No challenges are active!");
            return;
        }
        for (baf baf2 : this.cHt) {
            if (!baf2.acm().equals(ldv2)) continue;
            if (bl) {
                baf2.adT();
                continue;
            }
            baf2.ahI();
        }
    }

    void dG(ldv ldv2) {
        if (!this.aeA()) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "notifyPeaceTreatyNegotiated", "Notification received, but no challenges are active!");
            return;
        }
        for (baf baf2 : this.cHt) {
            if (baf2.fG(ldv2) == null) continue;
            baf2.dG(ldv2);
        }
    }

    void acz() {
        if (!this.aeA()) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "notifyClanEmpty", "Notification received, but no challenges are active!");
            return;
        }
        for (baf baf2 : this.cHt) {
            baf2.acz();
        }
    }

    void fK(ldv ldv2) {
        if (!this.aeA()) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "notifyCityWon", "Notification received, but no challenges are active!");
            return;
        }
        for (baf baf2 : this.cHt) {
            baf2.fK(ldv2);
        }
    }

    void fm(ldv ldv2) {
        if (!this.aeA()) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "notifyAbortRequested", "Notification received, but no challenges are active!");
            return;
        }
        if (ldv2 != null) {
            for (baf baf2 : this.cHt) {
                if (!baf2.acm().equals(ldv2)) continue;
                baf2.adT();
            }
        } else {
            for (baf baf3 : this.cHt) {
                baf3.adT();
            }
        }
    }

    void a(baf baf2) {
        this.cxb.a(baf2.acm(), false, 0.0, 0.0, 0.0, this.MessageDelegator.arc().rgz);
    }

    void b(baf baf2) {
        this.cxb.c((azu)baf2);
        this.cxb.a(baf2.acm(), true, 0.0, baf2.aeY(), baf2.afa(), this.MessageDelegator.arc().rgz);
    }

    void a(azu azu2, ldv ldv2) {
        this.cxb.a(azu2, ldv2);
    }

    void c(baf baf2) {
        this.cxb.a(baf2.acm(), true, 0.0, baf2.aeY(), baf2.afa(), this.MessageDelegator.arc().rgz);
    }

    void acA() {
        if (!this.aeA()) {
            return;
        }
        for (baf baf2 : this.cHt) {
            baf2.acA();
        }
    }

    void aeF() {
        if (!this.cHr) {
            this.aim();
        }
    }

    private void aim() {
        this.cHr = false;
        this.cMv = null;
        this.cMu = null;
        this.cMw = null;
        if (this.cMy == null || this.cMy.isEmpty()) {
            if (this.cMt) {
                return;
            }
            bad.a(1, this.getClass().getSimpleName(), this.cCy, "checkForPendingClanChallengeRequests", "No pending requests waiting... handing over to attacker manager to check for pending attack challenge requests!");
            this.cMt = true;
            this.cxb.aiu();
            this.cMt = false;
        } else {
            etj etj2 = this.cMy.poll();
            this.cMx.remove(etj2.bLy());
            bad.a(1, this.getClass().getSimpleName(), this.cCy, "checkForPendingClanChallengeRequests", "Processing next pending request, " + this.cMy.size() + " remaining pending request(s)!");
            this.b(etj2);
        }
    }

    boolean r(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19971: {
                return this.b((esz)dxq2);
            }
        }
        return false;
    }

    private boolean b(esz esz2) {
        if (!this.aeA()) {
            return false;
        }
        for (baf baf2 : this.cHt) {
            if (!baf2.acm().equals(esz2.acm())) continue;
            return true;
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19984: {
                this.b((etj)dxq2);
                break;
            }
            case 19983: {
                this.a((ete)dxq2);
                break;
            }
            case 19977: {
                this.a((etb)dxq2);
                break;
            }
            case 19971: {
                this.a((esz)dxq2);
                break;
            }
            case 19980: {
                this.a((evf)dxq2);
                break;
            }
            case 19994: {
                this.a((esx)dxq2);
                break;
            }
            case 19987: {
                this.b((eth)dxq2);
                break;
            }
            case 20025: {
                this.a((etn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    void c(nm nm2) {
        if (!this.aeA()) {
            return;
        }
        if (nm2.aDD == null) {
            nm2.aDD = lcn.emA();
        }
        for (baf baf2 : this.cHt) {
            nm2.aDD.add(baf2.adN());
        }
    }

    void d(nm nm2) {
        if (nm2.aDD == null) {
            this.cxb.cJ(true);
            return;
        }
        for (np np2 : nm2.aDD) {
            if (bac.getValueByOrdinal(np2.aEg) != bac.cIU) continue;
            ++this.cHw;
            ++this.cHy;
            ++this.cHA;
        }
        if (this.cHw == 0) {
            this.cxb.cJ(true);
            return;
        }
        for (np np2 : nm2.aDD) {
            if (bac.getValueByOrdinal(np2.aEg) != bac.cIU) continue;
            baf baf2 = new baf(this.cCy, this.cwP, this);
            baf2.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a((amf)baf2);
            if (this.cHu == null) {
                this.cHu = lcn.emx();
            }
            this.cHu.add(baf2);
            baf2.a(np2);
        }
        if (this.cHu == null || this.cHu.isEmpty()) {
            this.cxb.cJ(true);
        }
    }

    void a(baf baf2, boolean bl) {
        --this.cHw;
        this.cHv &= bl;
        if (!bl) {
            if (this.cHu != null) {
                this.cHu.remove(baf2);
            }
            this.MessageDelegator.hd(baf2.getGUID());
            this.MessageDelegator.oa(baf2.getGUID());
        }
        if (this.cHw == 0) {
            this.cxb.cJ(this.cHv);
        }
    }

    void aeH() {
        if (this.cHu == null || this.cHu.isEmpty()) {
            this.cxb.cK(true);
            return;
        }
        for (baf baf2 : this.cHu) {
            baf2.adO();
        }
    }

    void b(baf baf2, boolean bl) {
        --this.cHy;
        this.cHx &= bl;
        if (!bl) {
            if (this.cHu != null) {
                this.cHu.remove(baf2);
            }
            this.MessageDelegator.hd(baf2.getGUID());
            this.MessageDelegator.oa(baf2.getGUID());
        }
        if (this.cHy == 0) {
            this.cxb.cK(this.cHx);
        }
    }

    void aeI() {
        if (this.cHu == null || this.cHu.isEmpty()) {
            this.cxb.cL(true);
            return;
        }
        for (baf baf2 : this.cHu) {
            baf2.adP();
        }
    }

    void c(baf baf2, boolean bl) {
        --this.cHA;
        this.cHz &= bl;
        if (bl) {
            if (this.cHt == null) {
                this.cHt = lcn.emx();
            }
            this.cHt.add(baf2);
            this.cxb.a(baf2.acm(), true, 0.0, baf2.aeY(), baf2.afa(), baf2.aeO());
        } else {
            if (this.cHu != null) {
                this.cHu.remove(baf2);
            }
            this.MessageDelegator.hd(baf2.getGUID());
            this.MessageDelegator.oa(baf2.getGUID());
        }
        if (this.cHA == 0) {
            this.cxb.cL(this.cHz);
        }
    }

    void doTick(ldz ldz2) {
        if (this.aeA()) {
            Iterator<baf> iterator = this.cHt.iterator();
            while (iterator.hasNext()) {
                baf baf2 = iterator.next();
                if (baf2.aeP().afQ()) {
                    baf2.doTick(ldz2);
                }
                if (baf2.aeP() != bab.cIQ || baf2.adJ()) continue;
                bad.a(1, this.getClass().getSimpleName(), this.cCy, "doTick", "Active Challenge Ended... Challenge = " + baf2.toString());
                iterator.remove();
                this.MessageDelegator.hd(baf2.getGUID());
                this.MessageDelegator.oa(baf2.getGUID());
                this.cxb.b((azu)baf2);
            }
        }
    }

    private void a(etj etj2) {
        assert (this.cMu != null);
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendConquestClanChallengeResponseMessage", "Sending response to " + etj2.aO() + "... Result = Success!");
        etk etk2 = (etk)this.MessageDelegator.h(19985, this.GUID, etj2.aO());
        this.MessageDelegator.b(etj2, etk2);
        etk2.x(this.cCy.getGUID(), this.cCy.iV());
        etk2.eY(this.cMu.getGUID());
        etk2.jl(this.cMu.aat());
        etk2.cm(this.cMu.aeO());
        etk2.Fe(this.cMu.ahJ());
        etk2.t(this.cMu.aeU(), this.cMu.aeV(), this.cMu.ahN());
        etk2.Ff(this.cMu.ahK());
        etk2.c(this.cMu.aeP());
        etk2.cn(this.cMu.aeQ());
        etk2.co(this.cMu.aeR());
        etk2.cp(this.MessageDelegator.arc().rgz);
        this.MessageDelegator.F(etk2);
    }

    private void a(etj etj2, int n) {
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendConquestClanChallengeResponseMessage", "Sending response to " + etj2.aO() + "... Result = Failure! Reason = " + n);
        etk etk2 = (etk)this.MessageDelegator.h(19985, this.GUID, etj2.aO());
        this.MessageDelegator.b(etj2, etk2);
        etk2.Fd(n);
        etk2.x(this.cCy.getGUID(), this.cCy.iV());
        etk2.eY(lcr.qAC);
        this.MessageDelegator.F(etk2);
    }

    private void a(etj etj2, int n, double d2) {
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendConquestClanChallengeResponseMessage", "Sending response to " + etj2.aO() + "... Result = Failure! Reason = Too Soon! Wait Time = " + d2);
        etk etk2 = (etk)this.MessageDelegator.h(19985, this.GUID, etj2.aO());
        this.MessageDelegator.b(etj2, etk2);
        etk2.Fd(n);
        etk2.cm(d2);
        etk2.x(this.cCy.getGUID(), this.cCy.iV());
        etk2.eY(lcr.qAC);
        this.MessageDelegator.F(etk2);
    }

    private void b(evf evf2) {
        evg evg2 = (evg)this.MessageDelegator.h(19981, this.cCy.getGUID(), evf2.aO());
        this.MessageDelegator.b(evf2, evg2);
        evg2.iDO = false;
        this.MessageDelegator.F(evg2);
    }

    private void a(esx esx2, int n, double d2) {
        assert (esx2 != null);
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "sendConquestAdjustTimerResponseMessage", "Sending response to " + esx2.aO() + "... Result = " + n);
        esy esy2 = (esy)this.MessageDelegator.h(19995, this.cCy.getGUID(), esx2.aO());
        this.MessageDelegator.b(esx2, esy2);
        esy2.DR(n);
        esy2.ck(d2);
        this.MessageDelegator.F(esy2);
    }

    private void b(etj etj2) {
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Clan-challenge request received from " + etj2.aO());
        if (this.cxb.aez()) {
            if (this.cMx == null) {
                this.cMx = lcn.emx();
            }
            if (this.cMy == null) {
                this.cMy = lcn.emA();
            }
            if (!this.cMx.contains(etj2.bLy())) {
                this.cMx.add(etj2.bLy());
                this.cMy.offer(etj2);
                bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Clan-challenge request, from " + etj2.bLy() + " queued... " + this.cMy.size() + " pending request(s) waiting!");
            } else {
                bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Duplicate clan-challenge request received, from " + etj2.bLy() + "... Ignoring it!");
            }
            return;
        }
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Check #1 Passed... Continuing...");
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Check #2 Passed... Continuing...");
        if (!this.cCy.ea(etj2.bLw())) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Clan does not own the challenged city (Check #3)!");
            this.a(etj2, 2);
            this.aim();
            return;
        }
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Check #3 Passed... Continuing...");
        if (this.cxb.aiA() && !bad.agC()) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Clan already in active attack challenge (Check #4a)... Cannot counter-challenge!");
            this.a(etj2, 3);
            this.aim();
            return;
        }
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Check #4 Passed... Continuing...");
        if (this.aeA()) {
            if (this.cHt.size() >= bad.agx()) {
                bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Too many active challenges (Check #5a)! Active Challenges = " + this.cHt.size());
                this.a(etj2, 4);
                this.aim();
                return;
            }
            for (baf baf2 : this.cHt) {
                if (!baf2.acm().equals(etj2.bLw())) continue;
                if (baf2.fG(etj2.bKb()) != null) {
                    bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Clan is already a part of the active challenge for this city (Check #5b1)!");
                    this.a(etj2, 5);
                    this.aim();
                    return;
                }
                if (baf2.ahJ() >= bad.agz()) {
                    bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Maximum number of attakers already challenging for this city (Check #5b2)! Attackers = " + baf2.ahJ());
                    this.a(etj2, 6);
                    this.aim();
                    return;
                }
                if (!baf2.aeP().c(etj2.bLG(), baf2.aeQ())) {
                    bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Attacker cannot join challenge in the current phase (Check #5b3)! Current Phase = " + (Object)((Object)baf2.aeP()));
                    this.a(etj2, 7);
                    this.aim();
                    return;
                }
                if (baf2.fJ(etj2.bKb())) {
                    bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Attacker has previously been removed from this challenge, they cannot rejoin (Check #5b4)!");
                    this.a(etj2, 10);
                    this.aim();
                    return;
                }
                bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "All required checks passed!... Including attacker in an existing challenge!");
                this.cHr = true;
                this.cMu = baf2;
                this.cMv = new bag(etj2);
                this.cMw = etj2;
                this.a(etj2);
                return;
            }
            if (this.cHt.size() >= bad.agy()) {
                bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Too many cities being challenged (Check #5c)! Cities Being Challenged = " + this.cHt.size());
                this.a(etj2, 8);
                this.aim();
                return;
            }
        }
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Check #5 Passed... Continuing...");
        if (this.cxb.aiy() > 0.0) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Too soon after another challenge was accepted to accept another being issued (Check #6)!");
            this.a(etj2, 9, this.cxb.aiy());
            this.aim();
            return;
        }
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Check #6 Passed... Continuing...");
        if (this.cxb.fP(etj2.bLw()) > 0.0) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "City is still in grace-period and cannot be challenged at this time (Check #7)!");
            this.a(etj2, 11, this.cxb.fP(etj2.bLw()));
            this.aim();
            return;
        }
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "Check #7 Passed... Continuing...");
        this.cHr = true;
        this.cMu = new baf(this.cCy, this.cwP, this);
        this.cMu.k(this.cCy.eb(etj2.bLw()));
        this.cMu.setGUID(this.MessageDelegator.bzv());
        this.cMu.au(this.MessageDelegator.arc().rgz);
        this.MessageDelegator.a((amf)this.cMu);
        this.cMv = new bag(etj2);
        this.cMw = etj2;
        this.cCy.dW(etj2.bKb());
        this.a(etj2);
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeRequestMessage", "All checks passed!... Sending response and awaiting acknowledgement...");
    }

    private void a(ete ete2) {
        assert (this.cHr);
        assert (this.cMu != null);
        assert (this.cMv != null);
        assert (this.cMw != null);
        bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeAcknowledgedMessage", "Acknowlegement recieved from " + ete2.aO() + "... Challenge Accepted = " + ete2.bLo());
        if (ete2.bLo()) {
            this.cMv.jm(ete2.bLp());
            this.cMv.fM(ete2.aie());
            this.cMv.jo(ete2.ahL());
            this.cMu.a(this.cMv);
            if (this.cMu.aeP() == bab.cIN) {
                bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeAcknowledgedMessage", "Starting new active challenge!");
                if (this.cHt == null) {
                    this.cHt = lcn.emx();
                }
                this.cMu.jt(this.cxb.aat());
                this.cHt.add(this.cMu);
                if (!this.cMu.ahO()) {
                    bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeAcknowledgedMessage", "Challenge Failed to Start!!!!!");
                    assert (false);
                }
                this.cxb.ait();
                this.cxb.aiz();
                this.cxb.a((azu)this.cMu);
            }
            this.cCy.dX(this.cMv.iG());
            this.cCy.a(this.cMv.iG(), this.cMv.iV(), null);
        } else {
            if (this.cMu.ahJ() == 0) {
                bad.a(1, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengeAcknowledgedMessage", "Releasing challenge, as no attackers exist!");
                this.MessageDelegator.hd(this.cMu.getGUID());
                this.MessageDelegator.oa(this.cMu.getGUID());
            }
            this.cCy.dX(this.cMv.iG());
        }
        this.aim();
    }

    private void a(etb etb2) {
        if (!this.aeA()) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestCityStructureDestructionSensorResponseMessage", "Response message received, but no challenges are active! Message = " + etb2);
            return;
        }
        for (baf baf2 : this.cHt) {
            if (!baf2.acm().equals(etb2.aO())) continue;
            baf2.receiveMessage((dxq)etb2);
        }
    }

    private void a(esz esz2) {
        if (!this.aeA()) {
            bad.a(0, this.getClass().getSimpleName(), this.cCy, "handleConquestBindStoneDeadMessage", "Message received, but no challenges are active! Message = " + esz2);
            return;
        }
        for (baf baf2 : this.cHt) {
            if (!baf2.acm().equals(esz2.acm())) continue;
            baf2.ahP();
        }
    }

    private void a(evf evf2) {
        if (!this.aeA()) {
            this.b(evf2);
            return;
        }
        for (baf baf2 : this.cHt) {
            baf2.receiveMessage((dxq)evf2);
        }
    }

    private void a(esx esx2) {
        if (!this.aeA()) {
            this.a(esx2, 1, 0.0);
            return;
        }
        for (baf baf2 : this.cHt) {
            if (!baf2.acm().equals(esx2.acm())) continue;
            if (baf2.aF(esx2.bLm())) {
                this.a(esx2, 6, 0.0);
            } else {
                this.a(esx2, 4, 0.0);
            }
            return;
        }
        this.a(esx2, 1, 0.0);
    }

    private void b(eth eth2) {
        baf baf2 = null;
        if (this.cHu != null) {
            for (baf baf3 : this.cHu) {
                if (!baf3.acm().equals(eth2.acm())) continue;
                baf2 = baf3;
                break;
            }
        }
        if (baf2 == null) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestClanChallengePersistenceRestoreRequestMessage", "Cannot find challenge for city in restore request!!!... CityGUID = " + eth2.acm().fk());
            assert (false);
            eti eti2 = (eti)this.MessageDelegator.h(19988, this.cCy.getGUID(), eth2.aO());
            eti2.jO(false);
            eti2.cz("");
            eti2.al(new ljq());
            eti2.cD(this.cCy.iV());
            this.MessageDelegator.F(eti2);
        } else {
            baf2.receiveMessage((dxq)eth2);
        }
    }

    private void a(etn etn2) {
        baf baf2 = null;
        if (this.cHu != null && !this.cHu.isEmpty()) {
            for (baf baf3 : this.cHu) {
                if (!baf3.acm().equals(etn2.aiC().aiK())) continue;
                baf2 = baf3;
                break;
            }
        }
        if (baf2 == null && this.cHt != null && !this.cHt.isEmpty()) {
            for (baf baf3 : this.cHt) {
                if (!baf3.acm().equals(etn2.aiC().aiK())) continue;
                baf2 = baf3;
                break;
            }
        }
        if (baf2 == null) {
            bad.a(5, this.getClass().getSimpleName(), this.cCy, "handleConquestMercenaryChallengePersistenceRestoreRequestMessage", "Cannot find challenge for city in restore request!!!... CityGUID = " + etn2.aiC().aiK().fk());
            assert (false);
            eto eto2 = (eto)this.MessageDelegator.h(20026, this.cCy.getGUID(), etn2.aO());
            eto2.jO(false);
            eto2.D(etn2.aiC());
            this.MessageDelegator.F(eto2);
        } else {
            baf2.receiveMessage((dxq)etn2);
        }
    }

    @Override
    public String toString() {
        String string = "Clan = " + this.cCy.iV() + " " + this.cCy.getGUID();
        String string2 = "Active Challenges = " + (this.aeA() ? "0" : Integer.toString(this.cHt.size()));
        return this.getClass().getSimpleName() + " :: " + string + " : " + string2;
    }
}

