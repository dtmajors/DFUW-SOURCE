/*
 * Decompiled with CFR.
 */
public class aix
extends aiu
implements akw {
    private static final float bnW = 1.0f;
    private boolean bod = false;
    private double boc = 0.0;
    private boolean boe = true;

    public aix() {
        this.bog = ajb.b.boB;
    }

    public boolean Cj() {
        return this.bod;
    }

    public void aX(boolean bl) {
        this.bod = bl;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aix aix2 = (aix)aja2;
        aix2.aX(this.bod);
    }

    @Override
    public void nh() {
        if (this.boc == 0.0) {
            return;
        }
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        while (this.boc <= d2) {
            this.boc += 1.0;
            this.Ca();
        }
    }

    @Override
    public void Ch() {
        this.boc = this.boj.getMessageDelegator().arc().rgz + 1.0;
        if (this.bod) {
            this.a(this.BV(), false, "Deactivating Regeneration Manager : ");
            this.boe = false;
        }
    }

    @Override
    public void Ci() {
        if (this.bod && this.boc > 0.0 && !this.boe) {
            this.a(this.BV(), true, "Activating Regeneration Manager : ");
            this.boe = true;
        }
        this.boc = 0.0;
    }

    private void a(int n, boolean bl, String string) {
        assert (n > 0);
        if (this.boj.bfF()) {
            this.boj.aJz().bgQ().aJL().b(n, bl, string + " From Attribute Performing Constraint : " + this.boj.Bu());
        }
    }
}

