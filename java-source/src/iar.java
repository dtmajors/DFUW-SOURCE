/*
 * Decompiled with CFR.
 */
public class iar
extends ize {
    private ipx lBV;
    private ipb lBW;
    private hvr lgb;

    public iar() {
        this.am(new ipb("/dfdata/texture/gui/j2f/advisory/backgrounds/navigation_list_entry_background.png"));
        this.dmO().W(ipx.c(new ipf[0]));
        ipf[] ipfArray = new ipf[1];
        ipf[] ipfArray2 = new ipf[2];
        ipfArray2[0] = new ipb("/dfdata/texture/gui/j2f/advisory/unread_entry.png");
        this.lBW = new ipb("/dfdata/texture/gui/j2f/advisory/unread_entry_glow.png");
        ipfArray2[1] = this.lBW;
        ipfArray[0] = ipx.h(ipfArray2);
        this.lBV = ipx.d(ipfArray);
        this.lBV.setVisible(false);
        this.dmO().W(this.lBV);
        this.dmO().W(ipx.a(8, 1, new ipf[0]));
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.cKH();
    }

    public void cKG() {
        this.cKH();
        this.lBV.setVisible(true);
        this.lgb = new hvl(this, 1.0f, 0.0f, 0.5){
            final /* synthetic */ iar lBX;
            {
                this.lBX = iar2;
                super(f, f2, d2);
            }

            public void hz(float f) {
                iar.a(this.lBX).hz(f);
            }
        };
        hso.cxK().cxP().czy().a(this.lgb);
    }

    public void cKH() {
        if (this.lgb == null) {
            return;
        }
        hso.cxK().cxP().czy().b(this.lgb);
        this.lgb = null;
        this.lBV.setVisible(false);
    }

    public boolean cKI() {
        return this.lgb != null;
    }

    public boolean aOM() {
        return true;
    }

    @Override
    protected void aTg() {
        if (this.getSelected()) {
            this.drd().Rk(12357465);
        } else if (this.dkb()) {
            if (this.aOM()) {
                this.drd().Rk(0xC0C0C0);
            } else {
                this.drd().Rk(0x505050);
            }
        } else if (this.aOM()) {
            this.drd().Rk(0xABABAB);
        } else {
            this.drd().Rk(0x525252);
        }
    }

    static /* synthetic */ ipb a(iar iar2) {
        return iar2.lBW;
    }
}

