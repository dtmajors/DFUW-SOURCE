/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hyn
 */
import java.util.HashMap;

public class jiz
extends jjc
implements hvu,
hvx,
hwf {
    private jix nhK;
    private HashMap<hwm, jix.c> nhL = new HashMap();
    private HashMap<Integer, jix.a> nhM = new HashMap();
    private ieq nhN;
    private jiy nhO;

    public jiz() {
        super("VendorBuyWindow", "VendorBuyWindow.swf");
        this.OQ(jnz.nGi);
        this.a(hyb.lmC);
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hvu)this);
        hso.cxK().cxP().cyZ().a((hvx)this);
        hso.cxK().cxP().cyZ().a((hwf)this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        hso.cxK().cxP().cyZ().b((hvu)this);
        hso.cxK().cxP().cyZ().b((hvx)this);
    }

    public void open() {
        if (this.dHZ() == null) {
            return;
        }
        flr flr2 = (flr)this.MessageDelegator.h(7944, this.GUID, this.dHZ().dAu);
        this.MessageDelegator.F(flr2);
        this.show();
    }

    public void close() {
        this.hide();
    }

    public void show() {
        this.setVisible(true);
        jiz.cyJ().cHx().a(hyy.b.luQ, 1);
        jiz.cyJ().updateLayout();
        jiz.cyJ().cHw().a(hyc.lmI, true);
        this.cqF();
    }

    public void hide() {
        this.setVisible(false);
    }

    @Override
    public boolean b(hyy.b b2) {
        switch (b2) {
            case luW: {
                return this.dHW() != null || this.dHX() != null || this.dHY() != null;
            }
            case luS: {
                return this.dHW() != null;
            }
            case luT: {
                return this.dHX() != null;
            }
            case luU: {
                return this.dHY() != null;
            }
        }
        return super.b(b2);
    }

    public void dHR() {
        this.show();
        jix.c c2 = this.dHW();
        this.c(c2);
        jiz.cyJ().cHx().a(hyy.b.luQ, 1);
    }

    public void dHS() {
        this.show();
        jix.c c2 = this.dHX();
        this.c(c2);
        jiz.cyJ().cHx().a(hyy.b.luQ, 1);
    }

    public void dHT() {
        this.show();
        jix.c c2 = this.dHY();
        this.c(c2);
        jiz.cyJ().cHx().a(hyy.b.luQ, 1);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7945: {
                this.c((fls)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void a(bsh bsh2, hxd hxd2) {
        this.d(bsh2, hxd2);
    }

    @Override
    public void b(bsh bsh2, hxd hxd2) {
        this.d(bsh2, hxd2);
    }

    @Override
    public void c(bsh bsh2, hxd hxd2) {
        this.d(bsh2, hxd2);
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        if (ej2.getType() == 11872) {
            this.dHV();
        }
    }

    public void dHU() {
        if (this.nhN == null) {
            return;
        }
        jix.c c2 = this.nhL.get(this.nhN.cQm());
        assert (c2 != null);
        assert (c2 instanceof jix.f);
        jix.f f2 = (jix.f)c2;
        this.c(f2.dHP(), 1);
        this.nhN = null;
    }

    @Override
    public void b(brt brt2, int n) {
        this.cFo();
        if (brt2 != null) {
            this.c(brt2, n);
        }
    }

    public hyn f(int n, int n2, String string) {
        return null;
    }

    @Override
    public void ck(cxc cxc2) {
    }

    @Override
    public void cl(cxc cxc2) {
    }

    @Override
    public void a(cxc cxc2, float f2, double d2) {
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
    }

    @Override
    public void cf(cxc cxc2) {
        if (this.nhK == null) {
            return;
        }
        this.nhK.pb(cxc2.zg());
        this.dHV();
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        ieq ieq2 = (ieq)this.lOq.get(hwl2.cck);
        if (ieq2 == null) {
            return null;
        }
        hwm hwm2 = ieq2.cQm();
        if (hwm2 == null) {
            return null;
        }
        hwk hwk2 = new hwk(string);
        n = (int)((double)n - hwk2.getX());
        n2 = (int)((double)n2 - hwk2.getY() + 16.0);
        if (hwm2 instanceof hwo) {
            iac iac2 = new iac((hwo)hwm2, n, n2, true, true, false);
            return iac2.cKb() ? iac2 : null;
        }
        if (hwm2 instanceof hwv) {
            return new iag(((hwv)hwm2).zg(), n, n2, false);
        }
        return null;
    }

    public void activate() {
        this.b(hyy.b.luQ, 1);
    }

    @Override
    protected void Qh(int n) {
        super.Qh(n);
        this.nhM.remove(n);
    }

    @Override
    protected void Qi(int n) {
        this.cQo();
        jix.a a2 = this.nhM.get(n);
        this.b(a2.dHK());
    }

    @Override
    protected void c(ieq ieq2) {
        jix.c c2 = this.nhL.get(ieq2.cQm());
        assert (c2 != null);
        if (c2 instanceof jix.a) {
            jix.a a2 = (jix.a)c2;
            this.a(a2);
        } else if (c2 instanceof jix.f) {
            jix.f f2 = (jix.f)c2;
            this.c(f2.dHP(), 1);
        } else if (c2 instanceof jix.h) {
            jix.h h2 = (jix.h)c2;
            this.c(h2.dHQ());
        }
    }

    @Override
    protected boolean og(String string) {
        hwl hwl2 = new hwl(string);
        ieq ieq2 = (ieq)this.lOq.get(hwl2.cck);
        if (ieq2 == null || !ieq2.cQk()) {
            return false;
        }
        jix.c c2 = this.nhL.get(ieq2.cQm());
        if (c2 == null) {
            return false;
        }
        if (c2 instanceof jix.a) {
            return false;
        }
        if (c2 instanceof jix.h) {
            return false;
        }
        if (ieq2.cBj().state == hxw.llw.ordinal()) {
            return false;
        }
        this.nhN = ieq2;
        return true;
    }

    protected void k(int n, int n2, String string) {
        hwl hwl2 = new hwl(string);
        ieq ieq2 = (ieq)this.lOq.get(hwl2.cck);
        if (ieq2 == null || !ieq2.cQk()) {
            return;
        }
        jix.c c2 = this.nhL.get(ieq2.cQm());
        if (c2 == null) {
            return;
        }
        if (c2 instanceof jix.a) {
            return;
        }
        if (c2 instanceof jix.h) {
            return;
        }
        jix.f f2 = (jix.f)c2;
        if (ieq2.cBj().state == hxw.llw.ordinal()) {
            return;
        }
        jiz.cxP().czh();
        int n3 = hso.cxK().cxP().cyZ().cAz() / (int)f2.dHP().Bb();
        this.nhO = new jiy(this, f2.dHP(), n3);
        this.nhO.setGUID(hso.cxK().cxO().getMessageDelegator().bzv());
        hso.cxK().cxO().getMessageDelegator().a((amf)((Object)this.nhO));
        this.a(hwl2.cck, new hze(this){
            final /* synthetic */ jiz nhP;
            {
                this.nhP = jiz2;
            }

            public void c(joa joa2) {
                joa joa3 = 1.a(joa2, jiz.a(this.nhP).cEI(), 3, 2);
                jiz.a(this.nhP).de((int)joa3.X, (int)joa3.Y);
            }

            public void close() {
                jiz.a(this.nhP).close();
                hso.cxK().cxO().getMessageDelegator().hd(jiz.a(this.nhP).getGUID());
            }
        });
    }

    @Override
    protected void clearState() {
        super.clearState();
        this.nhM.clear();
    }

    private void c(fls fls2) {
        this.nhL.clear();
        this.clearState();
        this.nhK = new jix();
        for (bsf bsf2 : fls2.iPx.values()) {
            this.nhK.d(bsf2);
        }
        this.nhK.dHJ();
        this.nhK.sort();
        jix.a a2 = this.nhK.dHI();
        for (int j = 0; j < a2.dHK().getLength(); ++j) {
            jix.c c2 = a2.dHK().UQ(j);
            c2.a(this.nhL);
        }
        this.b(a2);
        this.b(a2.dHK());
    }

    private void b(jix.d d2) {
        for (int j = 0; j < d2.getLength(); ++j) {
            jix.c c2 = d2.UQ(j);
            this.a(new ieq(this, c2.cQm()), j);
        }
    }

    private void dHV() {
        this.cQo();
        jix.a a2 = this.nhM.get(this.lOs);
        if (a2 == null) {
            return;
        }
        this.b(a2.dHK());
    }

    private void d(bsh bsh2, hxd hxd2) {
        if (bsh2.az() == cug.fkb && hxd2.cCN() == bqm.b.dEn) {
            this.dHV();
        }
    }

    private void c(brt brt2, int n) {
        if (jiz.cxP().czx() != null) {
            jiz.cxP().czx().czE();
        }
        if (n <= 0) {
            return;
        }
        fky fky2 = (fky)this.MessageDelegator.h(11781, this.GUID, this.dHZ().iOk);
        fky2.cZn = 3;
        fky2.dxt = hso.cxK().bAn().gZb;
        fky2.aCK = brt2.getGUID();
        fky2.aRX = brt2.az();
        fky2.iPh = n;
        fky2.iPi = brt2.Bb();
        this.MessageDelegator.F(fky2);
    }

    private void c(bsc bsc2) {
        if (jiz.cxP().czx() != null) {
            jiz.cxP().czx().czE();
        }
        fky fky2 = (fky)this.MessageDelegator.h(11781, this.GUID, this.dHZ().iOm);
        fky2.cZn = 3;
        fky2.dxt = hso.cxK().bAn().gZb;
        fky2.YN = hso.cxK().bAn().gYY;
        fky2.aCK = bsc2.getGUID();
        fky2.aRX = bsc2.zg();
        fky2.iPh = 1;
        fky2.iPi = bsc2.Bb();
        this.MessageDelegator.F(fky2);
    }

    private void a(jix.a a2) {
        this.cQo();
        this.b(a2);
        this.b(a2.dHK());
    }

    private void b(jix.a a2) {
        this.nhM.put(this.pY(a2.getText()), a2);
    }

    private void c(jix.a a2) {
        if (a2 == null) {
            return;
        }
        this.c(a2.dHN());
        this.b(a2);
    }

    private void c(jix.c c2) {
        if (c2 == null || !(c2 instanceof jix.a)) {
            return;
        }
        jix.a a2 = (jix.a)c2;
        this.clearState();
        this.c(a2.dHN());
        this.a(a2);
    }

    private jix.c dHW() {
        return this.nhK == null ? null : this.nhK.UM(cug.fiL);
    }

    private jix.c dHX() {
        return this.nhK == null ? null : this.nhK.UM(lea.enW().zx("r_Consumables").getType());
    }

    private jix.c dHY() {
        return this.nhK == null ? null : this.nhK.UM(cug.fjl);
    }

    @Override
    public void i(cxc cxc2, int n) {
    }

    static /* synthetic */ jiy a(jiz jiz2) {
        return jiz2.nhO;
    }
}

