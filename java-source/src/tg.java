/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;
import java.util.Set;

public class tg
extends qe
implements bto {
    private ps[] aBz;
    private LinkedList<Integer> aRV = null;

    public tg(md md2) {
        super(md2, me.axD);
    }

    public void a(ps[] psArray) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerSendAllRestoredMessages", "setGamelogicServerList: Can't modify while working");
            assert (false);
            return;
        }
        this.aBz = psArray;
    }

    @Override
    protected void sO() {
        Set<Integer> set = lcn.emx();
        for (int i = 0; i < this.aBz.length; ++i) {
            set.addAll(this.aBz[i].aHP);
        }
        this.aRV = lcn.emA();
        this.aRV.addAll(set);
    }

    @Override
    protected void sP() {
        this.aRV = null;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.sR()) {
            return;
        }
        for (int i = 100; !this.aRV.isEmpty() && i > 0; --i) {
            int n = this.aRV.pollFirst();
            gib gib2 = (gib)this.MessageDelegator.h(7685, this.GUID, lcr.abW((int)n));
            gib2.jhT = false;
            gib2.ikM = true;
            this.MessageDelegator.F(gib2);
        }
        if (this.aRV.isEmpty()) {
            this.ca(null);
        }
    }
}

