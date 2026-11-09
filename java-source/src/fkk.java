/*
 * Decompiled with CFR.
 */
public class fkk
extends fki {
    public ldv dxt;
    private int iOz = 0;
    public int gMr;
    public String[] gMs;
    public dph[] iOF;
    public dpj[] iOG;

    public void a(boa boa2) {
        this.iOz = boa2 == null ? boa.dwZ.ordinal() : boa2.ordinal();
    }

    public boa bQd() {
        if (this.iOz >= 0 && this.iOz < boa.values().length) {
            return boa.values()[this.iOz];
        }
        return boa.dwZ;
    }

    fkk() {
        super(11797);
    }
}

