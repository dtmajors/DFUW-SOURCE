/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class hr
extends btk {
    Map<Integer, gha> adL = lcn.emw();
    Map<String, List<Integer>> adM = lcn.emw();
    Map<String, ggx> adN = lcn.emw();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 32517: {
                this.a((gha)dxq2);
                break;
            }
            case 32519: {
                this.a((ggx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 298: {
                this.a((kcf)kcz2);
                break;
            }
            case 302: {
                this.a((kcj)kcz2);
                break;
            }
            case 300: {
                this.a((kch)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    protected void b(int n, int n2, int n3) {
        gha gha2 = this.adL.get(n);
        ldv ldv2 = gha2.aO();
        if (ldv2 == null) {
            assert (false);
            return;
        }
        ggz ggz2 = (ggz)this.MessageDelegator.h(32518, this.getGUID(), ldv2);
        ggz2.jhe = n2;
        ggz2.jhf = n3;
        this.MessageDelegator.E(ggz2);
    }

    protected void a(gha gha2) {
        if (gha2.ila) {
            if (this.adL.containsKey(gha2.SN)) {
                lfn.b(5, this.getClass().getSimpleName(), "handleSelentineRegisterCashListenerMessage() character id " + gha2.SN + " selentine cash listener already exists.");
                assert (false);
                return;
            }
            this.adL.put(gha2.SN, gha2);
            List<Integer> list = this.adM.get(gha2.jhg);
            if (list == null) {
                list = lcn.emv();
                this.adM.put(gha2.jhg, list);
                this.d(gha2.jhg, true);
            } else {
                this.aU(gha2.jhg);
            }
            list.add(gha2.SN);
        } else {
            List<Integer> list;
            gha gha3 = this.adL.remove(gha2.SN);
            if (gha3 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleSelentineRegisterCashListenerMessage() character id " + gha2.SN + " selentine cash listener does not exist.");
                assert (false);
            }
            if ((list = this.adM.get(gha2.jhg)) == null) {
                lfn.b(5, "SFSelentineCashManager", "handleSelentineRegisterCashListenerMessage() not char ids found for account name " + gha2.jhg + ".This should never happen.");
                assert (false);
                return;
            }
            if (!list.remove((Object)gha2.SN)) {
                lfn.b(5, "SFSelentineCashManager", "handleSelentineRegisterCashListenerMessage() character id " + gha2.SN + " not found for account name " + gha2.jhg);
                assert (false);
            }
            if (list.isEmpty()) {
                this.adM.remove(gha2.jhg);
                this.d(gha2.jhg, false);
            }
        }
    }

    protected void a(ggx ggx2) {
        gha gha2 = this.adL.get(ggx2.SN);
        if (gha2 == null) {
            lfn.b(5, "SFSelentineCashManager", "handleSelentineModifyCashRequestMessage() Character Not registered! CharacterID=" + ggx2.SN);
            assert (false);
            return;
        }
        if (this.adN.containsKey(gha2.jhg)) {
            ggy ggy2 = (ggy)this.MessageDelegator.h(32520, this.getGUID(), ggx2.aO());
            ggy2.sk(ggx2.aVk());
            ggy2.cZn = ggx2.cZn;
            ggy2.ew = 2;
            this.MessageDelegator.E(ggy2);
            return;
        }
        this.adN.put(gha2.jhg, ggx2);
        kcg kcg2 = (kcg)this.MessageDelegator.i(299, this.GUID, lcr.abV((int)1));
        kcg2.hE = gha2.jhg;
        kcg2.SN = ggx2.SN;
        kcg2.bc = gha2.bc;
        kcg2.Amount = ggx2.Amount;
        kcg2.pea = ggx2.cZn < cio.values().length && ggx2.cZn >= 0 ? cio.values()[ggx2.cZn].toString() : "WRONG TYPE!";
        kcg2.ResourceName = ggx2.jgY;
        this.MessageDelegator.b(kcg2);
    }

    protected void a(kch kch2) {
        ggx ggx2 = this.adN.remove(kch2.hE);
        if (ggx2 == null) {
            lfn.b(5, "SFSelentineCashManager", "handleMiddlewareCashConsumeResponseMessage() selentine request not found for middleware cash consume response for account name " + kch2.hE);
            assert (false);
            return;
        }
        ggy ggy2 = (ggy)this.MessageDelegator.h(32520, this.getGUID(), ggx2.aO());
        ggy2.sk(ggx2.aVk());
        ggy2.jhc = kch2.jhc;
        ggy2.jhd = kch2.jhd;
        ggy2.cZn = ggx2.cZn;
        ggy2.ew = kch2.eo ? 0 : 1;
        this.MessageDelegator.E(ggy2);
    }

    protected void aU(String string) {
        kce kce2 = (kce)this.MessageDelegator.i(297, this.GUID, lcr.abV((int)1));
        kce2.hE = string;
        this.MessageDelegator.b(kce2);
    }

    protected void a(kcf kcf2) {
        List<Integer> list = this.adM.get(kcf2.hE);
        if (list == null) {
            lfn.b(5, "SFSelentineCashManager", "handleMiddlewareCashBalanceResponseMessage() no characters found for account name " + kcf2.hE);
            return;
        }
        for (Integer n : list) {
            this.b(n, kcf2.jhc, kcf2.jhd);
        }
    }

    protected void d(String string, boolean bl) {
        kci kci2 = (kci)this.MessageDelegator.i(301, this.GUID, lcr.abV((int)1));
        kci2.hE = string;
        kci2.imB = bl;
        this.MessageDelegator.b(kci2);
    }

    protected void a(kcj kcj2) {
        if (kcj2.avz) {
            this.aU(kcj2.hE);
        }
    }
}

