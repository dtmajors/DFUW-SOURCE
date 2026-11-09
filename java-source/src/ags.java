/*
 * Decompiled with CFR.
 */
public class ags
extends ago {
    public ags() {
        this.bls = ahu.c.bmt;
    }

    @Override
    public void a(gym gym2, int n) {
        assert (gym2 != null);
        assert (n >= 0);
        if (gym2.bEz() != 12050) {
            return;
        }
        boolean bl = false;
        gyz gyz2 = (gyz)gym2;
        if ((gyz2.aXP & 1) > 0) {
            this.a(gyz2, n);
            bl = true;
        }
        if ((gyz2.aXP & 2) > 0) {
            this.d(gyz2, n);
            bl = true;
        }
        if ((gyz2.aXP & 4) > 0) {
            this.s(gyz2.aCK, n);
            bl = true;
        }
        if (!bl) {
            // empty if block
        }
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
        if (agj2 instanceof agv) {
            agv agv2 = (agv)agj2;
            this.cI(agv2.getGUID());
        } else if (agj2 instanceof ahq) {
            ahq ahq2 = (ahq)agj2;
            this.cI(ahq2.getGUID());
        } else {
            return;
        }
    }

    private void a(gyz gyz2, int n) {
        if (this.cF(gyz2.aCK)) {
            agu agu2 = this.cG(gyz2.aCK);
            assert (agu2 != null);
            assert (agu2.AZ() != null);
            agt agt2 = agu2.AZ();
            int n2 = 0;
            if (agt2 instanceof agv) {
                agv agv2 = (agv)agt2;
                n2 = agv2.AJ();
            } else if (agt2 instanceof ahq) {
                ahq ahq2 = (ahq)agt2;
                n2 = ahq2.AJ();
            } else {
                return;
            }
            if (this.SW.i(this.getGUID(), n2)) {
                this.SW.a(this, n2);
            } else {
                return;
            }
        }
        switch (gyz2.eDY) {
            case 1: {
                this.b(gyz2, n);
                break;
            }
            case 2: {
                this.c(gyz2, n);
                break;
            }
        }
    }

    private void b(gyz gyz2, int n) {
        assert (gyz2 != null);
        agv agv2 = new agv();
        agv2.eS(this.BK());
        agv2.J(1, n);
        agv2.setGUID(gyz2.aCK);
        agv2.l(gyz2.ResourceType);
        agv2.do(gyz2.asi);
        agv2.aa(gyz2.aXV);
        agv2.setWeight(gyz2.aXy);
        this.a(agv2);
        this.a(agv2.AK(), new Integer(n));
        this.BE();
        agu agu2 = new agu();
        agu2.a(agv2);
        this.a(agu2, this.AO());
    }

    private void c(gyz gyz2, int n) {
        assert (gyz2 != null);
        ahq ahq2 = new ahq();
        ahq2.eS(this.BK());
        ahq2.J(1, n);
        ahq2.setGUID(gyz2.aCK);
        ahq2.eI(gyz2.SkillType);
        ahq2.ag(gyz2.SkillLevel);
        ahq2.aa(gyz2.aXV);
        this.a(ahq2);
        this.a(ahq2.AK(), new Integer(n));
        this.BE();
        agu agu2 = new agu();
        agu2.a(ahq2);
        this.a(agu2, this.AO());
    }

    private void d(gyz gyz2, int n) {
        assert (gyz2 != null);
        agu agu2 = this.cG(gyz2.aCK);
        if (agu2 == null) {
            return;
        }
        assert (agu2.AZ() != null);
        if (agu2.AZ() instanceof agv) {
            this.a((agv)agu2.AZ(), gyz2, n);
        } else if (agu2.AZ() instanceof ahq) {
            this.a((ahq)agu2.AZ(), gyz2, n);
        }
    }

    private void a(agv agv2, gyz gyz2, int n) {
        assert (this.SW != null);
        boolean bl = false;
        if ((gyz2.aXP & 8) > 0 && agv2.Bb() != gyz2.aXV) {
            agv2.aa(gyz2.aXV);
            agv2.J(16, n);
            bl = true;
        }
        if ((gyz2.aXP & 0x10) > 0 && agv2.vf() != gyz2.asi) {
            agv2.do(gyz2.asi);
            agv2.J(128, n);
            bl = true;
        }
        if (bl) {
            this.a(agv2.AK(), new Integer(n));
            this.BE();
        }
    }

    private void a(ahq ahq2, gyz gyz2, int n) {
        assert (this.SW != null);
        boolean bl = false;
        if (ahq2.Bb() != gyz2.aXV) {
            ahq2.aa(gyz2.aXV);
            ahq2.J(8, n);
            bl = true;
        }
        if (ahq2.Bt() != gyz2.SkillLevel) {
            ahq2.ag(gyz2.SkillLevel);
            ahq2.J(8, n);
            bl = true;
        }
        if (bl) {
            this.a(ahq2.AK(), new Integer(n));
            this.BE();
        }
    }

    private void s(ldv ldv2, int n) {
        assert (ldv2 != null);
        agu agu2 = this.cG(ldv2);
        if (agu2 == null) {
            return;
        }
        assert (agu2.AZ() != null);
        if (agu2.AZ() instanceof agv) {
            this.a((agv)agu2.AZ(), n);
        } else if (agu2.AZ() instanceof ahq) {
            this.a((ahq)agu2.AZ(), n);
        }
    }

    private void a(agv agv2, int n) {
        assert (agv2 != null);
        assert (this.SW != null);
        agv2.J(4, n);
        this.a(agv2.AK(), new Integer(n));
        this.BE();
        this.SW.b(this, agv2.AJ());
    }

    private void a(ahq ahq2, int n) {
        assert (ahq2 != null);
        assert (this.SW != null);
        ahq2.J(4, n);
        this.a(ahq2.AK(), new Integer(n));
        this.BE();
        this.SW.b(this, ahq2.AJ());
    }
}

