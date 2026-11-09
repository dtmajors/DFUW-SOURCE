/*
 * Decompiled with CFR.
 */
public class dsw {
    public a gZw = a.gZx;
    public int gqN = 0;
    public ldv GUID = null;
    public ldv hA = null;
    public ldv eSR = null;
    public boolean bhI = false;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEngineRelation: ");
        stringBuilder.append("State=");
        stringBuilder.append((Object)this.gZw);
        stringBuilder.append(" RelationType=");
        stringBuilder.append(this.gqN);
        stringBuilder.append(" GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" FromGUID=");
        stringBuilder.append(this.hA);
        stringBuilder.append(" ToGUID=");
        stringBuilder.append(this.eSR);
        return stringBuilder.toString();
    }
}

