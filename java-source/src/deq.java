/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  dta
 *  lcr
 *  lcw
 */
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;

public class deq
extends dep {
    private boolean fE = true;
    private dej gmQ = null;
    private deu gmR = null;
    private des gmS = null;
    private deo gmT = null;
    private dei gmU = null;
    private den gmV = null;
    private dfa gmW = null;
    private dem gmX = null;
    private dld eou = null;
    private Map<ldv, ldv> gmY = lcn.emw();
    private boolean gmZ = false;

    public deq() {
        this.dwG = false;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gmO) {
            super.af(ldz2);
            return;
        }
        if (lcw.emZ() || this.GUID.ib() == 7000) {
            assert (false) : "doTick() should not be called! Active = " + this.isActive();
            return;
        }
        if (this.fE) {
            this.bkT();
            this.bkU();
            this.bkV();
            this.gmQ = new dej();
            this.gmR = new deu();
            this.gmS = new des();
            this.gmT = new deo();
            this.gmU = new dei();
            this.gmV = new den();
            this.gmW = new dfa();
            this.gmX = new dem();
            dgj.setSpecialEffectCameraManager((dej)this.gmQ);
            dgj.setSpecialEffectSplatterManager((deu)this.gmR);
            dgj.setSpecialEffectParticleManager((des)this.gmS);
            dgj.setSpecialEffectHitSoundManager((deo)this.gmT);
            dgj.setSpecialEffectAttachPointManager((dei)this.gmU);
            dgj.setSpecialEffectDynamicHitManager((den)this.gmV);
            dgj.setSpecialEffectDecalManager((dem)this.gmX);
            dey.a(this.gmW);
            this.gmR.setGUID(this.MessageDelegator.bzv());
            this.gmS.setGUID(this.MessageDelegator.bzv());
            this.gmT.setGUID(this.MessageDelegator.bzv());
            this.gmU.setGUID(this.MessageDelegator.bzv());
            this.gmV.setGUID(this.MessageDelegator.bzv());
            this.gmW.setGUID(this.MessageDelegator.bzv());
            this.gmX.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.gmR);
            this.MessageDelegator.a(this.gmS);
            this.MessageDelegator.a(this.gmT);
            this.MessageDelegator.a(this.gmU);
            this.MessageDelegator.a(this.gmV);
            this.MessageDelegator.a(this.gmW);
            this.MessageDelegator.a(this.gmX);
            this.aKJ();
            this.fE = false;
        }
        super.doTick(ldz2);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            if (lcw.enb() && this.GUID.ib() == 7000) {
                this.gmO = true;
            } else if (lcw.emZ()) {
                this.gmO = true;
            }
            this.Initialized = true;
        }
    }

    public void bkT() {
        Set<String> set = lcn.emx();
        Map<Integer, dgj> map = lea.bkO();
        for (dgj dgj2 : map.values()) {
            if (dgj2.getSpecialEffectName().startsWith("z_")) continue;
            this.a(dgj2, set);
        }
        for (Map<can, cam> object : lea.eou()) {
            for (cam cam2 : object.values()) {
                for (cai cai2 : cam2.aGi()) {
                    for (cah cah2 : cai2.aGa()) {
                        if (cah2.aFT() == null) continue;
                        for (String string : cah2.aFT().aFP()) {
                            String string2 = jry.tn(string.toLowerCase());
                            set.add(string2);
                            string2 = string2.replace(".dds", ".normalmap.dds");
                            jrw jrw2 = new jrw(lcw.qLb + "texture/dds/" + string2);
                            if (!jrw2.exists()) continue;
                            set.add(string2);
                        }
                    }
                }
            }
        }
        kst kst2 = (kst)this.MessageDelegator.j(31);
        kst2.ts(this.GUID);
        kst2.gRK = new String[set.size()];
        int n2 = 0;
        for (String string : set) {
            kst2.gRK[n2++] = "dds/" + string;
        }
        this.MessageDelegator.a(kst2);
    }

    protected void a(dgj dgj2, Set<String> set) {
        duf duf2 = (duf)lea.eoo().get(dgj2.getEffectClassName());
        for (duj duj2 : duf2.bBa()) {
            if (duj2.bBb() != 10) continue;
            try {
                String[] stringArray;
                Document document;
                Object object;
                String string = "get" + duj2.getName();
                Method method = dgj2.getClass().getMethod(string, new Class[0]);
                if (method == null || (object = method.invoke(dgj2, new Object[0])) == null) continue;
                String string2 = (String)object;
                if ((string2 = string2.toLowerCase()).endsWith(".dds")) {
                    set.add(string2);
                    continue;
                }
                if (!string2.endsWith(".xml") || string2.contains("audio") || (document = jsy.tK("xml/" + string2)) == null) continue;
                for (String string3 : stringArray = jxa.q(document)) {
                    string3 = string3.replace("tga", "dds");
                    string3 = string3.replace("bmp", "dds");
                    string3 = string3.replace("png", "dds");
                    set.add(string3);
                }
            }
            catch (Exception exception) {
                lfn.b(5, "SFSpecialEffectResourceAnalyzer", "analyzeEffects()  Failed to get string value of string field '" + duj2.getName() + exception);
            }
        }
        if (dgj2.getContainerManager() != null) {
            for (duj duj2 : dgj2.getContainerManager().bnY()) {
                this.a((dgj)duj2, set);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12294: {
                this.a((fvu)dxq2);
                break;
            }
            case 11033: {
                this.b((gsl)dxq2);
                break;
            }
            case 13062: {
                this.a((gli)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(glh glh2) {
        if (this.gmZ) {
            return;
        }
        if (glh2.getPower() > 0.0f && glh2.getPower() <= 1.0f) {
            glh2.setSpecialEffectType(del.B(glh2.getSpecialEffectType(), glh2.getPower()));
        }
        super.a(glh2);
    }

    public void a(dld dld2) {
        assert (!lcw.enf());
        assert (dld2 != null);
        this.gmQ.a(dld2);
    }

    @Override
    public final void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (lcw.emZ() || this.GUID.ib() == 7000) {
            return;
        }
        if (this.gmQ != null) {
            this.MessageDelegator.hd(this.gmQ.getGUID());
        }
        if (this.gmS != null) {
            this.MessageDelegator.hd(this.gmS.getGUID());
        }
        if (this.gmR != null) {
            this.MessageDelegator.hd(this.gmR.getGUID());
        }
        if (this.gmT != null) {
            this.MessageDelegator.hd(this.gmT.getGUID());
        }
        if (this.gmU != null) {
            this.MessageDelegator.hd(this.gmU.getGUID());
        }
        if (this.gmV != null) {
            this.MessageDelegator.hd(this.gmV.getGUID());
        }
        if (this.gmW != null) {
            this.MessageDelegator.hd(this.gmW.getGUID());
        }
    }

    private void a(fvu fvu2) {
        this.dY();
        if (this.eou != null) {
            this.gmQ.setGUID(this.MessageDelegator.bzv());
            this.gmQ.a(this.eou);
            this.MessageDelegator.a(this.gmQ);
        }
    }

    private void dY() {
        assert (this.eou == null);
        this.eou = (dld)((dta)this.MessageDelegator).bzt().d(lcr.rg);
        if (this.eou == null) assert (false);
    }

    private void aKJ() {
        assert (this.Initialized);
        assert (this.MessageDelegator != null);
        if (lcr.rg == null && lcw.eng()) {
            return;
        }
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, lcr.qzp);
        fvq2.hcg = 1;
        fvq2.hch = lcr.rg;
        this.MessageDelegator.F(fvq2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 1) {
            ksv ksv2 = (ksv)ktf2;
            if (ksv2.getResult() != 0) return;
        }
        super.receiveResourceResponse(ktf2);
    }

    private void bkU() {
        if (deq.bkO().isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = lcn.emv();
        for (dgj dgj2 : deq.bkO().values()) {
            String string = dgj2.getMeshFileNameForRepository();
            if (string == null) continue;
            arrayList.add(string);
        }
        if (!arrayList.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                this.iJ((String)arrayList.get(i2));
            }
        }
    }

    private void b(gsl gsl2) {
        switch (gsl2.aXP) {
            case 1: {
                this.d(gsl2);
                break;
            }
            case 2: {
                this.e(gsl2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void d(gsl gsl2) {
        un un2 = (un)gsl2.joY[0];
        dek dek2 = un2.aXk;
        int n2 = dek2.SpecialEffectType;
        dgj dgj2 = this.zX(n2);
        if (dgj2 == null) {
            return;
        }
        dgj2.setGUID(this.MessageDelegator.bzv());
        dgj2.setServerGUID(gsl2.Rs);
        this.gmY.put(gsl2.Rs, dgj2.getGUID());
        dgj2.setServerObject(false);
        dgj2.handleSpecialEffectConfig(dek2, this.MessageDelegator.arc());
        dgj2.setMessageDelegator(this.MessageDelegator);
        if (dgj2.isMainEffect()) {
            dgj2.setTargetObjectGUID(dgj2.getNewEffectGuid());
        }
        this.a(dgj2);
    }

    private void e(gsl gsl2) {
        ldv ldv2 = gsl2.Rs;
        if ((ldv2 = this.gmY.remove(ldv2)) == null) {
            return;
        }
        this.jW(ldv2);
    }

    private void a(gli gli2) {
        if (this.gmZ) {
            return;
        }
        if (gli2.aUa == null) {
            return;
        }
        if (gli2.jkO == null) {
            return;
        }
        dek dek2 = gli2.jkO;
        dgj dgj2 = this.zX(dek2.bkI());
        if (dgj2 == null) {
            return;
        }
        dgj2.setMessageDelegator(this.MessageDelegator);
        dgj2.setGUID(dgj2.getNewEffectGuid());
        dgj2.setServerObject(false);
        dgj2.handleSpecialEffectConfig(dek2, this.MessageDelegator.arc());
        if (dgj2.isMainEffect()) {
            dgj2.setTargetObjectGUID(dgj2.getNewEffectGuid());
        }
        this.a(dgj2);
    }

    private void a(ldv ldv2, ldv ldv3, boolean bl) {
        ldv ldv4 = lcr.qzp;
        if (lcw.enb() && this.GUID.ib() == 7000) {
            ldv4 = lcr.ak((ldv)lcr.qzp, (int)this.GUID.ib());
        }
        grj grj2 = (grj)this.MessageDelegator.h(11029, ldv4, ldv2);
        grj2.Rs = ldv3;
        grj2.iWb = bl;
        this.MessageDelegator.E(grj2);
    }

    private void iJ(String string) {
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.ts(this.GUID);
        krr2.aaz(1);
        krr2.aaA(64);
        krr2.xC(true);
        krr2.xc(string);
        krr2.xe("");
        krr2.xd("");
        krr2.c(new ljq());
        krr2.hC(this.GUID);
        this.MessageDelegator.a(krr2);
    }

    private void bkV() {
        kkg kkg2 = (kkg)this.MessageDelegator.h(1540);
        kkg2.ts(this.getGUID());
        kkg2.wD(false);
        kkg2.jM(false);
        kkg2.pN(this.getGUID());
        lcq lcq2 = new lcq(0.0f, 0.0f, 0.0f, 0.05f);
        lcq lcq3 = new lcq(0.0f, 0.0f, 0.0f, 0.1f);
        lcq lcq4 = new lcq(0.0f, 0.0f, 0.0f, 0.2f);
        lcq lcq5 = new lcq(0.3f, 0.0f, 0.0f, 0.6f);
        lcq lcq6 = new lcq(0.0f, 0.0f, 0.5f, 0.8f);
        lcq lcq7 = new lcq(0.0f, 0.0f, 0.0f, 0.6f);
        lcq lcq8 = new lcq(0.2f, 0.2f, 0.2f, 1.0f);
        kkg2.Hj(kkg.iSG | kkg.iSH | kkg.iSI | kkg.iSJ | kkg.iSA | kkg.iSB | kkg.iSC);
        kkg2.t(lcq2);
        kkg2.u(lcq3);
        kkg2.v(lcq4);
        kkg2.y(lcq5);
        kkg2.z(lcq6);
        kkg2.A(lcq7);
        kkg2.B(lcq8);
        this.MessageDelegator.a(kkg2);
    }

    public dem bkW() {
        return this.gmX;
    }

    @Override
    protected void b(dgj dgj2) {
        if (dgj2.getServerGUID() != null) {
            this.gmY.remove(dgj2.getServerGUID());
        }
        super.b(dgj2);
    }

    public void hK(boolean bl) {
        this.gmZ = bl;
    }
}

