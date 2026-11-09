/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class hem {
    public final String Name;
    public final ljq Position;
    public final int Cost;
    public final int ResourceType;
    public final boolean kep;

    public hem(ffl ffl2, int n) {
        this.Name = ffl2.iLb[n];
        this.Position = ffl2.iLc[n];
        this.Cost = ffl2.iLd[n];
        this.kep = ffl2.iLa.equals(this.Name);
        this.ResourceType = cug.fnV;
    }

    public String toString() {
        return "Name " + this.Name + " Position " + this.Position + " Position " + this.Position + " RT " + this.ResourceType + " Cost " + this.Cost;
    }
}

