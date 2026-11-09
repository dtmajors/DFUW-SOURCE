/*
 * Decompiled with CFR.
 */
import java.util.Map;

public abstract class ckr
extends btk {
    protected ckp eHb = null;
    protected ljq ekj = null;
    protected lgl ekk = null;
    protected ljq ekl = null;
    protected lgl ekm = null;
    protected boolean ekn = true;
    protected double eko = 0.0;
    protected boolean ekr = false;
    protected ljq eks = new ljq();
    protected lgl ekt = new lgl();
    private ljq eku = null;
    private lgl ekv = null;

    public ckr(ckp ckp2) {
        assert (ckp2 != null);
        this.eHb = ckp2;
        this.aqR();
    }

    private void aqR() {
        this.ekj = new ljq();
        this.ekk = new lgl();
        this.ekl = new ljq();
        this.ekm = new lgl();
        Map<String, eh> map = ei.ao(this.eHb.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint Structure Gate Open");
        if (eh2 == null) {
            assert (false);
        } else {
            this.ekl = new ljq(eh2.fb());
            this.ekm = new lgl(eh2.getRotation());
        }
        if ((eh2 = map.get("AttachPoint Structure Gate Closed")) == null) {
            assert (false);
        } else {
            this.ekj = new ljq(eh2.fb());
            this.ekk = new lgl(eh2.getRotation());
        }
    }

    public void doTick(ldz ldz2) {
        if (this.eHb.aAG() == null || this.eHb.aAG().axa() == null || !this.eHb.aAG().ayZ()) {
            return;
        }
        if (!this.ekr) {
            if (this.eHb.aAG().azb() != null && this.eHb.aAG().azc() != null && !this.eHb.aAG().azb().equals(this.eku)) {
                this.eku = this.eHb.aAG().av();
                this.ekv = this.eHb.aAG().aw();
                this.aIc();
                this.j(this.eks, this.ekt);
            }
        } else {
            this.aHZ();
        }
    }

    protected void aIc() {
        ljq ljq2 = new ljq(this.eHb.aAG().azb());
        lgl lgl2 = new lgl(this.eHb.aAG().azc());
        if (this.ekn) {
            ljq2.es(lgl2.eq(this.ekj));
            lgl2.Y(this.ekk);
        } else {
            ljq2.es(lgl2.eq(this.ekl));
            lgl2.Y(this.ekm);
        }
        this.eks = ljq2;
        this.ekt = lgl2;
    }

    protected void j(ljq ljq2, lgl lgl2) {
        if (this.eHb.aAG().axa() == null) {
            return;
        }
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.Rs = this.eHb.aAG().axa();
        kky2.hsP = false;
        kky2.iBr = false;
        kky2.ec = this.getGUID();
        kky2.pHF = 8;
        kky2.pHG = ljq2.x;
        kky2.pHH = ljq2.y;
        kky2.pHI = ljq2.rlV;
        kky2.rb = lgl2.x;
        kky2.rc = lgl2.y;
        kky2.rd = lgl2.rlV;
        kky2.pHJ = lgl2.rlW;
        this.MessageDelegator.a(kky2);
    }

    protected abstract void aHZ();

    protected void k(ljq ljq2, lgl lgl2) {
        ljq ljq3 = new ljq(this.eHb.aAG().azb());
        lgl lgl3 = new lgl(this.eHb.aAG().azc());
        ljq3.es(lgl3.eq(ljq2));
        lgl3.Y(lgl2);
        this.eks = ljq3;
        this.ekt = lgl3;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5635: {
                this.b((fut)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(fut fut2) {
        fuu fuu2 = (fuu)this.MessageDelegator.h(5636, this.GUID, fut2.aO());
        this.MessageDelegator.b(fut2, fuu2);
        fuu2.iXt = fut2.bSm();
        if ((fut2.bSm() & 1) != 0) {
            fuu2.dtj = null;
        }
        if ((fut2.bSm() & 4) != 0) {
            fuu2.Uj = this.eHb.aAG().axa();
        }
        this.MessageDelegator.F(fuu2);
    }

    public void remove() {
        this.MessageDelegator.hd(this.getGUID());
    }

    public final boolean aIe() {
        return this.ekn;
    }

    public final void fy(boolean bl) {
        this.ekn = bl;
    }

    public final boolean aRi() {
        return this.ekr;
    }
}

