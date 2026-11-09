/*
 * Decompiled with CFR.
 */
public enum ieb {
    lLW,
    lLX,
    lLY,
    lLZ;


    public ieb cPe() {
        switch (this) {
            case lLW: {
                return lLX;
            }
            case lLX: {
                return lLW;
            }
            case lLY: {
                return lLZ;
            }
            case lLZ: {
                return lLY;
            }
        }
        return this;
    }

    public int cPf() {
        switch (this) {
            case lLW: 
            case lLY: {
                return 1;
            }
            case lLX: 
            case lLZ: {
                return 2;
            }
        }
        return 0;
    }

    public boolean a(ieb ieb2) {
        return ieb2 == this || ieb2 == this.cPe();
    }

    public static ieb getValueByOrdinal(int n) {
        return n < 0 || n >= ieb.values().length ? null : ieb.values()[n];
    }
}

