/*
 * Decompiled with CFR.
 */
public abstract class jaw
extends ipx {
    @Override
    public void cCy() {
        super.cCy();
        int n = this.djE().nh(this.getClass().getSimpleName() + "XPOS");
        int n2 = this.djE().nh(this.getClass().getSimpleName() + "YPOS");
        this.RH(n);
        this.RI(n2);
    }

    public void ff(int n, int n2) {
        this.ek(n, n2);
        this.djE().w(this.getClass().getSimpleName() + "XPOS", this.getX());
        this.djE().w(this.getClass().getSimpleName() + "YPOS", this.getY());
    }

    @Override
    public boolean du(int n, int n2) {
        super.du(n, n2);
        this.ez(n, n2);
        return true;
    }

    @Override
    public boolean dN(int n, int n2) {
        this.eA(n, n2);
        for (int i = this.bfn() - 1; i >= 0; --i) {
            ipf ipf2 = this.RO(i);
            if (!ipf2.djL() || !(ipf2 instanceof ipq)) continue;
            ipq ipq2 = (ipq)ipf2;
            int n3 = n - ipq2.getX();
            int n4 = n2 - ipq2.getY();
            ipq2.dN(n3, n4);
            if (ipq2.dF(n3, n4)) continue;
            ipq2.ri(false);
            ipq2.dL(n3, n4);
        }
        this.djE().w(this.getClass().getSimpleName() + "XPOS", this.getX());
        this.djE().w(this.getClass().getSimpleName() + "YPOS", this.getY());
        return true;
    }

    @Override
    public boolean dM(int n, int n2) {
        if (!this.Ow()) {
            return super.dM(n, n2);
        }
        this.eH(n, n2);
        return true;
    }

    @Override
    public void n(int n, int n2, int n3, int n4) {
        if (n < this.dhJ().getX()) {
            n = this.dhJ().getX();
        }
        if (n + this.getWidth() > this.dhJ().getWidth() + this.dhJ().getX()) {
            n = this.dhJ().getWidth() + this.dhJ().getX() - this.getWidth();
        }
        if (n2 < this.dhJ().getY()) {
            n2 = this.dhJ().getY();
        }
        if (n2 + this.getHeight() > this.dhJ().getY() + this.dhJ().getHeight()) {
            n2 = this.dhJ().getHeight() + this.dhJ().getY() - this.getHeight();
        }
        this.ek(n, n2);
    }
}

