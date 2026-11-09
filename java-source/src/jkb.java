/*
 * Decompiled with CFR.
 */
public enum jkb {
    nrX(-1),
    nrY(-1),
    nrZ(-1),
    nsa(2780846),
    nsb(8600787),
    nsc(8860320),
    nsd(-1),
    nse(2918969),
    nsf(8753197),
    nsg(14184217),
    nsh(-1),
    nsi(2780846),
    nsj(2780846),
    nsk(-1),
    nsl(-1),
    nsm(2918969),
    nsn(2918969),
    nso(-1),
    nsp(-1);

    private int nsq;

    private jkb(int n2) {
        this.nsq = n2;
    }

    public int dKX() {
        return this.nsq;
    }

    public boolean dKY() {
        return this.nsq >= 0;
    }
}

