/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfv
extends jft {
    private jep mVu;
    private ipb mYa;
    private ipb mYb;
    private ipb mYc;

    public jfv(jep jep2) {
        this.mVu = jep2;
        this.aA(new ipb("attribute_equipment_slot_weapon_disabled"));
        this.aB(new ipb("attribute_equipment_slot_weapon_hover"));
        this.aC(new ipb("attribute_equipment_slot_weapon_selected"));
        this.mYa = new ipb();
        this.aD(this.mYa);
        this.mYb = new ipb();
        this.aE(this.mYb);
        this.mYc = new ipb();
        this.aF(this.mYc);
        jen.dzL().mUT.a((jlg<jep, jev>)new jls<jfv, jep, jev>(this, this){
            final /* synthetic */ jfv mYp;
            {
                this.mYp = jfv2;
                super(jfv3);
            }

            public void a(jfv jfv2, jep jep2, jev jev2) {
                jfv.a(jfv2);
            }
        });
        this.aTg();
    }

    public jep dzO() {
        return this.mVu;
    }

    public jev dBW() {
        return jen.dzL().dzM().dzD().l(this.mVu);
    }

    @Override
    public boolean dzG() {
        return jen.dzL().dzM().dzD().m(this.mVu);
    }

    public void aTg() {
        switch (this.dBW()) {
            case mWg: {
                this.mYa.qP("button_equipment_weapon_bows_daggers_normal");
                this.mYb.qP("button_equipment_weapon_bows_daggers_hover");
                this.mYc.qP("button_equipment_weapon_bows_daggers_pushing");
                break;
            }
            case mWh: {
                this.mYa.qP("button_equipment_weapon_one_handed_shield_normal");
                this.mYb.qP("button_equipment_weapon_one_handed_shield_hover");
                this.mYc.qP("button_equipment_weapon_one_handed_shield_pushing");
                break;
            }
            case mWi: {
                this.mYa.qP("button_equipment_weapon_staffs_normal");
                this.mYb.qP("button_equipment_weapon_staffs_hover");
                this.mYc.qP("button_equipment_weapon_staffs_pushing");
                break;
            }
            case mWj: {
                this.mYa.qP("button_equipment_weapon_two_handed_normal");
                this.mYb.qP("button_equipment_weapon_two_handed_hover");
                this.mYc.qP("button_equipment_weapon_two_handed_pushing");
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
        return ioa.a(n, n2, new jfu(this.dBW(), this.mYb.djt()));
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        if (ioa.a(ifg2, jfu.class)) {
            this.th(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        return ioa.a(ifg2, jfu.class);
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        if (ioa.a(ifg2, jfu.class)) {
            this.th(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        if (ioa.a(ifg2, jfu.class)) {
            this.th(false);
            jfu jfu2 = (jfu)ioa.o(ifg2);
            jen.dzL().dzM().dzD().a(this.mVu, jfu2.dBW());
            return true;
        }
        return false;
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(jen.dzL().dzM().dzD().l(this.mVu).dzX().bD(new Object[0]).exA());
    }

    private void dBM() {
        this.aTg();
        this.dBU();
    }

    static /* synthetic */ void a(jfv jfv2) {
        jfv2.dBM();
    }
}

