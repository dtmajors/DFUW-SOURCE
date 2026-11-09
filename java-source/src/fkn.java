/*
 * Decompiled with CFR.
 */
public class fkn
extends fkm {
    public ej[] DR;
    public int ResourceType;
    public int asi;
    public long dBq;

    @Override
    public void a(fkm fkm2) {
        super.a(fkm2);
        if (fkm2 instanceof fkn) {
            this.DR = ((fkn)fkm2).DR;
            this.asi = ((fkn)fkm2).asi;
            this.ResourceType = ((fkn)fkm2).ResourceType;
            this.dBq = ((fkn)fkm2).dBq;
        }
    }

    fkn() {
        super(11794);
    }
}

