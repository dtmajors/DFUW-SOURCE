/*
 * Decompiled with CFR.
 */
public class izd
extends inz {
    private ire msb;
    private ipx lWE;
    private ipb mCY;
    private ipb mCZ;

    public izd(String string, String string2, ioa ioa2, joa joa2, int n, int n2, ire ire2) {
        super(string, string2, ioa2, joa2, n, n2);
        this.msb = ire2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(this.dtL());
        this.dhJ().W(this.dtM());
        this.dhJ().W(this.cKS());
    }

    @Override
    protected void cKg() {
        super.cKg();
        switch (this.msb) {
            case mul: {
                if (this.dhG().X > this.dhF().dOk()) {
                    this.mCY.setVisible(false);
                    this.mCZ.setVisible(true);
                    break;
                }
                this.mCY.setVisible(true);
                this.mCZ.setVisible(false);
                break;
            }
            case muk: {
                if (this.dhG().Y > this.dhF().dOl()) {
                    this.mCY.setVisible(false);
                    this.mCZ.setVisible(true);
                    break;
                }
                this.mCY.setVisible(true);
                this.mCZ.setVisible(false);
            }
        }
    }

    @Override
    protected ipb dhD() {
        return null;
    }

    @Override
    protected ipb dhE() {
        return null;
    }

    protected ipx dmO() {
        return this.lWE;
    }

    private ipf dtL() {
        return this.msb == ire.mul ? new iqa("/dfdata/texture/gui/j2f/common/tooltips/tooltip_background_vertical.png", 8, 18, 8, 18, iqb.mtp) : new iqa("/dfdata/texture/gui/j2f/common/tooltips/tooltip_background_horizontal.png", 18, 8, 18, 8, iqb.mtp);
    }

    private ipf dtM() {
        ipx ipx2 = null;
        switch (this.msb) {
            case mul: {
                ipx2 = ipx.j(new ipf[0]);
                ipf[] ipfArray = new ipf[1];
                this.mCY = new ipb("/dfdata/texture/gui/j2f/common/tooltips/tooltip_arrow_top.png");
                ipfArray[0] = this.mCY;
                ipx2.W(ipx.d(ipfArray));
                ipx2.W(ipx.c(new ipf[0]));
                ipf[] ipfArray2 = new ipf[1];
                this.mCZ = new ipb("/dfdata/texture/gui/j2f/common/tooltips/tooltip_arrow_bottom.png");
                ipfArray2[0] = this.mCZ;
                ipx2.W(ipx.d(ipfArray2));
                break;
            }
            case muk: {
                ipx2 = ipx.l(new ipf[0]);
                ipf[] ipfArray = new ipf[1];
                this.mCY = new ipb("/dfdata/texture/gui/j2f/common/tooltips/tooltip_arrow_left.png");
                ipfArray[0] = this.mCY;
                ipx2.W(ipx.d(ipfArray));
                ipx2.W(ipx.c(new ipf[0]));
                ipf[] ipfArray3 = new ipf[1];
                this.mCZ = new ipb("/dfdata/texture/gui/j2f/common/tooltips/tooltip_arrow_right.png");
                ipfArray3[0] = this.mCZ;
                ipx2.W(ipx.d(ipfArray3));
            }
        }
        return ipx2;
    }

    private ipf cKS() {
        ipx ipx2 = this.msb == ire.mul ? ipx.c(8, 18, 8, 18, new ipf[0]) : ipx.c(18, 8, 18, 8, new ipf[0]);
        this.lWE = new ipx();
        ipx2.W(this.lWE);
        return ipx2;
    }
}

