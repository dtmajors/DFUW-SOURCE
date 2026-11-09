/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class mhi
extends mgr<mhj> {
    public mhi() {
        this.DvZ = new mhj((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    @Override
    public void oG() {
        this.DvZ = new mhj((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    public List<lgs> aej(int n) {
        ArrayList<lgs> arrayList = lcn.emv();
        ((mhj)this.DvZ).f(arrayList, n);
        for (lgs lgs2 : arrayList) {
            lgs2.cf = (int)mhi.oj(lgs2.cf);
            lgs2.cg = (int)mhi.ok(lgs2.cg);
        }
        return arrayList;
    }
}

