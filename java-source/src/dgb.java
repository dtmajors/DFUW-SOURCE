/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
@llg
public class dgb {
    protected short gpB = 0;
    private float doT = -2.0f;
    private float aZE = 0.0f;
    private float gpC = -2.0f;
    protected boolean gpD = false;
    protected static dgj gpE = null;
    protected static dey gpF = null;
    protected static dkx gpG = null;
    protected static ljq cDQ = null;
    protected static ldz gpH = null;
    protected static ldz nx = null;
    protected static double gpI = -2.0;
    protected static float gpJ = 0.0f;

    public short getComponentType() {
        return this.gpB;
    }

    public void copyValues(dgb dgb2) {
        String string = del.c(this.gpB);
        duf duf2 = (duf)lea.eoo().get(string);
        if (duf2 == null) {
            lfn.b(5, this.getClass().getName(), "copyValues() : component " + string + " can not be copied because it was not found in the reflected class map!");
            return;
        }
        for (duj duj2 : duf2.bBa()) {
            Object object = kzz.a(duj2, this);
            kzz.a(duj2, dgb2, object);
        }
    }

    public dgb createCopy() {
        dgb dgb2 = dge.d(this.gpB);
        this.copyValues(dgb2);
        return dgb2;
    }

    protected void updateAtom(float f2) {
    }

    public final void setParameters(dgj dgj2, dey dey2, dkx dkx2, ljq ljq2, ldz ldz2, ldz ldz3, double d2) {
        gpE = dgj2;
        gpF = dey2;
        gpG = dkx2;
        cDQ = ljq2;
        gpH = ldz2;
        nx = ldz3;
        gpI = d2;
    }

    public final void updateAtom() {
        float f2;
        if (gpH == null) {
            lfn.b(5, this.getClass().getName(), "updateAtom() : EffectStartTime is null. can not update atom. ");
            return;
        }
        if (nx == null) {
            lfn.b(5, this.getClass().getName(), "updateAtom() : CurrentTime is null can not update atom. ");
            return;
        }
        float f3 = (float)(dgb.nx.rgz - dgb.gpH.rgz);
        float f4 = f3 - this.aZE;
        if (f4 < 0.0f) {
            return;
        }
        gpJ = f4;
        if (this.gpC > 0.0f) {
            int n2 = (int)(f4 / this.gpC);
            f4 -= this.gpC * (float)n2;
        }
        if ((f2 = this.doT) == -2.0f) {
            f2 = gpI < 0.0 ? f4 : (float)gpI - this.aZE;
        }
        if (f4 > f2 || f4 == f2 && f4 == 0.0f) {
            if (!this.gpD) {
                this.gpD = true;
                this.updateAtom(1.0f);
            }
            return;
        }
        this.updateAtom(f4 / f2);
    }

    public void setStartTime(float f2) {
        this.aZE = f2;
    }

    public float getStartTime() {
        return this.aZE;
    }

    public void setDuration(float f2) {
        this.doT = f2;
    }

    public float getDuration() {
        return this.doT;
    }

    protected static void setAtomPosition(dey dey2, ljq ljq2) {
        if (dey2.blo() == 11) {
            dfm dfm2 = (dfm)dey2;
            dfm2.c(ljq2);
        } else if (dey2.blo() == 14) {
            dfo dfo2 = (dfo)dey2;
            dfo2.bL(ljq2);
        } else if (dey2.blo() == 25) {
            dfg dfg2 = (dfg)dey2;
            dfg2.bL(ljq2);
        } else if (dey2.blo() == 28) {
            dfq dfq2 = (dfq)dey2;
            dfq2.c(ljq2);
        } else if (dey2.blo() == 4) {
            dfc dfc2 = (dfc)dey2;
            dfc2.bK(ljq2);
        }
    }

    static void setAtomRotation(dey dey2, lgl lgl2) {
        if (dey2.blo() == 11) {
            dfm dfm2 = (dfm)dey2;
            dfm2.a(lgl2);
        }
    }

    protected static float getAtomValueFloat(dey dey2, int n2) {
        if (n2 == del.b.glF.ordinal()) {
            return 0.0f;
        }
        float f2 = 0.0f;
        if (dey2.blo() == 14) {
            dfo dfo2 = (dfo)dey2;
            if (n2 == del.b.glG.ordinal()) {
                f2 = dfo2.getStartScale();
            } else if (n2 == del.b.glH.ordinal()) {
                f2 = dfo2.getEndScale();
            } else if (n2 == del.b.glI.ordinal()) {
                f2 = dfo2.bmw();
            } else if (n2 == del.b.glJ.ordinal()) {
                f2 = dfo2.getParticleLifeTime();
            } else if (n2 == del.b.glK.ordinal()) {
                f2 = dfo2.getParticleAcceleration();
            } else if (n2 == del.b.glL.ordinal()) {
                f2 = dfo2.bmx();
            } else if (n2 == del.b.glM.ordinal()) {
                f2 = dfo2.getPullAcceleration();
            } else if (n2 == del.b.glN.ordinal()) {
                f2 = dfo2.getGravityInfluence();
            } else if (n2 == del.b.glO.ordinal()) {
                f2 = dfo2.getWindInfluence();
            } else if (n2 == del.b.glP.ordinal()) {
                f2 = dfo2.getStartRotation();
            } else if (n2 == del.b.glQ.ordinal()) {
                f2 = dfo2.getEndRotation();
            } else if (n2 == del.b.glR.ordinal()) {
                f2 = dfo2.getStartColor().a;
            } else if (n2 == del.b.glS.ordinal()) {
                f2 = dfo2.getEndColor().a;
            } else if (n2 == del.b.glT.ordinal()) {
                f2 = dfo2.getStartColor().r;
            } else if (n2 == del.b.glU.ordinal()) {
                f2 = dfo2.getEndColor().r;
            } else if (n2 == del.b.glV.ordinal()) {
                f2 = dfo2.getStartColor().g;
            } else if (n2 == del.b.glW.ordinal()) {
                f2 = dfo2.getEndColor().g;
            } else if (n2 == del.b.glX.ordinal()) {
                f2 = dfo2.getStartColor().b;
            } else if (n2 == del.b.glY.ordinal()) {
                f2 = dfo2.getEndColor().b;
            } else if (n2 == del.b.glZ.ordinal()) {
                f2 = dfo2.getScaleTurbulencePercent();
            } else if (n2 == del.b.gma.ordinal()) {
                f2 = dfo2.getRotationTurbulencePercent();
            } else if (n2 == del.b.gmb.ordinal()) {
                f2 = dfo2.getColorTurbulencePercent();
            } else if (n2 == del.b.gmd.ordinal()) {
                f2 = dfo2.getScaleY();
            } else if (n2 == del.b.gmc.ordinal()) {
                f2 = dfo2.getNumParticles();
            } else {
                lfn.b(5, "SFSpecialEffectComponent", "getValueFloat() : float parameter " + n2 + " is invalid for paricle atom");
            }
        } else if (dey2.blo() == 11) {
            dfm dfm2 = (dfm)dey2;
            if (n2 == del.b.gme.ordinal()) {
                f2 = dfm2.getScale();
            } else if (n2 == del.b.gmi.ordinal()) {
                f2 = dfm2.bms().a;
            } else if (n2 == del.b.gmf.ordinal()) {
                f2 = dfm2.bms().r;
            } else if (n2 == del.b.gmg.ordinal()) {
                f2 = dfm2.bms().g;
            } else if (n2 == del.b.gmh.ordinal()) {
                f2 = dfm2.bms().b;
            } else {
                lfn.b(5, "SFSpecialEffectComponent", "getValueFloat() : float parameter " + n2 + " is invalid for mesh atom");
            }
        } else if (dey2.blo() == 25) {
            dfg dfg2 = (dfg)dey2;
            if (n2 == del.b.glG.ordinal()) {
                f2 = dfg2.getStartScale();
            } else if (n2 == del.b.glH.ordinal()) {
                f2 = dfg2.getEndScale();
            } else if (n2 == del.b.glJ.ordinal()) {
                f2 = dfg2.getParticleLifeTime();
            } else if (n2 == del.b.glP.ordinal()) {
                f2 = dfg2.getStartRotation();
            } else if (n2 == del.b.glQ.ordinal()) {
                f2 = dfg2.getEndRotation();
            } else if (n2 == del.b.glR.ordinal()) {
                f2 = dfg2.getStartColor().a;
            } else if (n2 == del.b.glS.ordinal()) {
                f2 = dfg2.getEndColor().a;
            } else if (n2 == del.b.glT.ordinal()) {
                f2 = dfg2.getStartColor().r;
            } else if (n2 == del.b.glU.ordinal()) {
                f2 = dfg2.getEndColor().r;
            } else if (n2 == del.b.glV.ordinal()) {
                f2 = dfg2.getStartColor().g;
            } else if (n2 == del.b.glW.ordinal()) {
                f2 = dfg2.getEndColor().g;
            } else if (n2 == del.b.glX.ordinal()) {
                f2 = dfg2.getStartColor().b;
            } else if (n2 == del.b.glY.ordinal()) {
                f2 = dfg2.getEndColor().b;
            } else {
                lfn.b(5, "SFSpecialEffectComponent", "getValueFloat() : float parameter " + n2 + " is invalid for paricle atom");
            }
        }
        return f2;
    }

    protected static void setAtomValueFloat(dey dey2, int n2, float f2) {
        if (n2 == del.b.glF.ordinal()) {
            return;
        }
        if (dey2.blo() == 14) {
            dfo dfo2 = (dfo)dey2;
            if (n2 == del.b.glG.ordinal()) {
                dfo2.setStartScale(f2);
            } else if (n2 == del.b.glH.ordinal()) {
                dfo2.setEndScale(f2);
            } else if (n2 == del.b.glI.ordinal()) {
                dfo2.gr(f2);
            } else if (n2 == del.b.glJ.ordinal()) {
                dfo2.setParticleLifeTime(f2);
            } else if (n2 == del.b.glK.ordinal()) {
                dfo2.setParticleAcceleration(f2);
            } else if (n2 == del.b.glL.ordinal()) {
                dfo2.gs(f2);
            } else if (n2 == del.b.glM.ordinal()) {
                dfo2.setPullAcceleration(f2);
            } else if (n2 == del.b.glN.ordinal()) {
                dfo2.setGravityInfluence(f2);
            } else if (n2 == del.b.glO.ordinal()) {
                dfo2.setWindInfluence(f2);
            } else if (n2 == del.b.glP.ordinal()) {
                dfo2.setStartRotation(f2);
            } else if (n2 == del.b.glQ.ordinal()) {
                dfo2.setEndRotation(f2);
            } else if (n2 == del.b.glR.ordinal()) {
                lcq lcq2 = dfo2.getStartColor();
                dfo2.setStartColor(new lcq(lcq2.r, lcq2.g, lcq2.b, f2, true));
            } else if (n2 == del.b.glS.ordinal()) {
                lcq lcq3 = dfo2.getEndColor();
                dfo2.setEndColor(new lcq(lcq3.r, lcq3.g, lcq3.b, f2, true));
            } else if (n2 == del.b.glT.ordinal()) {
                lcq lcq4 = dfo2.getStartColor();
                dfo2.setStartColor(new lcq(f2, lcq4.g, lcq4.b, lcq4.a, true));
            } else if (n2 == del.b.glU.ordinal()) {
                lcq lcq5 = dfo2.getEndColor();
                dfo2.setEndColor(new lcq(f2, lcq5.g, lcq5.b, lcq5.a, true));
            } else if (n2 == del.b.glV.ordinal()) {
                lcq lcq6 = dfo2.getStartColor();
                dfo2.setStartColor(new lcq(lcq6.r, f2, lcq6.b, lcq6.a, true));
            } else if (n2 == del.b.glW.ordinal()) {
                lcq lcq7 = dfo2.getEndColor();
                dfo2.setEndColor(new lcq(lcq7.r, f2, lcq7.b, lcq7.a, true));
            } else if (n2 == del.b.glX.ordinal()) {
                lcq lcq8 = dfo2.getStartColor();
                dfo2.setStartColor(new lcq(lcq8.r, lcq8.g, f2, lcq8.a, true));
            } else if (n2 == del.b.glY.ordinal()) {
                lcq lcq9 = dfo2.getEndColor();
                dfo2.setEndColor(new lcq(lcq9.r, lcq9.g, f2, lcq9.a, true));
            } else if (n2 == del.b.glZ.ordinal()) {
                dfo2.setScaleTurbulencePercent(f2);
            } else if (n2 == del.b.gma.ordinal()) {
                dfo2.setRotationTurbulencePercent(f2);
            } else if (n2 == del.b.gmb.ordinal()) {
                dfo2.setColorTurbulencePercent(f2);
            } else if (n2 == del.b.gmd.ordinal()) {
                dfo2.setScaleY(f2);
            } else if (n2 == del.b.gmc.ordinal()) {
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                dfo2.setNumParticles((int)f2);
            } else {
                lfn.b(5, "SFSpecialEffectComponent", "setValueFloat() : float parameter " + n2 + " is invalid for particle atom");
            }
        } else if (dey2.blo() == 11) {
            dfm dfm2 = (dfm)dey2;
            if (n2 == del.b.gme.ordinal()) {
                dfm2.setScale(f2);
            } else if (n2 == del.b.gmi.ordinal()) {
                lcq lcq10 = dfm2.bms();
                dfm2.n(new lcq(lcq10.r, lcq10.g, lcq10.b, f2, true));
            } else if (n2 == del.b.gmf.ordinal()) {
                lcq lcq11 = dfm2.bms();
                dfm2.n(new lcq(f2, lcq11.g, lcq11.b, lcq11.a, true));
            } else if (n2 == del.b.gmg.ordinal()) {
                lcq lcq12 = dfm2.bms();
                dfm2.n(new lcq(lcq12.r, f2, lcq12.b, lcq12.a, true));
            } else if (n2 == del.b.gmh.ordinal()) {
                lcq lcq13 = dfm2.bms();
                dfm2.n(new lcq(lcq13.r, lcq13.g, f2, lcq13.a, true));
            } else {
                lfn.b(5, "SFSpecialEffectComponent", "setValueFloat() : float parameter " + n2 + " is invalid for mesh atom");
            }
        } else if (dey2.blo() == 25) {
            dfg dfg2 = (dfg)dey2;
            if (n2 == del.b.glG.ordinal()) {
                dfg2.setStartScale(f2);
            } else if (n2 == del.b.glH.ordinal()) {
                dfg2.setEndScale(f2);
            } else if (n2 == del.b.glJ.ordinal()) {
                dfg2.setParticleLifeTime(f2);
            } else if (n2 == del.b.glP.ordinal()) {
                dfg2.setStartRotation(f2);
            } else if (n2 == del.b.glQ.ordinal()) {
                dfg2.setEndRotation(f2);
            } else if (n2 == del.b.glR.ordinal()) {
                lcq lcq14 = dfg2.getStartColor();
                dfg2.setStartColor(new lcq(lcq14.r, lcq14.g, lcq14.b, f2, true));
            } else if (n2 == del.b.glS.ordinal()) {
                lcq lcq15 = dfg2.getEndColor();
                dfg2.setEndColor(new lcq(lcq15.r, lcq15.g, lcq15.b, f2, true));
            } else if (n2 == del.b.glT.ordinal()) {
                lcq lcq16 = dfg2.getStartColor();
                dfg2.setStartColor(new lcq(f2, lcq16.g, lcq16.b, lcq16.a, true));
            } else if (n2 == del.b.glU.ordinal()) {
                lcq lcq17 = dfg2.getEndColor();
                dfg2.setEndColor(new lcq(f2, lcq17.g, lcq17.b, lcq17.a, true));
            } else if (n2 == del.b.glV.ordinal()) {
                lcq lcq18 = dfg2.getStartColor();
                dfg2.setStartColor(new lcq(lcq18.r, f2, lcq18.b, lcq18.a, true));
            } else if (n2 == del.b.glW.ordinal()) {
                lcq lcq19 = dfg2.getEndColor();
                dfg2.setEndColor(new lcq(lcq19.r, f2, lcq19.b, lcq19.a, true));
            } else if (n2 == del.b.glX.ordinal()) {
                lcq lcq20 = dfg2.getStartColor();
                dfg2.setStartColor(new lcq(lcq20.r, lcq20.g, f2, lcq20.a, true));
            } else if (n2 == del.b.glY.ordinal()) {
                lcq lcq21 = dfg2.getEndColor();
                dfg2.setEndColor(new lcq(lcq21.r, lcq21.g, f2, lcq21.a, true));
            } else if (n2 == del.b.gmj.ordinal()) {
                dfg2.setDepthModifier(n2);
            } else {
                lfn.b(5, "SFSpecialEffectComponent", "setValueFloat() : float parameter " + n2 + " is invalid for explosion particle atom");
            }
        }
    }

    public float getRepeatTime() {
        return this.gpC;
    }

    public void setRepeatTime(float f2) {
        this.gpC = f2;
    }
}

