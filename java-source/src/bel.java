/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cxd
 */
public class bel
extends bec {
    public bel(cdb cdb2) {
        super(3, cdb2);
    }

    @Override
    public void amv() {
        assert (this.Initialized);
        kmr kmr2 = (kmr)this.MessageDelegator.h(3335);
        kmr2.iBr = true;
        kmr2.ec = this.GUID;
        kmr2.Rs = this.GUID;
        kmr2.pOg = 261633;
        kmr2.dsK = true;
        kmr2.pNN = 1.0995574f;
        kmr2.pNO = 10.0f;
        kmr2.pNP = cxd.fPX;
        kmr2.pNQ = cxd.fPY;
        kmr2.pNT = 4.0f;
        kmr2.pNU = 5.0f;
        kmr2.pKE = new ljq(0.0f, 0.0f, 1.0f);
        kmr2.pNR = 3.0f;
        kmr2.pNS = 8.0f;
        this.MessageDelegator.a(kmr2);
        this.he(kmr2.getGUID());
    }

    @Override
    public void aK(ljq ljq2) {
        if (!this.bGn) {
            return;
        }
        assert (this.amQ() != null);
        kmr kmr2 = (kmr)this.MessageDelegator.h(3335);
        kmr2.ec = this.GUID;
        kmr2.Rs = this.amQ();
        kmr2.pOg = 504;
        boolean bl = false;
        boolean bl2 = false;
        if (ljq2.x > 0.0f) {
            bl = true;
        }
        if (ljq2.x < 0.0f) {
            bl2 = true;
        }
        boolean bl3 = false;
        boolean bl4 = false;
        if (ljq2.y > 0.0f) {
            bl3 = true;
        }
        if (ljq2.y < 0.0f) {
            bl4 = true;
        }
        boolean bl5 = false;
        boolean bl6 = false;
        if (ljq2.rlV > 0.0f) {
            bl5 = true;
        }
        if (ljq2.rlV < 0.0f) {
            bl6 = true;
        }
        kmr2.pNM = bl;
        kmr2.pNL = bl2;
        kmr2.pOi = bl3;
        kmr2.pOh = bl4;
        kmr2.pNJ = bl5;
        kmr2.pNK = bl6;
        this.MessageDelegator.a(kmr2);
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
        kmr kmr2 = (kmr)this.MessageDelegator.h(3335);
        kmr2.iBr = false;
        kmr2.ec = this.GUID;
        kmr2.Rs = this.amQ();
        kmr2.pOg = 2;
        this.MessageDelegator.a(kmr2);
    }

    public void ang() {
        this.cM(cxd.fPX);
    }

    public void cM(float f2) {
        assert (this.Initialized);
        assert (f2 > 0.0f);
        if (!this.bGn) {
            return;
        }
        assert (this.amQ() != null);
        kmr kmr2 = (kmr)this.MessageDelegator.h(3335);
        kmr2.iBr = false;
        kmr2.ec = this.GUID;
        kmr2.Rs = this.amQ();
        kmr2.pOg = 2048;
        kmr2.pNP = f2;
        this.MessageDelegator.a(kmr2);
    }

    @Override
    public void cV(boolean bl) {
        kmr kmr2 = (kmr)this.MessageDelegator.h(3335);
        kmr2.iBr = false;
        kmr2.ec = this.GUID;
        kmr2.Rs = this.amQ();
        kmr2.pOg = 4;
        kmr2.Active = bl;
        this.MessageDelegator.a(kmr2);
    }
}

