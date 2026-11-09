/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class did
extends dgj {
    private String gxy = null;
    private String gxz = null;
    private String gxA = null;
    private String gxB = null;
    private float grd = 0.9f;
    private String gxC = null;
    private String gxD = null;
    private String gxE = null;
    private String gxF = null;
    private String gxG = null;
    private boolean gxH = false;
    private lcq gxI = null;
    private lcq gxJ = null;
    private lcq gxK = null;
    private boolean gxL = true;
    private boolean gxM = true;
    private boolean gxN = false;
    private float gxO = 0.5f;
    private float gxP = 0.5f;
    private float gxQ = 0.5f;
    private float gxR = 0.5f;
    private ljq gxS = null;
    private ljq gxT = null;
    private ljq gxU = null;
    private ljq gxV = null;
    private ljq gxW = null;
    private ljq gxX = null;
    private ljq gxY = null;
    private ljq gxZ = null;
    private ljq gya = null;
    private ljq gyb = null;
    private ljq gyc = null;
    private ljq gyd = null;
    private float gye = 1.0f;
    private float gyf = 1.0f;
    private float gyg = 1.0f;
    private float gyh = 1.0f;
    private float gyi = 1.0f;
    private float gyj = 1.0f;
    private boolean gyk = false;
    private boolean gyl = false;
    private boolean gym = false;
    private float gyn = 1.0f;
    private boolean gyo = true;
    private boolean gyp = false;
    private boolean gyq = false;
    private boolean gyr = false;
    private boolean gys = false;
    private boolean gyt = false;
    private boolean gyu = false;
    private ljq gyv = null;
    private ljq gyw = null;
    private float gyx = 0.0f;
    private float gyy = 0.0f;
    private float gyz = 0.1f;
    private int gyA = 0;
    private dfm[] gyB = null;
    private dkx[] gyC = null;
    private double[] gyD = null;
    private double[] gyE = null;
    private lgl[] gyF = null;
    private lgl[] gyG = null;
    private lgl[] gyH = null;
    private ljq[] gyI = null;
    private ljq[] gyJ = null;
    private ljq[] gyK = null;
    private float[] gyL = null;
    private float[] gyM = null;
    private float[] gyN = null;
    private String[] gyO = null;
    private boolean[] gyP = null;
    private boolean[] gyQ = null;
    private double[] gyR = null;
    private boolean gyS = false;

    did() {
        this.gqB = 78;
    }

    private String getMeshXML(int n2) {
        switch (n2) {
            case 0: {
                return this.gxC;
            }
            case 1: {
                return this.gxD;
            }
            case 2: {
                return this.gxE;
            }
            case 3: {
                return this.gxF;
            }
            case 4: {
                return this.gxG;
            }
        }
        return this.gxC;
    }

    private void checkInitialConditions() {
        int n2;
        if (this.gyA <= 0) {
            return;
        }
        this.gyD = new double[this.gyA];
        this.gyE = new double[this.gyA];
        this.gyF = new lgl[this.gyA];
        this.gyG = new lgl[this.gyA];
        this.gyH = new lgl[this.gyA];
        this.gyI = new ljq[this.gyA];
        this.gyJ = new ljq[this.gyA];
        this.gyK = new ljq[this.gyA];
        this.gyL = new float[this.gyA];
        this.gyM = new float[this.gyA];
        this.gyN = new float[this.gyA];
        this.gyO = new String[this.gyA];
        this.gyP = new boolean[this.gyA];
        this.gyQ = new boolean[this.gyA];
        this.gyR = new double[this.gyA];
        int n3 = 1;
        if (this.gxD != null && !this.gxD.equalsIgnoreCase("")) {
            ++n3;
            if (this.gxE != null && !this.gxE.equalsIgnoreCase("")) {
                ++n3;
                if (this.gxF != null && !this.gxF.equalsIgnoreCase("")) {
                    ++n3;
                    if (this.gxG != null && !this.gxG.equalsIgnoreCase("")) {
                        ++n3;
                    }
                }
            }
        }
        this.gyS = false;
        for (n2 = 0; n2 < this.gyA; ++n2) {
            Object object;
            this.gyP[n2] = false;
            this.gyQ[n2] = false;
            this.gyD[n2] = n2 == 0 ? this.fC.rgz : this.fC.rgz + (double)(lew.aj(this.gxR, this.gxQ) * (float)n2);
            this.gyE[n2] = lew.aj(this.gxP, this.gxO);
            ljq ljq2 = new ljq(this.gyv);
            ljq2.nm(n2);
            lgl lgl2 = new lgl(ljq2);
            this.gyF[n2] = new lgl(ljq.B(this.gxY, this.gxZ));
            if (this.gys) {
                this.gyF[n2].Y(lgl2);
            }
            this.gyG[n2] = new lgl(ljq.B(this.gya, this.gyb));
            if (this.gyt) {
                this.gyG[n2].Y(lgl2);
            }
            this.gyH[n2] = new lgl(ljq.B(this.gyc, this.gyd));
            if (this.gyu) {
                this.gyH[n2].Y(lgl2);
            }
            this.gyL[n2] = lew.aj(this.gye, this.gyf) + this.gyx * (float)n2;
            this.gyM[n2] = lew.aj(this.gyg, this.gyh) + this.gyy * (float)n2;
            this.gyN[n2] = lew.aj(this.gyi, this.gyj) + this.gyz * (float)n2;
            this.gyO[n2] = !this.gxH ? ((object = this.getMeshXML(n2)) != null && !((String)object).equalsIgnoreCase("") ? object : this.gxC) : this.getMeshXML(lew.fW(0, n3));
            ljq2 = new ljq(this.gyw);
            ljq2.nm(n2);
            this.gyI[n2] = ljq.B(this.gxS, this.gxT);
            if (this.gyp) {
                this.gyI[n2].es(ljq2);
            }
            if (this.gxN) {
                object = new lgl(0.0f, (float)(Math.PI * 2 * Math.random()), 0.0f);
                this.gyI[n2] = ((lgl)object).eq(this.gyI[n2]);
            }
            this.gyJ[n2] = ljq.B(this.gxU, this.gxV);
            if (this.gyq) {
                this.gyJ[n2].es(ljq2);
            }
            this.gyK[n2] = ljq.B(this.gxW, this.gxX);
            if (!this.gyr) continue;
            this.gyK[n2].es(ljq2);
        }
        if (!this.gyo) {
            for (n2 = 1; n2 < this.gyA; ++n2) {
                this.gyI[n2] = this.gyI[0];
                this.gyJ[n2] = this.gyJ[0];
            }
        }
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkRelations();
        this.checkPositions();
        this.checkFinals();
        this.checkMeshFadeOut();
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeMeshes();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.checkInitialConditions();
        this.createMeshes();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        did did2 = (did)dgj2;
        did2.gxy = this.gxy;
        did2.gxz = this.gxz;
        did2.gxA = this.gxA;
        did2.gxB = this.gxB;
        did2.grd = this.grd;
        did2.gxC = this.gxC;
        did2.gxD = this.gxD;
        did2.gxE = this.gxE;
        did2.gxF = this.gxF;
        did2.gxG = this.gxG;
        did2.gxH = false;
        did2.gxI = this.gxI;
        did2.gxJ = this.gxJ;
        did2.gxK = this.gxK;
        did2.gxL = this.gxL;
        did2.gxM = this.gxM;
        did2.gxN = this.gxN;
        did2.gxO = this.gxO;
        did2.gxP = this.gxP;
        did2.gxQ = this.gxQ;
        did2.gxR = this.gxR;
        did2.gxS = this.gxS;
        did2.gxT = this.gxT;
        did2.gxU = this.gxU;
        did2.gxV = this.gxV;
        did2.gxW = this.gxW;
        did2.gxX = this.gxX;
        did2.gxY = this.gxY;
        did2.gxZ = this.gxZ;
        did2.gya = this.gya;
        did2.gyb = this.gyb;
        did2.gyc = this.gyc;
        did2.gyd = this.gyd;
        did2.gye = this.gye;
        did2.gyf = this.gyf;
        did2.gyg = this.gyg;
        did2.gyh = this.gyh;
        did2.gyi = this.gyi;
        did2.gyj = this.gyj;
        did2.gyo = this.gyo;
        did2.gyp = this.gyp;
        did2.gyq = this.gyq;
        did2.gyr = this.gyr;
        did2.gys = this.gys;
        did2.gyt = this.gyt;
        did2.gyu = this.gyu;
        did2.gyv = this.gyv;
        did2.gyw = this.gyw;
        did2.gyx = this.gyx;
        did2.gyy = this.gyy;
        did2.gyz = this.gyz;
        did2.gyA = this.gyA;
        did2.gyk = this.gyk;
        did2.gyl = this.gyl;
        did2.gym = this.gym;
        did2.gyn = this.gyn;
    }

    public void setDefaultValues() {
        this.gxy = null;
        this.gxz = null;
        this.gxA = null;
        this.gxB = null;
        this.grd = 0.9f;
        this.gxC = null;
        this.gxD = null;
        this.gxE = null;
        this.gxF = null;
        this.gxG = null;
        this.gxH = false;
        this.gxI = lcq.BRIGHT_WHITE;
        this.gxJ = lcq.BRIGHT_WHITE;
        this.gxK = lcq.BRIGHT_WHITE;
        this.gxL = true;
        this.gxM = true;
        this.gxN = false;
        this.gxO = 0.5f;
        this.gxP = 0.5f;
        this.gxQ = 0.5f;
        this.gxR = 0.5f;
        this.gxS = new ljq();
        this.gxT = new ljq();
        this.gxU = new ljq();
        this.gxV = new ljq();
        this.gxW = new ljq();
        this.gxX = new ljq();
        this.gxY = new ljq();
        this.gxZ = new ljq();
        this.gya = new ljq();
        this.gyb = new ljq();
        this.gyc = new ljq();
        this.gyd = new ljq();
        this.gye = 1.0f;
        this.gyf = 1.0f;
        this.gyg = 1.0f;
        this.gyh = 1.0f;
        this.gyi = 1.0f;
        this.gyj = 1.0f;
        this.gyo = true;
        this.gyp = false;
        this.gyq = false;
        this.gyr = true;
        this.gys = false;
        this.gyt = false;
        this.gyu = true;
        this.gyv = new ljq();
        this.gyw = new ljq();
        this.gyx = 0.0f;
        this.gyy = 0.0f;
        this.gyz = 0.1f;
        this.gyA = 1;
        this.gyk = false;
        this.gyl = false;
        this.gym = false;
        this.gyn = 1.0f;
    }

    private void createMeshes() {
        this.gyB = new dfm[this.gyA];
        for (int i2 = 0; i2 < this.gyA; ++i2) {
            this.gyB[i2] = this.createMesh(i2);
        }
    }

    private dfm createMesh(int n2) {
        dfm dfm2 = null;
        dfm2 = (dfm)dKP.Af(11);
        if (n2 == 0) {
            dfm2.setGUID(this.getMainAtomGuid());
        } else {
            dfm2.setGUID(this.getNewEffectGuid());
        }
        dfm2.setActive(true);
        dfm2.setDefaultValues();
        dfm2.setMeshXML(this.gyO[n2]);
        ljq ljq2 = new ljq(this.getTargetPosition());
        ljq2.es(this.gyI[n2]);
        dfm2.c(ljq2);
        dfm2.a(this.gyF[n2]);
        if (this.gxM) {
            lcq lcq2 = new lcq(this.gxI.r, this.gxI.g, this.gxI.b, 0.0f);
            dfm2.n(lcq2);
        } else {
            dfm2.n(this.gxI);
        }
        if (this.gyL[n2] != 1.0f) {
            dfm2.setScale(this.gyL[n2]);
        }
        this.MessageDelegator.a(dfm2);
        return dfm2;
    }

    private void checkRelations() {
        int n2;
        if (!this.isRelationEffect()) {
            return;
        }
        if (this.gyC != null) {
            return;
        }
        if (this.gyB.length == 0) {
            return;
        }
        boolean bl = true;
        for (n2 = 0; n2 < this.gyA; ++n2) {
            if (this.gyB[n2].blt()) continue;
            bl = false;
            break;
        }
        if (!bl) {
            return;
        }
        this.gyC = new dkx[this.gyA];
        for (n2 = 0; n2 < this.gyA; ++n2) {
            this.gyC[n2] = this.createRelation(n2, this.gyB[n2]);
        }
    }

    private dkx createRelation(int n2, dfm dfm2) {
        dkx dkx2 = this.setupPositionalRelation(this.getTargetObjectGUID(), dfm2.getGUID(), this.getMainEffectObjectType());
        dkx2.setDeltaPos(this.gyI[n2]);
        dkx2.setDeltaRot(this.gyF[n2]);
        return dkx2;
    }

    private void checkFinals() {
        if (!this.gym && !this.gyl & !this.gyk) {
            return;
        }
        for (int i2 = 0; i2 < this.gyA; ++i2) {
            if (!this.gyQ[i2]) continue;
            float f2 = (float)(this.MessageDelegator.arc().rgz - this.fC.rgz + this.gyR[i2]) * this.gyn;
            float f3 = mfw.S(0, f2);
            if (this.gyk) {
                float f4 = ldq.o(this.gyi, this.gyN[i2], f3);
                this.gyB[i2].setScale(f4);
            }
            if (this.gyl) {
                lgl lgl2 = lgl.b(new lgl(this.gyc), this.gyH[i2], f3);
                this.updateMeshPositionRotation(i2, null, lgl2);
            }
            if (!this.gym) continue;
            ljq ljq2 = ljq.e(this.gxW, this.gyK[i2], f3);
            this.updateMeshPositionRotation(i2, ljq2, null);
        }
    }

    private void checkPositions() {
        if (this.gyS) {
            return;
        }
        if (this.gyB.length == 0) {
            return;
        }
        for (int i2 = 0; i2 < this.gyA; ++i2) {
            float f2;
            if (!this.gyB[i2].blt() || this.gyD[i2] > this.MessageDelegator.arc().rgz) continue;
            if (!this.gyP[i2]) {
                this.gyP[i2] = true;
                this.gyB[i2].n(this.gxI);
                ljq ljq2 = new ljq(this.gyI[i2]);
                ljq2.es(this.getTargetPosition());
                if (this.isRelationEffect()) {
                    this.startGenericRelationEffect(this.gxB, ljq2, this.getTargetObjectGUID());
                } else {
                    this.startGenericMainEffect(this.gxB, ljq2);
                }
            }
            if (this.gyQ[i2]) continue;
            float f3 = (float)((this.MessageDelegator.arc().rgz - this.gyD[i2]) / this.gyE[i2]);
            f3 = lew.A(f3, 0.0f, 1.0f);
            if (this.gxL) {
                f3 *= f3;
            }
            float f4 = mfv.k(this.gyL[i2], this.gyM[i2], this.gyN[i2], f3);
            lcq lcq2 = mfv.a(this.gxI, this.gxJ, this.gxK, f3);
            lgl lgl2 = mfv.a(this.gyF[i2], this.gyG[i2], this.gyH[i2], f3);
            ljq ljq3 = mfv.f(this.gyI[i2], this.gyJ[i2], this.gyK[i2], f3);
            this.gyB[i2].setScale(f4);
            this.gyB[i2].n(lcq2);
            this.updateMeshPositionRotation(i2, ljq3, lgl2);
            if (!(f3 >= 1.0f)) continue;
            double d2 = this.MessageDelegator.arc().rgz - this.gyD[i2];
            float f5 = f2 = 1.5707964f / this.gyn - (float)(d2 / Math.PI);
            this.gyR[i2] = f5;
            this.gyQ[i2] = true;
            ljq ljq4 = new ljq(ljq3);
            ljq4.es(this.getTargetPosition());
            if (this.isRelationEffect()) {
                this.startGenericRelationEffect(this.gxy, ljq4, this.getTargetObjectGUID());
            } else {
                this.startGenericMainEffect(this.gxy, ljq4);
            }
            boolean bl = true;
            for (int i3 = 0; i3 < this.gyA; ++i3) {
                if (this.gyQ[i3]) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            this.gyS = true;
            if (this.isRelationEffect()) {
                this.startGenericRelationEffect(this.gxz, ljq4, this.getTargetObjectGUID());
                continue;
            }
            this.startGenericMainEffect(this.gxz, ljq4);
        }
    }

    private void updateMeshPositionRotation(int n2, ljq ljq2, lgl lgl2) {
        if (this.gyB == null) {
            return;
        }
        if (this.gyC == null) {
            return;
        }
        dfm dfm2 = this.gyB[n2];
        if (this.isRelationEffect()) {
            dkx dkx2 = this.gyC[n2];
            if (ljq2 != null) {
                dkx2.setDeltaPos(ljq2);
            }
            if (lgl2 != null) {
                dkx2.setDeltaRot(lgl2);
            }
        } else {
            if (ljq2 != null) {
                ljq ljq3 = new ljq(ljq2);
                ljq3.es(this.getTargetPosition());
                dfm2.c(ljq3);
            }
            if (lgl2 != null) {
                dfm2.a(lgl2);
            }
        }
    }

    private void checkMeshFadeOut() {
        if (this.hasInfiniteDuration()) {
            return;
        }
        if (this.gyB == null) {
            return;
        }
        if ((double)this.grd < 1.0) {
            double d2 = this.MessageDelegator.arc().rgz - this.fC.rgz;
            float f2 = (float)(d2 / (double)this.getDuration());
            if (f2 < this.grd) {
                return;
            }
            float f3 = (f2 - this.grd) / (1.0f - this.grd);
            f3 = lew.A(f3, 0.0f, 1.0f);
            lcq lcq2 = new lcq(this.gxK.r, this.gxK.g, this.gxK.b, 0.0f);
            lcq lcq3 = lcq.a(this.gxK, lcq2, f3);
            for (int i2 = 0; i2 < this.gyB.length; ++i2) {
                dfm dfm2 = this.gyB[i2];
                dfm2.n(lcq3);
            }
        }
    }

    private void removeMeshes() {
        if (this.gyB == null) {
            return;
        }
        for (int i2 = 0; i2 < this.gyB.length; ++i2) {
            dfm dfm2 = this.gyB[i2];
            if (dfm2 == null) continue;
            dey.bls().b(dfm2);
        }
        this.gyB = null;
    }

    public String getMeshImpactEffectName() {
        return this.gxy;
    }

    public void setMeshImpactEffectName(String string) {
        this.gxy = string;
    }

    public String getFinalEffectName() {
        return this.gxz;
    }

    public void setFinalEffectName(String string) {
        this.gxz = string;
    }

    public String getMeshRelationEffectName() {
        return this.gxA;
    }

    public void setMeshRelationEffectName(String string) {
        this.gxA = string;
    }

    public String getMeshStartEffectName() {
        return this.gxB;
    }

    public void setMeshStartEffectName(String string) {
        this.gxB = string;
    }

    public float getFadeOutTimePercent() {
        return this.grd;
    }

    public void setFadeOutTimePercent(float f2) {
        this.grd = f2;
    }

    public String getMeshXML1() {
        return this.gxC;
    }

    public void setMeshXML1(String string) {
        this.gxC = string;
    }

    public String getMeshXML2() {
        return this.gxD;
    }

    public void setMeshXML2(String string) {
        this.gxD = string;
    }

    public String getMeshXML3() {
        return this.gxE;
    }

    public void setMeshXML3(String string) {
        this.gxE = string;
    }

    public String getMeshXML4() {
        return this.gxF;
    }

    public void setMeshXML4(String string) {
        this.gxF = string;
    }

    public String getMeshXML5() {
        return this.gxG;
    }

    public void setMeshXML5(String string) {
        this.gxG = string;
    }

    public boolean isUseRandomMeshXML() {
        return this.gxH;
    }

    public void setUseRandomMeshXML(boolean bl) {
        this.gxH = bl;
    }

    public lcq getMeshColor1() {
        return this.gxI;
    }

    public void setMeshColor1(lcq lcq2) {
        this.gxI = lcq2;
    }

    public lcq getMeshColor2() {
        return this.gxJ;
    }

    public void setMeshColor2(lcq lcq2) {
        this.gxJ = lcq2;
    }

    public lcq getMeshColor3() {
        return this.gxK;
    }

    public void setMeshColor3(lcq lcq2) {
        this.gxK = lcq2;
    }

    public boolean isNonLinearAnimation() {
        return this.gxL;
    }

    public void setNonLinearAnimation(boolean bl) {
        this.gxL = bl;
    }

    public boolean isStartAnimationWithTransparentColor() {
        return this.gxM;
    }

    public void setStartAnimationWithTransparentColor(boolean bl) {
        this.gxM = bl;
    }

    public boolean isUseRandomRotationOfStartPosition() {
        return this.gxN;
    }

    public void setUseRandomRotationOfStartPosition(boolean bl) {
        this.gxN = bl;
    }

    public float getMaxMeshAnimateTime() {
        return this.gxO;
    }

    public void setMaxMeshAnimateTime(float f2) {
        this.gxO = f2;
    }

    public float getMinMeshAnimateTime() {
        return this.gxP;
    }

    public void setMinMeshAnimateTime(float f2) {
        this.gxP = f2;
    }

    public float getMaxWaitTime() {
        return this.gxQ;
    }

    public void setMaxWaitTime(float f2) {
        this.gxQ = f2;
    }

    public float getMinWaitTime() {
        return this.gxR;
    }

    public void setMinWaitTime(float f2) {
        this.gxR = f2;
    }

    public ljq getMinStartPosition() {
        return this.gxS;
    }

    public void setMinStartPosition(ljq ljq2) {
        this.gxS = ljq2;
    }

    public ljq getMaxStartPosition() {
        return this.gxT;
    }

    public void setMaxStartPosition(ljq ljq2) {
        this.gxT = ljq2;
    }

    public ljq getMinMidPosition() {
        return this.gxU;
    }

    public void setMinMidPosition(ljq ljq2) {
        this.gxU = ljq2;
    }

    public ljq getMaxMidPosition() {
        return this.gxV;
    }

    public void setMaxMidPosition(ljq ljq2) {
        this.gxV = ljq2;
    }

    public ljq getMinEndPosition() {
        return this.gxW;
    }

    public void setMinEndPosition(ljq ljq2) {
        this.gxW = ljq2;
    }

    public ljq getMaxEndPosition() {
        return this.gxX;
    }

    public void setMaxEndPosition(ljq ljq2) {
        this.gxX = ljq2;
    }

    public ljq getMinStartRotation() {
        return this.gxY;
    }

    public void setMinStartRotation(ljq ljq2) {
        this.gxY = ljq2;
    }

    public ljq getMaxStartRotation() {
        return this.gxZ;
    }

    public void setMaxStartRotation(ljq ljq2) {
        this.gxZ = ljq2;
    }

    public ljq getMinMidRotation() {
        return this.gya;
    }

    public void setMinMidRotation(ljq ljq2) {
        this.gya = ljq2;
    }

    public ljq getMaxMidRotation() {
        return this.gyb;
    }

    public void setMaxMidRotation(ljq ljq2) {
        this.gyb = ljq2;
    }

    public ljq getMinEndRotation() {
        return this.gyc;
    }

    public void setMinEndRotation(ljq ljq2) {
        this.gyc = ljq2;
    }

    public ljq getMaxEndRotation() {
        return this.gyd;
    }

    public void setMaxEndRotation(ljq ljq2) {
        this.gyd = ljq2;
    }

    public float getMinStartScale() {
        return this.gye;
    }

    public void setMinStartScale(float f2) {
        this.gye = f2;
    }

    public float getMaxStartScale() {
        return this.gyf;
    }

    public void setMaxStartScale(float f2) {
        this.gyf = f2;
    }

    public float getMinMidScale() {
        return this.gyg;
    }

    public void setMinMidScale(float f2) {
        this.gyg = f2;
    }

    public float getMaxMidScale() {
        return this.gyh;
    }

    public void setMaxMidScale(float f2) {
        this.gyh = f2;
    }

    public float getMinEndScale() {
        return this.gyi;
    }

    public void setMinEndScale(float f2) {
        this.gyi = f2;
    }

    public float getMaxEndScale() {
        return this.gyj;
    }

    public void setMaxEndScale(float f2) {
        this.gyj = f2;
    }

    public boolean isUseRandomPositionValuesForEachMeshIndividually() {
        return this.gyo;
    }

    public void setUseRandomPositionValuesForEachMeshIndividually(boolean bl) {
        this.gyo = bl;
    }

    public boolean isUseOffsetPositionOnStartPosition() {
        return this.gyp;
    }

    public void setUseOffsetPositionOnStartPosition(boolean bl) {
        this.gyp = bl;
    }

    public boolean isUseOffsetPositionOnMidPosition() {
        return this.gyq;
    }

    public void setUseOffsetPositionOnMidPosition(boolean bl) {
        this.gyq = bl;
    }

    public boolean isUseOffsetPositionOnEndPosition() {
        return this.gyr;
    }

    public void setUseOffsetPositionOnEndPosition(boolean bl) {
        this.gyr = bl;
    }

    public boolean isUseOffsetRotationOnStartRotation() {
        return this.gys;
    }

    public void setUseOffsetRotationOnStartRotation(boolean bl) {
        this.gys = bl;
    }

    public boolean isUseOffsetRotationOnMidRotation() {
        return this.gyt;
    }

    public void setUseOffsetRotationOnMidRotation(boolean bl) {
        this.gyt = bl;
    }

    public boolean isUseOffsetRotationOnEndRotation() {
        return this.gyu;
    }

    public void setUseOffsetRotationOnEndRotation(boolean bl) {
        this.gyu = bl;
    }

    public ljq getMeshOffsetRotation() {
        return this.gyv;
    }

    public void setMeshOffsetRotation(ljq ljq2) {
        this.gyv = ljq2;
    }

    public ljq getMeshOffsetPosition() {
        return this.gyw;
    }

    public void setMeshOffsetPosition(ljq ljq2) {
        this.gyw = ljq2;
    }

    public float getMeshStartScaleExtra() {
        return this.gyx;
    }

    public void setMeshStartScaleExtra(float f2) {
        this.gyx = f2;
    }

    public float getMeshMidScaleExtra() {
        return this.gyy;
    }

    public void setMeshMidScaleExtra(float f2) {
        this.gyy = f2;
    }

    public float getMeshEndScaleExtra() {
        return this.gyz;
    }

    public void setMeshEndScaleExtra(float f2) {
        this.gyz = f2;
    }

    public int getNumberOfMeshes() {
        return this.gyA;
    }

    public void setNumberOfMeshes(int n2) {
        this.gyA = n2;
    }

    public boolean isLerpFinalScale() {
        return this.gyk;
    }

    public void setLerpFinalScale(boolean bl) {
        this.gyk = bl;
    }

    public boolean isLerpFinalRotation() {
        return this.gyl;
    }

    public void setLerpFinalRotation(boolean bl) {
        this.gyl = bl;
    }

    public boolean isLerpFinalPosition() {
        return this.gym;
    }

    public void setLerpFinalPosition(boolean bl) {
        this.gym = bl;
    }

    public float getLerpFinalFrequency() {
        return this.gyn;
    }

    public void setLerpFinalFrequency(float f2) {
        this.gyn = f2;
    }

    public dey getAtom(int n2) {
        if (this.gyB == null) {
            return null;
        }
        return this.gyB[n2];
    }

    public int getAtomCount() {
        if (this.gyB == null) {
            return 0;
        }
        return this.gyB.length;
    }
}

