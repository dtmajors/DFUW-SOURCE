/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  dgj
 */
import java.util.List;

public class dhv
extends dgj {
    private dfk gws = null;
    private List<dfk> gwt = null;
    private ljq Position = null;
    private lgl Rotation = null;
    private float gwu = 0.1f;
    private float gwv = 0.1f;
    private float dum = 10.0f;
    private float dKD = 1.0f;
    private float gww = 0.1f;
    private float gwx = 0.15f;
    private boolean gwy = true;
    private boolean gwz = false;
    private int gwA = 2;
    private float gwB = 1.0f;
    private float gwC = 1.0f;
    private int gwD = 4;
    private float gwE = 0.19634955f;
    private boolean gwF = false;
    private lcq gwG = null;
    private boolean gwH = true;
    private String fFC = null;
    private boolean gwI = false;
    private boolean gwJ = false;
    private boolean gwK = true;
    private double gvp;
    private double gvq;
    private int gwL = 0;
    private boolean gwM = false;
    private String tt = null;
    final List<ldv> gwN = lcn.emv();
    mgd gwO = null;

    public String getFrameName() {
        return this.tt;
    }

    public void setFrameName(String string) {
        this.tt = string;
    }

    dhv() {
        this.gqB = 7;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.removeObjects();
        this.removeAttachPointRelations();
        this.tt = null;
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.updateObjects();
        if (this.tt != null && !this.gwN.isEmpty()) {
            this.setAnimatedFramePositionalRelation(this.gws.getGUID(), this.gwN.get(0), true);
            if (this.gwt != null && !this.gwt.isEmpty()) {
                int n2 = 1;
                for (dfk dfk2 : this.gwt) {
                    this.setAnimatedFramePositionalRelation(dfk2.getGUID(), this.gwN.get(n2), true);
                }
            }
        }
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        this.Position = this.getTargetPosition() != null ? this.getTargetPosition() : new ljq();
        this.Rotation = this.getSourceRotation() != null ? this.getSourceRotation() : new lgl();
        this.createObjects();
        if (this.isRelationEffect()) {
            if (this.tt == null) {
                this.setDeltaPos(this.getSourcePosition());
                this.setupPositionalRelation(this.getTargetObjectGUID(), this.gws.getGUID(), this.getMainEffectObjectType());
            } else {
                ldv ldv2 = this.getNewEffectGuid();
                this.gwN.add(ldv2);
                this.setAnimatedFramePositionalRelation(this.gws.getGUID(), ldv2, false);
            }
            if (this.gwt != null && !this.gwt.isEmpty()) {
                for (dfk dfk2 : this.gwt) {
                    if (this.tt == null) {
                        this.setupPositionalRelation(this.getTargetObjectGUID(), dfk2.getGUID(), this.getMainEffectObjectType());
                        continue;
                    }
                    ldv ldv3 = this.getNewEffectGuid();
                    this.gwN.add(ldv3);
                    this.setAnimatedFramePositionalRelation(dfk2.getGUID(), ldv3, false);
                }
            }
        }
    }

    private void setAnimatedFramePositionalRelation(ldv ldv2, ldv ldv3, boolean bl) {
        Object object;
        float f2 = 0.0f;
        double d2 = 0.0;
        amf amf2 = this.getMessageDelegator().bzx().bzt().d(this.getTargetObjectGUID());
        if (amf2 instanceof bvf) {
            object = (bvf)amf2;
            f2 = object.azC();
            d2 = (double)f2 * Math.PI - 1.5707963267948966;
        }
        object = (knd)this.MessageDelegator.h(775);
        ((khd)object).wD(true);
        ((khd)object).jM(true);
        ((knd)object).aE(false);
        ((khd)object).ts(this.getGUID());
        ((knm)object).qj(this.getTargetObjectGUID());
        ((knm)object).qk(ldv2);
        ((knm)object).kX(ldv3);
        ((knd)object).ak(new ljq(-d2, 3.191592654334851, 0.0));
        ((knd)object).aj(new ljq(0.0, 0.2, -0.1));
        ((knd)object).setFrameName(this.tt);
        ((knd)object).bM(new ljq(1.0f, 1.0f, 1.0f));
        ((knd)object).Jd(bl ? 4 : 1);
        ((knd)object).hco = true;
        this.MessageDelegator.a((khd)object);
    }

    private void removeAttachPointRelations() {
        if (this.gwN.isEmpty()) {
            return;
        }
        for (ldv ldv2 : this.gwN) {
            knd knd2 = (knd)this.MessageDelegator.h(775);
            knd2.wD(false);
            knd2.jM(true);
            knd2.aE(false);
            knd2.ts(this.getGUID());
            knd2.kX(ldv2);
            knd2.Jd(2);
            this.MessageDelegator.a(knd2);
        }
        this.gwN.clear();
    }

    protected void createObjects() {
        if (!this.hasInfiniteDuration()) {
            this.gvp = this.getDuration() * this.gwu;
            this.gvq = this.getDuration() * (1.0f - this.gwv);
        }
        this.createPoints();
        this.createLineMesh();
    }

    protected void removeObjects() {
        if (this.gws != null) {
            dey.bls().b(this.gws);
            this.gws = null;
        }
        if (this.gwt != null) {
            for (int i2 = 0; i2 < this.gwt.size(); ++i2) {
                dfk dfk2 = this.gwt.get(i2);
                dey.bls().b(dfk2);
            }
            this.gwt = null;
        }
    }

    protected void updateObjects() {
        this.updatePoints();
    }

    protected void createLineMesh() {
        this.gws = (dfk)dKP.Af(9);
        this.gws.setGUID(this.getMainAtomGuid());
        this.gws.setConstantSize(this.gwF);
        this.gws.m(this.gwG);
        this.gws.setHasTexture(this.gwI);
        this.gws.setTextureName(this.fFC);
        float f2 = 1.0f;
        if (this.hasInfiniteDuration()) {
            this.gws.setLineWidth(this.gwB);
        } else {
            f2 = this.calculateTimeVal(this.gvp, this.gvq);
            float f3 = this.gwB * f2;
            this.gws.setLineWidth(f3);
        }
        this.gws.aD(this.gwO.eyo());
        this.gws.c(this.Position);
        if (this.gwM && this.aZD != null && this.aZH != null) {
            ljq ljq2 = this.aZH.esF();
            ljq2.et(this.aZD);
            ljq2.normalize();
            this.Rotation = lgl.er(ljq2);
        }
        this.gws.a(this.Rotation);
        this.gws.setTransformPoints(this.gwH);
        this.MessageDelegator.a(this.gws);
        if (this.gwL > 0) {
            this.gwt = lcn.emv();
            for (int i2 = 0; i2 < this.gwL; ++i2) {
                dfk dfk2 = (dfk)dKP.Af(9);
                dfk2.setGUID(this.getNewEffectGuid());
                dfk2.setConstantSize(this.gwF);
                dfk2.m(this.gwG);
                dfk2.setHasTexture(this.gwI);
                dfk2.setTextureName(this.fFC);
                if (this.hasInfiniteDuration()) {
                    dfk2.setLineWidth(this.gwC);
                } else {
                    dfk2.setLineWidth(this.gwC * f2);
                }
                dfk2.aD(this.gwO.aea(i2));
                dfk2.c(this.Position);
                dfk2.a(this.Rotation);
                dfk2.setTransformPoints(this.gwH);
                this.MessageDelegator.a(dfk2);
                this.gwt.add(dfk2);
            }
        }
    }

    protected void createPoints() {
        if (this.gwA < 2) {
            this.gwA = 2;
        }
        this.gwL = this.gwD > 0 ? (int)((double)this.gwD * Math.random()) : 0;
        this.gwO = new mgd();
        if (this.gwM && this.aZD != null && this.aZH != null) {
            ljq ljq2 = this.aZD.esF();
            ljq2.et(this.aZH);
            this.dum = ljq2.eqN();
        }
        this.gwO.setLength(this.dum);
        this.gwO.setMaxRadius(this.dKD);
        this.gwO.setMaxNumBranchPoints(this.gwA);
        this.gwO.setMaxRadiusPercentageDeviation(this.gww);
        this.gwO.setMaxNeighBourRadiusPercentageDeviation(this.gwx);
        this.gwO.setYAxisDeviation(this.gwy);
        this.gwO.setXAxisDeviation(this.gwz);
        this.gwO.aeb(this.gwL);
        this.gwO.setAnimateEndPoint(this.gwJ);
        this.gwO.setAnimateSubBranchEndPoint(this.gwK);
        this.gwO.of(0.0f);
        this.gwO.oe(0.0f);
        this.gwO.setMaxSubBranchAngle(this.gwE);
        this.gwO.eyl();
    }

    protected void updatePoints() {
        this.gwO.updatePoints();
        this.gws.aD(this.gwO.eyo());
        float f2 = 1.0f;
        if (!this.hasInfiniteDuration()) {
            f2 = this.calculateTimeVal(this.gvp, this.gvq);
            float f3 = this.gwB * f2;
            this.gws.setLineWidth(f3);
        }
        if (this.gwt != null) {
            for (int i2 = 0; i2 < this.gwt.size(); ++i2) {
                dfk dfk2 = this.gwt.get(i2);
                dfk2.aD(this.gwO.aea(i2));
                if (this.hasInfiniteDuration()) continue;
                float f4 = this.gwC * f2;
                dfk2.setLineWidth(f4);
            }
        }
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhv dhv2 = (dhv)dgj2;
        dhv2.gwu = this.gwu;
        dhv2.gwv = this.gwv;
        dhv2.dum = this.dum;
        dhv2.dKD = this.dKD;
        dhv2.gww = this.gww;
        dhv2.gwx = this.gwx;
        dhv2.gwy = this.gwy;
        dhv2.gwz = this.gwz;
        dhv2.gwA = this.gwA;
        dhv2.gwB = this.gwB;
        dhv2.gwC = this.gwC;
        dhv2.gwD = this.gwD;
        dhv2.gwF = this.gwF;
        dhv2.gwG = this.gwG;
        dhv2.gwH = this.gwH;
        dhv2.fFC = this.fFC;
        dhv2.gwI = this.gwI;
        dhv2.gwE = this.gwE;
        dhv2.gwJ = this.gwJ;
        dhv2.gwK = this.gwK;
        dhv2.gwM = this.gwM;
        dhv2.tt = this.tt;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gwu = 0.1f;
        this.gwv = 0.1f;
        this.dum = 10.0f;
        this.dKD = 1.0f;
        this.gww = 0.1f;
        this.gwx = 0.15f;
        this.gwy = true;
        this.gwz = false;
        this.gwA = 2;
        this.gwB = 1.0f;
        this.gwC = 1.0f;
        this.gwD = 4;
        this.gwF = false;
        this.gwG = lcq.BRIGHT_WHITE;
        this.gwH = true;
        this.fFC = "sfx_lightning_32x32_01.dds";
        this.gwI = true;
        this.gwE = 0.19634955f;
        this.gwK = true;
        this.gwJ = false;
        this.gwM = false;
        this.tt = null;
    }

    public boolean isConstantSize() {
        return this.gwF;
    }

    public void setConstantSize(boolean bl) {
        this.gwF = bl;
    }

    public boolean isHasTexture() {
        return this.gwI;
    }

    public void setHasTexture(boolean bl) {
        this.gwI = bl;
    }

    public float getIntroPercent() {
        return this.gwu;
    }

    public void setIntroPercent(float f2) {
        this.gwu = f2;
    }

    public float getLength() {
        return this.dum;
    }

    public void setLength(float f2) {
        this.dum = f2;
    }

    public lcq getLineColor() {
        return this.gwG;
    }

    public void setLineColor(lcq lcq2) {
        this.gwG = lcq2;
    }

    public float getMainBranchWidth() {
        return this.gwB;
    }

    public void setMainBranchWidth(float f2) {
        this.gwB = f2;
    }

    public float getMaxNeighBourRadiusPercentageDeviation() {
        return this.gwx;
    }

    public void setMaxNeighBourRadiusPercentageDeviation(float f2) {
        this.gwx = f2;
    }

    public int getMaxNumSubBranches() {
        return this.gwD;
    }

    public void setMaxNumSubBranches(int n2) {
        this.gwD = n2;
    }

    public float getMaxRadius() {
        return this.dKD;
    }

    public void setMaxRadius(float f2) {
        this.dKD = f2;
    }

    public float getMaxRadiusPercentageDeviation() {
        return this.gww;
    }

    public void setMaxRadiusPercentageDeviation(float f2) {
        this.gww = f2;
    }

    public int getNumPoints() {
        return this.gwA;
    }

    public void setNumPoints(int n2) {
        this.gwA = n2;
    }

    public float getOuttroPercent() {
        return this.gwv;
    }

    public void setOuttroPercent(float f2) {
        this.gwv = f2;
    }

    public float getSubBranchWidth() {
        return this.gwC;
    }

    public void setSubBranchWidth(float f2) {
        this.gwC = f2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isTransformPoints() {
        return this.gwH;
    }

    public void setTransformPoints(boolean bl) {
        this.gwH = bl;
    }

    public boolean isXAxisDeviation() {
        return this.gwz;
    }

    public void setXAxisDeviation(boolean bl) {
        this.gwz = bl;
    }

    public boolean isYAxisDeviation() {
        return this.gwy;
    }

    public void setYAxisDeviation(boolean bl) {
        this.gwy = bl;
    }

    public float getMaxSubBranchAngle() {
        return this.gwE;
    }

    public void setMaxSubBranchAngle(float f2) {
        this.gwE = f2;
    }

    public boolean isAnimateEndPoint() {
        return this.gwJ;
    }

    public void setAnimateEndPoint(boolean bl) {
        this.gwJ = bl;
    }

    public boolean isAnimateSubbranchEndPoint() {
        return this.gwK;
    }

    public void setAnimateSubbranchEndPoint(boolean bl) {
        this.gwK = bl;
    }

    public boolean isUseSourceTargetPositions() {
        return this.gwM;
    }

    public void setUseSourceTargetPositions(boolean bl) {
        this.gwM = bl;
    }
}

