/*
 * Decompiled with CFR.
 */
import java.util.HashSet;

public abstract class avu
extends btk {
    private final ldv cqY;
    public final hc Zc;
    private HashSet<Integer> cqZ = (HashSet)lcn.emx();

    protected avu(ldv ldv2, hc hc2) {
        this.cqY = ldv2;
        this.Zc = hc2;
    }

    protected void a(aua aua2) {
        assert (!this.cqZ.contains(aua2.ID));
        if (aua2.SC.ordinal() <= this.Zc.ordinal()) {
            ehi ehi2 = (ehi)this.MessageDelegator.h(2338, this.getGUID(), this.cqY);
            ehi2.ipU = aua2;
            this.MessageDelegator.E(ehi2);
            this.cqZ.add(aua2.ID);
        }
    }

    protected void ip(int n) {
        if (!this.cqZ.remove(n)) {
            return;
        }
        ehs ehs2 = (ehs)this.MessageDelegator.h(2339, this.getGUID(), this.cqY);
        ehs2.ipx = n;
        this.MessageDelegator.E(ehs2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2340: {
                this.a((egj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected abstract void a(int var1, String var2, auc[] var3);

    private final void a(egj egj2) {
        if (!this.cqZ.contains(egj2.ipx)) {
            lfn.b(5, "SFChatProxyNew", "handleChatExecuteCommandMessage(): Chat command " + egj2.ipx + " isn't registered");
        }
        this.a(egj2.ipx, egj2.ccT, egj2.ipy);
    }
}

