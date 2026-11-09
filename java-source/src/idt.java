/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFClanPlayerPoliticalStanceDTO;
import spenefett.hid.gui.serialization.dto.SFClanPlayerPoliticsDTO;
import spenefett.hid.gui.serialization.dto.SFStringsClanPlayerPoliticsDTO;

public class idt
extends idw
implements htx,
huj,
huk,
hup {
    private bcm[] lKT = null;
    private bcm[] lKU = null;
    private bcm[] lKV = null;
    private Map<ldv, SFClanPlayerPoliticalStanceDTO> dig = lcn.emw();
    private Map<ldv, SFClanPlayerPoliticalStanceDTO> lKW = lcn.emw();
    private Map<Integer, ldv> lKX = lcn.emw();
    private int lKY = 0;

    idt() {
        super("ClanToPlayerPolitics", "clantoplayerpolitics.swf", iee.lMD);
    }

    @Override
    protected void cON() {
        super.cON();
        this.lLm.a(hyy.b.ltx, this.isVisible() ? 1 : 0);
    }

    private void cOZ() {
        SFClanPlayerPoliticalStanceDTO sFClanPlayerPoliticalStanceDTO;
        if (this.lKT == null) {
            this.lKT = this.leq.dNv();
        }
        if (this.lKU == null) {
            this.lKU = this.leq.dNw();
        }
        if (this.lKV == null) {
            this.lKV = this.leq.dNx();
        }
        for (SFClanPlayerPoliticalStanceDTO sFClanPlayerPoliticalStanceDTO2 : this.dig.values()) {
            sFClanPlayerPoliticalStanceDTO2.killOnSight = false;
            sFClanPlayerPoliticalStanceDTO2.allowedToBind = false;
            sFClanPlayerPoliticalStanceDTO2.banned = false;
        }
        if (this.lKT != null) {
            for (bcm object : this.lKT) {
                sFClanPlayerPoliticalStanceDTO = this.dig.get(object.qd());
                if (sFClanPlayerPoliticalStanceDTO == null) {
                    sFClanPlayerPoliticalStanceDTO = new SFClanPlayerPoliticalStanceDTO();
                    sFClanPlayerPoliticalStanceDTO.playerName = object.hl();
                    ++this.lKY;
                    sFClanPlayerPoliticalStanceDTO.id = sFClanPlayerPoliticalStanceDTO.id;
                    this.lKX.put(sFClanPlayerPoliticalStanceDTO.id, object.qd());
                    this.dig.put(object.qd(), sFClanPlayerPoliticalStanceDTO);
                }
                sFClanPlayerPoliticalStanceDTO.killOnSight = true;
            }
        }
        if (this.lKU != null) {
            for (bcm bcm2 : this.lKU) {
                sFClanPlayerPoliticalStanceDTO = this.dig.get(bcm2.qd());
                if (sFClanPlayerPoliticalStanceDTO == null) {
                    sFClanPlayerPoliticalStanceDTO = new SFClanPlayerPoliticalStanceDTO();
                    sFClanPlayerPoliticalStanceDTO.playerName = bcm2.hl();
                    ++this.lKY;
                    sFClanPlayerPoliticalStanceDTO.id = sFClanPlayerPoliticalStanceDTO.id;
                    this.lKX.put(sFClanPlayerPoliticalStanceDTO.id, bcm2.qd());
                    this.dig.put(bcm2.qd(), sFClanPlayerPoliticalStanceDTO);
                }
                sFClanPlayerPoliticalStanceDTO.allowedToBind = true;
            }
        }
        if (this.lKV != null) {
            for (bcm bcm3 : this.lKV) {
                sFClanPlayerPoliticalStanceDTO = this.dig.get(bcm3.qd());
                if (sFClanPlayerPoliticalStanceDTO == null) {
                    sFClanPlayerPoliticalStanceDTO = new SFClanPlayerPoliticalStanceDTO();
                    sFClanPlayerPoliticalStanceDTO.playerName = bcm3.hl();
                    ++this.lKY;
                    sFClanPlayerPoliticalStanceDTO.id = sFClanPlayerPoliticalStanceDTO.id;
                    this.lKX.put(sFClanPlayerPoliticalStanceDTO.id, bcm3.qd());
                    this.dig.put(bcm3.qd(), sFClanPlayerPoliticalStanceDTO);
                }
                sFClanPlayerPoliticalStanceDTO.banned = true;
            }
        }
        Iterator<Map.Entry<ldv, SFClanPlayerPoliticalStanceDTO>> iterator = this.dig.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (((SFClanPlayerPoliticalStanceDTO)entry.getValue()).killOnSight || ((SFClanPlayerPoliticalStanceDTO)entry.getValue()).allowedToBind || ((SFClanPlayerPoliticalStanceDTO)entry.getValue()).banned) continue;
            iterator.remove();
        }
        SFClanPlayerPoliticsDTO sFClanPlayerPoliticsDTO = new SFClanPlayerPoliticsDTO();
        sFClanPlayerPoliticsDTO.players = lcn.emv();
        sFClanPlayerPoliticsDTO.players.addAll(this.dig.values());
        this.a("takePlayerPoliticsValues", new Object[]{sFClanPlayerPoliticsDTO});
    }

    @Override
    public void oi() {
        this.a("setPermissions", new Object[]{this.leq.i(bca.cUm), this.leq.i(bca.cUo), this.leq.i(bca.cTT)});
    }

    @Override
    public void cyy() {
        this.a("setPermissions", new Object[]{this.leq.i(bca.cUm), this.leq.i(bca.cUo), this.leq.i(bca.cTT)});
    }

    @Override
    public void a(bcm[] bcmArray) {
        this.lKT = bcmArray;
        this.cOZ();
    }

    @Override
    public void b(bcm[] bcmArray) {
        this.lKU = bcmArray;
        this.cOZ();
    }

    @Override
    public void c(bcm[] bcmArray) {
        this.lKV = bcmArray;
        this.cOZ();
    }

    @Override
    public void a(lz[] lzArray) {
        SFClanPlayerPoliticsDTO sFClanPlayerPoliticsDTO = new SFClanPlayerPoliticsDTO();
        sFClanPlayerPoliticsDTO.players = lcn.emv();
        if (lzArray != null) {
            for (lz lz2 : lzArray) {
                if (this.dig.containsKey(lz2.Ri) || lz2.Ri.equals(hso.cxK().bAn().Tr) || this.leq.sC(lz2.Ri)) continue;
                SFClanPlayerPoliticalStanceDTO sFClanPlayerPoliticalStanceDTO = this.lKW.get(lz2.Ri);
                if (sFClanPlayerPoliticalStanceDTO == null) {
                    sFClanPlayerPoliticalStanceDTO = new SFClanPlayerPoliticalStanceDTO();
                    sFClanPlayerPoliticalStanceDTO.playerName = lz2.bc;
                    ++this.lKY;
                    sFClanPlayerPoliticalStanceDTO.id = sFClanPlayerPoliticalStanceDTO.id;
                    this.lKX.put(sFClanPlayerPoliticalStanceDTO.id, lz2.Ri);
                    this.lKW.put(lz2.Ri, sFClanPlayerPoliticalStanceDTO);
                }
                sFClanPlayerPoliticsDTO.players.add(sFClanPlayerPoliticalStanceDTO);
            }
        }
        this.a("takeSearchResults", new Object[]{sFClanPlayerPoliticsDTO});
    }

    @Override
    public void nK(String string) {
        this.lLn = false;
        this.a("politicalStanceUpdateFailed", new Object[]{string});
    }

    @Override
    public void nL(String string) {
        this.lLn = false;
        this.a("politicalStanceUpdateSucceeded", new Object[]{string});
    }

    @Override
    protected void cOO() {
        this.leq.a(this);
        if (this.lLs) {
            this.lKT = null;
            this.lKV = null;
            this.lKU = null;
            this.a("resetWindow", new Object[0]);
        }
        this.a("setPermissions", new Object[]{this.leq.i(bca.cUm), this.leq.i(bca.cUo), this.leq.i(bca.cTT)});
        this.cOZ();
        this.lLs = false;
    }

    @Override
    protected void cOP() {
        this.a("setHeight", new Object[]{this.fc});
    }

    @Override
    protected void cOQ() {
        SFStringsClanPlayerPoliticsDTO sFStringsClanPlayerPoliticsDTO = new SFStringsClanPlayerPoliticsDTO();
        sFStringsClanPlayerPoliticsDTO.title = lwm.tce.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.playerNameHeader = lwm.tfk.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.kosColumnHeader = lwm.tfl.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.bindColumnHeader = lwm.tfm.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.bannedColumnHeader = lwm.tfn.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.addPlayerButtonText = lwm.tfo.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.showListButtonText = lwm.tfp.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.searchTextDefaultTextListView = lwm.tfq.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.searchTextDefaultTextAddPlayerView = lwm.tfr.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.updateClanAction = lwm.tfs.bD(new Object[0]).exA();
        sFStringsClanPlayerPoliticsDTO.updatingClanAction = lwm.tft.bD(new Object[0]).exA();
        this.a("takeStrings", new Object[]{sFStringsClanPlayerPoliticsDTO});
    }

    @Override
    protected void cOR() {
        super.cOR();
        if (!lLj.containsKey("PlayerPoliticsAddPlayer")) {
            lLj.put("PlayerPoliticsKOS", new lfs<lox, lox>(lyr.tIT, lyr.tIU));
            lLj.put("PlayerPoliticsBanned", new lfs<lox, lox>(lyr.tIV, lyr.tIW));
            lLj.put("PlayerPoliticsBind", new lfs<lox, lox>(lyr.tIX, lyr.tIY));
            lLj.put("PlayerPoliticsAddPlayer", new lfs<lox, lox>(lyr.tIZ, lyr.tJa));
            lLj.put("PlayerPoliticsSearchForPlayer", new lfs<lox, lox>(lyr.tJb, lyr.tJc));
        }
    }

    @llk
    public void searchForPlayer(String string) {
        this.leq.a(string, this);
    }

    @llk
    public void updatePlayerPolitics(SFClanPlayerPoliticsDTO sFClanPlayerPoliticsDTO) {
        SFClanPlayerPoliticalStanceDTO sFClanPlayerPoliticalStanceDTO;
        ldv ldv2;
        SFClanPlayerPoliticalStanceDTO sFClanPlayerPoliticalStanceDTO22;
        this.lLn = true;
        Set<ldv> set = lcn.emx();
        Set<ldv> set2 = lcn.emx();
        Set<ldv> set3 = lcn.emx();
        Set<ldv> set4 = lcn.emx();
        Set<ldv> set5 = lcn.emx();
        Set<ldv> set6 = lcn.emx();
        for (SFClanPlayerPoliticalStanceDTO sFClanPlayerPoliticalStanceDTO22 : sFClanPlayerPoliticsDTO.players) {
            ldv2 = this.lKX.get(sFClanPlayerPoliticalStanceDTO22.id);
            SFClanPlayerPoliticalStanceDTO sFClanPlayerPoliticalStanceDTO3 = sFClanPlayerPoliticalStanceDTO = this.dig.containsKey(ldv2) ? this.dig.get(ldv2) : this.lKW.get(ldv2);
            if (sFClanPlayerPoliticalStanceDTO == null) {
                lfn.b(5, this.getClass().getSimpleName(), "updatePlayerPolitics() : No Player Found for Received ID!!!... ID = " + sFClanPlayerPoliticalStanceDTO22.id);
                assert (false);
                continue;
            }
            if (sFClanPlayerPoliticalStanceDTO22.killOnSight) {
                if (!sFClanPlayerPoliticalStanceDTO.killOnSight) {
                    set.add(ldv2);
                }
            } else if (sFClanPlayerPoliticalStanceDTO.killOnSight) {
                set2.add(ldv2);
            }
            if (sFClanPlayerPoliticalStanceDTO22.allowedToBind) {
                if (!sFClanPlayerPoliticalStanceDTO.allowedToBind) {
                    set3.add(ldv2);
                }
            } else if (sFClanPlayerPoliticalStanceDTO.allowedToBind) {
                set4.add(ldv2);
            }
            if (sFClanPlayerPoliticalStanceDTO22.banned) {
                if (!sFClanPlayerPoliticalStanceDTO.banned) {
                    set5.add(ldv2);
                }
            } else if (sFClanPlayerPoliticalStanceDTO.banned) {
                set6.add(ldv2);
            }
            if (!sFClanPlayerPoliticalStanceDTO22.killOnSight || !sFClanPlayerPoliticalStanceDTO22.allowedToBind) continue;
            this.a("politicalStanceUpdateFailed", new Object[]{bco.cWH.YF().bD(sFClanPlayerPoliticalStanceDTO22.playerName).exA()});
            return;
        }
        if (set.isEmpty() && set2.isEmpty() && set3.isEmpty() && set4.isEmpty() && set5.isEmpty() && set6.isEmpty()) {
            this.a("politicalStanceUpdateFailed", new Object[]{bco.cWG.YF().bD(new Object[0]).exA()});
            return;
        }
        Iterator<SFClanPlayerPoliticalStanceDTO> iterator = set.isEmpty() ? null : set.toArray(new ldv[set.size()]);
        sFClanPlayerPoliticalStanceDTO22 = set2.isEmpty() ? null : set2.toArray(new ldv[set2.size()]);
        ldv2 = set3.isEmpty() ? null : set3.toArray(new ldv[set3.size()]);
        sFClanPlayerPoliticalStanceDTO = set4.isEmpty() ? null : set4.toArray(new ldv[set4.size()]);
        ldv[] ldvArray = set5.isEmpty() ? null : set5.toArray(new ldv[set5.size()]);
        ldv[] ldvArray2 = set6.isEmpty() ? null : set6.toArray(new ldv[set6.size()]);
        this.leq.a((ldv[])iterator, (ldv[])sFClanPlayerPoliticalStanceDTO22, (ldv[])ldv2, (ldv[])sFClanPlayerPoliticalStanceDTO, ldvArray, ldvArray2, this);
    }
}

