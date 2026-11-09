/*
 * Decompiled with CFR.
 */
import java.util.List;

public class aey {
    private final String Name;
    private final afl bfM;
    private final afj bfN;
    private final afh bfO;
    private final afk bfP;
    private final int bfQ;
    private final List<aex> bfR = lcn.emv();
    private final List<aex> bfS = lcn.emv();
    private int bfT = 0;

    public aey(String string, afl afl2, afj afj2, afh afh2, afk afk2, int n, List<aex> list) {
        this.Name = string;
        this.bfP = afk2;
        this.bfQ = n;
        this.bfM = afl2;
        this.bfN = afj2;
        this.bfO = afh2;
        for (aex aex2 : list) {
            if (aex2.isEnabled()) {
                this.bfR.add(aex2);
                continue;
            }
            this.bfS.add(aex2);
        }
    }

    public final String getName() {
        return this.Name;
    }

    public final afk zp() {
        return this.bfP;
    }

    public final int zq() {
        return this.bfQ;
    }

    public final List<aex> zr() {
        return this.bfS;
    }

    public String zs() {
        if (this.bfR.isEmpty()) {
            return null;
        }
        int n = lew.fX(0, this.bfR.size() - 1);
        return this.bfR.get(n).getName();
    }

    public void zt() {
        ++this.bfT;
    }

    public afl zu() {
        return this.bfM;
    }

    public afj zv() {
        return this.bfN;
    }

    public afh zw() {
        return this.bfO;
    }

    public List<aex> zx() {
        return this.bfR;
    }

    public final int zy() {
        return this.bfT;
    }
}

