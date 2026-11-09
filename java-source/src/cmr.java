/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  lcw
 */
public class cmr
extends btk
implements bto {
    private cew dLR = null;
    private cms eLK = null;
    private ldz bDF = null;

    public cew axF() {
        return this.dLR;
    }

    public void b(cew cew2) {
        this.dLR = cew2;
        this.aTz();
    }

    public cms aTx() {
        return this.eLK;
    }

    @Override
    public void cleanUp() {
        if (this.eLK != null) {
            this.MessageDelegator.hd(this.eLK.getGUID());
            this.eLK = null;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bDF = ldz2;
        if (lcw.emZ() || this.GUID.ib() == 7000) {
            return;
        }
        if (this.eLK != null) {
            this.eLK.doTick(ldz2);
        }
    }

    public void aGy() {
        this.dLR = null;
        if (lcw.emZ() || this.GUID.ib() == 7000) {
            return;
        }
        if (this.eLK != null) {
            this.MessageDelegator.hd(this.eLK.getGUID());
            this.eLK = null;
        }
    }

    public void aTy() {
        if (this.eLK != null) {
            this.eLK.aTy();
        }
    }

    private void aTz() {
        assert (this.dLR != null);
        if (lea.enW().isDescendant(this.dLR.az(), cug.fgJ)) {
            if (this.eLK != null) {
                this.MessageDelegator.hd(this.eLK.getGUID());
                this.eLK = null;
            }
            this.eLK = new cms();
            this.eLK.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.eLK);
            this.eLK.b(this.dLR);
        }
    }
}

