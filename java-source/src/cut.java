/*
 * Decompiled with CFR.
 */
public class cut {
    public final int fyi;
    public final int fyj;

    public cut(int n, int n2) {
        this.fyi = n;
        this.fyj = n2;
    }

    public boolean equals(Object object) {
        if (object instanceof cut) {
            cut cut2 = (cut)object;
            if (this.fyj == cut2.fyj && this.fyi == cut2.fyi) {
                return true;
            }
        }
        return false;
    }

    public final String pa() {
        return lea.enW().getName(this.fyj);
    }

    public final String Bu() {
        return lea.enZ().getName(this.fyi);
    }

    public int bcb() {
        return this.fyj;
    }

    public int bcc() {
        return this.fyi;
    }

    public int hashCode() {
        return this.fyj;
    }

    public String toString() {
        assert (this.fyj > 0);
        assert (this.fyi > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WorkStationResource='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' CraftingSkill=");
        stringBuilder.append(this.Bu());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

