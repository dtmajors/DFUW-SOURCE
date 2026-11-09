/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;

public class lir
extends liz {
    private static final DecimalFormat rgA = new DecimalFormat("0 Building Modules", lio.rkH);

    public lir(int n) {
        super(n);
    }

    @Override
    public String esy() {
        return rgA.format(this.PC);
    }
}

