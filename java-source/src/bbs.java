/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
@llc
public enum bbs {
    NoRank(lpu.rUe),
    Recruit(lpu.rUf),
    Private(lpu.rUg),
    Corporal(lpu.rUh),
    Sergeant(lpu.rUi),
    Lieutenant(lpu.rUj),
    Captain(lpu.rUk),
    Major(lpu.rUl),
    Colonel(lpu.rUm),
    General(lpu.rUn),
    SupremeGeneral(lpu.rUo);

    private lox DisplayName = null;

    public lox wp() {
        return this.DisplayName;
    }

    public String cu() {
        return this.DisplayName == null ? null : this.DisplayName.getIdentifier();
    }

    private bbs(lox lox2) {
        this.DisplayName = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.DisplayName.bD(new Object[0]).exA() : super.toString();
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n < bbs.values().length;
    }

    public static bbs getValueByOrdinal(int n) {
        return bbs.isValidOrdinal(n) ? bbs.values()[n] : null;
    }

    public static bbs getValueByName(String string) {
        String string2 = string.replace(" ", "");
        for (bbs bbs2 : bbs.values()) {
            if (string2.compareToIgnoreCase(bbs2.name()) != 0) continue;
            return bbs2;
        }
        return Recruit;
    }

    public static bbs getRankForKills(int n) {
        if (n < 10) {
            return Recruit;
        }
        if (n < 20) {
            return Private;
        }
        if (n < 50) {
            return Corporal;
        }
        if (n < 100) {
            return Sergeant;
        }
        if (n < 225) {
            return Lieutenant;
        }
        if (n < 500) {
            return Captain;
        }
        if (n < 1000) {
            return Major;
        }
        if (n < 2500) {
            return Colonel;
        }
        if (n < 5000) {
            return General;
        }
        return SupremeGeneral;
    }

    public String akv() {
        switch (this) {
            case Recruit: {
                return "recruit.png";
            }
            case Private: {
                return "private.png";
            }
            case Corporal: {
                return "corporal.png";
            }
            case Sergeant: {
                return "sergeant.png";
            }
            case Lieutenant: {
                return "lieutenant.png";
            }
            case Captain: {
                return "captain.png";
            }
            case Major: {
                return "major.png";
            }
            case Colonel: {
                return "colonel.png";
            }
            case General: {
                return "general.png";
            }
            case SupremeGeneral: {
                return "sup_general.png";
            }
        }
        return "";
    }
}

