/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class bws
extends bwq {
    private ldv dWP = null;
    private int bip = 0;
    private int aYH = 0;
    private float duq = 0.0f;
    private boolean dWQ = false;
    private boolean dWR = false;
    private final Map<ldv, a> dWS = lcn.emw();
    private final List<ldv> dWT = lcn.emv();

    public bws() {
        super(true);
    }

    public void kb(ldv ldv2) {
        this.dWP = ldv2;
    }

    public int Be() {
        return this.bip;
    }

    public void fe(int n) {
        this.bip = n;
    }

    public void gf(int n) {
        this.aYH = n;
    }

    public void dE(float f2) {
        this.duq = f2;
    }

    public float aCA() {
        return this.duq;
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (this.dWK != null);
        if (this.dWK.aCk()) {
            this.ka(null);
        } else {
            this.createVelocityAutoTimer(null);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(fuu fuu2) {
        assert (fuu2 != null);
        a a2 = this.dWS.remove(fuu2.aO());
        if (a2 == null) {
            assert (false);
            return;
        }
        if (fuu2.dtj == null) {
            a2.setTargetObjectGUID(lcr.qEk);
        } else {
            a2.setTargetObjectGUID(fuu2.dtj);
        }
        if (this.dWK.aCu()) {
            this.selfDestruct();
        }
        boolean bl = false;
        if (this.dWS.isEmpty() && this.dWR) {
            bl = true;
        }
        this.b(2, a2, bl);
        if (this.dWS.isEmpty() && this.dWR) {
            this.selfDestruct();
        }
    }

    private void c(gre gre2) {
        lfn.b(5, "SFMissileObjectServer", "handleSystemMessageSendErrorMessage() A message was not received.");
        this.b(3, new a(this), true);
        this.selfDestruct();
    }

    @Override
    protected void a(kxd kxd2) {
        assert (this.dWP != null);
        assert (this.dWK.aCk());
        boolean bl = this.dWK.zg() == cxd.fHN || this.dWK.zg() == cxd.fHO;
        a a2 = new a(this);
        a2.a(cxd.f.getHitLocationTypeForHitLocation(kxd2.ehY()));
        a2.setSourcePosition(kxd2.getSourcePosition());
        a2.kd(kxd2.oq());
        a2.ke(kxd2.sV());
        a2.setTargetPosition(kxd2.av());
        a2.nB(kxd2.az());
        if (kxd2.ehZ()) {
            this.dWQ = true;
            if (lcw.enb() && a2.aCC() != null && a2.aCC().ib() != 3 && !a2.aCC().equals(lcr.qAC)) {
                a2.ke(lcr.ak((ldv)a2.aCC(), (int)3));
            }
            if (a2.aCC().equals(lcr.qAC)) {
                a2.setTargetObjectGUID(lcr.qEk);
                a2.ke(a2.aCB());
                this.b(2, a2, true);
                this.a(1, a2, bl);
                this.selfDestruct();
            } else {
                this.a(1, a2, bl);
                this.kc(a2.aCC());
                this.dWS.put(a2.aCC(), a2);
            }
            return;
        }
        if (kxd2.eia()) {
            if (this.dWQ) {
                return;
            }
            this.b(3, a2, true);
            a2.setTargetPosition(kxd2.av());
            this.a(2, a2, bl);
        } else {
            lfn.b(5, "SFMissileObjectServer", "handlePhysicsVelocityAutoTimerResponse() Wrong flags in request. HasHit=false && MaxDistanceTravelled=false.");
            this.b(3, a2, true);
        }
        this.selfDestruct();
    }

    @Override
    protected void a(kxe kxe2) {
        if (kxe2.getResult() != 0) {
            lfn.b(5, "SFMissileObjectServer", "handleTimerResponse() AutoTimer could not be created: " + kxe2.getResult());
            this.b(1, new a(this), true);
            this.selfDestruct();
            return;
        }
        this.dWJ = kxe2.axa();
    }

    @Override
    protected void a(kxf kxf2) {
        assert (this.dWP != null);
        assert (!this.dWK.aCk());
        if (this.dWT.contains(kxf2.sV())) {
            return;
        }
        boolean bl = this.dWK.zg() == cxd.fHN || this.dWK.zg() == cxd.fHO;
        a a2 = new a(this);
        a2.a(cxd.f.getHitLocationTypeForHitLocation(kxf2.ehY()));
        a2.setSourcePosition(kxf2.getSourcePosition());
        a2.kd(kxf2.oq());
        a2.ke(kxf2.sV());
        a2.setTargetPosition(kxf2.av());
        a2.nB(kxf2.az());
        if (kxf2.ehZ()) {
            if (a2.aCC().equals(lcr.qAC) || !this.dWK.aCu() && !cug.vJ((int)a2.aCE())) {
                a2.setTargetObjectGUID(lcr.qEk);
                a2.ke(a2.aCB());
                this.a(1, a2, bl);
                if (!this.dWS.isEmpty()) {
                    this.b(2, a2, false);
                    this.dWR = true;
                    return;
                }
                this.b(2, a2, true);
                this.selfDestruct();
            } else {
                this.a(1, a2, bl);
                this.kc(a2.aCC());
                this.dWS.put(a2.aCC(), a2);
                this.dWT.add(a2.aCC());
            }
            return;
        }
        if (kxf2.eia()) {
            if (this.dWK.aCu() && this.dWQ) {
                return;
            }
            if (this.dWS.isEmpty()) {
                this.b(3, a2, true);
            }
            a2.setTargetPosition(kxf2.av());
            this.a(2, a2, bl);
        } else {
            lfn.b(5, "SFMissileObjectServer", "handleVelocityAutoTimerResponse() Wrong flags in request. HasHit=false && MaxDistanceTravelled=false.");
            this.b(3, a2, true);
            assert (false);
        }
        if (!this.dWS.isEmpty()) {
            this.dWR = true;
            return;
        }
        this.selfDestruct();
    }

    private void b(int n, a a2, boolean bl) {
        assert (this.dWP != null);
        frf frf2 = (frf)this.MessageDelegator.h(14081, this.GUID, this.dWP);
        frf2.ipI = n;
        frf2.biq = this.aCv();
        frf2.aYH = this.aYH;
        frf2.geu = bl;
        switch (n) {
            case 1: 
            case 3: {
                break;
            }
            case 2: {
                frf2.aZH = a2.getSourcePosition();
                frf2.dtj = a2.getTargetObjectGUID();
                frf2.Ui = a2.aCC();
                frf2.ResourceType = a2.aCE();
                frf2.aZD = a2.getTargetPosition();
                frf2.biu = this.getPower();
                frf2.duq = this.aCA();
                frf2.a(a2.aCD());
                break;
            }
            default: {
                lfn.b(5, "SFMissileObjectServer", "sendMissileNotificationMessage() Invalid notificationtype provided: " + n);
                return;
            }
        }
        this.MessageDelegator.F(frf2);
    }

    private void kc(ldv ldv2) {
        assert (ldv2 != null);
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, ldv2);
        fut2.iXt = 1;
        fut2.hsP = true;
        this.MessageDelegator.F(fut2);
    }
}

