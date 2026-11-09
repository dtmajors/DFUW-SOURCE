/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class liw
extends ljk {
    private static final DecimalFormatSymbols roF = new DecimalFormatSymbols();
    private static final DecimalFormat sM = new DecimalFormat("+#0.00", roF);
    public final float bWP;

    public liw(String string, float f) {
        super(string);
        assert (string != null);
        this.bWP = f;
    }

    @Override
    public String esy() {
        return super.esy() + " " + sM.format(this.bWP);
    }

    public final boolean a(liw liw2) {
        return super.a(liw2) && ldq.ai(this.bWP, liw2.bWP);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof liw) {
            return this.a((liw)object);
        }
        return super.equals(object);
    }

    public final int b(liw liw2) {
        int n = super.h(liw2);
        if (n == 0) {
            n = (int)Math.signum(this.bWP - liw2.bWP);
        }
        return n;
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof liw) {
            return this.b((liw)lip2);
        }
        return this.esy().compareTo(lip2.esy());
    }
}

