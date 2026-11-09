/*
 * Decompiled with CFR.
 */
public class cbg
implements Comparable<cbg> {
    public int aYa = 0;
    private boolean aYb = false;
    private int aYc = -1;
    private ldv cAw = null;
    private ldv hC = null;
    private ldv eiE = null;
    private double eiF = -1.0;
    private int Qw = 0;
    private String YU = null;
    private String YV = null;
    private int YY = 0;
    private int YZ = 0;
    public ldv eiG = null;
    public int RB = 0;
    public alu[] aXY = null;
    public boolean aXX = false;
    public boolean RoundRobinExcluded = false;

    public ldv abB() {
        return this.cAw;
    }

    public void gx(ldv ldv2) {
        this.cAw = ldv2;
    }

    public double aHn() {
        return this.eiF;
    }

    public void bk(double d2) {
        this.eiF = d2;
    }

    public int getAlignment() {
        return this.Qw;
    }

    public void setAlignment(int n) {
        this.Qw = n;
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

    public ldv aP() {
        return this.hC;
    }

    public void g(ldv ldv2) {
        this.hC = ldv2;
    }

    public ldv aHo() {
        return this.eiE;
    }

    public void kh(ldv ldv2) {
        this.eiE = ldv2;
    }

    public int Bi() {
        return this.aYa;
    }

    public void fi(int n) {
        this.aYa = n;
    }

    public boolean aHp() {
        return this.aYb;
    }

    public void aP(boolean bl) {
        this.aYb = bl;
    }

    public int aHq() {
        return this.aYc;
    }

    public void fj(int n) {
        this.aYc = n;
    }

    public String toString() {
        return "MemberID : " + this.aYa + " MemberGUID : " + this.cAw + " Leader : " + this.aYb;
    }

    public int a(cbg cbg2) {
        if (!(cbg2 instanceof cbg)) {
            return -1;
        }
        if (this.aYb) {
            return -1;
        }
        if (cbg2.aYb) {
            return 1;
        }
        if (this.aYa == cbg2.aYa) {
            return 0;
        }
        return this.aYa > cbg2.aYa ? 1 : -1;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((cbg)object);
    }
}

