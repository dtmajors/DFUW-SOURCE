/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 *  lcr
 *  lcw
 */
import java.util.Map;

public class cfg
extends btk
implements bto {
    protected boolean avz = false;
    protected dld rh = null;
    protected bvd Uk = null;
    protected cev bnF = null;
    protected a eub = null;
    ljp euc = new ljp(0.0f, 0.0f);
    protected double eud = 0.0;
    protected float H = 0.0f;
    protected ljp eue = new ljp(0.0f, 0.0f);
    protected ljp euf = new ljp(0.0f, 0.0f);
    protected ljp eug = new ljp(0.0f, 0.0f);
    protected ljp euh = new ljp(0.0f, 0.0f);
    protected float eui = 0.0f;
    float euj = 0.0f;
    ljp euk = null;
    protected ljq epb = null;
    protected double lW = 0.0;
    protected ljq eul = new ljq(0.0f, 0.0f, 0.0f);
    protected ljq eum = new ljq(0.0f, 0.0f, 0.0f);

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.Uk = null;
        this.bnF = null;
        this.rh = null;
    }

    @Override
    public void doTick(ldz ldz2) {
        hzo hzo2;
        if (!this.avz) {
            return;
        }
        if (this.bnF == null) {
            return;
        }
        if (this.Uk == null) {
            this.Uk = this.bnF.aAG();
            if (this.Uk == null) {
                return;
            }
        }
        if (this.rh == null) {
            this.rh = (dld)this.MessageDelegator.bzx().bzt().d(lcr.rg);
            if (this.rh == null) {
                return;
            }
        }
        if ((hzo2 = hso.cxK().cxP().cyJ()) == null) {
            return;
        }
        hyw hyw2 = hzo2.cHZ();
        if (hyw2 == null) {
            return;
        }
        float f2 = hyw2.beq();
        if (this.eud > 0.0) {
            if (ldz2.rgz > this.eud) {
                if (f2 <= 0.0f) {
                    this.euc.x = 0.0f;
                    this.euc.y = 0.0f;
                    this.t(0.0f, 0.0f);
                }
                this.eud = 0.0;
            }
            return;
        }
        ff ff2 = (ff)this.bnF.fi().ae(11552);
        if (ff2 == null) {
            return;
        }
        cjx cjx2 = lea.epx().hu(ff2.getStringValue());
        if (cjx2 == null) {
            return;
        }
        Map<bqm.d, a> map = cjx2.aQz();
        if (map == null) {
            return;
        }
        ddx ddx2 = this.bnF.aJB();
        if (ddx2 == null) {
            return;
        }
        bqm.d d2 = ddx2.bki();
        if (d2 == null) {
            return;
        }
        this.eub = map.get((Object)d2);
        if (this.eub == null) {
            return;
        }
        if (!ddx2.bkq()) {
            return;
        }
        if (f2 < 0.0f) {
            if (this.eud < 0.0) {
                this.eud = ldz2.rgz + (double)this.eub.eur;
            }
            return;
        }
        this.eud = -1.0;
        this.U(ldz2);
        ljp ljp2 = this.b(ldz2, this.eub.eup);
        float f3 = (float)ldz2.qwh * this.eub.euq;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.euc.x += (ljp2.x - this.euc.x) * f3;
        this.euc.y += (ljp2.y - this.euc.y) * f3;
        float f4 = Math.min(this.eum.eqN(), 5.7749996f);
        float f5 = this.eub.eun * (float)Math.pow(f4, this.eub.euo);
        if ((f5 *= (float)lcw.qFT / 1600.0f) > 400.0f) {
            f5 = 400.0f;
        }
        this.t(this.euc.x * f5, this.euc.y * f5);
    }

    protected ljp a(ldz ldz2, float f2) {
        this.H = (float)((double)this.H + ldz2.qwh * (double)this.eum.eqN());
        float f3 = (float)Math.cos(this.H * f2);
        float f4 = (float)Math.abs(Math.sin(this.H * f2));
        return new ljp(f3, f4 *= 0.5f);
    }

    protected ljp b(ldz ldz2, float f2) {
        this.eui = (float)((double)this.eui + ldz2.qwh * (double)f2);
        if (this.eui > 1.0f) {
            this.eui -= 1.0f;
            if (this.eui > 1.0f) {
                this.eui = 1.0f;
            }
            ljp ljp2 = this.eue;
            this.eue = this.euh;
            this.euh = this.aNo();
        }
        float f3 = this.eui;
        float f4 = 1.0f - f3;
        float f5 = this.eue.x * f4 + this.euh.x * f3;
        float f6 = this.eue.y * f4 + this.euh.y * f3;
        return new ljp(f5, f6);
    }

    protected ljp c(ldz ldz2, float f2) {
        this.euj = (float)((double)this.euj + ldz2.qwh * (double)f2);
        float f3 = 1.0f;
        return new ljp(f3 * (float)Math.cos(this.euj), f3 * (float)Math.sin(this.euj));
    }

    protected ljp aNo() {
        float f2 = 0.9f;
        ljp ljp2 = new ljp(0.0f, 0.0f);
        do {
            ljp2.x = (float)Math.random() * 2.0f - 1.0f;
            ljp2.y = (float)Math.random() * 2.0f - 1.0f;
        } while (ljp2.x * ljp2.x + ljp2.y * ljp2.y > 1.0f || this.euk != null && !(this.euk.y(ljp2) > f2 * f2));
        this.euk = ljp2;
        return ljp2;
    }

    protected void U(ldz ldz2) {
        float f2;
        ej ej2 = this.bnF.fi().ae(1488);
        fe fe2 = (fe)ej2;
        ljq ljq2 = fe2.gw().Qe;
        if (ljq2 != null) {
            this.eul = ljq2;
        }
        float f3 = this.eub.eus;
        if (this.eul.eqF() < this.eum.eqF()) {
            f3 = this.eub.eut;
        }
        f2 = (f2 = (float)ldz2.qwh * f3) > 1.0f ? 1.0f : f2;
        ljq ljq3 = this.eul.esF();
        ljq3.et(this.eum);
        ljq3.nm(f2);
        this.eum.es(ljq3);
    }

    protected void t(float f2, float f3) {
        float f4 = this.rh.boV();
        joa joa2 = hso.cxK().cxX();
        float f5 = joa2.W / joa2.H;
        float f6 = f2 / joa2.W * f5;
        float f7 = f3 / joa2.H;
        lgl lgl2 = new lgl(new ljq(f7 * f4, f6 * f4, 0.0f));
        ljq ljq2 = lgl2.eqT();
        ljq2.x *= -1.0f;
        ljq2.nm(1.3f);
        bum.g(lgl2);
        khl khl2 = (khl)this.MessageDelegator.h(3077);
        khl2.ts(this.GUID);
        khl2.hC(this.Uk.getGUID());
        khl2.de(ljq2);
        khl2.Xq(khl.pxt);
        this.MessageDelegator.a(khl2);
        hzo hzo2 = hso.cxK().cxP().cyJ();
        if (hzo2 == null) {
            return;
        }
        hyw hyw2 = hzo2.cHZ();
        if (hyw2 == null) {
            return;
        }
        hyw2.t(f2, f3);
    }

    public void f(cev cev2) {
        this.bnF = cev2;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }

    public a aNp() {
        return this.eub;
    }
}

