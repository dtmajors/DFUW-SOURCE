/*
 * Decompiled with CFR.
 */
public enum bax {
    cPj,
    cPk,
    cPl,
    cPm,
    cPn,
    cPo;


    public boolean ajf() {
        switch (this) {
            case cPj: {
                return true;
            }
        }
        return false;
    }

    public boolean ajg() {
        switch (this) {
            case cPl: 
            case cPn: {
                return true;
            }
        }
        return false;
    }

    public boolean ajh() {
        switch (this) {
            case cPk: 
            case cPm: {
                return true;
            }
        }
        return false;
    }

    public boolean aji() {
        switch (this) {
            case cPj: 
            case cPn: 
            case cPm: {
                return false;
            }
        }
        return true;
    }

    public float ajj() {
        if (this.ajf()) {
            return 1.0f;
        }
        if (!this.aji()) {
            return 0.0f;
        }
        if (this == cPo) {
            return bad.agg();
        }
        return -1.0f;
    }

    public float ajk() {
        if (this.ajf()) {
            return 0.0f;
        }
        if (this.ajh() && this.aji()) {
            return 1.0f;
        }
        if (this == cPo) {
            return bad.agh();
        }
        return -1.0f;
    }

    public float ajl() {
        if (this.ajf()) {
            return 0.0f;
        }
        if (this.ajg() && this.aji()) {
            return 1.0f;
        }
        if (this == cPo) {
            return bad.agi();
        }
        return -1.0f;
    }

    public static bax getWagerDivisionByName(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        for (bax bax2 : bax.values()) {
            if (bax2.name().compareToIgnoreCase(string) != 0) continue;
            return bax2;
        }
        return null;
    }
}

