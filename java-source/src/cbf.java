/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbj
 *  lcr
 */
import java.util.Map;

public class cbf
extends btk {
    public static final int eiC = 10;
    private Map<Integer, fwo> eiD = lcn.emw();
    private int Qs = 1;

    public void a(cbc cbc2) {
        this.MessageDelegator.hd(cbc2.getGUID());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17921: {
                this.a((fwo)dxq2);
                break;
            }
            case 18946: {
                this.a((for)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(for for_) {
        if (for_.aqs == -1) {
            return;
        }
        if (for_.afn == null) {
            return;
        }
        assert (for_.afn.Type == 3);
        fwo fwo2 = this.eiD.remove(for_.aqs);
        if (fwo2 == null) {
            return;
        }
        this.a(for_.afn, fwo2);
    }

    private void a(fwo fwo2) {
        int n = this.Qs++;
        this.eiD.put(n, fwo2);
        foq foq2 = (foq)this.MessageDelegator.h(18945, this.GUID, lcr.qAZ);
        foq2.aqs = n;
        foq2.afj = 3;
        this.MessageDelegator.F(foq2);
    }

    private void a(gj gj2, fwo fwo2) {
        assert (gj2 != null);
        assert (fwo2 != null);
        cbg cbg2 = new cbg();
        cbg2.bk(this.MessageDelegator.arc().rgz);
        cbg2.gx(fwo2.aO());
        cbg2.g(fwo2.hC);
        cbg2.kh(fwo2.eiE);
        cbg2.setAlignment(fwo2.Qw);
        cbg2.jX(fwo2.cCF);
        cbg2.jY(fwo2.iZn);
        cbg2.aM(fwo2.YU);
        cbg2.aP(true);
        cbg2.fj(fwo2.aYc);
        cbg2.aN(fwo2.YV);
        cbg2.RB = fwo2.RB;
        cbj cbj2 = new cbj(this, cbg2);
        cbj2.setGUID(this.MessageDelegator.bzv());
        cbj2.oy(10);
        cbj2.f(gj2);
        this.MessageDelegator.a((amf)cbj2);
        fwp fwp2 = (fwp)this.MessageDelegator.h(17922, this.getGUID(), fwo2.aO());
        this.MessageDelegator.b(fwo2, fwp2);
        fwp2.iZu = 0;
        fwp2.cRI = cbj2.getGUID();
        this.MessageDelegator.E(fwp2);
        fxo fxo2 = (fxo)this.MessageDelegator.h(17930, this.getGUID(), fwo2.aO());
        fxo2.cRI = cbj2.getGUID();
        fxo2.aYb = true;
        fxo2.Yq = 10;
        fxo2.Yp = 1;
        this.MessageDelegator.F(fxo2);
    }
}

