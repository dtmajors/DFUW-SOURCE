/*
 * Decompiled with CFR.
 */
public class crr
extends crs {
    public String[] eYK = null;
    public int[] eYL = null;
    public int[] eYM = null;

    @Override
    public void b(kwf kwf2) {
        this.eYK = kwf2.eYK;
        this.eYL = kwf2.eYL;
        this.eYM = kwf2.eYM;
    }

    @Override
    public Object clone() {
        crr crr2 = (crr)super.clone();
        return crr2;
    }
}

