/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cug
 *  ep
 *  mcs
 */
public class blb
extends bke {
    private fcu dtE = null;
    private ctu bpC = null;
    private cex aaY = null;
    private cbx dtF = null;
    private int Ws = 0;

    public blb() {
        this.dsy = bkd.a.drz;
    }

    @Override
    public void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9226) {
            lfn.b(5, "SFCraftingFO", "doFunction() Invalid message provided: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtE = (fcu)fdo2;
        this.bpC = cwy.bm(this.dtE.aYC, this.dtE.ResourceType);
        if (this.bpC == null) {
            lfn.b(5, "SFCraftingFO", "doFunction() No craftingrecipe found for resource '" + ResourceTree.getName(this.dtE.ResourceType) + "'");
            this.Vc();
            return;
        }
        this.aaY = (cex)this.d(this.dtE.aZG);
        if (this.aaY == null) {
            lfn.b(5, "SFCraftingFO", "doFunction() Could not find sourceobject " + this.dtE.aZG);
            this.Vc();
            return;
        }
        if (this.aaY.mA() == null) {
            lfn.b(5, "SFCraftingFO", "doFunction() Sourceobject " + this.dtE.aZG + " has no persistentsessionobject.");
            this.Vc();
            return;
        }
        ctc[] ctcArray = this.bpC.bbL();
        if (ctcArray != null && ctcArray.length > 0) {
            for (int i = 0; i < ctcArray.length; ++i) {
                if (!ctcArray[i].vA()) continue;
                if (cug.vQ((int)ctcArray[i].az())) {
                    this.f(this.aaY.getGUID(), ctcArray[i].az(), ctcArray[i].vf());
                    ++this.Ws;
                } else {
                    this.a(-1, ctcArray[i].az(), this.dtE.aZG, ctcArray[i].vf());
                    ++this.Ws;
                }
                this.aaY.c(mcs.uyE.bD(this.dtE.ResourceType, ctcArray[i].az(), ctcArray[i].vf()));
            }
        }
        if (cug.vQ((int)this.dtE.ResourceType)) {
            this.f(this.aaY.getGUID(), this.dtE.ResourceType, this.bpC.vf());
            ++this.Ws;
        } else {
            this.a(-1, this.dtE.ResourceType, this.dtE.aZG, this.bpC.vf());
            ++this.Ws;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 7994: {
                this.c((fmy)dxq2);
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

    private es a(int n, int n2, float f2) {
        assert (n > 0);
        assert (n2 > 0);
        assert (f2 != 0.0f);
        ald ald2 = lea.eog().get(n2);
        if (ald2 == null) {
            lfn.b(5, "SFCraftingFO", "createEnchantmentAttribute() No enchantmentinfo mapped to " + n2);
            lfn.b(5, "SFCraftingFO", "createEnchantmentAttribute() Unable to create attribute '" + ep.aM((int)n) + "'");
            return null;
        }
        es es2 = new es();
        es2.setType(n);
        es2.bf(n2);
        es2.m(f2);
        es2.a((int[])null);
        return es2;
    }

    private void c(fmy fmy2) {
        assert (this.aaY != null);
        assert (this.aaY.mA() != null);
        --this.Ws;
        if (fmy2.iQF) {
            if (fmy2.aCK == null) {
                lfn.b(5, "SFCraftingFO", "handleInventoryResourceAddResponse() ItemGUID is null.");
                if (this.Ws == 0) {
                    this.Vc();
                }
                return;
            }
            if (this.dtE.bOs()) {
                this.a(this.dtE, true);
            }
            if (fmy2.ResourceType == this.bpC.az()) {
                bqs bqs2 = this.aaY.aJF().iK(fmy2.aCK);
                if (bqs2 == null) {
                    lfn.b(5, "SFCraftingFO", "handleInventoryResourceAddResponse() Could not find inventoryitem " + fmy2.aCK);
                    assert (false);
                } else {
                    brp brp2 = bqs2.auS();
                    brp2.asi = fmy2.asi;
                    this.aaY.mA().a(brp2, this.dtE.aYC, this.dtE.diS);
                }
            }
            if (this.Ws == 0) {
                this.Vc();
            }
            return;
        }
        this.a(fmy2.aVk(), fmy2.ResourceType, this.dtE.aZG, fmy2.asi);
        ++this.Ws;
    }

    private void a(gfn gfn2) {
        Object object;
        assert (this.dtE != null);
        assert (this.bpC != null);
        --this.Ws;
        this.dtF = gfn2.dtF;
        if (this.dtF == null) {
            lfn.b(5, "SFCraftingFO", "handleResourceCreateResponse() Resource returned from resourcemanager is null.");
            if (this.dtE.bOs()) {
                this.a(this.dtE, false);
            }
            if (this.Ws == 0) {
                this.Vc();
            }
            return;
        }
        assert (this.dtF.aAG() == null);
        assert (this.dtF.aIh() != null);
        if (this.dtF.az() == this.bpC.az()) {
            if (this.dtF.vf() != this.bpC.vf()) {
                lfn.b(5, "SFCraftingFO", "handleResourceCreateResponse() Quantity is " + this.dtF.vf() + " but should have been " + this.bpC.vf());
                assert (false);
                if (this.Ws == 0) {
                    this.Vc();
                }
                return;
            }
        } else if (!this.bpC.up(this.dtF.az())) {
            lfn.b(5, "SFCraftingFO", "handleResourceCreateResponse() : Created Resource is Not Crafted Item or By-Product!!!... Resource = " + this.dtF.pa());
            assert (false);
            return;
        }
        if (!cug.vQ((int)this.dtF.az())) {
            object = (ff)this.dtF.fi().ae(1360);
            if (object == null) {
                object = new ff();
                ((ej)object).setType(1360);
                this.dtF.fi().b((ej)object);
            }
            if (this.dtE.ash != null) {
                ((ff)object).av(this.dtE.ash);
            } else {
                ((ff)object).av(this.aaY.mA().iU());
            }
        }
        if (this.dtE.gao > 0) {
            assert (this.dtE.iJu != 0.0f);
            object = this.a(1440, this.dtE.gao, this.dtE.iJu);
            if (object != null) {
                this.dtF.fi().b((ej)object);
            }
        }
        if (this.dtE.gap > 0) {
            assert (this.dtE.iJv != 0.0f);
            object = this.a(1456, this.dtE.gap, this.dtE.iJv);
            if (object != null) {
                this.dtF.fi().b((ej)object);
            }
        }
        object = new bla();
        ((bla)object).a(this.aaY, this.dtF, this.dtE.iJt, this.dtE.iJw);
        bqs bqs2 = this.a(this.dtF, 0L);
        if (bqs2 == null) {
            lfn.b(5, "SFCraftingFO", "handleResourceCreateResponse() Could not create inventoryitem for resource '" + this.dtF.pa() + "'");
            if (this.Ws == 0) {
                this.Vc();
            }
            return;
        }
        this.MessageDelegator.a((amf)this.dtF);
        brv brv2 = new brv();
        brv2.dIY = bqs2;
        dnm dnm2 = new dnm();
        dnm2.gKR = this.MessageDelegator.bzv();
        dnm2.ec = this.GUID;
        dnm2.gKS = this.aaY.az();
        dnm2.gKT = this.aaY.az();
        dnm2.dAu = this.aaY.aJC().asf().getGUID();
        dnm2.aXQ = this.dtE.fZi == null ? dnm2.dAu : this.dtE.fZi;
        dnm2.gKU = new brv[]{brv2};
        dnm2.b(this.dtE.ash == null ? bqy.dGb : bqy.dHg);
        this.a(dnm2);
        ++this.Ws;
    }

    private void a(gxy gxy2) {
        assert (this.aaY != null);
        assert (this.aaY.mA() != null);
        assert (this.dtF != null);
        --this.Ws;
        if (gxy2.gKN == null) {
            lfn.b(5, "SFCraftingFO", "handleTransactionResponse() Info is null.");
            if (this.Ws == 0) {
                this.Vc();
            }
            return;
        }
        if (this.dtE.bOs()) {
            this.a(this.dtE, true);
        }
        if (this.dtF.az() == this.bpC.az()) {
            bqs bqs2 = this.aaY.aJF().iK(this.dtF.getGUID());
            if (bqs2 == null) {
                lfn.b(5, "SFCraftingFO", "handleTransactionResponse() Could not find inventoryitem " + this.dtF.getGUID());
                assert (false);
            } else {
                brp brp2 = bqs2.auS();
                this.aaY.mA().a(brp2, this.dtE.aYC, this.dtE.diS);
            }
        }
        if (this.Ws == 0) {
            this.Vc();
        }
    }

    private void f(ldv ldv2, int n, int n2) {
        assert (ldv2 != null);
        assert (n > 0);
        fmx fmx2 = (fmx)this.MessageDelegator.h(7993, this.GUID, ldv2);
        fmx2.ResourceType = n;
        fmx2.asi = n2;
        fmx2.b(bqy.dGb);
        this.MessageDelegator.F(fmx2);
    }
}

