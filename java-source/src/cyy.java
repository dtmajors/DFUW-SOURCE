/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;

public class cyy
extends btk {
    private final cyv fYe;
    private List<cyj> fZk = lcn.abH(2);

    public cyy(cyv cyv2) {
        this.fYe = cyv2;
    }

    public void a(cyk cyk2, ldv ldv2) {
        if (cyk2 == null) {
            return;
        }
        if (cyk2.Do() == null) {
            return;
        }
        if (ldv2 == null) {
            return;
        }
        cyj cyj2 = this.mm(ldv2);
        if (cyj2 != null) {
            return;
        }
        cyj2 = new cyj();
        cyj2.fYd = cyk2;
        cyj2.fzI = ldv2;
        this.fZk.add(cyj2);
        this.b(cyj2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 514: {
                this.a((ghj)dxq2);
                break;
            }
            case 516: {
                this.a((ghs)dxq2);
                break;
            }
            case 517: {
                this.a((ght)dxq2);
                break;
            }
            case 519: {
                this.a((ghp)dxq2);
                break;
            }
            case 520: {
                this.a((ghq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void b(cyk cyk2, ldv ldv2) {
        if (cyk2 == null) {
            return;
        }
        if (ldv2 == null) {
            return;
        }
        cyj cyj2 = this.mm(ldv2);
        if (cyj2 == null) {
            return;
        }
        if (cyj2.Ud != null) {
            this.c(cyj2);
        }
    }

    private cyj mm(ldv ldv2) {
        assert (ldv2 != null);
        int n2 = this.fZk.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            cyj cyj2 = this.fZk.get(i2);
            if (!cyj2.fzI.equals(ldv2)) continue;
            return cyj2;
        }
        return null;
    }

    private cyj mn(ldv ldv2) {
        assert (ldv2 != null);
        int n2 = this.fZk.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            cyj cyj2 = this.fZk.get(i2);
            if (cyj2.Ud == null || !cyj2.Ud.equals(ldv2)) continue;
            return cyj2;
        }
        return null;
    }

    private void a(ghj ghj2) {
        if (ghj2.jhz < 0) {
            return;
        }
        if (ghj2.fzI == null) {
            return;
        }
        if (ghj2.Ud == null) {
            return;
        }
        cyj cyj2 = this.mm(ghj2.fzI);
        if (cyj2 == null) {
            return;
        }
        cyj2.Ud = ghj2.Ud;
    }

    private void a(ghp ghp2) {
        if (ghp2.bpX <= 0) {
            return;
        }
        if (ghp2.bpZ <= 0) {
            return;
        }
        cyj cyj2 = this.mn(ghp2.aO());
        if (cyj2 == null) {
            return;
        }
        cyj2.fYd.fP(ghp2.bpZ);
    }

    private void a(ghq ghq2) {
        cyj cyj2 = this.mn(ghq2.aO());
        if (cyj2 == null) {
            return;
        }
        cyj2.fYd.Dq();
    }

    private void a(ghs ghs2) {
        cyj cyj2 = this.mn(ghs2.aO());
        if (cyj2 == null) {
            return;
        }
        this.a(cyj2);
    }

    private void a(ght ght2) {
        cyj cyj2 = this.mn(ght2.aO());
        if (cyj2 == null) {
            return;
        }
        cyj2.fYd.Dr();
    }

    private void a(cyj cyj2) {
        assert (cyj2 != null);
        Iterator<cyj> iterator = this.fZk.iterator();
        while (iterator.hasNext()) {
            cyj cyj3 = iterator.next();
            if (!cyj3.fzI.equals(cyj2.fzI) || !cyj3.Ud.equals(cyj2.Ud)) continue;
            iterator.remove();
            return;
        }
    }

    private void b(cyj cyj2) {
        assert (cyj2 != null);
        assert (cyj2.fYd != null);
        assert (cyj2.fzI != null);
        assert (cyj2.Ud == null);
        ghi ghi2 = (ghi)this.MessageDelegator.h(513, this.GUID, cyj2.fzI.bFk());
        ghi2.jhz = cyj2.fYd.Do().ordinal();
        ghi2.fzI = cyj2.fzI;
        this.MessageDelegator.F(ghi2);
    }

    private void c(cyj cyj2) {
        assert (cyj2 != null);
        assert (cyj2.Ud != null);
        ghr ghr2 = (ghr)this.MessageDelegator.h(515, this.GUID, cyj2.Ud);
        ghr2.iBr = true;
        this.MessageDelegator.F(ghr2);
    }
}

