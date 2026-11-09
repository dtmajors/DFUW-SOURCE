/*
 * Decompiled with CFR.
 */
import java.util.List;

public class btg {
    private List<bst> dKL;
    private boolean bTt;
    private boolean dKM;
    private String dKN;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof btg)) {
            return false;
        }
        btg btg2 = (btg)object;
        if (this.bTt != btg2.bTt) {
            return false;
        }
        if (this.dKM != btg2.dKM) {
            return false;
        }
        return !(this.dKN == null ? btg2.dKN != null : !this.dKN.equals(btg2.dKN));
    }

    public List<bst> axy() {
        return this.dKL;
    }

    public String axz() {
        return this.dKN;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.bTt ? 1231 : 1237);
        n2 = 31 * n2 + (this.dKM ? 1231 : 1237);
        n2 = 31 * n2 + (this.dKN == null ? 0 : this.dKN.hashCode());
        return n2;
    }

    public boolean axA() {
        return this.dKM;
    }

    public boolean isLoaded() {
        return this.bTt;
    }

    public void an(List<bst> list) {
        this.dKL = list;
    }

    public void ef(boolean bl2) {
        this.bTt = bl2;
    }

    public void eg(boolean bl2) {
        this.dKM = bl2;
    }

    public void gl(String string) {
        this.dKN = string;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFZoneInfo: ZoneName='");
        stringBuilder.append(this.dKN);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

