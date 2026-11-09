/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class clw
extends clv
implements bto {
    private ldv eJP;
    private bfu elg = null;
    private cbq elf = null;
    private static final float eJQ = 3.0f;
    private bwa eld = null;
    private ljq eJR = null;
    private boolean eJS = false;
    private double eJT = 0.0;
    private double eIk = 0.0;
    protected Map<Integer, fpn> eJU = lcn.emw();
    protected Set<ldv> eJV = lcn.emx();
    protected int YF = 0;
    private static final double eJW = 1.0;
    private boolean eJX = false;
    private double eJY = 0.0;
    private double abo = 0.0;
    private ti eqy = null;
    private int eJc = -1;
    private ldv eJe = null;

    public clw() {
        this.elg = new bfu(this);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eld != null) {
            this.eld.doTick(this.MessageDelegator.arc());
        }
        if (!this.isInitialized()) {
            return;
        }
        if (!this.eJX) {
            return;
        }
        this.Y(ldz2);
        this.Z(ldz2);
    }

    protected void a(fpn fpn2) {
        assert (fpn2.diQ != null);
        if (fpn2.diQ == null) {
            lfn.b(5, "SFLocalStorageStrongBox", "handleLocalStorageObjectAccessRequest() PlayerPSOGUID==" + fpn2.diQ);
            return;
        }
        if (cug.vk((int)this.az())) {
            assert (this.eJP != null);
            if (this.eJP == null) {
                lfn.b(5, "SFLocalStorageStrongBox", "handleLocalStorageObjectAccessRequest()  OwnerPlayerPSOGUID==" + this.eJP);
                return;
            }
        }
        if (this.mB() == null) {
            fpo fpo2 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo2);
            fpo2.isM = false;
            fpo2.iTn = this.az();
            this.MessageDelegator.F(fpo2);
            return;
        }
        if (cug.vn((int)this.az())) {
            fpo fpo3 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo3);
            fpo3.isM = true;
            fpo3.dAv = this.mB().getGUID();
            fpo3.iTn = this.az();
            this.MessageDelegator.F(fpo3);
            return;
        }
        if (this.eJV.contains(fpn2.diQ)) {
            lfn.b(5, "SFLocalStorageStrongBox", "handleLocalStorageObjectAccessRequest() PlayerPSOGUID==" + fpn2.diQ + " has already a pending request");
            fpo fpo4 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo4);
            fpo4.isM = false;
            fpo4.iTn = this.az();
            this.MessageDelegator.F(fpo4);
            return;
        }
        int n = this.az();
        if (fpn2.diQ.equals(this.eJP)) {
            fpo fpo5 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo5);
            fpo5.isM = true;
            fpo5.dAv = this.mB().getGUID();
            fpo5.iTn = this.az();
            this.MessageDelegator.F(fpo5);
            return;
        }
        if (n == cug.fkX) {
            gpk gpk2 = (gpk)this.MessageDelegator.h(11107, this.getGUID(), this.eJP);
            gpk2.joD = fpn2.diQ;
            gpk2.eTT = this.eJP;
            gpk2.joE = 1;
            gpk2.aqs = this.YF;
            this.MessageDelegator.F(gpk2);
            this.eJV.add(fpn2.diQ);
            this.eJU.put(this.YF, fpn2);
            ++this.YF;
            return;
        }
        if (n == cug.fkY) {
            gpk gpk3 = (gpk)this.MessageDelegator.h(11107, this.getGUID(), this.eJP);
            gpk3.joD = fpn2.diQ;
            gpk3.eTT = this.eJP;
            gpk3.joE = 0;
            gpk3.aqs = this.YF;
            this.MessageDelegator.F(gpk3);
            this.eJV.add(fpn2.diQ);
            this.eJU.put(this.YF, fpn2);
            ++this.YF;
            return;
        }
        if (n == cug.fkW) {
            if (!fpn2.diQ.equals(this.eJP)) {
                fpo fpo6 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
                this.MessageDelegator.b(fpn2, fpo6);
                fpo6.isM = false;
                fpo6.iTn = this.az();
                this.MessageDelegator.F(fpo6);
            }
            return;
        }
        if (n == cug.fla) {
            fpo fpo7 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo7);
            fpo7.isM = true;
            fpo7.dAv = this.mB().getGUID();
            fpo7.iTn = this.az();
            this.MessageDelegator.F(fpo7);
            return;
        }
        if (n == cug.fkZ) {
            fpo fpo8 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo8);
            fpo8.isM = true;
            fpo8.dAv = this.mB().getGUID();
            fpo8.iTn = this.az();
            this.MessageDelegator.F(fpo8);
            return;
        }
    }

    protected void a(gpl gpl2) {
        if (!this.eJU.containsKey(gpl2.aVk())) {
            lfn.b(5, "SFLocalStorageStrongBox", "handlePartyCheckPlayerResponseMessage() There is no entry for message tag " + gpl2.aVk());
            assert (false);
            return;
        }
        boolean bl = gpl2.joF;
        fpn fpn2 = this.eJU.remove(gpl2.aVk());
        assert (fpn2 != null);
        boolean bl2 = this.eJV.remove(fpn2.diQ);
        assert (bl2);
        if (this.mB() == null) {
            lfn.b(5, "SFLocalStorageStrongBox", "handleLocalStorageObjectAccessRequest() Bank has not been created.");
            fpo fpo2 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo2);
            fpo2.isM = false;
            fpo2.iTn = this.az();
            this.MessageDelegator.F(fpo2);
            assert (false);
            return;
        }
        if (bl) {
            fpo fpo3 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo3);
            fpo3.isM = true;
            fpo3.dAv = this.mB().getGUID();
            fpo3.iTn = this.az();
            this.MessageDelegator.F(fpo3);
        } else {
            fpo fpo4 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo4);
            fpo4.isM = false;
            fpo4.iTn = this.az();
            this.MessageDelegator.F(fpo4);
        }
    }

    public void aSv() {
        this.aSw();
        ljq ljq2 = this.aAG().av();
        ljq2.et(this.eJR);
        this.aAG().c(ljq2);
        this.aAG().a(this.aAG().aw());
        this.aSx();
        this.eJS = true;
    }

    protected void aSw() {
        bvd bvd2 = this.aAG();
        if (bvd2 == null) {
            lfn.b(5, "SFLocalStorageStrongBoxServer", "setupSpawnDelta() MO == NULL");
            this.eJR = new ljq();
            return;
        }
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map == null) {
            lfn.b(5, "SFLocalStorageStrongBoxServer", "setupSpawnDelta() AttMap == null");
            this.eJR = new ljq();
            return;
        }
        eh eh2 = map.get("AttachPoint_Structure Spawn Delta");
        if (eh2 == null) {
            assert (false);
            lfn.b(5, "SFLocalStorageStrongBoxServer", "setupSpawnDelta() SpawnPoint == null");
            this.eJR = new ljq();
            return;
        }
        this.eJR = new ljq(eh2.fb());
        this.eJR.rlV = 0.0f;
        this.eJR.x = 0.0f;
    }

    private void j(ljq ljq2, ljq ljq3) {
        if (this.aAG().aze() == null) {
            assert (false);
            return;
        }
        bvd bvd2 = this.aAG();
        this.eld = new bwa();
        this.eld.setServerObject(true);
        this.eld.eL(false);
        this.eld.d(bvd2);
        this.eld.setMessageDelegator(this.MessageDelegator);
        this.eld.bf(3.0);
        this.eld.bc(ljq2);
        this.eld.l(this.aAG().aw());
        this.eld.bd(ljq3);
        this.eld.m(this.aAG().aw());
        this.eld.o(this.MessageDelegator.arc().rgz);
        this.eld.initialize();
    }

    private void k(ljq ljq2, ljq ljq3) {
        fuj fuj2 = (fuj)this.MessageDelegator.h(1038, this.aAG().aze().getGUID(), this.aAG().aze().getGUID());
        fuj2.gon = ljq2;
        fuj2.goo = ljq3;
        fuj2.iWX = this.aAG().aw();
        fuj2.iWY = this.aAG().aw();
        fuj2.eKm = 3.0;
        fuj2.oV = this.MessageDelegator.arc().rgz;
        gqu gqu2 = (gqu)this.MessageDelegator.h(11055, this.getGUID(), lcr.qAJ);
        gqu2.jpQ = (float)this.MessageDelegator.arc().rgz + 3.0f;
        gqu2.iXB = fuj2;
        this.MessageDelegator.F(gqu2);
    }

    protected void aSx() {
        if (this.aAG().aze() == null) {
            assert (false);
            return;
        }
        if (this.eJR == null) {
            lfn.b(5, "SFLocalStorageStrongBoxServer", "startAnimatingUp(): SpawnDelta == null");
            assert (false);
            return;
        }
        ljq ljq2 = this.aAG().av();
        ljq ljq3 = this.aAG().av();
        ljq3.es(this.eJR);
        this.j(ljq2, ljq3);
        this.k(ljq2, ljq3);
    }

    public boolean aAE() {
        if (this.eld == null) {
            return true;
        }
        return this.eld.aAE();
    }

    protected void aAC() {
    }

    protected void a(cbx cbx2, float f, ep.a a2) {
        alp alp2 = new alp();
        alp2.setGUID(this.MessageDelegator.bzv());
        alp2.x(f);
        alp2.ga(1);
        alp2.fC(352);
        alp2.gc(0);
        alp2.cP(this.getGUID());
        alp2.gd(cbx2.az());
        alp2.ge(cxd.fHu);
        alp2.fJ(bfk.dgO);
        alp2.gf(1);
        alp2.a(a2);
        cbx2.jm().a((alq)alp2);
    }

    protected void c(cbx cbx2, boolean bl) {
        ez ez2 = (ez)cbx2.fi().ae(352);
        if (ez2 == null) {
            lfn.b(5, "SFLocalStorageStrongBoxServer", "setInfiniteHealthBlocker(): No Health attribute");
            assert (false);
            return;
        }
        if (bl) {
            ez2.a(ep.a.Pe);
        } else {
            ez2.a(ep.a.Pg);
        }
    }

    protected void aqx() {
        ej ej2 = this.fi().ae(352);
        if (ej2 == null) {
            lfn.b(5, "SFLocalStorageStrongBoxServer", "enableAttributeNotification() No Health Attribute!");
            return;
        }
        if (!(ej2 instanceof ex)) {
            lfn.b(5, "SFLocalStorageStrongBoxServer", "enableAttributeNotification() Health NOT limited float attribute");
            return;
        }
        ex ex2 = (ex)ej2;
        ex2.y(true);
    }

    public void f(et et2) {
        if (this.elf != null && !this.elf.b(this, et2)) {
            return;
        }
        if (et2.getType() == 352) {
            bfl bfl2 = (bfl)this.elg.aof();
            if (bfl2 != null) {
                this.elg.a(5, bfl2);
            }
            if (this.elf != null) {
                this.elf.b(this);
            }
        }
        super.f(et2);
    }

    public void d(et et2, float f) {
        super.d(et2, f);
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25860: {
                this.a((fpn)dxq2);
                break;
            }
            case 11108: {
                this.a((gpl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void Hy() {
        this.aIw();
    }

    public ldv aSy() {
        return this.eJP;
    }

    public void kT(ldv ldv2) {
        this.eJP = ldv2;
    }

    public void aSz() {
        this.elf = null;
    }

    public void d(cbq cbq2) {
        this.elf = cbq2;
    }

    public bfu aJc() {
        return this.elg;
    }

    public final double aSA() {
        return this.eJT;
    }

    public final void bw(double d2) {
        this.eJT = d2;
    }

    public final double aSB() {
        return this.eIk;
    }

    public final void bx(double d2) {
        this.eIk = d2;
    }

    public Set<ldv> aSC() {
        return this.eJV;
    }

    public boolean aSD() {
        return this.eJS;
    }

    @Override
    public void aSu() {
        this.eqy = lea.eom().get(this.az());
        if (this.az() == cug.fkZ) {
            this.jm().c(352, (float)this.eqy.uF());
        }
        this.eJc = this.eqy.uG();
        this.aSE();
        this.eJX = true;
    }

    private void Y(ldz ldz2) {
        if (!cug.vl((int)this.az())) {
            return;
        }
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = 1.0;
        if (this.mB().aJC().asf().isEmpty()) {
            this.uZ();
        } else {
            this.uY();
        }
    }

    private void Z(ldz ldz2) {
        if (this.az() != cug.fla) {
            return;
        }
        this.eJY -= ldz2.qwh;
        if (this.eJY > 0.0) {
            return;
        }
        this.eJY = this.eqy.uH();
        if (this.mB().aJC().asf().isEmpty()) {
            this.aSE();
        }
    }

    private void aSE() {
        if (this.az() != cug.fla) {
            return;
        }
        cte[] cteArray = ctf.a(this.eqy.uI(), 1.0f);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.dul = 0;
        fcy2.bst = bkd.dqO;
        fcy2.aZG = this.mB().getGUID();
        fcy2.akX = this.mB().getGUID();
        fcy2.dtP = cteArray;
        fcy2.iyH = false;
        fcy2.iJG = true;
        fcy2.b(bqy.dFR);
        this.MessageDelegator.F(fcy2);
    }

    private void uY() {
        if (this.eJc == -1) {
            return;
        }
        if (this.eJe != null) {
            return;
        }
        this.eJe = this.MessageDelegator.lL(lcr.qEb);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.SpecialEffectType = this.eJc;
        glh2.aUa = this.eJe;
        glh2.akX = this.KY();
        glh2.aZD = this.aAG().azb();
        this.MessageDelegator.F(glh2);
    }

    private void uZ() {
        if (this.eJe == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEb);
        glj2.aUa = this.eJe;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
        this.eJe = null;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.elg = null;
        this.elf = null;
        this.eld = null;
        this.eJR = null;
        this.eJU.clear();
        this.eJV.clear();
        this.eJU = null;
        this.eJV = null;
        this.uZ();
    }

    public /* synthetic */ bfq aIv() {
        return this.aJc();
    }
}

