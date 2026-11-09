/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="EnchantmentAddEffect")
public class ale
extends ald {
    public int SkillType = 0;
    public transient int aYG = 0;
    public float Magnitude = 0.0f;
    public String EffectName = null;
    public String SkillName = null;

    public String CE() {
        return lea.enT().getName(this.aYG);
    }

    @Override
    public final float DD() {
        return this.Magnitude;
    }

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    @Override
    public void validate() {
        super.validate();
        if (this.SkillType <= 0) {
            throw new bg("SkillType is invalid.");
        }
        if (this.aYG <= 0) {
            throw new bg("EffectType is invalid.");
        }
        if (this.Magnitude <= 0.0f || this.Magnitude > 10.0f) {
            throw new bg("Magnitude is invalid.");
        }
    }

    @Override
    protected boolean DE() {
        return false;
    }
}

