/*
 * Decompiled with CFR.
 */
public enum jet {
    mVT("button_equipment_armor_heavy_normal", lxx.tzY),
    mVU("button_equipment_armor_light_normal", lxx.tzZ),
    mVV("button_equipment_robe_heavy_normal", lxx.tAb),
    mVW("button_equipment_robe_light_normal", lxx.tAa);

    private String mqi;
    private lox mVX;

    private jet(String string2, lox lox2) {
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

