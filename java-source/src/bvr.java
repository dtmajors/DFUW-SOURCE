/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class bvr
extends bvc {
    private final bwh dTq = null;
    private kli dTr = null;
    private int dTs = -1;
    public a dTt = null;

    public final void a(a a2) {
        this.dTt = a2;
    }

    public bvr(bve.a a2) {
        super(a2);
        switch (this.dQn) {
            case dQu: 
            case dQv: 
            case dQy: 
            case dQz: {
                break;
            }
            case dQA: {
                this.dTr = bwg.aBf();
                break;
            }
            case dQE: {
                this.dTr = bwg.aBg();
                break;
            }
            case dQF: {
                this.dTr = bwg.aBf();
                break;
            }
            case dQI: 
            case dQK: {
                break;
            }
            default: {
                lfn.b(5, "SFAnimatedMeshObjectServer", "SFAnimatedMeshObjectServer() Invalid meshtype provided: " + (Object)((Object)this.dQn));
                return;
            }
        }
    }

    public void aAk() {
        this.dTr = bwg.aBh();
    }

    public final bwh aAl() {
        return this.dTq;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.dQm && this.dTq != null) {
            this.aAn();
        }
    }

    @Override
    public final boolean isServerObject() {
        return true;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7425: {
                this.b((dzv)dxq2);
                break;
            }
            case 7426: {
                this.b((dzw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void i(lgl lgl2) {
        assert (this.dTr != null);
        ljq ljq2 = new ljq(0.0f, 0.0f, 1.0f);
        ljq ljq3 = lgl.a(lgl2, ljq2);
        ljq3.normalize();
        this.dTr.bg(ljq3);
    }

    @Override
    protected void azh() {
        switch (this.dQn) {
            case dQu: 
            case dQv: {
                this.azX();
                break;
            }
            case dQy: 
            case dQz: {
                this.azX();
                break;
            }
            case dQA: {
                this.aAm();
                break;
            }
            case dQE: {
                this.aAm();
                break;
            }
            case dQF: {
                this.aAm();
                break;
            }
            case dQI: {
                this.azX();
                break;
            }
            case dQK: {
                this.azX();
                break;
            }
            default: {
                lfn.b(5, "SFAnimatedMeshObjectServer", "assembleMeshObject() Invalid meshtype provided: " + (Object)((Object)this.dQn));
                return;
            }
        }
    }

    @Override
    protected void azj() {
        this.dQm = true;
        if (this.dTq != null) {
            this.MessageDelegator.hd(this.dTq.getGUID());
        }
        if (lcw.enb()) {
            this.eq(false);
        }
    }

    @Override
    protected void azk() {
        if (this.dTq == null) {
            this.azj();
            this.azi();
        } else {
            this.dTq.setGUID(this.MessageDelegator.bzv());
            this.dTq.jY(this.axa());
            this.dTq.jZ(this.getGUID());
            this.dTq.bf(this.Position);
            this.dTq.d(this.Rotation);
            this.dTq.setObjectType(this.ResourceType);
            this.MessageDelegator.a(this.dTq);
            this.dTq.aBl();
        }
    }

    @Override
    protected final void a(kuu kuu2) {
        if (!kuu2.qeh) {
            lfn.b(5, "SFAnimatedMeshObjectServer", "handleObjectMoveToValidParkingPositionResponse() Parking failed for " + this.toString());
            return;
        }
        this.Position = kuu2.qei;
        this.Rotation = kuu2.qej;
    }

    private void azX() {
        assert (this.GUID != null);
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        if (this.dJs == null) {
            krr2.aaA(8);
        } else {
            krr2.aaA(4);
            krr2.hC(this.dJs);
        }
        krr2.ts(this.GUID);
        krr2.xc(this.FileName);
        krr2.xC(true);
        krr2.xe("");
        krr2.xd("");
        krr2.c(this.Position);
        krr2.a(this.Rotation);
        krr2.setObjectType(this.ResourceType);
        this.MessageDelegator.a(krr2);
    }

    private void aAm() {
        float f2;
        assert (this.GUID != null);
        krs krs2 = (krs)this.MessageDelegator.j(10);
        krs2.aaB(1);
        if (this.dJs == null) {
            krs2.hC(this.getGUID());
            krs2.aaC(32);
        } else {
            krs2.aaC(16);
            krs2.hC(this.dJs);
        }
        this.dTr.c(this.Position);
        this.dTr.a(this.Rotation);
        if (this.Qg != null && this.Qg instanceof cdw && (f2 = ((cdw)this.Qg).mr()) > 0.0f) {
            this.dTr.setRadius(f2);
        }
        krs2.ts(this.GUID);
        krs2.xc(this.FileName);
        krs2.xC(true);
        krs2.xe("");
        krs2.xd("");
        krs2.b(this.dTr);
        this.MessageDelegator.a(krs2);
    }

    private void aAn() {
        assert (!this.dQm);
        assert (this.dTq != null);
        if (!this.dTq.aBs() && this.dTq.aBm() && this.dTq.aBo()) {
            this.Position = this.dTq.aBp();
            this.Rotation = this.dTq.aBq();
            this.dTq.eT(true);
            this.azj();
            this.azi();
        }
    }

    private void b(dzv dzv2) {
        gxz gxz2 = (gxz)this.MessageDelegator.h(12033, this.GUID, lcr.qAI);
        gxz2.ija = 1;
        gxz2.aWe = dzv2.dTs;
        gxz2.aWf = dzv2.aWf;
        gxz2.aWh = false;
        this.MessageDelegator.F(gxz2);
        this.dTs = dzv2.dTs;
        if (this.dTt != null) {
            this.dTt.nm(dzv2.dTs);
        }
    }

    private void b(dzw dzw2) {
        gxz gxz2 = (gxz)this.MessageDelegator.h(12033, this.GUID, lcr.qAI);
        gxz2.ija = 1;
        gxz2.aWe = dzw2.ijH;
        gxz2.aWf = 0.0f;
        gxz2.aWh = true;
        this.MessageDelegator.F(gxz2);
    }

    public final int aAo() {
        return this.dTs;
    }
}

