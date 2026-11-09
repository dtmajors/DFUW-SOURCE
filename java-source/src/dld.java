/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.Map;

public class dld
extends dlf
implements ami,
bto {
    protected float gFo = 1.0f;
    protected float FarPlane = 450.0f;
    protected int gFp = 0;
    protected int gFq = 0;
    protected float gFr = lcw.qGm ? 0.34906584f : 0.9250245f;
    protected float gFs = 0.75f;
    protected float gFt = 0.6f;
    protected float gFu = 0.075f;
    protected ljq Position = new ljq(0.0f, 0.0f, 0.0f);
    protected lgl Rotation = new lgl();
    protected float gFv = 0.0f;
    protected float gFw = 0.0f;
    protected ljq mw = new ljq(0.0f, 0.0f, 0.0f);
    protected ljq mx = new ljq(0.0f, 0.0f, 1.0f);
    protected int gFx = 0;
    protected int gFy = 0;
    protected ljq gFz = new ljq();
    private ljq gFA = new ljq();
    protected lgl gFB = new lgl();
    private dsv gFC = null;
    protected Map<ldv, khd> dTw = lcn.emw();
    private double ps = 0.0;

    public dld() {
        this.ObjectType = 3;
    }

    public float boR() {
        return this.gFo;
    }

    public void gZ(float f) {
        this.gFo = f;
    }

    public float boS() {
        return this.FarPlane;
    }

    public void ha(float f) {
        this.FarPlane = f;
    }

    public int boT() {
        return this.gFp;
    }

    public void As(int n) {
        this.gFp = n;
    }

    public int boU() {
        return this.gFq;
    }

    public void At(int n) {
        this.gFq = n;
    }

    public float boV() {
        return this.gFr;
    }

    public void hb(float f) {
        this.gFr = f;
    }

    public float boW() {
        return this.gFs;
    }

    private void hc(float f) {
        this.gFs = f;
    }

    public float boX() {
        return this.gFt;
    }

    private void hd(float f) {
        this.gFt = f;
    }

    public float boY() {
        return this.gFu;
    }

    private void he(float f) {
        this.gFu = f;
    }

    @Override
    public ljq av() {
        return new ljq(this.Position);
    }

    @Override
    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    @Override
    public lgl aw() {
        if (this.Rotation == null) {
            return null;
        }
        return new lgl(this.Rotation);
    }

    @Override
    public void a(lgl lgl2) {
        this.Rotation = new lgl(lgl2);
        lgl lgl3 = new lgl(this.Rotation);
        lgl3.eqR();
        assert (lgl3.eqP()) : "Not unit quaternion: " + lgl3;
        mfy mfy2 = new mfy(lgl3);
        this.mx = mfy2.eI(new ljq(0.0f, 0.0f, 1.0f));
        this.mx.normalize();
    }

    public ljq boZ() {
        return this.mw;
    }

    public void ca(ljq ljq2) {
        this.mw = ljq2;
    }

    public ljq bpa() {
        return this.mx;
    }

    public int bpb() {
        return this.gFx;
    }

    public void Au(int n) {
        this.gFx = n;
    }

    public int bpc() {
        return this.gFy;
    }

    public void Av(int n) {
        this.gFy = n;
    }

    public ljq bpd() {
        return this.gFz;
    }

    public void cb(ljq ljq2) {
        this.gFz = ljq2;
    }

    public void cc(ljq ljq2) {
        this.gFz.es(ljq2);
    }

    public lgl bpe() {
        return this.gFB;
    }

    public void D(lgl lgl2) {
        this.gFB = lgl2;
    }

    public void E(lgl lgl2) {
        this.gFB.Y(lgl2);
        this.gFB.normalize();
        lgl lgl3 = new lgl(this.aw());
        lgl3.Y(this.gFB);
        lgl3.normalize();
    }

    public ljq bpf() {
        ljq ljq2 = this.av();
        ljq2.es(this.gFz);
        return ljq2;
    }

    public lgl bpg() {
        lgl lgl2 = this.aw();
        lgl2.Y(this.gFB);
        return lgl2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.bpd().esJ() || !this.gFA.esJ()) {
            this.aj(ldz2);
            this.gFA = this.gFz;
            this.cb(new ljq());
        }
        if (lcw.qHe) {
            lgl lgl2 = new lgl(this.aw());
            this.G(lgl2);
        }
    }

    private void aj(ldz ldz2) {
        kmx kmx2;
        Object object;
        if (lcw.eng()) {
            return;
        }
        if (this.gFC.byR()) {
            assert (lcr.gpg != null);
            object = new ljq(this.gFC.byU());
            ((ljq)object).es(this.bpd());
            kmx2 = (kmx)this.MessageDelegator.h(773);
            kmx2.pPs = 1024;
            kmx2.doP = lcr.gpg;
            kmx2.ec = this.GUID;
            kmx2.biE = object;
            this.MessageDelegator.a(kmx2);
        }
        if (this.gFC.byY()) {
            assert (lcr.gpg != null);
            object = new ljq(this.gFC.byX());
            ((ljq)object).es(this.bpd());
            kmx2 = (kmx)this.MessageDelegator.h(773);
            kmx2.pPs = 1024;
            kmx2.doP = lcr.gpg;
            kmx2.ec = this.GUID;
            kmx2.biE = object;
            this.MessageDelegator.a(kmx2);
        }
        if (this.gFC.byZ() || this.gFC.byQ()) {
            assert (lcr.qBS != null);
            object = (kio)this.MessageDelegator.h(2057);
            ((kio)object).e(lcr.qBS);
            ((kio)object).XW(1);
            ((kio)object).dg(this.bpd());
            ((khd)object).ts(this.getGUID());
            ((kit)object).oG(lcr.rg);
            this.MessageDelegator.a((khd)object);
        }
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            assert (this.GUID != null) : "GUID is null!";
            this.ju(this.GUID);
            this.Initialized = true;
            this.gFC = dsv.byP();
            this.bph();
            this.aBd();
            lcw.qFS = true;
        }
        super.initialize();
    }

    @Override
    public void cleanUp() {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2049: {
                this.a((edc)dxq2);
                break;
            }
            case 2050: {
                this.a((edd)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 2306: {
                kto kto2 = (kto)ktv2;
                this.c(kto2.av());
                this.a(kto2.aw());
                this.mw = kto2.egR();
                this.mx = kto2.egS();
                break;
            }
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 516: {
                this.a((kwp)ktv2);
                break;
            }
        }
    }

    protected void bph() {
        this.bpi();
        this.G(12, false);
    }

    protected void bpi() {
        kip kip2 = (kip)this.MessageDelegator.h(2051);
        kip2.XX(1);
        kip2.ts(this.GUID);
        kip2.oG(this.dJs);
        kip2.gZ(this.gFo);
        kip2.ha(this.FarPlane);
        kip2.At(this.gFq);
        kip2.As(this.gFp);
        kip2.hb(this.gFr);
        kip2.hc(this.gFs);
        kip2.hd(this.gFt);
        kip2.he(this.gFu);
        kip2.setActive(true);
        this.MessageDelegator.a(kip2);
    }

    protected void aBd() {
        if (this.gOY) {
            int n = 0;
            kpl kpl2 = (kpl)this.MessageDelegator.h(517);
            kpl2.ts(this.GUID);
            kpl2.aag(1);
            n = 1;
            if (lcw.qHe) {
                n |= 2;
            }
            kpl2.aah(n);
            kpl2.aai(2);
            kpl2.aaj(1);
            kpl2.lQ(true);
            kpl2.sy(this.dJs);
            kpl2.wD(true);
            kpl2.hK(this.dJs);
            kpl2.hl(this.gFv);
            kpl2.hm(this.gFw);
            kpl2.mK(this.gOZ);
            kpl2.zP(this.gPa);
            this.MessageDelegator.a(kpl2);
            this.dTw.put(kpl2.GUID, kpl2);
        }
    }

    protected void a(kwr kwr2) {
        khd khd2 = this.dTw.remove(kwr2.dXg());
        if (khd2 == null) {
            return;
        }
        int n = khd2.pse;
        if (kwr2.getResult() != 0) {
            if (n == 517) {
                // empty if block
            }
            return;
        }
        if (n == 517) {
            this.mz(kwr2.axa());
        }
    }

    protected void aBe() {
        if (this.gOY) {
            kpl kpl2 = (kpl)this.MessageDelegator.h(517);
            kpl2.ts(this.GUID);
            kpl2.aag(2);
            kpl2.aai(2);
            kpl2.sy(this.dUK);
            kpl2.hK(this.GUID);
            this.MessageDelegator.a(kpl2);
            this.gOY = false;
            this.dUK = null;
        }
    }

    protected void a(kwp kwp2) {
        this.dUL = kwp2.bkF();
        this.c(kwp2.av());
        if (lcw.qHe) {
            // empty if block
        }
        --this.dUL;
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.aag(4);
        kpl2.aai(2);
        kpl2.ts(this.GUID);
        kpl2.sy(this.dUK);
        kpl2.hK(this.GUID);
        this.MessageDelegator.a(kpl2);
        bum.aU(this.av());
    }

    protected void a(edc edc2) {
        if (this.MessageDelegator == null) {
            return;
        }
        kis kis2 = (kis)this.MessageDelegator.h(2049);
        kis2.HT(edc2.bFD());
        kis2.ts(this.GUID);
        kis2.oG(this.GUID);
        if ((edc2.bFD() & 8) == 8) {
            this.a(edc2.aw());
            kis2.a(this.aw());
        }
        if ((edc2.bFD() & 4) == 4) {
            this.c(edc2.av());
            kis2.c(this.Position);
        }
        if ((edc2.bFD() & 1) == 1) {
            kis2.c(edc2.av());
        }
        if ((edc2.bFD() & 2) == 2) {
            this.Rotation.Y(edc2.aw());
            kis2.a(edc2.aw());
        }
        if ((edc2.bFD() & 0x10) == 16) {
            kis2.cD(edc2.av());
        }
        this.MessageDelegator.a(kis2);
    }

    protected void a(edd edd2) {
        edd edd3 = (edd)this.MessageDelegator.h(2050, this.GUID, edd2.aO());
        edd3.ig = this.aw();
        this.MessageDelegator.F(edd3);
    }

    public void cd(ljq ljq2) {
        this.c(new ljq(ljq2));
        this.G(4, true);
    }

    public void m(ljq ljq2, ljq ljq3) {
        this.c(new ljq(ljq2));
        this.d(new ljq(ljq3));
        this.G(12, true);
    }

    public void q(float f, float f2, float f3) {
        ljq ljq2 = new ljq(f2, f3, f);
        kis kis2 = (kis)this.MessageDelegator.h(2049);
        kis2.ts(this.GUID);
        kis2.oG(this.GUID);
        kis2.HT(16);
        kis2.cD(ljq2);
        this.MessageDelegator.a(kis2);
    }

    public void a(float f, float f2, float f3, lgl lgl2) {
        ljq ljq2 = new ljq(f, f2, f3);
        lgl lgl3 = new lgl(this.aw());
        lgl3.Y(lgl2);
        lgl3.normalize();
        this.a(lgl3);
        this.a(16, ljq2, lgl2, true);
    }

    public void F(lgl lgl2) {
        this.a(lgl2);
        if (!this.Initialized) {
            return;
        }
    }

    protected void G(int n, boolean bl) {
        if (this.MessageDelegator != null) {
            this.a(n, this.Position, this.Rotation, bl);
        }
    }

    protected void a(int n, ljq ljq2, lgl lgl2, boolean bl) {
        if (this.MessageDelegator != null) {
            kis kis2 = (kis)this.MessageDelegator.h(2049);
            kis2.ts(this.GUID);
            kis2.oG(this.GUID);
            kis2.HT(n);
            kis2.a(lgl2);
            kis2.c(ljq2);
            kis2.cD(ljq2);
            this.MessageDelegator.a(kis2);
            if (bl) {
                // empty if block
            }
        }
    }

    public void bpj() {
        kiq kiq2 = (kiq)this.MessageDelegator.h(2050);
        kiq2.oG(this.GUID);
        kiq2.ts(this.GUID);
        kiq2.XY(3);
        kiq2.Fy(this.gFx);
        kiq2.Fz(this.gFy);
        kiq2.wD(true);
        this.MessageDelegator.a(kiq2);
    }

    private void G(lgl lgl2) {
        kis kis2 = (kis)this.MessageDelegator.h(2049);
        kis2.ts(this.GUID);
        kis2.oG(this.GUID);
        kis2.HT(8);
        kis2.a(lgl2);
        this.MessageDelegator.a(kis2);
    }

    public ljq bpk() {
        return this.Position;
    }

    @Override
    public ljq FX() {
        if (this.Rotation == null) {
            return null;
        }
        return this.Rotation.eqT();
    }

    @Override
    public void d(ljq ljq2) {
        if (this.Rotation == null) {
            this.Rotation = new lgl(ljq2);
        } else {
            this.Rotation.ep(ljq2);
        }
    }

    public void hf(float f) {
        this.hb((float)((double)f * Math.PI) / 180.0f);
        kir kir2 = (kir)this.MessageDelegator.h(2054);
        kir2.ts(this.GUID);
        kir2.oG(this.dJs);
        kir2.XZ(16);
        kir2.hb(this.gFr);
        this.MessageDelegator.a(kir2);
    }
}

