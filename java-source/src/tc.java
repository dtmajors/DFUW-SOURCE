/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;
import java.util.Map;

public class tc
extends qd {
    private int di;
    private LinkedList<String> aRH;
    private LinkedList<ldv> aRI;
    private String aMH;

    public tc(md md2) {
        super(md2, me.axF);
    }

    public void bN(int n) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRequestFortressLoads", "setNodeID: Can't modify while working");
            assert (false);
            return;
        }
        this.di = n;
    }

    public void l(Map<String, ldv> map) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRequestFortressLoads", "setFortresses: Can't modify while working");
            assert (false);
            return;
        }
        this.aRH = lcn.emA();
        this.aRI = lcn.emA();
        for (Map.Entry<String, ldv> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                this.aRH.add(entry.getKey());
                continue;
            }
            this.aRI.add(entry.getValue());
        }
    }

    @Override
    protected void sO() {
        this.uq();
    }

    @Override
    protected void sP() {
        this.aMH = null;
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

    private void uq() {
        if (!this.aRI.isEmpty()) {
            ldv ldv2 = this.aRI.pollFirst();
            fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), lcr.ak((ldv)lcr.qAV, (int)this.di));
            fze2.a(px.aKw);
            fze2.hC(ldv2);
            this.MessageDelegator.E(fze2);
            return;
        }
        if (!this.aRH.isEmpty()) {
            String string = this.aRH.pollFirst();
            fze fze3 = (fze)this.MessageDelegator.h(7197, this.getGUID(), lcr.ak((ldv)lcr.qAV, (int)this.di));
            fze3.a(px.aKv);
            fze3.kP(string);
            this.MessageDelegator.E(fze3);
            return;
        }
        this.ca(this.aMH);
    }

    private void a(fzf fzf2) {
        if (fzf2.aMH != null) {
            lfn.b(5, "SFPersistenceWorkerRequestFortressLoads", "handlePersistenceManagerOperationResponseMessage: Error loading '" + fzf2.bSR() + "' on node " + this.di + ": " + fzf2.aMH);
            if (this.aMH == null) {
                this.aMH = fzf2.aMH;
            }
        }
        this.uq();
    }
}

