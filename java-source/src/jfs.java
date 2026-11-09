/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfs
extends jft {
    private jep mVu;
    private ipb mYa;
    private ipb mYb;
    private ipb mYc;

    public jfs(jep jep2) {
        this.mVu = jep2;
        this.aA(new ipb("attribute_equipment_slot_armor_disabled"));
        this.aB(new ipb("attribute_equipment_slot_armor_hover"));
        this.aC(new ipb("attribute_equipment_slot_armor_selected"));
        this.mYa = new ipb();
        this.aD(this.mYa);
        this.mYb = new ipb();
        this.aE(this.mYb);
        this.mYc = new ipb();
        this.aF(this.mYc);
        jen.dzL().mUS.a((jlg<jep, jet>)new jls<jfs, jep, jet>(this, this){
            final /* synthetic */ jfs mYd;
            {
                this.mYd = jfs2;
                super(jfs3);
            }

            public void a(jfs jfs2, jep jep2, jet jet2) {
                jfs.a(jfs2);
            }
        });
        this.aTg();
    }

    public jep dzO() {
        return this.mVu;
    }

    public jet dBL() {
        return jen.dzL().dzM().dzD().j(this.mVu);
    }

    @Override
    public boolean dzG() {
        return jen.dzL().dzM().dzD().k(this.mVu);
    }

    public void aTg() {
        switch (this.dBL()) {
            case mVT: {
                this.mYa.qP("button_equipment_armor_heavy_normal");
                this.mYb.qP("button_equipment_armor_heavy_hover");
                this.mYc.qP("button_equipment_armor_heavy_pushing");
                break;
            }
            case mVU: {
                this.mYa.qP("button_equipment_armor_light_normal");
                this.mYb.qP("button_equipment_armor_light_hover");
                this.mYc.qP("button_equipment_armor_light_pushing");
                break;
            }
            case mVV: {
                this.mYa.qP("button_equipment_robe_heavy_normal");
                this.mYb.qP("button_equipment_robe_heavy_hover");
                this.mYc.qP("button_equipment_robe_heavy_pushing");
                break;
            }
            case mVW: {
                this.mYa.qP("button_equipment_robe_light_normal");
                this.mYb.qP("button_equipment_robe_light_hover");
                this.mYc.qP("button_equipment_robe_light_pushing");
            }
        }
    }

    @Override
    public boolean dx(int n, int n2) {
        return true;
    }

    @Override
    public ifg dy(int n, int n2) {
        this.rS(false);
        return ioa.a(n, n2, new jfr(this.dBL(), this.mYb.djt()));
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        if (ioa.a(ifg2, jfr.class)) {
            this.th(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        return ioa.a(ifg2, jfr.class);
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        if (ioa.a(ifg2, jfr.class)) {
            this.th(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        if (ioa.a(ifg2, jfr.class)) {
            this.th(false);
            jfr jfr2 = (jfr)ioa.o(ifg2);
            jen.dzL().dzM().dzD().a(this.mVu, jfr2.dBL());
            return true;
        }
        return false;
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(jen.dzL().dzM().dzD().j(this.mVu).dzX().bD(new Object[0]).exA());
    }

    private void dBM() {
        this.aTg();
        this.dBU();
    }

    static /* synthetic */ void a(jfs jfs2) {
        jfs2.dBM();
    }
}

