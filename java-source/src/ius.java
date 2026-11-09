/*
 * Decompiled with CFR.
 */
public class ius
extends ios {
    private ipb lBW;
    private hvr mAD;

    public ius() {
        this.t(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_activation/button_activation_disabled.png")));
        this.dis().rg(false);
        this.u(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_activation/button_activation_active_normal.png")));
        this.dit().rg(false);
        this.v(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_activation/button_activation_active_hover.png")));
        this.diu().rg(false);
        this.w(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_activation/button_activation_active_pushing.png")));
        this.div().rg(false);
        this.lBW = new ipb("/dfdata/texture/gui/j2f/common/buttons/button_activation/button_activation_active_glow.png");
        this.lBW.rg(false);
        this.lBW.setVisible(false);
        this.W(this.lBW);
        this.setActive(false);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dsr();
    }

    @Override
    public void cPw() {
        super.cPw();
        if (this.lBW == null) {
            return;
        }
        if (this.djZ()) {
            this.lBW.setVisible(true);
            this.dsq();
        } else {
            this.lBW.setVisible(false);
            this.dsr();
        }
    }

    private void dsq() {
        if (this.mAD == null) {
            this.mAD = new a(this);
            hso.cxK().cxP().czy().a(this.mAD);
        }
    }

    private void dsr() {
        if (this.mAD != null) {
            hso.cxK().cxP().czy().b(this.mAD);
            this.mAD = null;
        }
    }

    static /* synthetic */ ipb a(ius ius2) {
        return ius2.lBW;
    }
}

