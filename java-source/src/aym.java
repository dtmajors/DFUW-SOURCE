/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
import java.util.AbstractCollection;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanDetailedInformationDTO;
import spenefett.hid.gui.serialization.dto.SFClanMembershipCountsDTO;
import spenefett.hid.gui.serialization.dto.SFClanMembershipRestrictionsDTO;

public class aym
extends ayq {
    protected ayp[] czC = null;
    protected bcq[] czD = null;
    protected ayk[] czE = null;

    public ayp[] abb() {
        return this.czC;
    }

    public bcq[] abc() {
        return this.czD;
    }

    public ayk[] abd() {
        return this.czE;
    }

    @Deprecated
    public aym() {
    }

    public aym(ayd ayd2) {
        super(ayd2);
        this.czC = ayd2.aao();
        this.czD = ayd2.aac();
        this.czE = ayd2.aaD();
    }

    public aym(ayq ayq2) {
        super(ayq2);
        this.czC = new ayp[1];
        for (int i = 0; i < this.czC.length; ++i) {
            this.czC[i] = new ayp(ayq2.iG());
        }
        this.czD = new bcq[0];
        this.czE = new ayk[0];
    }

    public void a(ayq ayq2, bcr bcr2, bcr bcr3) {
        bcq bcq2;
        bcq[] bcqArray = new bcq[this.czD.length + 1];
        for (int i = 0; i < this.czD.length; ++i) {
            bcqArray[i] = this.czD[i];
        }
        bcqArray[bcqArray.length - 1] = bcq2 = new bcq(ayq2.iG(), ayq2.iV(), bcr2, bcr3, 0L);
        this.czD = bcqArray;
    }

    public SFClanDetailedInformationDTO a(ljq ljq2, jng jng2, jnr jnr2, dmn dmn2, ldz ldz2) {
        Object object;
        Object[] objectArray;
        Object object2;
        String string;
        SFClanMembershipRestrictionsDTO sFClanMembershipRestrictionsDTO = new SFClanMembershipRestrictionsDTO();
        sFClanMembershipRestrictionsDTO.acceptingNewMembers = this.cAh;
        sFClanMembershipRestrictionsDTO.acceptingAlfar = this.iW(1);
        sFClanMembershipRestrictionsDTO.acceptingDwarf = this.iW(2);
        sFClanMembershipRestrictionsDTO.acceptingHuman = this.iW(3);
        sFClanMembershipRestrictionsDTO.acceptingMahirim = this.iW(4);
        sFClanMembershipRestrictionsDTO.acceptingMirdain = this.iW(5);
        sFClanMembershipRestrictionsDTO.acceptingOrk = this.iW(6);
        SFClanMembershipCountsDTO sFClanMembershipCountsDTO = new SFClanMembershipCountsDTO();
        sFClanMembershipCountsDTO.totalMembers = this.cAj[0];
        sFClanMembershipCountsDTO.alfarMembers = this.cAj[1];
        sFClanMembershipCountsDTO.dwarfMembers = this.cAj[2];
        sFClanMembershipCountsDTO.humanMembers = this.cAj[3];
        sFClanMembershipCountsDTO.mahirimMembers = this.cAj[4];
        sFClanMembershipCountsDTO.mirdainMembers = this.cAj[5];
        sFClanMembershipCountsDTO.orkMembers = this.cAj[6];
        Set<bbh> set = dmn2.nh(this.ade);
        Set<bbi> set2 = dmn2.nm(this.ade);
        boolean bl = false;
        int n = this.czC.length - 1;
        while (!bl) {
            bl = true;
            for (int i = 0; i < n; ++i) {
                String string2 = lvm.sWY.bD(this.czC[i].getID()).exA();
                if (string2.compareTo(string = lvm.sWY.bD(this.czC[i + 1].getID()).exA()) <= 0) continue;
                object2 = this.czC[i];
                this.czC[i] = this.czC[i + 1];
                this.czC[i + 1] = object2;
                bl = false;
            }
            --n;
        }
        bl = false;
        n = set.size() - 1;
        bbh[] bbhArray = set.toArray(new bbh[set.size()]);
        while (!bl) {
            bl = true;
            for (int i = 0; i < n; ++i) {
                string = lvm.sWZ.bD(bbhArray[i].getID()).exA();
                if (string.compareTo((String)(object2 = lvm.sWZ.bD(bbhArray[i + 1].getID()).exA())) <= 0) continue;
                objectArray = bbhArray[i];
                bbhArray[i] = bbhArray[i + 1];
                bbhArray[i + 1] = objectArray;
                bl = false;
            }
            --n;
        }
        bl = false;
        n = set2.size() - 1;
        bbi[] bbiArray = set2.toArray(new bbi[set2.size()]);
        while (!bl) {
            bl = true;
            for (int i = 0; i < n; ++i) {
                object2 = lvm.sXg.bD(bbiArray[i].av()).exA();
                if (((String)object2).compareTo((String)(objectArray = lvm.sXg.bD(bbiArray[i + 1].av()).exA())) <= 0) continue;
                object = bbiArray[i];
                bbiArray[i] = bbiArray[i + 1];
                bbiArray[i + 1] = object;
                bl = false;
            }
            --n;
        }
        SFClanDetailedInformationDTO sFClanDetailedInformationDTO = new SFClanDetailedInformationDTO();
        sFClanDetailedInformationDTO.clanName = this.add;
        sFClanDetailedInformationDTO.clanFounderName = this.cAe;
        sFClanDetailedInformationDTO.leaderOnline = this.cAn;
        sFClanDetailedInformationDTO.leaderIsPlayer = jng2.sz(this.ade) && jng2.f(jng2.dNo());
        sFClanDetailedInformationDTO.clanLeaderName = this.cAf;
        sFClanDetailedInformationDTO.founderOnline = this.cAo;
        sFClanDetailedInformationDTO.founderIsPlayer = jng2.sz(this.ade) && jng2.f(jng2.dNp());
        sFClanDetailedInformationDTO.clanMotto = this.aDF;
        sFClanDetailedInformationDTO.clanCharter = this.aDG;
        sFClanDetailedInformationDTO.clanPointsTotal = this.aDP;
        sFClanDetailedInformationDTO.clanPointsAvailable = jng2.dNs();
        sFClanDetailedInformationDTO.membershipRestrictions = sFClanMembershipRestrictionsDTO;
        sFClanDetailedInformationDTO.membershipCounts = sFClanMembershipCountsDTO;
        sFClanDetailedInformationDTO.politicalStance = jng2.u((ayq)this).politicalStance;
        object2 = ayw.getEnumSet(this.cAi);
        sFClanDetailedInformationDTO.clanTags = lcn.emv();
        objectArray = ((AbstractCollection)object2).iterator();
        while (objectArray.hasNext()) {
            object = (ayw)((Object)objectArray.next());
            sFClanDetailedInformationDTO.clanTags.add(((ayw)((Object)object)).acb());
        }
        sFClanDetailedInformationDTO.holdings = lcn.emv();
        for (ayp baoArray : this.czC) {
            sFClanDetailedInformationDTO.holdings.add(baoArray.a(ljq2, jng2.sB(baoArray.YS()), jng2, jnr2, dmn2, ldz2));
        }
        sFClanDetailedInformationDTO.villages = lcn.emv();
        for (bbh bbh2 : bbhArray) {
            sFClanDetailedInformationDTO.villages.add(bbh2.c(jng2));
        }
        sFClanDetailedInformationDTO.fortresses = lcn.emv();
        for (bbi bbi2 : bbiArray) {
            sFClanDetailedInformationDTO.fortresses.add(bbi2.d(jng2));
        }
        sFClanDetailedInformationDTO.receivedContracts = lcn.emv();
        sFClanDetailedInformationDTO.receivedContractChallenges = lcn.emv();
        sFClanDetailedInformationDTO.sentContracts = lcn.emv();
        sFClanDetailedInformationDTO.sentContractChallenges = lcn.emv();
        if (jng2.dNh() && jng2.dNi().iG().equals(this.ade)) {
            boolean bl2;
            objectArray = jnr2.sY(this.ade);
            bao[] baoArray = jng2.dNi().cAL;
            bao[] baoArray2 = jng2.dNi().cAK;
            if (baoArray != null) {
                for (bao bao2 : baoArray) {
                    azz azz2;
                    bl2 = false;
                    for (int i = 0; i < objectArray.length; ++i) {
                        if (!((azz)objectArray[i]).afl().equals(bao2.aiK())) continue;
                        bl2 = true;
                        break;
                    }
                    if (bl2 || (azz2 = jnr2.sX(bao2.aiK())) == null) continue;
                    sFClanDetailedInformationDTO.receivedContracts.add(bao2.s(this.ade, true));
                    sFClanDetailedInformationDTO.receivedContractChallenges.add(azz2.a(jng2));
                }
            }
            if (baoArray2 != null) {
                for (bao bao2 : baoArray2) {
                    azz azz3;
                    bl2 = false;
                    for (int i = 0; i < objectArray.length; ++i) {
                        if (!((azz)objectArray[i]).afl().equals(bao2.aiK())) continue;
                        bl2 = true;
                        break;
                    }
                    if (bl2 || (azz3 = jnr2.sX(bao2.aiK())) == null) continue;
                    sFClanDetailedInformationDTO.sentContracts.add(bao2.s(this.ade, false));
                    sFClanDetailedInformationDTO.sentContractChallenges.add(azz3.a(jng2));
                }
            }
        }
        return sFClanDetailedInformationDTO;
    }
}

