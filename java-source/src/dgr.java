/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  car
 *  cbx
 *  cew
 *  cug
 *  dgj
 *  dta
 *  dtn
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;

public class dgr
extends dgj {
    private boolean gsL = false;
    private ljq gsM = null;
    private ljq Offset = new ljq(0.0f, 0.8f, 0.0f);
    private int gsN = 0;
    private float gsO = 1.0f;
    private float gsP = 0.0f;
    private int gsQ = 0;
    private ljq gsR = new ljq(0.0f, 0.0f, 0.0f);
    private ljq gsS = new ljq(0.0f, 0.0f, 0.0f);
    private ljq gsT = new ljq(0.0f, 0.0f, 0.0f);
    private float gsU = -1.0f;
    private Float gsV = null;
    Float gsW = null;
    Float gsX = null;

    dgr() {
        this.gqB = 102;
    }

    private bvd getMeshObjectFromGUID(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        bvd bvd2 = null;
        if (amf2 instanceof cbx) {
            cbx cbx2 = (cbx)amf2;
            bvd2 = cbx2.aAG();
        } else if (amf2 instanceof bvd) {
            bvd2 = (bvd)amf2;
        }
        return bvd2;
    }

    public void initializeSpecialEffect() {
        super.initializeSpecialEffect();
        if (this.aZG == null) {
            this.aZG = this.gqP.getSourceObjectGUID();
        }
        dta dta2 = this.MessageDelegator.bzx().bzt().od(lcr.qzp);
        dtn dtn2 = null;
        if (dta2 != null && dta2 instanceof dtn) {
            dtn2 = (dtn)dta2;
        }
        if (dtn2 != null && this.aZG != null && (this.aZG.equals(dtn2.bAn().gYZ) || this.aZG.equals(dtn2.bAn().gYY))) {
            this.initializeSpecialEffectDelayed();
        } else {
            this.gsV = Float.valueOf(0.1f);
        }
    }

    public void initializeSpecialEffectDelayed() {
        Object object;
        bvf bvf2;
        bvd bvd2 = null;
        bvd bvd3 = null;
        if (this.akX == null) {
            this.akX = this.gqP.getTargetObjectGUID();
        }
        if (this.akX != null && (bvd3 = this.getMeshObjectFromGUID(this.akX)) != null) {
            bvf2 = ei.ao(bvd3.getFileName());
            if (bvf2 != null && (object = bvf2.get("AttachPoint Character Chest Center")) != null) {
                this.Offset = ((eh)object).fb().esF();
            }
            object = (kme)this.MessageDelegator.h(3354);
            ((kmn)object).hC(bvd3.axa());
            ((khd)object).ts(this.GUID);
            ((khd)object).wD(true);
            ((khd)object).jM(false);
            this.MessageDelegator.a((khd)object);
        }
        if (this.aZG != null && (bvd2 = this.getMeshObjectFromGUID(this.aZG)) != null && bvd2 instanceof bvf) {
            bvf2 = (bvf)bvd2;
            object = bvf2.aze();
            car car2 = null;
            if (object != null) {
                if (object instanceof cew) {
                    car2 = (car)((cew)object).aKu();
                } else if (object instanceof cdu) {
                    car2 = (car)((cdu)object).aKu();
                }
            }
            if (car2 != null) {
                List list = car2.aGN();
                for (dfz dfz2 : list) {
                    kno kno2 = (kno)this.MessageDelegator.h(779);
                    kno2.qj(dfz2.getGUID());
                    kno2.qk(dfz2.getGUID());
                    kno2.kX(dfz2.getGUID());
                    kno2.ts(this.GUID);
                    kno2.Zv(65536);
                    if (bvd3 != null) {
                        ljq ljq2 = bvd3.av().esF();
                        ljq2.et(bvd2.av());
                        kno2.dx(ljq2);
                    } else {
                        kno2.dx(new ljq(0.0f, 0.0f, 1.0f));
                    }
                    this.MessageDelegator.a(kno2);
                    ++this.gsQ;
                }
            }
        }
    }

    private void splatterRandomDirections() {
        ljq ljq2;
        Object object;
        lgl lgl2 = lgl.eqL();
        if (!this.gsR.isZero()) {
            this.gsR.normalize();
            this.gsS.normalize();
            object = this.gsR;
            ljq2 = ljq.w(this.gsR, this.gsS);
            ljq ljq3 = new ljq(0.0f, 1.0f, 0.0f);
            if (ljq.u(ljq2, ljq3) > 0.0f) {
                ljq2.esB();
            }
            ljq ljq4 = ljq.w(ljq2, (ljq)object);
            lgl2 = lgl.c(ljq2, (ljq)object, ljq4);
        }
        lgl2.normalize();
        this.gsM = lgl2.eq(new ljq(0.0f, 1.0f, 0.0f));
        object = null;
        if (this.akX != null && (object = this.getMeshObjectFromGUID(this.akX)) != null) {
            this.aZD = ((bvd)object).av().esF();
        }
        if (!this.gsR.isZero()) {
            ljq2 = this.gsT.esF();
            ljq2.et(this.aZD);
            float f2 = ljq2.y;
            ljq2.y = 0.0f;
            if (ljq2.eqN() > this.gsU * 0.6f) {
                ljq2.setLength(this.gsU * 0.6f);
            }
            ljq2.y = f2;
            if (this.gsW != null && this.gsX != null) {
                float f3 = (this.gsX.floatValue() - this.gsW.floatValue()) * 0.5f * 0.6f;
                float f4 = (this.gsW.floatValue() + this.gsX.floatValue()) / 2.0f;
                ljq2.y -= f4;
                if (Math.abs(ljq2.y) > f3) {
                    ljq2.y = Math.signum(ljq2.y) * f3;
                }
                ljq2.y += f4;
            }
            ljq2.es(this.aZD);
            this.aZD.ex(ljq2);
        } else if (object != null) {
            ljq2 = this.Offset.esF();
            ljq2 = ((bvd)object).aw().eq(ljq2);
            this.aZD.es(ljq2);
        }
        this.gsO = (float)Math.sqrt(this.gsP) * 0.6f + 0.2f;
        this.modifyTargetAtoms(this.aZD, lgl2, Float.valueOf(1.0f), this.gsO * 2.0f);
        this.sendRayRequests();
    }

    private void modifyTargetAtoms(ljq ljq2, lgl lgl2, Float f2, float f3) {
        Object object;
        Object object22;
        if (this.gqP == null) {
            return;
        }
        ArrayList<dgj> arrayList = lcn.emv();
        arrayList.add(this.gqP);
        for (Object object22 : this.gqP.getContainerManager().bnY()) {
            arrayList.add((dgj)object22);
        }
        ljq ljq3 = this.gsM;
        ljq ljq4 = new ljq(0.0f, 0.0f, 0.0f);
        lgl lgl3 = lgl2.eqV();
        object22 = ljq3.esF();
        bvd bvd2 = this.getMeshObjectFromGUID(this.akX);
        if (bvd2 != null) {
            ljq4 = ljq2.esF();
            ljq4.et(bvd2.av());
            object = bvd2.aw();
            ((lgl)object).eqR();
            ljq4 = ((lgl)object).eq(ljq4);
            lgl3.Y((lgl)object);
            object22 = ((lgl)object).eq((ljq)object22);
        }
        for (dgj dgj2 : arrayList) {
            if (dgj2.isRelationEffect()) {
                if (dgj2.getRelation() == null) continue;
                dgj2.getRelation().setDeltaPos(ljq4);
                dgj2.getRelation().setDeltaRot(lgl3);
                continue;
            }
            for (int i2 = 0; i2 < dgj2.getAtomCount(); ++i2) {
                dey dey2;
                dey dey3 = dgj2.getAtom(i2);
                if (dey3 != null && dey3.blo() == 11) {
                    dey2 = (dfm)dey3;
                    if (ljq2 != null) {
                        ((dfm)dey2).c(ljq2);
                    }
                    if (lgl2 != null) {
                        ((dfm)dey2).a(lgl2);
                    }
                    if (f2 != null) {
                        lcq lcq2 = ((dfm)dey2).bms();
                        ((dfm)dey2).n(new lcq(lcq2.r, lcq2.g, lcq2.b, f2.floatValue()));
                    }
                }
                if (dey3 != null && dey3.blo() == 14) {
                    dey2 = (dfo)dey3;
                    float f4 = ((dfo)dey2).bmy().eqN();
                    ljq3.nm(f4 * f3 * 0.5f);
                    ((dfo)dey2).bQ(ljq3);
                    if (ljq2 == null) continue;
                    ((dfo)dey2).bL(ljq2.esF());
                    continue;
                }
                if (dey3 == null || dey3.blo() != 25) continue;
                dey2 = (dfg)dey3;
                ((dfg)dey2).bL(ljq2.esF());
            }
        }
        if (this.gqP.getEffectClassType() == 54) {
            object = (dim)this.gqP;
            ((dim)((Object)object)).setScaleMultiplier(f3);
        }
    }

    public void doTickSpecialEffect() {
        if (this.gsV != null && this.nx.rgz - this.fC.rgz >= this.gsV.doubleValue()) {
            this.gsV = null;
            this.initializeSpecialEffectDelayed();
        }
        if (!(this.gsL || this.gqP.getAtom(0) == null || !(this.gsP > 0.0f) || this.gsQ != 0 || this.gqP.isRelationEffect() && this.gqP.getRelation() == null)) {
            this.gsL = true;
            this.splatterRandomDirections();
        }
    }

    private void sendRayRequests() {
        for (int i2 = 0; i2 < 3; ++i2) {
            ljq ljq2 = this.gsM.esF();
            ljq2.es(new ljq(Math.random() * (double)0.1f, Math.random() * (double)0.1f, Math.random() * (double)0.1f));
            ljq2.y -= 0.8f;
            ljq2.normalize();
            if (ljq2.isZero()) {
                ljq2 = new ljq(0.0f, -1.0f, 0.0f);
            }
            ljq ljq3 = this.aZD.esF();
            this.sendRayRequest(ljq3, ljq2, 7.0f);
        }
    }

    private void sendRayRequest(ljq ljq2, ljq ljq3, float f2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.ts(this.GUID);
        kji2.wD(true);
        kji2.jM(false);
        kji2.wT(false);
        kji2.wS(true);
        kji2.wU(false);
        kji2.cq(ljq3.esF());
        kji2.ca(ljq2);
        kji2.setLength(f2);
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.a(new lgl());
        kji2.Yi(65552);
        this.MessageDelegator.a(kji2);
    }

    public void handleLineContainmentResponse(kuj kuj2) {
        float f2 = -1.0f;
        int n2 = -1;
        for (int i2 = 0; i2 < kuj2.pJh.length; ++i2) {
            if (lea.enW().isDescendant(kuj2.bqd[i2], cug.fgz) || lea.enW().isDescendant(kuj2.bqd[i2], cug.fkw) || lea.enW().isDescendant(kuj2.bqd[i2], cug.fjY) || n2 != -1 && !(kuj2.pJh[i2] < f2)) continue;
            n2 = i2;
            f2 = kuj2.pJh[i2];
        }
        if (n2 != -1) {
            this.spawnParticle(kuj2.ilP[n2], kuj2.qdV[n2]);
        }
    }

    private void spawnParticle(ljq ljq2, ljq ljq3) {
        ljq ljq4;
        if (this.gsN == -1) {
            return;
        }
        ljq ljq5 = null;
        while (ljq5 == null || ljq5.esJ()) {
            ljq4 = new ljq((float)Math.random(), (float)Math.random(), (float)Math.random());
            ljq4.normalize();
            ljq5 = ljq.w(ljq3, ljq4);
        }
        ljq4 = ljq.w(ljq5, ljq3);
        ljq ljq6 = ljq3.esF();
        ljq6.nm(0.01f);
        ljq6.es(ljq2);
        ljq2 = ljq6;
        float f2 = 1.2f * this.gsO * (1.0f + 0.5f * (float)Math.random());
        gmX.a(this.gsN, ljq2, f2, ljq4, ljq5, (int)(Math.random() * 4.0));
    }

    private void handlePhysicsCollisionSchemeInfoResponse(kvf kvf2) {
        if (kvf2.pTu == null) {
            return;
        }
        this.gsP = 0.0f;
        for (lhl lhl2 : kvf2.pTu) {
            this.gsP += lhl2.Radius * lhl2.Radius * lhl2.Radius;
            if (lhl2.Radius > this.gsU) {
                this.gsU = lhl2.Radius;
            }
            float f2 = lhl2.mZ.y - lhl2.Radius;
            float f3 = lhl2.mZ.y + lhl2.Radius;
            if (this.gsW == null || f2 < this.gsW.floatValue()) {
                this.gsW = Float.valueOf(f2);
            }
            if (this.gsX != null && !(f3 > this.gsX.floatValue())) continue;
            this.gsX = Float.valueOf(f3);
        }
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 4866) {
            this.handleLineContainmentResponse((kuj)ktv2);
        } else if (ktv2.egT() == 5386) {
            this.handlePhysicsCollisionSchemeInfoResponse((kvf)ktv2);
        } else if (ktv2.egT() == 769) {
            this.handleTracerToObjectRelationResponse((kvo)ktv2);
        } else {
            super.receiveResponse(ktv2);
        }
    }

    public void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
    }

    public int getDecalSystem() {
        return this.gsN;
    }

    public void setDecalSystem(int n2) {
        this.gsN = n2;
    }

    private void handleTracerToObjectRelationResponse(kvo kvo2) {
        if (kvo2.getResult() == 0 && kvo2.ehp().eqN() > this.gsR.eqN()) {
            this.gsR.ex(kvo2.ehp());
            this.gsS.ex(kvo2.ehq());
            this.gsT.ex(kvo2.eho());
        }
        --this.gsQ;
    }
}

