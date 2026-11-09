/*
 * Decompiled with CFR.
 */
public abstract class irv
extends ipx
implements irt {
    private irt mwm;

    public irv() {
        this.a(irl.dnr());
        this.mwm = this.doC();
        if (this.mwm != null) {
            this.W(this.mwm.dik());
        }
    }

    public irt doB() {
        return this.mwm;
    }

    @Override
    public ire dlY() {
        return this.mwm != null ? this.mwm.dlY() : null;
    }

    @Override
    public void b(ire ire2) {
        if (this.mwm != null) {
            this.mwm.b(ire2);
        }
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (this.mwm != null) {
            this.mwm.a(n, n2, n3, n4, n5, bl);
        }
    }

    @Override
    public void kh(float f) {
        if (this.mwm != null) {
            this.mwm.kh(f);
        }
    }

    public abstract irt doC();
}

