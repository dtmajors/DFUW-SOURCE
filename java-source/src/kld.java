/*
 * Decompiled with CFR.
 */
public abstract class kld
extends khd {
    public ldv Rs = null;

    kld() {
        this.Jv(1024);
    }

    public void a(kld kld2) {
        this.Rs = kld2.Rs;
        super.d(kld2);
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public ldv oq() {
        return this.Rs;
    }
}

