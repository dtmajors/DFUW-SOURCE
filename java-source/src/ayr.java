/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  lcr
 *  lcw
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class ayr
extends btk {
    private Map<ldv, ayd> cAp = lcn.emw();
    private Map<Integer, ayd> cAq = lcn.emw();
    private int cAr = 0;
    private int cAs = 0;
    private Map<Integer, ekz> cAt = lcn.emw();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13886: {
                this.b((ekz)dxq2);
                break;
            }
            case 13911: {
                this.a((emy)dxq2);
                break;
            }
            case 5636: {
                break;
            }
            case 13854: {
                this.a((elc)dxq2);
                break;
            }
            case 19980: {
                this.a((evf)dxq2);
                break;
            }
            case 13868: {
                this.a((emv)dxq2);
                break;
            }
            case 7198: {
                this.a((fzf)dxq2);
                break;
            }
            case 7179: {
                this.b((fzs)dxq2);
                break;
            }
            case 13870: {
                this.a((ekq)dxq2);
                break;
            }
            case 11109: {
                this.a((gpg)dxq2);
                break;
            }
            case 13884: {
                this.a((elp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public Collection<ldv> abA() {
        TreeSet<ldv> treeSet = lcn.emH();
        treeSet.addAll(this.cAp.keySet());
        return treeSet;
    }

    private void a(elc elc2) {
        ayd ayd2 = this.cAp.get(elc2.ade);
        if (ayd2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleClanCreatedOwnerUpdatedResponseMessage() : Clan for ClanGUID =" + elc2.ade + " does not exist. Not triggering saving of clan.");
            return;
        }
        if (!lcw.enb()) {
            fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), lcr.qAX);
            fze2.a(px.aJX);
            fze2.hC(ayd2.getGUID());
            this.MessageDelegator.I(fze2);
            fzr fzr2 = (fzr)this.MessageDelegator.h(7178, this.getGUID(), lcr.qAW);
            fzr2.jbU = false;
            fzr2.SN = ayd2.ZV().enw();
            fzr2.jbV = false;
            this.MessageDelegator.E(fzr2);
        }
    }

    private void a(fzf fzf2) {
        switch (fzf2.uk()) {
            case aJY: {
                this.f(fzf2);
                break;
            }
            case aJX: {
                break;
            }
            default: {
                lfn.b(5, "SFClanManager", "handlePersistenceManagerOperationResponseMessage: Unhandled operation " + (Object)((Object)fzf2.uk()));
            }
        }
    }

    private void b(fzs fzs2) {
    }

    public void b(nm nm2) {
        if (nm2.ade == null) {
            lfn.b(5, "SFClanManager", "restoreClan: ClanGUID is null");
            assert (false);
            return;
        }
        if (nm2.aDy == null) {
            lfn.b(5, "SFClanManager", "restoreClan: ClanData is null");
            assert (false);
            return;
        }
        if (this.cAp.containsKey(nm2.ade)) {
            lfn.b(5, "SFClanManager", "restoreClan: Clan GUID " + nm2.ade + " already used");
            assert (false);
            return;
        }
        ayr ayr2 = (ayr)this.MessageDelegator.bzx().bzt().d(lcr.qEd);
        assert (ayr2 != null);
        this.MessageDelegator.nZ(nm2.ade);
        ayd ayd2 = new ayd(this);
        ayd2.setGUID(nm2.ade);
        this.cAp.put(ayd2.getGUID(), ayd2);
        this.MessageDelegator.a((amf)ayd2);
        ayd2.a(nm2);
        ens ens2 = (ens)this.MessageDelegator.h(13912, this.GUID, lcr.hac);
        ens2.ade = ayd2.getGUID();
        ens2.add = ayd2.iV();
        ens2.ija = 2;
        this.MessageDelegator.F(ens2);
    }

    private void b(ekz ekz2) {
        if (!ekz2.aO().equals(ekz2.bIx())) {
            lfn.b(5, "SFClanManager", "handleClanCreateNewGUIRequestMessage: Request not sent from PSO of clan creator");
            ela ela2 = (ela)this.MessageDelegator.h(13887, this.getGUID(), ekz2.aO());
            ela2.a(ayl.cze);
            this.MessageDelegator.b(ekz2, ela2);
            this.MessageDelegator.F(ela2);
            return;
        }
        if (lcw.enb()) {
            this.c(ekz2);
        } else {
            ++this.cAs;
            this.cAt.put(this.cAs, ekz2);
            emx emx2 = (emx)this.MessageDelegator.h(13910, this.getGUID(), lcr.hac);
            emx2.aqs = this.cAs;
            emx2.add = ekz2.add;
            emx2.gOd = 1;
            this.MessageDelegator.E(emx2);
        }
    }

    private void a(emy emy2) {
        if (emy2.gOd == 1) {
            ekz ekz2 = this.cAt.remove(emy2.aVk());
            if (ekz2 == null) {
                lfn.b(5, "SFClanManager", "handleClanNameReserveResponseMessage: No SFClanCreateNewGUIRequestMessage found for tag " + emy2.aVk() + " clan name " + emy2.add);
                assert (false);
                return;
            }
            if (emy2.ew != 4) {
                lfn.b(4, "SFClanManager", "handleClanNameReserveResponseMessage: Could not reserve clan name " + emy2.add + " - Result " + emy2.ew);
                ela ela2 = (ela)this.MessageDelegator.h(13887, this.getGUID(), ekz2.aO());
                ela2.a(ayl.czs);
                ela2.kd(ekz2.iV());
                this.MessageDelegator.b(ekz2, ela2);
                this.MessageDelegator.F(ela2);
                return;
            }
            this.c(ekz2);
        } else if (emy2.gOd == 2) {
            lfn.b(3, "SFClanManager", "handleClanNameReserveResponseMessage: Unreserved clan name '" + emy2.add + "'");
        }
    }

    private void c(ekz ekz2) {
        ayd ayd2 = new ayd(this, ekz2.iV(), ekz2.bIx());
        ayd2.setGUID(this.MessageDelegator.bzw());
        ayd2.eN(ekz2.ZK());
        ayd2.eO(ekz2.ZL());
        ayd2.l(ekz2.bIo());
        ayd2.cn(ekz2.bIy());
        ayd2.a(ekz2.ZO());
        this.MessageDelegator.a((amf)ayd2);
        this.cAp.put(ayd2.getGUID(), ayd2);
        ayd2.eM(cg.c(ekz2.YU, ekz2.YV));
        bbr bbr2 = ayd2.dR(ekz2.bIx());
        if (bbr2 == null) {
            lfn.b(5, "SFClanManager", "handleCharacterNamedPropertiesResponseMessage: Could not find creator with guid " + ekz2.bIx() + " in clan " + ayd2);
            assert (false);
            return;
        }
        bbr2.b(bbs.Recruit);
        bbr2.jX(ekz2.YY);
        bbr2.jY(ekz2.cWz);
        bbr2.aM(ekz2.YU);
        bbr2.aN(ekz2.YV);
        bbr2.jW(ekz2.aFI);
        bbr2.jZ(ekz2.aFH);
        bbr2.cP(true);
        ayd2.a(bbr2);
        ayt ayt2 = new ayt(ayd2, bbr2, this.MessageDelegator);
        ena ena2 = (ena)this.MessageDelegator.h(13913, this.getGUID(), ekz2.bIx());
        ena2.ch(ayd2.getGUID());
        ena2.cD(ayd2.iV());
        ena2.d(bbr2.abP());
        ena2.d(bbr2.abG().akW());
        this.MessageDelegator.F(ena2);
        ela ela2 = (ela)this.MessageDelegator.h(13887, this.GUID, ekz2.aO());
        this.MessageDelegator.b(ekz2, ela2);
        ela2.a(ayl.czv);
        ela2.a(ayt2);
        this.MessageDelegator.E(ela2);
        elb elb2 = (elb)this.MessageDelegator.h(13853, this.getGUID(), ekz2.bIx());
        elb2.ade = ayd2.getGUID();
        this.MessageDelegator.F(elb2);
        ens ens2 = (ens)this.MessageDelegator.h(13912, this.GUID, lcr.hac);
        ens2.ade = ayd2.getGUID();
        ens2.add = ayd2.iV();
        ens2.ija = 1;
        this.MessageDelegator.F(ens2);
        ftg ftg2 = (ftg)this.MessageDelegator.h(30222, this.getGUID(), ekz2.bIx());
        ftg2.iVH = chb.ezG.ordinal();
        this.MessageDelegator.F(ftg2);
    }

    private void a(ekq ekq2) {
        Cloneable cloneable;
        if (!this.cAp.isEmpty()) {
            cloneable = new HashSet<ayd>(this.cAp.values());
            for (ayd ayd2 : cloneable) {
                if (ayd2.ZU().isEmpty()) {
                    this.a(ayd2, true);
                    continue;
                }
                ayd2.updateInfo();
            }
        }
        cloneable = (ekr)this.MessageDelegator.h(13871, this.getGUID(), ekq2.aO());
        this.MessageDelegator.F((dxq)cloneable);
    }

    public void a(ayd ayd2, boolean bl) {
        if (ayd2 == null) {
            lfn.b(5, "SFClanManager", "startClanShutdown Clan is NULL.");
            assert (false);
            return;
        }
        if (!ayd2.ZU().isEmpty()) {
            lfn.b(5, "SFClanManager", "startClanShutdown Clan : " + ayd2.iV() + " is not empty.");
            assert (false);
            return;
        }
        if (this.cAq != null && this.cAq.containsValue(ayd2)) {
            return;
        }
        if (lcw.enb()) {
            this.cAp.remove(ayd2.getGUID());
            ayd2.ZQ();
            lfn.b(5, "SFClanManager", "startClanShutdown() Clan shutdown with Name : " + ayd2.iV() + " And GUID " + ayd2.getGUID());
        } else {
            fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), lcr.qAX);
            fze2.a(px.aJY);
            fze2.hC(ayd2.getGUID());
            fze2.hsP = true;
            fze2.aqs = this.cAr;
            this.MessageDelegator.F(fze2);
            this.cAp.remove(ayd2.getGUID());
            this.cAq.put(this.cAr, ayd2);
            ++this.cAr;
        }
    }

    private void f(fzf fzf2) {
        int n = fzf2.aqs;
        ayd ayd2 = this.cAq.remove(n);
        if (ayd2 == null) {
            lfn.b(5, "SFClanManager", "handleDeleteClanOperationResponse() There is no entry for Tag : " + n);
            assert (false);
            return;
        }
        String string = fzf2.aMH;
        if (string == null) {
            ens ens2 = (ens)this.MessageDelegator.h(13912, this.getGUID(), lcr.hac);
            ens2.ade = ayd2.getGUID();
            ens2.add = ayd2.iV();
            ens2.ija = 3;
            this.MessageDelegator.E(ens2);
            ayd2.ZQ();
            return;
        }
        lfn.b(5, "SFClanManager", "handleDeleteClanOperationResponse() : Error With Shut-down, Putting Clan Back Into Active List!!!");
        this.cAp.put(ayd2.getGUID(), ayd2);
        lfn.b(5, "SFClanManager", "handleDeleteClanOperationResponse() Clan shutdown with Name : " + ayd2.iV() + " And GUID " + ayd2.getGUID() + " failed. ErrorMessage : " + string);
    }

    private void a(evf evf2) {
        for (ayd ayd2 : this.cAp.values()) {
            ayd2.receiveMessage((dxq)evf2);
        }
    }

    private void a(emv emv2) {
        if (emv2.add == null) {
            lfn.b(5, "SFClanManager", "handleClanNameCheckRequestMessage() Clan Name NULL");
            return;
        }
        boolean bl = false;
        for (ayd ayd2 : this.cAp.values()) {
            if (!ayd2.iV().toLowerCase().equals(emv2.add.toLowerCase())) continue;
            bl = true;
            break;
        }
        emw emw2 = (emw)this.MessageDelegator.h(13869, this.getGUID(), emv2.aO());
        this.MessageDelegator.b(emv2, emw2);
        emw2.iuS = bl;
        this.MessageDelegator.F(emw2);
    }

    private void a(elp elp2) {
        ayq[] ayqArray = new ayq[this.cAp.size()];
        int n = 0;
        for (ayd ayd2 : this.cAp.values()) {
            ayqArray[n++] = ayd2.ZJ();
        }
        this.a(elp2, ayqArray);
    }

    private void a(elp elp2, ayq[] ayqArray) {
        assert (elp2 != null);
        assert (ayqArray != null);
        elq elq2 = (elq)this.MessageDelegator.h(13885, this.GUID, elp2.aO());
        this.MessageDelegator.b(elp2, elq2);
        elq2.a(ayqArray);
        this.MessageDelegator.F(elq2);
    }

    private void a(gpg gpg2) {
        if (gpg2.Ri == null) {
            lfn.b(5, "SFClanManager", "handleSystemCharacterRemovalNotification: PSO GUID IS NULL.");
            assert (false);
            return;
        }
        if (this.cAp.isEmpty()) {
            return;
        }
        for (ayd ayd2 : this.cAp.values()) {
            if (ayd2.eq(gpg2.Ri)) {
                // empty if block
            }
            if (!ayd2.dP(gpg2.Ri)) continue;
        }
    }
}

