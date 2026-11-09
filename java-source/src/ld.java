/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ld
extends mgr<le> {
    private int ID = -1;
    private String Name = null;
    private lf asO = null;
    private lgs asI = null;
    private Set<le> asP = null;

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    public lf oK() {
        return this.asO;
    }

    public lgs oL() {
        return this.asI;
    }

    public Set<le> oM() {
        return this.asP;
    }

    public ld(int n, String string, lf lf2) {
        this.DvZ = new le((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
        this.ID = n;
        this.Name = string;
        this.asO = lf2;
    }

    @Override
    protected void oF() {
        if (this.asI == null) {
            this.asI = new lgs(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        ((le)this.DvZ).a(this.asI);
        this.oN();
    }

    @Override
    public void oG() {
        this.DvZ = new le((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    public boolean U(ljq ljq2) {
        return ((le)this.DvZ).b(ld.oh(ljq2.x), ld.oi(ljq2.rlV));
    }

    public boolean c(ljq ljq2, float f) {
        return ((le)this.DvZ).d(ld.oh(ljq2.x), ld.oi(ljq2.rlV), f);
    }

    public List<lgs> oA() {
        ArrayList<lgs> arrayList = lcn.emv();
        ((le)this.DvZ).B(arrayList);
        for (lgs lgs2 : arrayList) {
            lgs2.cf = (int)ld.oj(lgs2.cf);
            lgs2.cg = (int)ld.ok(lgs2.cg);
        }
        return arrayList;
    }

    private void oN() {
        this.asP = lcn.emx();
        ((le)this.DvZ).c(this.asP);
    }
}

