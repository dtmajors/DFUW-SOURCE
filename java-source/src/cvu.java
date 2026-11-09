/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  cug
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Map;

public class cvu
extends cvs {
    gbc fBf = null;
    protected Map<Integer, eyf> fBg = lcn.emw();
    protected int fBh = 0;

    public cvu(int n) {
        super(n, true);
    }

    public boolean bF(ljq ljq2) {
        if (!this.fBb) {
            return false;
        }
        assert (this.bpJ != null);
        assert (ljq2 != null);
        float f2 = Math.abs(this.bpJ.ez(ljq2));
        return f2 > 11.0f;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4867: {
                this.a((gao)dxq2);
                break;
            }
            case 4879: {
                this.a((gbc)dxq2);
                break;
            }
            case 4882: {
                this.b((gbf)dxq2);
                break;
            }
            case 34561: {
                this.a((eyc)dxq2);
                break;
            }
            case 34562: {
                this.a((eyj)dxq2);
                break;
            }
            case 34564: {
                this.a((eyk)dxq2);
                break;
            }
            case 34566: {
                this.a((eyi)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void Ci() {
        assert (this.fEK == cwg.a.fEO);
        this.bcH();
    }

    private void bcH() {
        if (this.fBb && this.fBc != null && this.fBc.length > 0) {
            eyh eyh2 = (eyh)this.MessageDelegator.h(34565, this.GUID, lcr.qEC);
            eyh2.jT(false);
            eyh2.pu(this.bcJ());
            eyh2.eI(this.fBc[0]);
            this.MessageDelegator.E(eyh2);
        }
        this.fEK = cwg.a.fEQ;
        this.bcI();
        this.fBb = false;
        this.fBc = null;
        this.fyj = 0;
        this.fBd = null;
        this.fBe = null;
        this.bpJ = null;
        this.bdw();
        this.bdt().aFh().fi().c(12880, 0.0f);
    }

    private void a(gao gao2) {
        assert (this.fEK == cwg.a.fEM);
        if (gao2.fBc == null) {
            lfn.b(5, "SFCraftingSessionHandlerServer", "handleSessionBeginCraftingMessage() CraftingSkillTypes array is null.");
            return;
        }
        if (gao2.fyj <= 0) {
            lfn.b(5, "SFCraftingSessionHandlerServer", "handleSessionBeginCraftingMessage() WorkStationResourceType is invalid.");
            return;
        }
        if (gao2.fBb) {
            if (gao2.fBd == null) {
                lfn.b(5, "SFCraftingSessionHandlerServer", "handleSessionBeginCraftingMessage() WorkStationMeshObjectGUID is null.");
                return;
            }
            if (gao2.bpJ == null) {
                lfn.b(5, "SFCraftingSessionHandlerServer", "handleSessionBeginCraftingMessage() WorkStationPosition is null.");
                return;
            }
        }
        this.fEK = cwg.a.fEO;
        this.fBb = gao2.fBb;
        this.fBc = gao2.fBc;
        this.fyj = gao2.fyj;
        if (this.fBb) {
            this.fBd = gao2.fBd;
            this.fBe = gao2.fBe;
            this.bpJ = gao2.bpJ;
        }
        gao2.f(this.GUID);
        gao2.on(this.bdk());
        gao2.aYH = this.aYH;
        this.MessageDelegator.F(gao2);
        if (this.fBb && this.fBc != null && this.fBc.length > 0) {
            eyh eyh2 = (eyh)this.MessageDelegator.h(34565, this.GUID, lcr.qEC);
            eyh2.jT(true);
            eyh2.eI(this.fBc[0]);
            eyh2.pu(this.bcJ());
            this.MessageDelegator.E(eyh2);
        }
    }

    private void a(gbc gbc2) {
        if (this.fBg.size() > 0) {
            this.fBf = gbc2;
            return;
        }
        ldv ldv2 = this.bdu();
        if (!gbc2.aO().tV(ldv2)) {
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        this.bcH();
    }

    private void b(gbf gbf2) {
        ldv ldv2 = this.bdu();
        if (!gbf2.aO().tV(ldv2)) {
            return;
        }
        if (this.fEK == cwg.a.fEQ) {
            return;
        }
        if (this.bdt().aFh().fi() != null) {
            this.bdt().aFh().fi().c(12880, 0.0f);
        }
    }

    private void bcI() {
        assert (this.fEK != cwg.a.fEM);
        gbb gbb2 = (gbb)this.MessageDelegator.h(4878, this.GUID, this.bdu());
        this.MessageDelegator.F(gbb2);
    }

    private void a(eyc eyc2) {
        if (eyc2.bNn() == 0) {
            return;
        }
        cex cex2 = (cex)this.bdt().aFh();
        if (this.fBc.length == 0) {
            assert (false);
            return;
        }
        ctu ctu2 = cwy.bm(this.fBc[0], eyc2.bNl());
        if (ctu2 == null) {
            assert (false);
            return;
        }
        bqx bqx2 = (bqx)cex2.aJC();
        bri bri2 = (bri)bqx2.asf();
        if (eyc2.bNn() > 0) {
            ArrayList<bsa> arrayList = lcn.emv();
            for (ctm ctm2 : ctu2.Ingredients) {
                bsa bsa2;
                int n = ctm2.asi;
                if (ctm2.ResourceType == cug.fkb && cug.we((int)this.bcb())) {
                    n = Math.max(1, (int)((float)n * 0.9f));
                }
                if ((bsa2 = bri2.aup().a(ctm2.ResourceType, n * eyc2.bNn(), bqm.c.dEV, false)) == null) {
                    return;
                }
                arrayList.add(bsa2);
            }
            for (bsa bsa3 : arrayList) {
                if (bri2.a(bsa3, bqy.dIg)) continue;
                assert (false);
                lfn.b(5, "SFCraftingSessionHandlerServer", "handleCraftingOrderAddMessage() wasnt able to remove item.this shouldnt happen");
                return;
            }
        }
        eyc2.sk(this.fBh);
        eyc2.cS(cex2.getGUID().enw());
        eyc2.pu(this.bcJ());
        eyc2.f(this.GUID);
        eyc2.on(lcr.qEC);
        this.MessageDelegator.E(eyc2);
        this.fBg.put(this.fBh, eyc2);
        ++this.fBh;
    }

    private void a(eyj eyj2) {
        eyf eyf2 = this.fBg.remove(eyj2.aVk());
        if (eyf2 == null) {
            assert (false);
            return;
        }
        if (eyf2 instanceof eyc) {
            eyc eyc2 = (eyc)eyf2;
            if (eyc2.bNn() < 0 && eyj2.bNs() > 0) {
                cex cex2 = (cex)this.bdt().aFh();
                ctu ctu2 = cwy.bm(this.fBc[0], eyc2.bNl());
                bqx bqx2 = (bqx)cex2.aJC();
                bri bri2 = (bri)bqx2.asf();
                fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
                fcy2.aqs = 0;
                fcy2.dul = 0;
                fcy2.bst = bkd.dqO;
                fcy2.aZG = this.GUID;
                fcy2.akX = bri2.getGUID();
                fcy2.iJG = true;
                fcy2.iJE = null;
                fcy2.b(bqy.dHf);
                fcy2.dtP = new cte[ctu2.Ingredients.length];
                int n = 0;
                for (ctm ctm2 : ctu2.Ingredients) {
                    int n2 = ctm2.asi;
                    if (ctm2.ResourceType == cug.fkb && cug.we((int)this.bcb())) {
                        n2 = Math.max(1, (int)((float)n2 * 0.9f));
                    }
                    cte cte2 = new cte();
                    cte2.ResourceType = ctm2.ResourceType;
                    cte2.asi = n2 * eyj2.bNs();
                    fcy2.dtP[n] = cte2;
                    ++n;
                }
                this.MessageDelegator.H(fcy2);
            }
        } else if (eyf2 instanceof eyk) {
            eyk eyk2 = (eyk)eyf2;
            for (kw kw2 : eyj2.bNr()) {
                Object object;
                Object object2;
                Object object3;
                if (kw2.eo) {
                    if (kw2.asi == 1) {
                        this.a(kw2.ase, kw2.asg, kw2.ash);
                        continue;
                    }
                    object3 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
                    ((fcy)object3).aqs = 0;
                    ((fcy)object3).dul = 0;
                    ((fcy)object3).bst = bkd.dqO;
                    ((fcy)object3).aZG = this.GUID;
                    ((fcy)object3).akX = this.bdt().aFh().aJC().asf().getGUID();
                    ((fcy)object3).iJG = true;
                    ((fcy)object3).iJE = null;
                    ((fcy)object3).b(bqy.dHg);
                    object2 = new cte();
                    ((cte)object2).ResourceType = kw2.ase;
                    object = cwy.bm(1, kw2.ase);
                    if (object == null) assert (false);
                    int n = object == null ? 1 : ((ctu)object).vf();
                    ((cte)object2).asi = kw2.asi * n;
                    ((fcy)object3).dtP = new cte[]{object2};
                    this.MessageDelegator.I((dxq)object3);
                    continue;
                }
                object3 = cwy.bm(this.fBc[0], eyk2.bNl());
                if (object3 == null) {
                    assert (false);
                    return;
                }
                object2 = lgp.erA();
                object = lcn.emv();
                for (ctm ctm3 : ((ctu)object3).Ingredients) {
                    int n = 0;
                    for (int i = 0; i < kw2.asi; ++i) {
                        int n3 = 0;
                        if (((lgp)object2).nextFloat() < ctm3.fgb && (n3 = (int)(((lgp)object2).nextFloat() * (float)ctm3.asi)) < 1) {
                            n3 = 1;
                        }
                        n += ctm3.asi - n3;
                    }
                    if (n <= 0) continue;
                    cte cte3 = new cte();
                    cte3.ResourceType = ctm3.ResourceType;
                    cte3.asi = n;
                    object.add(cte3);
                }
                if (object.size() <= 0) continue;
                fcy fcy3 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
                fcy3.aqs = 0;
                fcy3.dul = 0;
                fcy3.bst = bkd.dqO;
                fcy3.aZG = this.GUID;
                fcy3.akX = this.bdt().aFh().aJC().asf().getGUID();
                fcy3.iJG = true;
                fcy3.iJE = null;
                fcy3.b(bqy.dHh);
                fcy3.dtP = new cte[object.size()];
                object.toArray(fcy3.dtP);
                this.MessageDelegator.I(fcy3);
            }
        }
        if (this.fBg.size() == 0 && this.fBf != null) {
            this.receiveMessage(this.fBf);
            this.fBf = null;
        }
    }

    protected void a(eyk eyk2) {
        ctu ctu2 = cwy.bm(this.fBc[0], eyk2.bNl());
        if (ctu2 == null) {
            assert (false);
            return;
        }
        eyk2.f(this.GUID);
        eyk2.on(lcr.qEC);
        eyk2.sk(this.fBh);
        eyk2.cS(this.GUID.enw());
        eyk2.pu(this.bcJ());
        eyk2.f(this.GUID);
        eyk2.on(lcr.qEC);
        this.fBg.put(this.fBh, eyk2);
        ++this.fBh;
        this.MessageDelegator.E(eyk2);
    }

    protected void a(int n, float f2, String string) {
        ldv ldv2 = this.bdt().aFh().getGUID();
        fcu fcu2 = (fcu)this.MessageDelegator.h(9226, this.GUID, this.MessageDelegator.getGUID());
        fcu2.bst = bkd.drk;
        fcu2.aZG = ldv2;
        fcu2.akX = ldv2;
        fcu2.aYF = ldv2;
        fcu2.bsG = this.bdt().aFh().az();
        fcu2.aYC = this.fBc[0];
        fcu2.ResourceType = n;
        fcu2.iJt = f2;
        fcu2.diS = this.bdt().aFh().aAG().av();
        fcu2.iJw = this.fyj;
        fcu2.ash = string.length() > 0 ? string : null;
        this.MessageDelegator.I(fcu2);
    }

    protected void a(eyi eyi2) {
        eyi2.on(this.bdu());
        this.MessageDelegator.E(eyi2);
    }

    public ldv bcJ() {
        ldv ldv2 = new ldv(0, this.fyj, lcw.ee((ljq)this.bpJ));
        return ldv2;
    }
}

