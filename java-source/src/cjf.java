/*
 * Decompiled with CFR.
 */
public class cjf
implements Cloneable {
    private cjo eDT;
    public int ayN;

    public cjf(cjo cjo2) {
        this.eDT = cjo2;
    }

    public final cjo aPY() {
        return this.eDT;
    }

    public cjf aPZ() {
        try {
            cjf cjf2 = (cjf)super.clone();
            cjf2.ayN = this.ayN;
            return cjf2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            assert (false);
            return null;
        }
    }

    public /* synthetic */ Object clone() {
        return this.aPZ();
    }
}

