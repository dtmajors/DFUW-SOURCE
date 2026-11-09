/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class apa
extends aqu {
    boolean bKy;
    boolean bKz;
    a bKA;

    public apa(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 3.0;
    }

    @Override
    public boolean execute() {
        if (this.bKA == a.bKE) {
            if (!this.bKy) {
                this.bKy = true;
                this.bFP.bCL.ON();
            }
            return true;
        }
        this.Qt();
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        if (!this.bKy && this.bKz) {
            this.bKy = true;
            this.bFP.Ij();
        }
        return this.Ql();
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bKy = false;
        this.bKz = false;
        int n = this.bFP.KN();
        switch (n) {
            case 1: {
                this.bKA = a.bKC;
                if (!this.bFP.IB()) break;
                this.bFP.Kp();
                this.bFP.a(true, null);
                this.bKz = true;
                break;
            }
            case 2: {
                this.bKA = a.bKD;
                if (!this.bFP.Iw()) break;
                this.bFP.Kn();
                this.bFP.a(true, ani.c.bFK);
                this.bKz = true;
                break;
            }
            case 3: {
                this.bKA = a.bKE;
                break;
            }
            default: {
                this.bKA = a.bKB;
                if (!this.bFP.Iz()) break;
                this.bFP.Ko();
                this.bFP.a(true, null);
                this.bKz = true;
            }
        }
        this.Qs();
    }

    @Override
    public String name() {
        return "EXEC SKILL";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

