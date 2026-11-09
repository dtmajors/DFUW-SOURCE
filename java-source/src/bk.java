/*
 * Decompiled with CFR.
 */
public class bk
extends bg {
    private lju eM;
    private lju eN;

    public bk(lju lju2, lju lju3) {
        super((String)null);
        this.eM = lju2;
        this.eN = lju3;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return "Minimum:" + this.eM + " Found:" + this.eN;
    }
}

