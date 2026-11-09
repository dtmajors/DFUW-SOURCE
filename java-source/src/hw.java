/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cug
 *  dta
 *  ep
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class hw
extends hu {
    private ldv Xe = null;
    private float aeh = 0.0f;
    private ddr aei = null;
    private float aej = 0.0f;
    private float aek = 0.0f;
    private String ael;
    private bfn aem = null;
    private gfj aen = null;
    private gln aeo = null;
    private ldv aep = null;

    public ldv mq() {
        return this.Xe;
    }

    public void aX(ldv ldv2) {
        this.Xe = ldv2;
    }

    public float mr() {
        return this.aeh;
    }

    public ddr ms() {
        return this.aei;
    }

    public float mt() {
        return this.aej;
    }

    public float mu() {
        return this.aek;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.a(true, this.hk(), this.GUID.bFk());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11015: {
                this.a((gqg)dxq2);
                break;
            }
            case 11038: {
                this.a((gqh)dxq2);
                break;
            }
            case 11030: {
                this.my();
                break;
            }
            case 11028: {
                this.a((gpb)dxq2);
                break;
            }
            case 13329: {
                this.a((dys)dxq2);
                break;
            }
            case 6161: {
                this.a((gfj)dxq2);
                break;
            }
            case 32516: {
                this.a((ggu)dxq2);
                break;
            }
            case 12849: {
                this.a((eek)dxq2);
                break;
            }
            case 35332: {
                this.a((gln)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void mj() {
        assert (this.aeg != null);
        assert (this.aeg.aAG() != null);
        super.mj();
        this.aeg.aAG().l(this.aeg.az());
        this.cj(1);
    }

    @Override
    protected void T(boolean bl) {
        super.T(bl);
        if (bl) {
            this.aem = this.aeg.aIv().aof();
        }
    }

    @Override
    protected void ml() {
        et et2 = (et)this.aeg.fi().ae(10992);
        if (et2 == null || Math.random() < (double)et2.fN()) {
            gfi gfi2 = (gfi)this.MessageDelegator.h(6160, this.GUID, lcr.qBb);
            gfi2.jgh = this.ma();
            gfi2.jgi = this.MessageDelegator.bzy().getTimeInMillis();
            this.MessageDelegator.F(gfi2);
            return;
        }
        assert (this.Xe != null);
        super.ml();
        this.my();
    }

    private void a(gfj gfj2) {
        this.aen = gfj2;
        if (aev.isEnabled()) {
            glm glm2 = (glm)this.MessageDelegator.h(35331, this.getGUID(), lcr.hac);
            glm2.bBh = this.lZ();
            this.MessageDelegator.E(glm2);
            return;
        }
        this.mv();
    }

    private void a(gln gln2) {
        this.aeo = gln2;
        this.mv();
    }

    private void mv() {
        if (this.aeg != null && this.aeg.aIv() != null && this.aem != null && this.aem.aYF != null && lcr.abR((int)this.aem.aYF.enw()) && !lcr.abQ((int)this.aem.aYF.enw())) {
            ldv ldv2 = lcr.abW((int)this.aem.aYF.enw());
            eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
            this.MessageDelegator.F(eef2);
            return;
        }
        this.a(false, null);
    }

    private void a(eeg eeg2) {
        this.aep = eeg2.iG();
        if (lcw.emW() && lcw.emX()) {
            if (this.aeg != null && this.aeg.aIv() != null && this.aem != null && cug.vM((int)this.aem.bsG)) {
                ggt ggt2 = (ggt)this.MessageDelegator.h(32515, this.getGUID(), this.aem.aYF);
                ggt2.ma(true);
                this.MessageDelegator.F(ggt2);
                return;
            }
        } else {
            lea.epN();
            if (cid.eAW && this.aeg != null && this.aeg.aIv() != null && this.aem != null && cug.vM((int)this.aem.bsG)) {
                een een2 = (een)this.MessageDelegator.h(12848, this.getGUID(), this.aem.aYF);
                een2.kb(true);
                this.MessageDelegator.F(een2);
                return;
            }
        }
        this.a(false, null);
    }

    private void a(eek eek2) {
        this.a(false, eek2.bGh());
    }

    private void a(ggu ggu2) {
        this.a(ggu2.isActive(), null);
    }

    private void a(boolean bl, chz[] chzArray) {
        Object object;
        Object object2;
        assert (this.Xe != null);
        super.ml();
        ljq ljq2 = this.aeg.aAG().av();
        cnh cnh2 = this.a(false, cug.uG((int)this.aeg.az()), null);
        cnh2.aAG().c(ljq2);
        cnh2.aAG().a(new lgl((float)(Math.random() - 0.5) * 0.1f, (float)(Math.PI * 2 * Math.random()), (float)(Math.random() - 0.5) * 0.1f));
        float f2 = 1.0f;
        float f3 = 1.0f;
        Object object3 = lea.ci(ljq2);
        if (object3 != null) {
            object2 = ((dmq)object3).nr(this.aep);
            f2 = dmi.a((dmq)object3, (dmf)((Object)object2), dmh.gHZ);
            f3 = dmi.a((dmq)object3, (dmf)((Object)object2), dmh.gIa);
        }
        object3 = lcn.emv();
        if (this.aen != null && (object2 = this.aen.jgj) != null && ((cto[])object2).length != 0) {
            for (cte cte2 : object2) {
                ctf.a((cto)((Object)cte2), (List<cte>)object3, f3);
            }
        }
        if (this.aeo != null && (object2 = this.aeo.jgj) != null && ((Object)object2).length != 0) {
            ctf.a((cto[])object2, (List<cte>)object3, f3, 1.0f);
        }
        object2 = this.mw();
        assert (object2 != null);
        if (object2.size() > 0) {
            object = ctf.a((List)object2, 0.0f, f2, f3);
            object3.addAll(Arrays.asList(object));
        }
        ((bri)this.aeg.aJC().asf()).b(true, bqy.dHr);
        object = this.cm(this.aeg.az());
        if (object != null && !object.isEmpty()) {
            cte[] cteArray = ctf.a((List)object, 0.0f, f2, f3);
            object3.addAll(Arrays.asList(cteArray));
        }
        if (bl) {
            ciu ciu2 = (ciu)lea.epC().get(cug.fue);
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                cte cte2;
                cte2 = (cte)iterator.next();
                if (cte2.ResourceType != cug.fkb) continue;
                cte2.asi = ciu2.qG(cte2.asi);
            }
        }
        cte[] cteArray = object3.toArray(new cte[object3.size()]);
        cnh2.c(cteArray);
        jts.a(bqy.dGQ, cteArray, ljq2, this.MessageDelegator, this.getGUID());
        if (lcw.enb() && lcw.qGX) {
            object3 = new dta();
            object3.setActive(true);
            object3.Ca(0);
            object2 = ((dta)this.MessageDelegator).bzt();
            object = ldx.enG().enI();
            object3.setGUID(((ldw)object).bzv());
            object2.c((dta)object3);
            cnh2.setGUID(object3.bzv());
            cnh2.aAG().setGUID(object3.bzv());
            cnh2.aJC().asf().setGUID(object3.bzv());
            object3.a((amf)((Object)cnh2));
        } else {
            this.MessageDelegator.a((amf)((Object)cnh2));
        }
        this.my();
    }

    private List cm(int n) {
        Map<String, kai> map = lea.eoL();
        if (map == null) {
            return null;
        }
        kai kai2 = map.get(this.ael);
        if (kai2 == null) {
            return null;
        }
        Map<Integer, kab> map2 = kai2.dUV();
        kab kab2 = map2.get(n);
        if (kab2 == null) {
            return null;
        }
        Map<String, ctn> map3 = lea.eoK();
        ArrayList arrayList = lcn.emv();
        for (String string : kab2.dUT()) {
            ctn ctn2 = map3.get(string);
            if (ctn2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "spawnpoint " + this.ael + " has non-existent tag " + string);
                assert (false);
                continue;
            }
            arrayList.addAll(ctn2.fgc);
        }
        return arrayList;
    }

    private List mw() {
        ctq ctq2 = lea.eoJ().get(this.aeg.az());
        assert (ctq2 != null);
        ArrayList arrayList = lcn.emv();
        block0: for (Object e2 : ctq2.fgc) {
            if (e2 instanceof cto) {
                if (!((cto)e2).fez) continue;
                arrayList.add(e2);
                continue;
            }
            if (!(e2 instanceof ArrayList)) continue;
            for (Object e3 : (ArrayList)e2) {
                if (!(e3 instanceof cto) || !((cto)e3).fez) continue;
                arrayList.add(e2);
                continue block0;
            }
        }
        return arrayList;
    }

    private List<String> mx() {
        ctq ctq2 = lea.eoJ().get(this.aeg.az());
        assert (ctq2 != null);
        List list = ctq2.fgc;
        assert (list != null);
        ArrayList<String> arrayList = lcn.emv();
        for (Object e2 : list) {
            if (e2 instanceof cto) {
                if (!((cto)e2).fez) continue;
                arrayList.add(((cto)e2).pa().toLowerCase());
                continue;
            }
            if (!(e2 instanceof ArrayList)) continue;
            for (Object e3 : (ArrayList)e2) {
                if (!(e3 instanceof cto) || !((cto)e3).fez) continue;
                arrayList.add(((cto)e3).pa().toLowerCase());
            }
        }
        return arrayList;
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        switch (gre2.jqc) {
            case 13315: {
                break;
            }
            default: {
                super.handleSystemMessageSendingErrorMessage(gre2);
            }
        }
    }

    private void a(brv brv2, List<cte> list) {
        if (brv2 == null) {
            return;
        }
        bqs bqs2 = (bqs)brv2.dIY;
        cte cte2 = new cte();
        cte2.ResourceType = bqs2.az();
        cte2.asi = bqs2.vf();
        ej[] ejArray = bqs2.avc();
        if (ejArray != null && ejArray.length > 0) {
            for (int i = 0; i < ejArray.length; ++i) {
                if (ejArray[i] == null || ejArray[i].getType() != 1232 || !(ejArray[i] instanceof et)) continue;
                et et2 = (et)ejArray[i];
                float f2 = cug.eV((float)et2.fN());
                et2.o(f2);
            }
        }
        ej[] ejArray2 = null;
        if (ejArray != null && ejArray.length > 0) {
            ejArray2 = new ej[ejArray.length];
            for (int i = 0; i < ejArray.length; ++i) {
                ejArray2[i] = ejArray[i];
            }
        }
        cte2.DR = ejArray2;
        list.add(cte2);
        if (brv2 instanceof bpz) {
            bpz bpz2 = (bpz)brv2;
            if (bpz2.dBr == null) {
                return;
            }
            int n = bpz2.dBr.length;
            for (int i = 0; i < n; ++i) {
                this.a(bpz2.dBr[i], list);
            }
        }
    }

    private cte[] a(brv[] brvArray) {
        if (brvArray == null || brvArray.length == 0) {
            return null;
        }
        ArrayList<cte> arrayList = lcn.emv();
        int n = brvArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(brvArray[i], arrayList);
        }
        cte[] cteArray = new cte[arrayList.size()];
        return arrayList.toArray(cteArray);
    }

    private void a(dys dys2) {
        et et2;
        if ((dys2.ija & 1) > 0) {
            if (dys2.aej < 0.0f) {
                lfn.b(5, "SFSessionObjectMonster", "handleAISessionUpdateMessage() MonsterTimerCharging is invalid.");
                return;
            }
            this.aej = dys2.aej;
            if (this.aeg.isInitialized()) {
                et2 = this.aeg.fi().ah(10512);
                if (et2 == null) {
                    lfn.b(5, "SFSessionObjectMonster", "handleAISessionUpdateMessage() Monster '" + this.aeg.pa() + "' is missing attribute 'Monster Timer Charging'");
                    return;
                }
                et2.o(this.aej);
            }
        }
        if ((dys2.ija & 2) > 0) {
            if (dys2.aek < 0.0f) {
                lfn.b(5, "SFSessionObjectMonster", "handleAISessionUpdateMessage() MonsterTimerCooldown is invalid.");
                return;
            }
            this.aek = dys2.aek;
            if (this.aeg.isInitialized()) {
                et2 = this.aeg.fi().ah(10528);
                if (et2 == null) {
                    lfn.b(5, "SFSessionObjectMonster", "handleAISessionUpdateMessage() Monster '" + this.aeg.pa() + "' is missing attribute 'Monster Timer Cooldown'");
                    return;
                }
                et2.o(this.aek);
            }
        }
        if ((dys2.ija & 4) > 0) {
            if (dys2.ijb > 0.0f) {
                this.aei = new ddr();
                this.aei.bqK = cxj.iC("tg_Creatures");
                this.aei.Radius = dys2.ijb;
                this.aei.dtb = false;
            } else {
                this.aei = null;
            }
        }
        if ((dys2.ija & 8) > 0) {
            int n = dys2.bnM;
            String string = dys2.ijc;
            int n2 = dys2.ijd;
            Object object = null;
            if (this.aeg.isInitialized()) {
                switch (n2) {
                    case 0: {
                        object = Boolean.valueOf(string);
                        break;
                    }
                    case 2: {
                        object = Float.valueOf(string);
                        break;
                    }
                    case 3: {
                        object = Integer.valueOf(string);
                        break;
                    }
                    case 6: {
                        object = ljq.Aw(string);
                        if (object != null) break;
                        object = new ljq(0.0f, 0.0f, 0.0f);
                        break;
                    }
                    case 7: {
                        object = string;
                        break;
                    }
                    default: {
                        lfn.b(5, "SFSessionObjectMonster", "handleAISessionUpdateMessage() Invalid attribute provided: '" + ep.aM((int)n) + "'");
                        return;
                    }
                }
                ej ej2 = this.aeg.fi().ae(n);
                if (ej2 == null) {
                    return;
                }
                ej2.setValue(object);
                if (ej2.getType() == 10960 && this.aeg.aAG() != null) {
                    fua fua2 = (fua)this.MessageDelegator.h(1029, this.getGUID(), this.aeg.aAG().getGUID());
                    fua2.HW(4);
                    fua2.aO(Boolean.parseBoolean(string));
                    this.aeg.aAG().receiveMessage(fua2);
                }
            }
        }
    }

    private void a(gpb gpb2) {
        grx grx2 = (grx)this.MessageDelegator.h(11031, this.GUID, lcr.qAH);
        grx2.ija = 1;
        grx2.jqt = false;
        grx2.jqu = true;
        grx2.Sy = this.hk();
        this.MessageDelegator.F(grx2);
        this.MessageDelegator.a((amf)this.aeg);
        this.g(this.aeg.aAG().getGUID(), true);
        float f2 = 1.0f;
        float f3 = 1.0f;
        cte[] cteArray = lea.ci(this.aeg.aAG().azb());
        if (cteArray != null) {
            f2 = dmi.a((dmq)cteArray, dmf.gHu, dmh.gHZ);
            f3 = dmi.a((dmq)cteArray, dmf.gHu, dmh.gIa);
        }
        if ((cteArray = ctf.c(this.aeg.az(), f2, f3)) != null && cteArray.length > 0) {
            this.a(cteArray, bqy.dFO);
        }
    }

    private void a(gqg gqg2) {
        if (gqg2.Za <= 0) {
            return;
        }
        if (gqg2.bc == null) {
            return;
        }
        if (gqg2.jjc == null) {
            return;
        }
        if (gqg2.jph == null) {
            return;
        }
        if (!gqg2.aO().equals(this.hk())) {
            return;
        }
        this.ci(gqg2.Za);
        this.R(gqg2.jjc);
        this.b(gqg2.jph);
        this.aeh = gqg2.aeh;
        this.ael = gqg2.ael;
        if (gqg2.ijb > 0.0f) {
            this.aei = new ddr();
            this.aei.bqK = cxj.iC("tg_Creatures");
            this.aei.Radius = gqg2.ijb;
            this.aei.dtb = false;
        }
        this.mk();
    }

    private void a(gqh gqh2) {
        assert (this.aeg != null);
        if (gqh2.bWK() == null || gqh2.bWK().length == 0) {
            return;
        }
        int[] nArray = gqh2.bWK();
        cte[] cteArray = new cte[nArray.length];
        for (int i = 0; i < cteArray.length; ++i) {
            cteArray[i] = new cte();
            cteArray[i].ResourceType = nArray[i];
            cteArray[i].fex = false;
        }
        this.a(cteArray, bqy.dFO);
    }

    private void my() {
        if (this.aeg != null) {
            this.MessageDelegator.hd(this.aeg.getGUID());
        }
        this.MessageDelegator.hd(this.GUID);
        this.mz();
        this.a(false, this.hk(), this.GUID.bFk());
        grx grx2 = (grx)this.MessageDelegator.h(11031, this.GUID, lcr.qAH);
        grx2.ija = 2;
        grx2.jqt = false;
        grx2.jqu = true;
        grx2.Sy = this.hk();
        this.MessageDelegator.F(grx2);
    }

    private void mz() {
        assert (this.Xe != null);
        dye dye2 = (dye)this.MessageDelegator.h(13315, this.GUID, this.Xe);
        dye2.hsP = true;
        this.MessageDelegator.F(dye2);
    }

    private void a(boolean bl, ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        gsk gsk2 = (gsk)this.MessageDelegator.h(11049, this.GUID, lcr.qAS);
        gsk2.ija = bl ? 4 : 5;
        gsk2.adA = ldv2;
        gsk2.Rr = ldv3;
        this.MessageDelegator.F(gsk2);
    }
}

