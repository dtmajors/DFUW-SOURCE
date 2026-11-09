/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bjv
extends bju {
    private Set<String> dpQ = lcn.emx();
    private Map<ldv, bjx> dpR = lcn.emw();

    private void b(ldv ldv2, ljq ljq2, ljq ljq3) {
        fci fci2 = (fci)this.MessageDelegator.h(24842, this.GUID, lcr.qBO);
        fci2.cQE = ldv2;
        fci2.cQF = ljq2;
        fci2.iJj = ljq3;
        fci2.gKV = 1;
        this.MessageDelegator.F(fci2);
    }

    private void a(fce fce2, boolean bl2, String string) {
        fcf fcf2 = (fcf)this.MessageDelegator.h(24834, this.GUID, fce2.aO());
        this.MessageDelegator.b(fce2, fcf2);
        fcf2.eo = bl2;
        fcf2.iJd = string;
        this.MessageDelegator.F(fcf2);
    }

    private void a(fcl fcl2, ldv[] ldvArray, String[] stringArray) {
        fcm fcm2 = (fcm)this.MessageDelegator.h(24850, this.GUID, fcl2.aO());
        this.MessageDelegator.b(fcl2, fcm2);
        fcm2.iuC = ldvArray;
        fcm2.hlz = stringArray;
        this.MessageDelegator.F(fcm2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24833: {
                this.a((fce)dxq2);
                break;
            }
            case 24849: {
                this.a((fcl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fce fce2) {
        if (fce2.iJd == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleFortressSystemCreateRequestMessage() : Create request does not contain a filename!!!");
            assert (false);
            this.a(fce2, false, null);
            return;
        }
        bjr bjr2 = new jwp().uQ(fce2.iJd);
        if (bjr2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleFortressSystemCreateRequestMessage() : Could not parse fortress xml file!!!... Filename = " + fce2.iJd);
            assert (false);
            this.a(fce2, false, null);
            return;
        }
        if (this.dpQ.contains(bjr2.aqd())) {
            this.a(fce2, false, null);
            return;
        }
        ldv ldv2 = this.MessageDelegator.bzw();
        this.dpQ.add(bjr2.aqd());
        bjx bjx2 = new bjx();
        bjx2.a(this);
        bjx2.setGUID(ldv2);
        this.MessageDelegator.a(bjx2);
        bjx2.a(bjr2);
        this.dpR.put(bjx2.getGUID(), bjx2);
        this.b(bjx2.getGUID(), bjx2.aqO(), bjx2.aqP().eqT());
        this.a(fce2, true, fce2.iJd);
    }

    public List<ldv> aqF() {
        ArrayList<ldv> arrayList = lcn.abH(this.dpR.size());
        arrayList.addAll(this.dpR.keySet());
        return arrayList;
    }

    public void a(nw nw2) {
        bjr bjr2 = new jwp().uQ(nw2.aFd.Filename);
        if (bjr2 == null) {
            lfn.b(5, "SFFortressSystemManagerServer", "restoreFromPersistenceDataFortress: Could not parse fortress file " + nw2.aFd.Filename);
            assert (false);
            return;
        }
        if (this.dpQ.contains(bjr2.aqd())) {
            lfn.b(5, "SFFortressSystemManagerServer", "restoreFromPersistenceDataFortress: Fortress " + bjr2.aqd() + " already present");
            assert (false);
            return;
        }
        bjx bjx2 = new bjx();
        bjx2.a(this);
        bjx2.setGUID(nw2.aFc);
        this.MessageDelegator.a(bjx2);
        this.dpR.put(bjx2.getGUID(), bjx2);
        this.dpQ.add(bjr2.aqd());
        bjx2.a(nw2, bjr2.aqd());
        bjx2.a(bjr2);
        this.b(bjx2.getGUID(), bjx2.aqO(), bjx2.aqP().eqT());
    }

    private void a(fcl fcl2) {
        ldv[] ldvArray = new ldv[this.dpR.size()];
        String[] stringArray = new String[this.dpR.size()];
        int n = 0;
        for (bjx bjx2 : this.dpR.values()) {
            ldvArray[n] = bjx2.getGUID();
            stringArray[n++] = bjx2.akc();
        }
        this.a(fcl2, ldvArray, stringArray);
    }
}

