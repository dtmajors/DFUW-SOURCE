/*
 * Decompiled with CFR.
 */
public class ejs
extends ejm {
    private int ist = -1;
    private int ilu = aya.cvc.ordinal();

    public int bHD() {
        return this.ist;
    }

    public void El(int n) {
        this.ist = n;
    }

    public aya bHE() {
        return aya.getValueByOrdinal(this.ilu);
    }

    public void a(aya aya2) {
        this.ilu = aya2 == null ? this.ilu : aya2.ordinal();
    }

    ejs() {
        super(18729);
    }
}

