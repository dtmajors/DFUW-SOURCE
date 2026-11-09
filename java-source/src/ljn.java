/*
 * Decompiled with CFR.
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ljn
extends lix {
    private static final DecimalFormat rgA = new DecimalFormat("0.0 kg", lio.rkH);

    public ljn(float f) {
        super(f);
        rgA.setRoundingMode(RoundingMode.DOWN);
    }

    @Override
    public String esy() {
        return rgA.format(this.Pz);
    }
}

