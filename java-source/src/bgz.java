/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.TreeMap;

public class bgz
extends bgk {
    public static bgh Tq = null;

    @Override
    protected void aoU() {
        super.aoU();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    protected void fw(String string) {
        super.fw(string);
    }

    @Override
    protected void aoT() {
        super.aoT();
    }

    @Override
    protected void t(Map<String, String> map) {
        super.t(map);
    }

    void ht(ldv ldv2) {
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (Tq != null);
        TreeMap<String, String> treeMap = lcn.emG();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        block8: for (Map.Entry<ldv, bgg> entry : Tq.aoF().entrySet()) {
            bgg bgg2 = entry.getValue();
            if (bgg2.getType() == 0) {
                ++n;
                switch (bgg2.cB()) {
                    case 1: {
                        if (bgg2.aoE() == 1) {
                            ++n15;
                            continue block8;
                        }
                        ++n16;
                        continue block8;
                    }
                    case 2: {
                        if (bgg2.aoE() == 1) {
                            ++n9;
                            continue block8;
                        }
                        ++n10;
                        continue block8;
                    }
                    case 3: {
                        if (bgg2.aoE() == 1) {
                            ++n5;
                            continue block8;
                        }
                        ++n6;
                        continue block8;
                    }
                    case 4: {
                        if (bgg2.aoE() == 1) {
                            ++n11;
                            continue block8;
                        }
                        ++n12;
                        continue block8;
                    }
                    case 5: {
                        if (bgg2.aoE() == 1) {
                            ++n13;
                            continue block8;
                        }
                        ++n14;
                        continue block8;
                    }
                    case 6: {
                        if (bgg2.aoE() == 1) {
                            ++n7;
                            continue block8;
                        }
                        ++n8;
                        continue block8;
                    }
                }
                ++n17;
                continue;
            }
            if (bgg2.getType() == 1) {
                ++n2;
                continue;
            }
            if (bgg2.getType() == 2) {
                ++n3;
                continue;
            }
            if (bgg2.getType() != 3) continue;
            ++n4;
        }
        treeMap.put("Total_Players", "" + n);
        treeMap.put("Total_AI", "" + n2);
        treeMap.put("Total_Spawns", "" + n3);
        treeMap.put("Total_Cities", "" + n4);
        treeMap.put("P_Alfar_Male", "" + n15);
        treeMap.put("P_Alfar_Female", "" + n16);
        treeMap.put("P_Dwarf_Male", "" + n9);
        treeMap.put("P_Dwarf_Female", "" + n10);
        treeMap.put("P_Human_Male", "" + n5);
        treeMap.put("P_Human_Female", "" + n6);
        treeMap.put("P_Mahirim_Male", "" + n11);
        treeMap.put("P_Mahirim_Female", "" + n12);
        treeMap.put("P_Mirdain_Male", "" + n13);
        treeMap.put("P_Mirdain_Female", "" + n14);
        treeMap.put("P_Ork_Male", "" + n7);
        treeMap.put("P_Ork_Female", "" + n8);
        treeMap.put("P_Race_Unknown", "" + n17);
        treeMap.put("Boat_Raft_01", "" + bgz.Tq.aoK().djx);
        treeMap.put("Boat_Wherry", "" + bgz.Tq.aoK().djy);
        treeMap.put("Boat_Launch", "" + bgz.Tq.aoK().djz);
        treeMap.put("Boat_Pinnace", "" + bgz.Tq.aoK().djB);
        treeMap.put("Boat_Sloop", "" + bgz.Tq.aoK().djA);
        treeMap.put("Boat_Coastal_Runner", "" + bgz.Tq.aoK().djC);
        treeMap.put("Boat_Fishing_Trawler", "" + bgz.Tq.aoK().djD);
        treeMap.put("Boat_Sea_Scraper", "" + bgz.Tq.aoK().djE);
        treeMap.put("Boat_Schooner", "" + bgz.Tq.aoK().djF);
        treeMap.put("Boat_Brigantine", "" + bgz.Tq.aoK().djG);
        treeMap.put("Boat_Junk", "" + bgz.Tq.aoK().djH);
        treeMap.put("Boat_Barque", "" + bgz.Tq.aoK().djI);
        treeMap.put("Boat_Frigate", "" + bgz.Tq.aoK().djJ);
        treeMap.put("Boat_ShipOfTheLine", "" + bgz.Tq.aoK().djK);
        treeMap.put("Boat_ManOWar", "" + bgz.Tq.aoK().djL);
        treeMap.put("Boat_Unknown", "" + bgz.Tq.aoK().djM);
        treeMap.put("Mount_Horse", "" + bgz.Tq.aoK().dkb);
        treeMap.put("Mount_DeathPig", "" + bgz.Tq.aoK().djX);
        treeMap.put("Mount_Eradan", "" + bgz.Tq.aoK().djY);
        treeMap.put("Mount_Garmir", "" + bgz.Tq.aoK().djZ);
        treeMap.put("Mount_ShulganDrage", "" + bgz.Tq.aoK().dka);
        treeMap.put("Mount_Unknown", "" + bgz.Tq.aoK().dkc);
        treeMap.put("Cannon_Mortar", "" + bgz.Tq.aoK().djS);
        treeMap.put("Cannon_Dragon", "" + bgz.Tq.aoK().djT);
        treeMap.put("Cannon_Headshot", "" + bgz.Tq.aoK().djU);
        treeMap.put("Cannon_Clan", "" + bgz.Tq.aoK().djV);
        treeMap.put("Cannon_Unknown", "" + bgz.Tq.aoK().djW);
        treeMap.put("Warhulk_Vileforge", "" + bgz.Tq.aoK().djO);
        treeMap.put("Warhulk_Stormhammer", "" + bgz.Tq.aoK().djN);
        treeMap.put("Warhulk_SpderScarab", "" + bgz.Tq.aoK().djQ);
        treeMap.put("Warhulk_BattleArk", "" + bgz.Tq.aoK().djP);
        treeMap.put("Warhulk_Unknown", "" + bgz.Tq.aoK().djR);
        treeMap.put("NPC_Alfars", "" + bgz.Tq.aoK().dkd);
        treeMap.put("NPC_Humans", "" + bgz.Tq.aoK().dkf);
        treeMap.put("NPC_Orks", "" + bgz.Tq.aoK().dki);
        treeMap.put("NPC_Dwarves", "" + bgz.Tq.aoK().dke);
        treeMap.put("NPC_Mahirims", "" + bgz.Tq.aoK().dkg);
        treeMap.put("NPC_Mirdains", "" + bgz.Tq.aoK().dkh);
        treeMap.put("NPC_Unknown", "" + bgz.Tq.aoK().dkj);
        treeMap.put("House_01", "" + bgz.Tq.aoK().dkp);
        treeMap.put("House_02", "" + bgz.Tq.aoK().dkq);
        treeMap.put("House_03", "" + bgz.Tq.aoK().dkr);
        treeMap.put("House_04", "" + bgz.Tq.aoK().dks);
        treeMap.put("House_05", "" + bgz.Tq.aoK().dkt);
        treeMap.put("House_Unknown", "" + bgz.Tq.aoK().dku);
        treeMap.put("House_01_Base", "" + bgz.Tq.aoK().dkk);
        treeMap.put("House_02_Base", "" + bgz.Tq.aoK().dkl);
        treeMap.put("House_03_Base", "" + bgz.Tq.aoK().dkm);
        treeMap.put("House_04_Base", "" + bgz.Tq.aoK().dkn);
        treeMap.put("House_Base_Unknown", "" + bgz.Tq.aoK().dko);
        treeMap.put("ControlPoint_Village", "" + bgz.Tq.aoK().dkv);
        treeMap.put("ControlPoint_Unknown", "" + bgz.Tq.aoK().dkw);
        treeMap.put("Stone_Greater", "" + bgz.Tq.aoK().dky);
        treeMap.put("Stone_Chaos", "" + bgz.Tq.aoK().dkx);
        treeMap.put("Stone_ClanCity", "" + bgz.Tq.aoK().dkz);
        treeMap.put("Stone_ClanHamlet", "" + bgz.Tq.aoK().dkA);
        treeMap.put("Stone_Unknown", "" + bgz.Tq.aoK().dkB);
        treeMap.put("GuardTower_City", "" + bgz.Tq.aoK().dkC);
        treeMap.put("GuardTower_Clan", "" + bgz.Tq.aoK().dkD);
        treeMap.put("GuardTower_Unknown", "" + bgz.Tq.aoK().dkE);
        treeMap.put("Chest_Chaos", "" + bgz.Tq.aoK().dkF);
        treeMap.put("PHouse_Door", "" + bgz.Tq.aoK().dkG);
        treeMap.put("PHouse_ResourceSpawn", "" + bgz.Tq.aoK().dkH);
        treeMap.put("PHouse_Props", "" + bgz.Tq.aoK().dkI);
        treeMap.put("PHouse_TaxPaid", "" + bgz.Tq.aoK().dkJ);
        treeMap.put("PHouse_TaxUnPaid", "" + bgz.Tq.aoK().dkK);
        treeMap.put("PHouse_WorkStation", "" + bgz.Tq.aoK().dkL);
        treeMap.put("Teleport_Entrance", "" + bgz.Tq.aoK().dkM);
        treeMap.put("Teleport_Exit", "" + bgz.Tq.aoK().dkN);
        treeMap.put("CLAN_Keep", "" + bgz.Tq.aoK().dkO);
        treeMap.put("CLAN_RES_SPAWN", "" + bgz.Tq.aoK().dkP);
        treeMap.put("CLAN_WALLS", "" + bgz.Tq.aoK().dkQ);
        treeMap.put("CLAN_WONDERS", "" + bgz.Tq.aoK().dkR);
        treeMap.put("CLAN_Workstations", "" + bgz.Tq.aoK().dkS);
        treeMap.put("CLAN_Buildings", "" + bgz.Tq.aoK().dkT);
        treeMap.put("CLAN_Props", "" + bgz.Tq.aoK().dkU);
        treeMap.put("CLAN_Banks", "" + bgz.Tq.aoK().dkV);
        treeMap.put("Resource_Uknown", "" + bgz.Tq.aoK().dlg);
        int n18 = Tq.aoH().size();
        treeMap.put("AINodes", "" + n18);
        n18 = Tq.aoG().size();
        treeMap.put("StreamListeners", "" + n18);
        if (bgz.Tq.djq) {
            treeMap.put("UpdateAI", "true");
        } else {
            treeMap.put("UpdateAI", "false");
        }
        if (bgz.Tq.djr) {
            treeMap.put("UpdatePlayer", "true");
        } else {
            treeMap.put("UpdatePlayer", "false");
        }
        treeMap.put("Frequency", "" + bgz.Tq.djs);
        this.t(treeMap);
        this.aoU();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }
}

