/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public enum ccf {
    eln(mac.rXy),
    elo(mac.uas),
    elp(mac.uat),
    elq(mac.uau),
    elr(mac.uav),
    els(mac.uaw),
    elt(mac.uax),
    elu(mac.uay),
    elv(mac.uaz),
    elw(mac.uaA),
    elx(mac.uaB),
    ely(mac.uaC),
    elz(mac.uaD),
    elA(mac.uaE),
    elB(mac.uaF),
    elC(mac.uaG),
    elD(mac.uaH),
    elE(mac.uaI);

    private lox Pn = null;

    public String cu() {
        return this.Pn == null ? null : this.Pn.getIdentifier();
    }

    private ccf(lox lox2) {
        this.Pn = lox2;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.Pn.bD(new Object[0]).exA() : super.toString();
    }

    public static ccf getValueByOrdinal(int n) {
        return n < 0 || n >= ccf.values().length ? eln : ccf.values()[n];
    }
}

