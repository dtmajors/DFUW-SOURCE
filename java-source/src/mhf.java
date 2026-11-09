/*
 * Decompiled with CFR.
 */
public class mhf
extends mgr<mhg> {
    public mhf() {
        this.DvZ = new mhg((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    @Override
    public void oG() {
        this.DvZ = new mhg((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    public int eR(ljq ljq2) {
        return ((mhg)this.DvZ).at(mhf.oh(ljq2.x), mhf.oi(ljq2.rlV));
    }
}

