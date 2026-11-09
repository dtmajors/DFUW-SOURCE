/*
 * Decompiled with CFR.
 */
import java.util.List;

public class lhs
extends lie {
    private List<lhr> rnQ = lcn.emv();

    public lhs(double d2) {
        super(d2, true);
    }

    public lhs() {
        this(0.1);
    }

    public void a(lhr lhr2) {
        this.rnQ.add(lhr2);
    }

    @Override
    public void dh(double d2) {
        if (!this.rnQ.isEmpty()) {
            lhr lhr2 = this.rnQ.remove(0);
            lhr2.ddx();
        } else {
            this.stop();
        }
    }

    public boolean isEmpty() {
        return this.rnQ.isEmpty();
    }
}

