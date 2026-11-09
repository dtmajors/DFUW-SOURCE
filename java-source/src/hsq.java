/*
 * Decompiled with CFR.
 */
public class hsq {
    public final hsu lcM;
    public final String Name;
    public final mhs lcN;
    public final mhk lcO;

    private hsq(hsu hsu2, String string, mhs mhs2, mhk mhk2) {
        this.lcM = hsu2;
        this.Name = string;
        this.lcN = mhs2;
        this.lcO = mhk2;
    }

    public hsq(hsu hsu2, String string, mhs mhs2) {
        this(hsu2, string, mhs2, null);
    }

    public hsq(hsu hsu2, String string, Integer n) {
        this(hsu2, string, mhs.INTEGER, new mho(n));
    }

    public hsq(hsu hsu2, String string, String string2) {
        this(hsu2, string, mhs.STRING, new mhr(string2));
    }

    public hsq(hsu hsu2, String string, Boolean bl) {
        this(hsu2, string, mhs.BOOLEAN, new mhl(bl));
    }

    public hsq(hsu hsu2, String string, Float f2) {
        this(hsu2, string, mhs.FLOAT, new mhn(f2.floatValue()));
    }
}

