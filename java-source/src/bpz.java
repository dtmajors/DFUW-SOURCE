/*
 * Decompiled with CFR.
 */
public class bpz
extends brv {
    public brv[] dBr = null;

    @Override
    public int atV() {
        int n = 1;
        if (this.dBr != null) {
            int n2 = this.dBr.length;
            for (int i = 0; i < n2; ++i) {
                n += this.dBr[i].atV();
            }
        }
        return n;
    }

    @Override
    public boolean validate() {
        if (!super.validate()) {
            return false;
        }
        if (this.dBr == null) {
            return false;
        }
        int n = this.dBr.length;
        for (int i = 0; i < n; ++i) {
            if (this.dBr[i].validate()) continue;
            return false;
        }
        return true;
    }
}

