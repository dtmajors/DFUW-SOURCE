/*
 * Decompiled with CFR.
 */
public class ahb
extends age {
    private int biB = 0;
    private int biC = 0;
    private boolean biD = false;
    private ljq biE = null;
    private lgl biF = null;

    public ahb() {
        super(9);
        this.bls = ahu.c.bmx;
    }

    public void fg(int n) {
        this.biB = n;
    }

    public void fh(int n) {
        this.biC = n;
    }

    public void aO(boolean bl) {
        this.biD = bl;
    }

    public void setDeltaPos(ljq ljq2) {
        this.biE = ljq2;
    }

    public void setDeltaRot(lgl lgl2) {
        this.biF = lgl2;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 4: {
                return "CreateRequestType";
            }
            case 5: {
                return "ModifyRequestType";
            }
            case 6: {
                return "Collider";
            }
            case 7: {
                return "DeltaPos";
            }
            case 8: {
                return "DeltaRot";
            }
        }
        return super.eB(n);
    }

    @Override
    public final void a(gym gym2, int n) {
        if (gym2.bEz() != 12047) {
            return;
        }
        gyv gyv2 = (gyv)gym2;
        boolean bl = false;
        if ((gyv2.ija & 1) > 0) {
            if (gyv2.biC == 0) {
                return;
            }
            this.biC = gyv2.biC;
            this.L(5, n);
            bl = true;
        }
        if ((gyv2.ija & 2) > 0) {
            if (gyv2.biE == null) {
                return;
            }
            if (!this.biE.equals(gyv2.biE)) {
                this.biE = gyv2.biE;
                this.L(7, n);
                bl = true;
            }
        }
        if ((gyv2.ija & 4) > 0) {
            if (gyv2.biF == null) {
                return;
            }
            if (!this.biF.equals(gyv2.biF)) {
                this.biF = gyv2.biF;
                this.L(8, n);
                this.L(5, n);
                bl = true;
            }
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 4: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.biB;
                return uh2;
            }
            case 5: {
                uh uh3 = new uh();
                uh3.Uo = n;
                uh3.PC = this.biC;
                return uh3;
            }
            case 6: {
                tz tz2 = new tz();
                tz2.Uo = n;
                tz2.Pp = this.biD;
                return tz2;
            }
            case 7: {
                uq uq2 = new uq();
                uq2.Uo = n;
                uq2.Qi = this.biE;
                return uq2;
            }
            case 8: {
                um um2 = new um();
                um2.Uo = n;
                um2.aXj = this.biF;
                return um2;
            }
        }
        return super.G(n, n2);
    }
}

