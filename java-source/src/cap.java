/*
 * Decompiled with CFR.
 */
public class cap
extends can {
    private int bnm = 0;

    public cap(int n, int n2) {
        super(n);
        this.bnm = n2;
        assert (this.bnm > 0);
    }

    public int atS() {
        return this.bnm;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cap) {
            cap cap2 = (cap)object;
            if (super.equals(object) && this.bnm == cap2.atS()) {
                return true;
            }
        }
        return false;
    }

    public String Yq() {
        return bqm.md(this.bnm);
    }

    @Override
    public int hashCode() {
        return this.az() | this.bnm;
    }

    @Override
    public String toString() {
        return "SFPaperDollItemKey: Resource='" + this.pa() + "' NPC='" + this.Yq() + "'";
    }
}

