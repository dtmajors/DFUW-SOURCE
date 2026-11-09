/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public final class aqi
extends aqu {
    private final int bKV = 3;
    private ljq aet;
    public boolean bKW;
    private boolean QP;
    private int aRC;
    private boolean bKX;

    public aqi(anf anf2, aqu.b b2) {
        this.bFP = anf2;
        this.bLs = b2;
        this.bLp = 5.0;
        this.bLq = true;
    }

    @Override
    public boolean execute() {
        this.Ql();
        if (!this.bKX) {
            return true;
        }
        this.bKX = false;
        if (this.QP) {
            return false;
        }
        if (this.aRC >= 3) {
            this.bKW = true;
            return false;
        }
        if (!this.bFP.ao(this.Pw())) {
            ++this.aRC;
        }
        return true;
    }

    private ljq Pw() {
        if (this.bFP.IZ().LC() == null) {
            return null;
        }
        if (this.bFP.KG() == anf.c.bEs) {
            this.aet = this.bFP.IZ().LC().esF();
            float f = (float)(Math.PI * 2 * arw.Sw());
            float f2 = 1.0f + arw.Sx();
            this.aet.x = (float)((double)this.aet.x + (double)f2 * Math.cos(f));
            this.aet.y += 1.0f;
            this.aet.rlV = (float)((double)this.aet.rlV + (double)f2 * Math.sin(f));
        } else if (this.bFP.KG() == anf.c.bEt) {
            this.aet = this.bFP.av().esF();
            float f = (float)(Math.PI * 2 * arw.Sw());
            float f3 = 5.0f + 5.0f * arw.Sx();
            this.aet.x = (float)((double)this.aet.x + (double)f3 * Math.cos(f));
            this.aet.y += 1.0f;
            this.aet.rlV = (float)((double)this.aet.rlV + (double)f3 * Math.sin(f));
        }
        return this.aet;
    }

    @Override
    public boolean c(ljq ljq2, boolean bl) {
        this.bKX = true;
        if (!this.aet.equals(ljq2)) {
            return false;
        }
        if (bl) {
            this.bFP.a("Shade teleport on target", ljq2, del.gjQ, false);
            asp.a(del.gjR, ljq2, this.bFP.getGUID(), this.bFP.getMessageDelegator());
            this.QP = true;
        } else {
            ++this.aRC;
        }
        return true;
    }

    @Override
    public ljq Pp() {
        return null;
    }

    @Override
    public void initialize() {
        this.QP = false;
        this.bKX = false;
        this.aRC = 0;
        if (!this.bFP.ao(this.Pw())) {
            ++this.aRC;
        }
    }

    @Override
    public String name() {
        return "SHADE TELEPORT";
    }

    @Override
    public boolean Pr() {
        return true;
    }
}

