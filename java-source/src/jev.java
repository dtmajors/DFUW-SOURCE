/*
 * Decompiled with CFR.
 */
public enum jev {
    mWg("button_equipment_weapon_bows_daggers_normal", lxx.tAd),
    mWh("button_equipment_weapon_one_handed_shield_normal", lxx.tAf),
    mWi("button_equipment_weapon_staffs_normal", lxx.tAe),
    mWj("button_equipment_weapon_two_handed_normal", lxx.tAc);

    private String mqi;
    private lox mVX;

    private jev(String string2, lox lox2) {
        this.mqi = string2;
        this.mVX = lox2;
    }

    public String djt() {
        return this.mqi;
    }

    public lox dzX() {
        return this.mVX;
    }
}

