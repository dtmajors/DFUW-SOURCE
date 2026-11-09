/*
 * Decompiled with CFR.
 */
public class iuj
extends ipz {
    private int mzB;
    private int mzC;
    private int mzD;
    private int mzE;
    private lgs mzF = new lgs();
    private iuo mzG;
    private int mzH = 0;
    private int mzI = 0;

    public iuj() {
        this.a(ipn.msf);
        this.rG(false);
        this.sa(true);
    }

    public void eO(int n, int n2) {
        this.mzH = n;
        this.mzI = n2;
    }

    @Override
    public boolean du(int n, int n2) {
        return this.eS(n, n2);
    }

    @Override
    public boolean dN(int n, int n2) {
        return this.eU(n, n2);
    }

    @Override
    public boolean eC(int n, int n2) {
        return this.eS(n, n2);
    }

    @Override
    public boolean eD(int n, int n2) {
        return this.eU(n, n2);
    }

    @Override
    public boolean dM(int n, int n2) {
        return this.eT(n, n2);
    }

    public void o(lgs lgs2) {
    }

    private iul drK() {
        for (iph iph2 = this.djJ(); iph2 != null; iph2 = iph2.djJ()) {
            if (!(iph2 instanceof iul)) continue;
            return (iul)iph2;
        }
        return null;
    }

    private boolean eS(int n, int n2) {
        this.mzB = n + this.mzH;
        this.mzC = n2 + this.mzI;
        this.mzD = n + this.mzH;
        this.mzE = n2 + this.mzI;
        this.mzG = new iuo();
        this.W(this.mzG);
        this.drL();
        this.rS(true);
        return true;
    }

    private boolean eT(int n, int n2) {
        this.mzD = n + this.mzH;
        this.mzE = n2 + this.mzI;
        this.drL();
        return true;
    }

    private boolean eU(int n, int n2) {
        if (this.mzG == null) {
            return false;
        }
        this.rS(false);
        this.mzG.removeFromParent();
        this.mzG = null;
        return true;
    }

    private void drL() {
        int n = Math.min(this.mzB, this.mzD);
        int n2 = Math.min(this.mzC, this.mzE);
        int n3 = Math.max(this.mzB, this.mzD);
        int n4 = Math.max(this.mzC, this.mzE);
        this.mzF.cf = n;
        this.mzF.cg = n2;
        this.mzF.rmN = n3 - n + 1;
        this.mzF.H = n4 - n2 + 1;
        this.mzG.r(this.mzF.cf - this.mzH, this.mzF.cg - this.mzI, this.mzF.rmN, this.mzF.H);
        this.o(this.mzF);
    }
}

