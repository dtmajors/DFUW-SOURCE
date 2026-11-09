/*
 * Decompiled with CFR.
 */
abstract class dqa
extends dpz {
    protected ccv ddp = null;

    protected dqa(dpx dpx2) {
        super(dpx2);
    }

    final void a(ccv ccv2) {
        if (this.ddp != null) {
            return;
        }
        this.ddp = ccv2;
        if (this.ddp != null) {
            this.bsf();
        }
    }

    protected abstract void bsf();

    final void bsT() {
        if (this.ddp != null) {
            this.bsg();
            this.ddp = null;
        }
    }

    protected abstract void bsg();
}

