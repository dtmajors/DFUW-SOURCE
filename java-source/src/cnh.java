/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public class cnh
extends cni
implements brd {
    public static final float eNK = 1.0f;
    public static final float eNL = 420.0f;
    public static final float eNM = 7200.0f;
    public static final float eNN = 15.0f;
    public static final boolean eNO = true;
    private int eNP = 0;
    private boolean eNQ = false;
    private boolean eNR = false;
    private cte[] eNS = null;
    private brp[] eNT = null;
    private boolean eNU = false;
    private ldv atv = null;
    private double eNV = 0.0;
    private int SpecialEffectType = -1;
    private ldv aUa = null;
    private int eNW = 0;
    private int eNX = -1;

    public cnh() {
        this.setObjectType(117);
    }

    public int aUj() {
        return this.eNP;
    }

    public void rY(int n) {
        this.eNP = n;
    }

    public void gx(boolean bl) {
        this.eNQ = bl;
    }

    public boolean aUk() {
        return this.eNR;
    }

    public void gy(boolean bl) {
        this.eNR = bl;
        if (this.Initialized && this.atv != null) {
            this.aUl();
        }
    }

    public void c(cte[] cteArray) {
        this.eNS = cteArray;
    }

    public void a(brp[] brpArray) {
        this.eNT = brpArray;
    }

    public void by(double d2) {
        this.eNV = d2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eNU) {
            this.aUm();
        }
    }

    public void d(cte[] cteArray) {
        int n;
        if (this.eNS == null) {
            this.eNS = cteArray;
            return;
        }
        cte[] cteArray2 = new cte[this.eNS.length + cteArray.length];
        int n2 = 0;
        for (n = 0; n < cteArray.length; ++n) {
            cteArray2[n2] = cteArray[n];
            ++n2;
        }
        for (n = 0; n < this.eNS.length; ++n) {
            cteArray2[n2] = this.eNS[n];
            ++n2;
        }
        this.eNS = cteArray2;
    }

    @Override
    public void initialize() {
        assert (this.atv == null);
        assert (this.eNV > 0.0);
        super.initialize();
        this.aJC().asf().dM(true);
        boolean bl = true;
        if (this.eNQ) {
            bl = false;
        } else if (!this.aJC().asf().isEmpty()) {
            bl = false;
        } else if (this.eNS != null) {
            bl = false;
        } else if (this.eNT != null) {
            bl = false;
        }
        if (bl) {
            this.l(1.0);
            this.aUn();
        } else {
            this.l(this.eNV);
            if (this.eNS != null && this.eNS.length > 0) {
                this.b(this.eNS);
            }
            if (this.eNT != null) {
                cte[] cteArray = new cte[this.eNT.length];
                int n = this.eNT.length;
                for (int i = 0; i < n; ++i) {
                    cteArray[i] = new cte();
                    cteArray[i].ResourceType = this.eNT[i].ResourceType;
                    cteArray[i].asi = this.eNT[i].asi;
                }
                this.b(cteArray);
            }
        }
        this.aUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4354: {
                this.a((gvn)dxq2);
                break;
            }
            case 4357: {
                this.a((gvt)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void p(cbx cbx2) {
        super.p(cbx2);
        cnh cnh2 = (cnh)cbx2;
        cnh2.rY(this.eNP);
        cnh2.gx(this.eNQ);
        cnh2.by(this.eNV);
    }

    private void aUl() {
        if (this.atv == null) {
            return;
        }
        if (this.eNQ && !this.eNR) {
            return;
        }
        if (!this.aJC().asf().isEmpty()) {
            return;
        }
        this.aUo();
        this.l(1.0);
        this.aUn();
    }

    private void aUm() {
        assert (this.aJC().asf() != null);
        if (this.aJC().asf().auo().avi()) {
            return;
        }
        this.MessageDelegator.hd(this.aJC().getGUID());
        this.MessageDelegator.hd(this.GUID);
    }

    private void a(gvn gvn2) {
        if (gvn2.atv == null) {
            lfn.b(5, "SFStorageObjectCorpse", "handleTimerCreateResponse() TimerGUID is null.");
            return;
        }
        this.atv = gvn2.atv;
    }

    private void a(gvt gvt2) {
        this.atv = null;
        if (this.aJC() == null) {
            lfn.b(5, "SFStorageObjectCorpse", "handleTimerTimeoutMessage() InventoryManager is null.");
            return;
        }
        if (this.aJC().asf() == null) {
            lfn.b(5, "SFStorageObjectCorpse", "handleTimerTimeoutMessage() Inventory is null.");
            return;
        }
        this.eNU = true;
        if (!this.eNZ) {
            this.aUn();
        }
    }

    private void aUn() {
        this.eNZ = true;
        this.aUr();
        this.aJC().asf().auo().avh();
        this.aUv();
    }

    private void b(cte[] cteArray) {
        assert (cteArray != null);
        assert (cteArray.length > 0);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.bst = bkd.dqO;
        fcy2.aZG = this.GUID;
        fcy2.akX = this.GUID;
        fcy2.dtP = cteArray;
        fcy2.iyH = false;
        fcy2.iJG = true;
        fcy2.b(bqy.dGQ);
        this.MessageDelegator.F(fcy2);
    }

    private void l(double d2) {
        assert (this.atv == null);
        assert (d2 > 0.0);
        gvm gvm2 = (gvm)this.MessageDelegator.h(4353, this.GUID, this.MessageDelegator.getGUID());
        gvm2.gdA = 1;
        gvm2.Rs = this.GUID;
        gvm2.oV = 0.0;
        gvm2.eNV = d2;
        this.MessageDelegator.F(gvm2);
    }

    private void aUo() {
        assert (this.atv != null);
        gvr gvr2 = (gvr)this.MessageDelegator.h(4355, this.GUID, this.MessageDelegator.getGUID());
        gvr2.gdA = 1;
        gvr2.atv = this.atv;
        gvr2.jsw = false;
        this.MessageDelegator.F(gvr2);
        this.atv = null;
    }

    @Override
    public final void c(brp brp2) {
        if (this.eNZ) {
            this.eNZ = false;
            this.aUo();
            this.l(this.eNV);
            this.aJC().asf().auo().avg();
        }
    }

    @Override
    public final void a(brp brp2, int n) {
    }

    @Override
    public final void b(brp brp2, int n) {
    }

    @Override
    public final void d(brp brp2) {
        this.aUq();
        this.aUl();
    }

    public void aUp() {
        if (this.SpecialEffectType == -1) {
            return;
        }
        if (this.aAG() == null) {
            return;
        }
        if (!this.isInitialized()) {
            return;
        }
        if (!(this.aJC() != null && this.aJC().asf() != null && !this.aJC().asf().isEmpty() || this.eNS != null && this.eNS.length != 0)) {
            return;
        }
        this.aUa = this.MessageDelegator.lL(lcr.qEb);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.aUa = this.aUa;
        glh2.SpecialEffectType = this.SpecialEffectType;
        glh2.akX = this.KY();
        glh2.aZD = new ljq(0.0f, 0.0f, 0.0f);
        this.MessageDelegator.F(glh2);
    }

    protected void aUq() {
        if (!this.aJC().asf().isEmpty() || this.aUa == null) {
            return;
        }
        this.aUr();
    }

    protected void aUr() {
        if (this.aUa == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEb);
        glj2.jkV = 1;
        glj2.aUa = this.aUa;
        this.MessageDelegator.F(glj2);
        this.aUa = null;
    }

    public void setSpecialEffectType(int n) {
        this.SpecialEffectType = n;
    }

    public int aUs() {
        return this.eNW;
    }

    public void rZ(int n) {
        this.eNW = n;
    }

    public int aUt() {
        return this.eNX;
    }

    public void sa(int n) {
        this.eNX = n;
    }
}

