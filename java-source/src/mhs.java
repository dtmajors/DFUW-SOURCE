/*
 * Decompiled with CFR.
 */
@llc
public enum mhs {
    UNDEFINED,
    NULL,
    BOOLEAN,
    INTEGER,
    LONG,
    FLOAT,
    DOUBLE,
    STRING,
    XML;

    public static final mhs[] VALUES;
    public static final mhs[] EmptyArray;

    public static mhs getTypeByName(String string) {
        if (string == null) {
            return null;
        }
        for (mhs mhs2 : VALUES) {
            if (!mhs2.name().equalsIgnoreCase(string)) continue;
            return mhs2;
        }
        return null;
    }

    static {
        VALUES = mhs.values();
        EmptyArray = new mhs[0];
    }
}

