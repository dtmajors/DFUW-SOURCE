/*
 * Decompiled with CFR.
 */
public class chc
extends che {
    public int bnM;
    public float ezI;

    public chc() {
        this.ezL = cgi.ATTRIBUTE_LEVEL;
    }

    public boolean u(int n, float f) {
        if (this.bnM != -1 && this.bnM != n) {
            return false;
        }
        return !(f < this.ezI);
    }
}

