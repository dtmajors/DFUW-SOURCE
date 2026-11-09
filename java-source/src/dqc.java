/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class dqc
extends dpz {
    private Map<ldv, dqb> gIw = lcn.emw();

    public ldv[] bsU() {
        return this.gIw.keySet().toArray(new ldv[this.gIw.size()]);
    }

    dqc(dpx dpx2) {
        super(dpx2);
    }

    @Override
    void a(pf pf2) {
    }

    @Override
    void b(pf pf2) {
    }

    @Override
    void aJd() {
        this.bsV();
    }

    @Override
    void aJe() {
        this.bsD();
    }

    @Override
    void aJf() {
        this.bsW();
    }

    @Override
    void bsR() {
        this.bsD();
    }

    @Override
    void bsS() {
        this.bsD();
    }

    @Override
    void aSn() {
        this.bsD();
    }

    private void bsV() {
        bbh bbh2 = new bbh();
        bbh2.setGUID(this.emh.getGUID());
        bbh2.setID(this.emh.getID());
        bbh2.c(this.emh.av());
        bbh2.ch(this.emh.bqi());
        bbh2.ao(this.emh.aeY());
        bbh2.ar(this.emh.bse());
        bbh2.aH(this.emh.bsz());
        bbh2.aI(this.emh.bsy());
        bbh2.cr(this.emh.bsC());
        gvk gvk2 = (gvk)this.MessageDelegator.h(32258, this.GUID, lcr.qEx);
        gvk2.f(bbh2);
        this.MessageDelegator.F(gvk2);
    }

    private void bsW() {
        gvj gvj2 = (gvj)this.MessageDelegator.h(32262, this.GUID, lcr.qEx);
        gvj2.cl(this.emh.getGUID());
        gvj2.jv(this.emh.bqi());
        this.MessageDelegator.F(gvj2);
    }

    private void bsD() {
        gvl gvl2 = (gvl)this.MessageDelegator.h(32263, this.GUID, lcr.qEx);
        gvl2.cl(this.emh.getGUID());
        gvl2.ao(this.emh.aeY());
        gvl2.ar(this.emh.bse());
        gvl2.aH(this.emh.bsz());
        gvl2.aI(this.emh.bsy());
        gvl2.cr(this.emh.bsC());
        this.MessageDelegator.F(gvl2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24329: {
                this.b((gbn)dxq2);
                break;
            }
            case 24334: {
                this.b((gbm)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(gbn gbn2) {
        dqb dqb2 = this.gIw.get(gbn2.afl());
        if (dqb2 == null) {
            dqb2 = new dqb(gbn2.afl(), gbn2.afw(), gbn2.afx());
            this.gIw.put(dqb2.afl(), dqb2);
        }
        ldv ldv2 = dqb2.abj();
        dqb2.a(gbn2);
        if (dqb2.abj() != gbn2.abj() && ldv2 != null) {
            boolean bl = false;
            for (dqb dqb3 : this.gIw.values()) {
                if (!dqb3.abj().equals(ldv2)) continue;
                bl = true;
            }
            if (!bl) {
                this.emh.nz(ldv2);
            }
        }
    }

    private void b(gbm gbm2) {
        dqb dqb2 = this.gIw.get(gbm2.afl());
        if (dqb2 != null) {
            dqb2.a(gbm2);
        }
    }
}

