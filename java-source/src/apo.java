/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 *  cug
 */
public class apo
extends aqu {
    public apo(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 3.3;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        if (!this.bFP.IZ().LK()) {
            return false;
        }
        this.bFP.Kk();
        this.bFP.Ii();
        if (this.PK()) {
            this.bFP.Kr();
        }
        this.Qt();
        this.PL();
        this.bFP.Ij();
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.bFP.a(true, ani.c.bFM);
        this.bFP.Kn();
        this.Qs();
    }

    @Override
    public String name() {
        if (this.bFP.az() == cug.fhy) {
            return "SCUMLING QUEEN MAGIC BLAST";
        }
        return "HIVEKIN QUEEN MAGIC BLAST";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

