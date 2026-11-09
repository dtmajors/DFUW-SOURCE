/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class kf
extends jk {
    private jj anY = null;
    private String anZ = null;
    private ldv aoa = null;

    @Override
    public void nU() {
        for (a a2 : a.values()) {
            this.a(a2.getCommand(), a2.om(), a2.hf(), a2.ok(), a2.ol());
        }
    }

    @Override
    public void a(jj jj2) {
        a a2 = a.findCommand(jj2.akV);
        if (a2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unrecognised Command Encountered!!!... CommandText = " + jj2.akV);
            assert (false);
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aoe: {
                this.aq(jj2);
                break;
            }
            case aof: {
                this.ar(jj2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleCommand() : Unhandled Command Encountered!!!... CommandText = " + jj2.akV);
                assert (false);
                jj2.b(lqd.rXd.bD(jj2.akV), true);
                return;
            }
        }
    }

    private void aq(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        this.a(this.nW().getGUID(), 35, ((mhr)jj2.cA((int)0)).Value);
        jj2.nT();
    }

    private void ar(jj jj2) {
        if (this.anY != null) {
            jj2.b(lqe.rXC.bD(new Object[0]), false);
            return;
        }
        this.anZ = ((mhr)jj2.cA((int)0)).Value;
        ayi.c c2 = ayi.eQ(this.anZ);
        switch (c2) {
            case cyR: {
                jj2.b(c2.aaM().YF().bD(3), true);
                this.anZ = null;
                return;
            }
            case cyS: {
                jj2.b(c2.aaM().YF().bD(ayi.aaK()), true);
                this.anZ = null;
                return;
            }
            default: {
                jj2.b(c2.aaM().YF().bD(new Object[0]), true);
                this.anZ = null;
                return;
            }
            case cyX: 
        }
        this.anY = jj2;
        if (jj2.getArgCount() > 1) {
            this.br(((mhr)jj2.cA((int)1)).Value);
        } else {
            if (!this.b(jj2)) {
                this.anY = null;
                this.anZ = null;
                return;
            }
            if (this.aQ().iG() == null) {
                jj2.b(lqe.NotClanMember.bD(new Object[0]), false);
                this.anY = null;
                this.anZ = null;
                return;
            }
            this.aoa = this.aQ().iG();
            this.ou();
        }
    }

    private void ou() {
        if (this.anY == null || this.anZ == null || this.aoa == null) {
            return;
        }
        ayi.c c2 = ayi.eQ(this.anZ);
        switch (c2) {
            case cyR: {
                this.anY.b(c2.aaM().YF().bD(3), true);
                this.anY = null;
                this.anZ = null;
                this.aoa = null;
                return;
            }
            case cyS: {
                this.anY.b(c2.aaM().YF().bD(ayi.aaK()), true);
                this.anY = null;
                this.anZ = null;
                this.aoa = null;
                return;
            }
            default: {
                this.anY.b(c2.aaM().YF().bD(new Object[0]), true);
                this.anY = null;
                this.anZ = null;
                this.aoa = null;
                return;
            }
            case cyX: 
        }
        this.cC(1);
    }

    private void a(ldv ldv2, int n, String string) {
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, ldv2);
        ern2.ilu = n;
        ern2.YL = string;
        this.MessageDelegator.F(ern2);
    }

    private void br(String string) {
        ema ema2 = (ema)this.MessageDelegator.h(13914, this.GUID, lcr.hac);
        ema2.add = string;
        this.MessageDelegator.F(ema2);
    }

    private void cC(int n) {
        emx emx2 = (emx)this.MessageDelegator.h(13910, this.GUID, lcr.hac);
        emx2.gOd = n;
        emx2.add = this.anZ;
        this.MessageDelegator.F(emx2);
    }

    private void ov() {
        emt emt2 = (emt)this.MessageDelegator.h(13925, this.GUID, this.aoa);
        emt2.oS(null);
        emt2.kA(true);
        emt2.kB(true);
        emt2.kc(this.anZ);
        this.MessageDelegator.F(emt2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13915: {
                this.a((emb)dxq2);
                break;
            }
            case 13911: {
                this.a((emy)dxq2);
                break;
            }
            case 13926: {
                this.a((emu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(emb emb2) {
        if (this.anY == null || this.anZ == null) {
            return;
        }
        if (emb2.ade == null) {
            this.anY.b(lqe.rXD.bD(emb2.add), true);
            this.anY = null;
            this.anZ = null;
            return;
        }
        this.aoa = emb2.ade;
        this.ou();
    }

    private void a(emy emy2) {
        if (this.anY == null || this.anZ == null || this.aoa == null) {
            return;
        }
        block0 : switch (emy2.gOd) {
            case 1: {
                switch (emy2.ew) {
                    case 4: {
                        this.ov();
                        break block0;
                    }
                    case 1: {
                        this.anY.b(mbi.tYU.bD(this.anZ), true);
                        this.anY = null;
                        this.anZ = null;
                        this.aoa = null;
                        return;
                    }
                }
            }
        }
    }

    private void a(emu emu2) {
        if (this.anY == null || this.anZ == null || this.aoa == null) {
            return;
        }
        loz loz2 = null;
        ayu ayu2 = emu2.bIT();
        switch (ayu2) {
            case cAU: {
                loz2 = ayu2.YF().bD(3);
                break;
            }
            case cAV: {
                loz2 = ayu2.YF().bD(ayi.aaK());
                break;
            }
            default: {
                loz2 = ayu2.YF().bD(new Object[0]);
            }
        }
        if (!ayu2.vA()) {
            this.cC(2);
        }
        this.anY.b(loz2, !ayu2.vA());
        this.anY = null;
        this.anZ = null;
        this.aoa = null;
    }
}

