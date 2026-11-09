/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public enum hxz {
    llR(0, "ACTION_CONFIRM_SUCCESS", "audio/user_interface_new/action_confirm_success.xml"),
    llS(1, "ADD_GOLD", "audio/user_interface_new/add_gold.xml"),
    llT(2, "GENERAL_ERROR_FAIL", "audio/user_interface_new/general_error_fail.xml"),
    llU(3, "GUI_MODE_SWITCH", "audio/user_interface_new/gui_mode_switch.xml"),
    llV(4, "GUI_PAGE_TAB_SWITCH", "audio/user_interface_new/gui_page_tab_switch.xml"),
    llW(5, "ITEM_ADD_TO_INVENTORY", "audio/user_interface_new/item_add_to_inventory.xml"),
    llX(6, "ITEM_DESTROY", "audio/user_interface_new/item_destroy.xml"),
    llY(7, "ITEM_DROP", "audio/user_interface_new/item_drop.xml"),
    llZ(8, "ITEM_GRAB", "audio/user_interface_new/item_grab.xml"),
    lma(9, "NOTIFY_CLAN_PARTY", "audio/user_interface_new/notify_clan_party.xml"),
    lmb(10, "NOTIFY_OTHER_EVENT", "audio/user_interface_new/notify_other_event.xml"),
    lmc(11, "NOTIFY_SYSTEM", "audio/user_interface_new/notify_system.xml"),
    lmd(12, "NOTIFY_WHISPER", "audio/user_interface_new/notify_whisper.xml"),
    lme(13, "SKILL_INCREASE", "audio/user_interface_new/skill_increase.xml"),
    lmf(14, "SKILL_SCHOOL_DROP", "audio/user_interface_new/skill_school_drop.xml"),
    lmg(15, "SKILL_SCHOOL_GRAB", "audio/user_interface_new/skill_school_grab.xml"),
    lmh(16, "GUIDE_CHANGES_OBJECTIVE", "audio/user_interface_new/guide_changes_objective.xml"),
    lmi(17, "FEAT_COMPLETED", "audio/user_interface_new/feat_completed.xml"),
    lmj(18, "LEVELUP_BUTTON", "audio/user_interface_new/skill_school_drop.xml"),
    lmk(19, "SELENTINE_SHOP_BUY", "audio/user_interface_new/selentine_shop_buy.xml");

    public final int cck;
    public final String Name;
    public final String FileName;
    public static final List<hxz> lml;
    public static final Map<Integer, hxz> lmm;

    public static hxz getValueFromId(int n) {
        return lmm.get(n);
    }

    private hxz(int n2, String string2, String string3) {
        this.cck = n2;
        this.Name = string2;
        this.FileName = string3;
    }

    static {
        lml = Collections.unmodifiableList(Arrays.asList(hxz.class.getEnumConstants()));
        lmm = lcn.emw();
        for (hxz hxz2 : lml) {
            lmm.put(hxz2.cck, hxz2);
        }
    }
}

