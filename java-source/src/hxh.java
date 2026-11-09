/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Map;

public final class hxh
extends btk
implements bto {
    public static final float ljC = 0.2f;
    private static final int ljD = 200;
    private hyh ljE = hyh.lnF;
    private Map<ldv, String> ljF = lcn.emw();
    private final String ljG;
    private final hyn lfg;
    private hye ljH = hye.lnl;
    private hye ljI = hye.lnl;
    private boolean ljJ;
    private boolean ljK;
    private final ldv ljL;
    private ldv Ud;
    private ldv ljM;
    private ldv ljN;
    private boolean bqw;
    private int ljO;
    private float ljP = 1.0f;
    private float ljQ = 1.0f;
    private float ljR = 1.0f;
    private float doR = 1.0f;
    private float ljS = 0.0f;
    private float ljT = 0.0f;
    private int ljU;
    private int ljV;
    private boolean ljW;
    private boolean ljX;
    private boolean ljY;
    private float ljZ = 0.5f;
    private hxo lka;
    private boolean lkb = false;

    public hxh(String string, hyn hyn2, ldv ldv2) {
        this.ljG = string;
        this.lfg = hyn2;
        this.ljL = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
        this.cDm();
    }

    @Override
    public void cleanUp() {
        if (this.Ud != null && this.ljN == null) {
            this.pa(false);
        }
        this.cDo();
        super.cleanUp();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + (this.ljL == null ? "null" : this.ljL) + " - " + this.ljG + "]";
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lka != null) {
            this.ljO |= this.lka.aB(ldz2);
            if (this.lka.isDone()) {
                this.lka = null;
                this.a(hxi.lki);
                this.a(hxi.lkj);
                this.a(hxi.lkg);
                this.a(hxi.lkh);
                this.a(hxi.lke);
                this.a(hxi.lkf);
                switch (this.ljH) {
                    case lno: {
                        this.cDh();
                        break;
                    }
                    case lnm: {
                        this.cDi();
                        break;
                    }
                    default: {
                        assert (false);
                        break;
                    }
                }
            }
        }
        if (this.ljO != 0) {
            this.cDl();
        }
    }

    public String cCX() {
        return this.ljG;
    }

    public void shutdown() {
        this.MessageDelegator.hd(this.getGUID());
    }

    public final ldv cCY() {
        return this.ljL;
    }

    public void a(String string, String string2, mhk ... mhkArray) {
        knx knx2 = (knx)this.MessageDelegator.h(267);
        knx2.ec = this.getGUID();
        knx2.pRz = string;
        knx2.pRA = mhkArray;
        knx2.hC(this.ljL);
        this.ljF.put(knx2.getGUID(), string2);
        this.MessageDelegator.a(knx2);
    }

    public void a(String string, mhk mhk2) {
        koa koa2 = (koa)this.MessageDelegator.h(268);
        koa2.ec = this.getGUID();
        koa2.pSe = string;
        koa2.pSd = mhk2;
        koa2.pSf = 1;
        koa2.hC(this.ljL);
        this.MessageDelegator.a(koa2);
    }

    public void C(String string, String string2) {
        koa koa2 = (koa)this.MessageDelegator.h(268);
        koa2.ec = this.getGUID();
        koa2.pSe = string;
        koa2.pSd = null;
        koa2.pSf = 2;
        koa2.hC(this.ljL);
        assert (this.ljF.size() <= 200);
        this.ljF.put(koa2.getGUID(), string2);
        this.MessageDelegator.a(koa2);
    }

    public final void setVisible(boolean bl) {
        this.ljI = bl ? hye.lnn : hye.lnl;
        this.cDe();
    }

    public final boolean isVisible() {
        return this.ljI == hye.lnn;
    }

    public final void kj(float f2) {
        this.ljP = f2;
        this.a(hxi.lke);
    }

    public final void kk(float f2) {
        this.ljQ = f2;
        this.a(hxi.lkf);
    }

    public final void setScale(float f2) {
        this.ljP = this.ljQ = f2;
        this.a(hxi.lke);
        this.a(hxi.lkf);
    }

    public final float cCZ() {
        return this.ljP;
    }

    public final float cDa() {
        return this.ljQ;
    }

    public final void kl(float f2) {
        this.ljS = f2;
        this.a(hxi.lkg);
    }

    public final void km(float f2) {
        this.ljT = f2;
        this.a(hxi.lkh);
    }

    public final float getX() {
        return this.ljS;
    }

    public final float getY() {
        return this.ljT;
    }

    public final float getWidth() {
        return (float)this.ljU * this.ljP;
    }

    public final float getHeight() {
        return (float)this.ljV * this.ljQ;
    }

    public final int cDb() {
        return this.ljU;
    }

    public final float cDc() {
        return this.ljV;
    }

    public final float cDd() {
        return this.ljR;
    }

    public final void kn(float f2) {
        this.ljR = f2;
        this.a(hxi.lki);
    }

    public final float getAlpha() {
        return this.doR;
    }

    public final void hz(float f2) {
        this.doR = f2;
        this.a(hxi.lkj);
    }

    public final void oX(boolean bl) {
        if (bl == this.ljW) {
            return;
        }
        this.ljW = bl;
        this.a(hxi.lkk);
    }

    public final void oY(boolean bl) {
        if (bl == this.ljX) {
            return;
        }
        this.ljX = bl;
        this.a(hxi.lkl);
    }

    public final void oZ(boolean bl) {
        if (bl == this.ljY) {
            return;
        }
        this.ljY = bl;
        this.a(hxi.lkm);
    }

    public final void kc(float f2) {
        this.ljZ = f2;
        this.a(hxi.lkn);
    }

    private final void cDe() {
        block15: {
            block16: {
                block14: {
                    if (this.ljH == this.ljI) {
                        return;
                    }
                    if (this.ljI != hye.lnn) break block14;
                    switch (this.ljH) {
                        case lnl: {
                            this.cDf();
                            break block15;
                        }
                        case lnm: {
                            break block15;
                        }
                        case lno: {
                            this.cDf();
                            break block15;
                        }
                        default: {
                            assert (false);
                            break block15;
                        }
                    }
                }
                if (this.ljI != hye.lnl) break block16;
                switch (this.ljH) {
                    case lno: {
                        break block15;
                    }
                    case lnm: {
                        this.cDg();
                        break block15;
                    }
                    case lnn: {
                        this.cDg();
                        break block15;
                    }
                    default: {
                        assert (false);
                        break block15;
                    }
                }
            }
            assert (false);
        }
    }

    private final void cDf() {
        assert (this.ljH == hye.lnl || this.ljH == hye.lno);
        float f2 = 0.0f;
        if (this.lka != null) {
            f2 = this.lka.cDy();
        }
        if (this.lfg.a(hya.lmr)) {
            switch (this.ljE) {
                case lnF: {
                    this.lka = new hxp(this, this.MessageDelegator.arc(), 0.2f, f2, true);
                    break;
                }
                case lnG: {
                    this.lka = new hxr(this, this.MessageDelegator.arc(), 0.2f, f2, true);
                    break;
                }
                case lnH: {
                    this.lka = new hxr(this, this.MessageDelegator.arc(), 0.2f, f2, true);
                    break;
                }
                case lnI: {
                    this.lka = new hxq(this, this.MessageDelegator.arc(), 0.2f, f2, true);
                }
            }
        } else {
            this.lka = null;
        }
        this.a(hye.lnm);
        this.ljO |= hxi.lko.cDs();
        if (this.lka == null) {
            this.cDi();
        }
    }

    private final void cDg() {
        assert (this.ljH == hye.lnn || this.ljH == hye.lnm);
        float f2 = 0.0f;
        if (this.lka != null) {
            f2 = this.lka.cDy();
        }
        if (this.lfg.a(hya.lms)) {
            switch (this.ljE) {
                case lnF: {
                    this.lka = new hxp(this, this.MessageDelegator.arc(), 0.2f, f2, false);
                    break;
                }
                case lnG: {
                    this.lka = new hxr(this, this.MessageDelegator.arc(), 0.2f, f2, false);
                    break;
                }
                case lnH: {
                    this.lka = new hxr(this, this.MessageDelegator.arc(), 0.2f, f2, false);
                    break;
                }
                case lnI: {
                    this.lka = new hxq(this, this.MessageDelegator.arc(), 0.2f, f2, false);
                }
            }
        } else {
            this.lka = null;
        }
        this.a(hye.lno);
        if (this.lka == null) {
            this.cDh();
        }
    }

    private final void cDh() {
        this.a(hye.lnl);
        this.ljO |= hxi.lko.cDs();
    }

    private final void cDi() {
        this.a(hye.lnn);
        this.cDe();
    }

    public boolean cDj() {
        return this.ljJ;
    }

    public boolean boo() {
        return this.bqw;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 256: {
                this.a((ktl)ktv2);
                break;
            }
            case 260: {
                this.a((kvp)ktv2);
                break;
            }
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 538: {
                this.a((kvt)ktv2);
                break;
            }
            case 537: {
                this.a((kvu)ktv2);
                break;
            }
            case 259: {
                this.a((kvq)ktv2);
                break;
            }
            case 258: {
                this.a((kvr)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void a(ktl ktl2) {
        if (ktl2.getResult() != 0) {
            lfn.b(5, "SFScaleformMovie", "handle2DResponse: Result = " + ktl2.getResult());
        }
    }

    private void a(kwr kwr2) {
        if (kwr2.ev.equals(this.ljM)) {
            this.b(kwr2);
        } else if (kwr2.ev.equals(this.ljN)) {
            this.c(kwr2);
        } else {
            super.receiveResponse(kwr2);
        }
    }

    private void a(kvt kvt2) {
    }

    private void a(kvu kvu2) {
        this.lfg.b(kvu2.pRz, kvu2.qeZ);
    }

    private void a(kvq kvq2) {
        this.lfg.a(kvq2.pRz, this.ljF.remove(kvq2.dXg()), kvq2.qeL);
    }

    private void a(kvr kvr2) {
        if (kvr2.pSe.equals("alpha")) {
            return;
        }
        this.lfg.b(kvr2.pSe, this.ljF.remove(kvr2.dXg()), kvr2.qeM);
    }

    private boolean cDk() {
        return this.ljH != hye.lnl;
    }

    private void cDl() {
        kny kny2 = (kny)this.MessageDelegator.h(270);
        kny2.wD(false);
        kny2.jM(true);
        kny2.lQ(false);
        kny2.ts(this.getGUID());
        kny2.hC(this.ljL);
        if (hxi.lko.isSet(this.ljO)) {
            kny2.setVisible(this.cDk());
            kny2.pRR = 1024;
        }
        if (hxi.lkn.isSet(this.ljO)) {
            kny2.pRR |= 0x800;
            kny2.gk(this.ljZ);
        }
        if (hxi.lke.isSet(this.ljO) || hxi.lkf.isSet(this.ljO)) {
            kny2.pRR |= 0x22;
            kny2.ljP = this.lka != null && this.lka.b(hxi.lke) ? this.lka.cCZ() : this.ljP;
            kny2.ljQ = this.lka != null && this.lka.b(hxi.lkf) ? this.lka.cDa() : this.ljQ;
            kny2.pRP = 0;
        }
        if (hxi.lki.isSet(this.ljO)) {
            kny2.pRR |= 0x10;
            kny2.ljR = this.lka != null && this.lka.b(hxi.lki) ? this.lka.cDd() : this.ljR;
        }
        if (hxi.lkg.isSet(this.ljO) || hxi.lkh.isSet(this.ljO)) {
            kny2.pRR |= 1;
            kny2.pRp = this.lka != null && this.lka.b(hxi.lkg) ? (int)this.lka.getX() : (int)this.ljS;
            kny2.pRr = this.lka != null && this.lka.b(hxi.lkh) ? (int)this.lka.getY() : (int)this.ljT;
        }
        if (hxi.lkl.isSet(this.ljO)) {
            kny2.pRR |= 0x1000;
            kny2.ljX = this.ljX;
        }
        if (hxi.lkk.isSet(this.ljO)) {
            kny2.pRR |= 0x2000;
            kny2.ljW = this.ljW;
        }
        if (hxi.lkm.isSet(this.ljO)) {
            kny2.pRR |= 0x4000;
            kny2.ljY = this.ljY;
        }
        this.MessageDelegator.a(kny2);
        if (hxi.lkj.isSet(this.ljO)) {
            if (this.lka != null && this.lka.b(hxi.lkj)) {
                this.a("alpha", new mhm(this.lka.getAlpha()));
            } else {
                this.a("alpha", new mhm(this.doR));
            }
        }
        this.ljO = 0;
    }

    private void a(kvp kvp2) {
        if (kvp2.ew != 0) {
            lfn.b(5, "SFScaleformMovie", "handle2DScaleformMovieCreateResponse: " + this + " Could not create movie: " + kvp2.ew);
            this.a(hye.lnl);
            this.ljI = hye.lnl;
            assert (false);
            return;
        }
        this.ljJ = true;
        this.ljU = (int)kvp2.qeJ;
        this.ljV = (int)kvp2.qeK;
        this.lfg.cEA();
        this.cDe();
        this.cDq();
    }

    private void cDm() {
        knw knw2 = (knw)this.MessageDelegator.h(269);
        knw2.wD(true);
        knw2.lQ(false);
        knw2.ts(this.getGUID());
        knw2.setVisible(false);
        knw2.hC(this.ljL);
        knw2.pRo = this.ljG;
        knw2.pRv = 100;
        knw2.ljR = this.ljR;
        knw2.dMT = lcq.BRIGHT_WHITE_TRANSPARENT;
        knw2.gk(this.ljZ);
        knw2.pRx = 0;
        knw2.pRu = 2;
        knw2.pRt = true;
        knw2.pRp = (int)this.ljS;
        knw2.pRr = (int)this.ljT;
        knw2.ljP = this.ljP;
        knw2.ljQ = this.ljQ;
        knw2.pRy = true;
        this.MessageDelegator.a(knw2);
        this.ljO = 0;
    }

    private void cDn() {
        this.lkb = false;
        assert (this.Ud == null);
        assert (this.ljM == null);
        assert (this.ljN == null);
        this.Ud = this.MessageDelegator.bzv();
        kog kog2 = (kog)this.MessageDelegator.h(548);
        this.ljM = kog2.getGUID();
        kog2.ts(this.getGUID());
        kog2.wD(true);
        kog2.lQ(false);
        kog2.dsZ = this.ljL;
        kog2.Ud = this.Ud;
        kog2.pUK = true;
        kog2.pSV = 1;
        this.MessageDelegator.a(kog2);
    }

    private void b(kwr kwr2) {
        this.ljM = null;
        if (kwr2.ew != 0) {
            lfn.b(5, "SFScaleformMovie", "handleSensorResponseCreate: " + this + " could not create sensor: " + kwr2.ew);
            this.ljI = hye.lnl;
            assert (false);
            return;
        }
        this.cDe();
        this.cDq();
        this.bqw = true;
        this.lfg.cEC();
    }

    private void pa(boolean bl) {
        if (bl && !this.lfg.cFO()) {
            this.lkb = true;
            return;
        }
        assert (this.Ud != null);
        this.ljM = null;
        assert (this.ljN == null);
        kog kog2 = (kog)this.MessageDelegator.h(548);
        this.ljN = kog2.getGUID();
        kog2.ts(this.getGUID());
        kog2.wD(true);
        kog2.lQ(false);
        kog2.dsZ = this.ljL;
        kog2.Ud = this.Ud;
        kog2.pUK = true;
        kog2.pSV = 2;
        this.MessageDelegator.a(kog2);
        this.MessageDelegator.oa(this.Ud);
        this.Ud = null;
        this.bqw = false;
        this.lfg.cED();
    }

    private void cDo() {
        this.ljJ = false;
        knr knr2 = (knr)this.MessageDelegator.h(260);
        knr2.ts(this.getGUID());
        knr2.wD(true);
        knr2.lQ(false);
        knr2.setVisible(false);
        knr2.hC(this.ljL);
        knr2.ts(this.getGUID());
        knr2.Zy(1);
        this.MessageDelegator.a(knr2);
        this.lfg.cEB();
    }

    private void d(ktl ktl2) {
        if (ktl2.ew != 0) {
            lfn.b(5, "SFScaleformMovie", "handle2DResponseDestroy: " + this + " Could not destroy movie: " + ktl2.ew);
        }
        if (this.ljN != null) {
            return;
        }
        this.a(hye.lnl);
        if (this.ljK) {
            this.MessageDelegator.hd(this.getGUID());
        } else {
            this.cDe();
        }
    }

    private void c(kwr kwr2) {
        this.ljN = null;
        if (kwr2.ew != 0) {
            lfn.b(5, "SFScaleformMovie", "handleSensorResponseDestroy: " + this + " Could not destroy sensor: " + kwr2.ew);
        }
        this.Ud = null;
        this.cDq();
    }

    private final void a(hxi hxi2) {
        this.ljO |= hxi2.cDs();
    }

    public boolean cDp() {
        return this.ljH == hye.lnl;
    }

    private final void a(hye hye2) {
        if (hye2 == this.ljH) {
            lfn.b(5, "SFScaleformMovie", "setState: State already " + (Object)((Object)hye2));
            return;
        }
        this.ljH = hye2;
        this.cDq();
    }

    private final void cDq() {
        boolean bl;
        boolean bl2 = bl = this.ljH == hye.lnn || this.ljH == hye.lnm;
        if (bl) {
            if (!this.ljJ) {
                return;
            }
            if (this.Ud != null) {
                return;
            }
            if (this.ljM != null) {
                return;
            }
            if (this.ljN != null) {
                return;
            }
            this.cDn();
        } else {
            if (this.Ud == null) {
                return;
            }
            if (this.ljM != null) {
                return;
            }
            if (this.ljN != null) {
                return;
            }
            this.pa(true);
        }
    }

    public void cDr() {
        if (this.lkb) {
            this.lkb = false;
            this.cDq();
        }
    }
}

