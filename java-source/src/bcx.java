/*
 * Decompiled with CFR.
 */
public enum bcx {
    cYh,
    cYi,
    cYj,
    cYk,
    cYl,
    cYm,
    cYn,
    cYo,
    cYp;


    public boolean vA() {
        switch (this) {
            case cYi: 
            case cYl: 
            case cYm: 
            case cYn: 
            case cYo: 
            case cYp: {
                return true;
            }
        }
        return false;
    }

    public static bcx getValueByOrdinal(int n) {
        return n < 0 || n >= bcx.values().length ? cYh : bcx.values()[n];
    }
}

