/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
import java.util.Map;

public class cby {
    private static int ekS = 0;
    private static int ekT = 1;
    private cbx Qg = null;
    private Map<ldv, cbp> ekU = null;

    public cby(cbx cbx2) {
        this.Qg = cbx2;
        bvd bvd2 = this.Qg.aAG();
        String string = bvd2.getFileName().toLowerCase();
        string = string.replaceAll("//", "/");
        string = string.replaceAll("\\\\", "/");
        bso bso2 = lea.epj().get(string);
        if (bso2 != null) {
            this.a(bso2);
        }
    }

    public void a(bso bso2) {
        Object object;
        Object object2;
        ldv ldv2;
        this.ekU = lcn.emw();
        bvd bvd2 = this.Qg.aAG();
        ljq ljq2 = null;
        ljq2 = bvd2 != null ? bvd2.av() : new ljq(0.0f, 0.0f, 0.0f);
        for (btc object3 : bso2.awY()) {
            ldv2 = this.Qg.getMessageDelegator().bzv();
            object2 = new krt();
            ((ksl)object2).ts(this.Qg.getGUID());
            ((krt)object2).aaD(1);
            ((krt)object2).aaE(2);
            ((krt)object2).xC(true);
            ((ksk)object2).hC(ldv2);
            ((ksk)object2).xc(object3.axt());
            ((krt)object2).xE(true);
            ((krt)object2).wL(true);
            ((krt)object2).setMaxDistance(object3.getMaxRadius());
            ((krt)object2).setMinDistance(object3.axu());
            ((krt)object2).c(this.Qg.aAG() != null ? this.Qg.aAG().av() : new ljq(0.0f, 0.0f, 0.0f));
            ((krt)object2).setInsideConeAngle(object3.axp());
            ((krt)object2).setOutsideConeAngle(object3.axr());
            ((krt)object2).setConeOrientation(object3.axq());
            ((krt)object2).setConeOutsideVolume(object3.getConeOutsideVolume());
            ((krt)object2).bi(new ljq(0.0f, 0.0f, 0.0f));
            ((krt)object2).setMode(0);
            ((krt)object2).mU(object3.axv());
            ((krt)object2).hN(true);
            object = new cbp(ekS);
            ((cbp)object).biE = object3.av();
            this.ekU.put(ldv2, (cbp)object);
            this.Qg.getMessageDelegator().a((ksl)object2);
        }
        for (dfq dfq2 : bso2.awZ()) {
            ldv2 = this.Qg.getMessageDelegator().bzv();
            object2 = new cbp(ekT);
            ((cbp)object2).biE = dfq2.av();
            object = new dez();
            dfq dfq3 = (dfq)((dez)object).Af(28);
            dfq2.b(dfq3);
            dfq3.setGUID(ldv2);
            this.ekU.put(ldv2, (cbp)object2);
            dfq3.a(new dfq.a(this){
                final /* synthetic */ cby ekV;
                {
                    this.ekV = cby2;
                }

                public void a(dfq dfq2) {
                    cbp cbp2 = (cbp)cby.a(this.ekV).get(dfq2.getGUID());
                    if (cbp2 == null) {
                        lfn.b(5, "SFPhysicalObjectAttachedObjectExtrasManager", "onCreated() :newly created light atom not found!");
                        return;
                    }
                    cbp2.ejU = cby.a(this.ekV, dfq2.bmO(), cbp2.biE);
                }
            });
            this.Qg.getMessageDelegator().a(dfq3);
        }
    }

    private ldv j(ldv ldv2, ljq ljq2) {
        if (this.Qg.aAG() == null) {
            return null;
        }
        ldv ldv3 = this.Qg.getMessageDelegator().bzv();
        kng kng2 = (kng)this.Qg.getMessageDelegator().h(777);
        kng2.Zq(129);
        kng2.qj(this.Qg.aAG().getGUID());
        kng2.qk(ldv2);
        kng2.setDeltaPos(ljq2);
        kng2.setDeltaRot(new lgl());
        kng2.ts(this.Qg.getGUID());
        kng2.wD(false);
        kng2.kX(ldv3);
        this.Qg.getMessageDelegator().a(kng2);
        return ldv3;
    }

    public void a(ksx ksx2) {
        bvd bvd2 = this.Qg.aAG();
        if (bvd2 == null) {
            return;
        }
        cbp cbp2 = this.ekU.get(ksx2.oq());
        if (cbp2 != null) {
            cbp2.ejU = this.Qg.getMessageDelegator().bzv();
            kne kne2 = (kne)this.Qg.getMessageDelegator().h(776);
            kne2.Zo(129);
            kne2.qj(bvd2.getGUID());
            kne2.qk(ksx2.oq());
            kne2.setDeltaPos(cbp2.biE);
            kne2.setDeltaRot(new lgl());
            kne2.ts(this.Qg.getGUID());
            kne2.kX(cbp2.ejU);
            this.Qg.getMessageDelegator().a(kne2);
        }
    }

    public void cleanUp() {
        if (this.ekU != null) {
            for (Map.Entry<ldv, cbp> entry : this.ekU.entrySet()) {
                khd khd2;
                cbp cbp2 = entry.getValue();
                if (cbp2.getType() == ekS) {
                    if (cbp2.ejU != null) {
                        khd2 = (kne)this.Qg.getMessageDelegator().h(776);
                        ((kne)khd2).Zo(2);
                        khd2.ts(this.Qg.getGUID());
                        ((knm)khd2).kX(cbp2.ejU);
                        ((knm)khd2).qj(this.Qg.getGUID());
                        ((knm)khd2).qk(this.Qg.getGUID());
                        this.Qg.getMessageDelegator().a(khd2);
                        this.Qg.getMessageDelegator().oa(cbp2.ejU);
                    }
                    khd2 = (kig)this.Qg.getMessageDelegator().h(1287);
                    ((kii)khd2).tB(entry.getKey());
                    ((kig)khd2).XO(1);
                    khd2.ts(this.Qg.getGUID());
                    khd2.wD(false);
                    this.Qg.getMessageDelegator().a(khd2);
                    this.Qg.getMessageDelegator().oa(entry.getKey());
                    continue;
                }
                if (cbp2.getType() != ekT) continue;
                if (cbp2.ejU != null) {
                    khd2 = (kng)this.Qg.getMessageDelegator().h(777);
                    ((kng)khd2).Zq(2);
                    khd2.ts(this.Qg.getGUID());
                    ((knm)khd2).kX(cbp2.ejU);
                    ((knm)khd2).qj(this.Qg.getGUID());
                    ((knm)khd2).qk(this.Qg.getGUID());
                    this.Qg.getMessageDelegator().a(khd2);
                    this.Qg.getMessageDelegator().oa(cbp2.ejU);
                }
                this.Qg.getMessageDelegator().hd(entry.getKey());
            }
            this.ekU.clear();
            this.ekU = null;
        }
    }

    static /* synthetic */ Map a(cby cby2) {
        return cby2.ekU;
    }

    static /* synthetic */ ldv a(cby cby2, ldv ldv2, ljq ljq2) {
        return cby2.j(ldv2, ljq2);
    }
}

