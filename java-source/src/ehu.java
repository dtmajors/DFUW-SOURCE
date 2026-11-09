/*
 * Decompiled with CFR.
 */
public class ehu
extends ehb {
    public static final int iqG = 0;
    public static final int iqH = 1;
    public static final int iqI = 2;
    public int ed;
    public aug iqJ;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" From " + this.aO());
        stringBuilder.append(" To " + this.amk());
        stringBuilder.append(" RT " + this.ed);
        if (this.iqJ == null) {
            stringBuilder.append(" Ignore null");
        } else {
            stringBuilder.append(" Ignore " + this.iqJ);
        }
        return stringBuilder.toString();
    }

    ehu() {
        super(2325);
    }
}

