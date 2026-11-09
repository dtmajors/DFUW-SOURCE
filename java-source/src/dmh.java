/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum dmh {
    gHX(mfq.CMV, "texture/dds/gui/effectsnew/territory_bonus_prowess_gains.png"),
    gHY(mfq.CMX, "texture/dds/gui/effectsnew/territory_bonus_harvesting_loot.png"),
    gHZ(mfq.CMY, "texture/dds/gui/effectsnew/territory_bonus_monster_loot.png"),
    gIa(mfq.CMZ, "texture/dds/gui/effectsnew/territory_bonus_monster_gold.png");

    private lox DisplayName = null;
    private String gIb = null;

    public lox wp() {
        return this.DisplayName;
    }

    public String bpW() {
        return this.gIb;
    }

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    private dmh(lox lox2, String string2) {
        this.DisplayName = lox2;
        this.gIb = string2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public float a(dmj dmj2) {
        switch (dmj2) {
            case gIg: {
                switch (this) {
                    case gHX: {
                        return 0.1f;
                    }
                    case gHY: {
                        return 0.05f;
                    }
                    case gHZ: {
                        return 0.1f;
                    }
                    case gIa: {
                        return 0.2f;
                    }
                }
                break;
            }
            case gIh: {
                switch (this) {
                    case gHX: {
                        return 0.05f;
                    }
                    case gHY: {
                        return 0.03f;
                    }
                    case gHZ: {
                        return 0.05f;
                    }
                    case gIa: {
                        return 0.1f;
                    }
                }
                break;
            }
            case gIi: {
                switch (this) {
                    case gHX: {
                        return 0.03f;
                    }
                    case gHY: {
                        return 0.01f;
                    }
                    case gHZ: {
                        return 0.03f;
                    }
                    case gIa: {
                        return 0.05f;
                    }
                }
                break;
            }
            case gIj: {
                switch (this) {
                    case gHX: {
                        return 0.2f;
                    }
                    case gHY: {
                        return 0.1f;
                    }
                    case gHZ: {
                        return 0.2f;
                    }
                    case gIa: {
                        return 0.4f;
                    }
                }
            }
        }
        return 0.0f;
    }

    public float b(dmj dmj2) {
        return this.a(dmj2) * 100.0f;
    }

    public float bpX() {
        switch (this) {
            case gHX: {
                return Float.MAX_VALUE;
            }
            case gHY: {
                return Float.MAX_VALUE;
            }
            case gHZ: {
                return Float.MAX_VALUE;
            }
            case gIa: {
                return Float.MAX_VALUE;
            }
        }
        return 0.0f;
    }

    public boolean bpY() {
        switch (this) {
            case gHX: 
            case gHY: 
            case gHZ: 
            case gIa: {
                return true;
            }
        }
        return false;
    }
}

