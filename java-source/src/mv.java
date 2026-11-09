/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

public class mv
extends my {
    private fze aBf;
    private qk aBg;
    private boolean aBh;
    private fze aBi = null;
    private qj aBj = null;
    private int aBk = 0;
    private static final int aBl = 3;
    private fze aBm = null;
    private Collection<ldv> aBn = null;
    private String aBo = null;
    private long aAt;
    private LinkedList<fze> aBp = lcn.emA();
    private LinkedList<rc> aBq = lcn.emA();
    private IdentityHashMap<rc, fze> aBr = new IdentityHashMap();
    private LinkedList<fze> aBs = lcn.emA();
    private LinkedList<qi> aBt = lcn.emA();
    private IdentityHashMap<qi, fze> aBu = new IdentityHashMap();
    private Set<ldv> aBv = lcn.emx();

    public mv() {
        this.setGUID(lcr.qAX);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.sd();
        this.se();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7197: {
                this.g((fze)dxq2);
                break;
            }
            case 7198: {
                this.a((fzf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void sd() {
        if (this.aBp.isEmpty() || this.aBv.size() >= 10) {
            return;
        }
        fze fze2 = this.aBp.pollFirst();
        if (this.aBv.contains(fze2.oq())) {
            this.aBp.add(fze2);
            return;
        }
        rc rc2 = this.aBq.pollFirst();
        if (rc2 == null) {
            rc2 = this.f(new rc(this));
        }
        this.aBr.put(rc2, fze2);
        this.aBv.add(fze2.oq());
        rc2.ch(fze2.oq());
        rc2.start();
    }

    private void se() {
        if (!this.aBp.isEmpty()) {
            return;
        }
        if (this.aBs.isEmpty()) {
            return;
        }
        if (this.aBv.size() >= 10) {
            return;
        }
        fze fze2 = this.aBs.pollFirst();
        if (this.aBv.contains(fze2.oq())) {
            this.aBs.add(fze2);
            return;
        }
        qi qi2 = this.aBt.pollFirst();
        if (qi2 == null) {
            qi2 = this.f(new qi(this));
        }
        this.aBu.put(qi2, fze2);
        this.aBv.add(fze2.oq());
        qi2.ch(fze2.oq());
        qi2.start();
    }

    private void g(fze fze2) {
        switch (fze2.uk()) {
            case aJS: {
                this.h(fze2);
                break;
            }
            case aJT: 
            case aJU: 
            case aJV: {
                this.l(fze2);
                break;
            }
            case aJW: {
                this.i(fze2);
                break;
            }
            case aJX: {
                this.j(fze2);
                break;
            }
            case aJY: {
                this.k(fze2);
                break;
            }
            default: {
                lfn.b(5, "SFClanPersistenceManager", "handlePersistenceManagerOperationRequestMessage: Unhandled operation " + (Object)((Object)fze2.uk()));
                assert (false);
                break;
            }
        }
    }

    private void h(fze fze2) {
        if (this.aBf != null) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationLoadAllClans: Already loading clans");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.aMH = "Already loading clans";
            this.MessageDelegator.E(fzf2);
            assert (false);
            return;
        }
        if (this.aBh) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationLoadAllClans: Already loaded clans");
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf3);
            fzf3.a(fze2.uk());
            fzf3.aMH = "Already loaded clans";
            this.MessageDelegator.E(fzf3);
            assert (false);
            return;
        }
        this.aBh = true;
        this.aBf = fze2;
        lfn.b(2, "SFClanPersistenceManager", "handleOperationLoadAllClans: Load clans starting");
        this.aBg = this.f(new qk(this));
        this.aBg.start();
    }

    private void i(fze fze2) {
        if (!this.aBh) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationSaveAllClans: Clans are not loaded");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.aMH = "Clans are not loaded";
            this.MessageDelegator.E(fzf2);
            assert (false);
            return;
        }
        if (this.aBk < 3) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationSaveAllClans: Clan conquests are not loaded");
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf3);
            fzf3.a(fze2.uk());
            fzf3.aMH = "Clan Conquests are not loaded";
            this.MessageDelegator.E(fzf3);
            assert (false);
            return;
        }
        if (this.aBm != null) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationSaveAllClans: Save in progress");
            fzf fzf4 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf4);
            fzf4.a(fze2.uk());
            fzf4.aMH = "Save in progress";
            this.MessageDelegator.E(fzf4);
            assert (false);
            return;
        }
        amf amf2 = this.MessageDelegator.bzx().bzt().d(lcr.qEd);
        if (amf2 == null || !(amf2 instanceof ayr)) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationSaveAllClans: Could not find ClanManager");
            fzf fzf5 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf5);
            fzf5.a(fze2.uk());
            fzf5.aMH = "Could not find ClanManager";
            this.MessageDelegator.E(fzf5);
            assert (false);
            return;
        }
        ayr ayr2 = (ayr)amf2;
        this.aBn = ayr2.abA();
        this.aAt = System.currentTimeMillis();
        lfn.b(2, "SFClanPersistenceManager", "handleOperationSaveAllClans: Save All starting: " + this.aBn.size() + " clans pending");
        if (this.aBn.isEmpty()) {
            fzf fzf6 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf6);
            fzf6.a(fze2.uk());
            this.MessageDelegator.E(fzf6);
            return;
        }
        this.aBm = fze2;
        for (ldv ldv2 : this.aBn) {
            fze fze3 = (fze)this.MessageDelegator.h(7197, this.getGUID(), this.getGUID());
            fze3.a(px.aJX);
            fze3.hC(ldv2);
            this.MessageDelegator.F(fze3);
        }
    }

    private void j(fze fze2) {
        this.aBp.add(fze2);
    }

    private void k(fze fze2) {
        this.aBs.add(fze2);
    }

    private void a(fzf fzf2) {
        if (fzf2.uk() != px.aJX) {
            lfn.b(5, "SFClanPersistenceManager", "handlePersistenceManagerOperationResponseMessage: Unexpected operation " + (Object)((Object)fzf2.uk()));
            assert (false);
            return;
        }
        if (fzf2.aMH != null && this.aBo == null) {
            this.aBo = fzf2.aMH;
        }
        this.aBn.remove(fzf2.oq());
        if (this.aBn.isEmpty()) {
            long l2 = System.currentTimeMillis() - this.aAt;
            String string = l2 / 1000L + ".";
            l2 = l2 % 1000L + 1000L;
            string = string + ("" + l2).substring(1);
            if (this.aBo != null) {
                lfn.b(5, "SFClanPersistenceManager", "handlePersistenceManagerOperationResponseMessage: Save all failed: " + this.aBo + " after " + string + "s");
            } else {
                lfn.b(2, "SFClanPersistenceManager", "handlePersistenceManagerOperationResponseMessage: Save all completed in " + string + "s");
            }
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBm.aO());
            this.MessageDelegator.b(this.aBm, fzf3);
            fzf3.a(this.aBm.uk());
            fzf3.aMH = this.aBo;
            this.aBo = null;
            this.aBm = null;
            this.MessageDelegator.E(fzf3);
        }
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 == this.aBg) {
            if (qe2.sS()) {
                lfn.b(5, "SFClanPersistenceManager", "notifyChildCompleted: Clan load failed: " + qe2.getErrorMessage());
            } else {
                lfn.b(2, "SFClanPersistenceManager", "notifyChildCompleted: Clan load completed");
            }
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBf.aO());
            this.MessageDelegator.b(this.aBf, fzf2);
            fzf2.a(this.aBf.uk());
            fzf2.aMH = qe2.getErrorMessage();
            this.MessageDelegator.E(fzf2);
            this.aBf = null;
            this.e(this.aBg);
            this.aBg = null;
        } else if (qe2 == this.aBj) {
            if (qe2.sS()) {
                lfn.b(5, "SFClanPersistenceManager", "notifyChildCompleted() : Clan Conquests Load Failed: " + qe2.getErrorMessage());
            } else {
                lfn.b(2, "SFClanPersistenceManager", "notifyChildCompleted() : Clan Conquests Load Completed");
            }
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBi.aO());
            this.MessageDelegator.b(this.aBi, fzf3);
            fzf3.a(this.aBi.uk());
            fzf3.kP(this.aBi.bSR());
            this.MessageDelegator.E(fzf3);
            this.aBi = null;
            this.e(this.aBj);
            this.aBj = null;
        } else if (qe2.aMr == me.axV) {
            rc rc2 = (rc)qe2;
            this.aBv.remove(rc2.iG());
            fze fze2 = this.aBr.remove(rc2);
            this.aBq.add(rc2);
            if (fze2 == null) {
                lfn.b(5, "SFClanPersistenceManager", "notifyChildCompleted: Couldn't find save request for save of " + rc2.iG());
                assert (false);
                return;
            }
            fzf fzf4 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf4);
            fzf4.aMH = rc2.getErrorMessage();
            fzf4.a(fze2.uk());
            fzf4.hC(fze2.oq());
            this.MessageDelegator.E(fzf4);
        } else if (qe2.aMr == me.aye) {
            qi qi2 = (qi)qe2;
            this.aBv.remove(qi2.iG());
            fze fze3 = this.aBu.remove(qi2);
            this.aBt.add(qi2);
            if (fze3 == null) {
                lfn.b(5, "SFClanPersistenceManager", "notifyChildCompleted: Couldn't find delete request for deletion of " + qi2.iG());
                assert (false);
                return;
            }
            fzf fzf5 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze3.aO());
            this.MessageDelegator.b(fze3, fzf5);
            fzf5.aMH = qi2.getErrorMessage();
            fzf5.a(fze3.uk());
            fzf5.hC(fze3.oq());
            this.MessageDelegator.E(fzf5);
        }
    }

    private void l(fze fze2) {
        if (!this.aBh) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationLoadAllClanConquests() : Clans Have Not Been Loaded");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Clans Have Not Been Loaded";
            this.MessageDelegator.E(fzf2);
            assert (false);
            return;
        }
        if (this.aBf != null) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationLoadAllClanConquests() : Clans Are Still Being Loaded");
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf3);
            fzf3.a(fze2.uk());
            fzf3.kP(fze2.bSR());
            fzf3.aMH = "Clans Are Still Being Loaded";
            this.MessageDelegator.E(fzf3);
            assert (false);
            return;
        }
        if (this.aBi != null) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationLoadAllClanConquests() : Clan Conquest Load Is Already In Progress");
            fzf fzf4 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf4);
            fzf4.a(fze2.uk());
            fzf4.kP(fze2.bSR());
            fzf4.aMH = "Clan Conquest Load Is Already In Progress";
            this.MessageDelegator.E(fzf4);
            assert (false);
            return;
        }
        if (this.aBk == 3) {
            lfn.b(5, "SFClanPersistenceManager", "handleOperationLoadAllClanConquests() : Clan Conquests Have Already Been Loaded");
            fzf fzf5 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf5);
            fzf5.a(fze2.uk());
            fzf5.kP(fze2.bSR());
            fzf5.aMH = "Clan Conquests Have Already Been Loaded";
            this.MessageDelegator.E(fzf5);
            assert (false);
            return;
        }
        ++this.aBk;
        this.aBi = fze2;
        lfn.b(2, "SFClanPersistenceManager", "handleOperationLoadAllClanConquests() : Load Clan Conquests Starting");
        this.aBj = this.f(new qj(this));
        this.aBj.a(fze2.uk());
        this.aBj.start();
    }
}

