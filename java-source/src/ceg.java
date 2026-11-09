/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cew
 *  cph
 *  lcr
 */
public class ceg
extends ccy
implements cef {
    private static final int eoK = 5;
    private beh eoL = null;
    private bel eoM = null;
    private ben enC = null;
    private final ceb eoN;
    private int Us = 0;
    private ldv Ur = null;
    private ldv eoO = null;
    private int eoP = 0;
    private int eoQ = 0;
    private cph eoR = null;

    public ceg(cev cev2) {
        super(cev2);
        this.eoN = new ceb(cev2);
    }

    public final bel aKZ() {
        return this.eoM;
    }

    @Override
    public final ceb aKQ() {
        return this.eoN;
    }

    public final int aLa() {
        return this.Us;
    }

    @Override
    public final ldv aKS() {
        return this.Ur;
    }

    @Override
    public final ldv aKR() {
        return this.eoO;
    }

    public int kV() {
        return this.eoP;
    }

    public final int aLb() {
        return this.eoQ;
    }

    @Override
    public final cph Wm() {
        return this.eoR;
    }

    @Override
    public final void oW(int n) {
        if (this.aEv()) {
            if (!(this.eoR instanceof cpf)) {
                return;
            }
            switch (n) {
                case 2: 
                case 10: {
                    cpf cpf2 = (cpf)this.eoR;
                    cpf2.oW(n);
                    break;
                }
            }
            return;
        }
        switch (n) {
            case 1: {
                this.emw = this.enC;
                break;
            }
            case 3: {
                this.emw = this.eoM;
                break;
            }
            case 5: {
                this.emw = this.eoL;
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public final void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.eoN.doTick(ldz2);
        if (this.aEv() && this.eoR != null && this.eoR.aXw()) {
            int n = this.eoR.aXx();
            int n2 = 0;
            if (n > 5) {
                n2 = n - 5;
            }
            for (int i2 = n2; i2 < n; ++i2) {
                lgj lgj2 = this.eoR.sx(i2);
                assert (lgj2 != null);
                fsg fsg2 = (fsg)this.MessageDelegator.h(20482, this.GUID, this.aeg.getServerGUID());
                fsg2.dTY = lgj2;
                this.MessageDelegator.E(fsg2);
            }
            this.eoR.aXy();
        }
    }

    @Override
    public final boolean aKT() {
        return this.Us == 1;
    }

    @Override
    public final boolean aEv() {
        return this.Us != 0;
    }

    @Override
    public final boolean aKU() {
        return this.Us == 3;
    }

    @Override
    public final boolean aKV() {
        return this.Us == 5;
    }

    @Override
    public final boolean aKX() {
        return this.Us == 6;
    }

    @Override
    public final boolean aKY() {
        return this.Us == 7;
    }

    @Override
    public final boolean aKW() {
        return this.Us == 4;
    }

    @Override
    public final void aK(ljq ljq2) {
        if (this.aEv()) {
            if (this.eoR == null) {
                return;
            }
            this.eoR.aK(ljq2);
        } else {
            super.aK(ljq2);
        }
    }

    @Override
    public final void aL(ljq ljq2) {
        if (this.aEv()) {
            if (this.eoR != null) {
                this.eoR.aL(ljq2);
            }
        } else {
            super.aL(ljq2);
        }
    }

    @Override
    public final void amY() {
        if (this.aEv()) {
            if (this.eoR != null) {
                this.eoR.amY();
            }
        } else {
            super.amY();
        }
    }

    @Override
    public void oU(int n) {
        if (n <= 0) {
            return;
        }
        this.eoN.oU(n);
    }

    @Override
    public final void aGx() {
        if (((cew)this.aeg).aJI()) {
            this.emw = this.enC;
        }
    }

    @Override
    public final void h(lgj lgj2) {
        if (this.aEv()) {
            return;
        }
        fsj fsj2 = (fsj)this.MessageDelegator.h(20483, this.GUID, this.aeg.getServerGUID());
        fsj2.dTY = lgj2;
        this.MessageDelegator.E(fsj2);
    }

    @Override
    public final void oV(int n) {
        if (n <= 0) {
            return;
        }
        if (this.emv == null) {
            return;
        }
        this.eoN.oV(n);
    }

    @Override
    public final void b(ljq ljq2, ljq ljq3, ljq ljq4) {
        assert (ljq2 != null);
        assert (ljq3 != null);
        assert (ljq4 != null);
        if (this.aEv() && this.eoR != null) {
            this.eoR.b(ljq2, ljq3, ljq4);
        } else {
            super.b(ljq2, ljq3, ljq4);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5121: {
                this.a((exa)dxq2);
                break;
            }
            case 5636: {
                this.a((fuu)dxq2);
                break;
            }
            case 12294: {
                this.handleObserverObserveStatusMessage((fvu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5385: {
                this.eoN.a((kvm)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    protected final void aJs() {
        assert (this.emv == null);
        assert (this.eoL == null);
        assert (this.eoM == null);
        assert (this.enC == null);
        this.eoL = new beh(this.aeg);
        this.eoL.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eoL);
        this.eoM = new bel(this.aeg);
        this.eoM.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eoM);
        this.enC = new ben(this.aeg);
        this.enC.setGUID(this.MessageDelegator.bzv());
        this.enC.cK(0.01f);
        this.enC.cJ(0.01f);
        this.MessageDelegator.a(this.enC);
        this.emw = this.enC;
        this.eoL.amv();
        this.eoM.amv();
        this.enC.amv();
    }

    @Override
    protected final void aJt() {
        if (this.eoL.amP()) {
            this.eoL.amK();
        }
        if (this.eoM.amP()) {
            this.eoM.amK();
        }
        if (this.enC.amP()) {
            this.enC.amK();
        }
        this.MessageDelegator.hd(this.eoL.getGUID());
        this.MessageDelegator.hd(this.eoM.getGUID());
        this.MessageDelegator.hd(this.enC.getGUID());
    }

    private void aLc() {
    }

    private void aLd() {
    }

    private void a(exa exa2) {
        assert (this.aeg.aAG() != null);
        if (exa2.gNT == 0) {
            this.aLc();
            assert (false);
            return;
        }
        if (exa2.gNT == 1) {
            this.aLd();
            assert (false);
            return;
        }
        if (exa2.dcr <= 0) {
            lfn.b(5, "SFControllerManagerPlayerClient", "handleControllerChangeMessage() ControllerType is invalid.");
            return;
        }
        switch (exa2.dcr) {
            case 3: {
                this.emw = this.eoM;
                break;
            }
            case 8: {
                assert (this.Us == 0);
                assert (this.Ur == null);
                if (exa2.Ur == null) {
                    lfn.b(5, "SFControllerManagerPlayerClient", "handleControllerChangeMessage() ExternalObjectGUID is null.");
                    return;
                }
                switch (exa2.Us) {
                    case 1: {
                        this.aeg.fG(true);
                    }
                    case 3: 
                    case 4: 
                    case 6: 
                    case 8: {
                        break;
                    }
                    case 5: 
                    case 7: {
                        if (this.aeg.aJD().aDe().edl) break;
                        this.aeg.aJD().a(byw.c.ebZ);
                        break;
                    }
                    default: {
                        lfn.b(5, "SFControllerManagerPlayerClient", "handleControllerChangeMessage() Invalid externalobjecttype provided: " + exa2.Us);
                        assert (false);
                        return;
                    }
                }
                this.Us = exa2.Us;
                this.Ur = lcr.ak((ldv)exa2.Ur, (int)this.GUID.ib());
                bvf bvf2 = (bvf)this.aeg.aAG();
                bvf2.azx().aAW();
                if (this.emv != null) {
                    this.emv.amS();
                    this.emv = null;
                }
                this.iL(this.Ur);
                break;
            }
            case 9: {
                assert (this.Us != 0);
                assert (this.Ur != null);
                assert (this.eoR != null);
                if (this.Us != 8) {
                    this.eoR.aVj();
                }
                byw.c c2 = null;
                bzc bzc2 = null;
                boolean bl = false;
                switch (this.Us) {
                    case 1: {
                        c2 = byw.c.ecs;
                        bzc2 = ((bxt)((coq)this.eoR).aVp()).aDe();
                        bzc2.edp = 0;
                        bl = true;
                        this.aeg.fG(false);
                        break;
                    }
                    case 3: {
                        c2 = byw.c.ecs;
                        break;
                    }
                    case 5: {
                        c2 = byw.c.ecs;
                        bzc2 = ((bzq)((cpb)this.eoR).aWH()).aDe();
                        break;
                    }
                    case 4: {
                        c2 = byw.c.ecn;
                        bzc2 = ((byr)((cpf)this.eoR).aWW()).aDe();
                        break;
                    }
                    case 6: {
                        c2 = byw.c.ecs;
                        bzc2 = ((bxf)((com)this.eoR).aVf()).aDe();
                        break;
                    }
                    case 7: 
                    case 8: {
                        c2 = byw.c.ecs;
                        bzc2 = ((bzk)((cpj)this.eoR).aXY()).aDe();
                        break;
                    }
                    default: {
                        return;
                    }
                }
                this.Us = 0;
                bvf bvf3 = (bvf)this.aeg.aAG();
                bvf3.azx().aAV();
                this.fE(true);
                this.aLe();
                this.Ur = null;
                this.eoO = null;
                this.eoR = null;
                this.eoP = 0;
                this.eoQ = 0;
                if (bzc2 != null) {
                    bzg bzg2 = (bzg)this.aeg.aJD();
                    bzg2.c(bzc2);
                    ((cew)this.aeg).aMh().fm(true);
                }
                this.aeg.aJD().a(c2);
                this.pm(exa2.dcr);
                if (!bl) break;
                this.aeg.aJD().a(byw.c.ecx);
                break;
            }
            default: {
                lfn.b(5, "SFControllerManagerPlayerClient", "handleControllerChangeMessage() Invalid controllertype provided: " + exa2.dcr);
                return;
            }
        }
    }

    private void a(fuu fuu2) {
        assert (this.aEv());
        assert (this.Ur != null);
        assert (this.eoR == null);
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.Ur);
        if (amf2 == null) {
            lfn.b(5, "SFControllerManagerPlayerClient", "handleObjectInfoGUIDResponse() ExternalObject " + this.Ur + " was not found.");
            assert (false);
            return;
        }
        if (!(amf2 instanceof cph)) {
            lfn.b(5, "SFControllerManagerPlayerClient", "handleObjectInfoGUIDResponse() ExternalObject not a SFOwnedPhysicalObject: " + amf2.getClass().getName());
            assert (false);
            return;
        }
        this.eoR = (cph)amf2;
        if (this.Us != 8) {
            this.eoR.lA(this.aeg.getGUID());
            this.eoR.aVi();
        }
        assert (this.eoR.aAG() != null);
        this.eoO = this.eoR.aAG().getGUID();
        this.eoP = this.eoR.az();
        switch (this.Us) {
            case 1: {
                this.eoQ = 0;
                this.aeg.aJD().a(byw.c.ecr);
                break;
            }
            case 3: {
                this.eoQ = this.eoP;
                this.aeg.aJD().a(byw.c.ecr);
                break;
            }
            case 5: {
                if (amf2 instanceof cpb) {
                    cpb cpb2 = (cpb)((Object)amf2);
                    this.eoQ = cpb2.aWL() != null ? cpb2.aWL().az() : 0;
                }
                this.aeg.aJD().a(byw.c.ecr);
                break;
            }
            case 4: {
                this.aeg.aJD().a(byw.c.ecm);
                break;
            }
            case 6: {
                this.eoQ = 0;
                this.aeg.aJD().a(byw.c.ecr);
                break;
            }
            case 7: 
            case 8: {
                this.eoQ = this.eoP;
                this.aeg.aJD().a(byw.c.ecr);
                break;
            }
            default: {
                lfn.b(5, "SFControllerManagerPlayerClient", "handleObjectInfoGUIDResponse() Invalid externalobjecttype provided: " + this.Us);
                return;
            }
        }
        this.fE(false);
        this.aLe();
        this.pm(8);
    }

    private void handleObserverObserveStatusMessage(fvu fvu2) {
        this.kc(this.Ur);
    }

    private void fL(boolean bl) {
        assert (this.aeg.getGUID() != null);
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.wD(false);
        kmj2.jM(false);
        kmj2.ts(this.getGUID());
        kmj2.hC(this.aeg.KY());
        kmj2.Zf(1);
        kmj2.aO(bl);
        this.MessageDelegator.a(kmj2);
    }

    private void aLe() {
        cew cew2 = (cew)this.aeg;
        assert (cew2.aJI());
        assert (cew2.aMj() != null);
        switch (this.Us) {
            case 0: {
                this.fL(true);
                break;
            }
            case 1: 
            case 3: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                assert (this.Ur != null);
                dsv dsv2 = dsv.byP();
                dsv2.cA(this.eoR.aXJ());
                dsv2.K(this.eoR.aXK());
                dsv2.iB(this.eoR.Hq());
                dsv2.nR(this.eoR.getGUID());
                dsv2.nS(this.eoR.aAG().axa());
                switch (this.Us) {
                    case 1: {
                        dsv2.BU(1);
                        break;
                    }
                    case 3: {
                        dsv2.BU(2);
                        break;
                    }
                    case 5: {
                        dsv2.BU(4);
                        break;
                    }
                    case 6: {
                        dsv2.BU(5);
                        break;
                    }
                    case 7: {
                        dsv2.BU(6);
                        break;
                    }
                    case 8: {
                        dsv2.BU(7);
                        break;
                    }
                    default: {
                        lfn.b(5, "SFControllerManagerPlayerClient", "sendCharacterInfoMessage() ");
                        assert (false);
                        return;
                    }
                }
                this.fL(false);
                break;
            }
            case 4: {
                assert (this.Ur != null);
                dsv dsv3 = dsv.byP();
                dsv3.cA(this.eoR.aXJ());
                dsv3.K(this.eoR.aXK());
                dsv3.iB(this.eoR.Hq());
                dsv3.nR(this.eoR.getGUID());
                dsv3.nS(this.eoR.aAG().axa());
                this.fL(false);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void pm(int n) {
        ldv ldv2 = this.aeg.getServerGUID();
        exb exb2 = (exb)this.MessageDelegator.h(5122, this.GUID, ldv2);
        exb2.iEN = true;
        exb2.dcr = n;
        this.MessageDelegator.F(exb2);
    }

    private void kc(ldv ldv2) {
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, ldv2);
        fut2.iXt = 2;
        fut2.iXu = true;
        this.MessageDelegator.F(fut2);
    }

    private void iL(ldv ldv2) {
        assert (ldv2 != null);
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, lcr.qzp);
        fvq2.hcg = 1;
        fvq2.hch = ldv2;
        this.MessageDelegator.F(fvq2);
    }

    private void fE(boolean bl) {
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.Zf(1);
        kmj2.ts(this.GUID);
        kmj2.hC(this.aeg.aAG().axa());
        kmj2.aO(bl);
        this.MessageDelegator.a(kmj2);
    }

    @Override
    public void aN(ljq ljq2) {
        if (this.enC != null && this.enC.isActive()) {
            this.enC.aN(ljq2);
        }
    }

    @Override
    public void cG(float f2) {
        if (this.enC != null) {
            this.enC.cG(f2);
        }
    }

    public void aLf() {
        if (this.eoR == null) {
            return;
        }
        if (this.eoR instanceof coq) {
            ((coq)this.eoR).aVw();
            ((coq)this.eoR).aVx();
        } else if (this.eoR instanceof cpf) {
            ((cpf)this.eoR).aVw();
            ((cpf)this.eoR).aVx();
        }
    }

    public void fM(boolean bl) {
        this.emv.cW(bl);
    }
}

