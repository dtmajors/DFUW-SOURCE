/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public enum bdj {
    dak,
    dal,
    dam;


    public bqm.b alX() {
        switch (this) {
            case dal: {
                return bqm.b.dER;
            }
            case dam: {
                return bqm.b.dES;
            }
        }
        return bqm.b.dEp;
    }

    public int az() {
        switch (this) {
            case dal: {
                return cug.fpe;
            }
            case dam: {
                return cug.fpf;
            }
        }
        return cug.fpd;
    }

    public static bdj getValueByOrdinal(int n) {
        return n < 0 || n >= bdj.values().length ? dak : bdj.values()[n];
    }
}

