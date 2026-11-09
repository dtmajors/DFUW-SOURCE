/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.Queue;

public class jh
extends btk
implements bto {
    private static final int akA = 1;
    private static final int akB = 100;
    private Map<ldv, azz> akC = null;
    private Map<Integer, Integer> akD = null;
    private Queue<ewl> akE = lcn.emA();
    private Queue<ewo> akF = lcn.emA();

    public jh() {
        this.akC = lcn.emw();
        this.akD = lcn.emw();
    }

    public void o(int n, int n2) {
        this.akD.put(n, n2);
        this.p(n2, n);
    }

    public void cy(int n) {
        this.akD.remove(n);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.akE.isEmpty()) {
            ewl ewl2;
            for (int j = 0; j < 1 && !this.akE.isEmpty() && (ewl2 = this.akE.poll()) != null; ++j) {
                this.MessageDelegator.F(ewl2);
            }
            return;
        }
        if (!this.akF.isEmpty()) {
            ewo ewo2;
            for (int j = 0; j < 100 && !this.akF.isEmpty() && (ewo2 = this.akF.poll()) != null; ++j) {
                this.MessageDelegator.F(ewo2);
            }
        }
    }

    private void p(int n, int n2) {
        ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)n, (int)n2);
        ewl ewl2 = (ewl)this.MessageDelegator.h(31746, this.GUID, ldv2);
        ewl2.a(this.akC.values().toArray(new azz[this.akC.size()]));
        this.akE.add(ewl2);
    }

    private void a(ewg ewg2) {
        if (ewg2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewg ewg3 = (ewg)this.MessageDelegator.h(31747, this.GUID, ldv2);
                ewg3.a(ewg2.bMX());
                this.akF.add(ewg3);
            }
        }
    }

    private void a(ewb ewb2) {
        if (ewb2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewb ewb3 = (ewb)this.MessageDelegator.h(31748, this.GUID, ldv2);
                ewb3.pd(ewb2.aiK());
                ewb3.c(ewb2.bMV());
                this.akF.add(ewb3);
            }
        }
    }

    private void a(ewc ewc2) {
        if (ewc2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewc ewc3 = (ewc)this.MessageDelegator.h(31749, this.GUID, ldv2);
                ewc3.pd(ewc2.aiK());
                ewc3.pe(ewc2.bKb());
                ewc3.Fu(ewc2.bMW());
                this.akF.add(ewc3);
            }
        }
    }

    private void a(ewe ewe2) {
        if (ewe2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewe ewe3 = (ewe)this.MessageDelegator.h(31750, this.GUID, ldv2);
                ewe3.pd(ewe2.aiK());
                ewe3.pe(ewe2.bKb());
                ewe3.Fu(ewe2.bMW());
                this.akF.add(ewe3);
            }
        }
    }

    private void a(ewd ewd2) {
        if (ewd2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewd ewd3 = (ewd)this.MessageDelegator.h(31751, this.GUID, ldv2);
                ewd3.pd(ewd2.aiK());
                ewd3.pe(ewd2.bKb());
                this.akF.add(ewd3);
            }
        }
    }

    private void a(ewh ewh2) {
        if (ewh2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewh ewh3 = (ewh)this.MessageDelegator.h(31754, this.GUID, ldv2);
                ewh3.pd(ewh2.aiK());
                ewh3.cD(ewh2.afH());
                ewh3.cE(ewh2.afI());
                ewh3.cF(ewh2.afK());
                ewh3.cG(ewh2.afL());
                this.akF.add(ewh3);
            }
        }
    }

    private void a(ewf ewf2) {
        if (ewf2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewf ewf3 = (ewf)this.MessageDelegator.h(31755, this.GUID, ldv2);
                ewf3.pd(ewf2.aiK());
                this.akF.add(ewf3);
            }
        }
    }

    private void a(ewi ewi2) {
        if (ewi2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewi ewi3 = (ewi)this.MessageDelegator.h(31756, this.GUID, ldv2);
                ewi3.pd(ewi2.aiK());
                ewi3.av(ewi2.aeQ());
                ewi3.cj(ewi2.bLm());
                ewi3.aC(ewi2.afJ());
                this.akF.add(ewi3);
            }
        }
    }

    private void a(ewm ewm2) {
        if (ewm2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewm ewm3 = (ewm)this.MessageDelegator.h(31752, this.GUID, ldv2);
                ewm3.pd(ewm2.aiK());
                ewm3.pe(ewm2.bKb());
                ewm3.e(ewm2.bMZ());
                this.akF.add(ewm3);
            }
        }
    }

    private void a(ewn ewn2) {
        if (ewn2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewn ewn3 = (ewn)this.MessageDelegator.h(31753, this.GUID, ldv2);
                ewn3.pd(ewn2.aiK());
                ewn3.pe(ewn2.bKb());
                ewn3.e(ewn2.bMZ());
                this.akF.add(ewn3);
            }
        }
    }

    private void a(ewj ewj2) {
        if (ewj2 == null) {
            return;
        }
        if (!this.akD.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : this.akD.entrySet()) {
                ldv ldv2 = lcr.p((ldv)lcr.qEw, (int)entry.getValue(), (int)entry.getKey());
                ewj ewj3 = (ewj)this.MessageDelegator.h(31757, this.GUID, ldv2);
                ewj3.fx(ewj2.afl());
                ewj3.ch(ewj2.iG());
                ewj3.cD(ewj2.iV());
                this.akF.add(ewj3);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 31745: {
                this.a((ewk)dxq2);
                break;
            }
            case 31747: {
                this.b((ewg)dxq2);
                break;
            }
            case 31748: {
                this.b((ewb)dxq2);
                break;
            }
            case 31749: {
                this.b((ewc)dxq2);
                break;
            }
            case 31750: {
                this.b((ewe)dxq2);
                break;
            }
            case 31751: {
                this.b((ewd)dxq2);
                break;
            }
            case 31754: {
                this.b((ewh)dxq2);
                break;
            }
            case 31755: {
                this.b((ewf)dxq2);
                break;
            }
            case 31756: {
                this.b((ewi)dxq2);
                break;
            }
            case 31752: {
                this.b((ewm)dxq2);
                break;
            }
            case 31753: {
                this.b((ewn)dxq2);
                break;
            }
            case 31757: {
                this.b((ewj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ewk ewk2) {
        if (this.akC.containsKey(ewk2.bMX().afl())) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoClanUpdateMessage() : Duplicate Challenge Registration!!!... Holding = " + ewk2.bMX().afw() + " [" + ewk2.bMX().afl().fk() + "], Defender Clan = " + ewk2.bMX().afB() + " [" + ewk2.bMX().afk().fk() + "]");
            assert (false);
        }
        this.akC.put(ewk2.bMX().afl(), ewk2.bMX());
    }

    private void b(ewg ewg2) {
        if (this.akC.containsKey(ewg2.bMX().afl())) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoClanUpdateMessage() : Duplicate Challenge Registration!!!... Holding = " + ewg2.bMX().afw() + " [" + ewg2.bMX().afl().fk() + "], Defender Clan = " + ewg2.bMX().afB() + " [" + ewg2.bMX().afk().fk() + "]");
            assert (false);
            return;
        }
        this.akC.put(ewg2.bMX().afl(), ewg2.bMX());
        this.a(ewg2);
    }

    private void b(ewb ewb2) {
        azz azz2 = this.akC.get(ewb2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerJoinedChallengeMessage() : Challenge Not Found!!!... Challenged Holding = " + ewb2.aiK() + ", FromGUID = " + ewb2.aO());
            assert (false);
            return;
        }
        if (!azz2.b(ewb2.bMV())) {
            return;
        }
        this.a(ewb2);
    }

    private void b(ewc ewc2) {
        azz azz2 = this.akC.get(ewc2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerPlacedSiegeStoneMessage() : Challenge Not Found!!!... Challenged Holding = " + ewc2.aiK() + ", FromGUID = " + ewc2.aO());
            assert (false);
            return;
        }
        if (!azz2.B(ewc2.bKb(), ewc2.bMW())) {
            return;
        }
        this.a(ewc2);
    }

    private void b(ewe ewe2) {
        azz azz2 = this.akC.get(ewe2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerSiegeStoneDestroyedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewe2.aiK() + ", FromGUID = " + ewe2.aO());
            assert (false);
            return;
        }
        if (!azz2.B(ewe2.bKb(), ewe2.bMW())) {
            return;
        }
        this.a(ewe2);
    }

    private void b(ewd ewd2) {
        azz azz2 = this.akC.get(ewd2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerRemovedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewd2.aiK() + ", FromGUID = " + ewd2.aO());
            assert (false);
            return;
        }
        if (!azz2.fE(ewd2.bKb())) {
            return;
        }
        this.a(ewd2);
    }

    private void b(ewh ewh2) {
        azz azz2 = this.akC.get(ewh2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoChallengeStateChangedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewh2.aiK() + ", FromGUID = " + ewh2.aO());
            assert (false);
            return;
        }
        if (!azz2.b(ewh2.afH(), ewh2.afI(), ewh2.afK(), ewh2.afL())) {
            return;
        }
        this.a(ewh2);
    }

    private void b(ewf ewf2) {
        if (this.akC.remove(ewf2.aiK()) == null) {
            return;
        }
        this.a(ewf2);
    }

    private void b(ewi ewi2) {
        azz azz2 = this.akC.get(ewi2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoChallengeTimersAdjustedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewi2.aiK() + ", FromGUID = " + ewi2.aO());
            assert (false);
            return;
        }
        if (!azz2.aD(ewi2.bLm())) {
            return;
        }
        this.a(ewi2);
    }

    private void b(ewm ewm2) {
        azz azz2 = this.akC.get(ewm2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoMercenaryClanJoinedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewm2.aiK() + ", FromGUID = " + ewm2.aO());
            assert (false);
            return;
        }
        if (ewm2.bKb() == null ? !azz2.c(ewm2.bMZ()) : !azz2.a(ewm2.bKb(), ewm2.bMZ())) {
            return;
        }
        this.a(ewm2);
    }

    private void b(ewn ewn2) {
        azz azz2 = this.akC.get(ewn2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoMercenaryClanJoinedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewn2.aiK() + ", FromGUID = " + ewn2.aO());
            assert (false);
            return;
        }
        if (ewn2.bKb() == null ? !azz2.d(ewn2.bMZ()) : !azz2.b(ewn2.bKb(), ewn2.bMZ())) {
            return;
        }
        this.a(ewn2);
    }

    private void b(ewj ewj2) {
        azz azz2 = this.akC.get(ewj2.afl());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoClanNameChangedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewj2.afl() + ", FromGUID = " + ewj2.aO());
            assert (false);
            return;
        }
        if (!azz2.n(ewj2.iG(), ewj2.iV())) {
            return;
        }
        this.a(ewj2);
    }
}

