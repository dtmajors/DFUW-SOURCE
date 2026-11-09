/*
 * Decompiled with CFR.
 */
public class agy
extends ahz {
    private int bip = 0;
    private int biq = 0;
    private ljq Position = null;
    private lgl Rotation = null;
    private double bir = 0.0;
    private ljq bis = null;
    private float bit = 0.0f;
    private float biu = 0.0f;
    private float biv = 0.0f;
    private ldv[] biw = null;
    private float bix = 0.0f;
    private float biy = 1.0f;

    public agy() {
        super(12);
        this.bls = ahu.c.bmv;
    }

    public int Be() {
        return this.bip;
    }

    public void fe(int n) {
        this.bip = n;
    }

    public void ff(int n) {
        this.biq = n;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public void v(double d2) {
        this.bir = d2;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
    }

    public void ab(float f) {
        this.bit = f;
    }

    public void setPower(float f) {
        this.biu = f;
    }

    public void ac(float f) {
        this.biv = f;
    }

    public void c(ldv[] ldvArray) {
        this.biw = ldvArray;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "MissileInfoType";
            }
            case 2: {
                return "Position";
            }
            case 3: {
                return "Rotation";
            }
            case 4: {
                return "GlobalStartTime";
            }
            case 5: {
                return "StartDirection";
            }
            case 6: {
                return "MaxDistanceTravel";
            }
            case 7: {
                return "Power";
            }
            case 8: {
                return "StartVelocity";
            }
            case 9: {
                return "IgnoreGUIDs";
            }
            case 10: {
                return "FakeOffsetLength";
            }
            case 11: {
                return "MassMultiplier";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        lfn.b(5, "SFMissileObjectStateObject", "handleUpdateMessage() A missile should never be updated.");
        assert (false);
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.biq;
                return uh2;
            }
            case 2: {
                uq uq2 = new uq();
                uq2.Uo = n;
                uq2.Qi = this.Position;
                return uq2;
            }
            case 3: {
                um um2 = new um();
                um2.Uo = n;
                um2.aXj = this.Rotation;
                return um2;
            }
            case 4: {
                ud ud2 = new ud();
                ud2.Uo = n;
                ud2.Pq = this.bir;
                return ud2;
            }
            case 5: {
                uq uq3 = new uq();
                uq3.Uo = n;
                uq3.Qi = this.bis;
                return uq3;
            }
            case 6: {
                ue ue2 = new ue();
                ue2.Uo = n;
                ue2.Pz = this.bit;
                return ue2;
            }
            case 7: {
                ue ue3 = new ue();
                ue3.Uo = n;
                ue3.Pz = this.biu;
                return ue3;
            }
            case 8: {
                ue ue4 = new ue();
                ue4.Uo = n;
                ue4.Pz = this.biv;
                return ue4;
            }
            case 9: {
                uf uf2 = new uf();
                uf2.Uo = n;
                uf2.aWm = this.biw;
                return uf2;
            }
            case 10: {
                ue ue5 = new ue();
                ue5.Uo = n;
                ue5.Pz = this.bix;
                return ue5;
            }
            case 11: {
                ue ue6 = new ue();
                ue6.Uo = n;
                ue6.Pz = this.biy;
                return ue6;
            }
        }
        return super.G(n, n2);
    }

    public float Bf() {
        return this.bix;
    }

    public void ad(float f) {
        this.bix = f;
    }

    public float Bg() {
        return this.biy;
    }

    public void ae(float f) {
        this.biy = f;
    }
}

