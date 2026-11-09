/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cph
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class bni
extends bng {
    private static final double dwb = 5.0;
    private Map<Integer, lil<ffy, coz, cph>> dwc = lcn.emw();
    private Map dwd = lcn.emw();
    private Map dwe = lcn.emw();
    private LinkedList<lil> bZh = lcn.emA();
    private LinkedList<lil> dwf = lcn.emA();
    private LinkedList<coz> dwg = lcn.emA();
    private Map<Integer, lfs<ffw, coz>> dwh = lcn.emw();
    private int bRk = 1;

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.VD();
        this.arU();
        this.arT();
    }

    private void arT() {
        if (this.dwg.isEmpty()) {
            return;
        }
        Iterator iterator = this.dwg.iterator();
        while (iterator.hasNext()) {
            coz coz2 = (coz)((Object)iterator.next());
            if (coz2.aWD() > this.MessageDelegator.arc().rgz) continue;
            iterator.remove();
            this.c(coz2);
        }
    }

    private void arU() {
        if (this.dwf.isEmpty()) {
            return;
        }
        Iterator iterator = this.dwf.iterator();
        while (iterator.hasNext()) {
            lil lil2 = (lil)iterator.next();
            cph cph2 = (cph)lil2.reZ;
            coz coz2 = (coz)((Object)lil2.reY);
            ffy ffy2 = (ffy)lil2.reX;
            bvu bvu2 = (bvu)cph2.aAG();
            if (bvu2.isReadyToRun()) {
                iterator.remove();
                this.a(coz2, cph2, ffy2);
                this.bZh.add(lil2);
                continue;
            }
            if (!bvu2.azd()) continue;
            lfn.b(5, "SFGunManagerServer", "checkBaseAssembleList() Could not spawn gunbase!");
            iterator.remove();
            this.d(coz2);
            this.a(coz2, ffy2, false);
        }
    }

    private void a(coz coz2, ffy ffy2, boolean bl2) {
        ftq ftq2 = (ftq)this.MessageDelegator.h(1037, this.getGUID(), ffy2.aO());
        ftq2.Rs = coz2 != null ? coz2.getGUID() : null;
        ftq2.iWb = bl2;
        this.MessageDelegator.F(ftq2);
        if (bl2 && coz2 != null) {
            coz2.aWe();
        }
    }

    private void VD() {
        if (this.bZh.isEmpty()) {
            return;
        }
        Iterator iterator = this.bZh.iterator();
        while (iterator.hasNext()) {
            lil lil2 = (lil)iterator.next();
            cph cph2 = (cph)lil2.reZ;
            coz coz2 = (coz)((Object)lil2.reY);
            ffy ffy2 = (ffy)lil2.reX;
            if (!cph2.aAG().isReadyToRun() || !coz2.aAG().isReadyToRun()) continue;
            iterator.remove();
            coz2.jv(cph2.getGUID());
            coz2.kW(cph2.aAG().axa());
            coz2.kV(cph2.aAG().getGUID());
            coz2.aSF();
            coz2.aSH();
            this.a(coz2, ffy2, true);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8449: {
                this.a((ffy)dxq2);
                break;
            }
            case 8455: {
                this.a((ffw)dxq2);
                break;
            }
            case 8450: {
                this.a((fgd)dxq2);
                break;
            }
            case 6149: {
                this.b((gfl)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ffy ffy2) {
        if (ffy2.bOX() < 0) {
            this.dwd.put(new Integer(this.bRk), ffy2);
            gfk gfk2 = (gfk)this.MessageDelegator.h(6148, this.getGUID(), lcr.qCq);
            gfk2.sk(this.bRk);
            gfk2.Yc = ffy2.bOW() ? this.getGUID() : ffy2.bFz();
            gfk2.ResourceType = ffy2.az();
            gfk2.jgk = ffy2.bOV();
            gfk2.iSi = 1;
            this.MessageDelegator.F(gfk2);
            ++this.bRk;
            return;
        }
        lil lil2 = new lil();
        lil2.reX = ffy2;
        lil2.reY = null;
        lil2.reZ = null;
        this.dwc.put(new Integer(this.bRk), lil2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = ffy2.bFz() == null ? this.GUID : ffy2.bFz();
        gfm2.ResourceType = ffy2.bOX();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        if (ffy2.az() > 0) {
            gfm gfm3 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
            gfm3.sk(this.bRk);
            gfm3.Yc = ffy2.bFz() == null ? this.GUID : ffy2.bFz();
            gfm3.ResourceType = ffy2.az();
            gfm3.iSi = 1;
            this.MessageDelegator.F(gfm3);
        }
        ++this.bRk;
    }

    private void a(ffw ffw2) {
        cph cph2 = ffw2.eRt;
        if (cph2 == null) {
            lfn.b(5, "SFGunManagerServer", "handleGunCreateHeadRequestMessage() GunBase is NULL!");
            if (ffw2.ikP) {
                coz[] cozArray = new coz[1];
                cph[] cphArray = new cph[1];
                this.a(ffw2.aO(), ffw2.aVk(), cozArray, ffw2.aVk(), cphArray);
            }
            assert (false);
            return;
        }
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = ffw2.ilU == null ? this.GUID : ffw2.ilU;
        gfm2.ResourceType = ffw2.iLr;
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        lfs lfs2 = new lfs();
        lfs2.reX = ffw2;
        lfs2.reY = null;
        this.dwh.put(new Integer(this.bRk), lfs2);
        ++this.bRk;
    }

    private void b(gfl gfl2) {
        int n;
        ffy ffy2 = (ffy)this.dwd.remove(new Integer(gfl2.aVk()));
        if (ffy2 == null) {
            assert (false);
            return;
        }
        if (gfl2.jgl == null) {
            lfn.b(5, "SFGunManagerServer", "handleResourceMultiResponse() ERROR Couldn't create guns");
            if (ffy2.bFj()) {
                this.a(ffy2.aO(), ffy2.aVk(), null, ffy2.bOY(), null);
            }
            return;
        }
        if (gfl2.jgl.length > 0) assert (gfl2.jgl[0] instanceof coz);
        coz[] cozArray = new coz[gfl2.jgl.length];
        for (n = 0; n < gfl2.jgl.length; ++n) {
            cozArray[n] = (coz)gfl2.jgl[n];
            this.a(cozArray[n]);
        }
        if (ffy2.bFj()) {
            this.a(ffy2.aO(), ffy2.aVk(), cozArray, ffy2.bOY(), null);
        }
        if (ffy2.bOW()) {
            for (n = 0; n < cozArray.length; ++n) {
                this.a(cozArray[n], ffy2);
                this.dwe.put(cozArray[n].getGUID(), cozArray[n]);
                cozArray[n].gB(false);
            }
        } else {
            for (n = 0; n < cozArray.length; ++n) {
                cozArray[n].gB(false);
            }
        }
    }

    void a(gfn gfn2) {
        int n = gfn2.aVk();
        lil<ffy, coz, cph> lil2 = this.dwc.get(n);
        if (lil2 != null) {
            boolean bl2;
            assert (lil2 != null);
            assert (gfn2.dtF != null);
            ffy ffy2 = (ffy)lil2.reX;
            boolean bl3 = bl2 = ffy2.az() > 0;
            if (bl2 && gfn2.dtF.az() == ffy2.az()) {
                lil2.reY = (coz)gfn2.dtF;
            }
            if (gfn2.dtF.az() == ffy2.bOX()) {
                lil2.reZ = (cph)gfn2.dtF;
            }
            if (lil2.reY == null && bl2 || lil2.reZ == null) {
                return;
            }
            this.dwc.remove(new Integer(n));
            coz coz2 = (coz)((Object)lil2.reY);
            cph cph2 = (cph)lil2.reZ;
            this.a(cph2);
            if (bl2) {
                cph2.g((cph)coz2);
                cph2.jv(coz2.getGUID());
                coz2.e(cph2);
                this.b(coz2);
                this.a(coz2);
                coz2.gB(true);
                this.a(cph2, coz2);
            }
            if (ffy2.bFz() == null) {
                this.a(cph2, ffy2);
                this.dwf.add(lil2);
                if (bl2) {
                    coz2.a(this);
                }
            }
            if (ffy2.bFj()) assert (ffy2.bFz() != null);
            if (ffy2.bFj()) {
                coz[] cozArray = new coz[1];
                cph[] cphArray = new cph[1];
                cozArray[0] = coz2;
                cphArray[0] = cph2;
                this.a(ffy2.aO(), ffy2.aVk(), cozArray, ffy2.bOY(), cphArray);
            }
            return;
        }
        lfs<ffw, coz> lfs2 = this.dwh.remove(n);
        if (lfs2 == null) {
            assert (false);
            return;
        }
        if (gfn2.dtF == null) {
            assert (false);
            return;
        }
        lfs2.reY = (coz)gfn2.dtF;
        ffw ffw2 = (ffw)lfs2.reX;
        cph cph3 = ffw2.eRt;
        coz coz3 = (coz)((Object)lfs2.reY);
        cph3.g((cph)coz3);
        cph3.jv(coz3.getGUID());
        coz3.e(ffw2.eRt);
        this.a(ffw2.eRt, coz3);
        coz3.gB(true);
        this.b(coz3);
        this.a(coz3);
        if (ffw2.ikP) {
            this.a(ffw2.aO(), ffw2.aVk(), coz3);
        }
    }

    private void a(coz coz2) {
        bwm bwm2 = lea.eok().get(coz2.az());
        if (bwm2 == null) {
            lfn.b(5, "SFGunManagerServer", "setupGunInfo() ERROR NO CANNONINFO FOR THIS GUN:" + coz2.pa());
            assert (false) : "No CannonInfo for this: " + coz2.pa();
            return;
        }
        coz2.a(bwm2);
    }

    private void a(cph cph2, coz coz2) {
        assert (cph2.aAG() != null);
        Map<String, eh> map = ei.ao(cph2.aAG().getFileName());
        assert (map != null);
        eh eh2 = map.get("AttachPoint_Gun Base Gun");
        assert (eh2 != null);
        coz2.bo(eh2.fb());
        coz2.p(new lgl(eh2.getRotation()));
        eh2 = map.get("AttachPoint_Gun Base Player");
        assert (eh2 != null);
        coz2.bs(eh2.fb());
        coz2.t(new lgl(eh2.getRotation()));
    }

    private void a(ldv ldv2, int n, coz[] cozArray, int n2, cph[] cphArray) {
        ffz ffz2 = (ffz)this.MessageDelegator.h(8451, this.getGUID(), ldv2);
        ffz2.sk(n);
        ffz2.GC(n2);
        ffz2.b(cozArray);
        ffz2.a(cphArray);
        this.MessageDelegator.F(ffz2);
    }

    private void a(ldv ldv2, int n, coz coz2) {
        ffx ffx2 = (ffx)this.MessageDelegator.h(8456, this.getGUID(), ldv2);
        ffx2.sk(n);
        ffx2.f(coz2);
        this.MessageDelegator.F(ffx2);
    }

    private void a(cph cph2, ffy ffy2) {
        Object object;
        if (ffy2.aGB != null && (object = (ff)cph2.fi().ae(1360)) != null) {
            ((ff)object).av(ffy2.aGB);
        }
        if (ffy2.aGr > 0.0f && (object = (et)cph2.fi().ae(352)) != null) {
            ((et)object).o(ffy2.aGr);
        }
        object = (bvu)cph2.aAG();
        ((bvu)object).i(ffy2.aw());
        ljq ljq2 = ffy2.aw().eqT();
        ljq2.rlV = 0.0f;
        ljq2.x = 0.0f;
        ((bvd)object).c(ffy2.av());
        ((bvd)object).a(new lgl(ljq2));
        this.MessageDelegator.a((amf)cph2);
    }

    private void b(coz coz2) {
        bvd bvd2 = coz2.aIl();
        coz2.d(bvd2);
    }

    private void a(cph cph2) {
        bvd bvd2 = cph2.aIl();
        cph2.d(bvd2);
    }

    private void a(coz coz2, cph cph2, ffy ffy2) {
        Object object;
        assert (cph2.aAG() != null);
        assert (cph2.aAG().isReadyToRun());
        if (ffy2.aGB != null && (object = (ff)coz2.fi().ae(1360)) != null) {
            ((ff)object).av(ffy2.aGB);
        }
        if (ffy2.aGr > 0.0f && (object = (et)coz2.fi().ae(352)) != null) {
            ((et)object).o(ffy2.aGr);
        }
        object = cph2.aAG().av();
        ((ljq)object).es(coz2.aSK());
        lgl lgl2 = cph2.aAG().aw();
        coz2.aAG().c((ljq)object);
        coz2.aAG().a(lgl2);
        coz2.aAG().c((ljq)object);
        coz2.aAG().a(lgl2);
        this.MessageDelegator.a((amf)((Object)coz2));
        this.dwe.put(coz2.getGUID(), coz2);
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = ffy2.bOX();
        this.MessageDelegator.F(gga2);
    }

    private void a(coz coz2, ffy ffy2) {
        Object object;
        if (ffy2.aGB != null && (object = (ff)coz2.fi().ae(1360)) != null) {
            ((ff)object).av(ffy2.aGB);
        }
        if (ffy2.aGr > 0.0f && (object = (et)coz2.fi().ae(352)) != null) {
            ((et)object).o(ffy2.aGr);
        }
        object = coz2.aIl();
        coz2.d((bvd)object);
        ((bvd)object).c(ffy2.av());
        ((bvd)object).a(ffy2.aw());
        coz2.aAG().c(ffy2.av());
        coz2.aAG().a(ffy2.aw());
        this.MessageDelegator.a((amf)((Object)coz2));
        this.dwe.put(coz2.getGUID(), coz2);
    }

    private void a(fgd fgd2) {
        if (fgd2.iLy == null) {
            return;
        }
        coz coz2 = (coz)((Object)this.dwe.remove(fgd2.iLy));
        if (coz2 == null) {
            lfn.b(5, "SFGunManagerServer", "handleGunRemoveMessage() Could not find gun " + fgd2.iLy);
            this.a(fgd2, false);
            return;
        }
        this.a((cox)coz2);
        this.a(fgd2, true);
    }

    @Override
    public void a(cox cox2) {
        coz coz2 = (coz)cox2;
        assert (coz2 != null);
        coz2.gC(false);
        this.dwg.add(coz2);
        coz2.bD(this.MessageDelegator.arc().rgz);
    }

    private void c(coz coz2) {
        this.e(coz2);
        coz2.aWA();
        coz2.aSI();
        assert (coz2.aWC() != null);
        this.dwe.remove(coz2.getGUID());
        this.MessageDelegator.hd(coz2.aWC().getGUID());
        this.MessageDelegator.hd(coz2.getGUID());
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = coz2.aWC().az();
        this.MessageDelegator.F(gga2);
    }

    private void d(coz coz2) {
        assert (coz2 != null);
        coz2.aSI();
        assert (coz2.aWC() != null);
        this.dwe.remove(coz2.getGUID());
        this.MessageDelegator.hd(coz2.aWC().getGUID());
        this.MessageDelegator.hd(coz2.getGUID());
    }

    private void e(coz coz2) {
        assert (coz2 != null);
        fcq fcq2 = (fcq)this.MessageDelegator.h(9224, this.GUID, this.MessageDelegator.getGUID());
        fcq2.bst = bkd.dqC;
        fcq2.aZG = lcr.qAC;
        fcq2.akX = lcr.qEk;
        fcq2.aYF = lcr.qAC;
        fcq2.bsG = coz2.az();
        fcq2.aYC = cxd.fJY;
        fcq2.Magnitude = coz2.aWr().aCg();
        fcq2.eKm = -3.0;
        fcq2.aSp = coz2.aWr().aCe();
        fcq2.a(cxd.f.fQW);
        fcq2.aYH = 1;
        fcq2.aYG = bfk.dgM;
        fcq2.bsE = 0;
        fcq2.bRD = 5;
        fcq2.gpI = -3.0;
        fcq2.aZH = coz2.aAG().av();
        fcq2.Radius = coz2.aWr().aCd();
        fcq2.Position = coz2.aAG().av();
        fcq2.dta = new int[]{cug.fgE};
        fcq2.dsZ = null;
        fcq2.gbe = bkd.dqy;
        fcq2.dtb = false;
        fcq2.dsL = null;
        this.MessageDelegator.H(fcq2);
    }

    private void a(fgd fgd2, boolean bl2) {
        fuc fuc2 = (fuc)this.MessageDelegator.h(1044, this.GUID, fgd2.aO());
        fuc2.Rs = fgd2.iLy;
        fuc2.iWF = bl2;
        this.MessageDelegator.F(fuc2);
    }
}

