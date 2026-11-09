/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class ajk
extends ajm {
    private int aYG = 0;
    private int bnL = 0;
    private float Magnitude = 0.0f;

    public ajk() {
        this.bog = ajb.b.boL;
    }

    public int CD() {
        return this.aYG;
    }

    public void fJ(int n) {
        this.aYG = n;
    }

    public int BS() {
        return this.bnL;
    }

    public void fB(int n) {
        this.bnL = n;
    }

    public float uO() {
        return this.Magnitude;
    }

    public void N(float f2) {
        this.Magnitude = f2;
    }

    @Override
    public boolean equals(Object object) {
        assert (this.boj != null);
        if (object instanceof ajk) {
            ajk ajk2 = (ajk)object;
            if (super.equals(object) && this.aYG == ajk2.CD() && this.Magnitude == ajk2.uO()) {
                return true;
            }
        }
        return false;
    }

    public String CE() {
        return lea.enT().getName(this.aYG);
    }

    @Override
    public void a(bfn bfn2) {
        this.bok = null;
        if (bfn2 == null) {
            return;
        }
        if (this.aXP != bfn2.Type) {
            return;
        }
        if (bfn2 instanceof bfl) {
            bfl bfl2 = (bfl)bfn2;
            if (this.aYG == bfl2.aYG) {
                this.bpO = this.ak(bfl2.Magnitude);
                if (this.bpO) {
                    this.bok = mcs.uAu.bD(this.boj.Bu());
                }
            }
        }
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajk ajk2 = (ajk)aja2;
        ajk2.fJ(this.aYG);
        ajk2.fB(this.bnL);
        ajk2.N(this.Magnitude);
    }

    private boolean ak(float f2) {
        switch (this.bnL) {
            case 1: {
                return f2 >= this.Magnitude;
            }
            case 2: {
                return f2 > this.Magnitude;
            }
            case 3: {
                return f2 <= this.Magnitude;
            }
            case 4: {
                return f2 < this.Magnitude;
            }
        }
        return false;
    }
}

