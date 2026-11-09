/*
 * Decompiled with CFR.
 */
public class aib
extends ahh {
    private int dj = 0;

    public aib() {
        super(4);
        this.bls = ahu.c.bmJ;
    }

    public void fb(int n) {
        this.dj = n;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "ServerNodeID";
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
                uh2.PC = this.dj;
                return uh2;
            }
        }
        return super.G(n, n2);
    }
}

