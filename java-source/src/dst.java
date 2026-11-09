/*
 * Decompiled with CFR.
 */
public class dst {
    private static final boolean bC = false;
    public ldv Xe = null;
    public gqg gYI = null;
    public ldv Ts = null;
    public ldv Yc = null;
    public ldv afK = null;
    public ldv Ui = null;
    public ldv gYJ = null;
    public ldv dAu = null;
    public int eFu = 0;
    public boolean gYK = false;
    public boolean gYL = false;
    public boolean gYM = false;
    public boolean gYN = false;
    public boolean gYO = false;
    public boolean gYP = false;
    public boolean gYQ = false;
    public boolean gYR = false;
    public int gYS = 0;

    public boolean byO() {
        if (!this.gYK) {
            return false;
        }
        if (!this.gYL) {
            return false;
        }
        if (!this.gYM) {
            return false;
        }
        if (!this.gYN) {
            return false;
        }
        if (!this.gYO) {
            return false;
        }
        if (this.gYS < this.eFu) {
            return false;
        }
        if (!this.gYP) {
            return false;
        }
        if (!this.gYQ) {
            return false;
        }
        return this.gYR;
    }

    public void reset() {
        this.gYK = false;
        this.gYL = false;
        this.gYM = false;
        this.gYN = false;
        this.gYO = false;
        this.gYP = false;
        this.gYQ = false;
        this.gYR = false;
        this.gYS = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFCharacterObjectInfo: CreatureObjectGUID=");
        stringBuilder.append(this.afK);
        stringBuilder.append(" MeshObjectGUID=");
        stringBuilder.append(this.Ui);
        stringBuilder.append(" NotifyObjectGUID=");
        stringBuilder.append(this.Xe);
        return stringBuilder.toString();
    }
}

