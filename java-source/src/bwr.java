/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class bwr
extends bwq {
    private ldv aUa = null;
    private ldv dWN = null;
    private boolean dWO = false;

    public bwr() {
        super(false);
    }

    @Override
    public void cleanUp() {
        assert (this.dWK != null);
        super.cleanUp();
        if (this.aUa != null) {
            this.cx(this.aUa);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (this.dWK != null);
        if (!this.dWK.nz(3)) {
            lfn.b(5, "SFMissileObjectClient", "initialize() Missile '" + this.dWK.getName() + "' needs neither a specialeffect nore a resource.");
            assert (false);
            this.selfDestruct();
            return;
        }
        int n = this.dWK.aCs();
        assert (n > 0);
        this.dWI |= 2;
        this.dWI |= 4;
        this.aUa = this.MessageDelegator.lL(lcr.qEa);
        this.a(n, this.aUa, true, null);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                gsl gsl2 = (gsl)dxq2;
                this.c(gsl2.joY);
                break;
            }
            case 13059: {
                this.b((glb)dxq2);
                break;
            }
            case 1027: {
                this.handleObjectRemoveMessage((fub)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void handleObjectRemoveMessage(fub fub2) {
        if (!fub2.aO().equals(lcr.qzp)) {
            lfn.b(5, "SFMissileObjectClient", "handleObjectRemoveMessage() Object " + fub2.aO() + " wanted to remove missile " + this.GUID);
            return;
        }
        this.dWO = true;
        if (this.dWL || this.dWJ != null || lcw.emZ()) {
            this.fe(true);
        }
    }

    @Override
    protected void a(kxd kxd2) {
        assert (this.dWK.aCk());
        if (!kxd2.ehZ() && !kxd2.eia()) {
            lfn.b(5, "SFMissileObjectClient", "handlePhysicsVelocityAutoTimerResponse() Wrong flags in request. HasHit=false && MaxDistanceTravelled=false.");
        }
        this.fe(false);
    }

    @Override
    protected void a(kxe kxe2) {
        if (kxe2.getResult() != 0) {
            lfn.b(5, "SFMissileObjectClient", "handleTimerResponse() AutoTimer could not be created: " + kxe2.getResult());
            this.fe(true);
            return;
        }
        this.dWJ = kxe2.axa();
        if (this.dWO) {
            this.fe(true);
        }
    }

    @Override
    protected void a(kxf kxf2) {
        assert (!this.dWK.aCk());
        if (!kxf2.ehZ() && !kxf2.eia()) {
            lfn.b(5, "SFMissileObjectClient", "handleVelocityAutoTimerResponse() Wrong flags in request. HasHit=false && MaxDistanceTravelled=false.");
        }
        if (this.dWK.aCu() || this.dWO) {
            this.fe(false);
        }
    }

    private void fe(boolean bl) {
        if (this.dWJ != null) {
            if (this.dWK.aCk()) {
                this.aCy();
            } else {
                this.aCz();
            }
        }
        if (this.aUa != null) {
            this.cx(this.aUa);
            this.aUa = null;
        }
        if (bl) {
            this.selfDestruct();
        }
    }

    private void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                this.ff(((uh)uk2).PC);
                break;
            }
            case 2: {
                this.c(((uq)uk2).Qi);
                break;
            }
            case 3: {
                this.a(((um)uk2).aXj);
                break;
            }
            case 4: {
                this.v(((ud)uk2).Pq);
                break;
            }
            case 5: {
                this.setStartDirection(((uq)uk2).Qi);
                break;
            }
            case 6: {
                this.ab(((ue)uk2).Pz);
                break;
            }
            case 7: {
                this.setPower(((ue)uk2).Pz);
                break;
            }
            case 8: {
                this.ac(((ue)uk2).Pz);
                break;
            }
            case 9: {
                this.c(((uf)uk2).aWm);
                break;
            }
            case 10: {
                this.ad(((ue)uk2).Pz);
                break;
            }
            case 11: {
                this.ae(((ue)uk2).Pz);
                break;
            }
            default: {
                lfn.b(5, "SFMissileObjectClient", "handlePropertyUpdate() Invalid PropertyUpdate received: " + uk2.getClass().getName());
                assert (false);
                break;
            }
        }
    }

    private void b(glb glb2) {
        if (glb2.gxp == null) {
            String string = del.zU(this.dWK.aCs());
            lfn.b(5, "SFMissileObjectClient", "handleSpecialEffectGUIDMessage() MainObjectGUID is null for specialeffect '" + string + "'");
            return;
        }
        this.dWN = glb2.gxp;
        if (this.dWO) {
            assert (this.aUa != null);
            assert (this.dWN != null);
            this.fe(true);
            return;
        }
        if (this.dWK.aCk()) {
            this.ka(this.dWN);
        } else {
            this.createVelocityAutoTimer(this.dWN);
        }
    }

    private void c(uk[] ukArray) {
        if (ukArray == null) {
            lfn.b(5, "SFMissileObjectClient", "handleSubscriptionEvent() PropertyUpdates is null for object " + this.GUID);
            return;
        }
        int n = ukArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(ukArray[i]);
        }
    }

    private void cx(ldv ldv2) {
        assert (ldv2 != null);
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.MessageDelegator.F(glj2);
    }
}

