/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  lcr
 */
public abstract class bwq
extends btk {
    private static final boolean dWE = false;
    private static final String dWF = "se_arrow_hit";
    private static final String dWG = "se_missile_impact";
    private final boolean dwG;
    private int biq = 0;
    private ljq Position = null;
    private lgl Rotation = null;
    private double bir = 0.0;
    private ljq bis = null;
    private float bit = 0.0f;
    private float biu = 0.0f;
    private float biv = 0.0f;
    private ldv[] biw = null;
    private boolean dWH = false;
    protected int dWI = 0;
    protected float bix = 0.0f;
    protected float biy = 1.0f;
    protected ldv dWJ = null;
    protected bwo dWK = null;
    protected boolean dWL = false;
    private boolean dWM = false;

    public bwq(boolean bl) {
        this.ObjectType = 70;
        this.dwG = bl;
    }

    public final int aCv() {
        return this.biq;
    }

    public final void ff(int n) {
        this.biq = n;
    }

    public final ljq av() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public final lgl aw() {
        return this.Rotation;
    }

    public final void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public final double aCw() {
        return this.bir;
    }

    public final void v(double d2) {
        this.bir = d2;
    }

    public final ljq getStartDirection() {
        return this.bis;
    }

    public final void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
    }

    public final float aCn() {
        return this.bit;
    }

    public final void ab(float f2) {
        this.bit = f2;
    }

    public final float getPower() {
        return this.biu;
    }

    public final void setPower(float f2) {
        this.biu = f2;
    }

    public final float aCo() {
        return this.biv;
    }

    public final void ac(float f2) {
        this.biv = f2;
    }

    public final ldv[] aCx() {
        return this.biw;
    }

    public final void c(ldv[] ldvArray) {
        this.biw = ldvArray;
    }

    public final void fd(boolean bl) {
        this.dWH = bl;
    }

    @Override
    public void cleanUp() {
        assert (this.dWK != null);
        super.cleanUp();
        if (this.dWJ != null) {
            this.aCy();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dWK = (bwo)lea.eoj().get(this.biq);
        if (this.dWK == null) {
            lfn.b(5, "SFMissileObject", "initialize() No missileinfo with MissileInfoType=" + this.biq + " found.");
            this.selfDestruct();
            return;
        }
        if (this.dwG) {
            this.bit = this.bit == 0.0f ? this.dWK.aCn() : this.dWK.aCn();
            this.biv = this.dWK.aCk() ? (this.biv == 0.0f ? this.dWK.aCo() : this.dWK.aCo()) : (this.biv == 0.0f ? this.dWK.aCl() : this.dWK.aCl());
        } else {
            assert (this.bit > 0.0f);
            assert (this.biv > 0.0f);
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 6144: {
                this.a((kxe)ktv2);
                break;
            }
            case 6145: {
                this.b((kxe)ktv2);
                break;
            }
            case 6146: {
                this.b((kxe)ktv2);
                break;
            }
            default: {
                lfn.b(5, "SFMissileObject", "receiveResponse() Unhandled response received: " + ktv2.getClass().getName());
                return;
            }
        }
    }

    protected final void a(int n, ldv ldv2, boolean bl, ljq ljq2) {
        if (n <= 0) {
            assert (false);
            return;
        }
        ldv ldv3 = null;
        ldv3 = this.dwG ? lcr.qEb : lcr.qEa;
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, ldv3);
        glh2.setSpecialEffectType(n);
        glh2.my(ldv2);
        glh2.mk(ldv2 != null);
        glh2.JQ(this.dWI);
        if (bl) {
            assert (this.Position != null);
            glh2.setTargetPosition(new ljq(this.Position));
        } else {
            assert (this.dwG);
            glh2.setTargetPosition(new ljq(ljq2));
        }
        if ((this.dWI & 2) > 0) {
            assert (this.Position != null);
            glh2.setSourcePosition(this.Position);
        }
        if ((this.dWI & 4) > 0) {
            assert (this.Rotation != null);
            glh2.setSourceRotation(new lgl(this.Rotation));
        }
        if (this.biu > 0.0f) {
            assert (this.biu <= 1.0f);
            glh2.JQ(glh2.bVL() | 0x10);
            glh2.setPower(this.biu);
            glh2.setPowerRadius(0.0f);
        }
        this.MessageDelegator.F(glh2);
    }

    protected final void a(int n, bws.a a2, boolean bl) {
        assert (this.dWK != null);
        if (this.dWK.aCp() == null) {
            return;
        }
        bwt[] bwtArray = this.dWK.aCp();
        int n2 = bwtArray.length;
        for (int i = 0; i < n2; ++i) {
            if (bwtArray[i].dWW != n) continue;
            switch (n) {
                case 1: 
                case 2: {
                    this.a(bwtArray[i].SpecialEffectType, null, false, a2.getTargetPosition());
                    return;
                }
                case 3: {
                    this.a(bwtArray[i].SpecialEffectType, null, true, a2.getTargetPosition());
                    return;
                }
            }
            lfn.b(5, "SFMissileObject", "startMissileSpecialEffect() Invalid missilestate provided: " + n);
            assert (false);
            return;
        }
    }

    protected final void ka(ldv ldv2) {
        assert (this.dWK != null);
        kri kri2 = (kri)this.MessageDelegator.h(2309);
        kri2.ec = this.GUID;
        kri2.aCE = this.GUID;
        kri2.dsK = true;
        kri2.iBr = true;
        kri2.pYp = true;
        kri2.Position = this.Position;
        kri2.Rotation = this.Rotation;
        kri2.bis = this.bis;
        kri2.bit = this.bit;
        kri2.akO = this.dWK.aCc();
        if (this.dWH) {
            kri2.pCY = 14;
        }
        kri2.gEV = this.dwG ? (float)this.MessageDelegator.arc().rgz : (float)this.bir;
        kri2.dWA = this.dWK.aCm() * this.biy;
        kri2.biv = this.biv;
        kri2.bzb = this.dWK.getMaxVelocity();
        kri2.pXM = new ljq();
        kri2.dWx = this.dWK.aCj();
        kri2.pXS = this.bix == 0.0f ? new ljq(0.0f, 0.0f, 0.0f) : new ljq(-0.5, (double)-0.4f, 0.0);
        kri2.bix = this.bix;
        if (this.dwG) {
            kri2.pXN = true;
            if (this.biw != null) {
                kri2.pXP = true;
                kri2.biw = this.biw;
            } else {
                kri2.pXP = false;
                kri2.biw = new ldv[0];
            }
            if (ldv2 != null) {
                kri2.pXO = true;
                kri2.Rs = ldv2;
                kri2.atv = ldv2;
            } else {
                kri2.pXO = false;
                kri2.Rs = ldv.rfd;
                kri2.atv = ldv.rfd;
            }
        } else {
            kri2.pXN = false;
            kri2.pXP = false;
            kri2.biw = new ldv[0];
            if (ldv2 != null) {
                kri2.pXO = true;
                kri2.Rs = ldv2;
                kri2.atv = ldv2;
            } else {
                kri2.pXO = false;
                kri2.Rs = ldv.rfd;
                kri2.atv = ldv.rfd;
            }
        }
        this.MessageDelegator.a(kri2);
    }

    protected final void createVelocityAutoTimer(ldv ldv2) {
        assert (this.dWK != null);
        krj krj2 = (krj)this.MessageDelegator.h(2308);
        krj2.ec = this.GUID;
        krj2.aCE = this.GUID;
        krj2.dsK = true;
        krj2.iBr = true;
        krj2.pYp = true;
        krj2.Position = this.Position;
        krj2.Rotation = this.Rotation;
        krj2.bis = this.bis;
        krj2.bit = this.bit;
        krj2.akO = this.dWK.aCc();
        krj2.pXT = this.biv;
        krj2.pXS = this.bix == 0.0f ? new ljq(0.0f, 0.0f, 0.0f) : new ljq(-0.5, (double)-0.4f, 0.0);
        krj2.bix = this.bix;
        krj2.pXR = this.dWK.aCu();
        if (this.dWH) {
            krj2.pCY = 14;
        }
        krj2.gEV = this.dwG ? (float)this.MessageDelegator.arc().rgz : (float)this.bir;
        if (this.dwG) {
            krj2.pXN = true;
            if (this.biw != null) {
                krj2.pXP = true;
                krj2.biw = this.biw;
            } else {
                krj2.pXP = false;
                krj2.biw = new ldv[0];
            }
            if (ldv2 != null) {
                krj2.pXO = true;
                krj2.Rs = ldv2;
                krj2.atv = ldv2;
            } else {
                krj2.pXO = false;
                krj2.Rs = ldv.rfd;
                krj2.atv = ldv.rfd;
            }
        } else {
            if (this.dWK.zg() == cxd.fKQ) {
                krj2.pXN = true;
                if (this.biw != null) {
                    krj2.pXP = true;
                    krj2.biw = this.biw;
                } else {
                    krj2.pXP = false;
                    krj2.biw = new ldv[0];
                }
            } else {
                krj2.pXN = false;
                krj2.pXP = false;
                krj2.biw = new ldv[0];
            }
            if (ldv2 != null) {
                krj2.pXO = true;
                krj2.Rs = ldv2;
                krj2.atv = ldv2;
            } else {
                krj2.pXO = false;
                krj2.Rs = ldv.rfd;
                krj2.atv = ldv.rfd;
            }
        }
        this.MessageDelegator.a(krj2);
    }

    protected abstract void a(kxd var1);

    protected abstract void a(kxe var1);

    protected abstract void a(kxf var1);

    protected final void aCy() {
        if (this.dWJ == null) {
            return;
        }
        krk krk2 = (krk)this.MessageDelegator.h(2310);
        krk2.ts(this.GUID);
        krk2.mx(this.dWJ);
        this.MessageDelegator.a(krk2);
        this.dWJ = null;
        this.dWL = true;
    }

    protected final void aCz() {
        if (this.dWJ == null) {
            return;
        }
        krk krk2 = (krk)this.MessageDelegator.h(2310);
        krk2.ts(this.GUID);
        krk2.mx(this.dWJ);
        this.MessageDelegator.a(krk2);
        this.dWJ = null;
        this.dWL = true;
    }

    private void b(kxe kxe2) {
        if (this.dWK.aCu() && this.dWM) {
            return;
        }
        this.dWM = true;
        if (kxe2 instanceof kxd) {
            this.aCy();
            this.a((kxd)kxe2);
        } else {
            if (this.dWK.aCu()) {
                this.aCz();
            }
            this.a((kxf)kxe2);
        }
    }

    public float Bf() {
        return this.bix;
    }

    public void ad(float f2) {
        this.bix = f2;
    }

    public float Bg() {
        return this.biy;
    }

    public void ae(float f2) {
        this.biy = f2;
    }
}

