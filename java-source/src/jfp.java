/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class jfp
extends ipx {
    private jep mVu;
    private jeq mVv;
    private ipf mXP;
    private ipf mXQ;
    private ist mXR;
    private ist mXS;
    private ist mXT;
    private ipb lUK;
    private ipb mXU;

    public jfp(jep jep2, jeq jeq2) {
        this.mVu = jep2;
        this.mVv = jeq2;
        this.a(irl.dnr());
        this.W(ipx.a(156, 67, new ipf[0]));
        this.W(ipx.d(this.dBy()));
        this.W(this.dBz());
        this.W(ipx.d(this.dBC()));
        this.W(this.dBD());
        jen.dzL().mUP.c((jlf<jeo>)new jlr<jfp, jeo>(this, this){
            final /* synthetic */ jfp mXV;
            {
                this.mXV = jfp2;
                super(jfp3);
            }

            public void a(jfp jfp2, jeo jeo2) {
                if (jeo2.dzO() == jfp.a(this.mXV) && jeo2.dzP() == jfp.b(this.mXV)) {
                    this.mXV.aTg();
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((jfp)object, (jeo)object2);
            }
        });
        this.aTg();
    }

    public jep dzO() {
        return this.mVu;
    }

    public jeq dzP() {
        return this.mVv;
    }

    public jer dzQ() {
        return jen.dzL().dzM().dzC().b(this.mVu, this.mVv).dzQ();
    }

    public boolean dzR() {
        return jen.dzL().dzM().dzC().b(this.mVu, this.mVv).dzR();
    }

    public void aTg() {
        switch (this.dzQ()) {
            case mVK: {
                this.rF(false);
                this.mXP.setVisible(false);
                this.mXR.Rk(0x434343);
                this.mXS.Rk(0x434343);
                this.mXQ.setVisible(true);
                this.mXU.setVisible(true);
                this.lUK.setVisible(false);
                this.mXT.setVisible(false);
                break;
            }
            case mVL: {
                this.rF(true);
                this.mXP.setVisible(false);
                this.mXR.Rk(this.dkb() ? 0xABABAB : 0x4F4F4F);
                this.mXS.Rk(this.dkb() ? 0xABABAB : 0x4F4F4F);
                this.mXQ.setVisible(false);
                this.mXU.setVisible(false);
                this.lUK.setVisible(true);
                this.mXT.setVisible(false);
                break;
            }
            case mVM: {
                this.rF(true);
                this.mXP.setVisible(false);
                this.mXR.Rk(this.dkb() ? 0xCFCFCF : 0xABABAB);
                this.mXS.Rk(this.dkb() ? 0xCFCFCF : 0xABABAB);
                this.mXQ.setVisible(false);
                this.mXU.setVisible(false);
                this.lUK.setVisible(false);
                this.mXT.setVisible(true);
                this.mXT.Rk(12357465);
                break;
            }
            case mVN: {
                this.rF(true);
                this.mXP.setVisible(true);
                this.mXR.Rk(this.dkb() ? 0xCFCFCF : 12357465);
                this.mXS.Rk(this.dkb() ? 0xC0C0C0 : 12357465);
                this.mXQ.setVisible(false);
                this.mXU.setVisible(false);
                this.lUK.setVisible(false);
                this.mXT.setVisible(true);
                this.mXT.Rk(0x828282);
            }
        }
    }

    @Override
    public void cND() {
        this.aTg();
    }

    @Override
    public boolean du(int n, int n2) {
        if (super.du(n, n2)) {
            return true;
        }
        switch (this.dzQ()) {
            case mVL: {
                this.dBI();
                break;
            }
            case mVM: {
                jen.dzL().dzM().dzC().b(this.mVu, this.mVv).a(jer.mVN);
                this.djE();
                ioa.cxP().czx().czH();
                break;
            }
            case mVN: {
                jen.dzL().dzM().dzC().b(this.mVu, this.mVv).a(jer.mVM);
            }
        }
        return true;
    }

    @Override
    public boolean dK(int n, int n2) {
        super.dK(n, n2);
        this.djE();
        ioa.cxP().czx().czK();
        return true;
    }

    @Override
    public hyn dd(int n, int n2) {
        switch (this.dzQ()) {
            case mVK: {
                return this.mVv.ordinal() > 0 ? iae.oJ(lxx.tAq.bD(new Object[0]).exA()) : iae.oJ(lxx.tAr.bD(new Object[0]).exA());
            }
            case mVL: {
                return iae.oJ(lxx.tAs.bD(new Object[0]).exA());
            }
            case mVM: {
                break;
            }
        }
        return null;
    }

    private ipf dBy() {
        this.mXP = new ipb("bg_selected_booster");
        this.mXP.setVisible(false);
        return this.mXP;
    }

    private ipf dBz() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 24, new ipf[0]));
        ipx2.W(ipx.d(this.dBA()));
        ipx2.W(ipx.d(this.dBB()));
        this.dBH();
        return ipx2;
    }

    private ipf dBA() {
        this.mXR = ist.a(isf.mwN, 13, 0x4F4F4F);
        return this.mXR;
    }

    private ipf dBB() {
        this.mXS = ist.a(isf.mwN, 13, 0x4F4F4F);
        return this.mXS;
    }

    private ipf dBC() {
        this.mXQ = new ipb("bg_locked_booster");
        return this.mXQ;
    }

    private ipf dBD() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(this.dBE()));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf dBE() {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(ipx.d(this.dBF()));
        ipx2.W(ipx.d(this.cVP()));
        ipx2.W(ipx.d(this.dBG()));
        return ipx2;
    }

    private ipf dBF() {
        this.mXT = ist.a(isf.mwO, 18, 12357465, this.mVv.aNA());
        this.mXT.rg(false);
        return this.mXT;
    }

    private ipf cVP() {
        this.lUK = new ipb("icon_prowess_01");
        this.lUK.rg(false);
        return this.lUK;
    }

    private ipf dBG() {
        this.mXU = new ipb("icon_locked_01");
        this.mXU.rg(false);
        return this.mXU;
    }

    private void dBH() {
        List<String> list = jen.dzL().dzM().dzC().b(this.mVu, this.mVv).dzS();
        if (list.size() >= 1) {
            this.mXR.setText(list.get(0));
        }
        if (list.size() >= 2) {
            this.mXS.setText(list.get(1));
        }
    }

    private void dBI() {
        ioc ioc2 = this.eo(0, 0);
        jfq jfq2 = new jfq(this, this.djE(), new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()), jen.dzL().dzM().dzC().b(this.dzO(), this.dzP())){
            final /* synthetic */ jfp mXV;
            {
                this.mXV = jfp2;
                super(ioa2, joa2, jeo2);
            }

            public void cNl() {
                this.mXV.djE();
                ioa.cyJ().cIN().a(this.mXV.dzO(), this.mXV.dzP());
                this.mXV.djE();
                ioa.cxP().czx().czG();
            }
        };
        jfq2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)jfq2));
    }

    static /* synthetic */ jep a(jfp jfp2) {
        return jfp2.mVu;
    }

    static /* synthetic */ jeq b(jfp jfp2) {
        return jfp2.mVv;
    }
}

