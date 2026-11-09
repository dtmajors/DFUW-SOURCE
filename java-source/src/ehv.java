/*
 * Decompiled with CFR.
 */
public class ehv
extends ehb {
    public static final int iqK = 0;
    public static final int iqL = 1;
    public static final int iqM = 2;
    public static final int iqN = 3;
    public static final int iqO = 4;
    public static final int iqP = 5;
    public static final int iqQ = 6;
    public int ex;
    public aug[] ipC;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" From " + this.aO());
        stringBuilder.append(" To " + this.amk());
        stringBuilder.append(" RT " + this.ex);
        if (this.ipC == null) {
            stringBuilder.append(" Ignores null");
        } else {
            stringBuilder.append(" Ignores ");
            for (int i2 = 0; i2 < this.ipC.length; ++i2) {
                if (i2 > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append("[");
                stringBuilder.append(this.ipC[i2]);
                stringBuilder.append("]");
            }
        }
        return stringBuilder.toString();
    }

    ehv() {
        super(2326);
    }
}

