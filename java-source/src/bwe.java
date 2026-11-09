/*
 * Decompiled with CFR.
 */
import java.util.List;

public class bwe {
    private boolean dUF = false;
    private List<dxq> ahc = lcn.abH(2);

    public final void y(dxq dxq2) {
        if (this.dUF) {
            assert (false);
            return;
        }
        this.ahc.add(dxq2);
    }

    public final List<dxq> aBc() {
        this.dUF = true;
        return this.ahc;
    }
}

