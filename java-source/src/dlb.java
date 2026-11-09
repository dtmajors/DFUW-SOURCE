/*
 * Decompiled with CFR.
 */
import java.util.List;

public class dlb
extends btk {
    private ldv Rs = null;
    private List gET = null;
    private float biv = 4.0f;
    private float bzb = 300.0f;
    private float gEU = 9000.0f;
    private float akO = 0.2f;
    private float gEV = 0.0f;
    private float gEW = 0.2f;
    private boolean gEZ = false;
    private ljq bis = null;
    private ljq gon = null;
    private ljq gFj = null;
    private boolean gua = true;
    private ldv gFb = null;
    private boolean gFh = false;

    @Override
    public void initialize() {
        super.initialize();
        this.bos();
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 6146: {
                kxd kxd2 = (kxd)ktv2;
                this.gFj = kxd2.getResult() != 0 ? this.gon : kxd2.av();
                this.gFh = true;
                this.bot();
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.bot();
    }

    private void bos() {
        assert (this.Rs != null);
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
        kri2.hC(this.Rs);
        kri2.xy(true);
        kri2.dy(this.akO);
        kri2.dD(this.gEW);
        kri2.ab(this.gEU);
        kri2.setMaxVelocity(this.bzb);
        kri2.xx(this.gua);
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

    public float boA() {
        return this.gEV;
    }

    public void gS(float f) {
        this.gEV = f;
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

    public float getMaxVelocity() {
        return this.bzb;
    }

    public void setMaxVelocity(float f) {
        this.bzb = f;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public float boG() {
        return this.gEW;
    }

    public void gV(float f) {
        this.gEW = f;
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

    public boolean isUseCollision() {
        return this.gua;
    }

    public void setUseCollision(boolean bl) {
        this.gua = bl;
    }

    public boolean boB() {
        return this.gFh;
    }

    public ljq boK() {
        return this.gFj;
    }
}

