/*
 * Decompiled with CFR.
 */
public class ioe
extends hvm {
    public ipf moH;

    public ioe(ipf ipf2, float f, float f2, double d2) {
        super(f, f2, d2);
        this.moH = ipf2;
    }

    public ipf dik() {
        return this.moH;
    }

    @Override
    public void hz(float f) {
        this.moH.hz(f);
    }

    @Override
    public void az(ldz ldz2) {
        super.az(ldz2);
        this.moH.hz(this.czP());
    }

    @Override
    public void aA(ldz ldz2) {
        super.aA(ldz2);
        this.moH.hz(this.czQ());
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }
}

