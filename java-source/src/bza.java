/*
 * Decompiled with CFR.
 */
public class bza {
    private boolean edc = false;
    private boolean edd = false;
    private int bpZ = 0;

    public boolean aER() {
        return this.edc;
    }

    public void fk(boolean bl) {
        this.edc = bl;
    }

    public boolean aES() {
        return this.edd;
    }

    public void fl(boolean bl) {
        this.edd = bl;
    }

    public int CU() {
        return this.bpZ;
    }

    public void fO(int n) {
        this.bpZ = n;
    }

    public boolean equals(Object object) {
        bza bza2;
        return object instanceof bza && this.edc == (bza2 = (bza)object).aER() && this.edd == bza2.aES() && this.bpZ == bza2.CU();
    }

    public boolean g(byz byz2) {
        assert (this.bpZ > 0);
        if (this.edc) {
            if (this.edd) {
                return this.bpZ != byz2.eda;
            }
            return this.bpZ != byz2.ecZ;
        }
        if (this.edd) {
            return this.bpZ == byz2.eda;
        }
        return this.bpZ == byz2.ecZ;
    }

    public bza aET() {
        bza bza2 = new bza();
        bza2.fk(this.edc);
        bza2.fl(this.edd);
        bza2.fO(this.bpZ);
        return bza2;
    }
}

