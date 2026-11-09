/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 *  lcr
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class bxd
extends bxc {
    private int bZe = 1;
    private Map<Integer, fsa> dYf = lcn.emw();
    private Map<Integer, pa> bYb = lcn.emw();
    private Map<ldv, cpg> dYg = lcn.emw();
    private LinkedList<cpg> dYh = lcn.emA();
    private LinkedList<cpg> dYi = lcn.emA();
    private float dYj = 5.0f;
    private Map<ldv, cpg> bZp = lcn.emw();
    private Map<Integer, cpg> bZq = lcn.emw();
    private int bZr = 1;
    private ldv bZs = null;
    private int bZt = 0;
    private int bZu = 0;
    private int bZv = 0;
    private int dYk = 0;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.aCZ();
        this.aDa();
        this.VF();
    }

    private void aCZ() {
        if (!this.dYh.isEmpty()) {
            Iterator iterator = this.dYh.iterator();
            while (iterator.hasNext()) {
                fsa fsa2;
                cpg cpg2 = (cpg)iterator.next();
                bvr bvr2 = (bvr)cpg2.aAG();
                if (bvr2.isReadyToRun()) {
                    iterator.remove();
                    fsa2 = this.dYf.remove(cpg2.aVk());
                    if (fsa2 == null) continue;
                    this.a(cpg2, fsa2, true);
                    continue;
                }
                if (!bvr2.azd()) continue;
                lfn.b(5, "SFMountManagerServer", "checkMountAssembleList() Could not spawn mount!");
                iterator.remove();
                fsa2 = this.dYf.remove(cpg2.aVk());
                if (fsa2 != null) {
                    this.a(cpg2, fsa2, false);
                }
                this.a(cpg2, false);
            }
        }
    }

    private void a(cpg cpg2, fsa fsa2, boolean bl) {
        ftq ftq2 = (ftq)this.MessageDelegator.h(1037, this.getGUID(), fsa2.aO());
        ftq2.Rs = cpg2 != null ? cpg2.getGUID() : null;
        ftq2.iWb = bl;
        this.MessageDelegator.F(ftq2);
        if (bl) {
            gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
            gga2.jgt = true;
            gga2.ResourceType = fsa2.ResourceType;
            this.MessageDelegator.F(gga2);
            if (cpg2 != null) {
                cpg2.oM(del.gjN);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 14593: {
                this.a((fsa)dxq2);
                break;
            }
            case 14594: {
                this.a((fsd)dxq2);
                break;
            }
            case 6146: {
                this.b((gfn)dxq2);
                break;
            }
            case 11093: {
                this.a((gst)dxq2);
                break;
            }
            case 1044: {
                this.a((fuc)dxq2);
                break;
            }
            case 7956: {
                this.b((fna)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fsa fsa2) {
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bZe);
        gfm2.Yc = this.GUID;
        gfm2.ResourceType = fsa2.ResourceType;
        gfm2.asi = 1;
        gfm2.iSi = 1;
        gfm2.gb = this.MessageDelegator.bzw();
        this.MessageDelegator.F(gfm2);
        this.dYf.put(new Integer(this.bZe), fsa2);
        ++this.bZe;
    }

    private final void a(cpg cpg2, String string) {
        kcy kcy2 = (kcy)this.MessageDelegator.i(278, this.getGUID(), lcr.qyW);
        kcy2.hB = 0;
        kcy2.SN = 0;
        if (cpg2 != null) {
            kcy2.pev = cpg2.pa() + " " + cpg2.getGUID();
        }
        kcy2.aFo = string;
        kcy2.a(kcy.b.pfr);
        kcy2.a(kcy.a.pfc);
        this.MessageDelegator.b(kcy2);
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

    private void b(fna fna2) {
        cpg cpg2 = this.bZq.remove(fna2.aVk());
        if (cpg2 == null) {
            ++this.bZt;
            lfn.b(5, "SFMountManagerServer", "handleInventoryResourceCreateResponseMessage(): No mount found for message tag " + fna2.aVk());
            this.a(null, "Resource create response for unknown mount, tag=" + fna2.aVk());
            return;
        }
        if (fna2.iQK) {
            ++this.bZu;
            this.a(cpg2, "Completed addition to " + cpg2.aXo() + " inventory");
        } else {
            ++this.bZt;
            this.a(cpg2, "Addition to " + cpg2.aXo() + " inventory failed");
        }
    }

    private void a(fuc fuc2) {
        ej[] ejArray;
        et et2;
        cpg cpg2 = this.bZp.remove(fuc2.Rs);
        if (cpg2 == null) {
            ++this.bZt;
            lfn.b(5, "SFMountManagerServer", "handleObjectRemoveResponseMessage(): Could not find " + fuc2.Rs + " in UnspawnAllMap");
            assert (false);
            return;
        }
        if (!fuc2.iWF) {
            ++this.bZt;
            lfn.b(4, "SFMountManagerServer", "handleObjectRemoveResponseMessage(): Not unspawned: " + cpg2);
            this.a(cpg2, "Removal failed");
            return;
        }
        if (cpg2.aXo() == null) {
            ++this.bZv;
            lfn.b(4, "SFMountManagerServer", "handleObjectRemoveResponseMessage(): No owner GUID for unspawned mount " + cpg2);
            this.a(cpg2, "No last owner after unspawn, object lost");
            return;
        }
        int n = cug.uI((int)cpg2.az());
        if (n <= 0) {
            ++this.bZt;
            lfn.b(4, "SFMountManagerServer", "handleObjectRemoveResponseMessage(): FigurineResourceType is invalid.");
            this.a(cpg2, "Figurine resource type incorrect");
            return;
        }
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), cpg2.aXo());
        fmz2.sk(this.bZr);
        this.bZq.put(this.bZr, cpg2);
        ++this.bZr;
        fmz2.bqd = new int[]{n};
        fmz2.iIY = new int[]{1};
        ArrayList<Object> arrayList = lcn.abH(2);
        ff ff2 = (ff)cpg2.fi().ae(1360);
        if (ff2 != null) {
            arrayList.add(ff2.fn());
        }
        if ((et2 = (et)cpg2.fi().ae(352)) != null) {
            ejArray = et2.fn();
            ejArray.setType(9472);
            arrayList.add(ejArray);
        }
        ejArray = new ej[arrayList.size()];
        ejArray = arrayList.toArray(ejArray);
        fmz2.iQG = new ek[]{new ek(ejArray)};
        fmz2.b(bqy.dGd);
        this.MessageDelegator.E(fmz2);
        this.a(cpg2, "Requested addition to " + fmz2.amk() + " inventory");
    }

    private void a(gst gst2) {
        assert (this.bZp.isEmpty());
        assert (this.bZq.isEmpty());
        assert (this.bZs == null);
        this.bZu = 0;
        this.bZt = 0;
        this.bZv = 0;
        if (this.bZs != null) {
            lfn.b(5, "SFMountManagerServer", "handleSystemUnspawnAllRequestMessage(): Double unspawn all request(1)");
            return;
        }
        if (!this.bZp.isEmpty()) {
            lfn.b(5, "SFMountManagerServer", "handleSystemUnspawnAllRequestMessage(): Double unspawn all request(2)");
            return;
        }
        if (!this.bZq.isEmpty()) {
            lfn.b(5, "SFMountManagerServer", "handleSystemUnspawnAllRequestMessage(): Double unspawn all request(3)");
            return;
        }
        this.bZs = gst2.aO();
        this.bZp.putAll(this.dYg);
        Iterator<ldv> iterator = this.bZp.keySet().iterator();
        while (iterator.hasNext()) {
            ldv ldv2 = iterator.next();
            cpg cpg2 = this.bZp.get(ldv2);
            if (cpg2.aXo() == null) {
                ++this.bZv;
                iterator.remove();
                this.a(cpg2, "No last owner - not unspawning");
                continue;
            }
            if (cpg2.aXv()) {
                ++this.bZt;
                iterator.remove();
                this.a(cpg2, "Mount is locked - not unspawning");
                continue;
            }
            fsd fsd2 = (fsd)this.MessageDelegator.h(14594, this.getGUID(), this.getGUID());
            fsd2.iVo = ldv2;
            this.MessageDelegator.I(fsd2);
        }
    }

    private void a(fsd fsd2) {
        if (fsd2.iVo == null) {
            return;
        }
        cpg cpg2 = this.dYg.get(fsd2.iVo);
        if (cpg2 == null) {
            this.a(fsd2, false);
            return;
        }
        if (!cpg2.aXW() && cpg2.aXv()) {
            cpg2.lk(cpg2.aXq());
        }
        this.a(cpg2, true);
        this.a(fsd2, true);
    }

    private void b(gfn gfn2) {
        Object object;
        pa pa2 = this.bYb.remove(gfn2.aVk());
        if (pa2 != null) {
            this.b(pa2, gfn2);
            return;
        }
        fsa fsa2 = this.dYf.get(new Integer(gfn2.aVk()));
        if (fsa2 == null) {
            lfn.b(5, "SFMountServerManagerServer", "handleResourceCreateResponseMessage() COULD NOT FIND THE KEY FOR THIS RESOURCECREATEMESSGE: " + gfn2.dtF.pa());
            assert (false);
            this.d(gfn2);
            return;
        }
        assert (fsa2 instanceof fsa);
        fsa fsa3 = fsa2;
        if (gfn2.dtF == null) {
            lfn.b(5, "SFMountServerManagerServer", "handleResourceCreateResponseMessage() Resource Created was NULL");
            assert (false);
            this.d(gfn2);
            return;
        }
        assert (gfn2.dtF instanceof cpg);
        cpg cpg2 = (cpg)gfn2.dtF;
        cpg2.sk(gfn2.aVk());
        cpg2.jv(this.getGUID());
        cpg2.lF(fsa3.eTp);
        cpg2.u(fsa3.aXU);
        this.dYg.put(cpg2.getGUID(), cpg2);
        ff ff2 = (ff)cpg2.fi().ae(1360);
        if (ff2 != null) {
            ff2.av(fsa3.aGB);
        }
        if (fsa3.aGr > 0.0f && (object = (et)cpg2.fi().ae(352)) != null) {
            ((et)object).o(fsa3.aGr);
        }
        object = (bvr)cpg2.aAG();
        ljq ljq2 = new ljq(fsa3.Position);
        ((bvd)object).c(ljq2);
        ((bvr)object).i(fsa3.Rotation);
        ljq ljq3 = fsa3.Rotation.eqT();
        lgl lgl2 = new lgl(0.0f, ljq3.y, 0.0f);
        lgl lgl3 = new lgl(0.0f, (float)Math.PI, 0.0f);
        lgl2.Y(lgl3);
        ((bvd)object).a(lgl2);
        this.MessageDelegator.a((amf)((Object)cpg2));
        this.dYh.add(cpg2);
        this.a(cpg2);
        cpg2.a(this);
        cpg2.lm(fsa3.eTp);
        this.a(cpg2, fsa3.duR, fsa3.aGr > 0.0f);
    }

    private ldv b(pa pa2, gfn gfn2) {
        Object object;
        cpg cpg2 = (cpg)gfn2.dtF;
        cpg2.sk(gfn2.aVk());
        cpg2.jv(this.getGUID());
        cpg2.lF(pa2.aGx.aGC);
        cpg2.u(pa2.aGx.aCF);
        this.dYg.put(cpg2.getGUID(), cpg2);
        ff ff2 = (ff)cpg2.fi().ae(1360);
        if (ff2 != null && pa2.aGx.aGB != null) {
            ff2.av(pa2.aGx.aGB);
        }
        if (pa2.aGx.aGr > 0.0f && (object = (et)cpg2.fi().ae(352)) != null) {
            ((et)object).o(pa2.aGx.aGr);
        }
        object = (bvr)cpg2.aAG();
        ((bvr)object).aAk();
        ((bvd)object).c(pa2.aGx.Position);
        ((bvd)object).a(pa2.aGx.Rotation);
        ((bvr)object).i(pa2.aGx.Rotation);
        this.MessageDelegator.a((amf)((Object)cpg2));
        this.dYh.add(cpg2);
        this.a(cpg2);
        cpg2.a(this);
        int n = lea.enW().getType(pa2.aGx.aGz);
        this.a(cpg2, n, pa2.aGx.aGr > 0.0f);
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = cpg2.az();
        this.MessageDelegator.F(gga2);
        return cpg2.getGUID();
    }

    private void a(cpg cpg2, int n, boolean bl) {
        if (n > 0) {
            ew ew2 = (ew)cpg2.fi().ae(13632);
            if (ew2 != null) {
                ew2.bi(n);
            }
            int n2 = cug.uJ((int)n);
            assert (n2 != -1);
            if (n2 != cpg2.az()) {
                et et2;
                float f2;
                int[] nArray;
                for (int n3 : nArray = ep.OM) {
                    f2 = cug.bi((int)n2, (int)n3);
                    et2 = (et)cpg2.fi().ae(n3);
                    if (et2 == null || !(f2 > 0.0f)) continue;
                    et2.o(f2);
                }
                float f3 = cug.bi((int)n2, (int)1088);
                et et3 = (et)cpg2.fi().ae(1088);
                if (et3 != null && f3 > 0.0f) {
                    et3.o(f3);
                }
                float f4 = cug.bi((int)n2, (int)354);
                et et4 = (et)cpg2.fi().ae(354);
                if (et4 != null && f4 > 0.0f) {
                    et4.o(f4);
                }
                if (!bl) {
                    f2 = cug.bi((int)n2, (int)352);
                    et2 = (et)cpg2.fi().ae(352);
                    if (et2 != null && f2 > 0.0f) {
                        et2.o(f2);
                    }
                }
                f2 = cug.bi((int)n2, (int)208);
                et2 = (et)cpg2.fi().ae(208);
                if (et2 != null && f2 > 0.0f) {
                    et2.o(f2);
                }
                float f5 = cug.bi((int)n2, (int)11056);
                et et5 = (et)cpg2.fi().ae(11056);
                if (et5 != null && f5 > 0.0f) {
                    et5.o(f5);
                }
                float f6 = cug.bi((int)n2, (int)1536);
                et et6 = (et)cpg2.fi().ae(1536);
                if (et6 != null && f6 > 0.0f) {
                    et6.o(f6);
                }
            }
        }
    }

    private void a(cpg cpg2) {
        assert (cpg2.aAG() != null);
        assert (cpg2.aAG().getFileName() != null);
        assert (cpg2.aAG() != null);
        Map<String, eh> map = ei.ao(cpg2.aAG().getFileName());
        assert (map != null);
        eh eh2 = map.get("AttachPoint_Mount_Rider1 BaseOffset");
        assert (eh2 != null);
        cpg2.v(new lgl(eh2.getRotation()));
        assert (eh2.fb() != null);
        cpg2.bw(eh2.fb());
        eh2 = map.get("AttachPoint_Mount_Rider1");
        assert (eh2 != null);
        cpg2.hM(eh2.getFrameName());
        cpg2.bu(eh2.getRotation());
        cpg2.bv(eh2.fb());
    }

    private void d(gfn gfn2) {
        if (gfn2.dtF != null) {
            return;
        }
    }

    @Override
    public void a(cpe cpe2) {
        cpg cpg2 = (cpg)cpe2;
        assert (cpg2 != null);
        cpg2.bE(this.MessageDelegator.arc().rgz + (double)this.dYj);
        this.dYi.add(cpg2);
    }

    private void aDa() {
        cpg cpg2;
        if (this.dYi.isEmpty()) {
            return;
        }
        Iterator iterator = this.dYi.iterator();
        while (iterator.hasNext() && (cpg2 = (cpg)iterator.next()).aXn() <= this.MessageDelegator.arc().rgz) {
            iterator.remove();
            this.a(cpg2, true);
        }
    }

    private void a(cpg cpg2, boolean bl) {
        cpg cpg3 = this.dYg.remove(cpg2.getGUID());
        if (cpg3 == null) {
            lfn.b(5, "SFMountManagerServer", "removeMount() Could not find mount " + cpg2.getGUID());
            assert (false);
            return;
        }
        cpg2.aXs();
        this.MessageDelegator.hd(cpg2.getGUID());
        if (bl) {
            gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
            gga2.ResourceType = cpg3.az();
            gga2.jgt = false;
            this.MessageDelegator.F(gga2);
        }
    }

    private void a(fsd fsd2, boolean bl) {
        fuc fuc2 = (fuc)this.MessageDelegator.h(1044, this.GUID, fsd2.aO());
        fuc2.Rs = fsd2.iVo;
        fuc2.iWF = bl;
        this.MessageDelegator.F(fuc2);
    }

    public List<ldv> aDb() {
        ArrayList<ldv> arrayList = lcn.abH(this.dYg.size());
        arrayList.addAll(this.dYg.keySet());
        return arrayList;
    }

    public void a(pa pa2) {
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bZe);
        this.bYb.put(this.bZe, pa2);
        ++this.bZe;
        gfm2.Yc = this.GUID;
        gfm2.ResourceType = lea.enW().getType(pa2.aGx.ResourceName);
        gfm2.asi = 1;
        gfm2.iSi = 1;
        gfm2.gb = pa2.aGw;
        this.MessageDelegator.nZ(gfm2.gb);
        this.MessageDelegator.F(gfm2);
    }
}

