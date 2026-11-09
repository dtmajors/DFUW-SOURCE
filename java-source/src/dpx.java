/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class dpx
extends btk {
    private dps gNx = null;
    private dpr gNy = null;
    private ccv ddp = null;
    private dpq gNz = null;
    private dpo gNA = null;
    private dpw gNB = null;
    private dqc gNC = null;
    private pf aNM = null;

    boolean bsE() {
        return this.ddp != null && this.gNz.bsE() && this.gNA.bsE() && this.gNB.bsE() && this.gNC.bsE();
    }

    boolean bsF() {
        return this.aNM == null && this.gNz.bsF() && this.gNA.bsF() && this.gNB.bsF() && this.gNC.bsF();
    }

    public String getID() {
        return this.gNy.getID();
    }

    List<dpp> bsG() {
        return this.gNy.bsn();
    }

    int bsj() {
        return this.gNz.bsj();
    }

    int bsk() {
        return this.gNz.bsk();
    }

    ljq av() {
        return this.gNy.bsm().av();
    }

    public ldv bqi() {
        return this.gNA.bqi();
    }

    public String bsb() {
        return this.gNA.bsb();
    }

    ldv bsc() {
        return this.gNA.bsc();
    }

    public dpy bsd() {
        return this.gNA.bsd();
    }

    public double aeY() {
        return this.gNA.aeY();
    }

    public double bse() {
        return this.gNA.bse();
    }

    public float bsH() {
        return this.gNB.aSs();
    }

    public double bsy() {
        return this.gNB.bsy();
    }

    public double bsz() {
        return this.gNB.bsz();
    }

    public int bsw() {
        return this.gNB.bsw();
    }

    public int bsx() {
        return this.gNB.bsx();
    }

    public ldv bsA() {
        return this.gNB.bsA();
    }

    public ldv bsB() {
        return this.gNB.bsB();
    }

    public float bsC() {
        return this.gNB.bsC();
    }

    dpx(dps dps2, dpr dpr2) {
        assert (dps2 != null);
        assert (dpr2 != null);
        assert (dpr2.bsm() != null);
        this.gNx = dps2;
        this.gNy = dpr2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.bsN();
        this.gNz = new dpq(this);
        this.gNz.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.gNz);
        this.gNA = new dpo(this);
        this.gNA.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.gNA);
        this.gNB = new dpw(this);
        this.gNB.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.gNB);
        this.gNC = new dqc(this);
        this.gNC.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.gNC);
    }

    @Override
    public void cleanUp() {
        if (this.gNC != null) {
            this.MessageDelegator.hd(this.gNC.getGUID());
            this.gNC = null;
        }
        if (this.gNB != null) {
            this.gNB.bsT();
            this.MessageDelegator.hd(this.gNB.getGUID());
            this.gNB = null;
        }
        if (this.gNA != null) {
            this.gNA.bsT();
            this.MessageDelegator.hd(this.gNA.getGUID());
            this.gNA = null;
        }
        if (this.gNz != null) {
            this.MessageDelegator.hd(this.gNz.getGUID());
            this.gNz = null;
        }
        this.bsO();
        super.cleanUp();
    }

    void bsI() {
        this.bsL();
    }

    private void bsJ() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJd();
        this.gNz.aJd();
        this.gNA.aJd();
        this.gNB.aJd();
        this.gNC.aJd();
        switch (this.gNA.bsd()) {
            case gND: {
                this.a(this.gNA);
                break;
            }
            case gNF: {
                if (this.gNB.bsv()) {
                    this.a(this.gNB);
                    break;
                }
                this.a(this.gNA);
                break;
            }
            case gNE: {
                this.a(this.gNB);
            }
        }
    }

    public pf bsK() {
        pf pf2 = new pf();
        pf2.aGH = this.GUID;
        pf2.aGI = new pg();
        pf2.aGI.aGH = this.GUID;
        pf2.aGI.Filename = this.gNy.bsl();
        this.gNz.b(pf2);
        this.gNA.b(pf2);
        this.gNB.b(pf2);
        this.gNC.b(pf2);
        return pf2;
    }

    public void a(pf pf2) {
        this.aNM = pf2;
        this.bsL();
    }

    private void bsL() {
        if (!this.bsE()) {
            return;
        }
        if (this.aNM == null) {
            this.bsJ();
        } else {
            this.gNz.a(this.aNM);
            this.gNA.a(this.aNM);
            this.gNB.a(this.aNM);
            this.gNC.a(this.aNM);
            this.aNM = null;
            this.bsJ();
        }
    }

    void bsM() {
        this.bsJ();
    }

    private void bsN() {
        if (this.gNy == null || this.gNy.bsm() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "createControlPoint() : Control-point info is null!!!");
            assert (false);
            return;
        }
        if (this.ddp != null) {
            lfn.b(5, this.getClass().getSimpleName(), "createControlPoint() : Control-point is not null!!!");
            assert (false);
            return;
        }
        this.e(this.gNy.bsm().az(), this.gNy.bsm().av(), this.gNy.bsm().aw());
    }

    private void bsO() {
        if (this.ddp == null) {
            lfn.b(5, this.getClass().getSimpleName(), "removeControlPoint() : Control-point is null!!!");
            assert (false);
            return;
        }
        this.nA(this.ddp.getGUID());
        this.MessageDelegator.hd(this.ddp.getGUID());
        this.ddp = null;
    }

    private void a(dqa dqa2) {
        if (dqa2 != this.gNA) {
            this.gNA.bsT();
        }
        if (dqa2 != this.gNB) {
            this.gNB.bsT();
        }
        if (dqa2 != null) {
            dqa2.a(this.ddp);
        }
    }

    void bsP() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        if (this.gNA.bqi() != null) {
            this.bT(this.gNz.bsj(), this.gNz.bsk());
        }
    }

    void bsQ() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.a((dqa)null);
        this.gNz.bsQ();
        this.gNA.bsQ();
        this.gNB.bsQ();
        this.gNC.bsQ();
    }

    void aJe() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJe();
        switch (this.gNA.bsd()) {
            case gND: {
                this.a(this.gNA);
                break;
            }
            case gNE: {
                this.a(this.gNB);
                break;
            }
            case gNF: {
                if (this.gNB.bsv()) break;
                this.a(this.gNA);
            }
        }
        this.gNz.aJe();
        this.gNA.aJe();
        this.gNB.aJe();
        this.gNC.aJe();
    }

    void aJf() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJf();
        this.gNz.aJf();
        this.gNA.aJf();
        this.gNB.aJf();
        this.gNC.aJf();
    }

    void aJg() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJg();
        this.gNz.aJg();
        this.gNA.aJg();
        this.gNB.aJg();
        this.gNC.aJg();
    }

    void bsR() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJh();
        this.gNz.bsR();
        this.gNA.bsR();
        this.gNB.bsR();
        this.gNC.bsR();
    }

    void bsS() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJi();
        this.a(this.gNB);
        this.gNz.bsS();
        this.gNA.bsS();
        this.gNB.bsS();
        this.gNC.bsS();
    }

    void aSm() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJj();
        this.gNz.aSm();
        this.gNA.aSm();
        this.gNB.aSm();
        this.gNC.aSm();
    }

    void aSn() {
        if (!this.bsE() || !this.bsF()) {
            return;
        }
        this.ddp.aJk();
        if (this.gNA.bsd() == dpy.gNF) {
            this.a(this.gNA);
        }
        this.gNz.aSn();
        this.gNA.aSn();
        this.gNB.aSn();
        this.gNC.aSn();
    }

    void nz(ldv ldv2) {
    }

    private void e(int n, ljq ljq2, lgl lgl2) {
        exx exx2 = (exx)this.MessageDelegator.h(24065, this.getGUID(), lcr.qBD);
        exx2.hsP = true;
        exx2.ResourceType = n;
        exx2.Position = ljq2;
        exx2.Rotation = lgl2;
        exx2.ikP = true;
        exx2.oF(this.GUID);
        this.MessageDelegator.F(exx2);
    }

    private void nA(ldv ldv2) {
        eyb eyb2 = (eyb)this.MessageDelegator.h(24067, this.GUID, lcr.qBD);
        eyb2.hsP = true;
        eyb2.iFu = true;
        eyb2.cQg = ldv2;
        this.MessageDelegator.F(eyb2);
    }

    private void bT(int n, int n2) {
        exw exw2 = (exw)this.MessageDelegator.h(24069, this.GUID, this.gNA.bqi());
        exw2.cQg = this.GUID;
        exw2.ija = 4;
        exw2.iFq = n;
        exw2.cQj = n2;
        exw2.iFs = new int[0];
        exw2.iFr = new int[0];
        this.MessageDelegator.F(exw2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24066: {
                this.a((exy)dxq2);
                break;
            }
            case 24329: 
            case 24334: {
                this.gNC.receiveMessage(dxq2);
                break;
            }
            case 24074: 
            case 24076: {
                this.gNA.receiveMessage(dxq2);
                break;
            }
            case 24077: 
            case 24332: {
                this.gNB.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(exy exy2) {
        if (exy2.bNk() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleControlPointCreateResponseMessage() : Control-point is null!!!");
            assert (false);
            return;
        }
        this.ddp = exy2.bNk();
        this.ddp.a(this);
        this.ddp.fA(false);
        this.ddp.fB(false);
        this.ddp.a((cbq)null);
        this.MessageDelegator.a((amf)((Object)this.ddp));
        this.bsL();
    }
}

