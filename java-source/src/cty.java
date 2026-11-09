/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="RecipeTransmutation")
public class cty
extends ctx {
    public transient int dhr = 0;
    public String TargetResourceName = null;

    public String pa() {
        return lea.enW().getName(this.dhr);
    }

    @Override
    public void validate() {
        super.validate();
        if (this.dhr <= 0) {
            throw new bg("TargetResourceType is invalid.");
        }
    }
}

