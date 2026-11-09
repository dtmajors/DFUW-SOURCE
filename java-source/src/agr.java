/*
 * Decompiled with CFR.
 */
public class agr
extends ago {
    public agr() {
        this.bls = ahu.c.bms;
    }

    public void a(bpy bpy2, int n) {
        if (bpy2 == null) {
            return;
        }
        assert (bpy2.getGUID() != null);
        agg agg2 = new agg(false);
        agg2.eS(this.BK());
        agg2.J(1, n);
        agg2.setGUID(bpy2.getGUID());
        if (bpy2 instanceof bqe) {
            agg2.eP(2);
        } else if (bpy2 instanceof brz) {
            agg2.eP(3);
        } else {
            return;
        }
        this.a(agg2);
        this.a(agg2.AK(), new Integer(n));
        this.BE();
        agu agu2 = new agu();
        agu2.a(agg2);
        agg2.b(agu2);
        this.a(agu2, this.AO());
    }

    @Override
    public void a(gym gym2, int n) {
        assert (gym2 != null);
        assert (n >= 0);
        switch (gym2.bEz()) {
            case 12037: {
                this.a((gyf)gym2, n);
                break;
            }
            case 12040: {
                this.a((gyj)gym2, n);
                break;
            }
            default: {
                super.a(gym2, n);
            }
        }
    }

    @Override
    public void initialize() {
        this.AO().AZ().J(256, this.nN());
        this.a(this.AO().AZ());
    }

    @Override
    public void eE(int n) {
        Integer n2 = new Integer(n);
        agj agj2 = this.fw(n);
        if (agj2 == null) {
            return;
        }
        this.b(agj2);
        this.d(n2);
        if (agj2 instanceof agg) {
            agg agg2 = (agg)agj2;
            this.cI(agg2.getGUID());
        } else if (agj2 instanceof agp) {
            agp agp2 = (agp)agj2;
            this.cI(agp2.getGUID());
        } else {
            return;
        }
    }

    private void a(gyf gyf2, int n) {
        agu agu2;
        assert (gyf2 != null);
        assert (gyf2.aCK != null);
        if ((gyf2.aXP & 1) > 0) {
            this.q(gyf2.aCK, n);
        }
        if ((gyf2.aXP & 2) > 0) {
            agu2 = this.cG(gyf2.aCK);
            if (agu2 == null) {
                return;
            }
            assert (agu2.AZ() != null);
            assert (agu2.AZ() instanceof agg);
            this.a((agg)agu2.AZ(), n);
        }
        if ((gyf2.aXP & 4) > 0) {
            agu2 = this.cG(gyf2.aCK);
            if (agu2 == null) {
                return;
            }
            assert (agu2.AZ() != null);
            assert (agu2.AZ() instanceof agg);
            this.a((agg)agu2.AZ(), gyf2, n);
        }
    }

    private void a(gyj gyj2, int n) {
        boolean bl = false;
        if ((gyj2.aXP & 1) > 0) {
            this.c(gyj2, n);
            bl = true;
        }
        if ((gyj2.aXP & 2) > 0) {
            this.d(gyj2, n);
            bl = true;
        }
        if ((gyj2.aXP & 4) > 0) {
            this.r(gyj2.aCK, n);
            bl = true;
        }
        if (!bl) {
            // empty if block
        }
    }

    private void q(ldv ldv2, int n) {
        if (ldv2 == null) {
            return;
        }
        agg agg2 = new agg(false);
        agg2.eS(this.BK());
        agg2.J(1, n);
        agg2.setGUID(ldv2);
        agg2.eP(1);
        this.a(agg2);
        this.a(agg2.AK(), new Integer(n));
        this.BE();
        agu agu2 = new agu();
        agu2.a(agg2);
        agg2.b(agu2);
        this.a(agu2, this.AO());
    }

    private void b(gyj gyj2, int n) {
        assert (gyj2 != null);
        agu agu2 = this.cG(gyj2.aXQ);
        if (agu2 == null) {
            return;
        }
        assert (agu2.AZ() != null);
        agp agp2 = new agp();
        agp2.eS(this.BK());
        agp2.J(1, n);
        agp2.setGUID(gyj2.aCK);
        agp2.l(gyj2.ResourceType);
        agp2.do(gyj2.asi);
        agp2.setWeight(gyj2.aXy);
        agp2.fc(gyj2.aCJ);
        agp2.fd(gyj2.aXS);
        agp2.u(gyj2.aXU);
        this.a(agp2);
        this.a(agp2.AK(), (Integer)n);
        this.BE();
        agu agu3 = new agu();
        agu3.a(agp2);
        agp2.b(agu3);
        this.a(agu3, agu2);
    }

    private void a(gyj gyj2, agp agp2, int n) {
        assert (gyj2 != null);
        assert (agp2 != null);
        boolean bl = true;
        if (agp2.az() != gyj2.ResourceType) {
            bl = false;
        } else if (agp2.AR() != gyj2.aCJ) {
            bl = false;
        } else if (agp2.AS() != gyj2.aXS) {
            bl = false;
        } else if (agp2.AT() != gyj2.aXT) {
            bl = false;
        }
        if (!bl) {
            return;
        }
        assert (agp2.AW() != null);
        assert (gyj2.aXQ != null);
        agp2.do(gyj2.asi);
        agp2.u(gyj2.aXU);
        agp2.J(2, n);
        this.a(agp2.AK(), (Integer)n);
        if (agp2.AW().equals(gyj2.aXQ)) {
            this.BE();
        } else {
            this.a(agp2, gyj2.aXQ, gyj2.aXR, n);
        }
        this.a(agp2.AU());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c(gyj gyj2, int n) {
        if (this.cF(gyj2.aCK)) {
            agu agu2 = this.cG(gyj2.aCK);
            assert (agu2 != null);
            assert (agu2.AZ() != null);
            agt agt2 = agu2.AZ();
            if (!(agt2 instanceof agp)) {
                return;
            }
            agp agp2 = (agp)agt2;
            this.a(gyj2, agp2, n);
            if (!this.SW.i(this.getGUID(), agt2.AJ())) return;
            this.SW.a(this, agt2.AJ());
            return;
        } else {
            this.b(gyj2, n);
        }
    }

    private void a(agp agp2, ldv ldv2, ldv ldv3, int n) {
        agu agu2;
        assert (agp2 != null);
        assert (ldv2 != null);
        if (agp2.AW().equals(ldv2)) {
            // empty if block
        }
        if ((agu2 = this.cG(agp2.getGUID())) == null) {
            return;
        }
        agu agu3 = this.cG(ldv2);
        if (agu3 == null) {
            return;
        }
        agu2.AX().f(agu2);
        agu3.d(agu2);
        agp2.cJ(ldv3);
        agp2.J(64, n);
        this.BE();
    }

    private void a(agg agg2, int n) {
        assert (agg2 != null);
        assert (this.SW != null);
        agg2.J(4, n);
        this.a(agg2.AK(), (Integer)n);
        this.BE();
        this.cH(agg2.GUID);
        this.SW.b(this, agg2.AJ());
    }

    private void a(agp agp2, int n) {
        assert (agp2 != null);
        assert (this.SW != null);
        agp2.J(4, n);
        this.a(agp2.AK(), (Integer)n);
        this.BE();
        this.cH(agp2.GUID);
        this.SW.b(this, agp2.AJ());
    }

    private void r(ldv ldv2, int n) {
        assert (ldv2 != null);
        agu agu2 = this.cG(ldv2);
        if (agu2 == null) {
            return;
        }
        assert (agu2.AZ() != null);
        if (agu2.AZ() instanceof agp) {
            this.a((agp)agu2.AZ(), n);
        }
    }

    private void a(agg agg2, gyf gyf2, int n) {
        assert (this.SW != null);
        if ((gyf2.aXP & 4) > 0) {
            if (gyf2.aXy < 0.0f) {
                return;
            }
            if (gyf2.aXy != agg2.getWeight()) {
                agg2.J(256, n);
                agg2.setWeight(gyf2.aXy);
            }
        } else {
            return;
        }
        this.a(agg2.AK(), (Integer)n);
        this.BE();
    }

    private void a(agp agp2, gyj gyj2, int n) {
        assert (this.SW != null);
        if ((gyj2.aXP & 8) > 0) {
            this.a(agp2, gyj2.aXQ, gyj2.aXR, n);
        } else if ((gyj2.aXP & 0x10) > 0) {
            agp2.J(128, n);
            agp2.do(gyj2.asi);
        } else if ((gyj2.aXP & 0x20) > 0) {
            if (gyj2.aXy < 0.0f) {
                return;
            }
            if (gyj2.aXy == agp2.getWeight()) {
                return;
            }
            agp2.J(256, n);
            agp2.setWeight(gyj2.aXy);
        } else if ((gyj2.aXP & 0x40) > 0) {
            agp2.J(512, n);
            agp2.fc(gyj2.aCJ);
        } else if ((gyj2.aXP & 0x80) > 0) {
            agp2.J(1024, n);
            agp2.fc(-1);
        } else if ((gyj2.aXP & 0x100) > 0) {
            agp2.J(2048, n);
            agp2.aN(gyj2.aXT);
        } else if ((gyj2.aXP & 0x200) > 0) {
            agp2.J(4096, n);
            agp2.aN(gyj2.aXT);
        } else if ((gyj2.aXP & 0x400) > 0) {
            agp2.J(8192, n);
            agp2.fd(gyj2.aXS);
        } else if ((gyj2.aXP & 0x800) > 0) {
            agp2.J(16384, n);
            agp2.fd(-1);
        } else if ((gyj2.aXP & 0x1000) > 0) {
            agp2.J(32768, n);
            agp2.fc(gyj2.aCJ);
            agp2.fd(gyj2.aXS);
        } else {
            return;
        }
        this.a(agp2.AK(), new Integer(n));
        this.BE();
    }

    private void d(gyj gyj2, int n) {
        assert (gyj2 != null);
        agu agu2 = this.cG(gyj2.aCK);
        if (agu2 == null) {
            return;
        }
        assert (agu2.AZ() != null);
        if (agu2.AZ() instanceof agp) {
            this.a((agp)agu2.AZ(), gyj2, n);
        }
    }
}

