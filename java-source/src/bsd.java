/*
 * Decompiled with CFR.
 */
import java.util.List;

public class bsd {
    private ldv aCK = null;
    private List<brs> dJi = lcn.abH(2);

    public bsd(brs brs2) {
        assert (brs2 != null);
        assert (brs2.awo() != null);
        assert (brs2.awo().getGUID() != null);
        this.aCK = brs2.awo().getGUID();
        this.m(brs2);
    }

    public ldv awM() {
        return this.aCK;
    }

    public List<brs> awN() {
        return this.dJi;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFTreePath: [");
        int n = this.dJi.size();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            brs brs2 = this.dJi.get(i);
            stringBuilder.append(brs2.awo().getGUID());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void m(brs brs2) {
        do {
            this.dJi.add(brs2);
        } while ((brs2 = brs2.awn()) != null);
    }
}

