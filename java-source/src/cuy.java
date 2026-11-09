/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class cuy
extends cuv {
    private static final String TC = "SFSpecialEventChest";
    private final ljq fyE;
    private final float Radius;
    private final int ResourceType;

    public cuy(cuu cuu2, int n, ljq ljq2, float f2) {
        super(cuu2);
        this.ResourceType = n;
        this.fyE = ljq2;
        this.Radius = f2;
    }

    @Override
    protected ljq bch() {
        double d2 = Math.random() * Math.PI * 2.0;
        double d3 = Math.random() * (double)this.Radius;
        double d4 = (double)this.fyE.x + Math.cos(d2) * d3;
        double d5 = (double)this.fyE.rlV + Math.sin(d2) * d3;
        float f2 = 1000.0f;
        return new ljq(d4, 1000.0, d5);
    }

    @Override
    protected void bA(ljq ljq2) {
        assert (this.fyt == null);
        ldv ldv2 = null;
        if (lcw.enb()) {
            ldv2 = lcr.qBq;
        } else {
            this.fyr = this.fyq.bbl();
            ldv2 = lcr.ak((ldv)lcr.qBq, (int)this.fyr);
        }
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), ldv2);
        ecr2.sk(0);
        ecr2.l(this.ResourceType);
        ecr2.c(ljq2);
        float f2 = (float)(Math.PI * Math.random());
        ecr2.a(new lgl(new ljq(0.0f, f2, 0.0f)));
        ecr2.jS(true);
        ecr2.oF(null);
        this.MessageDelegator.F(ecr2);
        this.fyt = ecr2;
    }

    public int az() {
        return this.ResourceType;
    }
}

