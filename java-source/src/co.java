/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
import java.util.Map;

public class co
extends btk {
    private Map<Integer, cj> iH = lcn.emw();

    @Override
    public void initialize() {
        this.Initialized = true;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            default: 
        }
        super.receiveMessage(dxq2);
    }

    public void a(cj cj2) {
        if (cj2 == null) {
            assert (false);
            return;
        }
        ha ha2 = cj2.aQ();
        assert (ha2 != null) : "PSO is null!";
        ghu ghu2 = (ghu)this.MessageDelegator.h(7683, this.GUID, lcr.hac);
        ghu2.qn(cj2.aO());
        ghu2.g(cj2.aP());
        ghu2.mb(true);
        ghu2.oH(ha2.getGUID());
        ghu2.YY = ha2.js();
        ghu2.cWz = ha2.jt();
        ghu2.jbc = ha2.iP();
        ghu2.jbd = ha2.iR();
        this.MessageDelegator.F(ghu2);
    }

    public void a(cj cj2, int n, String string, ldv ldv2, int n2) {
        cj2.f(ldv2);
        cj2.v(n);
        cj2.G(string);
        ldv ldv3 = null;
        if (n2 == -1) {
            assert (false);
            return;
        }
        ldv3 = ldx.enG().aci(n2).Wk(50);
        cj2.g(ldv3);
        this.iH.put(ldv3.enw(), cj2);
        ldv ldv4 = lcr.fO((int)0, (int)ldv3.enw());
        cj2.aQ().setGUID(ldv4);
        cj2.aQ().jR().aCL.SN = ldv4.enw();
        if (!cj2.isValid()) {
            assert (false);
            return;
        }
    }

    public cj c(int n, boolean bl) {
        if (bl) {
            return this.iH.remove(n);
        }
        return this.iH.get(n);
    }
}

