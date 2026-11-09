/*
 * Decompiled with CFR.
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ljm
extends lix {
    private static final DecimalFormat rgA = new DecimalFormat("0.00", lio.rkH);

    public ljm(float f) {
        super(f);
        rgA.setRoundingMode(RoundingMode.DOWN);
    }

    @Override
    public String esy() {
        return rgA.format(this.Pz);
    }
}

