/*
 * Decompiled with CFR.
 */
import java.util.List;

public class cgp
extends cgo {
    private boolean eyI = true;
    private List<ldv> eyJ = lcn.abH(100);

    public cgp(int n, boolean bl, float f, float f2, boolean bl2) {
        super(n, bl, f, f2);
        this.eyI = bl2;
    }

    public boolean kJ(ldv ldv2) {
        if (this.eyI) {
            if (this.eyJ.size() >= 100) {
                this.eyJ.clear();
            }
            if (this.eyJ.contains(ldv2)) {
                return false;
            }
            this.eyJ.add(ldv2);
        }
        return true;
    }
}

