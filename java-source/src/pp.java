/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class pp {
    private Set<ldv> aHJ = lcn.emx();

    public boolean ca(ldv ldv2) {
        return this.aHJ.contains(ldv2);
    }

    public boolean cf(ldv ldv2) {
        if (this.ca(ldv2)) {
            return false;
        }
        this.aHJ.add(ldv2);
        return true;
    }

    public boolean cg(ldv ldv2) {
        return this.aHJ.remove(ldv2);
    }
}

