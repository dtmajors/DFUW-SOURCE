/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
public class avh
extends aul {
    private static final int cks = 0;
    private static final int ckt = 1;
    private static final int cku = 2;
    private static final int ckv = 3;
    private static final int ckw = 4;
    private static final int ckx = 5;
    private static final int cky = 6;
    private static final int ckz = 7;
    private static final int ckA = 8;
    private static final int ckB = 9;
    private static final int cdu = 10;
    private static final egg[] ckC = new egg[]{new egg("ParamString", egg.a.ipq, false, lcy.qRr)};
    private static final egg[] ckD = new egg[]{new egg("ParamInteger", egg.a.ipn, false, lcy.qRr)};
    private static final egg[] ckE = new egg[]{new egg("ParamFloat", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] ckF = new egg[]{new egg("ParamBool", egg.a.ipm, false, lcy.qRr)};
    private static final int ckG = 0;
    private static final int cdY = 1;
    private static final cqi[] bui = new cqi[]{new cqo(hc.aaP, 0, "phys_integer", false, new lei(0), 0, 9999999, lcy.qRr)};
    public static final amd ckH = new amd(avh.class, aul.cdc, "ChatProxyPhysics", bui, null);
    private boolean Initialized;

    public avh() {
        super(ckH);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "p_set_network_time_steps_delay", lcy.qRr, ckD);
        this.a(hc.aaP, 1, "p_set_gravity", lcy.qRr, ckE);
        this.a(hc.aaP, 2, "p_set_character_jump_height", lcy.qRr, ckE);
        this.a(hc.aaP, 3, "p_print_contacts", lcy.qRr, cdd);
        this.a(hc.aaP, 4, "p_print_stream_controllers", lcy.qRr, cdd);
        this.a(hc.aaP, 5, "p_enable_simulation_spam", lcy.qRr, ckF);
        this.a(hc.aaP, 6, "p_enable_contact_spam", lcy.qRr, ckF);
        this.a(hc.aaP, 7, "p_enable_simulation", lcy.qRr, ckF);
        this.a(hc.aaP, 8, "p_set_max_non_contact_speed", lcy.qRr, ckE);
        this.a(hc.aaP, 9, "p_set_inertia_factor", lcy.qRr, ckE);
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
                assert (objectArray.length == 1);
                int n2 = ((lei)objectArray[0]).intValue();
                kms kms2 = (kms)this.MessageDelegator.h(3331);
                kms2.pOz = 4096;
                kms2.pOJ = n2;
                kms2.hC(this.getGUID());
                kms2.ts(this.getGUID());
                kms2.jM(false);
                kms2.wD(false);
                this.a(kms2);
                return;
            }
            case 1: {
                assert (objectArray.length == 1);
                float f2 = ((ldq)objectArray[0]).floatValue();
                kms kms3 = (kms)this.MessageDelegator.h(3331);
                kms3.pOz = 1;
                kms3.gVx = new ljq(0.0f, f2, 0.0f);
                kms3.hC(this.getGUID());
                kms3.ts(this.getGUID());
                kms3.jM(false);
                kms3.wD(false);
                this.a(kms3);
                return;
            }
            case 2: {
                assert (objectArray.length == 1);
                float f3 = ((ldq)objectArray[0]).floatValue();
                kms kms4 = (kms)this.MessageDelegator.h(3331);
                kms4.pOz = 256;
                kms4.ddb = f3;
                kms4.hC(this.getGUID());
                kms4.ts(this.getGUID());
                kms4.jM(false);
                kms4.wD(false);
                this.a(kms4);
                return;
            }
            case 3: {
                kqj kqj2 = (kqj)this.MessageDelegator.h(3843);
                kqj2.pWc = 1;
                kqj2.ts(this.getGUID());
                kqj2.jM(false);
                kqj2.wD(false);
                this.a(kqj2);
                return;
            }
            case 4: {
                kqj kqj3 = (kqj)this.MessageDelegator.h(3843);
                kqj3.pWc = 2;
                kqj3.ts(this.getGUID());
                kqj3.jM(false);
                kqj3.wD(false);
                this.a(kqj3);
                return;
            }
            case 5: {
                assert (objectArray.length == 1);
                boolean bl = ((lch)objectArray[0]).booleanValue();
                kms kms5 = (kms)this.MessageDelegator.h(3331);
                kms5.pOz = 512;
                kms5.pOD = bl;
                kms5.hC(this.getGUID());
                kms5.ts(this.getGUID());
                kms5.jM(false);
                kms5.wD(false);
                this.a(kms5);
                return;
            }
            case 6: {
                assert (objectArray.length == 1);
                boolean bl = ((lch)objectArray[0]).booleanValue();
                kms kms6 = (kms)this.MessageDelegator.h(3331);
                kms6.pOz = 1024;
                kms6.pOE = bl;
                kms6.hC(this.getGUID());
                kms6.ts(this.getGUID());
                kms6.jM(false);
                kms6.wD(false);
                this.a(kms6);
                return;
            }
            case 7: {
                assert (objectArray.length == 1);
                boolean bl = ((lch)objectArray[0]).booleanValue();
                kms kms7 = (kms)this.MessageDelegator.h(3331);
                kms7.pOz = 16;
                kms7.pOF = bl;
                kms7.hC(this.getGUID());
                kms7.ts(this.getGUID());
                kms7.jM(false);
                kms7.wD(false);
                this.a(kms7);
                return;
            }
            case 8: {
                assert (objectArray.length == 1);
                float f4 = ((ldq)objectArray[0]).floatValue();
                kms kms8 = (kms)this.MessageDelegator.h(3331);
                kms8.pOz = 16384;
                kms8.pOL = f4;
                kms8.hC(this.getGUID());
                kms8.ts(this.getGUID());
                kms8.jM(false);
                kms8.wD(false);
                this.a(kms8);
                return;
            }
            case 9: {
                assert (objectArray.length == 1);
                float f5 = ((ldq)objectArray[0]).floatValue();
                kmw kmw2 = (kmw)this.MessageDelegator.h(3333);
                kmw2.ts(this.GUID);
                kmw2.hC(new ldv(0L));
                kmw2.pPe = 131072;
                kmw2.pPk = f5;
                this.a(kmw2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            case 0: {
                return;
            }
        }
        super.b(n, object);
    }
}

