/*
 * Decompiled with CFR.
 */
public class bvm
extends bvd
implements bwi {
    private boolean dQm = false;
    private bwf dQM = null;
    private bwk dTk = null;

    public bvm(bve.a a2) {
        super(a2);
    }

    @Override
    public final boolean ayZ() {
        return this.dQm;
    }

    public final bwf azx() {
        return this.dQM;
    }

    public final bwk aAj() {
        return this.dTk;
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            if (this.dQM != null) {
                this.MessageDelegator.hd(this.dQM.getGUID());
            }
            if (this.dTk != null) {
                this.MessageDelegator.hd(this.dTk.getGUID());
            }
            super.cleanUp();
        }
    }

    @Override
    public final boolean isServerObject() {
        return false;
    }

    @Override
    public final void aZ(ljq ljq2) {
        if (this.Qg == null) {
            lfn.b(5, "SFMeshObjectClient", "notifyPhysicsMotionStateUpdated() PhysicalObject is null for meshobject " + this.GUID);
            lfn.b(5, "SFMeshObjectClient", "notifyPhysicsMotionStateUpdated() " + this.toString());
            return;
        }
        this.Qg.aZ(ljq2);
    }

    @Override
    public final void b(lgj lgj2) {
        if (this.Qg == null) {
            lfn.b(5, "SFMeshObjectClient", "notifyPhysicsMovementUpdated() PhysicalObject is null for meshobject " + this.GUID);
            lfn.b(5, "SFMeshObjectClient", "notifyPhysicsMovementUpdated() " + this.toString());
            return;
        }
        this.Qg.f(lgj2);
    }

    @Override
    public final void a(bzc bzc2) {
        if (this.Qg == null) {
            lfn.b(5, "SFMeshObjectClient", "notifyPhysicsStateUpdated() PhysicalObject is null for meshobject " + this.GUID);
            lfn.b(5, "SFMeshObjectClient", "notifyPhysicsStateUpdated() " + this.toString());
            return;
        }
        this.Qg.a(bzc2);
    }

    @Override
    public final void h(ljq ljq2, lgl lgl2) {
        assert (ljq2 != null);
        assert (lgl2 != null);
        this.Position = ljq2;
        this.Rotation = lgl2;
        if (this.Qg != null) {
            this.Qg.l(this.av(), this.aw());
        }
    }

    @Override
    protected void azh() {
        assert (this.GUID != null);
        assert (this.dJs == null);
        assert (this.Position != null);
        assert (this.Rotation != null);
        this.dJs = this.GUID;
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        krr2.aaA(4);
        krr2.hC(this.dJs);
        krr2.ts(this.GUID);
        krr2.xc(this.FileName);
        krr2.xC(true);
        krr2.xe("");
        krr2.xd("");
        krr2.c(this.Position);
        krr2.a(this.Rotation);
        krr2.setObjectType(this.ResourceType);
        krr2.xD(true);
        this.MessageDelegator.a(krr2);
    }

    @Override
    protected void azj() {
        this.dQm = true;
        switch (this.dQn) {
            case dQv: {
                break;
            }
            case dQw: {
                bwd bwd2 = new bwd(this);
                bwd2.setGUID(this.MessageDelegator.bzv());
                bwd2.eN(false);
                bwd2.eO(true);
                bwd2.eP(true);
                bwd2.eQ(true);
                this.dQM = bwd2;
                this.MessageDelegator.a(this.dQM);
                bvz bvz2 = new bvz(this);
                bvz2.setGUID(this.MessageDelegator.bzv());
                bvz2.eG(true);
                bvz2.eI(false);
                this.MessageDelegator.a(bvz2);
                this.dTk = bvz2;
                this.dTk.aAz();
                break;
            }
            case dQx: 
            case dQC: 
            case dQH: {
                break;
            }
            case dQB: {
                this.dQM = new bwf(this);
                this.dQM.eQ(true);
                this.dQM.setGUID(this.MessageDelegator.bzv());
                this.MessageDelegator.a(this.dQM);
                break;
            }
            case dQJ: {
                bwd bwd3 = new bwd(this);
                bwd3.setGUID(this.MessageDelegator.bzv());
                bwd3.eN(true);
                bwd3.eO(true);
                bwd3.eP(true);
                bwd3.eQ(true);
                this.dQM = bwd3;
                this.MessageDelegator.a(this.dQM);
                bvz bvz3 = new bvz(this);
                bvz3.setGUID(this.MessageDelegator.bzv());
                bvz3.eG(true);
                bvz3.eI(true);
                this.MessageDelegator.a(bvz3);
                this.dTk = bvz3;
                this.dTk.aAz();
                break;
            }
            default: {
                lfn.b(5, "SFMeshObjectClient", "configureMeshObject() Invalid meshtype provided: " + (Object)((Object)this.dQn));
                return;
            }
        }
    }

    @Override
    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 5: {
                this.c(((uj)uk2).aWo);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    private void c(lgj lgj2) {
        if (!bve.b(this.dQn)) {
            return;
        }
        if (!this.dQm) {
            return;
        }
        if (this.dTk == null) {
            lfn.b(5, "SFMeshObjectClient", "handlePositionalData() StreamControllerManager is null. MeshType=" + (Object)((Object)this.dQn));
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

