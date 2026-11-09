/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Set;
import java.util.TreeSet;

public class te
extends qe
implements bto {
    private final Set<Integer> aRE;
    private final ps aRN;
    private Set<Integer> aRO = null;
    private Set<Integer> aRP = null;
    private Set<Integer> aRQ = null;
    private Set<Integer> aRR = null;

    public te(md md2, ps ps2, Set<Integer> set) {
        super(md2, me.axE);
        this.aRN = ps2;
        this.aRE = set;
        this.Active = true;
    }

    public final int sJ() {
        return this.aRN.sJ();
    }

    @Override
    protected void sO() {
        this.aRO = new TreeSet<Integer>();
        this.aRP = new TreeSet<Integer>();
        this.aRQ = new TreeSet<Integer>();
        this.aRR = new TreeSet<Integer>();
        this.aRO.addAll(this.aRE);
    }

    @Override
    protected void sP() {
        this.aRP = null;
        this.aRQ = null;
        this.aRR = null;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ur()) {
            return;
        }
        if (this.aRO.isEmpty() && this.aRP.isEmpty()) {
            this.Active = false;
            this.ca(null);
        }
    }

    private boolean ur() {
        if (this.aRO == null || this.aRO.isEmpty()) {
            return false;
        }
        if (this.aRP.size() >= 30) {
            return false;
        }
        Integer n = this.aRO.iterator().next();
        ldv ldv2 = new ldv(this.aRN.Wy.di, lcr.qAW.enw(), lcr.qAW.enx());
        fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), ldv2);
        fze2.a(px.aJO);
        fze2.hC(lcr.abW((int)n));
        this.MessageDelegator.E(fze2);
        this.aRP.add(n);
        this.aRO.remove(n);
        return true;
    }

    private void a(fzf fzf2) {
        if (!this.aRP.remove(fzf2.oq().enw())) {
            lfn.b(5, "SFPersistenceWorkerRequestPSOLoads", "handlePersistenceManagerLoadPSOResponseMessage: Got load response for unexpected character ID " + fzf2.oq().enw());
            return;
        }
        if (fzf2.aMH != null) {
            this.aRR.add(fzf2.oq().enw());
            lfn.b(5, "SFPersistenceWorkerRequestPSOLoads", "handlePersistenceManagerLoadPSOResponseMessage: Could not load character ID " + fzf2.oq().enw());
        } else {
            this.aRQ.add(fzf2.oq().enw());
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7198: {
                this.a((fzf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public final Set<Integer> us() {
        return this.aRQ;
    }

    public final Set<Integer> ut() {
        return this.aRR;
    }
}

