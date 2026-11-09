/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  ha
 */
import java.util.GregorianCalendar;
import java.util.Iterator;

public class cih
extends cif {
    private static final String TC = "SFPlayerPerksManagerServer";
    private static final double auT = 1.0;
    private boolean eyq = false;
    private double abo = 0.0;
    private GregorianCalendar cSU;

    public cih(cex cex2) {
        super((cev)cex2);
    }

    private boolean qo(int n) {
        cib cib2;
        if (!$assertionsDisabled) {
            lea.epN();
            if (!cid.eAW) {
                throw new AssertionError();
            }
        }
        if ((cib2 = cib.getValueByOrdinal(n)) == null) {
            lfn.b(5, TC, "buyPerk() perk type : " + n + " is invalid");
            ((cex)this.bnF).c(mck.uvx.bD(new Object[0]));
            assert (false);
            return false;
        }
        cia cia2 = this.eBl.qe(n);
        if (cia2 == null) {
            lfn.b(5, TC, "buyPerk()  there is no related info object for player perk type : " + (Object)((Object)cib2));
            ((cex)this.bnF).c(mck.uvx.bD(new Object[0]));
            assert (false);
            return false;
        }
        chz chz2 = (chz)this.eBm.get(n);
        if (chz2 != null) {
            ((cex)this.bnF).c(mck.uvF.bD(cia2.aOL().ordinal()));
            return false;
        }
        if (!this.a(cia2, 1)) {
            lfn.b(5, TC, "buyPerk() BUY_OPERATION for Perk : " + (Object)((Object)cib2) + " failed.");
            return false;
        }
        chz2 = new chz();
        chz2.qc(0);
        chz2.fl(cib2.ordinal());
        chz2.setActive(false);
        this.eBm.put(n, chz2);
        this.a(3, chz2);
        ((cex)this.bnF).c(mck.uvI.bD(cia2.aOL().ordinal()));
        return true;
    }

    private boolean qp(int n) {
        cib cib2;
        if (!$assertionsDisabled) {
            lea.epN();
            if (!cid.eAW) {
                throw new AssertionError();
            }
        }
        if ((cib2 = cib.getValueByOrdinal(n)) == null) {
            lfn.b(5, TC, "updatePerk() perk type : " + n + " is invalid");
            ((cex)this.bnF).c(mck.uvx.bD(new Object[0]));
            assert (false);
            return false;
        }
        cia cia2 = this.eBl.qe(n);
        if (cia2 == null) {
            lfn.b(5, TC, "updatePerk()  there is no related info object for player perk type : " + (Object)((Object)cib2));
            ((cex)this.bnF).c(mck.uvx.bD(new Object[0]));
            assert (false);
            return false;
        }
        chz chz2 = (chz)this.eBm.get(n);
        if (chz2 == null) {
            lfn.b(5, TC, "updatePerk()  player does not posses perk : " + (Object)((Object)cib2));
            ((cex)this.bnF).c(mck.uvG.bD(cia2.aOL().ordinal()));
            return false;
        }
        if (!this.a(cia2, 2)) {
            lfn.b(5, TC, "updatePerk() UPGRADE_OPERATION for Perk : " + (Object)((Object)cib2) + " failed.");
            return false;
        }
        int n2 = chz2.aOH();
        if (n2 == cia2.aOI()) {
            ((cex)this.bnF).c(mck.uvG.bD(cia2.aOL().ordinal()));
            return false;
        }
        chz2.qc(n2 + 1);
        this.a(4, chz2);
        ((cex)this.bnF).c(mck.uvK.bD(cia2.aOL().ordinal()));
        if (chz2.isActive()) {
            this.aOU();
        }
        return true;
    }

    private boolean x(int n, boolean bl) {
        cib cib2;
        if (!$assertionsDisabled) {
            lea.epN();
            if (!cid.eAW) {
                throw new AssertionError();
            }
        }
        if ((cib2 = cib.getValueByOrdinal(n)) == null) {
            lfn.b(5, TC, "setPerkState() perk type : " + n + " is invalid");
            ((cex)this.bnF).c(mck.uvx.bD(new Object[0]));
            assert (false);
            return false;
        }
        cia cia2 = this.eBl.qe(n);
        if (cia2 == null) {
            lfn.b(5, TC, "setPerkState()  there is no related info object for player perk type : " + (Object)((Object)cib2));
            ((cex)this.bnF).c(mck.uvx.bD(new Object[0]));
            assert (false);
            return false;
        }
        chz chz2 = (chz)this.eBm.get(n);
        if (chz2 == null) {
            lfn.b(5, TC, "setPerkState()  player does not posses perk : " + (Object)((Object)cib2));
            ((cex)this.bnF).c(mck.uvG.bD(cia2.aOL().ordinal()));
            return false;
        }
        if (bl) {
            if (cid.eAY <= this.eBn.size()) {
                Object[] objectArray = new Object[2];
                objectArray[0] = cia2.aOL().ordinal();
                objectArray[1] = cid.eAY;
                ((cex)this.bnF).c(mck.uvL.bD(objectArray));
                return false;
            }
            if (cid.eAZ <= this.a(cia2.aOJ())) {
                Object[] objectArray = new Object[3];
                objectArray[0] = cia2.aOL().ordinal();
                objectArray[1] = cid.eAZ;
                objectArray[2] = cia2.aOJ();
                ((cex)this.bnF).c(mck.uvM.bD(objectArray));
                return false;
            }
            if (!this.a(cia2, 3)) {
                lfn.b(5, TC, "setPerkState() ACTIVATE_OPERATION for Perk : " + (Object)((Object)cib2) + " failed.");
                return false;
            }
            if (chz2.isActive()) {
                chz2.v(chz2.Bp() + cia2.getDuration() * 1000L);
            } else {
                chz2.v(this.bnF.getMessageDelegator().bzy().getTimeInMillis() + cia2.getDuration() * 1000L);
            }
            this.eBn.put(n, chz2);
        } else {
            chz2.v(0L);
        }
        chz2.setActive(bl);
        if (cib2 == cib.eAJ) {
            cer.h((cex)this.bnF);
        }
        this.a(4, chz2);
        if (bl) {
            ((cex)this.bnF).c(mck.uvJ.bD(cia2.aOL().ordinal()));
        }
        this.aOU();
        return true;
    }

    private int a(cic cic2) {
        int n = 0;
        for (chz chz2 : this.eBn.values()) {
            int n2 = chz2.Bm();
            cia cia2 = this.eBl.qe(n2);
            if (cia2.aOJ().ordinal() != cic2.ordinal()) continue;
            ++n;
        }
        return n;
    }

    private boolean a(cia cia2, int n) {
        switch (cid.eAX) {
            case eAm: {
                ha ha2 = ((cex)this.bnF).mA();
                if (ha2 == null || ha2.jj() == null) {
                    ((cex)this.bnF).c(mck.uvy.bD(new Object[0]));
                    return false;
                }
                boolean bl = ha2.jj().a(cug.fkb, cia2.cl(), bqy.dHc);
                if (bl) break;
                switch (n) {
                    case 1: {
                        ((cex)this.bnF).c(mck.uvz.bD(cug.fkb, cia2.aOL().ordinal()));
                        break;
                    }
                    case 2: {
                        ((cex)this.bnF).c(mck.uvD.bD(cug.fkb, cia2.aOL().ordinal()));
                        break;
                    }
                    case 3: {
                        ((cex)this.bnF).c(mck.uvB.bD(cug.fkb, cia2.aOL().ordinal()));
                    }
                }
                return false;
            }
            case eAn: {
                ha ha3 = ((cex)this.bnF).mA();
                if (ha3 == null) {
                    ((cex)this.bnF).c(mck.uvy.bD(new Object[0]));
                    return false;
                }
                ts ts2 = ha3.kz();
                if (ts2 == null) {
                    ((cex)this.bnF).c(mck.uvy.bD(new Object[0]));
                    return false;
                }
                tu tu2 = ts2.a(tv.aVM, -cia2.cl(), cia2.aOL().name());
                if (tu2.vA()) break;
                switch (n) {
                    case 1: {
                        ((cex)this.bnF).c(mck.uvA.bD(cia2.aOL().ordinal()));
                        break;
                    }
                    case 2: {
                        ((cex)this.bnF).c(mck.uvE.bD(cia2.aOL().ordinal()));
                        break;
                    }
                    case 3: {
                        ((cex)this.bnF).c(mck.uvC.bD(cia2.aOL().ordinal()));
                    }
                }
                return false;
            }
            case eAl: {
                break;
            }
            default: {
                assert (false) : "Currency : " + (Object)((Object)cid.eAX);
                return false;
            }
        }
        return true;
    }

    public void doTick(ldz ldz2) {
        if (!$assertionsDisabled) {
            lea.epN();
            if (!cid.eAW) {
                throw new AssertionError();
            }
        }
        if (this.eBn.isEmpty()) {
            return;
        }
        if (this.cSU == null) {
            this.cSU = this.bnF.getMessageDelegator().bzy();
        }
        this.cSU.setTimeInMillis(System.currentTimeMillis());
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = 1.0;
        Iterator iterator = this.eBn.entrySet().iterator();
        while (iterator.hasNext()) {
            chz chz2 = (chz)iterator.next().getValue();
            if (this.cSU.getTimeInMillis() < chz2.Bp()) continue;
            iterator.remove();
            this.x(chz2.Bm(), false);
        }
    }

    private void a(eel eel2) {
        if (!$assertionsDisabled) {
            lea.epN();
            if (!cid.eAW) {
                throw new AssertionError();
            }
        }
        int n = eel2.bGi();
        switch (n) {
            case 0: {
                this.qk(eel2.bGj());
                break;
            }
            case 1: {
                this.ql(eel2.bGj());
                break;
            }
            case 2: {
                this.qo(eel2.bGj());
                break;
            }
            case 3: {
                this.x(eel2.bGj(), true);
                break;
            }
            case 4: {
                this.x(eel2.bGj(), false);
                break;
            }
            case 5: {
                this.qp(eel2.bGj());
                break;
            }
            default: {
                assert (false) : "Unhandled operation type : " + n;
                break;
            }
        }
    }

    @Override
    public void n(dxq dxq2) {
        if (!$assertionsDisabled) {
            lea.epN();
            if (!cid.eAW) {
                throw new AssertionError();
            }
        }
        int n = dxq2.bEz();
        switch (n) {
            case 12847: {
                this.a((eel)dxq2);
                break;
            }
            default: {
                super.n(dxq2);
            }
        }
    }

    public void qq(int n) {
        if (n != 3 && n != 1) {
            return;
        }
        this.aOU();
    }

    private void aOU() {
        boolean bl;
        if (this.bnF.mA() == null) {
            return;
        }
        ge ge2 = this.bnF.mA().kW();
        if (ge2 == null || ge2.Uq != ge.a.Uu) {
            return;
        }
        boolean bl2 = bl = ge2.Us == 3 || ge2.Us == 1;
        if (!bl) {
            return;
        }
        ldv ldv2 = ge2.Ur;
        eem eem2 = (eem)this.bnF.getMessageDelegator().h(12850, this.bnF.getGUID(), ldv2);
        eem2.b(this.eBn.isEmpty() ? null : this.eBn.values().toArray(new chz[this.eBn.size()]));
        this.bnF.getMessageDelegator().F(eem2);
    }

    @Override
    public boolean isServerObject() {
        return true;
    }
}

