/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jiu
extends ipx {
    private ain ngd;
    private ipb lNa;
    private ipb lNn;
    private ipb nhp;
    private ipb nhq;
    private ios nhr;

    public jiu(ain ain2) {
        this.ngd = ain2;
        this.a(irl.dnr());
        this.W(ipx.d(this.cPn()));
        this.W(ipx.d(this.dHF()));
        this.W(ipx.d(this.dHG()));
        this.W(ipx.d(this.dHH()));
        this.W(ipx.j(ipx.c(new ipf[0]), ipx.l(ipx.c(new ipf[0]), this.duS())));
        this.aTg();
    }

    public void aTg() {
        jhx jhx2 = jid.dHb().d(this.ngd);
        if (jhx2 != null) {
            this.lNa.setVisible(false);
            this.lNn.qP("/dfdata/texture/gui/j2f/gearguise/slot_frames/slot_frame_active.png");
            this.nhq.qP(jhx2.cCU());
        } else {
            this.lNa.setVisible(true);
            this.lNn.qP("/dfdata/texture/gui/j2f/gearguise/slot_frames/slot_frame_inactive.png");
            this.nhq.qP("");
        }
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        jif jif2;
        ioa ioa2 = ioa.o(ifg2);
        return ioa2 instanceof jif && (jif2 = (jif)ioa2).dHs().BP() == this.ngd;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        jif jif2;
        ioa ioa2 = ioa.o(ifg2);
        return ioa2 instanceof jif && (jif2 = (jif)ioa2).dHs().BP() == this.ngd;
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        return true;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        jif jif2;
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof jif && (jif2 = (jif)ioa2).dHs().BP() == this.ngd) {
            jid.dHb().f(jif2.dHs());
            return true;
        }
        return false;
    }

    @Override
    public boolean dx(int n, int n2) {
        return jid.dHb().c(this.ngd);
    }

    @Override
    public ifg dy(int n, int n2) {
        return ioa.a(n, n2, new jir(jid.dHb().d(this.ngd)));
    }

    @Override
    public void g(ifg ifg2) {
        jir jir2;
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof jir && (jir2 = (jir)ioa2).dHs().BP() == this.ngd) {
            jid.dHb().g(jir2.dHs());
        }
    }

    @Override
    public void d(ifg ifg2) {
        this.g(ifg2);
    }

    @Override
    public void b(hzk hzk2, ifg ifg2) {
        jiq jiq2;
        ioa ioa2 = ioa.o(ifg2);
        if (ioa2 instanceof jiq && (jiq2 = (jiq)ioa2).dHs().BP() == this.ngd) {
            return;
        }
        this.hz(0.3f);
    }

    @Override
    public void c(hzk hzk2, ifg ifg2) {
        this.hz(1.0f);
    }

    public void i(ain ain2) {
    }

    @Override
    public void cND() {
        this.nhr.setVisible(this.dkb() && !jiu.czu());
    }

    @Override
    public hyn dd(int n, int n2) {
        hyn hyn2 = super.dd(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        jhx jhx2 = jid.dHb().d(this.ngd);
        hyn hyn3 = null;
        if (jhx2 != null) {
            hyn3 = jhx2.dGS();
        } else {
            jhy jhy2 = jid.dHb().e(this.ngd);
            hyn3 = iae.oJ(jhy2.aNv().exA().toUpperCase());
        }
        return hyn3;
    }

    private ipf cPn() {
        String string = "";
        switch (this.ngd) {
            case bnr: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_mount.png";
                break;
            }
            case bns: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_sword.png";
                break;
            }
            case bnt: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_greatswords.png";
                break;
            }
            case bnu: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_axe.png";
                break;
            }
            case bnv: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_greataxes.png";
                break;
            }
            case bnw: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_club.png";
                break;
            }
            case bnx: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_greatclubs.png";
                break;
            }
            case bny: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_daggers.png";
                break;
            }
            case bnz: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_polearm.png";
                break;
            }
            case bnA: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_bow.png";
                break;
            }
            case bnB: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_staff.png";
                break;
            }
            case bnC: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_shields.png";
                break;
            }
            case bnD: {
                string = "/dfdata/texture/gui/j2f/gearguise/slot_icons/slot_icon_ganks.png";
            }
        }
        this.lNa = new ipb(string);
        this.lNa.hz(0.5f);
        return this.lNa;
    }

    private ipf dHF() {
        this.nhp = new ipb("/dfdata/texture/gui/j2f/gearguise/slot_frames/slot_frame_shadow.png");
        return this.nhp;
    }

    private ipf dHG() {
        this.lNn = new ipb("/dfdata/texture/gui/j2f/gearguise/slot_frames/slot_frame_inactive.png");
        return this.lNn;
    }

    private ipf dHH() {
        this.nhq = new ipb("");
        return this.nhq;
    }

    private ipf duS() {
        this.nhr = new iwg(this){
            final /* synthetic */ jiu nhs;
            {
                this.nhs = jiu2;
            }

            public void cLq() {
                this.nhs.i(jiu.a(this.nhs));
            }

            public hyn dd(int n, int n2) {
                jhy jhy2 = jid.dHb().e(jiu.a(this.nhs));
                return iae.oJ(lyy.tMx.bD(jhy2.aNv().exA()).exA().toUpperCase());
            }
        };
        this.nhr.hz(0.5f);
        this.nhr.setVisible(false);
        return this.nhr;
    }

    static /* synthetic */ ain a(jiu jiu2) {
        return jiu2.ngd;
    }
}

