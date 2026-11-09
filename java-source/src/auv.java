/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 *  lcy
 */
public class auv
extends aul {
    private static final int cff = 0;
    private static final int cfg = 1;
    private static final int cfh = 2;
    private static final int cfi = 4;
    private static final int cfj = 5;
    private static final int cfk = 6;
    private static final int cfl = 7;
    private static final int cfm = 8;
    private static final int cfn = 9;
    private static final int cfo = 10;
    private static final int cfp = 11;
    private static final int cfq = 12;
    private static final int cfr = 13;
    private static final int cfs = 14;
    private static final int cft = 15;
    private static final int cfu = 16;
    private static final int cfv = 17;
    private static final int cfw = 18;
    private static final int cfx = 19;
    private static final int cfy = 20;
    private static final int cfz = 21;
    private static final int cfA = 22;
    private static final int cfB = 23;
    private static final int cfC = 24;
    private static final int cfD = 25;
    protected static final int cdu = 26;
    private static final egg[] cfE = new egg[]{new egg("filename", egg.a.ipq, false, lcy.qSw)};
    private static final egg[] cfF = new egg[]{new egg("toggle", egg.a.ipm, false, lcy.qRr)};
    private static final egg[] cfG = new egg[0];
    private static final egg[] cfH = new egg[]{new egg("DENSITY", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] cfI = new egg[]{new egg("X", egg.a.ipp, false, lcy.qRr), new egg("Y", egg.a.ipp, false, lcy.qRr), new egg("Z", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] cfJ = new egg[]{new egg("r", egg.a.ipp, false, lcy.qRr), new egg("g", egg.a.ipp, false, lcy.qRr), new egg("b", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] cfK = new egg[]{new egg("FOG_END", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] cfL = new egg[]{new egg("Foat Value", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] cfM = new egg[]{new egg("Percentage", egg.a.ipp, false, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    public static final amd cfN = new amd(auv.class, aul.cdc, "ChatProxyRenderingEngine", bui, null);
    private boolean Initialized;
    private float cfO = 0.05f;
    private float cfP = 1.0f;
    private ldv sp;
    private ldv sq;
    private boolean cfQ;
    private ldv cfR;
    private ldv sr;

    private void a(ktl ktl2) {
        this.h(lzj.tWp.bD(Integer.toString(ktl2.getResult())));
    }

    public auv() {
        super(cfN);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 1, "env_fog_end", lcy.qTs, cfK);
        this.a(hc.aaP, 9, "env_fog_start", lcy.qTs, cfK);
        this.a(hc.aaP, 10, "env_ambient_multiplier", lcy.qTs, cfK);
        this.a(hc.aaP, 0, "env_sun", lcy.qTs, cfG);
        this.a(hc.aaP, 7, "env_sun_rot", lcy.qTs, cfI);
        this.a(hc.aaP, 4, "env_meteor_belt", lcy.qTs, cfG);
        this.a(hc.aaP, 24, "env_wind_direction", lcy.qTs, cfI);
        this.a(hc.aaP, 25, "env_wind_speed", lcy.qTs, cfH);
        this.a(hc.aaP, 2, "env_rain", lcy.qTs, cfH);
        this.a(hc.aaP, 8, "env_snow", lcy.qTs, cfH);
        this.a(hc.aaP, 5, "env_stardome", lcy.qTs, cfG);
        this.a(hc.aaP, 13, "env_cloud_color", lcy.qTs, cfJ);
        this.a(hc.aaP, 14, "env_atmosphere_color", lcy.qTs, cfJ);
        this.a(hc.aaP, 11, "env_cloud_cover", lcy.qTs, cfL);
        this.a(hc.aaP, 12, "env_cloud_thickness", lcy.qTs, cfL);
        this.a(hc.aaP, 15, "env_fog_color", lcy.qTs, cfJ);
        this.a(hc.aaP, 16, "env_fog_density", lcy.qTs, cfL);
        this.a(hc.aaP, 17, "env_sun_color", lcy.qTs, cfJ);
        this.a(hc.aaP, 18, "env_moon_blue_rot", lcy.qTs, cfI);
        this.a(hc.aaP, 19, "env_moon_red_rot", lcy.qTs, cfI);
        this.a(hc.aaP, 20, "env_moon_ghost_rot", lcy.qTs, cfI);
        this.a(hc.aaP, 6, "env_load", lcy.qSv, cfE);
        this.a(hc.aaP, 21, "env_config", lcy.qRr, cfM);
        this.a(hc.aaP, 22, "env_enable", lcy.qRr, cfF);
        this.a(hc.aaP, 23, "env_set", lcy.qRr, cfE);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 256: {
                this.a((ktl)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    protected void b(int n, Object[] objectArray, String string) {
        assert (this.Initialized);
        switch (n) {
            case 0: {
                assert (objectArray.length == 0) : objectArray.length;
                this.Wj();
                return;
            }
            case 7: {
                if (objectArray.length != 3) {
                    return;
                }
                this.h(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                return;
            }
            case 18: {
                if (objectArray.length != 3) {
                    return;
                }
                this.i(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                return;
            }
            case 19: {
                if (objectArray.length != 3) {
                    return;
                }
                this.j(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                return;
            }
            case 20: {
                if (objectArray.length != 3) {
                    return;
                }
                this.k(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                return;
            }
            case 1: {
                if (objectArray.length != 1) {
                    return;
                }
                this.ca(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 9: {
                if (objectArray.length != 1) {
                    return;
                }
                this.cb(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 10: {
                if (objectArray.length != 1) {
                    return;
                }
                this.cc(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 2: {
                if (objectArray.length != 1) {
                    return;
                }
                this.cd(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 24: {
                if (objectArray.length != 3) {
                    return;
                }
                this.l(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                return;
            }
            case 25: {
                if (objectArray.length != 1) {
                    return;
                }
                this.ce(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 4: {
                this.Wk();
                return;
            }
            case 5: {
                this.Wl();
                return;
            }
            case 6: {
                if (objectArray.length != 1) {
                    return;
                }
                this.eg((String)objectArray[0]);
                return;
            }
            case 8: {
                if (objectArray.length != 1) {
                    return;
                }
                this.cf(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 13: {
                if (objectArray.length != 3) {
                    return;
                }
                lcq lcq2 = new lcq(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                this.e(lcq2);
                return;
            }
            case 14: {
                if (objectArray.length != 3) {
                    return;
                }
                lcq lcq3 = new lcq(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                this.f(lcq3);
                return;
            }
            case 11: {
                if (objectArray.length != 1) {
                    return;
                }
                this.bZ(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 12: {
                if (objectArray.length != 1) {
                    return;
                }
                this.bY(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 15: {
                if (objectArray.length != 3) {
                    return;
                }
                lcq lcq4 = new lcq(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                this.d(lcq4);
                return;
            }
            case 16: {
                if (objectArray.length != 1) {
                    return;
                }
                this.bX(((ldq)objectArray[0]).floatValue());
                return;
            }
            case 17: {
                if (objectArray.length != 3) {
                    return;
                }
                lcq lcq5 = new lcq(((ldq)objectArray[0]).floatValue(), ((ldq)objectArray[1]).floatValue(), ((ldq)objectArray[2]).floatValue());
                this.c(lcq5);
                return;
            }
            case 22: {
                if (objectArray.length != 1) {
                    return;
                }
                this.ce(((lch)objectArray[0]).booleanValue());
                return;
            }
            case 23: {
                if (objectArray.length != 1) {
                    return;
                }
                this.ef((String)objectArray[0]);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    private void ef(String string) {
        ber ber2 = new ber();
        String string2 = "xml-files/object/environment/" + string;
        jwo jwo2 = new jwo();
        jwo2.a(string2, ber2);
        if (ber2.anm() == 0) {
            return;
        }
        fap fap2 = (fap)this.MessageDelegator.h(1805, this.GUID, lcr.qDG);
        fap2.iHg = ber2;
        fap2.iHh = 2.0f;
        this.MessageDelegator.F(fap2);
    }

    private void ce(boolean bl) {
        fad fad2 = (fad)this.MessageDelegator.h(1804, this.GUID, lcr.qDG);
        fad2.imB = bl;
        this.a(fad2);
    }

    private void c(lcq lcq2) {
        assert (this.MessageDelegator != null);
        int n = 64;
        fah fah2 = (fah)this.MessageDelegator.h(1797, this.GUID, lcr.qDK);
        fah2.FZ(n);
        fah2.r(lcq2);
        this.a(fah2);
    }

    private void bX(float f2) {
        assert (this.MessageDelegator != null);
        far far2 = (far)this.MessageDelegator.h(1793, this.GUID, lcr.qDR);
        far2.bX(f2);
        far2.Ge(64);
        this.MessageDelegator.F(far2);
    }

    private void d(lcq lcq2) {
        assert (this.MessageDelegator != null);
        far far2 = (far)this.MessageDelegator.h(1793, this.GUID, lcr.qDR);
        far2.d(lcq2);
        far2.Ge(4);
        this.MessageDelegator.F(far2);
    }

    private void bY(float f2) {
        fae fae2 = (fae)this.MessageDelegator.h(1795, this.GUID, lcr.qDQ);
        fae2.bY(f2);
        fae2.FX(16);
        this.MessageDelegator.F(fae2);
    }

    private void bZ(float f2) {
        fae fae2 = (fae)this.MessageDelegator.h(1795, this.GUID, lcr.qDQ);
        fae2.bZ(f2);
        fae2.FX(4);
        this.MessageDelegator.F(fae2);
    }

    private void e(lcq lcq2) {
        fae fae2 = (fae)this.MessageDelegator.h(1795, this.GUID, lcr.qDQ);
        fae2.e(lcq2);
        fae2.FX(8);
        this.MessageDelegator.F(fae2);
    }

    private void f(lcq lcq2) {
        fae fae2 = (fae)this.MessageDelegator.h(1795, this.GUID, lcr.qDQ);
        fae2.p(lcq2);
        fae2.FX(32);
        this.MessageDelegator.F(fae2);
    }

    private void eg(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        if (!(string = string.toLowerCase()).endsWith(".xml")) {
            string = string + ".xml";
        }
        String string2 = lcw.qLb + "xml-files/objectspace/environment/" + string;
        String string3 = "xml-files/objectspace/environment/" + string;
        if (!new jrw(string2).exists()) {
            return;
        }
        fob fob2 = (fob)this.MessageDelegator.h(11521, this.GUID, lcr.qzt);
        fob2.cd(string3);
        this.MessageDelegator.F(fob2);
    }

    private void h(float f2, float f3, float f4) {
        this.a(f2, f3, f4, lcr.qDK);
    }

    private void i(float f2, float f3, float f4) {
        this.a(f2, f3, f4, lcr.qDL);
    }

    private void j(float f2, float f3, float f4) {
        this.a(f2, f3, f4, lcr.qDM);
    }

    private void k(float f2, float f3, float f4) {
        this.a(f2, f3, f4, lcr.qDN);
    }

    private void a(float f2, float f3, float f4, ldv ldv2) {
        assert (this.MessageDelegator != null);
        int n = 2064;
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        fah fah2 = (fah)this.MessageDelegator.h(1797, this.GUID, ldv2);
        fah2.cn(new ljq(f2, f3, f4));
        fah2.FZ(n);
        fah2.cl(ljq2);
        this.a(fah2);
    }

    private void ca(float f2) {
        assert (this.MessageDelegator != null);
        far far2 = (far)this.MessageDelegator.h(1793, this.GUID, lcr.qDR);
        far2.ca(f2);
        far2.Ge(16);
        this.MessageDelegator.F(far2);
    }

    private void cb(float f2) {
        assert (this.MessageDelegator != null);
        far far2 = (far)this.MessageDelegator.h(1793, this.GUID, lcr.qDR);
        far2.cb(f2);
        far2.Ge(8);
        this.MessageDelegator.F(far2);
    }

    private void cc(float f2) {
        assert (this.MessageDelegator != null);
        fae fae2 = (fae)this.MessageDelegator.h(1795, this.GUID, lcr.qDQ);
        fae2.iGw = f2;
        fae2.FX(64);
        this.MessageDelegator.F(fae2);
    }

    private void Wj() {
        assert (this.MessageDelegator != null);
        int n = 2048;
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        fah fah2 = (fah)this.MessageDelegator.h(1797, this.GUID, lcr.qDK);
        if (!this.cfQ) {
            ljq2 = new ljq(0.0f, 0.0f, this.cfO * this.cfP);
            n |= 0x10;
            fah2.cn(new ljq(0.0f, 0.0f, -0.7853982f));
            this.cfQ = true;
        } else {
            this.cfQ = false;
        }
        fah2.FZ(n);
        fah2.cl(ljq2);
        this.a(fah2);
    }

    private void cd(float f2) {
        if (this.sp != null) {
            this.MessageDelegator.bzx().bzt().hd(this.sp);
            this.sp = null;
        } else {
            this.sp = lcr.qDS;
            dri dri2 = new dri();
            dri2.hC(f2);
            dri2.iY(true);
            dri2.setGUID(this.sp);
            this.MessageDelegator.bzx().bzt().a((amf)dri2);
        }
    }

    private void l(float f2, float f3, float f4) {
        drf drf2 = (drf)this.MessageDelegator.bzx().bzt().d(lcr.qDO);
        if (drf2 == null) {
            return;
        }
        f2 = lew.A(f2, 0.0f, (float)Math.PI);
        f3 = lew.A(f3, 0.0f, (float)Math.PI);
        f4 = lew.A(f4, 0.0f, (float)Math.PI);
        drf2.cq(new ljq(f2, f3, f4));
    }

    private void ce(float f2) {
        drf drf2 = (drf)this.MessageDelegator.bzx().bzt().d(lcr.qDO);
        if (drf2 == null) {
            return;
        }
        f2 = lew.A(f2, 0.0f, 1.0f);
        drf2.setSpeed(f2);
    }

    private void cf(float f2) {
        if (this.sq != null) {
            this.MessageDelegator.bzx().bzt().hd(this.sq);
            this.sq = null;
        } else {
            this.sq = lcr.qDT;
            drj drj2 = new drj();
            drj2.setGUID(this.sq);
            drj2.hD(f2);
            drj2.ja(true);
            this.MessageDelegator.bzx().bzt().a((amf)drj2);
        }
    }

    private void Wk() {
        if (this.cfR != null) {
            this.MessageDelegator.hd(this.cfR);
            this.cfR = null;
        } else {
            this.cfR = this.MessageDelegator.bzv();
            drh drh2 = new drh();
            drh2.setGUID(this.cfR);
            this.MessageDelegator.a(drh2);
        }
    }

    private void Wl() {
        if (this.sr != null) {
            this.MessageDelegator.hd(this.sr);
            this.sr = null;
        } else {
            this.sr = this.MessageDelegator.bzv();
            dre dre2 = new dre();
            dre2.setGUID(this.sr);
            this.MessageDelegator.a(dre2);
        }
    }
}

