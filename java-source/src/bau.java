/*
 * Decompiled with CFR.
 */
final class bau
implements bgc {
    private ccn cOS = null;
    private bgb cOT = null;

    bau(ccn ccn2, dxr dxr2) {
        this.cOS = ccn2;
        this.cOT = new bgb(this.cOS.getGUID());
        this.cOT.setGUID(dxr2.bzv());
        dxr2.a(this.cOT);
        this.cOS.a(this);
    }

    void a(fay fay2) {
        this.cOT.receiveMessage(fay2);
    }

    @Override
    public void b(float f, ldv ldv2, boolean bl) {
        ez ez2 = (ez)this.cOS.fi().ah(352);
        if (ez2 == null) {
            this.cOT.d(f, ldv2, bl);
        } else {
            this.cOT.a(f, ldv2, bl, ez2.fN(), ez2.fX());
        }
    }
}

