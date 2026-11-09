/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hvj
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hvk
extends btk
implements hsx {
    private Map<Integer, dfb> lfl = lcn.emw();
    private Map<Integer, dfb> lfm = lcn.emw();
    private Map<Integer, dfb> lfn = lcn.emw();
    private dfb lfo;
    private dfb lfp;
    private dfb lfq;
    private dfb lfr;
    private dfb lfs;
    private dfb lft;
    private dfb lfu;
    private dfb lfv;
    private dfb lfw;
    private dfb lfx;
    private dfb lfy;
    private dfb lfz;
    private dfb lfA;
    private dfb lfB;
    private dfb lfC;
    private dfb lfD;
    private dfb lfE;
    private dfb lfF;
    private dfb lfG;
    private boolean lfH = true;
    private boolean lfI = true;
    private boolean lfJ = true;
    private boolean lfK = true;

    @Override
    public void initialize() {
        super.initialize();
        hvj hvj2 = hso.cxK().cxP();
        this.lfo = hvj2.s("notify_chat_whisper.xml", false);
        this.lfp = hvj2.s("notify_friend_online.xml", false);
        this.lfq = hvj2.s("notify_friend_offline.xml", false);
        this.lfr = hvj2.s("vendor_buy_item.xml", false);
        this.lfs = hvj2.s("vendor_sell_item.xml", false);
        this.lft = hvj2.s("item_drop.xml", false);
        this.lfu = hvj2.s("item_grab.xml", false);
        this.lfw = hvj2.s("feat_updated.xml", false);
        this.lfx = hvj2.s("feat_completed.xml", false);
        this.lfy = hvj2.s("feat_completed_multi.xml", false);
        this.lfz = hvj2.s("booster_buy.xml", false);
        this.lfA = hvj2.s("booster_select.xml", false);
        this.lfB = hvj2.s("change_page.xml", false);
        this.lfC = hvj2.s("confirm_changes.xml", false);
        this.lfD = hvj2.s("on_mouse_over.xml", false);
        this.lfE = hvj2.s("revert_changes.xml", false);
        this.lfF = hvj2.s("mouse_generic_click.xml", false);
        this.lfG = hvj2.s("action_confirm_success.xml", false);
        this.a(cug.fjj, null, null, null);
        this.a(cug.hV((String)"r_Armors Leather"), "armor_leather_drop.xml", "armor_leather_grab.xml", "armor_leather_equip.xml");
        this.a(cug.hV((String)"r_Armors Metal"), "armor_metal_drop.xml", "armor_metal_grab.xml", "armor_metal_equip.xml");
        this.a(cug.fjN, "cloths_drop.xml", "cloths_grab.xml", "cloths_equip.xml");
        this.a(cug.fkF, null, null, "item_drop.xml");
        this.a(cug.fuc, "cloths_drop.xml", "cloths_grab.xml", "cloths_equip.xml");
        this.a(cug.hV((String)"r_Consumables"), null, null, null);
        this.a(cug.fjP, null, null, null);
        this.a(cug.fnn, "figurine_drop.xml", "figurine_grab.xml", null);
        this.a(cug.fkb, "gold_drop.xml", "gold_grab.xml", null);
        this.a(cug.fke, "keys_drop.xml", "keys_grab.xml", null);
        this.a(cug.fkf, null, null, null);
        this.a(cug.fpP, null, null, null);
        this.a(cug.fkI, null, null, null);
        this.a(cug.fmO, null, null, "item_drop.xml");
        this.a(cug.fiu, "weapon_bow_drop.xml", "weapon_bow_grab.xml", "weapon_bow_equip.xml");
        this.a(cug.fiB, "weapon_staff_drop.xml", "weapon_staff_grab.xml", "weapon_staff_equip.xml");
        this.a(cug.fiC, "weapon_melee_drop.xml", "weapon_melee_grab.xml", "weapon_melee_equip.xml");
        this.a(cug.fiA, "weapon_knives_drop.xml", "weapon_knives_grab.xml", "weapon_knives_equip.xml");
        this.a(cug.fiM, "weapon_siege_drop.xml", "weapon_siege_grab.xml", "weapon_siege_equip.xml");
        this.a(cug.fiK, null, null, "item_drop.xml");
        this.a(cug.fqU, "paper_drop.xml", "paper_grab.xml", "paper_use.xml");
        this.a(cug.fqV, null, null, null);
        this.a(cug.hV((String)"r_Dynamic World Items"), null, null, "deployable_use.xml");
        this.a(cug.fpU, null, null, "deployable_use.xml");
        this.a(cug.fkR, "paper_drop.xml", "paper_grab.xml", "paper_use.xml");
        this.a(cug.fsG, null, null, null);
        this.a(cug.ftV, "selentine_item_drop.xml", null, "selentine_item_use.xml");
        this.a(cug.fjn, null, null, null);
        this.a(cug.fwp, null, null, null);
        this.a(cug.fwq, null, null, null);
        this.a(cug.fwr, null, null, null);
        hvj2.cze().a(this);
        igq.lTF.a((jli<List<ign>, List<ign>, List<ign>, Boolean>)new jlu<hvk, List<ign>, List<ign>, List<ign>, Boolean>(this, this){
            final /* synthetic */ hvk lfL;
            {
                this.lfL = hvk2;
                super(hvk3);
            }

            public void b(hvk hvk2, List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
                hvk.a(this.lfL, list, list2, list3, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3, Object object4, Object object5) {
                this.b((hvk)object, (List)object2, (List)object3, (List)object4, (Boolean)object5);
            }
        });
        Collection collection = hvj2.d(this.getClass());
        if (collection != null && !collection.isEmpty()) {
            for (dxq dxq2 : collection) {
                this.receiveMessage(dxq2);
            }
        }
        if (hvj2.cyJ() != null && hvj2.cyJ().cIM() != null) {
            this.oU(hvj2.cyJ().cIM().czO());
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cze() != null) {
            hso.cxK().cxP().cze().b(this);
        }
    }

    @Override
    public void VK() {
    }

    @Override
    public void bY(boolean bl) {
    }

    @Override
    public void a(jmz jmz2) {
        switch (jmz2.dMQ()) {
            case nDj: {
                jne jne2 = (jne)jmz2;
                jgr jgr2 = hso.cxK().cxP().cyJ().cHM();
                if (!this.lfH || ((jne)jmz2).dNb() || jne2.dMW() != null && jgr2.sh(jne2.dMW().toLowerCase())) break;
                this.a(this.lfo);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 31489: {
                this.c((gkr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void czE() {
        this.a(this.lfr);
    }

    public void czF() {
        this.a(this.lfs);
    }

    public void Op(int n) {
        this.a(n, this.lfm);
    }

    public void b(ifg ifg2) {
        hwo hwo2;
        bsh bsh2;
        ifh ifh2;
        hwm hwm2;
        if (ifg2 instanceof ifh && (hwm2 = (ifh2 = (ifh)ifg2).cQm()) != null && hwm2 instanceof hwo && (bsh2 = (hwo2 = (hwo)hwm2).cBu()) != null) {
            this.Op(bsh2.az());
        }
    }

    public void Oq(int n) {
        this.a(n, this.lfl);
    }

    public void Or(int n) {
        this.a(n, this.lfn);
    }

    public void a(hwo hwo2) {
        SFGUIElementDTO sFGUIElementDTO;
        if (hwo2 != null && hwo2.cBu() != null && (sFGUIElementDTO = hwo2.cBj()) != null && sFGUIElementDTO.state == hxw.llv.ordinal()) {
            this.Or(hwo2.cBu().az());
        }
    }

    public void oR(boolean bl) {
        this.lfH = bl;
    }

    public void oS(boolean bl) {
        this.lfI = bl;
    }

    public void oT(boolean bl) {
        this.lfJ = bl;
    }

    public void czG() {
        this.a(this.lfz);
    }

    public void czH() {
        this.a(this.lfA);
    }

    public void czI() {
        this.a(this.lfB);
    }

    public void czJ() {
        this.a(this.lfC);
    }

    public void czK() {
        this.a(this.lfD);
    }

    public void czL() {
        this.a(this.lfE);
    }

    public void czM() {
        this.a(this.lfF);
    }

    public void czN() {
        this.a(this.lfG);
    }

    public boolean czO() {
        return this.lfK;
    }

    public void oU(boolean bl) {
        this.lfK = bl;
    }

    private void c(gkr gkr2) {
        switch (gkr2.bFP()) {
            case 0: {
                if (!this.lfI) break;
                this.a(this.lfp);
                break;
            }
            case 1: {
                if (!this.lfJ) break;
                this.a(this.lfq);
            }
        }
    }

    private void a(int n, Map<Integer, dfb> map) {
        dfb dfb2 = this.b(n, map);
        this.a(dfb2);
    }

    private void a(dfb dfb2) {
        if (dfb2 != null && dfb2.isInitialized()) {
            dfb2.blv();
        }
    }

    private dfb b(int n, Map<Integer, dfb> map) {
        les les2 = lea.enW();
        while (n != -1) {
            dfb dfb2 = map.get(n);
            if (dfb2 != null) {
                return dfb2;
            }
            n = les2.uW(n);
        }
        return null;
    }

    private void a(int n, String string, String string2, String string3) {
        if (n <= -1) {
            return;
        }
        this.a(n, string, this.lfl, this.lft, "drop");
        this.a(n, string2, this.lfm, this.lfu, "grab");
        this.a(n, string3, this.lfn, this.lfv, "equip");
    }

    private void a(int n, String string, Map<Integer, dfb> map, dfb dfb2, String string2) {
        dfb dfb3;
        dfb dfb4 = dfb3 = string != null ? hso.cxK().cxP().s(string, false) : dfb2;
        if (dfb3 != null) {
            map.put(n, dfb3);
        }
    }

    private void a(List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
        if (!bl.booleanValue()) {
            boolean bl2 = false;
            if (list2 != null) {
                for (ign ign2 : list2) {
                    if (ign2.isCompleted() || !ign2.cTZ() && !ign2.cUb()) continue;
                    bl2 = true;
                    break;
                }
            }
            if (bl2 && this.lfK) {
                this.a(this.lfw);
            }
            if (list3 != null && list3.size() > 0) {
                if (list3.size() > 1) {
                    this.a(this.lfy);
                } else {
                    this.a(this.lfx);
                }
            }
        }
    }

    static /* synthetic */ void a(hvk hvk2, List list, List list2, List list3, Boolean bl) {
        hvk2.a(list, list2, list3, bl);
    }
}

