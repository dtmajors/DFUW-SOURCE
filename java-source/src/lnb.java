/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class lnb
extends lob {
    public lnb(a a2, List<lmv> list) {
        super(a2, list);
        assert (this.cd(list));
    }

    public final a evy() {
        return (a)this.evb();
    }

    @Override
    protected String adC(int n) {
        return "[" + n + "]";
    }

    @Override
    protected lmu adD(int n) {
        assert (lda.acc(n));
        return this.evy().rFo;
    }

    private boolean cd(List<lmv> list) {
        lmu lmu2 = this.evy().rFo;
        for (int i = 0; i < list.size(); ++i) {
            lmv lmv2 = list.get(i);
            if (lmv2 != null) assert (lmv2.c(lmu2));
        }
        return true;
    }
}

