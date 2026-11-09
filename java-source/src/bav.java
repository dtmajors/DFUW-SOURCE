/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azp
 *  cbx
 *  cug
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class bav
extends btk
implements btn,
cbq {
    private static final int cOU = 1;
    private static final int cOV = 2;
    private static final float cOW = 10.0f;
    private ayd cCy = null;
    private azp cOX = null;
    private int cOY = 0;
    private int cOZ = 0;
    private Set<ccn> cPa = lcn.emx();
    private Map<ccn, bau> cPb = lcn.emw();
    private Map<ldv, ccn> cPc = lcn.emw();
    private Map<ccn, bwa> cPd = lcn.emw();
    private Map<ljq, lfs<ldv, String>> cPe = lcn.emw();
    private Map<ljq, Float> cPf = null;
    private Map<ccn, azw> cPg = lcn.emw();

    bav(ayd ayd2, azp azp2) {
        this.cCy = ayd2;
        this.cOX = azp2;
    }

    int aiT() {
        return this.cOY;
    }

    int aiU() {
        return this.cOZ;
    }

    void jN(int n) {
        this.cOZ = n;
    }

    Set<ccn> aiV() {
        return this.cPa;
    }

    lfs<ldv, String> h(ccn ccn2) {
        return this.cPe.get(ccn2.aIG());
    }

    ljq i(ccn ccn2) {
        if (ccn2 == null) {
            return null;
        }
        bwa bwa2 = this.cPd.get(ccn2);
        if (bwa2 == null) {
            if (ccn2.aAG() == null) {
                return null;
            }
            return ccn2.aAG().av();
        }
        return new ljq(bwa2.aAK());
    }

    void aiW() {
        this.cM(this.cOX.adH());
        for (ccn ccn2 : this.cPa) {
            ccn2.fi().a(12384, this.cOX.adH() ? 0.0 : this.cOX.aeZ());
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17412: {
                this.a((eba)dxq2);
                break;
            }
            case 12550: {
                this.a((faz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    void b(np np2) {
        np2.aEw = this.cOZ;
        if (this.cOY > 0) {
            np2.aEy = new ox[this.cOY];
            int n = 0;
            for (ccn ccn2 : this.cPa) {
                np2.aEy[n] = new ox();
                np2.aEy[n].ResourceType = ccn2.az();
                np2.aEy[n].Name = ccn2.rz();
                np2.aEy[n].Position = ccn2.aIG();
                np2.aEy[n].aGs = (ldv)this.cPe.get((Object)ccn2.aIG()).reX;
                np2.aEy[n].aGt = (String)this.cPe.get((Object)ccn2.aIG()).reY;
                np2.aEy[n].aGr = ccn2.fi().al(352);
                ++n;
            }
        }
    }

    void doTick(ldz ldz2) {
        if (!this.cPd.isEmpty()) {
            Iterator<bwa> iterator = this.cPd.values().iterator();
            while (iterator.hasNext()) {
                bwa bwa2 = iterator.next();
                bwa2.doTick(ldz2);
                if (!bwa2.aAE()) continue;
                iterator.remove();
            }
        }
    }

    ccn d(ldv ldv2, ldv ldv3, String string) {
        for (ccn ccn2 : this.cPa) {
            if (ccn2.rz() == null || !ccn2.rz().toLowerCase().equals(string.toLowerCase())) continue;
            ccn2.M(ldv2, ldv3);
            return ccn2;
        }
        return null;
    }

    boolean gj(ldv ldv2) {
        for (ccn ccn2 : this.cPa) {
            if (ccn2.kr(ldv2) != ccf.elu) continue;
            return true;
        }
        return false;
    }

    boolean p(ldv ldv2, String string) {
        for (ccn ccn2 : this.cPa) {
            if (!ccn2.rz().equalsIgnoreCase(string) || ccn2.kr(ldv2) != ccf.elu) continue;
            return true;
        }
        return false;
    }

    void cM(boolean bl) {
        for (ccn ccn2 : this.cPa) {
            ccn2.dr(!bl);
            ccn2.fi().f(12416, bl);
        }
    }

    void a(int n, ljq ljq2, ldv ldv2, String string) {
        float f = (float)(Math.PI * 2 * Math.random());
        ++this.cOY;
        if (this.cOY > this.cOZ) {
            this.cOZ = this.cOY;
        }
        String string2 = cug.uG((int)n) + " " + lhm.acQ(this.cOY) + "::st:: Owned by '" + this.cCy.iV() + "'";
        this.cPe.put(ljq2, new lfs<ldv, String>(ldv2, string));
        eaz eaz2 = (eaz)this.MessageDelegator.h(17411, this.GUID, lcr.qBo);
        eaz2.sk(1);
        eaz2.ResourceType = n;
        eaz2.azF = string2;
        eaz2.Position = ljq2;
        eaz2.Rotation = new lgl(new ljq(0.0f, f, 0.0f));
        eaz2.ikP = true;
        eaz2.oD(this.getGUID());
        this.MessageDelegator.F(eaz2);
    }

    void a(int n, ljq ljq2, String string, ldv ldv2, String string2, float f) {
        float f2 = (float)(Math.PI * 2 * Math.random());
        ++this.cOY;
        if (this.cOY > this.cOZ) {
            this.cOZ = this.cOY;
        }
        this.cPe.put(ljq2, new lfs<ldv, String>(ldv2, string2));
        if (this.cPf == null) {
            this.cPf = lcn.emw();
        }
        this.cPf.put(ljq2, Float.valueOf(f));
        eaz eaz2 = (eaz)this.MessageDelegator.h(17411, this.GUID, lcr.qBo);
        eaz2.sk(2);
        eaz2.ResourceType = n;
        eaz2.azF = string;
        eaz2.Position = ljq2;
        eaz2.Rotation = new lgl(new ljq(0.0f, f2, 0.0f));
        eaz2.ikP = true;
        eaz2.oD(this.getGUID());
        this.MessageDelegator.F(eaz2);
    }

    void aiX() {
        if (!this.cPd.isEmpty()) {
            for (bwa object : this.cPd.values()) {
                object.aAC();
            }
        }
        for (ccn ccn2 : this.cPa) {
            ccn2.a(ccf.elt);
            this.j(ccn2);
            this.MessageDelegator.hd(ccn2.getGUID());
        }
        this.cPa.clear();
        this.cPd.clear();
        this.cOY = 0;
        this.cOZ = 0;
    }

    void acA() {
        for (ccn ccn2 : this.cPa) {
            ccn2.fi().b(12320, this.cCy.iV());
        }
    }

    private void j(ccn ccn2) {
        assert (ccn2 != null);
        ebx ebx2 = (ebx)this.MessageDelegator.h(17414, this.GUID, lcr.qBo);
        ebx2.jU(true);
        ebx2.eM(ccn2.getGUID());
        this.MessageDelegator.F(ebx2);
    }

    private void a(eba eba2) {
        if (eba2.aVk() == 1) {
            this.b(eba2);
        } else if (eba2.aVk() == 2) {
            this.c(eba2);
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "handleBindStoneCreateResponseMessage() : Unrecognised message tag received!");
        }
        eba2.bFl().fi().b(12304, this.cCy.getGUID());
        eba2.bFl().fi().b(12320, this.cCy.iV());
    }

    private void b(eba eba2) {
        if (eba2.bFl() == null) {
            assert (false);
            --this.cOY;
            if (this.cOY < 0) {
                assert (false);
                this.cOY = 0;
            }
            return;
        }
        if (!(eba2.bFl() instanceof ccn)) {
            assert (false);
            --this.cOY;
            if (this.cOY < 0) {
                assert (false);
                this.cOY = 0;
            }
            return;
        }
        ccn ccn2 = (ccn)eba2.bFl();
        if (!this.cOX.aeP().afQ()) {
            this.j(ccn2);
            return;
        }
        ccn2.a(this);
        ccn2.a(this);
        ccn2.ks(this.cCy.getGUID());
        ccn2.gZ(this.cCy.iV());
        ccn2.Hy();
        ljq ljq2 = this.k(ccn2);
        ljq ljq3 = ccn2.aAG().av();
        ljq ljq4 = new ljq(ljq3);
        ljq3.et(ljq2);
        ccn2.aAG().c(ljq3);
        this.MessageDelegator.a((amf)((Object)ccn2));
        ccn2.dr(!this.cOX.adH());
        ccn2.fi().f(12416, this.cOX.adH());
        ccn2.fi().a(12384, this.cOX.adH() ? 0.0 : this.cOX.aeZ());
        this.cPa.add(ccn2);
        ljq ljq5 = ljq3;
        ljq ljq6 = ljq4;
        lgl lgl2 = ccn2.aAG().aw();
        bwa bwa2 = new bwa();
        bwa2.setServerObject(true);
        bwa2.eL(false);
        bwa2.d(ccn2.aAG());
        bwa2.setMessageDelegator(this.MessageDelegator);
        bwa2.bf(10.0);
        bwa2.bc(ljq5);
        bwa2.l(lgl2);
        bwa2.bd(ljq6);
        bwa2.m(lgl2);
        bwa2.o(this.MessageDelegator.arc().rgz);
        bwa2.initialize();
        this.cPd.put(ccn2, bwa2);
        fuj fuj2 = (fuj)this.MessageDelegator.h(1038, ccn2.getGUID(), ccn2.getGUID());
        fuj2.gon = ljq5;
        fuj2.goo = ljq6;
        fuj2.iWX = lgl2;
        fuj2.iWY = lgl2;
        fuj2.eKm = 10.0;
        fuj2.oV = this.MessageDelegator.arc().rgz;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.GUID, lcr.qAJ);
        gqu2.jpQ = (float)this.MessageDelegator.arc().rgz + 10.0f;
        gqu2.iXB = fuj2;
        this.MessageDelegator.F(gqu2);
        if (bad.agR()) {
            bau bau2 = new bau(ccn2, this.MessageDelegator);
            this.cPb.put(ccn2, bau2);
        }
        this.cOX.a(ccn2);
    }

    private void c(eba eba2) {
        assert (eba2.bFl() != null);
        assert (eba2.bFl() instanceof ccn);
        ccn ccn2 = (ccn)eba2.bFl();
        ccn2.a(this);
        ccn2.a(this);
        ccn2.ks(this.cCy.getGUID());
        ccn2.gZ(this.cCy.iV());
        ccn2.Hy();
        this.MessageDelegator.a((amf)((Object)ccn2));
        if (this.cPf != null && this.cPf.containsKey(ccn2.aIG())) {
            ccn2.fi().c(352, this.cPf.remove(ccn2.aIG()).floatValue());
        }
        ccn2.dr(!this.cOX.adH());
        ccn2.fi().f(12416, this.cOX.adH());
        ccn2.fi().a(12384, this.cOX.adH() ? 0.0 : this.cOX.aeZ());
        this.cPa.add(ccn2);
        if (bad.agR()) {
            bau bau2 = new bau(ccn2, this.MessageDelegator);
            this.cPb.put(ccn2, bau2);
        }
        this.cOX.b(ccn2);
    }

    private void a(eat eat2, ccn ccn2) {
        ccf ccf2 = ccn2.a(eat2);
        if (ccf2 != ccf.elo) {
            ccn2.a(eat2, ccf2, this.cCy.getGUID());
            return;
        }
        if (this.cCy.getGUID().equals(eat2.ack())) {
            ccn2.M(eat2.bFc(), eat2.ack());
            ccn2.a(eat2, ccf2, this.cCy.getGUID());
            return;
        }
        ccn2.a(eat2, ccf.els, this.cCy.getGUID());
    }

    private void a(faz faz2) {
        ccn ccn2 = this.cPc.remove(faz2.oq());
        if (ccn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleDamageEventSummaryResponseMessage() : Damage event summary response received, but no dead siege-stone can be found matching the damaged object!!!");
            assert (false);
            return;
        }
        ccn2.a(ccf.elt);
        bwa bwa2 = this.cPd.remove(ccn2);
        if (bwa2 != null) {
            bwa2.aAC();
        }
        --this.cOY;
        this.cPa.remove(ccn2);
        this.cPg.remove(ccn2);
        this.cOX.a(ccn2, faz2);
        this.j(ccn2);
        this.MessageDelegator.hd(ccn2.getGUID());
    }

    @Override
    public void b(cbx cbx2) {
        assert (cbx2 instanceof ccn);
        ccn ccn2 = (ccn)cbx2;
        assert (this.cPa.contains(cbx2));
        bau bau2 = this.cPb.get(ccn2);
        if (bau2 != null) {
            fay fay2 = (fay)this.MessageDelegator.h(12549, this.GUID, ccn2.getGUID());
            fay2.kR(true);
            bau2.a(fay2);
            this.cPc.put(ccn2.getGUID(), ccn2);
        } else {
            ccn2.a(ccf.elt);
            bwa bwa2 = this.cPd.remove(ccn2);
            if (bwa2 != null) {
                bwa2.aAC();
            }
            --this.cOY;
            this.cPa.remove(ccn2);
            this.cPg.remove(ccn2);
            this.cOX.a(ccn2, null);
            this.j(ccn2);
            this.MessageDelegator.hd(ccn2.getGUID());
        }
    }

    @Override
    public void a(cbx cbx2, et et2) {
        if (cbx2 instanceof ccn) {
            this.cOX.c((ccn)cbx2);
        }
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return true;
    }

    @Override
    public boolean a(dxq dxq2, btk btk2) {
        if (!(btk2 instanceof ccn)) {
            return false;
        }
        switch (dxq2.bEz()) {
            case 17409: {
                this.a((eat)dxq2, (ccn)((Object)btk2));
                return true;
            }
        }
        return false;
    }

    ljq k(ccn ccn2) {
        bvd bvd2 = ccn2.aAG();
        if (bvd2 == null) {
            lfn.b(5, "SFClanConquestSiegeStoneManager", "setupSpawnDelta() : MeshObject == NULL");
            assert (false);
            return new ljq();
        }
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map == null) {
            lfn.b(5, "SFClanConquestSiegeStoneManager", "setupSpawnDelta() : AttachPointMap == null");
            assert (false);
            return new ljq();
        }
        eh eh2 = map.get("AttachPoint_Structure Spawn Delta");
        if (eh2 == null) {
            lfn.b(5, "SFClanConquestSiegeStoneManager", "setupSpawnDelta() : AttachPoint == null");
            assert (false);
            return new ljq();
        }
        ljq ljq2 = new ljq(eh2.fb());
        ljq2.rlV = 0.0f;
        ljq2.x = 0.0f;
        return ljq2;
    }

    public azw[] aiY() {
        for (ccn ccn2 : this.cPa) {
            this.l(ccn2);
        }
        return this.cPg.values().toArray(new azw[this.cPg.size()]);
    }

    public azw l(ccn ccn2) {
        azw azw2 = this.cPg.get(ccn2);
        if (azw2 == null) {
            azw2 = new azw();
            this.cPg.put(ccn2, azw2);
            azw2.setGUID(ccn2.getGUID());
            azw2.l(ccn2.az());
            azw2.setName(ccn2.rz());
            azw2.c(ccn2.aIG());
            azw2.ck(ccn2.fi().ai(352));
        }
        azw2.cl(ccn2.fi().al(352));
        return azw2;
    }

    @Override
    public String toString() {
        String string = "For Challenge = " + this.cOX.toString();
        return this.getClass().getSimpleName() + " :: " + string;
    }
}

