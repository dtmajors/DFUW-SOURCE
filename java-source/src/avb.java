/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
public class avb
extends aul {
    private static final int ciT = 0;
    protected static final int cdu = 1;
    protected static final int cdY = 0;
    private static final cqi[] bui = new cqi[0];
    public static final amd ciU = new amd(avb.class, aul.cdc, "ChatProxyForInput", bui, null);
    private static final egg[] ciV = new egg[]{new egg("key", egg.a.ipq, false, lcy.qTy), new egg("command", egg.a.ipq, true, lcy.qTz)};
    private final lbi<fjd> ciW = new lbi<fjd>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ avb ciX;
        {
            this.ciX = avb2;
        }

        public void a(fjd fjd2) {
            switch (fjd2.bPU()) {
                case iND: {
                    this.ciX.h(maf.InputBindNotBound.bD(new Object[0]));
                    break;
                }
                case iNz: {
                    break;
                }
                case iNA: {
                    this.ciX.h(maf.InputBindInvalidBinding.bD(new Object[0]));
                    break;
                }
                case iNB: {
                    this.ciX.h(maf.InputBindExpectedLinear.bD(new Object[0]));
                    break;
                }
                case iNC: {
                    this.ciX.h(maf.InputBindExpectedSwitch.bD(new Object[0]));
                    break;
                }
                default: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError((Object)((Object)fjd2.bPU()));
                    }
                    break;
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjd)object);
        }

        static {
            $assertionsDisabled = !avb.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;

    public avb() {
        super(ciU);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.cc(true);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 0: {
                String string2 = (String)objectArray[0];
                String string3 = objectArray.length > 1 ? (String)objectArray[1] : null;
                this.cdh.rnh.m(fjc.a(this.cdh.rng, string2, string3));
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        super.b(n, object);
    }

    private void cc(boolean bl) {
        this.cdh.rex.a(bl, fjd.class, this.ciW);
        if (bl) {
            this.a(hc.aaz, 0, "bind", lcy.qTx, ciV);
        } else {
            this.We();
        }
    }
}

