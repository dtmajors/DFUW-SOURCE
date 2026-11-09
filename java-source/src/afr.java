/*
 * Decompiled with CFR.
 */
public class afr
extends age {
    private int bhh = 0;
    private String tt = null;
    private ljq bhi = null;
    private ljq bhj = null;
    private boolean bhk = false;

    public afr() {
        super(9);
        this.bls = ahu.c.bmf;
    }

    public void eA(int n) {
        this.bhh = n;
    }

    public void setFrameName(String string) {
        this.tt = string;
    }

    public void aj(ljq ljq2) {
        this.bhi = ljq2;
    }

    public void ak(ljq ljq2) {
        this.bhj = ljq2;
    }

    public void aE(boolean bl) {
        this.bhk = bl;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 4: {
                return "SubsetID";
            }
            case 5: {
                return "FrameName";
            }
            case 6: {
                return "InitialTranslation";
            }
            case 7: {
                return "InitialRotation";
            }
            case 8: {
                return "AllowCollision";
            }
        }
        return super.eB(n);
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 4: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.bhh;
                return uh2;
            }
            case 5: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.tt;
                return uo2;
            }
            case 6: {
                uq uq2 = new uq();
                uq2.Uo = n;
                uq2.Qi = this.bhi;
                return uq2;
            }
            case 7: {
                uq uq3 = new uq();
                uq3.Uo = n;
                uq3.Qi = this.bhj;
                return uq3;
            }
            case 8: {
                tz tz2 = new tz();
                tz2.Uo = n;
                tz2.Pp = this.bhk;
                return tz2;
            }
        }
        return super.G(n, n2);
    }
}

