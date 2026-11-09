/*
 * Decompiled with CFR.
 */
public class aii
extends ahh {
    private int bnm = 0;

    public aii() {
        super(4);
        this.bls = ahu.c.bmN;
    }

    public void fx(int n) {
        this.bnm = n;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "NPCType";
            }
        }
        return super.eB(n);
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.bnm;
                return uh2;
            }
        }
        return super.G(n, n2);
    }
}

