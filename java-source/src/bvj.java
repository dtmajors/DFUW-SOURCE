/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cug
 */
public class bvj
extends bvf {
    private bwk dTk = null;

    public bvj(bve.a a2) {
        super(a2);
    }

    public final bwk aAj() {
        return this.dTk;
    }

    public void cleanUp() {
        if (this.dTk != null) {
            this.MessageDelegator.hd(this.dTk.getGUID());
        }
        super.cleanUp();
    }

    protected void azj() {
        this.dQm = true;
        switch (this.dQn) {
            case dQy: 
            case dQz: {
                bvz bvz2 = new bvz((bvd)((Object)this));
                bvz2.setGUID(this.MessageDelegator.bzv());
                bvz2.eG(false);
                bvz2.eI(false);
                bvz2.dp(30.0f);
                bvz2.dq(12.0f);
                this.MessageDelegator.a(bvz2);
                this.dTk = bvz2;
                this.dTk.aAz();
                break;
            }
            case dQA: {
                bvz bvz3 = new bvz((bvd)((Object)this));
                bvz3.setGUID(this.MessageDelegator.bzv());
                bvz3.eG(false);
                bvz3.eI(true);
                this.MessageDelegator.a(bvz3);
                this.dTk = bvz3;
                this.dTk.aAz();
                break;
            }
            case dQE: {
                bwd bwd2 = new bwd((bwi)((Object)this));
                bwd2.setGUID(this.MessageDelegator.bzv());
                bwd2.eN(true);
                bwd2.eO(true);
                bwd2.eP(true);
                bwd2.eQ(true);
                this.dQM = bwd2;
                this.MessageDelegator.a(this.dQM);
                bvz bvz4 = new bvz((bvd)((Object)this));
                bvz4.setGUID(this.MessageDelegator.bzv());
                bvz4.eG(false);
                bvz4.eI(true);
                this.MessageDelegator.a(bvz4);
                this.dTk = bvz4;
                this.dTk.aAz();
                break;
            }
            case dQF: {
                bwd bwd3 = new bwd((bwi)((Object)this));
                bwd3.setGUID(this.MessageDelegator.bzv());
                bwd3.eN(true);
                bwd3.eO(true);
                bwd3.eP(true);
                bwd3.eQ(true);
                this.dQM = bwd3;
                this.MessageDelegator.a(this.dQM);
                bwd3.aAV();
                boolean bl = true;
                if (cug.vX((int)this.ResourceType)) {
                    bl = false;
                }
                bvz bvz5 = new bvz((bvd)((Object)this));
                bvz5.setGUID(this.MessageDelegator.bzv());
                bvz5.eG(false);
                bvz5.eI(bl);
                this.MessageDelegator.a(bvz5);
                this.dTk = bvz5;
                this.dTk.aAz();
                break;
            }
            case dQK: {
                bvz bvz6 = new bvz((bvd)((Object)this));
                bvz6.setGUID(this.MessageDelegator.bzv());
                bvz6.eG(false);
                bvz6.eI(false);
                bvz6.eJ(true);
                bvz6.dm(0.8f);
                bvz6.dn(1.6f);
                bvz6.do(0.0f);
                this.MessageDelegator.a(bvz6);
                this.dTk = bvz6;
                this.dTk.aAz();
                break;
            }
            default: {
                super.azj();
            }
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 5: {
                this.c(((uj)uk2).aWo);
                break;
            }
            case 6: {
                this.cx(((uo)uk2).Value);
                break;
            }
            case 7: {
                this.a(((ty)uk2).aWi);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    public void c(lgj lgj2) {
        if (!bve.b(this.dQn)) {
            return;
        }
        if (!this.dQm) {
            return;
        }
        if (this.dTk == null) {
            lfn.b(5, "SFAnimatedMeshObjectStreamingClient", "handlePositionalData() StreamControllerManager is null. MeshType=" + (Object)((Object)this.dQn));
            return;
        }
        assert (lgj2 != null);
        if (lgj2.aZb) {
            this.dTk.d(lgj2);
        } else {
            this.dTk.e(lgj2);
        }
        this.aX(lgj2.eqI());
        this.h(lgj2.eqK());
        if (this.Qg != null) {
            this.Qg.l(this.av(), this.aw());
        }
    }
}

