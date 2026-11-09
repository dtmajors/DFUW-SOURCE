/*
 * Decompiled with CFR.
 */
public class cvd {
    private int ResourceType;
    private int fza;
    private float fzb;
    private float fzc;
    private cvc fzd;

    public final int az() {
        return this.ResourceType;
    }

    public final String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final int bco() {
        return this.fza;
    }

    public final void wT(int n) {
        this.fza = n;
    }

    public final float bcp() {
        return this.fzb;
    }

    public final void eX(float f2) {
        this.fzb = f2;
    }

    public final void eY(float f2) {
        this.fzb = f2 * 60.0f;
    }

    public final float bcq() {
        return this.fzc;
    }

    public final void eZ(float f2) {
        this.fzc = f2;
    }

    public final void fa(float f2) {
        this.fzc = f2 * 60.0f;
    }

    public final cvc bcr() {
        return this.fzd;
    }

    public final void a(cvc cvc2) {
        assert (cvc2 != null);
        this.fzd = cvc2;
        if (this.fzd == null) {
            this.fzd = cvc.NONE;
        }
    }
}

