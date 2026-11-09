/*
 * Decompiled with CFR.
 */
public class gyl
extends gym {
    public static final int juC = 1;
    public static final int juD = 2;
    public static final int juE = 4;
    public ljq Position = null;
    public lgl Rotation = null;
    public int ResourceType = 0;
    public lgj dTY = null;

    gyl() {
        super(12041);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(" UpdateType=");
        stringBuilder.append(this.ija);
        return stringBuilder.toString();
    }
}

