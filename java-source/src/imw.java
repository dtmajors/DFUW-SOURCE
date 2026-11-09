/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class imw
extends ipx
implements hxc {
    private imr mkM;
    private ipb mkN;
    private ist mkO;
    private ipb mkP;
    private ist mkQ;
    private ipx mkR;
    private ist mkS;
    private ist mkT;
    private ist mkU;

    public imw(imr imr2) {
        this.mkM = imr2;
        this.a(irl.dnr());
        this.W(this.cGU());
        this.mkM.mkr.b(new jlq<imw>(this, this){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(imw3);
            }

            public void c(imw imw2) {
                imw.a(imw2);
            }

            public /* synthetic */ void R(Object object) {
                this.c((imw)object);
            }
        });
        ilw.ddy().miB.a((jlg<ilq, ilx>)new jls<imw, ilq, ilx>(this, this){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(imw3);
            }

            public void c(imw imw2, ilq ilq2, ilx ilx2) {
                imw.a(imw2, ilq2, ilx2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.c((imw)object, (ilq)object2, (ilx)object3);
            }
        });
        ilw.ddy().miC.a((jlg<ilq, ilx>)new jls<imw, ilq, ilx>(this, this){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(imw3);
            }

            public void c(imw imw2, ilq ilq2, ilx ilx2) {
                imw.b(imw2, ilq2, ilx2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.c((imw)object, (ilq)object2, (ilx)object3);
            }
        });
        hso.cxK().cxP().cza().a(this, this.mkM.dem().cBs().alX().ordinal());
        this.dac();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cza() != null) {
            hso.cxK().cxP().cza().a(this);
        }
    }

    public void bu(List<iua> list) {
        if (list != null) {
            this.M(list.size(), this.bv(list));
        } else {
            this.M(0, 0.0f);
        }
    }

    @Override
    public void cY(int n, int n2) {
        this.deS();
        this.deT();
    }

    @Override
    public void F(int n, float f) {
        this.deQ();
    }

    @Override
    public void ki(float f) {
        this.deQ();
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(this.deE());
        ipx2.W(this.deH());
        ipx2.W(this.deK());
        if (!this.mkM.dem().ddh()) {
            ipx2.W(ipx.c(new ipf[0]));
            ipx2.W(this.deM());
            ipx2.W(this.deO());
            ipx2.W(ipx.a(2, 1, new ipf[0]));
        }
        return ipx2;
    }

    private ipf deE() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(imw.b(this.mkV).dem().ddi() ? lxb.tmX.bD(new Object[0]).exA().toUpperCase() : lxb.tmY.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.d(this.deF()));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(this.deG()));
        return ipx2;
    }

    private ipf deF() {
        this.mkN = new ipb();
        return this.mkN;
    }

    private ipf deG() {
        this.mkO = new ist(isf.mwN, 12, 0xABABAB);
        return this.mkO;
    }

    private ipf deH() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmZ.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.deI()));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(this.deJ()));
        return ipx2;
    }

    private ipf deI() {
        this.mkP = new ipb("/dfdata/texture/gui/j2f/inventory/main/information_view/capacity.png");
        return this.mkP;
    }

    private ipf deJ() {
        this.mkQ = new ist(isf.mwN, 12, 0xABABAB);
        return this.mkQ;
    }

    private ipf deK() {
        ipx ipx2;
        this.mkR = ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tna.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/inventory/main/information_view/selection.png")));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(this.deL()));
        return ipx2;
    }

    private ipf deL() {
        this.mkS = new ist(isf.mwN, 12, 12357465);
        this.mkS.rj(true);
        return this.mkS;
    }

    private ipf deM() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tnb.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/runtime/buttons/icons/backpack_up.png")));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(this.deN()));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/icons/currency_gold.png")));
        return ipx2;
    }

    private ipf deN() {
        this.mkT = new ist(isf.mwN, 12, 14528036);
        return this.mkT;
    }

    private ipf deO() {
        ipx ipx2 = new ipx(this, iqo.dmS()){
            final /* synthetic */ imw mkV;
            {
                this.mkV = imw2;
                super(iqz2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tnc.bD(new Object[0]).exA().toUpperCase());
            }
        };
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/runtime/buttons/icons/map/menubar/banks.png")));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(this.deP()));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/icons/currency_gold.png")));
        return ipx2;
    }

    private ipf deP() {
        this.mkU = new ist(isf.mwN, 12, 14528036);
        return this.mkU;
    }

    private void dac() {
        this.deQ();
        this.deR();
        this.M(0, 0.0f);
        this.deS();
        this.deT();
    }

    private void deQ() {
        float f = this.mkM.dem().ddl();
        String string = jny.dC(f) + " Kg";
        if (this.mkM.dem().ddi()) {
            float f2 = this.mkM.dem().aum();
            String string2 = jny.dC(f2) + " Kg";
            String string3 = string + "/" + string2;
            this.mkO.setText(string3);
            if (f <= f2) {
                this.mkN.qP("/dfdata/texture/gui/j2f/inventory/main/information_view/scales.png");
                this.mkO.Rk(0xABABAB);
            } else {
                this.mkN.qP("/dfdata/texture/gui/j2f/inventory/main/information_view/scales_over.png");
                this.mkO.Rk(9055276);
            }
        } else {
            this.mkO.setText(string);
        }
    }

    private void deR() {
        int n = this.mkM.der().ddK();
        int n2 = this.mkM.der().ddL();
        String string = "" + n;
        String string2 = "" + n2;
        this.mkQ.setText(string + "/" + string2);
        if (n < n2) {
            this.mkP.qP("/dfdata/texture/gui/j2f/inventory/main/information_view/capacity.png");
            this.mkQ.Rk(0xABABAB);
        } else {
            this.mkP.qP("/dfdata/texture/gui/j2f/inventory/main/information_view/capacity_full.png");
            this.mkQ.Rk(9055276);
        }
    }

    private void M(int n, float f) {
        if (n > 0) {
            this.mkR.setVisible(true);
            this.mkS.setText(n + "/" + jny.dC(f) + " Kg");
        } else {
            this.mkR.setVisible(false);
        }
    }

    private void deS() {
        if (this.mkT != null) {
            StringBuilder stringBuilder = new StringBuilder().append("");
            this.djE();
            this.mkT.setText(stringBuilder.append(jny.dB(ioa.cxP().cyZ().cAz())).toString());
        }
    }

    private void deT() {
        if (this.mkU != null) {
            StringBuilder stringBuilder = new StringBuilder().append("");
            this.djE();
            this.mkU.setText(stringBuilder.append(jny.dB(ioa.cxP().cyZ().cAA())).toString());
        }
    }

    private void deU() {
        this.dac();
    }

    private void b(ilq ilq2, ilx ilx2) {
        this.dac();
    }

    private void c(ilq ilq2, ilx ilx2) {
        this.dac();
    }

    private float bv(List<iua> list) {
        float f = 0.0f;
        for (iua iua2 : list) {
            if (!(iua2 instanceof ims)) continue;
            ims ims2 = (ims)((Object)iua2);
            f += ims2.dey().ddl();
        }
        return f;
    }

    static /* synthetic */ void a(imw imw2) {
        imw2.deU();
    }

    static /* synthetic */ void a(imw imw2, ilq ilq2, ilx ilx2) {
        imw2.b(ilq2, ilx2);
    }

    static /* synthetic */ void b(imw imw2, ilq ilq2, ilx ilx2) {
        imw2.c(ilq2, ilx2);
    }

    static /* synthetic */ imr b(imw imw2) {
        return imw2.mkM;
    }
}

