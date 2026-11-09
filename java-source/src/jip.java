/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jip
extends jio {
    private jin ngZ;
    private jhx nha;
    private ipb nhb;
    private ipb nhc;
    private ipk nhd;
    private ist lUP;

    public jip(jin jin2, jhx jhx2) {
        this.rG(false);
        this.ngZ = jin2;
        this.nha = jhx2;
        this.a(irl.dnr());
        this.W(this.cGT());
        this.W(this.cGU());
        this.aTg();
    }

    public jin dHy() {
        return this.ngZ;
    }

    public jhx dHz() {
        return this.nha;
    }

    @Override
    public boolean a(jhw jhw2) {
        return this.nha.a(jhw2) && this.ngZ.dHw();
    }

    @Override
    public boolean a(jib jib2) {
        return this.nha.a(jib2) && this.ngZ.dHw();
    }

    public void aTg() {
        switch (this.nha.dGP()) {
            case ngn: {
                this.nhb.setVisible(true);
                this.nhb.hz(0.6f);
                this.nhd.setVisible(true);
                this.nhd.hz(0.5f);
                this.nhc.setVisible(false);
                this.lUP.Rk(0x4F4F4F);
                break;
            }
            case ngo: {
                this.nhb.setVisible(true);
                this.nhb.hz(1.0f);
                this.nhd.setVisible(false);
                this.nhc.setVisible(false);
                this.lUP.Rk(0xABABAB);
                break;
            }
            case ngp: {
                this.nhb.setVisible(false);
                this.nhd.setVisible(false);
                this.nhc.setVisible(true);
                this.lUP.Rk(0xABABAB);
            }
        }
    }

    @Override
    public boolean eB(int n, int n2) {
        switch (this.nha.dGP()) {
            case ngo: {
                jid.dHb().f(this.nha.dGR());
                return true;
            }
            case ngp: {
                jid.dHb().g(this.nha.dGR());
                return true;
            }
        }
        return false;
    }

    @Override
    public void cND() {
        switch (this.nha.dGP()) {
            default: 
        }
    }

    @Override
    public boolean dx(int n, int n2) {
        return this.nha.dGP() == jia.ngo;
    }

    @Override
    public ifg dy(int n, int n2) {
        switch (this.nha.dGP()) {
            case ngo: {
                return ioa.a(n, n2, new jiq(this.nha));
            }
        }
        return null;
    }

    @Override
    public hyn dd(int n, int n2) {
        return this.nha.dGS();
    }

    private ipf cGT() {
        ipk ipk2 = new ipk(this, 0x181818, 236, 22){
            final /* synthetic */ jip nhe;
            {
                this.nhe = jip2;
                super(n, n2, n3);
            }

            public void kh(float f2) {
                this.hz(f2);
            }
        };
        return ipx.d(ipk2);
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.cPn()));
        ipx2.W(ipx.d(this.cPo()));
        return ipx2;
    }

    private ipf cPn() {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(this.cPm());
        ipx2.W(this.dHA());
        ipx2.W(this.dHB());
        ipx2.W(this.dHC());
        ipx2.W(this.dHD());
        return ipx2;
    }

    private ipf cPm() {
        return ipx.c(7, 1, 1, 1, new ipk(0x161616, 36, 36));
    }

    private ipf dHA() {
        return ipx.c(7, 1, 1, 1, ipx.a(36, 36, new ipb(this.nha.cCU())));
    }

    private ipf dHB() {
        this.nhb = new ipb("/dfdata/texture/gui/j2f/gearguise/list_frames/icon_bg_frame_.png");
        return this.nhb;
    }

    private ipf dHC() {
        this.nhd = new ipk(0x161616, 36, 36);
        return ipx.c(7, 1, 1, 1, this.nhd);
    }

    private ipf dHD() {
        this.nhc = new ipb("/dfdata/texture/gui/j2f/gearguise/list_frames/icon_bg_frame_selected.png");
        return this.nhc;
    }

    private ipf cPo() {
        this.lUP = new ist(isf.mwN, 14, 0xABABAB, this.nha.aND());
        return this.lUP;
    }
}

