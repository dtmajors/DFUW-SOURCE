/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="EnchantmentBaneful")
public class alf
extends ald {
    public float Magnitude = 0.0f;
    public transient int[] bqd = null;
    public String[] ResourceNames = null;

    @Override
    public final float DD() {
        return this.Magnitude;
    }

    @Override
    public void validate() {
        super.validate();
        if (this.Magnitude <= 0.0f || this.Magnitude > 150.0f) {
            throw new bg("Magnitude is invalid.");
        }
        if (this.bqd == null) {
            throw new bg("ResourceTypes array is null.");
        }
        int n = this.bqd.length;
        for (int i = 0; i < n; ++i) {
            if (this.bqd[i] > 0) continue;
            throw new bg("ResourceType " + i + " is invalid.");
        }
    }
}

