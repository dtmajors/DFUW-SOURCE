/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  dtc
 *  dtn
 *  lcr
 *  lcw
 */
public class dtm
extends dtc {
    private final boolean hcq;
    private final int di;
    private dtm hcr = null;
    private dtm[] hcs = null;
    private ldv Sy = null;

    public dtm(boolean bl, int n) {
        assert (n > 0);
        this.hcq = bl;
        this.di = n;
        if (!this.hcq) {
            if (lcw.enb()) {
                this.Sy = lcr.ak((ldv)lcr.qzp, (int)this.di);
            } else {
                assert (lcr.qzp.ib() == this.di) : "NodeID PROBLEM!";
                this.Sy = lcr.qzp;
            }
        }
    }

    public int ib() {
        return this.di;
    }

    public dtm bAh() {
        return this.hcr;
    }

    public void a(dtm dtm2) {
        this.hcr = dtm2;
    }

    public dtm[] bAi() {
        return this.hcs;
    }

    public void a(dtm[] dtmArray) {
        this.hcs = dtmArray;
    }

    public ldv hk() {
        return this.Sy;
    }

    protected void e(kcz kcz2) {
        if (this.hbf == null && this != this.hcr) {
            this.hcr.e(kcz2);
        } else {
            assert (this.hbg != null) : "JavaToNativeMiddlewareMessageOutPipe is null. Can not add to Pipe!";
            this.hbg.p(kcz2);
        }
    }

    public void a(amf amf2) {
        assert (amf2 != null);
        if (amf2.getGUID() == null) assert (false);
        if (this.hcq) {
            int n = amf2.getGUID().ib();
            if (lcw.abY((int)n)) {
                super.a(amf2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].a(amf2);
                    return;
                }
            }
        } else {
            super.a(amf2);
        }
    }

    public void c(dta dta2) {
        assert (dta2 != null) : "OS = " + dta2;
        assert (dta2.getGUID() != null) : "ObjectSpace.getguid() = " + dta2.getGUID();
        if (this.hcq) {
            int n = dta2.getGUID().ib();
            if (lcw.abY((int)n)) {
                super.c(dta2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].c(dta2);
                    return;
                }
            }
        } else {
            super.c(dta2);
        }
    }

    public void doTick(ldz ldz2) {
        this.haE = ldz2;
        this.bzH();
        this.Z();
        if (this.hcq) {
            int n = this.haA.size();
            for (int i = 0; i < n; ++i) {
                dta dta2 = (dta)this.haA.get(i);
                if (!dta2.isActive()) continue;
                dta2.doTick(ldz2);
            }
            if (lcw.emZ() || lcw.enb()) {
                this.bzM();
            }
        } else {
            dta dta3 = null;
            if (!lcw.enf() && (dta3 = (dta)this.haz.get(this.Sy)) != null) {
                dta3.doTick(ldz2);
            }
            int n = this.haA.size();
            for (int i = 0; i < n; ++i) {
                dta3 = (dta)this.haA.get(i);
                if (!dta3.isActive() || dta3 instanceof dtn) continue;
                dta3.doTick(ldz2);
            }
        }
        if (lcw.ena() || lcw.enf() || lcw.enb() && this.hcq) {
            this.bzL();
        }
        this.bzG();
    }

    public void b(ba ba2) {
        assert (ba2 != null);
        ldv ldv2 = ba2.ec;
        if (ldv2 == null) {
            return;
        }
        if (this.hcq) {
            int n = ldv2.ib();
            if (lcw.abY((int)n)) {
                super.b(ba2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].b(ba2);
                    return;
                }
            }
        } else {
            super.b(ba2);
        }
    }

    public void b(kgz kgz2) {
        assert (kgz2 != null);
        ldv ldv2 = kgz2.dXh();
        if (ldv2 == null) {
            return;
        }
        if (this.hcq) {
            int n = ldv2.ib();
            if (lcw.abY((int)n)) {
                super.b(kgz2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].b(kgz2);
                    return;
                }
            }
        } else {
            super.b(kgz2);
        }
    }

    public void b(ktf ktf2) {
        assert (ktf2 != null);
        ldv ldv2 = ktf2.dXh();
        if (ldv2 == null) {
            return;
        }
        if (this.hcq) {
            int n = ldv2.ib();
            if (lcw.abY((int)n)) {
                super.b(ktf2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].b(ktf2);
                    return;
                }
            }
        } else {
            super.b(ktf2);
        }
    }

    public void c(ktv ktv2) {
        assert (ktv2 != null);
        ldv ldv2 = ktv2.dXh();
        if (ldv2 == null) {
            return;
        }
        if (this.hcq) {
            int n = ldv2.ib();
            if (lcw.abY((int)n)) {
                super.c(ktv2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].c(ktv2);
                    return;
                }
                if (!lcw.enb() && !lcw.eng()) assert (false);
            }
        } else {
            super.c(ktv2);
        }
    }

    public void a(jrq jrq2) {
        assert (jrq2 != null);
        ldv ldv2 = jrq2.dRt();
        if (ldv2 == null) {
            return;
        }
        if (this.hcq) {
            int n = ldv2.ib();
            if (lcw.abY((int)n)) {
                super.a(jrq2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].a(jrq2);
                    return;
                }
                if (!lcw.enb() && !lcw.eng()) assert (false);
            }
        } else {
            super.a(jrq2);
        }
    }

    public void a(miw miw2) {
        assert (miw2 != null);
        ldv ldv2 = miw2.dRt();
        if (ldv2 == null) {
            return;
        }
        if (this.hcq) {
            int n = ldv2.ib();
            if (lcw.abY((int)n)) {
                super.a(miw2);
            } else {
                assert (this.hcs != null);
                int n2 = this.hcs.length;
                for (int i = 0; i < n2; ++i) {
                    if (this.hcs[i].ib() != n) continue;
                    this.hcs[i].a(miw2);
                    return;
                }
                if (!lcw.enb() && !lcw.eng()) assert (false);
            }
        } else {
            super.a(miw2);
        }
    }

    public void a(aq aq2) {
        if (this.hcq) {
            super.a(aq2);
        } else {
            this.hcr.a(aq2);
        }
    }

    public final void b(kgh kgh2) {
        if (this.hcq) {
            super.b(kgh2);
        } else {
            this.hcr.b(kgh2);
        }
    }

    public void a(khd khd2) {
        if (this.hcq) {
            loi loi2;
            if (lcw.qHc && !(loi2 = loi.exd()).h(0, khd2)) {
                loi2.h(2, khd2);
                if (!lcw.qHd) {
                    assert (false);
                    return;
                }
            }
            super.a(khd2);
        } else {
            this.hcr.a(khd2);
        }
    }

    public void a(jrd jrd2) {
        if (this.hcq) {
            loi loi2;
            if (lcw.qHc && !(loi2 = loi.exd()).h(0, jrd2)) {
                loi2.h(2, jrd2);
                if (!lcw.qHd) {
                    assert (false);
                    return;
                }
            }
            super.a(jrd2);
        } else {
            this.hcr.a(jrd2);
        }
    }

    public void a(mii mii2) {
        if (this.hcq) {
            loi loi2;
            if (lcw.qHc && !(loi2 = loi.exd()).h(0, mii2)) {
                loi2.h(2, mii2);
                if (!lcw.qHd) {
                    assert (false);
                    return;
                }
            }
            super.a(mii2);
        } else {
            this.hcr.a(mii2);
        }
    }

    public void a(ksl ksl2) {
        if (this.hcq) {
            super.a(ksl2);
        } else {
            this.hcr.a(ksl2);
        }
    }

    public String toString() {
        return "SFSpecialObjectSpaceManager: ServerOSM=" + (Object)((Object)this.hcr);
    }

    protected void Z() {
        if (this.hcq) {
            this.bAc();
            this.bzX();
            this.bAd();
        }
        this.bzU();
        this.bzV();
        this.bzW();
        this.bzS();
        if (!this.hcq) {
            this.bzP();
            this.bzQ();
        }
        if (this.hcq) {
            this.bzT();
            this.bzZ();
            this.bzN();
        }
    }

    protected void P(dxq dxq2) {
        if (this.hcq) {
            if (dxq2.amk().tV(lcr.qzt)) {
                this.b((fof)dxq2);
            } else if (dxq2.amk().ib() == 1024) {
                this.T(dxq2);
            } else if (dxq2.amk().ib() == 7000) {
                this.U(dxq2);
            } else if (dxq2.amk().ib() == 65529) {
                this.hbf.p(dxq2);
            } else if (dxq2.bEA()) {
                this.a(1, dxq2);
            }
        } else if (dxq2.amk().tV(lcr.acL)) {
            if (lcw.enb()) {
                if (this.di == 7000) {
                    dxq dxq3 = this.V(dxq2);
                    if (dxq3 != null) {
                        assert (this.hcr != null);
                        this.hcr.P(dxq3);
                    }
                } else {
                    this.Q(dxq2);
                }
            } else {
                this.Q(dxq2);
            }
        } else if (dxq2.amk().tV(lcr.qzt)) {
            this.hcr.P(dxq2);
        } else if (dxq2.amk().equals(lcr.qAD)) {
            this.R(dxq2);
        } else if (!lcw.abY((int)dxq2.amk().ib())) {
            dxq dxq4 = this.V(dxq2);
            if (dxq4 != null) {
                assert (this.hcr != null);
                this.hcr.P(dxq4);
            }
        } else if (dxq2.aO().ib() == 1024) {
            this.T(dxq2);
        } else if (dxq2.aO().ib() == 7000) {
            this.U(dxq2);
        }
    }

    private ldv ad(ldv ldv2, int n) {
        return lcr.ak((ldv)ldv2, (int)n);
    }

    private dxq V(dxq dxq2) {
        if (!lcw.qGV || !lcw.qGW) {
            return null;
        }
        if (this.di == 7000) {
            if (dxq2.amk().equals(lcr.qzp)) {
                dxq2.on(this.ad(dxq2.amk(), 7000));
                return dxq2;
            }
            if (dxq2.amk().ib() != this.di) {
                dxq2.on(this.ad(dxq2.amk(), 1024));
                return dxq2;
            }
            return dxq2;
        }
        if (this.di == 1024) {
            if (dxq2.amk().ib() == this.di) {
                dxq2.on(this.ad(dxq2.amk(), 7000));
                return dxq2;
            }
            return dxq2;
        }
        return null;
    }

    private void a(int n, dxq dxq2) {
        gre gre2 = (gre)this.h(11034, lcr.qAC, dxq2.aO());
        gre2.Gi(n);
        gre2.Kw(dxq2.bEz());
        if (dxq2 instanceof dxu) {
            gre2.Kx(((dxu)((Object)dxq2)).aVk());
        }
        gre2.qx(dxq2.aO());
        gre2.qy(dxq2.amk());
        this.E(gre2);
    }
}

