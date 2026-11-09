/*
 * Decompiled with CFR.
 */
public class gqt
extends grb {
    private int jpM = -1;
    public ljq Position = null;
    public int bBh = 0;
    public boolean jpN = false;
    public boolean jpO = false;

    gqt() {
        super(11052);
    }

    public hx.a bWN() {
        if (!hx.a.isValidOrdinal(this.jpM)) {
            return null;
        }
        return hx.a.getValueByOrdinal(this.jpM);
    }

    public void a(hx.a a2) {
        this.jpM = a2.ordinal();
    }
}

