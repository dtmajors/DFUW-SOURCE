/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class cys
extends cyq {
    private final float fYp = 4.0f;
    private ljq fYq = new ljq(0.0f, 0.2f, 0.0f);
    private Map<Integer, gjl> fYr = lcn.emw();
    private Map<Integer, gjl> fYs = lcn.emw();
    private static final int fYt = 65535;
    private static final int fYu = Integer.MAX_VALUE;
    private int Qs = 0;
    private int fYv = 65535;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4622: {
                this.a((gje)dxq2);
                break;
            }
            case 4623: {
                this.a((gjd)dxq2);
                break;
            }
            case 4621: {
                this.a((gjf)dxq2);
                break;
            }
            case 5636: {
                this.d((fuu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        if (gre2.jqd == -1) {
            return;
        }
        gjl gjl2 = this.fYr.remove(gre2.jqd);
        if (gjl2 != null) {
            return;
        }
        gjl2 = this.fYs.remove(gre2.jqd);
        if (gjl2 == null) {
            return;
        }
    }

    private void d(fuu fuu2) {
        assert (fuu2.aVk() != -1);
        if (fuu2.aVk() < 65535) {
            if (fuu2.iXv == null) {
                return;
            }
            gjl gjl2 = this.fYr.remove(fuu2.aVk());
            if (gjl2 == null) {
                return;
            }
            switch (gjl2.bEz()) {
                case 4621: {
                    gjf gjf2 = (gjf)gjl2;
                    this.a(fuu2.iXv, fuu2.iXv.ib(), gjf2.jjc, gjf2.mZ, gjf2.gen, gjf2.Radius, gjf2.jiZ);
                    break;
                }
                case 4622: {
                    gje gje2 = (gje)gjl2;
                    this.a(gje2.mx, fuu2.iXv.ib(), fuu2.iXv, gje2.gen, gje2.jiZ);
                    break;
                }
            }
        } else {
            gjl gjl3 = this.fYs.remove(fuu2.aVk());
            if (gjl3 == null) {
                return;
            }
            if (fuu2.dtj == null) {
                return;
            }
            this.fYr.put(this.Qs, gjl3);
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), fuu2.dtj);
            fut2.sk(this.Qs);
            fut2.jM(true);
            fut2.iXu = false;
            fut2.Ib(64);
            this.MessageDelegator.F(fut2);
            ++this.Qs;
            if (this.Qs == 65535) {
                this.Qs = 0;
            }
        }
    }

    private void a(gje gje2) {
        this.fYs.put(this.fYv, gje2);
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), gje2.Ui);
        fut2.sk(this.fYv);
        fut2.jM(true);
        fut2.iXu = false;
        fut2.Ib(1);
        this.MessageDelegator.F(fut2);
        ++this.fYv;
        if (this.fYv == Integer.MAX_VALUE) {
            this.fYv = 65535;
        }
    }

    private void a(gjd gjd2) {
    }

    private void a(ljq ljq2, int n2, ldv ldv2, float f2, ldv ldv3) {
        ljq ljq3 = new ljq(ljq2);
        ljq3.nm(f2 * 4.0f);
        ldv ldv4 = this.bA(n2, ldv2.enw());
        gjd gjd2 = (gjd)this.MessageDelegator.h(4623, this.getGUID(), ldv4);
        gjd2.jja = ljq3;
        gjd2.hC = ldv2;
        gjd2.jiZ = ldv3;
        this.MessageDelegator.F(gjd2);
    }

    private void a(gjf gjf2) {
        this.fYs.put(this.fYv, gjf2);
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), gjf2.hC);
        fut2.sk(this.fYv);
        fut2.jM(true);
        fut2.iXu = false;
        fut2.Ib(1);
        this.MessageDelegator.F(fut2);
        ++this.fYv;
        if (this.fYv == Integer.MAX_VALUE) {
            this.fYv = 65535;
        }
    }

    private void a(ldv ldv2, int n2, ljq ljq2, ljq ljq3, float f2, float f3, ldv ldv3) {
        ljq ljq4 = this.a(ljq2, ljq3, f2, f3);
        ldv ldv4 = this.bA(n2, ldv2.enw());
        gjd gjd2 = (gjd)this.MessageDelegator.h(4623, this.getGUID(), ldv4);
        gjd2.jja = ljq4;
        gjd2.hC = ldv2;
        gjd2.jiZ = ldv3;
        this.MessageDelegator.F(gjd2);
    }

    private ldv bA(int n2, int n3) {
        return lcr.p((ldv)lcr.qCu, (int)n2, (int)n3);
    }

    private ljq a(ljq ljq2, ljq ljq3, float f2, float f3) {
        ljq ljq4 = new ljq(ljq2);
        ljq4.es(this.fYq);
        ljq4.et(ljq3);
        float f4 = ljq4.eqN();
        if (f4 > f3) {
            f4 = f3;
        }
        float f5 = 1.0f - Math.abs(f4) / f3;
        ljq4.normalize();
        ljq4.nm(f5 * f2 * 4.0f);
        return ljq4;
    }
}

