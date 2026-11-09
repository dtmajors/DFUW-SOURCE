/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class atb
extends asz
implements bto {
    private Map<Integer, dzb> bYa = lcn.emw();
    private int bRk = 0;
    private Map<Integer, pa> bYb = lcn.emw();
    private Map<ldv, coo> bYc = lcn.emw();
    private LinkedList<coo> bYd = lcn.emA();

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 33793) {
            this.a((dzb)dxq2);
        } else if (dxq2.bEz() == 27907) {
            this.a((fef)dxq2);
        } else if (dxq2.bEz() == 6146) {
            this.b((gfn)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    private void a(dzb dzb2) {
        this.bYa.put(this.bRk, dzb2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = this.GUID;
        gfm2.ResourceType = dzb2.ResourceType;
        gfm2.asi = 1;
        gfm2.iSi = 1;
        gfm2.gb = this.MessageDelegator.bzw();
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(fef fef2) {
        if (fef2.bOD() == null) {
            return;
        }
        coo coo2 = this.bYc.get(fef2.bOD());
        if (coo2 == null) {
            this.a(fef2, false);
            return;
        }
        if (!coo2.aXW() && coo2.aXv()) {
            coo2.lk(coo2.aXq());
        }
        this.a(coo2, true);
        this.a(fef2, true);
    }

    private void a(coo coo2, boolean bl) {
        coo coo3 = this.bYc.remove(coo2.getGUID());
        if (coo3 == null) {
            lfn.b(5, "SFAirShipManagerServer", "removeAirship() Could not find airship " + coo2.getGUID());
            assert (false);
            return;
        }
        coo2.aXs();
        this.MessageDelegator.hd(coo2.getGUID());
        if (bl) {
            gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
            gga2.ResourceType = coo3.az();
            gga2.jgt = false;
            this.MessageDelegator.F(gga2);
        }
    }

    private void a(fef fef2, boolean bl) {
        fuc fuc2 = (fuc)this.MessageDelegator.h(1044, this.GUID, fef2.aO());
        fuc2.Rs = fef2.bOD();
        fuc2.iWF = bl;
        this.MessageDelegator.F(fuc2);
    }

    private void b(gfn gfn2) {
        pa pa2 = this.bYb.remove(gfn2.aVk());
        if (pa2 != null) {
            this.a(pa2, gfn2);
            return;
        }
        dzb dzb2 = this.bYa.get(gfn2.aVk());
        if (dzb2 == null) {
            assert (false);
            return;
        }
        coo coo2 = (coo)gfn2.dtF;
        coo2.sk(gfn2.aVk());
        coo2.a(this);
        this.bYc.put(coo2.getGUID(), coo2);
        coo2.setObjectType(160);
        bvd bvd2 = coo2.aIl();
        assert (bvd2 != null);
        coo2.d(bvd2);
        this.bYd.add(coo2);
        this.a(coo2, dzb2);
    }

    private void a(coo coo2, dzb dzb2) {
        Object object;
        ff ff2 = (ff)coo2.fi().ae(1360);
        if (ff2 != null) {
            ff2.av(dzb2.aGB);
        }
        if (dzb2.aGr > 0.0f && (object = (et)coo2.fi().ae(352)) != null) {
            ((et)object).o(dzb2.aGr);
        }
        object = (bvu)coo2.aAG();
        if (dzb2.aPp != null) {
            ((bvu)object).aAk();
            ((bvd)object).a(dzb2.Rotation);
        } else {
            ljq ljq2 = dzb2.Rotation.eqT();
            ljq2.rlV = 0.0f;
            ljq2.x = 0.0f;
            ((bvd)object).a(new lgl(ljq2));
        }
        ((bvu)object).i(dzb2.Rotation);
        ((bvd)object).c(dzb2.Position);
        this.MessageDelegator.a((amf)((Object)coo2));
        coo2.lm(dzb2.eTp);
    }

    @Override
    public void doTick(ldz ldz2) {
        this.Va();
    }

    @Override
    public void a(col col2) {
        if (col2 instanceof coo) {
            coo coo2 = (coo)col2;
            this.a(coo2, true);
        }
    }

    private void Va() {
        if (!this.bYd.isEmpty()) {
            Iterator iterator = this.bYd.iterator();
            while (iterator.hasNext()) {
                dzb dzb2;
                coo coo2 = (coo)iterator.next();
                bvu bvu2 = (bvu)coo2.aAG();
                if (bvu2.isReadyToRun()) {
                    iterator.remove();
                    dzb2 = this.bYa.remove(coo2.aVk());
                    if (dzb2 == null) continue;
                    this.a(coo2, dzb2, true);
                    continue;
                }
                if (!bvu2.azd()) continue;
                iterator.remove();
                dzb2 = this.bYa.remove(coo2.aVk());
                if (dzb2 != null) {
                    this.a(coo2, dzb2, false);
                }
                this.a(coo2, false);
            }
        }
    }

    private void a(coo coo2, dzb dzb2, boolean bl) {
        ftq ftq2 = (ftq)this.MessageDelegator.h(1037, this.getGUID(), dzb2.aO());
        ftq2.Rs = coo2 != null ? coo2.getGUID() : null;
        ftq2.iWb = bl;
        this.MessageDelegator.F(ftq2);
        if (bl) {
            gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
            gga2.jgt = true;
            gga2.ResourceType = dzb2.ResourceType;
            this.MessageDelegator.F(gga2);
        }
    }

    public void a(pa pa2) {
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        this.bYb.put(this.bRk, pa2);
        ++this.bRk;
        gfm2.Yc = this.GUID;
        gfm2.ResourceType = lea.enW().getType(pa2.aGx.ResourceName);
        gfm2.asi = 1;
        gfm2.iSi = 1;
        gfm2.gb = pa2.aGw;
        this.MessageDelegator.nZ(gfm2.gb);
        this.MessageDelegator.F(gfm2);
    }

    private ldv a(pa pa2, gfn gfn2) {
        Object object;
        coo coo2 = (coo)gfn2.dtF;
        coo2.sk(gfn2.aVk());
        coo2.jv(this.getGUID());
        coo2.lF(pa2.aGx.aGC);
        coo2.u(pa2.aGx.aCF);
        this.bYc.put(coo2.getGUID(), coo2);
        ff ff2 = (ff)coo2.fi().ae(1360);
        if (ff2 != null && pa2.aGx.aGB != null) {
            ff2.av(pa2.aGx.aGB);
        }
        if (pa2.aGx.aGr > 0.0f && (object = (et)coo2.fi().ae(352)) != null) {
            ((et)object).o(pa2.aGx.aGr);
        }
        object = (bvr)coo2.aAG();
        ((bvr)object).aAk();
        ((bvd)object).c(pa2.aGx.Position);
        ((bvd)object).a(pa2.aGx.Rotation);
        ((bvr)object).i(pa2.aGx.Rotation);
        this.MessageDelegator.a((amf)((Object)coo2));
        this.bYd.add(coo2);
        coo2.a(this);
        return coo2.getGUID();
    }

    public Collection<? extends ldv> Vb() {
        return this.bYc.keySet();
    }
}

