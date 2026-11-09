/*
 * Decompiled with CFR.
 */
public class crt
extends crs {
    public String[] eYN = null;
    public int[] eYO = null;
    public int[] eYP = null;

    @Override
    public void b(kwf kwf2) {
        this.eYN = kwf2.eYN;
        this.eYO = kwf2.eYO;
        this.eYP = kwf2.eYP;
    }

    @Override
    public Object clone() {
        crt crt2 = (crt)super.clone();
        return crt2;
    }
}

