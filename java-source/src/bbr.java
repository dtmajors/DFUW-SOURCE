/*
 * Decompiled with CFR.
 */
public class bbr {
    private ldv cAw = null;
    private String YU = null;
    private String YV = null;
    private int YY = 0;
    private int YZ = 0;
    private boolean cAz = false;
    private long aFZ = -1L;
    private int RB = -1;
    private boolean SE = false;
    private int aEf = 0;
    private int aFH = 0;
    private bcb cAy = null;
    private bbs cRF = bbs.Recruit;
    private int aEP = 0;
    private int cRG = 0;
    private long cRH = -1L;
    private boolean aYb = false;
    private ldv cRI = null;
    private int cRJ = 0;

    public ldv abB() {
        return this.cAw;
    }

    public void gx(ldv ldv2) {
        this.cAw = ldv2;
    }

    public int js() {
        return this.YY;
    }

    public void jX(int n) {
        this.YY = n;
    }

    public int jt() {
        return this.YZ;
    }

    public void jY(int n) {
        this.YZ = n;
    }

    public String iP() {
        return this.YU;
    }

    public void aM(String string) {
        this.YU = string;
    }

    public String iR() {
        return this.YV;
    }

    public void aN(String string) {
        this.YV = string;
    }

    public String akp() {
        return cg.c(this.YU, this.YV);
    }

    public boolean qf() {
        return this.cAz;
    }

    public void ac(boolean bl) {
        this.cAz = bl;
    }

    public int jr() {
        return this.RB;
    }

    public void bU(int n) {
        this.RB = n;
    }

    public long akq() {
        return this.aFZ;
    }

    public void z(long l) {
        this.aFZ = l;
    }

    public boolean kv() {
        return this.SE;
    }

    public void cO(boolean bl) {
        this.SE = bl;
    }

    public int akj() {
        return this.aEf;
    }

    public void jW(int n) {
        this.aEf = n;
    }

    public int abF() {
        return this.aFH;
    }

    public void jZ(int n) {
        this.aFH = n;
    }

    public bbs abP() {
        return this.cRF;
    }

    public void b(bbs bbs2) {
        this.cRF = bbs2;
    }

    public int abD() {
        return this.aEP;
    }

    public void ka(int n) {
        this.aEP = n;
    }

    public int akr() {
        return this.cRG;
    }

    public void kb(int n) {
        this.cRG = n;
    }

    public long aks() {
        return this.cRH;
    }

    public void A(long l) {
        this.cRH = l;
    }

    public boolean abI() {
        return this.cRH >= 0L;
    }

    public boolean abJ() {
        return this.aYb;
    }

    public void cP(boolean bl) {
        this.aYb = bl;
    }

    public int akt() {
        return this.cRJ;
    }

    public void kc(int n) {
        this.cRJ = n;
    }

    public bbr() {
        this.cAy = new bcb();
    }

    public bbr(emp emp2) {
        this();
        this.cAw = emp2.Ri;
        this.YY = emp2.YY;
        this.YZ = emp2.YZ;
        this.YU = emp2.YU;
        this.YV = emp2.YV;
        this.aFZ = emp2.aFZ;
        this.SE = emp2.SE;
        this.aEf = emp2.aEf;
        this.aFH = emp2.aFH;
        this.cAz = false;
    }

    public bbr(eeg eeg2) {
        this();
        this.cAw = eeg2.aO();
        this.YY = eeg2.js();
        this.YZ = eeg2.jt();
        this.YU = eeg2.iP();
        this.YV = eeg2.iR();
        this.SE = eeg2.kv();
        this.aEf = eeg2.bGc();
        this.aFH = eeg2.abF();
        this.cAz = eeg2.qf();
        this.RB = this.cAz ? eeg2.jr() : -1;
    }

    public bcb abG() {
        return this.cAy;
    }

    public boolean b(bca bca2) {
        return this.abI() ? false : this.cAy.d(bca2);
    }

    public boolean b(bcb bcb2) {
        return this.abI() ? false : this.cAy.containsAll(bcb2);
    }

    public boolean c(bca bca2) {
        if (bca2 == null) {
            return false;
        }
        if (this.abI()) {
            return false;
        }
        if (bca2.a(bbz.cTe)) {
            for (bca bca3 : this.cAy) {
                if (!bca3.akN()) continue;
                return true;
            }
            return false;
        }
        bca bca4 = bca.getManagementPermission(bca2);
        if (bca4 == null) {
            return false;
        }
        return this.cAy.d(bca4);
    }

    public aye aku() {
        return this.cAy.aku();
    }
}

