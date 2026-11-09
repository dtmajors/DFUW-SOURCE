/*
 * Decompiled with CFR.
 */
public class myx {
    private String Name;
    private String EUM;
    private ljq Position;
    private boolean EUN;
    private int EUO;

    public final String getName() {
        return this.Name;
    }

    public final void setName(String string) {
        this.Name = string;
    }

    public final ljq av() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public String toString() {
        return "Tile= " + this.Name + ", Pos = " + this.Position;
    }

    public boolean eTk() {
        return this.EUN;
    }

    public void As(boolean bl) {
        this.EUN = bl;
    }

    public int eTl() {
        return this.EUO;
    }

    public void afU(int n2) {
        this.EUO = n2;
    }

    public String eTm() {
        return this.EUM;
    }

    public void Ef(String string) {
        this.EUM = string;
    }
}

