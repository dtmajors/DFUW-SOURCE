/*
 * Decompiled with CFR.
 */
public class isc
extends ipx {
    public isc() {
        this.a(iqo.dmS());
    }

    public isb dpr() {
        for (int i = 0; i < this.bfn(); ++i) {
            ipf ipf2 = this.RO(i);
            if (!(ipf2 instanceof isb) || !((isb)ipf2).djZ()) continue;
            return (isb)ipf2;
        }
        return null;
    }

    public void a(isb isb2, int n) {
        this.c(isb2, n);
    }
}

