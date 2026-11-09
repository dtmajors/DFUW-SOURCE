/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Map;

public class blc
extends bke {
    private Map<Integer, ald> dtG = lea.eog();
    private fcx dtH = null;
    private alj[] dtI = null;
    private int[] dtJ = null;
    private cbx dtK = null;
    private cbx dtL = null;
    private dnm dtM = null;

    public blc() {
        this.dsy = bkd.a.drC;
    }

    @Override
    public void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9228) {
            lfn.b(5, "SFEnchantingFO", "doFunction() Invalid message provided: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtH = (fcx)fdo2;
        this.dtI = this.dtH.dtI;
        boolean bl2 = true;
        if (this.dtH.aCK == null) {
            lfn.b(5, "SFEnchantingFO", "doFunction() ItemGUID is null.");
            bl2 = false;
        } else if (this.dtH.dtI == null) {
            lfn.b(5, "SFEnchantingFO", "doFunction() EnchantmentParams array is null.");
            bl2 = false;
        } else if (this.dtH.dtI[0].adk == 0) {
            if (this.dtH.YL == null) {
                lfn.b(5, "SFEnchantingFO", "doFunction() PlayerName is null.");
                bl2 = false;
            } else if (this.dtH.dXG <= 0) {
                lfn.b(5, "SFEnchantingFO", "doFunction() PlayerResourceType is invalid.");
                bl2 = false;
            } else if (this.dtH.dAu == null) {
                lfn.b(5, "SFEnchantingFO", "doFunction() InventoryGUID is null.");
                bl2 = false;
            } else if (this.dtH.dIW == null) {
                lfn.b(5, "SFEnchantingFO", "doFunction() ItemLockID is null.");
                bl2 = false;
            } else if (this.dtH.iJF < 0.0f) {
                lfn.b(5, "SFEnchantingFO", "doFunction() TransmutingLevel is invalid.");
                bl2 = false;
            }
        }
        if (!bl2) {
            this.Vc();
            return;
        }
        alj[] aljArray = new alj[3];
        for (alj aljArray[this.dtI[n2].adk] : this.dtI) {
        }
        this.dtI = aljArray;
        this.dtK = (cbx)this.MessageDelegator.d(this.dtH.aCK);
        if (this.dtK == null) {
            lfn.b(5, "SFEnchantingFO", "doFunction() Could not find object " + this.dtH.aCK);
            this.Vc();
            return;
        }
        int n2 = 0;
        if (this.dtI[n2] != null) {
            cty cty2 = lea.eof().get(this.dtI[n2].brO);
            if (cty2 == null) {
                lfn.b(5, "SFEnchantingFO", "doFunction() Could not find recipe with EnchantmentRecipeType=" + this.dtI[n2].brO);
                this.Vc();
                return;
            }
            this.dtJ = cty2.IngredientResourceTypes;
            this.m(cty2.dhr, this.dtH.aCK);
        } else {
            this.k(this.dtK);
            this.hO(this.dtH.dAu);
            this.Vc();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            case 11266: {
                this.a((gxy)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(cbx cbx2, es es2, boolean bl2, float f2) {
        Object object;
        assert (cbx2 != null);
        assert (es2 != null);
        if (bl2) assert (f2 > 0.0f);
        String string = this.j(cbx2);
        cbx2.fi().b(es2);
        if (bl2) {
            object = (gmp)this.MessageDelegator.h(3593, this.GUID, lcr.qEl);
            ((gmp)object).Ri = lcr.tQ((ldv)this.dtH.aZG);
            ((gmp)object).diS = this.dtH.diS;
            ((gmp)object).aRX = this.dtL != null ? this.dtL.az() : this.dtK.az();
            ((gmp)object).jmb = (es)es2.fm();
            ((gmp)object).jlZ = true;
            ((gmp)object).jlY = string;
            ((gmp)object).jma = this.j(cbx2);
            ((gmp)object).brP = f2;
            this.MessageDelegator.F((dxq)object);
        }
        if (es2.fH() instanceof alh) {
            object = (alh)es2.fH();
            als als2 = new als();
            als2.setGUID(this.MessageDelegator.bzv());
            als2.x(-2.0);
            als2.ga(2);
            als2.gb(0);
            als2.gc(0);
            als2.cP(this.dtH.aZG);
            als2.gd(this.dtH.bsG);
            als2.ge(cxd.fJs);
            als2.fJ(bfk.dgu);
            als2.gf(1);
            als2.fC(((alh)object).bnM);
            als2.aq(es2.fE());
            als2.ar(0.0f);
            als2.as(es2.fE());
            this.a(cbx2.getGUID(), als2);
            this.c(cbx2.getGUID(), es2.getType(), als2.getGUID());
        }
    }

    private String j(cbx cbx2) {
        assert (cbx2 != null);
        String string = cug.uG((int)cbx2.az());
        es es2 = (es)cbx2.fi().ae(1600);
        if (es2 != null) {
            string = es2.fH().PrefixName + " " + string;
        }
        if ((es2 = (es)cbx2.fi().ae(1584)) != null) {
            string = string + " " + es2.fH().PostfixName;
        }
        return string;
    }

    private void k(cbx cbx2) {
        assert (cbx2 != null);
        assert (this.dtI != null);
        int n = this.dtI.length;
        for (int i = 1; i < n; ++i) {
            if (this.dtI[i] == null) continue;
            ctw ctw2 = lea.eoe().get(this.dtI[i].brO);
            if (ctw2 == null) {
                lfn.b(5, "SFEnchantingFO", "createEnchantmentAttributes() Could not find recipe with EnchantmentRecipeType=" + this.dtI[i].brO);
                return;
            }
            ald ald2 = this.dtG.get(ctw2.Ps);
            if (ald2 == null) {
                lfn.b(5, "SFEnchantingFO", "createEnchantmentAttributes() Could not find enchantmentinfo with Type=" + ctw2.Ps);
                return;
            }
            es es2 = new es();
            es2.bf(ctw2.Ps);
            es2.m(this.dtI[i].Pt);
            es2.a(ctw2.IngredientResourceTypes);
            switch (i) {
                case 1: {
                    es2.setType(1600);
                    break;
                }
                case 2: {
                    es2.setType(1584);
                    break;
                }
                default: {
                    lfn.b(5, "SFEnchantingFO", "createEnchantmentAttributes() Invalid index found: " + i);
                    assert (false);
                    return;
                }
            }
            this.a(cbx2, es2, true, this.dtI[i].brP);
        }
    }

    private void a(fmo fmo2) {
        if (fmo2.ilu == 2) {
            if (fmo2.eo) {
                // empty if block
            }
            this.a(this.dtM);
        } else {
            lfn.b(5, "SFEnchantingFO", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
        }
    }

    private void a(gfn gfn2) {
        Object object;
        assert (this.dtH != null);
        assert (this.dtK != null);
        this.dtL = gfn2.dtF;
        if (this.dtL == null) {
            lfn.b(5, "SFEnchantingFO", "handleResourceCreateResponse() Resource returned from resourcemanager is null.");
            if (this.dtH.bOs()) {
                this.a(this.dtH, false);
            }
            this.Vc();
            return;
        }
        assert (this.dtL.aAG() == null);
        assert (this.dtL.aIh() != null);
        if (this.dtL.vf() != 1) {
            lfn.b(5, "SFEnchantingFO", "handleResourceCreateResponse() Quantity of resource '" + this.dtL.pa() + "' is invalid.");
            assert (false);
            this.dtL.do(1);
        }
        if (!cug.vQ((int)this.dtL.az())) {
            object = (ff)this.dtL.fi().ae(1360);
            if (object == null) {
                object = new ff();
                ((ej)object).setType(1360);
                this.dtL.fi().b((ej)object);
            }
            ((ff)object).av(this.dtH.YL);
        }
        object = new bla();
        ((bla)object).a(this.dtK, this.dtL, this.dtH.iJF);
        bqs bqs2 = this.a(this.dtL, 0L);
        if (bqs2 == null) {
            lfn.b(5, "SFEnchantingFO", "handleResourceCreateResponse() Could not create inventoryitem for resource '" + this.dtL.pa() + "'");
            this.Vc();
            return;
        }
        es es2 = new es();
        es2.setType(1616);
        es2.bf(0);
        es2.m(this.dtI[0].Pt);
        es2.a(this.dtJ);
        this.dtL.fi().b(es2);
        es es3 = (es)es2.fm();
        es2 = (es)this.dtK.fi().ae(1600);
        if (es2 != null) {
            if (this.dtI[1] != null) {
                lfn.b(5, "SFEnchantingFO", "handleResourceCreateResponse() OldResource '" + this.dtK.pa() + "' contains 'Prefix Enchantment' while INDEX_OF_PREFIX is not null.");
                this.Vc();
                return;
            }
            this.a(this.dtL, (es)es2.fm(), false, 0.0f);
        }
        if ((es2 = (es)this.dtK.fi().ae(1584)) != null) {
            if (this.dtI[2] != null) {
                lfn.b(5, "SFEnchantingFO", "handleResourceCreateResponse() OldResource '" + this.dtK.pa() + "' contains 'Postfix Enchantment' while INDEX_OF_POSTFIX is not null.");
                this.Vc();
                return;
            }
            this.a(this.dtL, (es)es2.fm(), false, 0.0f);
        }
        this.k(this.dtL);
        gmp gmp2 = (gmp)this.MessageDelegator.h(3593, this.GUID, lcr.qEl);
        gmp2.Ri = lcr.tQ((ldv)this.dtH.aZG);
        gmp2.diS = this.dtH.diS;
        gmp2.jlZ = false;
        gmp2.jlY = this.j(this.dtK);
        gmp2.aRX = this.dtK.az();
        gmp2.jmb = es3;
        gmp2.brP = this.dtI[0].brP;
        gmp2.jma = this.l(this.dtK) ? this.j(this.dtL) : this.dtL.pa();
        this.MessageDelegator.F(gmp2);
        this.MessageDelegator.a((amf)this.dtL);
        brv brv2 = new brv();
        brv2.dIY = bqs2;
        brv2.dJc = alc.a.brl.ordinal();
        this.dtM = new dnm();
        this.dtM.gKR = this.MessageDelegator.bzv();
        this.dtM.ec = this.GUID;
        this.dtM.gKS = this.dtH.dXG;
        this.dtM.gKT = this.dtH.dXG;
        this.dtM.dAu = this.dtH.dAu;
        this.dtM.aXQ = this.dtH.iJE;
        this.dtM.gKU = new brv[]{brv2};
        this.dtM.b(bqy.dGb);
        this.a(this.dtH.dAu, this.dtH.aCK, this.dtH.dIW);
    }

    private void a(gxy gxy2) {
        if (gxy2.gKN == null) {
            lfn.b(5, "SFEnchantingFO", "handleTransactionResponse() Info is null.");
            return;
        }
        if (this.dtH.bOs()) {
            this.a(this.dtH, true);
        }
        if (gxy2.gKN.gKR != null) {
            this.MessageDelegator.oa(gxy2.gKN.gKR);
        }
        this.Vc();
    }

    private boolean l(cbx cbx2) {
        if (cbx2 == null) {
            return false;
        }
        es es2 = (es)cbx2.fi().ae(1600);
        if (es2 != null) {
            return true;
        }
        es2 = (es)cbx2.fi().ae(1584);
        return es2 != null;
    }

    private void hO(ldv ldv2) {
        assert (ldv2 != null);
        flm flm2 = (flm)this.MessageDelegator.h(7987, this.GUID, ldv2);
        flm2.aXx = 2;
        this.MessageDelegator.F(flm2);
    }

    private void a(ldv ldv2, es es2) {
        assert (ldv2 != null);
        assert (es2 != null);
        eai eai2 = (eai)this.MessageDelegator.h(10754, this.GUID, ldv2);
        eai2.bhp = es2;
        this.MessageDelegator.F(eai2);
    }

    private void a(ldv ldv2, ldv ldv3, lef lef2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (lef2 != null);
        fmv fmv2 = (fmv)this.MessageDelegator.h(7940, this.GUID, ldv2);
        fmv2.aCK = ldv3;
        fmv2.dIW = lef2;
        fmv2.iQA = true;
        fmv2.iQC = false;
        fmv2.iQB = false;
        fmv2.b(bqy.dHx);
        this.MessageDelegator.F(fmv2);
    }

    private void c(ldv ldv2, int n, ldv ldv3) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (ldv3 != null);
        eao eao2 = (eao)this.MessageDelegator.h(10758, this.GUID, ldv2);
        eao2.bnM = n;
        eao2.Pu = ldv3;
        this.MessageDelegator.F(eao2);
    }
}

