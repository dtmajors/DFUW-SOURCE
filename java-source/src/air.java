/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class air
extends aja {
    private int bnK = 0;
    private int bnL = 0;

    public air() {
        this.bog = ajb.b.bow;
    }

    public void fA(int n) {
        this.bnK = n;
    }

    public int BS() {
        return this.bnL;
    }

    public void fB(int n) {
        this.bnL = n;
    }

    public String BT() {
        return ajb.fI(this.bnL);
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        int n = this.boj.aJz().bgQ().fi().ap(1296);
        boolean bl = false;
        switch (this.bnL) {
            case 1: {
                boolean bl2 = bl = n >= this.bnK;
                if (bl) break;
                this.bok = mcs.uBR.bD(new Object[0]);
                break;
            }
            case 2: {
                boolean bl3 = bl = n > this.bnK;
                if (bl) break;
                this.bok = mcs.uBR.bD(new Object[0]);
                break;
            }
            case 3: {
                boolean bl4 = bl = n <= this.bnK;
                if (bl) break;
                this.bok = mcs.uBQ.bD(new Object[0]);
                break;
            }
            case 4: {
                boolean bl5 = bl = n < this.bnK;
                if (bl) break;
                this.bok = mcs.uBQ.bD(new Object[0]);
                break;
            }
            default: {
                return false;
            }
        }
        return bl;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        air air2 = (air)aja2;
        air2.fA(this.bnK);
        air2.fB(this.bnL);
    }
}

