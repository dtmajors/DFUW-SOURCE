/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  mcs
 */
public class akt
extends aja
implements aku {
    private int bqK = 0;
    protected ddi bqL = null;
    protected buf bqM = null;
    protected ldv akX = null;
    protected String TC = null;
    protected boolean bqN = false;
    protected boolean bqO = false;

    public akt() {
        this.bog = ajb.b.bpi;
        this.TC = "SFTargetingConstraint";
    }

    public int DB() {
        return this.bqK;
    }

    public void fS(int n) {
        this.bqK = n;
        this.bqL = cxj.yt(this.bqK);
        if (this.bqL == null) {
            lfn.b(5, this.TC, "setTargetGroupType() Could not find targetgroup " + this.bqK);
            assert (false);
            return;
        }
    }

    public buf CN() {
        return this.bqM;
    }

    @Override
    public void reset() {
        super.reset();
        this.bqO = false;
        this.bqM = null;
        this.akX = null;
        this.bqN = false;
    }

    @Override
    protected boolean BU() {
        boolean bl;
        assert (this.bqL != null);
        if (this.boj.bfF()) {
            assert (this.bqM == null);
            return true;
        }
        this.bok = null;
        if (this.bqM == null) {
            bun bun2 = (bun)this.boj.getMessageDelegator().bzx().bzt().d(lcr.qBP);
            this.bqM = bun2.ayq();
        }
        if (!(bl = this.DC())) {
            this.bqM = null;
        }
        return bl;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        akt akt2 = (akt)aja2;
        akt2.fS(this.bqK);
    }

    private boolean DC() {
        jpx jpx2;
        bun bun2;
        assert (this.bqM != null);
        if (!this.bqL.zJ(this.bqM.az())) {
            String string = lea.enW().getName(this.bqM.az());
            this.bok = mcs.uBv.bD(new Object[0]);
            return false;
        }
        amf amf2 = this.Co().getMessageDelegator().bzx().bzt().d(lcr.qBP);
        if (amf2 instanceof bun && (bun2 = (bun)amf2) != null && (jpx2 = bun2.ayy()) != null && !jpx2.d(this.bqM.axQ(), this.bqM.az())) {
            this.bok = mcs.uBB.bD(new Object[0]);
            return false;
        }
        if (this.akX == null) {
            if (this.bqM.Uj() == null) {
                this.bok = mcs.uBv.bD(new Object[0]);
                return false;
            }
            this.akX = this.bqM.Uj();
            return true;
        }
        if (!this.akX.equals(this.bqM.Uj())) {
            this.bok = mcs.uBA.bD(new Object[0]);
            return false;
        }
        return true;
    }

    @Override
    public boolean o(dxq dxq2) {
        return false;
    }

    @Override
    public boolean a(ktv ktv2) {
        return false;
    }
}

