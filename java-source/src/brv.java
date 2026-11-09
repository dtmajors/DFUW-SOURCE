/*
 * Decompiled with CFR.
 */
public class brv {
    public brm dIY = null;
    public int dJc = -1;

    public int atV() {
        return 1;
    }

    public boolean validate() {
        if (this.dIY == null) {
            lfn.b(5, "SFItemWrapper", "validate() ItemBase is null.");
            return false;
        }
        if (this.dIY instanceof bqs) {
            return ((bqs)this.dIY).validate();
        }
        lfn.b(5, "SFItemWrapper", "validate() Invalid item found: " + this.dIY.getClass().getName());
        return false;
    }
}

