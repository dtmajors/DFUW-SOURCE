/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class ctd {
    public int bnM = 0;
    public int few = 0;
    public float Pt = 0.0f;

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + this.bnM;
        n2 = 31 * n2 + Float.floatToIntBits(this.Pt);
        n2 = 31 * n2 + this.few;
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ctd ctd2 = (ctd)object;
        if (this.bnM != ctd2.bnM) {
            return false;
        }
        if (Float.floatToIntBits(this.Pt) != Float.floatToIntBits(ctd2.Pt)) {
            return false;
        }
        return this.few == ctd2.few;
    }

    public ctx bbw() {
        if (this.bnM == 1616) {
            ctx ctx2 = lea.eof().get(this.few);
            if (ctx2 == null) {
                lfn.b(5, "SFEnchantmentAttributeInfo", "getRecipe() Could not find transmutation recipe with type=" + this.few);
                return null;
            }
            return ctx2;
        }
        ctx ctx3 = lea.eoe().get(this.few);
        if (ctx3 == null) {
            lfn.b(5, "SFEnchantmentAttributeInfo", "getRecipe() Could not find enchantment recipe with type=" + this.few);
            return null;
        }
        return ctx3;
    }
}

