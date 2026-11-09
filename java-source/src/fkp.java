/*
 * Decompiled with CFR.
 */
public class fkp
extends fkm {
    private int iOz = 0;

    @Override
    public void a(fkm fkm2) {
        super.a(fkm2);
        if (fkm2 instanceof fkp) {
            this.iOz = ((fkp)fkm2).iOz;
        }
    }

    public void a(boa boa2) {
        this.iOz = boa2 == null ? boa.dwZ.ordinal() : boa2.ordinal();
    }

    public boa bQd() {
        if (this.iOz >= 0 && this.iOz < boa.values().length) {
            return boa.values()[this.iOz];
        }
        return boa.dwZ;
    }

    fkp() {
        super(11793);
    }
}

