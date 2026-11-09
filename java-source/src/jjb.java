/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  iet
 */
import java.util.HashMap;
import java.util.Map;

public class jjb
extends jjc
implements hxe {
    private hxd nhS;
    private HashMap<ldv, hxd> nhT = new HashMap();
    private Map<ldv, Integer> nhU = lcn.emw();

    public jjb() {
        super("VendorSellWindow", "VendorSellWindow.swf");
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public void open() {
        if (this.nhS != null) {
            return;
        }
        this.nhS = hso.cxK().cxP().cza().aj(hso.cxK().bAn().gZb, this.dHZ().dxF);
        this.nhS.a(this);
        this.kQ(0.0f);
        this.pY(lyz.trE.bD(new Object[0]).exA());
        this.show();
    }

    public void close() {
        if (this.nhS == null) {
            return;
        }
        this.nhS.b(this);
        hso.cxK().cxP().cza().b(this.nhS);
        this.nhS = null;
        this.hide();
        this.clearState();
    }

    public void show() {
        if (this.nhS == null) {
            this.open();
        }
        this.setVisible(true);
        jjb.cyJ().cHx().a(hyy.b.luR, 1);
        jjb.cyJ().updateLayout();
        jjb.cyJ().cHw().a(hyc.lmI, true);
        this.cqF();
    }

    public void hide() {
        this.setVisible(false);
    }

    @Override
    public void B(bsh bsh2) {
        hws hws2 = new hws(bsh2);
        ieq ieq2 = new ieq(this, hws2);
        int n = this.lOp.size();
        Integer n2 = this.nhU.get(bsh2.getGUID());
        if (n2 != null) {
            n = n2;
            this.nhU.remove(bsh2.getGUID());
        }
        this.a(ieq2, n);
        this.dIb();
    }

    @Override
    public void C(bsh bsh2) {
        int n = this.E(bsh2);
        if (n == -1) {
            return;
        }
        this.Qg(n);
        this.nhT.remove(bsh2.getGUID());
        this.dIb();
    }

    @Override
    public void D(bsh bsh2) {
        int n = this.E(bsh2);
        if (n == -1) {
            return;
        }
        ieq ieq2 = (ieq)this.lOp.get(n);
        hwo hwo2 = (hwo)ieq2.cQm();
        hwo2.y(bsh2);
        this.a(ieq2);
        this.dIb();
    }

    public void c(hxd hxd2, bsh bsh2) {
        this.nhT.put(bsh2.getGUID(), hxd2);
        hxd2.a(bsh2.getGUID(), this.nhS, false);
    }

    public hxd cBs() {
        return this.nhS;
    }

    public void activate() {
        this.b(hyy.b.luR, 1);
    }

    @Override
    protected void cBa() {
        super.cBa();
        jjb.cyJ().cHO().cQn();
    }

    @Override
    public boolean a(hzk hzk2, ifg ifg2, String string) {
        this.cqF();
        ifg2.cqF();
        if (!(hzk2 instanceof iet)) {
            return false;
        }
        if (!(ifg2 instanceof ifh)) {
            return false;
        }
        ifh ifh2 = (ifh)ifg2;
        hwm hwm2 = ifh2.cQm();
        if (!(hwm2 instanceof hwo)) {
            return false;
        }
        hwo hwo2 = (hwo)hwm2;
        return cug.us((int)hwo2.cBu().az());
    }

    @Override
    public boolean b(hzk hzk2, ifg ifg2, String string) {
        this.cqF();
        ifg2.cqF();
        if (!(hzk2 instanceof iet)) {
            return false;
        }
        if (!(ifg2 instanceof ifh)) {
            return false;
        }
        ifh ifh2 = (ifh)ifg2;
        hwm hwm2 = ifh2.cQm();
        if (!(hwm2 instanceof hwo)) {
            return false;
        }
        hwo hwo2 = (hwo)hwm2;
        if (!cug.us((int)hwo2.cBu().az())) {
            return false;
        }
        hxd hxd2 = ((iet)hzk2).cBs();
        int n = this.lOp.size();
        hwl hwl2 = new hwl(string);
        if (hwl2.cck != -1) {
            ieq ieq2 = (ieq)this.lOq.get(hwl2.cck);
            n = this.lOp.indexOf(ieq2);
            if (hwl2.cf > 0) {
                ++n;
            }
        }
        this.nhU.put(hwo2.cBu().getGUID(), n);
        this.c(hxd2, hwo2.cBu());
        return true;
    }

    private void kQ(float f2) {
        this.a("setPrice", new Object[]{jny.dB(f2)});
    }

    private void dIb() {
        float f2 = 0.0f;
        for (bsh bsh2 : this.nhS.cCO().values()) {
            f2 += bsh2.Bb();
        }
        this.kQ(f2);
    }

    @llk
    private void _executeTransaction() {
        if (jjb.cxP().czx() != null) {
            jjb.cxP().czx().czF();
        }
        fky fky2 = (fky)this.MessageDelegator.h(11781, this.GUID, this.dHZ().iOj);
        fky2.YN = hso.cxK().bAn().gYY;
        fky2.dxt = hso.cxK().bAn().gZb;
        this.MessageDelegator.F(fky2);
    }
}

