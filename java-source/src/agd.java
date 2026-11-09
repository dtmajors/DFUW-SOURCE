/*
 * Decompiled with CFR.
 */
public class agd
extends afx {
    private String bhD = null;
    private String bhE = null;
    private ljq bhF = null;
    private float bhG = 0.0f;
    private ayb bhH = ayb.cvi;

    public agd() {
        super(8);
        this.bls = ahu.c.bml;
    }

    public void cz(String string) {
        this.bhD = string;
    }

    public void cA(String string) {
        this.bhE = string;
    }

    public void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    public void X(float f) {
        this.bhG = f;
    }

    public void a(ayb ayb2) {
        this.bhH = ayb2 == null ? this.bhH : ayb2;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "CityID";
            }
            case 4: {
                return "CityClanOwnerName";
            }
            case 5: {
                return "CityPosition";
            }
            case 6: {
                return "CityRadius";
            }
            case 7: {
                return "CityType";
            }
        }
        return super.eB(n);
    }

    @Override
    public final void a(gym gym2, int n) {
        if (gym2.bEz() != 12036) {
            super.a(gym2, n);
            return;
        }
        gyd gyd2 = (gyd)gym2;
        boolean bl = false;
        if ((gyd2.ija & 1) > 0) {
            this.bhD = gyd2.bhD;
            this.L(3, n);
            bl = true;
        }
        if ((gyd2.ija & 2) > 0) {
            this.bhE = gyd2.bhE;
            this.L(4, n);
            bl = true;
        }
        if ((gyd2.ija & 4) > 0) {
            this.bhH = ayb.getValueByOrdinal(gyd2.ctp);
            this.L(7, n);
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
        stringBuilder.append(this.bhD);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.bhD;
                return uo2;
            }
            case 4: {
                uo uo3 = new uo();
                uo3.Uo = n;
                uo3.Value = this.bhE;
                return uo3;
            }
            case 5: {
                uq uq2 = new uq();
                uq2.Uo = n;
                uq2.Qi = new ljq(this.bhF);
                return uq2;
            }
            case 6: {
                ue ue2 = new ue();
                ue2.Uo = n;
                ue2.Pz = this.bhG;
                return ue2;
            }
            case 7: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.bhH.ordinal();
                return uh2;
            }
        }
        return super.G(n, n2);
    }
}

