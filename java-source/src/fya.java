/*
 * Decompiled with CFR.
 */
public class fya
extends fyb {
    private int iuk = 0;
    private int jaR = 0;
    private int jaS = -1;
    private cbl jaT = null;
    private cbn jaU = null;

    public int bIJ() {
        return this.iuk;
    }

    public int bSM() {
        return this.jaR;
    }

    public void ce(int n, int n2) {
        this.iuk = n;
        this.jaR = n2;
    }

    public int bSN() {
        return this.jaS;
    }

    public cbl bSO() {
        return this.jaT;
    }

    public void a(cbl cbl2) {
        this.jaT = cbl2;
        if (this.jaT != null) {
            this.jaS = this.jaT.ib();
        }
    }

    public cbn bSP() {
        return this.jaU;
    }

    public void a(cbn cbn2) {
        this.jaU = cbn2;
        if (this.jaU != null) {
            this.jaS = this.jaU.ib();
        }
    }

    fya() {
        super(28932);
    }
}

