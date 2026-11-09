/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 */
import java.util.ArrayList;

public class bmf
extends bke {
    private static final int dvb = 5;
    private static final int dvc = 10;
    private fcy dvd = null;
    private cte[] dtP = null;
    private ldv dve = null;
    private int dvf = 0;
    private bqs dvg = null;
    private bqs[] dvh = null;
    private final boolean dvi = false;
    private int dvj = 0;
    private int dvk = 0;

    public bmf() {
        this.dsy = bkd.a.drD;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        int n2;
        if (fdo2 == null) {
            lfn.b(5, "SFEquipmentCreatorFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9229) {
            lfn.b(5, "SFEquipmentCreatorFO", "doFunction() Invalid message received: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dvd = (fcy)fdo2;
        this.dtP = this.dvd.dtP;
        if (this.dtP == null || this.dtP.length == 0) {
            lfn.b(5, "SFEquipmentCreatorFO", "doFunction() EquipmentItems array is null or empty.");
            this.Vc();
            return;
        }
        this.dve = this.hG(this.dvd.akX);
        if (this.dve == null) {
            lfn.b(5, "SFEquipmentCreatorFO", "doFunction() TargetObjectInventoryGUID is null.");
            this.Vc();
            return;
        }
        this.dvf = this.hH(this.dvd.akX);
        if (this.dvf <= 0) {
            lfn.b(5, "SFEquipmentCreatorFO", "doFunction() TargetObjectResourceType is invalid.");
            this.Vc();
            return;
        }
        if (this.dvd.iJG && !this.dvd.iyH) {
            int n3 = this.dtP.length;
            for (int i = 0; i < n3; ++i) {
                if (this.dtP[i].ResourceType <= 0) {
                    lfn.b(5, "SFEquipmentCreatorFO", "doFunction() ResourceType " + i + " is invalid.");
                    continue;
                }
                int n4 = 0;
                n4 = this.dtP[i].asi <= 0 ? cug.uF((int)this.dtP[i].ResourceType) : this.dtP[i].asi;
                this.a(this.dve, 10 + i, this.dtP[i].ResourceType, n4, this.dvd.iJE);
            }
            return;
        }
        this.dvh = new bqs[this.dtP.length];
        int n5 = n2 = lea.enW().isDescendant(this.dvd.eEb, cug.fjP) ? this.dvd.eEb : cug.fmX;
        if (this.dvd.iyH) {
            this.a(5, n2, this.dvd.akX, 1);
        }
        int n6 = this.dtP.length;
        for (int i = 0; i < n6; ++i) {
            if (this.dtP[i].ResourceType <= 0) {
                lfn.b(5, "SFEquipmentCreatorFO", "doFunction() ResourceType " + i + " is invalid.");
                continue;
            }
            int n7 = 0;
            n7 = this.dtP[i].asi <= 0 ? cug.uF((int)this.dtP[i].ResourceType) : this.dtP[i].asi;
            if (this.dvd.iyI) {
                this.a(10 + i, this.dtP[i].ResourceType, lcr.qzY, n7);
                continue;
            }
            this.a(10 + i, this.dtP[i].ResourceType, this.dvd.akX, n7);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 11266: {
                this.a((gxy)dxq2);
                break;
            }
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            case 7994: {
                this.c((fmy)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void arG() {
        assert (this.dtP.length == this.dvh.length);
        int n = this.dtP.length;
        for (int i = 0; i < n; ++i) {
            if (this.dvh[i] == null || !this.dtP[i].fex) continue;
            lgw lgw2 = (lgw)ResourceTree.acv(this.dtP[i].ResourceType);
            if (lgw2.awU()) {
                this.d(this.dve, i, this.dvh[i].getGUID());
                ++this.dvk;
                continue;
            }
            lfn.b(5, "SFEquipmentCreatorFO", "attachEquipmentItems() Resource '" + this.dtP[i].pa() + "' can't be attached.");
        }
        if (this.dvk == 0) {
            if (this.dvd.bOs()) {
                this.a(this.dvd, true);
            }
            this.Vc();
        }
    }

    private void arH() {
        assert (this.dvj == this.dtP.length);
        if (this.dvh == null) {
            if (this.dvd.bOs()) {
                this.a(this.dvd, true);
            }
            this.Vc();
            return;
        }
        ArrayList<cte> arrayList = lcn.abH(this.dvh.length);
        ArrayList<bqs> arrayList2 = lcn.abH(this.dvh.length);
        int n = this.dvh.length;
        for (int i = 0; i < n; ++i) {
            if (this.dvh[i] == null) continue;
            arrayList.add(this.dtP[i]);
            arrayList2.add(this.dvh[i]);
        }
        if (arrayList2.isEmpty()) {
            if (this.dvd.bOs()) {
                this.a(this.dvd, true);
            }
            this.Vc();
            return;
        }
        this.dtP = new cte[arrayList.size()];
        arrayList.toArray(this.dtP);
        this.dvh = new bqs[arrayList2.size()];
        arrayList2.toArray(this.dvh);
        brv[] brvArray = new brv[this.dvh.length];
        int n2 = brvArray.length;
        for (n = 0; n < n2; ++n) {
            brvArray[n] = new brv();
            brvArray[n].dIY = this.dvh[n];
        }
        if (this.dvd.iyH) {
            assert (this.dvg != null);
            bpz bpz2 = new bpz();
            bpz2.dIY = this.dvg;
            bpz2.dBr = brvArray;
            dnm dnm2 = new dnm();
            dnm2.gKR = this.MessageDelegator.bzv();
            dnm2.ec = this.GUID;
            dnm2.gKS = this.dvf;
            dnm2.gKT = this.dvf;
            dnm2.dAu = this.dve;
            dnm2.aXQ = this.dvd.iJE == null ? this.dve : this.dvd.iJE;
            dnm2.gKU = new brv[]{bpz2};
            dnm2.b(this.dvd.brE());
            this.a(dnm2);
        } else {
            dnm dnm3 = new dnm();
            dnm3.gKR = this.MessageDelegator.bzv();
            dnm3.ec = this.GUID;
            dnm3.gKS = this.dvf;
            dnm3.gKT = this.dvf;
            dnm3.dAu = this.dve;
            dnm3.aXQ = this.dvd.iJE == null ? this.dve : this.dvd.iJE;
            dnm3.gKU = brvArray;
            dnm3.b(this.dvd.brE());
            this.a(dnm3);
        }
    }

    private es m(cbx cbx2) {
        assert (cbx2 != null);
        if (!ResourceTree.isDescendant(cbx2.az(), cug.fiC) && !ResourceTree.isDescendant(cbx2.az(), cug.fiB)) {
            return null;
        }
        Integer n = lea.eoh().get(cbx2.az());
        if (n == null) {
            return null;
        }
        cty cty2 = lea.eof().get(n);
        if (cty2 == null) {
            lfn.b(5, "SFEquipmentCreatorFO", "getTransmutedAttribute() Could not find recipe with type: " + n);
            lfn.b(5, "SFEquipmentCreatorFO", "getTransmutedAttribute() RecipeType is mapped to resource '" + cbx2.pa() + "'");
            return null;
        }
        assert (cty2.dhr == cbx2.az());
        es es2 = new es();
        es2.setType(1616);
        es2.bf(0);
        es2.m(50.0f);
        es2.a(cty2.fK());
        return es2;
    }

    private void a(fmo fmo2) {
        switch (fmo2.ilu) {
            case 3: {
                if (fmo2.aVk() == -1) {
                    lfn.b(5, "SFEquipmentCreatorFO", "handleInventoryOperationReceiptMessage() MessageTag is invalid.");
                    return;
                }
                --this.dvk;
                if (this.dvk != 0) break;
                if (this.dvd.bOs()) {
                    this.a(this.dvd, true);
                }
                this.Vc();
                break;
            }
            default: {
                lfn.b(5, "SFEquipmentCreatorFO", "handleInventoryOperationReceiptMessage() Receipt for unhandled operation received: " + fmo2.ilu);
            }
        }
    }

    private void c(fmy fmy2) {
        if (fmy2.aVk() == -1) {
            lfn.b(5, "SFEquipmentCreatorFO", "handleInventoryResourceAddResponse() MessageTag is invalid.");
            return;
        }
        int n = fmy2.aVk() - 10;
        if (fmy2.iQF) {
            ++this.dvj;
            if (this.dvj == this.dtP.length) {
                this.arH();
            }
            return;
        }
        if (this.dvh == null) {
            this.dvh = new bqs[this.dtP.length];
        }
        if (this.dvd.iyI) {
            this.a(10 + n, this.dtP[n].ResourceType, lcr.qzY, fmy2.asi);
        } else {
            this.a(10 + n, this.dtP[n].ResourceType, this.dvd.akX, fmy2.asi);
        }
    }

    private void a(gfn gfn2) {
        if (gfn2.aVk() == -1) {
            lfn.b(5, "SFEquipmentCreatorFO", "handleResourceCreateResponse() MessageTag is invalid.");
            return;
        }
        if (gfn2.aVk() == 5) {
            assert (this.dvd.iyH);
            cbx cbx2 = gfn2.dtF;
            if (cbx2 == null) {
                lfn.b(5, "SFEquipmentCreatorFO", "handleResourceCreateResponse() Container resource received from resourcemanager is null.");
                this.Vc();
                return;
            }
            this.dvg = this.a(cbx2, 0L);
            if (this.dvg == null) {
                lfn.b(5, "SFEquipmentCreatorFO", "handleResourceCreateResponse() Could not create inventoryitem for resource '" + cbx2.pa() + "'");
                this.Vc();
                return;
            }
            String string = this.dvd.eEa;
            if (string != null) {
                ff ff2 = new ff();
                ff2.setType(10368);
                ff2.av(string);
                eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, this.dvg.getGUID());
                eap2.bhp = ff2;
                this.MessageDelegator.F(eap2);
            }
            this.MessageDelegator.a((amf)cbx2);
        } else {
            int n = gfn2.aVk() - 10;
            cbx cbx3 = gfn2.dtF;
            if (cbx3 == null) {
                lfn.b(5, "SFEquipmentCreatorFO", "handleResourceCreateResponse() Resource received from resourcemanager is null.");
                lfn.b(5, "SFEquipmentCreatorFO", "handleResourceCreateResponse() Resource '" + this.dtP[n].pa() + "' could not be created.");
            } else {
                this.dvh[n] = this.a(cbx3, this.dtP[n].aXU);
                if (this.dvh[n] == null) {
                    lfn.b(5, "SFEquipmentCreatorFO", "handleResourceCreateResponse() Could not create inventoryitem for resource '" + cbx3.pa() + "'");
                } else {
                    this.a(cbx3, this.dtP[n]);
                    this.MessageDelegator.a((amf)cbx3);
                }
            }
            ++this.dvj;
            if (this.dvj == this.dtP.length) {
                this.arH();
            }
        }
    }

    private void a(gxy gxy2) {
        if (gxy2.gKN == null) {
            lfn.b(5, "SFEquipmentCreatorFO", "handleTransactionResponse() Info is null.");
            return;
        }
        if (gxy2.gKN.gKR != null) {
            this.MessageDelegator.oa(gxy2.gKN.gKR);
        }
        if (gxy2.iPj) {
            this.arG();
        } else {
            if (this.dvd.bOs()) {
                this.a(this.dvd, false);
            }
            this.Vc();
        }
    }

    private void d(ldv ldv2, int n, ldv ldv3) {
        assert (ldv2 != null);
        assert (n >= 0);
        assert (ldv3 != null);
        flc flc2 = (flc)this.MessageDelegator.h(7942, this.GUID, ldv2);
        flc2.aqs = n;
        flc2.aCK = ldv3;
        flc2.aCJ = 0;
        this.MessageDelegator.F(flc2);
    }

    private void a(ldv ldv2, int n, int n2, int n3, ldv ldv3) {
        assert (ldv2 != null);
        assert (n >= 0);
        assert (n2 >= 0);
        assert (n3 > 0);
        fmx fmx2 = (fmx)this.MessageDelegator.h(7993, this.GUID, ldv2);
        fmx2.aqs = n;
        fmx2.ResourceType = n2;
        fmx2.asi = n3;
        fmx2.aXQ = ldv3;
        fmx2.b(this.dvd.brE());
        this.MessageDelegator.F(fmx2);
    }

    private void a(cbx cbx2, cte cte2) {
        Object object;
        assert (cbx2 != null);
        assert (cte2 != null);
        ej ej22 = this.m(cbx2);
        if (ej22 != null) {
            cbx2.fi().b(ej22);
        }
        if (cug.wA((int)cte2.ResourceType) && (object = lea.epC().get(cte2.ResourceType)) != null) {
            ew ew2 = new ew();
            ew2.setType(13200);
            int n = (int)(this.MessageDelegator.bzy().getTimeInMillis() / 1000L);
            ew2.bi(n += ((civ)object).aPE());
            cbx2.fi().b(ew2.fm());
        }
        if (cte2.DR == null) {
            return;
        }
        block7: for (ej ej22 : cte2.DR) {
            if (cbx2.fi().ad(ej22.getType())) {
                ej ej3 = cbx2.fi().ae(ej22.getType());
                switch (ej3.getDataType()) {
                    case 0: {
                        ((eq)ej3).x(((eq)ej22).getBooleanValue());
                        continue block7;
                    }
                    case 2: {
                        ((et)ej3).o(((et)ej22).fN());
                        continue block7;
                    }
                    case 3: {
                        ((ew)ej3).bi(((ew)ej22).fQ());
                        continue block7;
                    }
                    case 6: {
                        ((fh)ej3).L(((fh)ej22).gy());
                        continue block7;
                    }
                    case 7: {
                        ((ff)ej3).av(((ff)ej22).getStringValue());
                        continue block7;
                    }
                    default: {
                        lfn.b(5, "SFEquipmentCreatorFO", "updateResourceAttributes() Update of attribute '" + ej22.getName() + "' failed for resource '" + cbx2.pa() + "'");
                        lfn.b(5, "SFEquipmentCreatorFO", "updateResourceAttributes() " + ej22.fo());
                        break;
                    }
                }
                continue;
            }
            cbx2.fi().b(ej22.fm());
        }
    }
}

