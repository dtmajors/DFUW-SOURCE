/*
 * Decompiled with CFR.
 */
public class lfe
extends lfb {
    public static final lfr Out = lfr.rkC;
    private final String rkd;
    private final int ParameterCount;

    public lfe(String string, int n) {
        this.rkd = string;
        this.ParameterCount = n;
    }

    @Override
    public final lip a(lip ... lipArray) {
        if (lipArray == null) {
            lipArray = new lip[]{};
        }
        if (lipArray.length != this.ParameterCount) {
            // empty if block
        }
        return new ljl(this.rkd, lipArray);
    }
}

