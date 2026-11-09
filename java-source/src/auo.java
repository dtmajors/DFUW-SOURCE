/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  lcr
 *  lcy
 *  lkv
 */
public class auo
extends aul {
    private static final int cdJ = 0;
    private static final int cdK = 1;
    private static final int cdL = 2;
    private static final int cdM = 3;
    private static final int cdN = 4;
    private static final int cdO = 5;
    private static final int cdP = 6;
    private static final int cdQ = 7;
    private static final int cdu = 8;
    private static final egg[] cdR = new egg[0];
    private static final egg[] cdS = new egg[]{new egg("MeshSubString", egg.a.ipq, false, lcy.qRr), new egg("SetName", egg.a.ipq, false, lcy.qRr), new egg("DeltaAdvancePrUnit", egg.a.ipo, false, lcy.qRr)};
    private static final egg[] cdT = new egg[]{new egg("Time", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] cdU = new egg[]{new egg("Show Debug", egg.a.ipm, false, lcy.qRr)};
    private static final egg[] cdV = new egg[]{new egg("Disable Distancetimers", egg.a.ipm, false, lcy.qRr)};
    private static final egg[] cdW = new egg[]{new egg("SFX NAME", egg.a.ipq, false, lcy.qRr)};
    private static final int cdX = 0;
    private static final int cdY = 0;
    private static final cqi[] bui = new cqi[0];
    private boolean Initialized;
    public static final amd cdZ = new amd(auo.class, aul.cdc, "ChatProxyAnimations", bui, null);

    public auo() {
        super(cdZ);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "anim_print_distancetimers", lcy.qRr, cdR);
        this.a(hc.aaP, 1, "anim_modify_distancetimer", lcy.qRr, cdS);
        this.a(hc.aaP, 2, "anim_modify_blending_primary", lcy.qRr, cdT);
        this.a(hc.aaP, 3, "anim_modify_blending_other", lcy.qRr, cdT);
        this.a(hc.aaP, 4, "anim_debug_show", lcy.qRr, cdU);
        this.a(hc.aaP, 5, "anim_disable_distancetimers", lcy.qRr, cdV);
        this.a(hc.aaP, 6, "specialeffect_client_start_main", lcy.qRr, cdW);
        this.a(hc.aaP, 7, "anim_reload_transitions", lcy.qRr, cdR);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 0: {
                lkf.ets().ett();
                return;
            }
            case 1: {
                assert (objectArray.length == 3) : objectArray.length;
                String string2 = (String)objectArray[0];
                String string3 = (String)objectArray[1];
                double d2 = ((ldf)objectArray[2]).doubleValue();
                boolean bl = lkf.ets().b(string2, string3, d2);
                this.h(lzn.tWZ.bD(Boolean.toString(bl)));
                return;
            }
            case 2: {
                if (objectArray.length != 1) {
                    return;
                }
                float f2 = ((ldq)objectArray[0]).floatValue();
                if (f2 > 100.0f || f2 < 0.0f) {
                    return;
                }
                bvf.dRr = f2 /= 100.0f;
                return;
            }
            case 3: {
                if (objectArray.length != 1) {
                    return;
                }
                float f3 = ((ldq)objectArray[0]).floatValue();
                if (f3 > 100.0f || f3 < 0.0f) {
                    return;
                }
                bvf.dRq = f3 /= 100.0f;
                return;
            }
            case 4: {
                if (objectArray.length != 1) {
                    return;
                }
                boolean bl = ((lch)objectArray[0]).booleanValue();
                bvf.ev((boolean)bl);
                return;
            }
            case 5: {
                if (objectArray.length != 1) {
                    return;
                }
                boolean bl = ((lch)objectArray[0]).booleanValue();
                bvf.eu((!bl ? 1 : 0) != 0);
                return;
            }
            case 6: {
                String string4 = (String)objectArray[0];
                int n2 = del.dr(string4);
                if (n2 <= 0) {
                    this.h(lzj.tWC.bD(string4));
                    return;
                }
                if (lea.rhC.crm == null) {
                    return;
                }
                if (lea.rhC.crm.aAG() == null) {
                    return;
                }
                glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
                glh2.setSpecialEffectType(n2);
                glh2.o(0.0);
                glh2.setPower(0.0f);
                glh2.setTargetPosition(lea.rhC.crm.aAG().av());
                glh2.mj(true);
                this.MessageDelegator.F(glh2);
                return;
            }
            case 7: {
                lkv.eui();
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            default: 
        }
        super.b(n, object);
    }
}

