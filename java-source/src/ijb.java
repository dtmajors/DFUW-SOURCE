/*
 * Decompiled with CFR.
 */
public abstract class ijb
extends ipx {
    public ijb() {
        super(irl.dnr());
        this.rg(false);
    }

    public iik dax() {
        return this.djE() instanceof iik ? (iik)this.djE() : null;
    }

    public abstract int day();

    public abstract void Rd(int var1);

    public int daz() {
        return this.day();
    }

    public void Re(int n) {
        this.Rd(n);
    }

    public abstract int daA();

    public abstract void Rf(int var1);

    public int dar() {
        return this.daA();
    }

    public void Rc(int n) {
        this.Rf(n);
    }

    public abstract ijg daB();

    public abstract void a(ijg var1);

    public abstract ijg daC();

    public abstract void b(ijg var1);

    public abstract ijf daD();

    public abstract void a(ijf var1);

    public abstract float daE();

    public abstract void kI(float var1);

    public void a(ijb ijb2) {
        this.a(ijb2.daD());
        if (ijb2 instanceof ijc) {
            this.Rd(ijb2.daz());
            this.Rf(ijb2.dar());
        } else if (this instanceof ijc) {
            this.Re(ijb2.day());
            this.Rc(ijb2.daA());
        } else {
            this.Rd(ijb2.day());
            this.Rf(ijb2.daA());
        }
        this.a(ijb2.daB());
        this.b(ijb2.daC());
    }

    @Override
    public void cPk() {
        this.daG();
        super.cPk();
    }

    public void cZZ() {
        this.pack();
    }

    public void daa() {
        this.hz(this.daE());
    }

    public int daF() {
        return 0;
    }

    protected void daG() {
        switch (this.daB()) {
            case mcP: {
                this.RH(Math.max(0, Math.min(this.day(), this.djJ().getWidth() - this.getWidth())));
                break;
            }
            case mcQ: {
                this.RH(-this.daF());
                break;
            }
            case mcR: {
                this.RH(this.djJ().getWidth() / 2 - this.getWidth() / 2);
                break;
            }
            case mcS: {
                this.RH(this.djJ().getWidth() - this.getWidth() + this.daF());
            }
        }
        switch (this.daC()) {
            case mcP: {
                this.RI(Math.max(0, Math.min(this.daA(), this.djJ().getHeight() - this.getHeight())));
                break;
            }
            case mcQ: {
                this.RI(-this.daF());
                break;
            }
            case mcR: {
                this.RI(this.djJ().getHeight() / 2 - this.getHeight() / 2);
                break;
            }
            case mcS: {
                this.RI(this.djJ().getHeight() - this.getHeight() + this.daF());
            }
        }
    }
}

