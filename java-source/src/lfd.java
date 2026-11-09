/*
 * Decompiled with CFR.
 */
public class lfd
extends lfc {
    private final String[] rkc;
    private final int ParameterCount;

    public lfd(String[] stringArray, int n) {
        for (int i = 0; i < stringArray.length; ++i) {
            assert (stringArray[i] != null);
        }
        this.rkc = stringArray;
        this.ParameterCount = n;
    }

    @Override
    public final lfb acy(int n) {
        if (n < 0 || n >= this.rkc.length) {
            n %= this.rkc.length;
        }
        return new lfe(this.rkc[n], this.ParameterCount);
    }

    @Override
    public final int getSelectionCount() {
        return this.rkc.length;
    }
}

