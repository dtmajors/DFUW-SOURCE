/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class avd
extends aul {
    private static final int cjB = 0;
    private static final int cdu = 0;
    private static final egg[] cjC = new egg[0];
    private static final int cjD = 0;
    private static final int cjE = 1;
    private static final int cjF = 2;
    private static final int cjG = 3;
    private static final int cjH = 4;
    private static final int cjI = 5;
    private static final int cjJ = 6;
    private static final int cjK = 7;
    private static final int cdY = 8;
    private static final cqi[] bui = new cqi[]{new cqj(hc.aaP, 0, "levels_use_amortizer", false, new lch(true), lcy.qRr), new cqj(hc.aaP, 1, "levels_use_objects_per_frame", false, new lch(false), lcy.qRr), new cqo(hc.aaP, 2, "levels_num_objects_per_frame", false, new lei(10), 1, Integer.MAX_VALUE, lcy.qRr), new cqo(hc.aaP, 3, "levels_num_objects_per_second", false, new lei(10), 1, Integer.MAX_VALUE, lcy.qRr), new cqn(hc.aaP, 4, "levels_loadsphere_multiply", false, new ldq(1.1f), 0.1f, Float.MAX_VALUE, lcy.qRr), new cqn(hc.aaP, 5, "levels_interest_percent_fp", false, new ldq(1.5f), 0.1f, Float.MAX_VALUE, lcy.qRr), new cqn(hc.aaP, 6, "levels_load_percent_fp", false, new ldq(2.0f), 0.1f, Float.MAX_VALUE, lcy.qRr), new cqn(hc.aaP, 7, "levels_recalibration_percent_load", false, new ldq(0.1f), 0.1f, Float.MAX_VALUE, lcy.qRr)};
    private boolean Initialized;
    public static final amd cjL = new amd(avd.class, aul.cdc, "ChatProxyLevels", bui, null);

    public avd() {
        super(cjL);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
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
            default: 
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            case 0: {
                lch lch2 = (lch)this.gG(0);
                kqh kqh2 = this.WD();
                kqh2.pVY = lch2.booleanValue();
                kqh2.pVX = 1;
                this.MessageDelegator.a(kqh2);
                break;
            }
            case 1: {
                lch lch3 = (lch)this.gG(1);
                kqh kqh3 = this.WD();
                kqh3.pVZ = lch3.booleanValue();
                kqh3.pVX = 2;
                this.MessageDelegator.a(kqh3);
                break;
            }
            case 2: {
                lei lei2 = (lei)this.gG(2);
                kqh kqh4 = this.WD();
                kqh4.eYG = lei2.intValue();
                kqh4.pVX = 4;
                this.MessageDelegator.a(kqh4);
                break;
            }
            case 3: {
                lei lei3 = (lei)this.gG(3);
                kqh kqh5 = this.WD();
                kqh5.eYH = lei3.intValue();
                kqh5.pVX = 8;
                this.MessageDelegator.a(kqh5);
                break;
            }
            case 4: {
                ldq ldq2 = (ldq)this.gG(4);
                kqh kqh6 = this.WD();
                kqh6.eYI = ldq2.floatValue();
                kqh6.pVX = 16;
                this.MessageDelegator.a(kqh6);
                break;
            }
            case 5: {
                ldq ldq3 = (ldq)this.gG(5);
                kir kir2 = this.WE();
                kir2.hc(ldq3.floatValue());
                kir2.XZ(32);
                this.MessageDelegator.a(kir2);
                break;
            }
            case 6: {
                ldq ldq4 = (ldq)this.gG(6);
                kir kir3 = this.WE();
                kir3.hd(ldq4.floatValue());
                kir3.XZ(64);
                this.MessageDelegator.a(kir3);
                break;
            }
            case 7: {
                ldq ldq5 = (ldq)this.gG(7);
                kir kir4 = this.WE();
                kir4.he(ldq5.floatValue());
                kir4.XZ(128);
                this.MessageDelegator.a(kir4);
                break;
            }
            default: {
                super.b(n, object);
            }
        }
    }

    private kqh WD() {
        kqh kqh2 = (kqh)this.MessageDelegator.h(3846);
        kqh2.hsP = false;
        kqh2.iBr = false;
        kqh2.ec = this.getGUID();
        return kqh2;
    }

    private kir WE() {
        kir kir2 = (kir)this.MessageDelegator.h(2054);
        kir2.hsP = false;
        kir2.iBr = false;
        kir2.ec = this.getGUID();
        kir2.nN = lcr.rg;
        return kir2;
    }
}

