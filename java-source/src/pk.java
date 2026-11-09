/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;

public class pk {
    boolean aHe;
    boolean aHf;
    boolean aHg;
    boolean aHh;
    final int SN;
    mz aHi;
    private List<fzb> aHc;

    public pk(int n) {
        this.SN = n;
    }

    public final fzb cQ(int n) {
        if (this.aHc == null) {
            return null;
        }
        Iterator<fzb> iterator = this.aHc.iterator();
        while (iterator.hasNext()) {
            fzb fzb2 = iterator.next();
            if (fzb2.bEz() != n) continue;
            iterator.remove();
            return fzb2;
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[').append("CharacterID=").append(this.SN).append(",Flags=").append(this.aHe ? "LS " : "ls ").append(this.aHf ? "SA " : "sa ").append(this.aHg ? "LL " : "ll ").append(this.aHh ? "NC" : "nc");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void a(fzb fzb2) {
        if (this.aHc == null) {
            this.aHc = lcn.emA();
        }
        this.aHc.add(fzb2);
    }

    public final void a(mz mz2) {
        assert (this.aHi != null);
        this.aHi = mz2;
    }

    public final boolean sx() {
        return this.aHe;
    }

    public final boolean sy() {
        return this.aHf;
    }

    public final boolean sz() {
        return this.aHg;
    }

    public final boolean sA() {
        return this.aHh;
    }

    public final int qe() {
        return this.SN;
    }

    public final mz sB() {
        return this.aHi;
    }
}

