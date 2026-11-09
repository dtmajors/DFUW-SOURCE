/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;

public class ljd
extends lix {
    private static final DecimalFormat rgA = new DecimalFormat("0 gp", lio.rkH);

    public ljd() {
    }

    public ljd(float f) {
        super(f);
    }

    @Override
    public String esy() {
        return rgA.format(this.Pz);
    }
}

