/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class gzu
extends gzs {
    public static final int jvH = 1;
    public static final int jvI = 2;
    public static final int OBJECT_REMOVED = 3;
    public int jvJ = 0;
    public int bnM = 0;
    public ldv dtj = null;

    gzu() {
        super(8197);
    }

    @Override
    public String toString() {
        String string = null;
        switch (this.jvJ) {
            case 1: {
                string = "Attribute Not Found";
                break;
            }
            case 2: {
                string = "Attribute Removed";
                break;
            }
            case 3: {
                string = "Object Removed";
                break;
            }
            default: {
                string = "Unknown StatusType: " + this.jvJ;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" Attribute='");
        stringBuilder.append(ep.aM((int)this.bnM));
        stringBuilder.append("' Status='");
        stringBuilder.append(string);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

