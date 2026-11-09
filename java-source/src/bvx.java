/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class bvx
extends bwk {
    private Map<ldv, khd> dTw = lcn.emw();
    private boolean dTx = true;
    private boolean dTy = false;
    private ljq dTz = null;
    private ljq dTA = null;
    private lgl dTB = null;
    private lgl dTC = null;
    private double oV = 0.0;
    private double aAh = 0.0;
    private int dTD = 0;

    public bvx(bvd bvd2) {
        super(bvd2);
    }

    public boolean aAq() {
        return this.dTx;
    }

    public void eG(boolean bl) {
        this.dTx = bl;
    }

    public boolean aAr() {
        return this.dTy;
    }

    public void eH(boolean bl) {
        this.dTy = bl;
    }

    public ljq aAs() {
        return this.dTz;
    }

    public void ba(ljq ljq2) {
        this.dTz = ljq2;
    }

    public ljq aAt() {
        return this.dTA;
    }

    public void bb(ljq ljq2) {
        this.dTA = ljq2;
    }

    public lgl aAu() {
        return this.dTB;
    }

    public void j(lgl lgl2) {
        this.dTB = lgl2;
    }

    public lgl aAv() {
        return this.dTC;
    }

    public void k(lgl lgl2) {
        this.dTC = lgl2;
    }

    public double aAw() {
        return this.oV;
    }

    public void o(double d2) {
        this.oV = d2;
    }

    public double aAx() {
        return this.aAh;
    }

    public void be(double d2) {
        this.aAh = d2;
    }

    public int getInterpolationType() {
        return this.dTD;
    }

    public void setInterpolationType(int n) {
        this.dTD = n;
    }

    @Override
    public void aAy() {
        assert (this.Uk != null);
        assert (this.Uk.axa() != null);
        assert (this.dVj != null);
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.Zf(8);
        kmj2.ts(this.GUID);
        kmj2.hC(this.Uk.axa());
        kmj2.tE(this.dVj);
        this.MessageDelegator.a(kmj2);
    }

    @Override
    public void aAz() {
        assert (this.Uk != null);
        assert (this.Uk.axa() != null);
        assert (this.dVj == null);
        klz klz2 = (klz)this.MessageDelegator.h(3348);
        klz2.ts(this.GUID);
        klz2.lQ(true);
        klz2.xe(true);
        klz2.wD(true);
        klz2.hC(this.Uk.axa());
        klz2.xd(this.dTx);
        if (!this.dTy) {
            klz2.setType(33);
        } else {
            klz2.setType(97);
            klz2.Zc(this.dTD);
            klz2.dq(this.dTz);
            klz2.S(this.dTB);
            klz2.dN(this.oV);
            klz2.dr(this.dTA);
            klz2.T(this.dTC);
            klz2.dO(this.aAh);
        }
        this.MessageDelegator.a(klz2);
        this.dTw.put(klz2.GUID, klz2);
    }

    @Override
    public void aAA() {
        assert (this.Uk != null);
        assert (this.Uk.axa() != null);
        assert (this.dVj != null);
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.Zf(16);
        kmj2.ts(this.GUID);
        kmj2.hC(this.Uk.axa());
        kmj2.tE(this.dVj);
        this.MessageDelegator.a(kmj2);
    }

    @Override
    public final void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5376: {
                this.a((kvl)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void aAB() {
        assert (this.Uk != null);
        assert (this.dVj != null);
        klz klz2 = (klz)this.MessageDelegator.h(3348);
        klz2.ts(this.GUID);
        klz2.setType(2);
        klz2.hC(this.dVj);
        this.MessageDelegator.a(klz2);
        this.dVj = null;
    }

    @Override
    public final void d(lgj lgj2) {
        assert (this.Uk != null);
        assert (lgj2 != null);
        if (this.dVj == null) {
            return;
        }
        kma kma2 = (kma)this.MessageDelegator.h(3349);
        kma2.ts(this.GUID);
        kma2.hC(this.dVj);
        kma2.aZa = lgj2.aZa;
        kma2.pKV = lgj2.eqJ();
        kma2.Rotation = lgj2.eqK();
        kma2.pLf = lgj2.aZb;
        this.MessageDelegator.a(kma2);
    }

    @Override
    public void e(lgj lgj2) {
        assert (this.Uk != null);
        assert (lgj2 != null);
        if (this.dVj == null) {
            return;
        }
        klz klz2 = (klz)this.MessageDelegator.h(3348);
        klz2.ts(this.GUID);
        klz2.setType(8);
        klz2.hC(this.dVj);
        klz2.Za(lgj2.aZa);
        klz2.a(lgj2.eqJ());
        klz2.a(lgj2.eqK());
        this.MessageDelegator.a(klz2);
    }

    private void a(kvl kvl2) {
        khd khd2 = this.dTw.remove(kvl2.dXg());
        if (khd2 == null) {
            return;
        }
        if (kvl2.getResult() != 0) {
            if (this.dVj == null) {
                // empty if block
            }
            return;
        }
        switch (khd2.bUV()) {
            case 3348: {
                if (this.dVj != null) {
                    return;
                }
                this.dVj = kvl2.axa();
                this.aAy();
                break;
            }
            default: {
                return;
            }
        }
    }
}

