/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class gqu
extends grb {
    public static final float jpP = 0.0f;
    public float jpQ = 0.0f;
    public dxq iXB = null;
    private Set<ldv> jpR = null;

    gqu() {
        super(11055);
    }

    public void qu(ldv ldv2) {
        assert (ldv2 != null);
        if (this.jpR == null) {
            this.jpR = lcn.emx();
        } else assert (!this.jpR.contains(ldv2));
        this.jpR.add(ldv2);
    }

    public boolean qv(ldv ldv2) {
        assert (ldv2 != null);
        if (this.jpR == null) {
            return false;
        }
        return this.jpR.contains(ldv2);
    }
}

