/*
 * Decompiled with CFR.
 */
public class fcy
extends fdo {
    public cte[] dtP = null;
    public boolean iyH = false;
    public int eEb = -1;
    public String eEa = null;
    public boolean iJG = false;
    public boolean iyI = false;
    public ldv iJE = null;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fcy() {
        super(9229);
    }
}

