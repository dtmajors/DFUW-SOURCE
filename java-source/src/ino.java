/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  lcw
 */
import java.util.ArrayList;

public class ino
extends ize
implements ims {
    private ilq mmN;
    private imu mmt;
    private imv mmu;

    public ino(ilq ilq2) {
        this.mmN = ilq2;
        String string = ilq2.cCU();
        if (string != null) {
            this.dss().qP(string);
        }
        this.drd().o(ilq2.ddF());
        this.mmt = new imu(ilq2);
        this.mmu = new imv(this);
        this.SX(16);
        this.am(new ipk(0));
    }

    public ilq dhf() {
        return this.mmN;
    }

    @Override
    public itb dgM() {
        return new ita(isr.eN(0, lcw.emW() ? 12 : 24), 0, false);
    }

    @Override
    public boolean dez() {
        return this.mmN.ddH() ? super.dez() : false;
    }

    @Override
    public joa deA() {
        ioc ioc2 = this.eo(0, 0);
        return new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight());
    }

    @Override
    public void qB(String string) {
        super.qB(string);
        this.mmN.w(string);
    }

    @Override
    public boolean dx(int n, int n2) {
        return this.mmN instanceof ilq;
    }

    @Override
    public ifg dy(int n, int n2) {
        if (this.mmN instanceof imb) {
            hwo hwo2 = new hwo(this.mmN.cBu());
            return new ifh(hwo2, -32, -32);
        }
        return null;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        return this.mmu.a(n, n2, hzk2, ifg2);
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        return this.mmu.d(n, n2, hzk2, ifg2);
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        return this.mmu.b(n, n2, hzk2, ifg2);
    }

    @Override
    public boolean e(ifg ifg2) {
        return this.mmt.e(ifg2);
    }

    @Override
    public boolean f(ifg ifg2) {
        return this.mmt.f(ifg2);
    }

    @Override
    public void d(ArrayList<hyj> arrayList) {
        super.d(arrayList);
        ilm.a(this, arrayList);
    }

    @Override
    public hyn dd(int n, int n2) {
        if (this.mmN.ddQ()) {
            hwo hwo2 = new hwo(this.mmN.cBu());
            this.djE();
            int n3 = ioa.cxP().bpb();
            this.djE();
            iac iac2 = new iac(hwo2, n3, ioa.cxP().bpc(), false, true, true);
            return iac2.cKb() ? iac2 : null;
        }
        return super.dd(n, n2);
    }

    @Override
    public /* synthetic */ ilx dey() {
        return this.dhf();
    }
}

