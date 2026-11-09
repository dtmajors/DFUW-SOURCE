/*
 * Decompiled with CFR.
 */
public class fhw
extends fhc {
    private int ew = cli.eII.ordinal();
    private int Amount = 0;

    public cli bPF() {
        return cli.getValueByOrdinal(this.ew);
    }

    public void a(cli cli2) {
        this.ew = cli2 == null ? this.ew : cli2.ordinal();
    }

    public int bPG() {
        return this.Amount;
    }

    public void GM(int n) {
        this.Amount = n;
    }

    fhw() {
        super(23824);
    }
}

