/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class lmd
extends mgr<lme> {
    public lmd() {
        this.DvZ = new lme((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    @Override
    public void oG() {
        this.DvZ = new lme((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    public void a(ljq ljq2, float f, lmf lmf2) {
        ((lme)this.DvZ).a(lmd.oh(ljq2.x), lmd.oi(ljq2.rlV), f, lmf2);
    }

    public lmf eg(ljq ljq2) {
        return ((lme)this.DvZ).am(lmd.oh(ljq2.x), lmd.oi(ljq2.rlV));
    }

    public List<lgs> euO() {
        return this.d(lmf.rEz);
    }

    public List<lgs> d(lmf lmf2) {
        ArrayList<lgs> arrayList = lcn.emv();
        ((lme)this.DvZ).a(arrayList, lmf2);
        for (lgs lgs2 : arrayList) {
            lgs2.cf = (int)lmd.oj(lgs2.cf);
            lgs2.cg = (int)lmd.ok(lgs2.cg);
        }
        return arrayList;
    }
}

