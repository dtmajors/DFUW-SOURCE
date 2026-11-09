/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Collection;
import java.util.LinkedList;

public class sy
extends qe
implements bto {
    private LinkedList<ldv> aOH = lcn.emA();
    private int aRB;
    public int aRC;

    public sy(md md2) {
        super(md2, me.ayv);
    }

    public void f(Collection<Integer> collection) {
        if (this.sR()) {
            assert (false);
            lfn.b(5, "SFPersistenceWorkerRequestCharacterSaves", "setCharacterIDList: Can't set character ID list while working");
            return;
        }
        this.aOH.clear();
        for (Integer n : collection) {
            this.aOH.add(lcr.abW((int)n));
        }
    }

    @Override
    protected void sO() {
        this.Active = true;
        this.aRB = 0;
        this.aRC = 0;
    }

    @Override
    protected void sP() {
        this.aRB = 0;
        this.aRC = 0;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.sR()) {
            return;
        }
        for (int i = 0; i < 30 && !this.aOH.isEmpty(); ++i) {
            ldv ldv2 = this.aOH.pollFirst();
            fzr fzr2 = (fzr)this.MessageDelegator.h(7178, this.getGUID(), lcr.qAW);
            fzr2.SN = ldv2.enw();
            fzr2.jbU = true;
            fzr2.jbV = false;
            this.MessageDelegator.E(fzr2);
            ++this.aRB;
        }
        this.tA();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7179: {
                this.a((fzs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fzs fzs2) {
        --this.aRB;
        if (fzs2.aMH != null) {
            ++this.aRC;
        }
    }

    private void tA() {
        if (this.aRB == 0 && this.aOH.isEmpty()) {
            if (this.aRC == 0) {
                this.ca(null);
            } else {
                this.ca("" + this.aRC + " failed saves");
            }
        }
    }
}

