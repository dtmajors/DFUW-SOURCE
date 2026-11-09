/*
 * Decompiled with CFR.
 */
public class ipt
extends ipf {
    private int lSN;
    private int msC = 1;
    private boolean mrT = false;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(0, 0);
        }
    };

    public ipt() {
        this(0);
    }

    public ipt(int n) {
        this.a(mdv);
        this.lSN = n;
    }

    public ipt(int n, int n2) {
        this.a(mdv);
        this.lSN = n;
        this.msC = n2;
    }

    public ipt(int n, int n2, int n3) {
        this.a(new iqu(n2, n3));
        this.lSN = n;
        this.msC = 1;
    }

    public ipt(int n, int n2, int n3, int n4) {
        this.a(new iqu(n2, n3));
        this.lSN = n;
        this.msC = n4;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mrT = false;
    }

    public int Hr() {
        return this.lSN;
    }

    public void setColor(int n) {
        if (n == this.lSN) {
            return;
        }
        this.lSN = n;
        this.dmt();
    }

    public int getThickness() {
        return this.msC;
    }

    public void RV(int n) {
        if (n == this.msC) {
            return;
        }
        this.msC = n;
        this.dmt();
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.mrT) {
            this.mrT = false;
            this.djE().b("OutlineRect_setColor", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.lSN, this.msC});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mrT = false;
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("OutlineRect_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.lSN, this.msC});
    }

    @Override
    public void djn() {
        this.djE().b("OutlineRect_setGeometry", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.lSN, this.msC});
    }

    @Override
    public void djo() {
        this.djE().b("OutlineRect_setSize", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.lSN, this.msC});
    }

    private void dmt() {
        if (this.mrT) {
            return;
        }
        this.mrT = true;
        this.dkg();
    }
}

