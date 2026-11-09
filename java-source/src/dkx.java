/*
 * Decompiled with CFR.
 */
public class dkx
extends btk
implements bto {
    private int gqN = 64;
    private ldv gEG = null;
    private ldv gEH = null;
    private ljq biE = new ljq();
    private lgl biF = new lgl();
    private boolean gEI = false;
    private int gEJ = 1;
    private boolean gEK = false;
    private boolean gEL = false;
    private boolean gBu = false;
    private int gEM = 1;

    public int getRelationType() {
        return this.gqN;
    }

    public void setRelationType(int n) {
        this.gqN = n;
    }

    public ldv aSO() {
        return this.getGUID();
    }

    public ldv bod() {
        return this.gEG;
    }

    public void mJ(ldv ldv2) {
        this.gEG = ldv2;
    }

    public ldv boe() {
        return this.gEH;
    }

    public void mK(ldv ldv2) {
        this.gEH = ldv2;
    }

    public ljq getDeltaPos() {
        return this.biE;
    }

    public void setDeltaPos(ljq ljq2) {
        assert (ljq2 != null);
        this.biE = ljq2;
        this.gEK = true;
    }

    public lgl getDeltaRot() {
        return this.biF;
    }

    public void setDeltaRot(lgl lgl2) {
        assert (lgl2 != null);
        this.biF = lgl2;
        this.gEL = true;
    }

    public int bof() {
        return this.gEJ;
    }

    public void Ap(int n) {
        this.gEJ = n;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.boi();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        this.boj();
        this.CleanedUp = true;
    }

    public dkx bog() {
        dkx dkx2 = new dkx();
        return dkx2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.gBu) {
            return;
        }
        if (this.gEK || this.gEL) {
            if (this.gEJ == 1) {
                knj knj2 = (knj)this.MessageDelegator.h(778);
                knj2.dsK = false;
                knj2.hsP = false;
                knj2.iBr = false;
                knj2.ehv = this.gEG;
                knj2.ehw = this.gEH;
                knj2.doP = this.aSO();
                knj2.ec = this.getGUID();
                int n = 0;
                if (this.gEK) {
                    n = 128;
                }
                if (this.gEL) {
                    n |= 0x100;
                }
                knj2.biE = this.getDeltaPos();
                knj2.biF = this.getDeltaRot();
                knj2.pPN = n;
                this.MessageDelegator.a(knj2);
            } else if (this.gEJ == 2) {
                kng kng2 = (kng)this.MessageDelegator.h(777);
                kng2.lQ(false);
                kng2.wC(false);
                kng2.wD(false);
                kng2.jM(false);
                kng2.qj(this.gEG);
                kng2.qk(this.gEH);
                kng2.kX(this.aSO());
                kng2.ts(this.getGUID());
                int n = 0;
                if (this.gEK) {
                    n = 256;
                }
                if (this.gEL) {
                    n |= 0x200;
                }
                kng2.Zq(n);
                kng2.setDeltaPos(this.getDeltaPos());
                kng2.setDeltaRot(this.getDeltaRot());
                this.MessageDelegator.a(kng2);
            } else if (this.gEJ == 3) {
                kne kne2 = (kne)this.MessageDelegator.h(776);
                kne2.lQ(false);
                kne2.xo(false);
                kne2.wC(false);
                kne2.wD(false);
                kne2.jM(false);
                kne2.qj(this.gEG);
                kne2.qk(this.gEH);
                kne2.kX(this.aSO());
                kne2.ts(this.getGUID());
                int n = 0;
                if (this.gEK) {
                    n = 256;
                }
                if (this.gEL) {
                    n |= 0x200;
                }
                kne2.Zo(n);
                kne2.setDeltaPos(this.getDeltaPos());
                kne2.setDeltaRot(this.getDeltaRot());
                this.MessageDelegator.a(kne2);
            }
        }
        this.gEL = false;
        this.gEK = false;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 768) {
            if (ktv2.getResult() != 0) {
                this.gBu = false;
                if (this.gEM > 0) {
                    --this.gEM;
                    this.boi();
                }
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    public boolean boh() {
        return this.gBu;
    }

    void boi() {
        assert (!this.gBu);
        if (this.gEJ == 1) {
            kni kni2 = (kni)this.MessageDelegator.h(782);
            kni2.lQ(false);
            kni2.jM(true);
            kni2.wD(false);
            kni2.wC(false);
            kni2.biE = this.biE;
            kni2.biF = this.biF;
            kni2.ehv = this.gEG;
            kni2.ehw = this.gEH;
            kni2.doP = this.aSO();
            kni2.ec = this.getGUID();
            kni2.pPN = this.gEI ? 16 : 64;
            this.MessageDelegator.a(kni2);
        } else if (this.gEJ == 2) {
            kng kng2 = (kng)this.MessageDelegator.h(777);
            kng2.lQ(false);
            kng2.wC(false);
            kng2.wD(false);
            kng2.jM(true);
            kng2.setDeltaPos(this.getDeltaPos());
            kng2.setDeltaRot(this.getDeltaRot());
            kng2.qj(this.gEG);
            kng2.qk(this.gEH);
            kng2.kX(this.aSO());
            kng2.ts(this.getGUID());
            kng2.Zq(1 | this.gqN);
            this.MessageDelegator.a(kng2);
        } else if (this.gEJ == 3) {
            kne kne2 = (kne)this.MessageDelegator.h(776);
            kne2.lQ(false);
            kne2.wC(false);
            kne2.wD(false);
            kne2.jM(true);
            kne2.xo(false);
            kne2.qj(this.gEG);
            kne2.qk(this.gEH);
            kne2.kX(this.aSO());
            kne2.ts(this.getGUID());
            kne2.Zo(1 | this.gqN);
            kne2.setDeltaPos(this.getDeltaPos());
            kne2.setDeltaRot(this.getDeltaRot());
            this.MessageDelegator.a(kne2);
        } else {
            return;
        }
        this.gBu = true;
        this.gEK = false;
        this.gEL = false;
    }

    void boj() {
        if (!this.gBu) {
            return;
        }
        if (this.gEJ == 1) {
            knj knj2 = (knj)this.MessageDelegator.h(778);
            knj2.lQ(false);
            knj2.wC(false);
            knj2.wD(false);
            knj2.jM(true);
            knj2.ehv = this.gEG;
            knj2.ehw = this.gEH;
            knj2.doP = this.aSO();
            knj2.ec = this.getGUID();
            knj2.pPN = 1;
            this.MessageDelegator.a(knj2);
        } else if (this.gEJ == 2) {
            kng kng2 = (kng)this.MessageDelegator.h(777);
            kng2.lQ(false);
            kng2.wC(false);
            kng2.wD(false);
            kng2.jM(true);
            kng2.ehv = this.gEG;
            kng2.ehw = this.gEH;
            kng2.doP = this.aSO();
            kng2.ec = this.getGUID();
            kng2.Zq(2);
            this.MessageDelegator.a(kng2);
        } else if (this.gEJ == 3) {
            kne kne2 = (kne)this.MessageDelegator.h(776);
            kne2.lQ(false);
            kne2.wC(false);
            kne2.wD(false);
            kne2.jM(true);
            kne2.xo(false);
            kne2.qj(this.gEG);
            kne2.qk(this.gEH);
            kne2.kX(this.aSO());
            kne2.ts(this.getGUID());
            kne2.Zo(2);
            this.MessageDelegator.a(kne2);
        } else {
            return;
        }
        this.gBu = false;
    }

    public boolean bok() {
        return this.gEI;
    }

    public void ig(boolean bl) {
        this.gEI = bl;
    }
}

