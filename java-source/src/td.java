/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class td
extends qe {
    private ps[] aBz;
    private px aRJ;
    private ldv Rs;
    private Set<Integer> aRK;
    private Set<Integer> aRL;
    private Map<Integer, String> aRM;

    public td(md md2) {
        super(md2, me.axz);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" Operation=").append((Object)this.aRJ);
        stringBuilder.append(" ObjectGUID=").append(this.Rs);
        stringBuilder.append(" Pending=");
        stringBuilder.append(this.g(this.aRK));
        stringBuilder.append(" Completed=");
        stringBuilder.append(this.g(this.aRL));
        stringBuilder.append(" Failed=");
        if (this.aRM == null) {
            stringBuilder.append("[]");
        } else {
            stringBuilder.append(this.g(this.aRM.keySet()));
        }
        return stringBuilder.toString();
    }

    private String g(Collection<Integer> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        boolean bl = true;
        for (Integer n : collection) {
            if (!bl) {
                stringBuilder.append(',');
            }
            stringBuilder.append("" + (n + 300));
            bl = false;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void a(px px2, ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRequestOperationOnServers", "setOperation: Can't modify while working");
            assert (false);
            return;
        }
        this.aRJ = px2;
        this.Rs = ldv2;
    }

    public void a(ps[] psArray) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerRequestOperationOnServers", "setGamelogicServerList: Can't modify while working");
            assert (false);
            return;
        }
        this.aBz = psArray;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7198: {
                this.e((fzf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.c((kcs)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    @Override
    protected void sO() {
        this.aRK = lcn.emH();
        this.aRL = lcn.emH();
        this.aRM = lcn.emG();
        for (ps ps2 : this.aBz) {
            fze fze2 = (fze)this.MessageDelegator.h(7197, this.getGUID(), new ldv(ps2.Wy.di, lcr.qAV.enw(), lcr.qAV.enx()));
            fze2.a(this.aRJ);
            fze2.hC(this.Rs);
            this.MessageDelegator.E(fze2);
            this.aRK.add(ps2.sJ());
        }
    }

    @Override
    protected void sP() {
        this.aRK = null;
        this.aRL = null;
        this.aRM = null;
    }

    private void c(kcs kcs2) {
        int n = kcs2.hsQ.ib() - 300;
        if (this.aRK.remove(n)) {
            this.aRM.put(n, "Server is not present");
            lfn.b(5, "SFPersistenceWorkerRequestOperationOnServers", "handleMiddlewareDeliveryError: Node " + kcs2.hsQ.ib() + " not present");
        } else {
            lfn.b(5, "SFPersistenceWorkerRequestOperationOnServers", "handleMiddlewareDeliveryError: Got error for " + kcs2.hsQ.ib() + " but node not in PendingServers");
            assert (false);
        }
    }

    private void e(fzf fzf2) {
        int n = fzf2.aO().ib() - 300;
        if (fzf2.aMH == null) {
            this.aRL.add(n);
        } else {
            this.aRM.put(n, fzf2.aMH);
        }
        this.aRK.remove(n);
        if (!this.aRK.isEmpty()) {
            return;
        }
        if (this.aRM.isEmpty()) {
            this.ca(null);
        } else {
            for (int n2 : this.aRM.keySet()) {
                lfn.b(5, "SFPersistenceWorkerRequestOperationOnServers", "handlePersistenceManagerOperationResponse: Node " + (n2 + 300) + " failed " + (Object)((Object)this.aRJ) + " operation");
            }
            this.ca("One or more gamelogic servers failed");
        }
    }
}

