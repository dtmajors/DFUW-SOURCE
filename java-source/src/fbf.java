/*
 * Decompiled with CFR.
 */
public class fbf
extends fbd {
    public bfn iIb = null;
    public ldv Tr = null;
    public ldv aDk = null;
    public ldv ade = null;
    public ldv cRI = null;
    public ljq Position = null;
    public int Qw = 0;
    public boolean iju = false;
    public int Nationality = 0;

    fbf() {
        super(12548);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEventOccuredMessage: ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" Event=");
        stringBuilder.append(this.iIb);
        return stringBuilder.toString();
    }
}

