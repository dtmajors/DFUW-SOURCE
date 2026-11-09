/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;

public class ljc
extends lix {
    private static final DecimalFormat rgA = new DecimalFormat("0.0", lio.rkH);

    protected ljc() {
    }

    public ljc(float f) {
        super(f);
    }

    @Override
    public String esy() {
        return rgA.format(this.Pz) + "x";
    }
}

