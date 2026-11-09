/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  jsr
 *  lcw
 */
import java.util.List;

public class jsa
extends kdw {
    private dxs cdj = new dxs();
    private jsr nUU = null;
    private kfg nUV = null;
    private kfl nUW = null;
    private kfp nUX = null;
    private kff nUY = null;
    private boolean fE = true;
    private boolean nUZ = false;

    public jsr dRY() {
        return this.nUU;
    }

    @Override
    protected void Y() {
        this.phR = new kdz();
        this.phR.setVersion(0, 1);
        this.phR.setName(this.getClass().getName());
        this.phR.Wx(1);
        this.phR.fJ(1, 14);
        this.phR.fJ(1, 7);
        this.phR.fJ(1, 27);
        this.phR.fJ(1, 30);
        this.phR.fJ(1, 12);
    }

    public void a(List list, int n) {
        this.phS.addAll(list);
        this.phR.setLevel(n);
        this.nUU = new jsr();
        this.nUU.a(this);
        this.nUU.initialize();
    }

    @Override
    public void e(ldz ldz2) {
        if (this.fE) {
            if (lcw.qHF == 3) {
                this.dRZ();
            }
            this.fE = false;
        }
        this.nUU.doTick(ldz2);
    }

    public void tw(String string) {
        this.dRZ();
        this.nUU.tw(string);
    }

    public void dRZ() {
        if (this.nUZ) {
            return;
        }
        if (!lcw.qGK) {
            return;
        }
        if (lcw.qHF == 15 || lcw.qHF == 12) {
            return;
        }
        try {
            Object object;
            jwm jwm2 = new jwm();
            jwm2.dUo();
            if (!lcw.qHf) {
                object = new bsu();
                this.t((amf)object);
            }
            object = new jya();
            ((jya)object).dTX();
            mws mws2 = new mws();
            mws2.eSt();
        }
        catch (bo bo2) {
            return;
        }
        this.nUZ = true;
    }

    @Override
    public int a(lef lef2, lef lef3) {
        return this.nUU.a(lef2, lef3);
    }

    @Override
    public void a(kee kee2, int n) {
        if (kee2.dVG() == 30 && !kee2.dVI().equals(kea.piA)) {
            this.nUU.a(kee2);
        }
        if (kee2.dVG() == 30 && kee2.dVI().equals(kea.piA)) {
            this.nUU.b(kee2);
        }
        if (kee2.dVG() == 7 && kee2.dVI().equals(kea.piA)) {
            this.nUV = (kfg)kee2;
        }
        if (kee2.dVG() == 27 && kee2.dVI().equals(kea.piA)) {
            this.nUX = (kfp)kee2;
        }
        if (kee2.dVG() == 12 && kee2.dVI().equals(kea.piA)) {
            this.nUW = (kfl)kee2;
        }
        if (kee2.dVG() == 14 && kee2.dVI().equals(kea.piA)) {
            this.nUY = (kff)kee2;
        }
        super.a(kee2, n);
    }

    public void a(dxq dxq2) {
        if (this.nUW != null) {
            this.nUW.p(dxq2);
        }
    }

    public void t(amf amf2) {
        this.nUV.p(amf2);
    }

    public void f(dta dta2) {
        this.nUX.p(dta2);
    }

    public dxq d(int n) {
        return this.cdj.CW(n);
    }

    public void tx(String string) {
        if (this.nUY != null) {
            gqn gqn2 = (gqn)this.d(11020);
            gqn2.lf(this.phR.getName());
            gqn2.lg(string);
            this.nUY.a(gqn2);
        }
    }

    public cuh dSa() {
        return this.nUU.dSa();
    }

    public ldv lL(ldv ldv2) {
        return ldx.enG().aci(ldv2.enw()).lL(ldv2);
    }

    public void lK(ldv ldv2) {
        ldx.enG().aci(ldv2.enw()).lK(ldv2);
    }
}

