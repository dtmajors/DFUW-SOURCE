/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class ben
extends bec {
    private float ddh = 0.2f;
    private float ddi = 0.2f;

    public ben(cdb cdb2) {
        super(1, cdb2);
    }

    @Override
    public void amv() {
        assert (this.Initialized);
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = true;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.GUID;
        kmw2.pPe = 6145;
        kmw2.ddi = this.ddi;
        kmw2.ddh = this.ddh;
        kmw2.dsK = true;
        this.MessageDelegator.a(kmw2);
        this.he(kmw2.getGUID());
    }

    @Override
    public void aK(ljq ljq2) {
        if (!this.bGn) {
            return;
        }
        assert (this.amQ() != null);
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.hsP = true;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPe = 8;
        kmw2.pPf = ljq2;
        this.MessageDelegator.a(kmw2);
    }

    @Override
    public final void amX() {
        if (!this.bGn) {
            return;
        }
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPe = 8192;
        kmw2.pPh = true;
        this.MessageDelegator.a(kmw2);
    }

    @Override
    public void aL(ljq ljq2) {
        if (!this.bGn) {
            return;
        }
        ldv ldv2 = this.amU();
        assert (ldv2 != null);
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.iBr = false;
        kmj2.ec = this.GUID;
        kmj2.Rs = ldv2;
        kmj2.pNm = 4;
        kmj2.jce = ljq2;
        kmj2.fXZ = true;
        kmj2.fYa = true;
        kmj2.gBD = false;
        kmj2.jcg = false;
        kmj2.jch = false;
        this.MessageDelegator.a(kmj2);
    }

    @Override
    public void amY() {
        if (!this.bGn) {
            return;
        }
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.hsP = true;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPe = 16;
        kmw2.pMH = true;
        this.MessageDelegator.a(kmw2);
    }

    @Override
    public final void a(boolean[] blArray, float f2, float f3) {
        if (blArray == null) {
            blArray = new boolean[]{true, false, false, false};
        }
        if (!this.bGn) {
            return;
        }
        ljq ljq2 = new ljq();
        boolean bl = false;
        block6: for (int i = 0; i < 4; ++i) {
            boolean bl2 = blArray[i];
            if (!bl2) continue;
            bl = true;
            switch (i) {
                case 0: {
                    ljq2.rlV = -1.0f;
                    continue block6;
                }
                case 1: {
                    ljq2.rlV = 1.0f;
                    continue block6;
                }
                case 2: {
                    ljq2.x = 1.0f;
                    continue block6;
                }
                case 3: {
                    ljq2.x = -1.0f;
                    continue block6;
                }
                default: {
                    ljq2.rlV = 1.0f;
                }
            }
        }
        if (!bl) {
            ljq2.rlV = 1.0f;
        }
        ljq2.normalize();
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.pPe = 114688;
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPg = true;
        kmw2.pPf = ljq2;
        kmw2.pPi = f2;
        kmw2.pPj = f3;
        this.MessageDelegator.a(kmw2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5387: {
                this.a((kvn)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void amK() {
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.pPe = 2;
        kmw2.Rs = this.amQ();
        this.MessageDelegator.a(kmw2);
    }

    private void a(kvn kvn2) {
        if (!this.bGn) {
            return;
        }
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPe = 8192;
        kmw2.pPh = false;
        this.MessageDelegator.a(kmw2);
    }

    @Override
    public void amW() {
    }

    @Override
    public void cG(float f2) {
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPe = 131072;
        kmw2.pPk = f2;
        this.MessageDelegator.a(kmw2);
    }

    public void aN(ljq ljq2) {
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPe = 262144;
        kmw2.jiL = ljq2;
        this.MessageDelegator.a(kmw2);
    }

    @Override
    public void cV(boolean bl) {
        kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
        kmw2.iBr = false;
        kmw2.ec = this.GUID;
        kmw2.Rs = this.amQ();
        kmw2.pPe = 4;
        kmw2.Active = bl;
        this.MessageDelegator.a(kmw2);
    }

    public float anc() {
        return this.ddh;
    }

    public void cJ(float f2) {
        this.ddh = f2;
    }

    public float and() {
        return this.ddi;
    }

    public void cK(float f2) {
        this.ddi = f2;
    }
}

