/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Set;

public class bpo
extends bnr {
    private Set<Integer> dAc = lcn.emx();

    public bpo() {
        super(true);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7980: {
                this.a((fnh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(fky fky2) {
        if (fky2.dxt == null) {
            return;
        }
        if (fky2.iPg == null) {
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(fky2.aO().ib());
        if (bpm2 == null) {
            return;
        }
        if (this.dAc.contains(bpm2.RB)) {
            this.a(fky2.aO(), false, mdd.uFi.bD(new Object[0]));
            return;
        }
        int n = lcr.abS((int)fky2.dxt.enw());
        fky2.dxt = lcr.ak((ldv)fky2.dxt, (int)n);
        brp[] brpArray = fky2.iPg;
        int n2 = brpArray.length;
        for (int i = 0; i < n2; ++i) {
            int n3 = lcr.abO((int)brpArray[i].GUID.enw());
            brpArray[i].GUID = lcr.al((ldv)brpArray[i].GUID, (int)n3);
        }
        this.dAc.add(bpm2.RB);
        fky2.sk(bpm2.RB);
        fng fng2 = (fng)this.MessageDelegator.h(7979, this.GUID, fky2.dxt);
        fng2.aqs = bpm2.RB;
        fng2.iQQ = this.dwJ.asd();
        fng2.dJg = brpArray;
        this.MessageDelegator.F(fng2);
    }

    @Override
    protected void a(fkz fkz2) {
        bpm bpm2;
        if (fkz2.aVk() == -1) {
            return;
        }
        Integer n = new Integer(fkz2.aVk());
        if (!this.dAc.contains(n)) {
            return;
        }
        this.dAc.remove(n);
        if (fkz2.iPj) {
            // empty if block
        }
        if ((bpm2 = ((bpv)this.dwJ).lN(fkz2.aVk())) == null) {
            return;
        }
        fkz2.f(this.GUID);
        fkz2.on(lcr.ak((ldv)this.GUID, (int)bpm2.RB));
        this.MessageDelegator.F(fkz2);
    }

    private void cZ(float f2) {
        if (f2 >= 0.0f) {
            return;
        }
        this.dwJ.asg().mt((int)f2);
    }

    private void a(fnh fnh2) {
        if (fnh2.aVk() == -1) {
            return;
        }
        if (!this.dAc.remove(fnh2.aVk())) {
            return;
        }
        bpm bpm2 = ((bpv)this.dwJ).lN(fnh2.aVk());
        if (bpm2 == null) {
            return;
        }
        if (fnh2.iQR) {
            this.cZ(-fnh2.iQS);
            this.a(lcr.ak((ldv)this.GUID, (int)bpm2.RB), true, null);
        } else {
            this.a(lcr.ak((ldv)this.GUID, (int)bpm2.RB), false, mdd.uFl.bD(new Object[0]));
        }
    }

    private void a(ldv ldv2, boolean bl2, loz loz2) {
        assert (ldv2 != null);
        fkz fkz2 = (fkz)this.MessageDelegator.h(11782, this.GUID, ldv2);
        fkz2.iPj = bl2;
        fkz2.s(loz2);
        this.MessageDelegator.F(fkz2);
    }
}

