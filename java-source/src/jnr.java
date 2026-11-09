/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class jnr
extends btk {
    public static bae itF = null;
    private Map<Class, Set> nEn = lcn.emw();
    private boolean gIC = false;
    private Set<hut> gID = null;
    private Set<hut> gIE = null;
    private Map<ldv, azz> nEo = lcn.emw();

    public boolean HT() {
        return itF != null;
    }

    public void a(hut hut2) {
        if (hut2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gID == null) {
                this.gID = lcn.emx();
            }
            this.gID.add(hut2);
            if (this.gIE != null) {
                this.gIE.remove(hut2);
            }
        } else {
            Class<?>[] classArray = hut2.getClass().getInterfaces();
            for (int j = 0; j < classArray.length; ++j) {
                this.a(classArray[j], hut2);
            }
        }
    }

    private void a(Class<?> clazz, hut hut2) {
        if (!hut.class.isAssignableFrom(clazz)) {
            return;
        }
        Set<hut> set = this.nEn.get(clazz);
        if (set == null) {
            set = lcn.emx();
            this.nEn.put(clazz, set);
        }
        if (!set.contains(hut2)) {
            set.add(hut2);
        }
        Class<?>[] classArray = clazz.getInterfaces();
        for (int j = 0; j < classArray.length; ++j) {
            this.a(classArray[j], hut2);
        }
    }

    <T> Set<T> c(Class<T> clazz) {
        return this.nEn.containsKey(clazz) ? this.nEn.get(clazz) : new HashSet();
    }

    public void b(hut hut2) {
        if (hut2 == null) {
            return;
        }
        if (this.gIC) {
            if (this.gIE == null) {
                this.gIE = lcn.emx();
            }
            this.gIE.add(hut2);
            if (this.gID != null) {
                this.gID.remove(hut2);
            }
        } else {
            for (Set set : this.nEn.values()) {
                set.remove(hut2);
            }
        }
    }

    void ir(boolean bl) {
        if (bl == this.gIC) {
            return;
        }
        this.gIC = bl;
        if (!this.gIC) {
            if (this.gID != null) {
                for (hut hut2 : this.gID) {
                    this.a(hut2);
                }
            }
            if (this.gIE != null) {
                for (hut hut2 : this.gIE) {
                    this.b(hut2);
                }
            }
        }
    }

    public azz sX(ldv ldv2) {
        return this.nEo == null ? null : this.nEo.get(ldv2);
    }

    public azz[] sY(ldv ldv2) {
        Set<azz> set = lcn.emx();
        if (this.nEo != null) {
            for (azz azz2 : this.nEo.values()) {
                if (!azz2.q(ldv2, true)) continue;
                set.add(azz2);
            }
        }
        return set.toArray(new azz[set.size()]);
    }

    public azz sR(String string) {
        if (this.nEo == null || this.nEo.isEmpty()) {
            return null;
        }
        for (azz azz2 : this.nEo.values()) {
            if (azz2.afw().compareToIgnoreCase(string) != 0) continue;
            return azz2;
        }
        return null;
    }

    public boolean sZ(ldv ldv2) {
        return this.nEo.containsKey(ldv2);
    }

    public boolean ta(ldv ldv2) {
        azz azz2 = this.nEo.get(ldv2);
        if (azz2 == null) {
            return false;
        }
        return azz2.afG() - (this.MessageDelegator.arc().rgz - azz2.afJ()) <= 0.0;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 31746: {
                this.a((ewl)dxq2);
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
                return;
            }
        }
    }

    private void a(ewl ewl2) {
        this.nEo.clear();
        for (int j = 0; j < ewl2.bMY().length; ++j) {
            this.nEo.put(ewl2.bMY()[j].afl(), ewl2.bMY()[j]);
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewg ewg2) {
        if (this.nEo.containsKey(ewg2.bMX().afl())) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoClanUpdateMessage() : Duplicate Challenge Registration!!!... Holding = " + ewg2.bMX().afw() + " [" + ewg2.bMX().afl().fk() + "], Defender Clan = " + ewg2.bMX().afB() + " [" + ewg2.bMX().afk().fk() + "]");
            assert (false);
            return;
        }
        this.nEo.put(ewg2.bMX().afl(), ewg2.bMX());
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewb ewb2) {
        azz azz2 = this.nEo.get(ewb2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerJoinedChallengeMessage() : Challenge Not Found!!!... Challenged Holding = " + ewb2.aiK() + ", FromGUID = " + ewb2.aO());
            assert (false);
            return;
        }
        if (!azz2.b(ewb2.bMV())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewc ewc2) {
        azz azz2 = this.nEo.get(ewc2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerPlacedSiegeStoneMessage() : Challenge Not Found!!!... Challenged Holding = " + ewc2.aiK() + ", FromGUID = " + ewc2.aO());
            assert (false);
            return;
        }
        if (!azz2.B(ewc2.bKb(), ewc2.bMW())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewe ewe2) {
        azz azz2 = this.nEo.get(ewe2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerSiegeStoneDestroyedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewe2.aiK() + ", FromGUID = " + ewe2.aO());
            assert (false);
            return;
        }
        if (!azz2.B(ewe2.bKb(), ewe2.bMW())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewd ewd2) {
        azz azz2 = this.nEo.get(ewd2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoAttackerRemovedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewd2.aiK() + ", FromGUID = " + ewd2.aO());
            assert (false);
            return;
        }
        if (!azz2.fE(ewd2.bKb())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewh ewh2) {
        azz azz2 = this.nEo.get(ewh2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoChallengeStateChangedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewh2.aiK() + ", FromGUID = " + ewh2.aO());
            assert (false);
            return;
        }
        if (!azz2.b(ewh2.afH(), ewh2.afI(), ewh2.afK(), ewh2.afL())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewf ewf2) {
        if (this.nEo.remove(ewf2.aiK()) == null) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewi ewi2) {
        azz azz2 = this.nEo.get(ewi2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoChallengeTimersAdjustedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewi2.aiK() + ", FromGUID = " + ewi2.aO());
            assert (false);
            return;
        }
        if (!azz2.aD(ewi2.bLm())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewm ewm2) {
        azz azz2 = this.nEo.get(ewm2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoMercenaryClanJoinedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewm2.aiK() + ", FromGUID = " + ewm2.aO());
            assert (false);
            return;
        }
        if (ewm2.bKb() == null ? !azz2.c(ewm2.bMZ()) : !azz2.a(ewm2.bKb(), ewm2.bMZ())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewn ewn2) {
        azz azz2 = this.nEo.get(ewn2.aiK());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoMercenaryClanJoinedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewn2.aiK() + ", FromGUID = " + ewn2.aO());
            assert (false);
            return;
        }
        if (ewn2.bKb() == null ? !azz2.d(ewn2.bMZ()) : !azz2.b(ewn2.bKb(), ewn2.bMZ())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }

    private void b(ewj ewj2) {
        azz azz2 = this.nEo.get(ewj2.afl());
        if (azz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleConquestGlobalInfoClanNameChangedMessage() : Challenge Not Found!!!... Challenged Holding = " + ewj2.afl() + ", FromGUID = " + ewj2.aO());
            assert (false);
            return;
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            hso.cxK().cxP().czb().B(ewj2.iG(), ewj2.iV());
        }
        if (!azz2.n(ewj2.iG(), ewj2.iV())) {
            return;
        }
        Set<huu> set = this.c(huu.class);
        if (!set.isEmpty()) {
            this.ir(true);
            for (huu huu2 : set) {
                huu2.cyE();
            }
            this.ir(false);
        }
    }
}

