/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="EnchantmentCreatureAlteration")
public class alg
extends ald {
    public transient int bnM = 0;
    public transient int aYG = 0;
    public float Magnitude = 0.0f;
    public String AttributeName = null;
    public String EffectName = null;

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    public String CE() {
        return lea.enT().getName(this.aYG);
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
        if (this.aYG <= 0) {
            throw new bg("EffectType is invalid.");
        }
        if (this.Magnitude <= 0.0f || this.Magnitude > 150.0f) {
            throw new bg("Magnitude is invalid.");
        }
    }
}

