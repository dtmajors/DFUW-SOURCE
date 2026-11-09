/*
 * Decompiled with CFR.
 */
public class beo
implements bgc {
    private ccv ddp = null;
    private bgb cOT = null;

    public void anh() {
        this.cOT.anh();
    }

    public void ani() {
        this.cOT.aot();
    }

    public void a(bge bge2) {
        this.cOT.a(bge2);
    }

    public beo(ccv ccv2, dxr dxr2) {
        this.ddp = ccv2;
        this.cOT = new bgb(this.ddp.getGUID());
        this.cOT.setGUID(dxr2.bzv());
        dxr2.a(this.cOT);
        this.ddp.aJc().a(this);
    }

    public void b(dxr dxr2) {
        if (this.cOT != null) {
            this.cOT.anh();
            dxr2.hd(this.cOT.getGUID());
            this.cOT = null;
        }
    }

    public void a(fay fay2) {
        this.cOT.receiveMessage(fay2);
    }

    @Override
    public void b(float f2, ldv ldv2, boolean bl) {
        ez ez2 = (ez)this.ddp.fi().ah(352);
        if (ez2 == null) {
            this.cOT.d(f2, ldv2, bl);
        } else {
            this.cOT.a(f2, ldv2, bl, ez2.fN(), ez2.fX());
        }
    }
}

