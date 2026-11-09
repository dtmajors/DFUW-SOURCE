/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class clx
extends clw {
    private ljq eJZ = null;
    private lgl eKa = null;
    private ldv aCE = null;
    private ldv eKb = null;
    private ldv eKc = null;
    private boolean eKd = false;
    private ldv doP = null;
    private ldv eKe = null;
    private ldv eKf = null;

    @Override
    public void doTick(ldz ldz2) {
        if (!this.eKd && this.aAG() != null && this.aAG().isReadyToRun()) {
            this.aSF();
            this.aSH();
            this.eKd = true;
        }
    }

    private void aSF() {
        if (!this.aAG().isReadyToRun()) {
            assert (false);
            return;
        }
        if (this.aSN() == null) {
            assert (false);
            return;
        }
        if (this.aAG().axa() == null) {
            assert (false);
            return;
        }
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.biE = this.aSK();
        kni2.biF = this.aSL();
        kni2.ehv = this.aSN();
        kni2.ehw = this.aAG().axa();
        kni2.ec = this.getGUID();
        kni2.dsK = true;
        kni2.iBr = true;
        kni2.doP = this.aSN();
        kni2.pPN = 64;
        this.eKe = kni2.getGUID();
        this.MessageDelegator.a(kni2);
    }

    public void j(lgj lgj2) {
        lgl lgl2 = lgj2.eqK();
        ljq ljq2 = lgl2.eq(this.aSK());
        ljq2.es(lgj2.eqI());
        lgl lgl3 = new lgl(this.aSL());
        lgl3.Y(lgl2);
        this.aAG().aX(ljq2);
        this.aAG().h(lgl3);
    }

    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 768: {
                if (ktv2.dXg().equals(this.eKe)) {
                    ktu ktu2 = (ktu)ktv2;
                    if (ktu2.getResult() != 0) {
                        assert (false);
                        return;
                    }
                    this.doP = ktu2.axa();
                    this.aSG();
                    break;
                }
                super.receiveResponse(ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void aSG() {
        assert (this.eKf == null);
        this.kZ(this.MessageDelegator.bzv());
        gef gef2 = (gef)this.MessageDelegator.h(775, this.getGUID(), lcr.qAI);
        gef2.qj(this.aSM());
        gef2.qk(this.aAG().getGUID());
        gef2.lQ(false);
        gef2.aH(true);
        gef2.fg(65);
        gef2.aO(true);
        gef2.gqN = 1282;
        gef2.setDeltaPos(this.aSK());
        gef2.setDeltaRot(this.aSL());
        gef2.kX(this.aSQ());
        this.MessageDelegator.F(gef2);
    }

    private void aSH() {
        this.kU(this.aAG().getGUID());
    }

    private void kU(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, this.getClass().getName(), "stopPositionalUpdates(): MeshObjectGUID is null");
            return;
        }
        ldv ldv3 = lcr.ak((ldv)lcr.qAI, (int)ldv2.ib());
        int[] nArray = new int[]{2, 3, 5};
        gls gls2 = (gls)this.MessageDelegator.h(21249, this.getGUID(), ldv3);
        gls2.ija = 2;
        gls2.Rs = ldv2;
        gls2.jlj = nArray;
        this.MessageDelegator.F(gls2);
    }

    public void aSI() {
        if (this.aAG() == null) {
            lfn.b(5, this.getClass().getName(), "removeServerPositionalRelation() MeshObject == NULL.");
            return;
        }
        if (!this.aAG().isReadyToRun()) {
            lfn.b(5, this.getClass().getName(), "removeServerPositionalRelation() MeshObject is not ready to run.");
            return;
        }
        if (this.aSO() == null) {
            lfn.b(5, this.getClass().getName(), "removeServerPositionalRelation() Relation GUID == NULL.");
            return;
        }
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.biE = this.aSK();
        knj2.biF = this.aSL();
        knj2.ehv = this.aSN();
        knj2.ehw = this.aAG().axa();
        knj2.ec = this.getGUID();
        knj2.dsK = false;
        knj2.iBr = false;
        knj2.hsP = false;
        knj2.doP = this.aSO();
        knj2.pPN = 1;
        this.MessageDelegator.a(knj2);
        this.aSJ();
    }

    private void aSJ() {
        gem gem2 = (gem)this.MessageDelegator.h(770, this.getGUID(), lcr.qAI);
        gem2.gqN = 1282;
        gem2.doP = this.aSQ();
        this.MessageDelegator.F(gem2);
        this.kZ(null);
    }

    public ljq aSK() {
        return this.eJZ;
    }

    public void bo(ljq ljq2) {
        this.eJZ = ljq2;
    }

    public lgl aSL() {
        return this.eKa;
    }

    public void p(lgl lgl2) {
        this.eKa = lgl2;
    }

    public ldv sV() {
        return this.aCE;
    }

    public void jv(ldv ldv2) {
        this.aCE = ldv2;
    }

    public ldv aSM() {
        return this.eKb;
    }

    public void kV(ldv ldv2) {
        this.eKb = ldv2;
    }

    public ldv aSN() {
        return this.eKc;
    }

    public void kW(ldv ldv2) {
        this.eKc = ldv2;
    }

    public ldv aSO() {
        return this.doP;
    }

    public void kX(ldv ldv2) {
        this.doP = ldv2;
    }

    public ldv aSP() {
        return this.eKe;
    }

    public void kY(ldv ldv2) {
        this.eKe = ldv2;
    }

    public ldv aSQ() {
        return this.eKf;
    }

    public void kZ(ldv ldv2) {
        this.eKf = ldv2;
    }

    @Override
    protected void a(fpn fpn2) {
        assert (fpn2.diQ != null);
        if (fpn2.diQ == null) {
            lfn.b(5, "SFMovableLocalStorageObjectServer", "handleLocalStorageObjectAccessRequest() PlayerPSOGUID==" + fpn2.diQ);
            return;
        }
        if (cug.vt((int)this.az())) {
            assert (this.aSy() != null);
            if (this.aSy() == null) {
                lfn.b(5, "SFMovableLocalStorageObjectServer", "handleLocalStorageObjectAccessRequest()  OwnerPlayerPSOGUID==" + this.aSy());
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
        if (cug.vv((int)this.az()) || cug.vu((int)this.az())) {
            fpo fpo3 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo3);
            fpo3.isM = true;
            fpo3.dAv = this.mB().getGUID();
            fpo3.iTn = this.az();
            fpo3.fzU = this.KY();
            this.MessageDelegator.F(fpo3);
            return;
        }
        if (fpn2.diQ.equals(this.aSy())) {
            fpo fpo4 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo4);
            fpo4.isM = true;
            fpo4.dAv = this.mB().getGUID();
            fpo4.iTn = this.az();
            fpo4.fzU = this.KY();
            this.MessageDelegator.F(fpo4);
            return;
        }
        int n = this.az();
        if (n == cug.fld) {
            if (!fpn2.diQ.equals(this.aSy())) {
                fpo fpo5 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
                this.MessageDelegator.b(fpn2, fpo5);
                fpo5.isM = false;
                fpo5.iTn = this.az();
                this.MessageDelegator.F(fpo5);
            }
            return;
        }
        if (this.eJV.contains(fpn2.diQ)) {
            lfn.b(5, "SFMovableLocalStorageObjectServer", "handleLocalStorageObjectAccessRequest() PlayerPSOGUID==" + fpn2.diQ + " has already a pending request");
            fpo fpo6 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo6);
            fpo6.isM = false;
            fpo6.iTn = this.az();
            this.MessageDelegator.F(fpo6);
            return;
        }
        if (n == cug.fle) {
            gpk gpk2 = (gpk)this.MessageDelegator.h(11107, this.getGUID(), this.aSy());
            gpk2.joD = fpn2.diQ;
            gpk2.eTT = this.aSy();
            gpk2.joE = 0;
            gpk2.aqs = this.YF;
            this.MessageDelegator.F(gpk2);
            this.eJV.add(fpn2.diQ);
            this.eJU.put(this.YF, fpn2);
            ++this.YF;
            return;
        }
    }

    @Override
    protected void a(gpl gpl2) {
        if (!this.eJU.containsKey(gpl2.aVk())) {
            lfn.b(5, "SFMovableLocalStorageObjectServer", "handlePartyCheckPlayerResponseMessage() There is no entry for message tag " + gpl2.aVk());
            assert (false);
            return;
        }
        boolean bl = gpl2.joF;
        fpn fpn2 = (fpn)this.eJU.remove(gpl2.aVk());
        assert (fpn2 != null);
        boolean bl2 = this.eJV.remove(fpn2.diQ);
        assert (bl2);
        if (this.mB() == null) {
            lfn.b(5, "SFMovableLocalStorageObjectServer", "handleLocalStorageObjectAccessRequest() Bank has not been created.");
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
            fpo3.fzU = this.KY();
            this.MessageDelegator.F(fpo3);
        } else {
            fpo fpo4 = (fpo)this.MessageDelegator.h(25861, this.GUID, fpn2.aO());
            this.MessageDelegator.b(fpn2, fpo4);
            fpo4.isM = false;
            fpo4.iTn = this.az();
            this.MessageDelegator.F(fpo4);
        }
    }
}

