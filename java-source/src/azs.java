/*
 * Decompiled with CFR.
 */
public enum azs {
    cHj,
    cHk,
    cHl,
    cHm,
    cHn;


    public boolean cB(boolean bl) {
        switch (this) {
            case cHj: 
            case cHl: {
                return false;
            }
            case cHk: 
            case cHm: {
                return !bl;
            }
        }
        return true;
    }

    public boolean cC(boolean bl) {
        switch (this) {
            case cHj: 
            case cHl: {
                return bl;
            }
        }
        return true;
    }

    public boolean aex() {
        switch (this) {
            case cHj: 
            case cHl: {
                return true;
            }
        }
        return bad.ahf();
    }

    public boolean aey() {
        switch (this) {
            case cHl: 
            case cHm: {
                return true;
            }
        }
        return false;
    }

    public static azs getLossConditionByName(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        for (azs azs2 : azs.values()) {
            if (azs2.name().compareToIgnoreCase(string) != 0) continue;
            return azs2;
        }
        return null;
    }
}

