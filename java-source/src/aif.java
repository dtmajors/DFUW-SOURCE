/*
 * Decompiled with CFR.
 */
public class aif
extends ahz {
    private String FirstName = null;
    private String LastName = null;
    private String add = null;
    private String bnj = null;
    private String bnk = null;

    public aif() {
        super(6);
        this.bls = ahu.c.bmM;
    }

    public void P(String string) {
        this.FirstName = string;
    }

    public void Q(String string) {
        this.LastName = string;
    }

    public void cD(String string) {
        this.add = string;
    }

    public void cE(String string) {
        this.bnj = string;
    }

    public void cF(String string) {
        this.bnk = string;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "FirstName";
            }
            case 2: {
                return "LastName";
            }
            case 3: {
                return "ClanName";
            }
            case 4: {
                return "ClanTitle";
            }
            case 5: {
                return "SpecialTitle";
            }
        }
        return super.eB(n);
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.FirstName;
                return uo2;
            }
            case 2: {
                uo uo3 = new uo();
                uo3.Uo = n;
                uo3.Value = this.LastName;
                return uo3;
            }
            case 3: {
                uo uo4 = new uo();
                uo4.Uo = n;
                uo4.Value = this.add;
                return uo4;
            }
            case 4: {
                uo uo5 = new uo();
                uo5.Uo = n;
                uo5.Value = this.bnj;
                return uo5;
            }
            case 5: {
                uo uo6 = new uo();
                uo6.Uo = n;
                uo6.Value = this.bnk;
                return uo6;
            }
        }
        return super.G(n, n2);
    }

    @Override
    public final void a(gym gym2, int n) {
        if (gym2.bEz() != 12049) {
            return;
        }
        gyy gyy2 = (gyy)gym2;
        boolean bl = false;
        if ((gyy2.ija & 1) > 0) {
            this.FirstName = gyy2.FirstName;
            this.L(1, n);
            bl = true;
        }
        if ((gyy2.ija & 2) > 0) {
            this.LastName = gyy2.LastName;
            this.L(2, n);
            bl = true;
        }
        if ((gyy2.ija & 4) > 0) {
            this.add = gyy2.add;
            this.L(3, n);
            bl = true;
        }
        if ((gyy2.ija & 8) > 0) {
            this.bnj = gyy2.bnj;
            this.L(4, n);
            bl = true;
        }
        if ((gyy2.ija & 0x10) > 0) {
            this.bnk = gyy2.bnk;
            this.L(5, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        }
    }
}

