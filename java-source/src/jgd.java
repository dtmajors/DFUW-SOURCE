/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jgd
extends iyq {
    private hvr mAD;
    private ipb lBW = new ipb("tab_icon_role_overview_off_normal_glow");

    public jgd() {
        super("tab_icon_role_overview_off_disabled", "tab_icon_role_overview_off_normal", "tab_icon_role_overview_off_hover", "tab_icon_role_overview_off_pushing", "tab_icon_role_overview_on_disabled", "tab_icon_role_overview_on_normal", "tab_icon_role_overview_on_hover", "tab_icon_role_overview_on_pushing");
        this.lBW.setVisible(false);
        this.W(ipx.d(this.lBW));
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.tn(false);
    }

    public void tn(boolean bl) {
        this.lBW.setVisible(bl);
        if (bl) {
            this.dsq();
        } else {
            this.dsr();
            this.lBW.hz(1.0f);
        }
    }

    @Override
    public void cLq() {
        super.cLq();
        this.tn(false);
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(lxx.tzi.bD(new Object[0]).exA());
    }

    private void dsq() {
        if (this.mAD == null) {
            this.mAD = new hvl(this, 1.0f, 0.0f, 0.5){
                final /* synthetic */ jgd mZl;
                {
                    this.mZl = jgd2;
                    super(f, f2, d2);
                }

                public void hz(float f) {
                    jgd.a(this.mZl).hz(f);
                }
            };
            hso.cxK().cxP().czy().a(this.mAD);
        }
    }

    private void dsr() {
        if (this.mAD != null) {
            hso.cxK().cxP().czy().b(this.mAD);
            this.mAD = null;
        }
    }

    static /* synthetic */ ipb a(jgd jgd2) {
        return jgd2.lBW;
    }
}

