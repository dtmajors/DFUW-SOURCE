/*
 * Decompiled with CFR.
 */
public class cbt {
    public int ekd = 0;
    public boolean eke = false;

    public boolean equals(Object object) {
        if (object instanceof cbt) {
            cbt cbt2 = (cbt)object;
            return cbt2.ekd == this.ekd;
        }
        return false;
    }

    public String toString() {
        assert (this.ekd > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFGamelogicFunctionRule: GamelogicFunction='");
        stringBuilder.append(cbs.oK(this.ekd));
        stringBuilder.append("' ShowDebug=");
        stringBuilder.append(this.eke);
        return stringBuilder.toString();
    }
}

