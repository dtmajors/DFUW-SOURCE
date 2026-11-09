/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cdb
 *  cxd
 */
public class bqf {
    private final brg dBE;
    private int dBF = 1;

    public bqf(brg brg2) {
        this.dBE = brg2;
    }

    public void a(bqs bqs2, es es2) {
        assert (bqs2 != null);
        assert (es2 != null);
        if (es2.getType() == 1616) {
            return;
        }
        if (es2.fG() != null) {
            return;
        }
        this.b(bqs2, es2);
    }

    public void b(bqs bqs2) {
        assert (bqs2 != null);
        es es2 = (es)bqs2.ae(1440);
        if (es2 != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1456)) != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1568)) != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1584)) != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1600)) != null) {
            this.b(bqs2, es2);
        }
    }

    public void c(bqs bqs2) {
        assert (bqs2 != null);
        es es2 = (es)bqs2.ae(1440);
        if (es2 != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1456)) != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1568)) != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1584)) != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1600)) != null) {
            this.c(bqs2, es2);
        }
    }

    public void d(bqs bqs2) {
        assert (bqs2 != null);
        es es2 = (es)bqs2.ae(1440);
        if (es2 != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1456)) != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1568)) != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1584)) != null) {
            this.c(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1600)) != null) {
            this.c(bqs2, es2);
        }
    }

    public void e(bqs bqs2) {
        assert (bqs2 != null);
        es es2 = (es)bqs2.ae(1440);
        if (es2 != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1456)) != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1568)) != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1584)) != null) {
            this.b(bqs2, es2);
        }
        if ((es2 = (es)bqs2.ae(1600)) != null) {
            this.b(bqs2, es2);
        }
    }

    private void b(bqs bqs2, es es2) {
        assert (bqs2 != null);
        assert (es2 != null);
        cdb cdb2 = (cdb)this.dBE.auk();
        ald ald2 = es2.fH();
        if (ald2 instanceof ale) {
            ale ale2 = (ale)ald2;
            cdb2.jk().bhi().a(ale2, es2.fE());
        } else if (ald2 instanceof alf) {
            alf alf2 = (alf)ald2;
            cdb2.aJB().bqd = alf2.bqd;
            if (es2.getType() == 1600) {
                cdb2.aJB().geP = es2.fE();
            } else {
                cdb2.aJB().geO = es2.fE();
            }
            cdb2.aJY();
        } else if (ald2 instanceof alg) {
            assert (es2.fG() == null);
            alg alg2 = (alg)ald2;
            ldi ldi2 = (ldi)lea.enT().acv(alg2.aYG);
            lce[] lceArray = ldi2.enl();
            if (lceArray == null || lceArray.length == 0) {
                lfn.b(5, "SFEnchantmentManager", "createEnchantment() Effect '" + ldi2.getName() + "' has no attributealterations.");
                return;
            }
            float f2 = es2.fE();
            if (lceArray[0].qvU < 0.0f && f2 > 0.0f) {
                f2 *= -1.0f;
            }
            int n = 0;
            if (es2.fL()) {
                n = 1;
            } else if (lea.enT().isDescendant(ldi2.getType(), bfk.dgm)) {
                if (f2 < 0.0f) {
                    lfn.b(5, "SFEnchantmentManager", "createEnchantment() Modifier for effect '" + alg2.CE() + "' has positive layer but negative modifiervalue.");
                    n = 3;
                } else {
                    n = 2;
                }
            } else if (f2 > 0.0f) {
                lfn.b(5, "SFEnchantmentManager", "createEnchantment() Modifier for effect '" + alg2.CE() + "' has negative layer but positive modifiervalue.");
                n = 2;
            } else {
                n = 3;
            }
            als als2 = new als();
            als2.setGUID(this.dBE.getMessageDelegator().bzv());
            als2.x(-2.0);
            als2.ga(n);
            als2.gb(0);
            als2.gc(0);
            als2.cP(cdb2.getGUID());
            als2.gd(cdb2.az());
            als2.ge(cxd.fJs);
            als2.fJ(alg2.aYG);
            als2.gf(this.dBF++);
            als2.fC(alg2.bnM);
            als2.aq(f2);
            als2.ar(0.0f);
            als2.as(f2);
            es2.E(als2.getGUID());
            cdb2.jm().a((alq)als2);
            if (es2.getType() == 1440) {
                cdb2.b(es2);
            }
        } else if (!(ald2 instanceof alh)) {
            lfn.b(5, "SFEnchantmentManager", "createEnchantment() Invalid enchantmentinfo found: " + ald2);
            lfn.b(5, "SFEnchantmentManager", "createEnchantment() " + bqs2);
            lfn.b(5, "SFEnchantmentManager", "createEnchantment() " + es2);
            assert (false);
        }
    }

    private void c(bqs bqs2, es es2) {
        assert (bqs2 != null);
        assert (es2 != null);
        cdb cdb2 = (cdb)this.dBE.auk();
        ald ald2 = es2.fH();
        if (ald2 instanceof ale) {
            cdb2.jk().bhi().a((ale)ald2);
        } else if (ald2 instanceof alf) {
            cdb2.aJB().bqd = null;
            if (es2.getType() == 1600) {
                cdb2.aJB().geP = 0.0f;
            } else {
                cdb2.aJB().geO = 0.0f;
            }
        } else if (ald2 instanceof alg) {
            assert (es2.fG() != null);
            cdb2.jm().C(es2.fG());
            es2.E(null);
            if (es2.getType() == 1440) {
                cdb2.c(es2);
            }
        } else if (!(ald2 instanceof alh)) {
            lfn.b(5, "SFEnchantmentManager", "removeEnchantment() Invalid enchantmentinfo found: " + ald2);
            assert (false);
        }
    }
}

