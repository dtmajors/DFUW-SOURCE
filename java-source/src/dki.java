/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  dtc
 */
import java.util.Map;

public class dki
extends dgj {
    private ljq grN = new ljq(0.0f, 0.0f, 0.0f);
    private ljq gDf = new ljq(0.0f, 0.0f, 1.0f);
    private dky gDg = null;
    private float gDh = 100.0f;
    private float gwS = 0.2f;
    private lcq gwG = new lcq(1.0f, 1.0f, 1.0f, 1.0f);
    private dfk gDi = null;
    private dkx gDj = null;
    private String fFC = "";
    private boolean gwI = false;
    private String byk = "";
    private float gDk = -1.0f;
    private float gDl = 0.0f;
    private float gDm = 0.0f;
    private float gDn = 0.0f;
    private float gDo = 0.0f;
    private float gDp = 1.0f;
    float gDq = -1.0f;

    public dki() {
        this.gqB = 98;
    }

    public void initializeSpecialEffect() {
        dtc dtc2;
        amf amf2;
        super.initializeSpecialEffect();
        if (this.akX == null) {
            return;
        }
        this.gDg = this.setupPositionalSensorOnTargetObject();
        if (this.byk.length() > 0 && (amf2 = (dtc2 = this.MessageDelegator.bzx().bzt()).d(this.akX)) != null) {
            Map<String, eh> map = lea.eor().get(amf2.getObjectDescriptionFilename());
            if (map == null) {
                lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initializeSpecialEffect() : couldnt find attach points for object " + amf2.getObjectDescriptionFilename());
                return;
            }
            eh eh2 = map.get(this.byk);
            if (eh2 == null) {
                lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initializeSpecialEffect() : couldnt find attaach point " + this.byk + " for object " + amf2.getObjectDescriptionFilename());
                return;
            }
            this.grN.es(eh2.fb());
        }
    }

    public void updateLineMesh(float f) {
        if (f == this.gDq) {
            return;
        }
        this.gDq = f;
        boolean bl = false;
        if (this.gDi == null) {
            this.gDi = (dfk)dgj.getAtomFactory().Af(9);
            bl = true;
            this.gDi.c(new ljq(0.0f, 0.0f, 0.0f));
            this.gDi.a(new lgl());
            this.gDi.setTextureName(this.fFC);
            this.gDi.setGUID(this.getNewEffectGuid());
            this.gDi.setHasTexture(this.gwI);
            this.gDi.m(this.gwG);
            this.gDi.setLineWidth(this.gwS);
            this.gDi.setTransformPoints(true);
            this.gDi.b(new ljr(this.gDn, this.gDm, this.gDl, this.gDo));
        }
        ljq[] ljqArray = new ljq[]{new ljq(0.0f, 0.0f, 0.0f), this.gDf.esF()};
        ljqArray[1].nm(f);
        ljqArray[0].es(this.grN);
        ljqArray[1].es(this.grN);
        if (this.gDk < 0.0f) {
            this.gDi.i(new ljp(1.0f, 1.0f));
        } else {
            this.gDi.i(new ljp(f / this.gDk, 1.0f));
        }
        this.gDi.e(ljqArray);
        if (bl) {
            this.MessageDelegator.a(this.gDi);
        }
    }

    public void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        if (this.gDi != null) {
            this.MessageDelegator.hd(this.gDi.getGUID());
        }
    }

    public void doTickSpecialEffect() {
        if (this.gDg == null) {
            return;
        }
        if (!this.gDg.bop()) {
            return;
        }
        ljq ljq2 = this.grN.esF();
        ljq ljq3 = this.gDf.esF();
        ljq ljq4 = this.gDg.av();
        lgl lgl2 = this.gDg.aw();
        ljq2 = lgl2.eq(ljq2);
        ljq2.es(ljq4);
        ljq3 = lgl2.eq(ljq3);
        if (this.isRelationEffect() && this.gDi != null && this.gDi.blt() && this.gDj == null) {
            this.gDj = this.setupPositionalRelation(this.akX, this.gDi.getGUID(), 1);
        }
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.setLength(this.gDh);
        kji2.ts(this.GUID);
        kji2.Ye(0);
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq3);
        kji2.wD(true);
        this.MessageDelegator.a(kji2);
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 4866) {
            kuj kuj2 = (kuj)ktv2;
            int n = -1;
            float f = this.gDh;
            for (int i = 0; i < kuj2.pJh.length; ++i) {
                if (kuj2.jnv[i].equals(this.akX) || kuj2.jnv[i].equals(this.aZG) || kuj2.pJh[i] < this.gDp || n != -1 && !(kuj2.pJh[i] < f)) continue;
                n = i;
                f = kuj2.pJh[i];
            }
            this.updateLineMesh(f);
        }
    }

    public void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dki dki2 = (dki)dgj2;
        dki2.grN = this.grN.esF();
        dki2.gDf = this.gDf.esF();
        dki2.gDh = this.gDh;
        dki2.gwS = this.gwS;
        dki2.gwG = this.gwG;
        dki2.fFC = this.fFC;
        dki2.gwI = this.gwI;
        dki2.byk = this.byk;
        dki2.gDk = this.gDk;
        dki2.gDl = this.gDl;
        dki2.gDm = this.gDm;
        dki2.gDn = this.gDn;
        dki2.gDo = this.gDo;
        dki2.gDp = this.gDp;
    }

    public ljq getTargetOffset() {
        return this.grN;
    }

    public ljq getTargetSpaceDirection() {
        return this.gDf;
    }

    public void setTargetSpaceDirection(ljq ljq2) {
        this.gDf = ljq2;
    }

    public float getMaxLength() {
        return this.gDh;
    }

    public void setMaxLength(float f) {
        this.gDh = f;
    }

    public float getLineWidth() {
        return this.gwS;
    }

    public void setLineWidth(float f) {
        this.gwS = f;
    }

    public lcq getLineColor() {
        return this.gwG;
    }

    public void setLineColor(lcq lcq2) {
        this.gwG = lcq2;
    }

    public void setTargetOffset(ljq ljq2) {
        this.grN = ljq2;
    }

    public dfk getLineMeshAtom() {
        return this.gDi;
    }

    public void setLineMeshAtom(dfk dfk2) {
        this.gDi = dfk2;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public boolean isHasTexture() {
        return this.gwI;
    }

    public void setHasTexture(boolean bl) {
        this.gwI = bl;
    }

    public String getAttachPointName() {
        return this.byk;
    }

    public void setAttachPointName(String string) {
        this.byk = string;
    }

    public float getUVScaleFactor() {
        return this.gDk;
    }

    public void setUVScaleFactor(float f) {
        this.gDk = f;
    }

    public float getTexSpeedU() {
        return this.gDl;
    }

    public void setTexSpeedU(float f) {
        this.gDl = f;
    }

    public float getTexSpeedV() {
        return this.gDm;
    }

    public void setTexSpeedV(float f) {
        this.gDm = f;
    }

    public float getTexPanU() {
        return this.gDn;
    }

    public void setTexPanU(float f) {
        this.gDn = f;
    }

    public float getTexPanV() {
        return this.gDo;
    }

    public void setTexPanV(float f) {
        this.gDo = f;
    }

    public float getMinDistanceToIgnoreCollision() {
        return this.gDp;
    }

    public void setMinDistanceToIgnoreCollision(float f) {
        this.gDp = f;
    }
}

