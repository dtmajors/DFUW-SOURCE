/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public class kxs
extends kxt {
    public int aYG = 0;

    @Override
    public boolean aaR(int n) {
        if (!ep.aE((int)n)) {
            return false;
        }
        return lea.enT().isDescendant(n, this.aYG);
    }

    public String CE() {
        return lea.enT().getName(this.aYG);
    }

    @Override
    public String getPropertyName() {
        return this.CE();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRuleForEffect: EffectType='");
        stringBuilder.append(this.CE());
        stringBuilder.append("' ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}

