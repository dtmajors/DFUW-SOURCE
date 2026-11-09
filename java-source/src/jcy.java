/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class jcy
extends iox {
    private xa mSy;
    private List<iop> mSz = lcn.emv();
    private ipf mMp;

    public jcy(xa xa2) {
        this.mSy = xa2;
        this.F(this.b(xa2, "off", "disabled"));
        this.G(this.b(xa2, "off", "normal"));
        this.H(this.b(xa2, "off", "hover"));
        this.I(this.b(xa2, "off", "pushing"));
        this.K(this.c(xa2, "on", "normal"));
        this.L(this.c(xa2, "on", "hover"));
        this.M(this.c(xa2, "on", "pushing"));
    }

    public ipf dyn() {
        return this.mMp;
    }

    @Override
    public void kh(float f) {
        for (iop iop2 : this.mSz) {
            iop2.dip().hz(f);
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(this.mSy.wp().bD(new Object[0]).exA().toUpperCase());
    }

    private ipf a(xa xa2, String string, String string2) {
        String string3 = "/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_" + xa2.wq() + "/category_icons_main_" + xa2.wq() + "_" + string + "_" + string2 + ".png";
        return new ipb(string3);
    }

    private ipf b(xa xa2, String string, String string2) {
        ipx ipx2 = ipx.j(ipx.a(72, 64, ipx.d(new ipk(0x191919, 56, 64))), ipx.a(1, 3, new ipf[0]));
        ipx ipx3 = ipx.j(ipx.d(this.a(xa2, string, string2)), ipx.a(1, 3, new ipf[0]));
        iop iop2 = new iop(ipx2, ipx3);
        this.mSz.add(iop2);
        return iop2;
    }

    private ipf c(xa xa2, String string, String string2) {
        ipx ipx2 = ipx.j(ipx.d(new ipb("/dfdata/texture/gui/j2f/quests/category_icons/quest_navigation_list_category_bg.png")), ipx.a(1, 3, new ipf[0]));
        ipx ipx3 = ipx.j(ipx.d(this.a(xa2, string, string2)), ipx.d(ipx.c(0, -1, new ipb("/dfdata/texture/gui/j2f/quests/category_icons/quest_navigation_list_line_arrow.png"))));
        iop iop2 = new iop(ipx2, ipx3);
        this.mSz.add(iop2);
        return iop2;
    }

    private ipf cGX() {
        this.mMp = new ipk(0x2F2F2F, 1, 34);
        return this.mMp;
    }
}

