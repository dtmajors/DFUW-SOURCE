/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Iterator;
import java.util.LinkedList;

public class dhy
extends dgj {
    private int gwU = 10;
    private int gwD = 5;
    private float Radius = 20.0f;
    private float gwV = 100.0f;
    private float gwW = 1.0f;
    private int gwX = 10;
    private float dKD = 1.0f;
    private float gww = 0.1f;
    private float gwx = 0.1f;
    private boolean gwy = true;
    private boolean gwz = true;
    private boolean gwJ = true;
    private boolean gwY = true;
    private float gwZ = 0.7853982f;
    private float gxa = 0.1f;
    private float gxb = 0.1f;
    private boolean gwI = true;
    private String fFC = null;
    private lcq gxc = null;
    private int gxd;
    private int gxe;
    private float gxf;
    private float gxg;
    private float gxh = 0.8f;
    private LinkedList gxi = null;

    dhy() {
        this.gqB = 18;
    }

    protected void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        this.cleanupLightningBeams();
    }

    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        this.checkLightningBeams();
    }

    protected int getMainEffectObjectType() {
        return 1;
    }

    protected void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (this.isRelationEffect()) {
            // empty if block
        }
        this.gxd = this.gwU;
        this.gxe = this.gwD;
        this.gxf = this.gxa;
        this.gxg = this.gxb;
        this.initializeLightningBeams();
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dhy dhy2 = (dhy)dgj2;
        dhy2.gwU = this.gwU;
        dhy2.gwD = this.gwD;
        dhy2.Radius = this.Radius;
        dhy2.gwV = this.gwV;
        dhy2.gwW = this.gwW;
        dhy2.gwX = this.gwX;
        dhy2.dKD = this.dKD;
        dhy2.gww = this.gww;
        dhy2.gwx = this.gwx;
        dhy2.gwy = this.gwy;
        dhy2.gwz = this.gwz;
        dhy2.gwJ = this.gwJ;
        dhy2.gwY = this.gwY;
        dhy2.gwZ = this.gwZ;
        dhy2.gxa = this.gxa;
        dhy2.gxb = this.gxb;
        dhy2.gwI = this.gwI;
        dhy2.fFC = this.fFC;
        dhy2.gxc = this.gxc;
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.gwU = 10;
        this.gwD = 5;
        this.Radius = 20.0f;
        this.gwV = 100.0f;
        this.gwW = 1.0f;
        this.gwX = 10;
        this.dKD = 1.0f;
        this.gww = 0.1f;
        this.gwx = 0.1f;
        this.gwy = true;
        this.gwz = true;
        this.gwJ = true;
        this.gwY = true;
        this.gwZ = 0.7853982f;
        this.gxa = 0.1f;
        this.gxb = 0.1f;
        this.gwI = true;
        this.fFC = null;
        this.gxc = lcq.BRIGHT_WHITE;
    }

    private void initializeLightningBeams() {
        this.gxi = lcn.emA();
        lgl lgl2 = new lgl(1.5707964f, 0.0f, 0.0f);
        for (int i2 = 0; i2 < this.gxd; ++i2) {
            dhv dhv2 = this.createLightningBeam();
            float f2 = lew.eqr();
            ljq ljq2 = new ljq(this.getTargetPosition());
            ljq2.x += f2 * this.Radius;
            f2 = lew.eqr();
            ljq2.rlV += f2 * this.Radius;
            ljq2.y += this.gwV;
            dhv2.setTargetPosition(ljq2);
            dhv2.setSourcePosition(ljq2);
            dhv2.setSourceRotation(lgl2);
            float f3 = (float)((double)this.gwW * Math.random());
            if (f3 < this.gwW / 10.0f) {
                f3 = this.gwW / 10.0f;
            }
            if (!this.hasInfiniteDuration() && f3 > this.getDuration()) {
                f3 = this.getDuration();
            }
            dhv2.setDuration(f3);
            dhv2.setStartTime(this.getStartTime());
            dhv2.nx = this.getStartTime();
            dhv2.initializeSpecialEffect();
            this.gxi.add(dhv2);
        }
    }

    dhv createLightningBeam() {
        dhv dhv2 = new dhv();
        dhv2.setPower(1.0f);
        dhv2.setActive(true);
        dhv2.setAffectCamera(false);
        dhv2.setConstantSize(false);
        dhv2.setContainerManager(null);
        dhv2.setInheritDuration(false);
        dhv2.setRelationEffect(false);
        dhv2.setMainEffect(false);
        dhv2.setMessageDelegator(this.getMessageDelegator());
        dhv2.setServerObject(false);
        dhv2.setHasTexture(this.gwI);
        dhv2.setTextureName(this.fFC);
        dhv2.setIntroPercent(0.0f);
        dhv2.setOuttroPercent(0.5f);
        dhv2.setConstantSize(false);
        float f2 = this.gwV + (float)Math.random() * this.gwV * 0.2f;
        dhv2.setLength(f2);
        dhv2.setLineColor(this.gxc);
        dhv2.setMainBranchWidth(this.gxf);
        dhv2.setSubBranchWidth(this.gxg);
        dhv2.setMaxNeighBourRadiusPercentageDeviation(this.gwx);
        dhv2.setMaxRadiusPercentageDeviation(this.gww);
        dhv2.setMaxRadius(this.dKD);
        dhv2.setMaxSubBranchAngle(this.gwZ);
        dhv2.setNumPoints(this.gwX);
        dhv2.setXAxisDeviation(this.gwz);
        dhv2.setYAxisDeviation(this.gwy);
        dhv2.setAnimateEndPoint(this.gwJ);
        dhv2.setAnimateSubbranchEndPoint(this.gwY);
        dhv2.setTransformPoints(true);
        return dhv2;
    }

    private void checkLightningBeams() {
        float f2;
        Object object;
        int n2 = 0;
        Iterator iterator = this.gxi.iterator();
        while (iterator.hasNext()) {
            object = (dhv)((Object)iterator.next());
            if (object.getStartTime().rgz + (double)object.getDuration() < this.nx.rgz) {
                object.cleanUpSpecialEffect();
                iterator.remove();
                if (!this.hasInfiniteDuration()) {
                    double d2 = this.nx.rgz - this.fC.rgz;
                    f2 = (float)(d2 / (double)this.getDuration());
                    if (f2 >= this.gxh) {
                        if (!(Math.random() > 0.7)) continue;
                        ++n2;
                        continue;
                    }
                    ++n2;
                    continue;
                }
                ++n2;
                continue;
            }
            object.doTick(this.nx);
        }
        object = new lgl(1.5707964f, 0.0f, 0.0f);
        for (int i2 = 0; i2 < n2; ++i2) {
            float f3;
            dhv dhv2 = this.createLightningBeam();
            f2 = lew.eqr();
            ljq ljq2 = new ljq(this.getTargetPosition());
            ljq2.x += f2 * this.Radius;
            f2 = lew.eqr();
            ljq2.rlV += f2 * this.Radius;
            ljq2.y += this.gwV;
            dhv2.setTargetPosition(ljq2);
            dhv2.setSourcePosition(ljq2);
            dhv2.setSourceRotation((lgl)object);
            float f4 = (float)((double)this.gwW * Math.random());
            if (f4 < this.gwW / 10.0f) {
                f4 = this.gwW / 10.0f;
            }
            if (!this.hasInfiniteDuration() && (double)f4 + this.nx.rgz > (double)(f3 = (float)(this.fC.rgz + (double)this.getDuration()))) {
                f4 = f3 - (float)this.nx.rgz;
            }
            dhv2.setDuration(f4);
            dhv2.setStartTime(this.nx);
            dhv2.nx = this.nx;
            dhv2.initializeSpecialEffect();
            this.gxi.add(dhv2);
        }
    }

    private void cleanupLightningBeams() {
        for (dhv dhv2 : this.gxi) {
            dhv2.cleanUpSpecialEffect();
        }
    }

    public boolean isAnimateEndPoint() {
        return this.gwJ;
    }

    public void setAnimateEndPoint(boolean bl) {
        this.gwJ = bl;
    }

    public boolean isAnimateSubBranchEndPoint() {
        return this.gwY;
    }

    public void setAnimateSubBranchEndPoint(boolean bl) {
        this.gwY = bl;
    }

    public float getGroundHeight() {
        return this.gwV;
    }

    public void setGroundHeight(float f2) {
        this.gwV = f2;
    }

    public boolean isHasTexture() {
        return this.gwI;
    }

    public void setHasTexture(boolean bl) {
        this.gwI = bl;
    }

    public lcq getLightningColor() {
        return this.gxc;
    }

    public void setLightningColor(lcq lcq2) {
        this.gxc = lcq2;
    }

    public float getMaxLightningLifeTime() {
        return this.gwW;
    }

    public void setMaxLightningLifeTime(float f2) {
        this.gwW = f2;
    }

    public float getMaxMainBranchWidth() {
        return this.gxa;
    }

    public void setMaxMainBranchWidth(float f2) {
        this.gxa = f2;
    }

    public float getMaxNeighBourRadiusPercentageDeviation() {
        return this.gwx;
    }

    public void setMaxNeighBourRadiusPercentageDeviation(float f2) {
        this.gwx = f2;
    }

    public int getMaxNumBranchPoints() {
        return this.gwX;
    }

    public void setMaxNumBranchPoints(int n2) {
        this.gwX = n2;
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

    public float getMaxSubbranchAngle() {
        return this.gwZ;
    }

    public void setMaxSubbranchAngle(float f2) {
        this.gwZ = f2;
    }

    public float getMaxSubBranchWidth() {
        return this.gxb;
    }

    public void setMaxSubBranchWidth(float f2) {
        this.gxb = f2;
    }

    public int getNumberOfLightnings() {
        return this.gwU;
    }

    public void setNumberOfLightnings(int n2) {
        this.gwU = n2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
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
}

