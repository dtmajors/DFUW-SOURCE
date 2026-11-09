/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  dtn
 *  lcr
 *  lcw
 */
public class jqg
extends btk {
    private final jpx hcu;
    private dtn coR = null;
    private boolean nRT = true;
    private int dBF = 1;
    private ldv Pu = null;

    public jqg(jpx jpx2) {
        this.hcu = jpx2;
    }

    @Override
    public void initialize() {
        this.coR = (dtn)this.MessageDelegator;
    }

    public void e(lby lby2, boolean bl) {
        int n = lby2.getType();
        if (n == jpq.nOI) {
            if (!this.hcu.dQe().nRu) {
                lfn.b(5, "SFTestActionHandler", "triggerTestAction() You must enable moving the camera first.");
                return;
            }
            this.hcu.dQd().dPQ();
        } else if (n == jpq.nOK) {
            if (!this.hcu.dQe().nRu) {
                lfn.b(5, "SFTestActionHandler", "triggerTestAction() You must enable moving the camera first.");
                return;
            }
            this.hcu.dQd().dPS();
        } else if (n == jpq.nOL) {
            if (!this.hcu.dQe().nRu) {
                lfn.b(5, "SFTestActionHandler", "triggerTestAction() You must enable moving the camera first.");
                return;
            }
            this.hcu.dQd().dPT();
        } else if (n == jpq.nOJ) {
            if (!this.hcu.dQe().nRu) {
                lfn.b(5, "SFTestActionHandler", "triggerTestAction() You must enable moving the camera first.");
                return;
            }
            this.hcu.dQd().dPR();
        } else if (n == jpq.nOM) {
            this.h(lby2, bl);
        } else if (n == jpq.nON) {
            this.i(lby2, bl);
        } else if (n == jpq.nOO) {
            this.j(lby2, bl);
        } else if (n == jpq.nOP) {
            this.k(lby2, bl);
        } else if (n == jpq.nOG) {
            this.f(lby2, bl);
        } else if (n == jpq.nOH) {
            this.g(lby2, bl);
        } else if (n == jpq.nOQ) {
            this.nRT = !this.nRT;
            edj edj2 = (edj)this.MessageDelegator.h(12810, this.GUID, this.ayp());
            edj2.DI(3);
            edj2.setActive(this.nRT);
            this.MessageDelegator.F(edj2);
        } else {
            lfn.b(5, "SFTestActionHandler", "triggerTestAction() Unhandled action provided: '" + lby2.getName() + "'");
        }
    }

    private ldv ayp() {
        return this.hcu.dQf().axF().getGUID();
    }

    private void f(lby lby2, boolean bl) {
        if (!lcw.enb()) {
            return;
        }
        float f = 10.0f;
        float f2 = -10.0f;
        ldv ldv2 = lcr.ak((ldv)this.ayp(), (int)3);
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(f);
        als2.ga(1);
        als2.fC(352);
        if (ctg.ffa) {
            als2.gb(als2.DX() | 4);
        }
        if (als2.DV() > 0.0 && als2.El()) {
            int n = (int)als2.DV() * 1;
            float f3 = f2 / (float)n;
            lfn.b(0, "SFTestActionHandler", "handleAddFixedModifier() ExpirationTime=" + als2.DV() + " NumberOfTicks=" + n + " TickIncrease=" + f3);
            als2.gc(n);
            als2.ar(f3);
            als2.aq(0.0f);
            als2.as(f2);
        } else if (als2.DV() == -2.0 && als2.El()) {
            als2.gc(1);
            als2.aq(0.0f);
            als2.ar(f2);
            als2.aq(0.0f);
            als2.as(0.0f);
        } else {
            als2.gc(0);
            als2.ar(0.0f);
            als2.aq(f2);
            als2.as(f2);
        }
        als2.cP(this.GUID);
        als2.gd(cug.fhT);
        als2.ge(cxd.fHN);
        als2.fJ(4896);
        als2.gf(this.dBF);
        ++this.dBF;
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, ldv2);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{als2};
        lfn.b(0, "SFTestActionHandler", "handleAddFixedModifier() Sending ModifierAddMessage to " + frg2.amk());
        this.MessageDelegator.F(frg2);
    }

    private void g(lby lby2, boolean bl) {
        if (!lcw.enb()) {
            return;
        }
        float f = lgp.erA().acI(1) * 20.0f + 3.0f;
        float f2 = 10.0f;
        ldv ldv2 = lcr.ak((ldv)this.ayp(), (int)3);
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(f);
        als2.ga(1);
        als2.fC(352);
        if (als2.DV() > 0.0 && als2.El()) {
            int n = (int)als2.DV() * 1;
            float f3 = f2 / (float)n;
            lfn.b(0, "SFTestActionHandler", "handleAddRandomModifier() ExpirationTime=" + als2.DV() + " NumberOfTicks=" + n + " TickIncrease=" + f3);
            als2.gc(n);
            als2.ar(f3);
            als2.aq(0.0f);
            als2.as(f2);
        } else if (als2.DV() == -2.0 && als2.El()) {
            als2.gc(1);
            als2.aq(0.0f);
            als2.ar(f2);
            als2.aq(0.0f);
            als2.as(0.0f);
        } else {
            als2.gc(0);
            als2.ar(0.0f);
            als2.aq(f2);
            als2.as(f2);
        }
        als2.cP(this.GUID);
        als2.gd(cug.fhT);
        als2.ge(cxd.fHN);
        als2.fJ(4896);
        als2.gf(this.dBF);
        ++this.dBF;
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, ldv2);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{als2};
        lfn.b(0, "SFTestActionHandler", "handleAddRandomModifier() Sending ModifierAddMessage to " + frg2.amk());
        this.MessageDelegator.F(frg2);
    }

    private void h(lby lby2, boolean bl) {
        if (!lcw.enb()) {
            return;
        }
    }

    private void i(lby lby2, boolean bl) {
        if (!lcw.enb()) {
            return;
        }
    }

    private void j(lby lby2, boolean bl) {
        if (!lcw.enb()) {
            return;
        }
    }

    private void k(lby lby2, boolean bl) {
        if (!lcw.enb()) {
            return;
        }
    }
}

