/*
 * Decompiled with CFR.
 */
public class ivd
extends ios {
    protected String mAH = "ColourButtonLock";
    private ipb mAI = null;
    private ipx mAJ = null;
    private ipk mrU;
    private lox lGm;
    private loz mAK;

    public ivd(int n, lox lox2) {
        this.lGm = lox2;
        this.Tf(n);
    }

    public int Hr() {
        return this.mrU.Hr();
    }

    public void setColor(int n) {
        this.ae(n, true);
    }

    public void ae(int n, boolean bl) {
        if (n == this.Hr()) {
            return;
        }
        this.mrU.setColor(n);
        if (bl) {
            this.PW(n);
        }
    }

    @Override
    public void cLq() {
        ioc ioc2 = this.eo(0, 0);
        if (this.lGm != null) {
            izp izp2 = new izp(this, this.djE(), new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()), this.lGm, this.mrU.Hr()){
                final /* synthetic */ ivd mAL;
                {
                    this.mAL = ivd2;
                    super(ioa2, joa2, lox2, n);
                }

                public void Qd(int n) {
                    ivd.a(this.mAL).setColor(n);
                    this.mAL.PW(n);
                }
            };
            izp2.setGUID(this.djE().getMessageDelegator().bzv());
            this.djE().getMessageDelegator().a((amf)((Object)izp2));
        } else {
            izp izp3 = new izp(this, this.djE(), new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()), this.mAK, this.mrU.Hr()){
                final /* synthetic */ ivd mAL;
                {
                    this.mAL = ivd2;
                    super(ioa2, joa2, loz2, n);
                }

                public void Qd(int n) {
                    ivd.a(this.mAL).setColor(n);
                    this.mAL.PW(n);
                }
            };
            izp3.setGUID(this.djE().getMessageDelegator().bzv());
            this.djE().getMessageDelegator().a((amf)((Object)izp3));
        }
    }

    public void PW(int n) {
    }

    @Override
    public void cPv() {
        super.cPv();
        if (this.dsv()) {
            if (this.djR()) {
                if (this.mAJ != null) {
                    this.X(this.mAJ);
                }
            } else {
                if (this.mAI == null) {
                    this.mAI = new ipb(this.mAH);
                    this.mAJ = ipx.d(this.mAI);
                }
                this.c(this.mAJ, this.bfn());
            }
        }
    }

    protected boolean dsv() {
        return false;
    }

    private void Tf(int n) {
        this.mrU = new ipk(n);
        this.W(this.mrU);
        this.t(ipx.h(new ipb("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_disabled.png"), new ipt(0x898989)));
        this.u(ipx.h(new ipb("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_normal.png"), new ipt(0x898989)));
        this.v(ipx.h(new ipb("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_hover.png"), new ipt(0xC0C0C0)));
        this.w(ipx.h(new ipb("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_pushing.png"), new ipt(0xC0C0C0)));
        if (this.dsv()) {
            this.mAI = new ipb(this.mAH);
            this.mAJ = ipx.d(this.mAI);
        }
    }

    static /* synthetic */ ipk a(ivd ivd2) {
        return ivd2.mrU;
    }
}

