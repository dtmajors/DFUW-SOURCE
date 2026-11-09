/*
 * Decompiled with CFR.
 */
public class bwd
extends bwf {
    private boolean dUw = false;
    private ldv dUx = null;
    private int dUy = 5;
    private boolean dUz = false;
    private ldv dUA = null;
    private boolean dUB = false;
    private ldv dUC = null;
    private lgj dUD = null;
    private int dUE = 0;

    public bwd(bwi bwi2) {
        super(bwi2);
    }

    public void eN(boolean bl) {
        this.dUw = bl;
    }

    public void eO(boolean bl) {
        this.dUz = bl;
    }

    public void eP(boolean bl) {
        this.dUB = bl;
    }

    @Override
    public void aAV() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        super.aAV();
        if (this.dUw) {
            this.aAX();
        }
        if (this.dUz) {
            this.aAZ();
        }
        if (this.dUB) {
            this.aBb();
        }
    }

    @Override
    public void cleanUp() {
        if (this.dUx != null) {
            this.aAY();
        }
        if (this.dUA != null) {
            this.aBa();
        }
        if (this.dUC != null) {
            this.removePhysicsStateSensor();
        }
        super.cleanUp();
    }

    @Override
    public void aAW() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        super.aAW();
        if (this.dUw) {
            this.aAY();
        }
        if (this.dUz) {
            this.aBa();
        }
        if (this.dUB) {
            this.removePhysicsStateSensor();
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 519: {
                this.a((kwm)ktv2);
                break;
            }
            case 518: {
                this.a((kwo)ktv2);
                break;
            }
            case 527: {
                this.a((kwn)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    protected void a(kwr kwr2) {
        khd khd2 = (khd)this.dTw.get(kwr2.dXg());
        if (khd2 == null) {
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() Could not find request " + kwr2.dXg());
            assert (false);
            return;
        }
        int n = khd2.pse;
        if (kwr2.getResult() != 0) {
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() A sensor could not be created: " + kwr2.getResult());
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() RequestType=" + n);
            return;
        }
        switch (n) {
            case 520: {
                this.dTw.remove(kwr2.dXg());
                if (this.dUx != null) {
                    lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() PhysicsMotionStateSensorGUID is already set.");
                    lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() PhysicsMotionStateSensorGUID=" + this.dUx + " EngineGUID=" + kwr2.axa());
                    return;
                }
                this.dUx = kwr2.axa();
                break;
            }
            case 519: {
                this.dTw.remove(kwr2.dXg());
                if (this.dUC != null) {
                    lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() PhysicsStateSensorGUID is already set.");
                    lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() PhysicsStateSensorGUID=" + this.dUC + " EngineGUID=" + kwr2.axa());
                    return;
                }
                this.dUC = kwr2.axa();
                break;
            }
            case 527: {
                this.dTw.remove(kwr2.dXg());
                if (this.dUA != null) {
                    lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() PhysicsMovementSensorGUID is already set.");
                    lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handleSensorResponse() PhysicsMovementSensorGUID=" + this.dUA + " EngineGUID=" + kwr2.axa());
                    return;
                }
                this.dUA = kwr2.axa();
                break;
            }
            default: {
                super.a(kwr2);
            }
        }
    }

    private void aAX() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUx == null);
        kpi kpi2 = (kpi)this.MessageDelegator.h(520);
        kpi2.ts(this.GUID);
        kpi2.aab(1);
        kpi2.aac(1);
        kpi2.lQ(true);
        kpi2.sy(this.dUH);
        kpi2.wD(true);
        kpi2.hK(this.dUH);
        kpi2.mJ(0.0f);
        kpi2.zP(this.dUy);
        this.MessageDelegator.a(kpi2);
        this.dTw.put(kpi2.GUID, kpi2);
    }

    private void a(kwm kwm2) {
        if (this.dUx == null) {
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handlePhysicsStateSensorResponse() Received sensorresponse from unknown physicsmotionstatesensor.");
            return;
        }
        this.dUy = kwm2.bkF();
        --this.dUy;
        kpi kpi2 = (kpi)this.MessageDelegator.h(520);
        kpi2.aab(4);
        kpi2.ts(this.GUID);
        kpi2.sy(this.dUx);
        kpi2.hK(this.dUH);
        this.MessageDelegator.a(kpi2);
        ((bwi)this.dUG).aZ(kwm2.Up());
    }

    private void aAY() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUx != null);
        kpi kpi2 = (kpi)this.MessageDelegator.h(520);
        kpi2.ts(this.GUID);
        kpi2.aab(2);
        kpi2.aac(1);
        kpi2.sy(this.dUx);
        kpi2.hK(this.dUH);
        this.MessageDelegator.a(kpi2);
        this.dUx = null;
        this.dUy = 5;
    }

    private void aAZ() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUA == null);
        kpj kpj2 = (kpj)this.MessageDelegator.h(527);
        kpj2.ts(this.GUID);
        kpj2.aad(1);
        kpj2.lQ(true);
        kpj2.sy(this.dUH);
        kpj2.wD(true);
        kpj2.hK(this.dUH);
        kpj2.zP(100);
        this.MessageDelegator.a(kpj2);
        this.dTw.put(kpj2.GUID, kpj2);
    }

    private void a(kwn kwn2) {
        if (this.dUA == null) {
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handlePhysicsMovementSensorResponse() Received sensorresponse from unknown physicsmovementsensor.");
            return;
        }
        assert (this.dUH != null);
        lgj lgj2 = new lgj(kwn2.edj(), kwn2.edi(), kwn2.aw(), kwn2.ehL());
        if (this.dUD != null) {
            if (this.dUD.eqJ().equals(lgj2.eqJ()) && this.dUD.eqK().equals(lgj2.eqK())) {
                if (this.dUE > 3) {
                    return;
                }
                ++this.dUE;
                if (this.dUE == 3) {
                    lgj2 = new lgj(kwn2.edj(), kwn2.edi(), kwn2.aw(), true);
                }
            } else {
                this.dUE = 0;
                this.dUD = lgj2;
            }
        } else {
            this.dUE = 0;
            this.dUD = lgj2;
        }
        ((bwi)this.dUG).b(lgj2);
    }

    private void aBa() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUA != null);
        kpj kpj2 = (kpj)this.MessageDelegator.h(527);
        kpj2.ts(this.GUID);
        kpj2.aad(2);
        kpj2.sy(this.dUA);
        kpj2.hK(this.dUH);
        this.MessageDelegator.a(kpj2);
        this.dUA = null;
    }

    private void aBb() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUC == null);
        kpk kpk2 = (kpk)this.MessageDelegator.h(519);
        kpk2.ts(this.GUID);
        kpk2.aae(1);
        kpk2.aaf(1);
        kpk2.lQ(true);
        kpk2.sy(this.dUH);
        kpk2.wD(true);
        kpk2.hK(this.dUH);
        this.MessageDelegator.a(kpk2);
        this.dTw.put(kpk2.GUID, kpk2);
    }

    private void a(kwo kwo2) {
        if (this.dUC == null) {
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handlePhysicsStateSensorResponse() Received sensorresponse from unknown physicsstatesensor.");
            return;
        }
        if (kwo2.edp != 0 && kwo2.edq <= 0) {
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handlePhysicsStateSensorResponse() WaterContactResourceType is invalid.");
            return;
        }
        if (kwo2.edr == null) {
            lfn.b(5, "SFMeshObjectExtensiveSensorManager", "handlePhysicsStateSensorResponse() ContactResourceTypes array is null.");
            return;
        }
        assert (this.dUH != null);
        bzc bzc2 = new bzc();
        bzc2.QM = this.MessageDelegator.arc().rgz;
        bzc2.edl = kwo2.edl;
        bzc2.edm = kwo2.edm;
        bzc2.edn = kwo2.edn;
        bzc2.edo = kwo2.edo;
        bzc2.edp = kwo2.edp;
        bzc2.edq = kwo2.edq;
        bzc2.edr = kwo2.edr;
        bzc2.eds = kwo2.eds;
        ((bwi)this.dUG).a(bzc2);
    }

    private void removePhysicsStateSensor() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUC != null);
        kpk kpk2 = (kpk)this.MessageDelegator.h(519);
        kpk2.ts(this.GUID);
        kpk2.aae(2);
        kpk2.aaf(1);
        kpk2.sy(this.dUC);
        kpk2.hK(this.dUH);
        this.MessageDelegator.a(kpk2);
        this.dUC = null;
    }
}

