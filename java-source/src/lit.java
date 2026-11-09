/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
import java.text.DecimalFormat;

public class lit
extends lix {
    private static final DecimalFormat rgA = new DecimalFormat("##0.0", lio.rkH);

    public lit(float f) {
        super(f);
    }

    @Override
    public String esy() {
        lfb lfb2;
        double d2 = (double)this.Pz / 1.0;
        if (d2 >= 1000.0) {
            d2 /= 1000.0;
            lfb2 = lcy.raF;
        } else {
            lfb2 = lcy.raE;
        }
        String string = rgA.format(d2);
        lip lip2 = lfb2.a(new ljg(string));
        return lip2.esy();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lis) {
            return this.i((lis)object);
        }
        return super.equals(object);
    }
}

