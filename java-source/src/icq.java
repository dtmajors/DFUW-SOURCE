/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class icq
extends ipx {
    private icr lHr;
    private ipk lGR;
    private iou<ics> lHs;
    private ivd lHt;
    private iwr lHu;
    private ipx lHv;
    private ipx lHw;
    private List<icq> lHx;
    private icq lHy;
    private iws lHz;

    public icq(ibs ibs2, icw icw2) {
        icr icr2;
        this.lHr = icr2 = icw2.lGf.get(ibs2);
        this.a(new iqo(ire.mul, true));
        ipx ipx2 = ipx.h(new ipf[0]);
        this.W(ipx2);
        this.lGR = new ipk(0x1A1A1A);
        this.lGR.hz(0.7f);
        this.lGR.setVisible(false);
        ipx2.W(this.lGR);
        ipx ipx3 = ipx.c(0, 1, 0, 1, new ipf[0]);
        ipx2.W(ipx3);
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx3.W(ipx4);
        if (this.lHr.lHB.hasChildren()) {
            this.lHz = new iws(this){
                final /* synthetic */ icq lHA;
                {
                    this.lHA = icq2;
                }

                public void pn(boolean bl) {
                    icq.a(this.lHA).setVisible(bl);
                    icq.b(this.lHA).setVisible(bl);
                    if (icq.c(this.lHA) != null) {
                        icq.c(this.lHA).pack();
                    }
                }
            };
            ipx4.W(ipx.d(this.lHz));
        } else {
            ipx4.W(ipx.a(16, 1, new ipf[0]));
        }
        ipx ipx5 = new ipx(this, irl.dnr()){
            final /* synthetic */ icq lHA;
            {
                this.lHA = icq2;
                super(iqz2);
            }

            public boolean du(int n, int n2) {
                if (icq.d(this.lHA) != null) {
                    icq.d(this.lHA).hX(!icq.d(this.lHA).dir());
                    icq.d(this.lHA).pn(icq.d(this.lHA).dir());
                    return true;
                }
                return false;
            }
        };
        ipx5.W(new izy(icr2.lHB.cNq()));
        ipx4.W(ipx5);
        ipx4.W(ipx.c(new ipf[0]));
        this.lHs = new iou<ics>(this){
            final /* synthetic */ icq lHA;
            {
                this.lHA = icq2;
            }

            public void a(ics ics2) {
                icq.e((icq)this.lHA).lHC = ics2;
                if (icq.f(this.lHA) != null) {
                    for (icq icq2 : icq.f(this.lHA)) {
                        icq.g(icq2).setValue(ics2);
                    }
                }
            }

            public /* synthetic */ void S(Object object) {
                this.a((ics)((Object)object));
            }
        };
        for (ics ics2 : ics.values()) {
            ipx4.W(ipx.d(new ict(this.lHs, ics2)));
            ipx4.W(ipx.a(2, 1, new ipf[0]));
        }
        this.lHs.setValue(this.lHr.lHC);
        ipx4.W(ipx.a(6, 1, new ipf[0]));
        ipx4.W(new iwx(1, 24));
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        this.lHt = new ivd(this, this.lHr.color, lvw.tbv){
            final /* synthetic */ icq lHA;
            {
                this.lHA = icq2;
                super(n, lox2);
            }

            public void PW(int n) {
                icq.e((icq)this.lHA).color = n;
            }
        };
        ipx4.W(ipx.d(this.lHt));
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        ipx4.W(new iwx(1, 24));
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        this.lHu = new iwr(this, this.lHr.visible, icq.a(icw2, this.lHr)){
            final /* synthetic */ icq lHA;
            {
                this.lHA = icq2;
                super(bl, bl2);
            }

            public void pn(boolean bl) {
                Object object;
                icq.e((icq)this.lHA).visible = bl;
                if (hso.cxK().cxR().dMl() && icq.f(this.lHA) != null) {
                    this.sF(bl);
                    for (icq icq2 : icq.f(this.lHA)) {
                        icq.a(icq2, bl);
                    }
                }
                if (bl) {
                    object = icq.c(this.lHA);
                    while (object != null) {
                        icq.h((icq)object).sF(true);
                        object = icq.c((icq)object);
                    }
                } else {
                    object = icq.c(this.lHA);
                    while (object != null) {
                        icq.h((icq)object).sF(icq.i((icq)object));
                        object = icq.c((icq)object);
                    }
                }
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbS.bD(new Object[0]).exA());
            }
        };
        ipx4.W(ipx.d(this.lHu));
        ipx4.W(ipx.a(10, 1, new ipf[0]));
        this.a(ibs2, icw2);
    }

    @Override
    public void cND() {
        this.lGR.setVisible(this.dkb());
    }

    private void a(ibs ibs2, icw icw2) {
        List<ibs> list = this.lHr.lHB.getChildren();
        if (list == null) {
            return;
        }
        this.lHv = ipx.h(new ipf[0]);
        this.lHv.setVisible(false);
        this.c(this.lHv, 0);
        ipb ipb2 = new ipb(ibs2.cNu() == 0 ? "/dfdata/texture/gui/j2f/common/arrows/bg_window_expanded_arrow_lvl1.png" : "/dfdata/texture/gui/j2f/common/arrows/bg_window_expanded_arrow_lvl2.png");
        ipb2.a(new irm(16, 10));
        this.lHw = ipx.a(1, 2, ipx.l(ipb2, ipx.c(new ipf[0])));
        this.lHw.setVisible(false);
        this.c(this.lHw, 1);
        iqa iqa2 = new iqa(ibs2.cNu() == 0 ? "/dfdata/texture/gui/j2f/common/backgrounds/bg_window_expanded_lvl1.png" : "/dfdata/texture/gui/j2f/common/backgrounds/bg_window_expanded_lvl2.png", 4, 4, 4, 4);
        iqa2.a(iqb.mtp);
        this.lHv.W(iqa2);
        ipx ipx2 = ipx.j(new ipf[0]);
        this.lHv.W(ipx2);
        this.lHx = lcn.emv();
        for (ibs ibs3 : list) {
            if (!ibs3.cNv()) continue;
            icr icr2 = icw2.lGf.get(ibs3);
            icq icq2 = new icq(ibs3, icw2);
            icq2.lHy = this;
            ipx2.W(icq2);
            this.lHx.add(icq2);
        }
    }

    private boolean cNR() {
        if (this.lHx != null) {
            for (icq icq2 : this.lHx) {
                if (!icq2.lHr.visible) continue;
                return true;
            }
        }
        return false;
    }

    private void pN(boolean bl) {
        this.lHu.hX(bl);
        this.lHu.sF(bl && this.lHx != null);
        this.lHr.visible = bl;
        if (this.lHx != null) {
            for (icq icq2 : this.lHx) {
                icq2.pN(bl);
            }
        }
    }

    private static boolean a(icw icw2, icr icr2) {
        List<ibs> list = icr2.lHB.getChildren();
        if (list == null) {
            return false;
        }
        for (ibs ibs2 : list) {
            icr icr3 = icw2.lGf.get(ibs2);
            if (icr3 != null && icr3.visible) {
                return true;
            }
            if (!icq.a(icw2, icr3)) continue;
            return true;
        }
        return false;
    }

    static /* synthetic */ ipx a(icq icq2) {
        return icq2.lHv;
    }

    static /* synthetic */ ipx b(icq icq2) {
        return icq2.lHw;
    }

    static /* synthetic */ icq c(icq icq2) {
        return icq2.lHy;
    }

    static /* synthetic */ iws d(icq icq2) {
        return icq2.lHz;
    }

    static /* synthetic */ icr e(icq icq2) {
        return icq2.lHr;
    }

    static /* synthetic */ List f(icq icq2) {
        return icq2.lHx;
    }

    static /* synthetic */ iou g(icq icq2) {
        return icq2.lHs;
    }

    static /* synthetic */ void a(icq icq2, boolean bl) {
        icq2.pN(bl);
    }

    static /* synthetic */ iwr h(icq icq2) {
        return icq2.lHu;
    }

    static /* synthetic */ boolean i(icq icq2) {
        return icq2.cNR();
    }
}

