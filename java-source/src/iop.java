/*
 * Decompiled with CFR.
 */
public class iop
extends ipx {
    private ipf lMX;
    private ipf moX;
    private static iqz moY = new iqz(){

        public void e(ipf ipf2) {
            iop iop2 = (iop)ipf2;
            int n = 0;
            int n2 = 0;
            if (iop.a(iop2) != null) {
                n = Math.max(n, iop.a(iop2).getWidth());
                n2 = Math.max(n2, iop.a(iop2).getHeight());
            }
            if (iop.b(iop2) != null) {
                n = Math.max(n, iop.b(iop2).getWidth());
                n2 = Math.max(n2, iop.b(iop2).getHeight());
            }
            iop2.setSize(n, n2);
        }

        public void i(ipf ipf2) {
            iop iop2 = (iop)ipf2;
            if (iop.a(iop2) != null) {
                iop.a(iop2).r(0, 0, iop2.getWidth(), iop2.getHeight());
            }
            if (iop.b(iop2) != null) {
                iop.b(iop2).r(iop2.getWidth() / 2 - iop.b(iop2).getWidth() / 2, iop2.getHeight() / 2 - iop.b(iop2).getHeight() / 2, iop.b(iop2).getWidth(), iop.b(iop2).getHeight());
            }
        }
    };

    public iop(ipf ipf2, ipf ipf3) {
        this.a(moY);
        this.h(ipf2);
        this.s(ipf3);
    }

    public iop() {
        this(null, null);
    }

    public ipf dip() {
        return this.lMX;
    }

    public void h(ipf ipf2) {
        if (ipf2 == this.lMX) {
            return;
        }
        if (this.lMX != null) {
            this.X(this.lMX);
        }
        this.lMX = ipf2;
        if (this.lMX == null) {
            return;
        }
        this.c(this.lMX, 0);
    }

    public ipf diq() {
        return this.moX;
    }

    public void s(ipf ipf2) {
        if (ipf2 == this.moX) {
            return;
        }
        if (this.moX != null) {
            this.X(this.moX);
        }
        this.moX = ipf2;
        if (this.moX == null) {
            return;
        }
        this.c(this.moX, itp.t(this.lMX));
    }

    @Override
    public void kh(float f) {
        if (this.lMX != null) {
            this.lMX.hz(f);
        }
    }

    static /* synthetic */ ipf a(iop iop2) {
        return iop2.lMX;
    }

    static /* synthetic */ ipf b(iop iop2) {
        return iop2.moX;
    }
}

