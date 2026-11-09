/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class dnc
extends dnb {
    private Set<String> gJC = lcn.emx();
    private Map<ldv, dnd> gJD = lcn.emw();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25601: {
                this.a((gwp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gwp gwp2) {
        gwq gwq2 = (gwq)this.MessageDelegator.h(25602, this.getGUID(), gwp2.aO());
        this.MessageDelegator.b(gwp2, gwq2);
        assert (gwp2.gJx != null);
        if (gwp2.gJx == null) {
            gwq2.eo = false;
            this.MessageDelegator.F(gwq2);
            return;
        }
        jxq jxq2 = new jxq();
        dna dna2 = jxq2.vt(gwp2.gJx);
        if (dna2 == null) {
            assert (false);
            gwq2.eo = false;
            this.MessageDelegator.F(gwq2);
            return;
        }
        if (this.gJC.contains(dna2.bqX())) {
            assert (false);
            gwq2.eo = false;
            this.MessageDelegator.F(gwq2);
            return;
        }
        ldv ldv2 = this.MessageDelegator.bzv();
        gwq2.eo = true;
        this.MessageDelegator.F(gwq2);
        dnd dnd2 = new dnd();
        dnd2.setGUID(ldv2);
        this.gJD.put(ldv2, dnd2);
        this.MessageDelegator.a(dnd2);
        dnd2.a(dna2);
    }
}

