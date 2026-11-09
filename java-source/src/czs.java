/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  bri
 *  cbx
 *  cex
 *  cug
 *  lcr
 *  lcw
 *  mcs
 */
public class czs
extends czc {
    private bqs gaE = null;
    private lef dIW = null;
    private boolean gaF = false;
    private boolean gax = false;
    private cbx gaG = null;

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected boolean b(cwx.a a2, cwx.a a3) {
        if (a2 == cwx.a.fGw && this.gaF) {
            this.gax = true;
            return true;
        }
        return super.b(a2, a3);
    }

    @Override
    protected void a(czc.a a2) {
        if (a2 == czc.a.fZG) {
            float f2;
            akc akc2;
            if (this.emI.bgQ() instanceof cex && ((cex)this.emI.bgQ()).aMz().bdh()) {
                this.bhw();
                return;
            }
            if (this.fGh.akX == null) {
                for (int i2 = 0; i2 < this.fGe.length; ++i2) {
                    brp[] brpArray;
                    if (!(this.fGe[i2] instanceof akc) || (akc2 = (akc)this.fGe[i2]).Dc() == null || (brpArray = akc2.Dc().avX()) == null) continue;
                    for (int i3 = 0; i3 < brpArray.length; ++i3) {
                        if (brpArray[i3].ResourceType != akc2.az()) continue;
                        this.fGh.akX = brpArray[i3].GUID;
                        break;
                    }
                    if (this.fGh.akX != null) break;
                }
            }
            assert (!this.fGZ);
            assert (this.fGh.akX != null);
            assert (this.fGi == null);
            ldv ldv2 = this.fGh.akX;
            if (this.emI.bgQ() != null && this.emI.bgQ().aAG() != null && (f2 = this.emI.bgQ().aAG().azb().y) < -1000.0f) {
                this.a(mcs.uzg.bD(new Object[0]));
                this.bhw();
                return;
            }
            akc2 = (brg)this.emI.bgQ().aJC().asf();
            this.gaE = akc2.iK(ldv2);
            if (this.gaE == null) {
                this.bhw();
                return;
            }
            this.dIW = akc2.auo().iX(ldv2);
            if (this.dIW == null) {
                this.bhw();
                return;
            }
        } else if (a2 != czc.a.fZH && a2 == czc.a.fZI) {
            assert (this.gaE != null);
            assert (this.dIW != null);
            assert (this.gaG == null);
            if (!this.bfg()) {
                brg brg2 = (brg)this.emI.bgQ().aJC().asf();
                brg2.auo().a(this.gaE.getGUID(), this.dIW);
                this.a(mcs.uyC.bD(this.Bu()));
                this.bhw();
                return;
            }
            brg brg3 = (brg)this.emI.bgQ().aJC().asf();
            brg3.a(this.gaE.getGUID(), this.dIW, 1, bqy.dHw);
            this.ck(this.gaE.az() == cug.fpM ? cug.fpO : cug.fpN);
            this.gaF = true;
        }
    }

    @Override
    protected void bex() {
        super.bex();
        if (this.gaE != null) {
            assert (this.dIW != null);
            this.emI.bgQ().aJC().asf().auo().a(this.gaE.getGUID(), this.dIW);
        }
        this.gaE = null;
        this.dIW = null;
        this.gaF = false;
        this.gax = false;
        this.gaG = null;
    }

    private bqs x(cbx cbx2) {
        lgw lgw2 = (lgw)ResourceTree.acv(cbx2.az());
        assert (lgw2 != null);
        ej ej2 = cbx2.fi().ae(1104);
        if (ej2 == null) {
            return null;
        }
        bqs bqs2 = new bqs();
        bqs2.setGUID(cbx2.getGUID());
        bqs2.l(cbx2.az());
        bqs2.do(cbx2.vf());
        bqs2.b(lgw2.auO());
        bqs2.g(ej2.fn());
        bqs2.avb();
        return bqs2;
    }

    private void a(gfn gfn2) {
        ff ff2;
        if (gfn2.aqs != this.aYH) {
            return;
        }
        assert (this.gaF);
        this.gaF = false;
        if (gfn2.dtF == null) {
            this.bhw();
            return;
        }
        this.gaG = gfn2.dtF;
        this.MessageDelegator.a((amf)this.gaG);
        fh fh2 = (fh)this.gaG.jm().ae(9648);
        if (fh2 == null) {
            this.bhw();
            return;
        }
        ljq ljq2 = this.emI.bgQ().aAG().av();
        assert (ljq2 != null);
        ljq2.es(new ljq(0.0f, 0.5f, 0.0f));
        fh2.L(ljq2);
        lej lej2 = lcw.dW((ljq)ljq2);
        if (lej2 == null) {
            this.bhw();
            return;
        }
        String string = lcw.f((lej)lej2);
        if (string == null) {
            this.bhw();
            return;
        }
        String string2 = lea.eoS().get(string.toLowerCase());
        if (string2 == null) {
            string2 = "Unknown Tile";
        }
        if ((ff2 = (ff)this.gaG.jm().ae(9632)) == null) {
            this.bhw();
            return;
        }
        ff2.av(string2);
        ew ew2 = this.gaG.jm().ao(1248);
        if (ew2 == null) {
            this.bhw();
            return;
        }
        ew2.bi(1);
        bqs bqs2 = this.x(this.gaG);
        ((bri)this.emI.bgQ().aJC().asf()).a(bqs2, bqy.dGt);
        this.bhq();
        this.bhr();
        if (this.gax) {
            this.beQ();
        }
    }

    private void ck(int n2) {
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.aqs = this.aYH;
        gfm2.ResourceType = n2;
        gfm2.iSi = 1;
        gfm2.Yc = this.GUID.bFk();
        gfm2.asi = 1;
        this.MessageDelegator.F(gfm2);
    }
}

