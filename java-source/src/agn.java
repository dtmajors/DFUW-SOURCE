/*
 * Decompiled with CFR.
 */
public class agn
extends ahz {
    private int bie = 0;
    private float bif = 1.0f;
    private int dj = 0;

    public agn() {
        super(4);
        this.bls = ahu.c.bmq;
    }

    public void fa(int n) {
        this.bie = n;
    }

    public void Y(float f) {
        this.bif = f;
    }

    public void fb(int n) {
        this.dj = n;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "InteractionBitmask";
            }
            case 2: {
                return "BuyAdjustmentValue";
            }
            case 3: {
                return "ServerNodeID";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        if (gym2.bEz() != 12039) {
            return;
        }
        gyi gyi2 = (gyi)gym2;
        boolean bl = false;
        if ((gyi2.ija & 1) > 0 && this.bie != gyi2.bie) {
            this.bie = gyi2.bie;
            this.L(1, n);
            bl = true;
        }
        if ((gyi2.ija & 2) > 0 && this.bif != gyi2.bif) {
            this.bif = gyi2.bif;
            this.L(2, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.bie;
                return uh2;
            }
            case 2: {
                ue ue2 = new ue();
                ue2.Uo = n;
                ue2.Pz = this.bif;
                return ue2;
            }
            case 3: {
                uh uh3 = new uh();
                uh3.Uo = n;
                uh3.PC = this.dj;
                return uh3;
            }
        }
        return super.G(n, n2);
    }
}

