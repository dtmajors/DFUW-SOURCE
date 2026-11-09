/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;
import java.util.Map;

public class tf
extends qe {
    private int di;
    private LinkedList<String> aRS;
    private LinkedList<ldv> aRT;
    private String aMH;
    private int aRU;

    public tf(md md2) {
        super(md2, me.axB);
    }

    public void bN(int n) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRequestVillageLoads", "setNodeID: Can't modify while working");
            assert (false);
            return;
        }
        this.di = n;
    }

    public void m(Map<String, ldv> map) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRequestVillageLoads", "setVillages: Can't modify while working");
            assert (false);
            return;
        }
        this.aRS = lcn.emA();
        this.aRT = lcn.emA();
        for (Map.Entry<String, ldv> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                this.aRS.add(entry.getKey());
                continue;
            }
            this.aRT.add(entry.getValue());
        }
    }

    @Override
    protected void sO() {
        if (!this.aRT.isEmpty()) {
            this.uu();
        } else if (!this.aRS.isEmpty()) {
            this.uv();
        } else {
            this.ca(null);
        }
    }

    @Override
    protected void sP() {
        this.aMH = null;
        this.aRU = 0;
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

    private void uu() {
        for (ldv ldv2 : this.aRT) {
            fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), lcr.ak((ldv)lcr.qAV, (int)this.di));
            fze2.a(px.aKg);
            fze2.hC(ldv2);
            this.MessageDelegator.E(fze2);
        }
        this.aRU = this.aRT.size();
        this.aRT.clear();
    }

    private void uv() {
        for (String string : this.aRS) {
            fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), lcr.ak((ldv)lcr.qAV, (int)this.di));
            fze2.a(px.aKf);
            fze2.kP(string);
            this.MessageDelegator.E(fze2);
        }
        this.aRU = this.aRS.size();
        this.aRS.clear();
    }

    private void a(fzf fzf2) {
        if (fzf2.aMH != null) {
            lfn.b(5, "SFPersistenceWorkerRequestVillageLoads", "handlePersistenceManagerOperationResponseMessage: Error loading '" + fzf2.bSR() + "' on node " + this.di + ": " + fzf2.aMH);
            if (this.aMH == null) {
                this.aMH = fzf2.aMH;
            }
        }
        --this.aRU;
        if (this.aRU == 0) {
            if (this.aRS.isEmpty()) {
                this.ca(null);
            } else {
                this.uv();
            }
        }
    }
}

