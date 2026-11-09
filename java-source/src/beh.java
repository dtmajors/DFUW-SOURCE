/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public class beh
extends bec {
    public beh(cdb cdb2) {
        super(5, cdb2);
    }

    @Override
    public void amv() {
        assert (this.Initialized);
        kmd kmd2 = (kmd)this.MessageDelegator.h(3339);
        kmd2.iBr = true;
        kmd2.ec = this.GUID;
        kmd2.Rs = this.GUID;
        kmd2.pLS = 1;
        kmd2.dsK = true;
        kmd2.pLT = false;
        kmd2.pLU = false;
        kmd2.pLV = false;
        kmd2.pLW = false;
        kmd2.pLX = false;
        this.MessageDelegator.a(kmd2);
        this.he(kmd2.getGUID());
    }

    @Override
    public void aK(ljq ljq2) {
        if (!this.bGn) {
            return;
        }
        assert (this.amQ() != null);
        kmd kmd2 = (kmd)this.MessageDelegator.h(3339);
        kmd2.ec = this.GUID;
        kmd2.Rs = this.amQ();
        kmd2.pLS = 496;
        boolean bl = false;
        boolean bl2 = false;
        if (ljq2.rlV > 0.0f) {
            bl2 = true;
        }
        if (ljq2.rlV < 0.0f) {
            bl = true;
        }
        boolean bl3 = false;
        boolean bl4 = false;
        if (ljq2.x < 0.0f) {
            bl3 = true;
        }
        if (ljq2.x > 0.0f) {
            bl4 = true;
        }
        boolean bl5 = false;
        if (ljq2.y > 0.0f) {
            bl5 = true;
        }
        kmd2.pLT = bl;
        kmd2.pLU = bl2;
        kmd2.pLV = bl4;
        kmd2.pLW = bl3;
        kmd2.pLX = bl5;
        this.MessageDelegator.a(kmd2);
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
    public void amK() {
        kmd kmd2 = (kmd)this.MessageDelegator.h(3339);
        kmd2.iBr = false;
        kmd2.ec = this.GUID;
        kmd2.Rs = this.amQ();
        kmd2.pLS = 2;
        this.MessageDelegator.a(kmd2);
    }

    @Override
    public void cV(boolean bl) {
        kmd kmd2 = (kmd)this.MessageDelegator.h(3339);
        kmd2.iBr = false;
        kmd2.ec = this.GUID;
        kmd2.Rs = this.amQ();
        kmd2.pLS = 4;
        kmd2.Active = bl;
        this.MessageDelegator.a(kmd2);
    }
}

