/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;

public class dla
extends btk
implements bto {
    private ldv gES = null;
    private dfm gtf = null;
    private List gET = null;
    private float biv = 4.0f;
    private float bzb = 300.0f;
    private float gEU = 9000.0f;
    private float akO = 0.2f;
    private float gEV = 0.0f;
    private float gEW = 0.2f;
    private boolean gEX = true;
    private float gEY = 0.3f;
    private boolean gEZ = false;
    private ljq bis = null;
    private ljq gon = null;
    private int gFa = 3;
    private ldv gFb = null;
    private int gFc = 0;
    private float gFd = 0.0f;
    private ljq gFe = null;
    private float gFf = 0.0f;
    private boolean gFg = false;
    private boolean gFh = false;
    private ljq gFi = null;

    @Override
    public void doTick(ldz ldz2) {
        this.gEV = (float)ldz2.rgz;
        if (!this.gFg && this.gEX && this.gtf != null) {
            this.gFf += this.gFd;
            lgl lgl2 = new lgl(this.gFe, this.gFf);
            this.gtf.a(lgl2);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.bos();
        if (this.gEX && this.gtf != null) {
            this.bou();
            lgl lgl2 = new lgl(this.gFe, this.gFf);
            this.gtf.a(lgl2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 6146: {
                kxd kxd2 = (kxd)ktv2;
                if (!kxd2.ehZ() || kxd2.getResult() != 0) {
                    this.gFg = true;
                    this.bot();
                    break;
                }
                if (lcw.enb() && (kxd2.oq().ib() == 3 || kxd2.oq().ib() == 7000)) break;
                this.gFh = true;
                ++this.gFc;
                if (this.gFc >= this.gFa) {
                    this.gFg = true;
                    this.bot();
                    this.b(kxd2);
                    break;
                }
                this.bot();
                this.b(kxd2);
                this.bos();
                this.bou();
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void b(kxd kxd2) {
        this.gon = kxd2.getSourcePosition();
        this.gtf.c(this.gon);
        ljq ljq2 = new ljq(kxd2.av());
        ljq2.et(kxd2.getSourcePosition());
        ljq2 = new ljq(kxd2.Up());
        ljq2.normalize();
        this.bis = ljq.v(ljq2, kxd2.eib());
        if (!this.bis.isNormalized()) {
            this.bis.normalize();
            if (!this.bis.isNormalized()) {
                this.bis = new ljq(0.0f, 1.0f, 0.0f);
            }
        }
        if (this.bis.isZero()) {
            this.bis = new ljq(0.0f, 1.0f, 0.0f);
        }
        this.gFi = kxd2.getSourcePosition();
        float f = kxd2.Up().eqN();
        this.biv *= 0.999999f;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.bot();
    }

    private void bos() {
        assert (this.gES != null);
        this.gFb = this.MessageDelegator.bzv();
        kri kri2 = (kri)this.MessageDelegator.h(2309);
        kri2.lQ(false);
        kri2.wD(false);
        kri2.jM(false);
        kri2.ts(this.getGUID());
        kri2.mx(this.gFb);
        kri2.xB(true);
        kri2.gS(this.gEV);
        kri2.c(this.gon);
        kri2.a(new lgl());
        kri2.setStartDirection(this.bis);
        kri2.fa(this.gEZ);
        if (this.gET != null && !this.gET.isEmpty()) {
            kri2.xz(true);
            kri2.c(this.gET.toArray(new ldv[this.gET.size()]));
        } else {
            kri2.xz(false);
            kri2.c(new ldv[0]);
        }
        kri2.dz(new ljq());
        kri2.hC(this.gES);
        kri2.xy(true);
        kri2.dy(this.akO);
        kri2.dD(this.gEW);
        kri2.ab(this.gEU);
        kri2.setMaxVelocity(this.bzb);
        kri2.xx(true);
        kri2.ac(this.biv);
        this.MessageDelegator.a(kri2);
    }

    private void bot() {
        if (this.gFb == null) {
            return;
        }
        krk krk2 = (krk)this.MessageDelegator.h(2310);
        krk2.lQ(false);
        krk2.wD(false);
        krk2.jM(false);
        krk2.ts(this.getGUID());
        krk2.mx(this.gFb);
        this.MessageDelegator.a(krk2);
        this.MessageDelegator.oa(this.gFb);
        this.gFb = null;
    }

    private void bou() {
        ljq ljq2 = new ljq((float)Math.random(), (float)Math.random(), (float)Math.random());
        ljq2.normalize();
        this.gFe = ljq2;
        this.gFd = (float)Math.random() * this.gEY;
        this.gFf = 0.0f;
    }

    public int bov() {
        return this.gFc;
    }

    public void Aq(int n) {
        this.gFc = n;
    }

    public float bow() {
        return this.gFd;
    }

    public void gQ(float f) {
        this.gFd = f;
    }

    public float box() {
        return this.gFf;
    }

    public void gR(float f) {
        this.gFf = f;
    }

    public ljq boy() {
        return this.gFe;
    }

    public void bW(ljq ljq2) {
        this.gFe = ljq2;
    }

    public ldv boz() {
        return this.gFb;
    }

    public void mM(ldv ldv2) {
        this.gFb = ldv2;
    }

    public float boA() {
        return this.gEV;
    }

    public void gS(float f) {
        this.gEV = f;
    }

    public boolean boB() {
        return this.gFh;
    }

    public void ih(boolean bl) {
        this.gFh = bl;
    }

    public List boC() {
        return this.gET;
    }

    public void aE(List list) {
        this.gET = list;
    }

    public float aCc() {
        return this.akO;
    }

    public void dy(float f) {
        this.akO = f;
    }

    public float boD() {
        return this.gEU;
    }

    public void gT(float f) {
        this.gEU = f;
    }

    public int boE() {
        return this.gFa;
    }

    public void Ar(int n) {
        this.gFa = n;
    }

    public float boF() {
        return this.gEY;
    }

    public void gU(float f) {
        this.gEY = f;
    }

    public float getMaxVelocity() {
        return this.bzb;
    }

    public void setMaxVelocity(float f) {
        this.bzb = f;
    }

    public dfm getMeshAtom() {
        return this.gtf;
    }

    public void setMeshAtom(dfm dfm2) {
        this.gtf = dfm2;
        this.gES = this.gtf.getGUID();
    }

    public float boG() {
        return this.gEW;
    }

    public void gV(float f) {
        this.gEW = f;
    }

    public boolean boH() {
        return this.gEX;
    }

    public void ii(boolean bl) {
        this.gEX = bl;
    }

    public boolean boI() {
        return this.gEZ;
    }

    public void ij(boolean bl) {
        this.gEZ = bl;
    }

    public ljq getStartDirection() {
        return this.bis;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
        if (!this.bis.isNormalized()) {
            this.bis.normalize();
            if (!this.bis.isNormalized()) {
                this.bis = new ljq(0.0f, 1.0f, 0.0f);
            }
        }
    }

    public ljq blY() {
        return this.gon;
    }

    public void bN(ljq ljq2) {
        this.gon = ljq2;
    }

    public float aCo() {
        return this.biv;
    }

    public void ac(float f) {
        this.biv = f;
    }

    public boolean isDone() {
        return this.gFg;
    }

    public ljq boJ() {
        return this.gFi;
    }
}

