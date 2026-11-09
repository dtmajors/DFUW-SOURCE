/*
 * Decompiled with CFR.
 */
public class yu
extends mgr<yv> {
    private int ID = -1;
    private lgs asI = null;

    public int getID() {
        return this.ID;
    }

    public lgs oL() {
        return this.asI;
    }

    public yu(int n) {
        this.DvZ = new yv((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
        this.ID = n;
    }

    @Override
    protected void oF() {
        if (this.asI == null) {
            this.asI = new lgs(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        ((yv)this.DvZ).a(this.asI);
    }

    @Override
    public void oG() {
        this.DvZ = new yv((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    public boolean U(ljq ljq2) {
        return ((yv)this.DvZ).b(yu.oh(ljq2.x), yu.oi(ljq2.rlV));
    }

    public boolean c(ljq ljq2, float f2) {
        return ((yv)this.DvZ).d(yu.oh(ljq2.x), yu.oi(ljq2.rlV), f2);
    }
}

