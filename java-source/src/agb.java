/*
 * Decompiled with CFR.
 */
public class agb
extends ahz {
    private String ID = null;
    private String bhA = null;
    private ljq Position = null;
    private int aEC = 0;
    private int bhB = 0;
    private int bhC = 0;

    public agb() {
        super(7);
        this.bls = ahu.c.bmj;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public void cy(String string) {
        this.bhA = string;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public void setStatus(int n) {
        this.aEC = n;
    }

    public void eM(int n) {
        this.bhB = n;
    }

    public void eN(int n) {
        this.bhC = n;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "ID";
            }
            case 2: {
                return "OwnerClanName";
            }
            case 3: {
                return "Position";
            }
            case 4: {
                return "Status";
            }
            case 5: {
                return "CurrentBindNumber";
            }
            case 6: {
                return "MaxBinds";
            }
        }
        return super.eB(n);
    }

    @Override
    public final void a(gym gym2, int n) {
        if (gym2.bEz() != 12034) {
            return;
        }
        gyb gyb2 = (gyb)gym2;
        boolean bl = false;
        if ((gyb2.ija & 1) > 0) {
            this.ID = gyb2.ID;
            this.L(1, n);
            bl = true;
        }
        if ((gyb2.ija & 2) > 0) {
            this.bhA = gyb2.bhA;
            this.L(2, n);
            bl = true;
        }
        if ((gyb2.ija & 4) > 0) {
            this.aEC = gyb2.aEC;
            this.L(4, n);
            bl = true;
        }
        if ((gyb2.ija & 8) > 0) {
            this.bhB = gyb2.bhB;
            this.L(5, n);
            bl = true;
        }
        if ((gyb2.ija & 0x10) > 0) {
            this.bhC = gyb2.bhC;
            this.L(6, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" '");
        stringBuilder.append(this.ID);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.ID;
                return uo2;
            }
            case 2: {
                uo uo3 = new uo();
                uo3.Uo = n;
                uo3.Value = this.bhA;
                return uo3;
            }
            case 3: {
                uq uq2 = new uq();
                uq2.Uo = n;
                uq2.Qi = new ljq(this.Position);
                return uq2;
            }
            case 4: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.aEC;
                return uh2;
            }
            case 5: {
                uh uh3 = new uh();
                uh3.Uo = n;
                uh3.PC = this.bhB;
                return uh3;
            }
            case 6: {
                uh uh4 = new uh();
                uh4.Uo = n;
                uh4.PC = this.bhC;
                return uh4;
            }
        }
        return super.G(n, n2);
    }
}

