/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 */
public class hpj
extends hpi {
    private lcq dMT;
    private final hpa kVu;

    public hpj(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpi.a a2, lgg lgg3, String string2, lcq lcq2) {
        super(hnc2, string, lgg2, lhf2, a2, lgg3, string2);
        this.dMT = lcq2;
        this.kVu = new hpa(hnc2, (String)null, this.cvh(), null, hdk.jNK);
        this.kVu.H(this.dMT);
        this.j(this.kVu);
    }

    public void setColor(lcq lcq2) {
        this.dMT = lcq2;
        this.kVu.H(lcq2);
    }

    private lgg cvh() {
        return new lgg(this.cqv().rmN - hdk.jNK.kLY.rmN - 4, (this.cqv().H - hdk.jNK.kLY.H) / 2);
    }

    @Override
    protected void cce() {
        super.cce();
        this.kVu.z(this.cvh());
    }
}

