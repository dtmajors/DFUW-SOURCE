/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="RecipeEnchantment")
public class ctw
extends ctx {
    public transient int Ps = 0;
    public String EnchantmentName = null;

    public ald fH() {
        return lea.eog().get(this.Ps);
    }

    public String fJ() {
        return lea.eog().get((Object)Integer.valueOf((int)this.Ps)).Name;
    }

    @Override
    public void validate() {
        super.validate();
        if (this.Ps <= 0) {
            throw new bg("EnchantmentType is invalid.");
        }
    }
}

