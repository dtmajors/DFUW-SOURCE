/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="EnchantmentItemAlteration")
public class alh
extends ald {
    public transient int bnM = 0;
    public float Magnitude = 0.0f;
    public String AttributeName = null;

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    @Override
    public final float DD() {
        return this.Magnitude;
    }

    @Override
    public void validate() {
        super.validate();
        if (this.bnM <= 0) {
            throw new bg("AttributeType is invalid.");
        }
        if (this.Magnitude <= 0.0f || this.Magnitude > 150.0f) {
            throw new bg("Magnitude is invalid.");
        }
    }
}

