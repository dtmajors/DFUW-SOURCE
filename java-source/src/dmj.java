/*
 * Decompiled with CFR.
 */
public enum dmj {
    gIf,
    gIg,
    gIh,
    gIi,
    gIj;


    public boolean bqb() {
        switch (this) {
            case gIg: 
            case gIh: {
                return true;
            }
        }
        return false;
    }

    public static dmj getValueByOrdinal(int n) {
        return n < 0 || n >= dmj.values().length ? gIf : dmj.values()[n];
    }
}

