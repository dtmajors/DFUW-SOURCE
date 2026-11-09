/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cpk
 *  cug
 *  cxd
 *  lcr
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cww
extends cwv
implements cbq {
    private Map<ldv, cpk> bZp = lcn.emw();
    private Map<Integer, cpk> bZq = lcn.emw();
    private int bZr = 1;
    private ldv bZs = null;
    private int bZt = 0;
    private int bZu = 0;
    private int bZv = 0;
    private int dYk = 0;
    private Map<ldv, cpk> fFQ = lcn.emw();
    private Map<Integer, a> fFR = lcn.emw();
    private Map<cpk, Double> fFS = lcn.emw();
    private int bRk = 0;

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 34049) {
            this.a((gip)dxq2);
        } else if (dxq2.bEz() == 6146) {
            this.b((gfn)dxq2);
        } else if (dxq2.bEz() == 34050) {
            this.a((gis)dxq2);
        } else if (dxq2.bEz() == 11093) {
            this.a((gst)dxq2);
        } else if (dxq2.bEz() == 1044) {
            this.a((fuc)dxq2);
        } else if (dxq2.bEz() == 7956) {
            this.b((fna)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    private void a(gip gip2) {
        amj amj2 = lea.eoP().get(gip2.ResourceType);
        if (amj2 == null) {
            assert (false);
            return;
        }
        a a2 = new a(this);
        a2.eTv = amj2;
        this.fFR.put(this.bRk, a2);
        a2.fFT = gip2;
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = this.GUID;
        gfm2.ResourceType = gip2.ResourceType;
        gfm2.asi = 1;
        gfm2.iSi = 1;
        gfm2.gb = this.MessageDelegator.bzw();
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void b(gfn gfn2) {
        a a2 = this.fFR.get(gfn2.aVk() & 0xFFFFFF);
        if (a2 == null) {
            assert (false);
            return;
        }
        int n2 = gfn2.aVk() >> 24;
        if (n2 == 0) {
            cpk cpk2 = (cpk)gfn2.dtF;
            cpk2.setObjectType(162);
            cpk2.lF(a2.fFT.eTp);
            cpk2.u(a2.fFT.aXU);
            cpk2.a((cbq)this);
            bvd bvd2 = cpk2.aIl();
            assert (bvd2 != null);
            cpk2.d(bvd2);
            cpk2.a(a2.eTv);
            this.a(cpk2, a2.fFT);
            a2.fFU = cpk2;
        } else {
            --n2;
            cph cph2 = (cph)gfn2.dtF;
            bvd bvd3 = cph2.aAG();
            if (bvd3 == null) {
                bvd3 = cph2.aIl();
                cph2.d(bvd3);
            }
            bvd3.c(a2.fFU.aAG().av());
            bvd3.a(a2.fFU.aAG().aw());
            cph2.jv(a2.fFU.getGUID());
            cph2.kW(a2.fFU.aAG().axa());
            cph2.kV(a2.fFU.aAG().getGUID());
            cph2.g((cph)a2.fFU);
            this.MessageDelegator.a((amf)cph2);
            amk amk2 = a2.eTv.Gn().get(n2);
            a2.eTv.Gn().get(n2);
            if (amk2.byl == amk.a.byn) {
                a2.fFU.k(cph2);
            } else if (amk2.byl == amk.a.byo) {
                a2.fFU.a(cph2, amk2.byk);
            }
            a2.fFU.l(cph2);
            Map<String, eh> map = ei.ao(a2.fFU.aAG().getFileName());
            eh eh2 = map.get(amk2.byk);
            if (eh2 == null) {
                assert (false);
                return;
            }
            cph2.bo(eh2.fb().esF());
            cph2.p(eh2.fc());
            a2.fFV[n2] = cph2;
        }
    }

    private void a(cpk cpk2, gip gip2) {
        Object object;
        ff ff2 = (ff)cpk2.fi().ae(1360);
        if (ff2 != null) {
            ff2.av(gip2.aGB);
        }
        if (gip2.aGr > 0.0f && (object = (et)cpk2.fi().ae(352)) != null) {
            ((et)object).o(gip2.aGr);
        }
        object = (bvu)cpk2.aAG();
        if (gip2.aPp != null) {
            ((bvu)object).aAk();
            ((bvd)object).a(gip2.Rotation);
        } else {
            ljq ljq2 = gip2.Rotation.eqT();
            ljq2.rlV = 0.0f;
            ljq2.x = 0.0f;
            ((bvd)object).a(new lgl(ljq2));
        }
        ((bvu)object).i(gip2.Rotation);
        ((bvd)object).c(gip2.Position);
        this.MessageDelegator.a((amf)cpk2);
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bec();
        this.bed();
        this.VF();
    }

    protected void bec() {
        for (Map.Entry<Integer, a> entry : this.fFR.entrySet()) {
            if (entry.getValue().aEC == 0) {
                if (entry.getValue().fFU == null) continue;
                if (entry.getValue().fFU.aAG().isReadyToRun()) {
                    entry.getValue().aEC = 1;
                    entry.getValue().fFU.aWe();
                    this.a(entry.getKey(), entry.getValue());
                    continue;
                }
                if (!entry.getValue().fFU.aAG().azd()) continue;
                ftq ftq2 = (ftq)this.MessageDelegator.h(1037, this.getGUID(), entry.getValue().fFT.aO());
                ftq2.Rs = entry.getValue().fFU.getGUID();
                ftq2.iWb = false;
                this.MessageDelegator.E(ftq2);
                this.fFR.remove(entry.getKey());
                return;
            }
            if (entry.getValue().aEC != 1) continue;
            for (int i2 = 0; i2 < entry.getValue().fFV.length; ++i2) {
                cph cph2 = entry.getValue().fFV[i2];
                if (cph2 == null || entry.getValue().fFW[i2] || !cph2.aAG().isReadyToRun()) continue;
                entry.getValue().fFW[i2] = true;
                cph2.aSF();
                cph2.aSH();
                --entry.getValue().fFX;
            }
            if (entry.getValue().fFX != 0) continue;
            this.fFQ.put(entry.getValue().fFU.getGUID(), entry.getValue().fFU);
            ftq ftq3 = (ftq)this.MessageDelegator.h(1037, this.getGUID(), entry.getValue().fFT.aO());
            ftq3.Rs = entry.getValue().fFU.getGUID();
            ftq3.iWb = true;
            this.MessageDelegator.E(ftq3);
            this.fFR.remove(entry.getKey());
            return;
        }
    }

    protected void a(int n2, a a2) {
        a2.fFV = new cph[a2.eTv.Gn().size()];
        a2.fFW = new boolean[a2.eTv.Gn().size()];
        a2.fFX = a2.eTv.Gn().size();
        for (int i2 = 0; i2 < a2.eTv.Gn().size(); ++i2) {
            a2.fFW[i2] = false;
            amk amk2 = a2.eTv.Gn().get(i2);
            gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
            gfm2.sk(n2 | i2 + 1 << 24);
            gfm2.Yc = this.GUID;
            gfm2.ResourceType = amk2.ResourceType;
            gfm2.asi = 1;
            gfm2.iSi = 1;
            gfm2.gb = this.MessageDelegator.bzw();
            this.MessageDelegator.F(gfm2);
        }
    }

    protected void a(gis gis2) {
        cpk cpk2 = this.fFQ.remove(gis2.bVt());
        if (cpk2 == null) {
            assert (false);
            return;
        }
        cpk2.aVN();
        cpk2.aWf();
        cpk2.aVQ();
        cpk2.aVR();
        if (!cpk2.aXW() && cpk2.aXv()) {
            cpk2.lk(cpk2.aXq());
        }
        cpk2.aXs();
        this.MessageDelegator.hd(gis2.bVt());
        fuc fuc2 = (fuc)this.MessageDelegator.h(1044, this.GUID, gis2.aO());
        fuc2.Rs = gis2.bVt();
        fuc2.iWF = true;
        this.MessageDelegator.E(fuc2);
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    @Override
    public void a(cbx cbx2, et et2) {
    }

    @Override
    public void b(cbx cbx2) {
        if (cbx2 instanceof cpk) {
            this.a((cpk)cbx2);
        }
    }

    private void bed() {
        Iterator<Map.Entry<cpk, Double>> iterator = this.fFS.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<cpk, Double> entry = iterator.next();
            if (!(this.MessageDelegator.arc().rgz > entry.getValue())) continue;
            this.b(entry.getKey());
            iterator.remove();
        }
    }

    public void a(cpk cpk2) {
        cpk2.z(cpk2.aXZ().ER(), false);
        cpk2.aVQ();
        this.fFS.put(cpk2, this.MessageDelegator.arc().rgz + 5.0);
    }

    private void b(cpk cpk2) {
        cpk2.z(cpk2.aXZ().EQ(), false);
        this.c(cpk2);
        cpk2.aVR();
        assert (this.fFQ.remove(cpk2.getGUID()) != null);
        this.MessageDelegator.hd(cpk2.getGUID());
    }

    private void c(cpk cpk2) {
        fcq fcq2 = (fcq)this.MessageDelegator.h(9224, this.GUID, this.MessageDelegator.getGUID());
        fcq2.bst = bkd.dqC;
        fcq2.aZG = lcr.qAC;
        fcq2.akX = lcr.qEk;
        fcq2.aYF = lcr.qAC;
        fcq2.bsG = cpk2.az();
        fcq2.aYC = cxd.fJY;
        fcq2.Magnitude = cpk2.aXZ().Fm();
        fcq2.eKm = -3.0;
        fcq2.aSp = cpk2.aXZ().Fl();
        fcq2.a(cxd.f.fQW);
        fcq2.aYH = 1;
        fcq2.aYG = bfk.dgM;
        fcq2.bsE = 0;
        fcq2.bRD = 5;
        fcq2.gpI = -3.0;
        fcq2.aZH = cpk2.aAG().av();
        fcq2.Radius = cpk2.aXZ().Fk();
        fcq2.Position = cpk2.aAG().av();
        fcq2.dta = new int[]{cug.fgE};
        fcq2.dsZ = null;
        fcq2.gbe = bkd.dqy;
        fcq2.dtb = false;
        fcq2.dsL = null;
        this.MessageDelegator.H(fcq2);
    }

    public List<ldv> bee() {
        ArrayList<ldv> arrayList = lcn.emv();
        arrayList.addAll(this.fFQ.keySet());
        return arrayList;
    }

    public void a(pa pa2) {
        gip gip2 = (gip)this.MessageDelegator.h(34049, this.getGUID(), this.getGUID());
        gip2.aGr = pa2.aGx.aGr;
        gip2.aGB = pa2.aGx.aGB != null ? pa2.aGx.aGB : "";
        gip2.Position = pa2.aGx.Position;
        gip2.Rotation = pa2.aGx.Rotation;
        gip2.ResourceType = lea.enW().getType(pa2.aGx.ResourceName);
        gip2.eTp = pa2.aGx.aGC;
        gip2.aPp = pa2;
        gip2.aXU = pa2.aGx.aCF;
        this.receiveMessage(gip2);
    }

    private void a(gst gst2) {
        this.bZu = 0;
        this.bZt = 0;
        this.bZv = 0;
        if (this.bZs != null) {
            lfn.b(5, "SFTanksManagerServer", "handleSystemUnspawnAllRequestMessage(): Double unspawn all request(1)");
            return;
        }
        if (!this.bZp.isEmpty()) {
            lfn.b(5, "SFTanksManagerServer", "handleSystemUnspawnAllRequestMessage(): Double unspawn all request(2)");
            return;
        }
        if (!this.bZq.isEmpty()) {
            lfn.b(5, "SFTanksManagerServer", "handleSystemUnspawnAllRequestMessage(): Double unspawn all request(3)");
            return;
        }
        this.bZs = gst2.aO();
        for (Map.Entry<ldv, cpk> object : this.fFQ.entrySet()) {
            this.bZp.put(object.getKey(), object.getValue());
        }
        Iterator<Object> iterator = this.bZp.keySet().iterator();
        while (iterator.hasNext()) {
            ldv ldv2 = (ldv)iterator.next();
            cpk cpk2 = this.bZp.get(ldv2);
            if (cpk2.aXo() == null) {
                ++this.bZv;
                iterator.remove();
                this.a(cpk2, "No last owner - not unspawning");
                continue;
            }
            if (cpk2.aXv()) {
                ++this.bZt;
                iterator.remove();
                this.a(cpk2, "Tank is locked - not unspawning");
                continue;
            }
            gis gis2 = (gis)this.MessageDelegator.h(34050, this.getGUID(), this.getGUID());
            gis2.qo(ldv2);
            this.MessageDelegator.I(gis2);
        }
    }

    private void a(fuc fuc2) {
        ej[] ejArray;
        et et2;
        cpk cpk2 = this.bZp.remove(fuc2.Rs);
        if (cpk2 == null) {
            ++this.bZt;
            lfn.b(5, "SFTanksManagerServer", "handleObjectRemoveResponseMessage(): Could not find " + fuc2.Rs + " in UnspawnAllMap");
            assert (false);
            return;
        }
        if (!fuc2.iWF) {
            ++this.bZt;
            lfn.b(4, "SFTanksManagerServer", "handleObjectRemoveResponseMessage(): Not unspawned: " + cpk2);
            this.a(cpk2, "Removal failed");
            return;
        }
        if (cpk2.aXo() == null) {
            ++this.bZv;
            lfn.b(4, "SFTanksManagerServer", "handleObjectRemoveResponseMessage(): No owner GUID for unspawned tank " + cpk2);
            this.a(cpk2, "No last owner after unspawn, object lost");
            return;
        }
        int n2 = cug.uI((int)cpk2.az());
        if (n2 <= 0) {
            ++this.bZt;
            lfn.b(4, "SFTanksManagerServer", "handleObjectRemoveResponseMessage(): FigurineResourceType is invalid.");
            this.a(cpk2, "Figurine resource type incorrect");
            return;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), cpk2.aXo());
        fmz2.sk(this.bZr);
        this.bZq.put(this.bZr, cpk2);
        ++this.bZr;
        fmz2.bqd = new int[]{n2};
        fmz2.iIY = new int[]{1};
        ArrayList<Object> arrayList = lcn.abH(2);
        ff ff2 = (ff)cpk2.fi().ae(1360);
        if (ff2 != null) {
            arrayList.add(ff2.fn());
        }
        if ((et2 = (et)cpk2.fi().ae(352)) != null) {
            ejArray = et2.fn();
            ejArray.setType(9472);
            arrayList.add(ejArray);
        }
        ejArray = new ej[arrayList.size()];
        ejArray = arrayList.toArray(ejArray);
        fmz2.iQG = new ek[]{new ek(ejArray)};
        fmz2.b(bqy.dGd);
        this.MessageDelegator.E(fmz2);
        this.a(cpk2, "Requested addition to " + fmz2.amk() + " inventory");
    }

    private final void a(cpk cpk2, String string) {
        kcy kcy2 = (kcy)this.MessageDelegator.i(278, this.getGUID(), lcr.qyW);
        kcy2.hB = 0;
        kcy2.SN = 0;
        if (cpk2 != null) {
            kcy2.pev = cpk2.pa() + " " + cpk2.getGUID();
        }
        kcy2.aFo = string;
        kcy2.a(kcy.b.pfr);
        kcy2.a(kcy.a.pfc);
        this.MessageDelegator.b(kcy2);
    }

    private void b(fna fna2) {
        cpk cpk2 = this.bZq.remove(fna2.aVk());
        if (cpk2 == null) {
            ++this.bZt;
            lfn.b(5, "SFTanksManagerServer", "handleInventoryResourceCreateResponseMessage(): No tank found for message tag " + fna2.aVk());
            this.a(null, "Resource create response for unknown tank, tag=" + fna2.aVk());
            return;
        }
        if (fna2.iQK) {
            ++this.bZu;
            this.a(cpk2, "Completed addition to " + cpk2.aXo() + " inventory");
        } else {
            ++this.bZt;
            this.a(cpk2, "Addition to " + cpk2.aXo() + " inventory failed");
        }
    }

    private final void VF() {
        if (this.bZs == null) {
            return;
        }
        if (this.bZp.isEmpty() && this.bZq.isEmpty()) {
            gsu gsu2 = (gsu)this.MessageDelegator.h(11094, this.getGUID(), this.bZs);
            gsu2.jri = this.bZv;
            gsu2.jrh = this.bZu;
            gsu2.bZt = this.bZt;
            this.MessageDelegator.E(gsu2);
            this.bZs = null;
        }
    }
}

