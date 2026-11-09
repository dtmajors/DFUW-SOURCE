/*
 * Decompiled with CFR.
 */
public class dev
extends dey {
    dev() {
        this.gnv = 1;
    }

    protected void a(dey dey2) {
        super.copyValues(dey2);
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            this.bli();
            this.CleanedUp = true;
        }
    }

    protected void bli() {
        knr knr2 = (knr)this.MessageDelegator.h(260);
        knr2.ts(this.GUID);
        knr2.hC(this.GUID);
        knr2.Zy(1);
        this.MessageDelegator.a(knr2);
    }
}

