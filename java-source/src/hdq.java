/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hdq {
    public static final hbe jzX = hbe.jAM;
    private final lbn kaH = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdq kaJ;
        {
            this.kaJ = hdq2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdq.a(this.kaJ)) {
                throw new AssertionError();
            }
            this.kaJ.cdT();
        }

        static {
            $assertionsDisabled = !hdq.class.desiredAssertionStatus();
        }
    };
    private final hdm jLM;
    private boolean Initialized;
    private hdx kaI;

    public hdq(hdm hdm2) {
        this.jLM = hdm2;
        this.Initialized = true;
        this.mU(true);
    }

    public final void dispose() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
    }

    public final hdx cdS() {
        assert (this.Initialized);
        return this.kaI;
    }

    public final void cdT() {
        if (this.jLM.cbP().kcg.cnJ()) {
            if (this.jLM.jYR.cdi()) {
                this.jLM.jYR.closeWindow();
            }
            hdx hdx2 = this.jLM.cbP().kcg.cnK();
            assert (hdx2 != null);
            this.kaI = hdx2;
            this.jLM.jYR.cdk();
        } else {
            this.jLM.jYR.ne(false);
        }
    }

    private void mU(boolean bl) {
        this.jLM.cbP().kcg.cnM().a(bl, this.kaH);
    }

    static /* synthetic */ boolean a(hdq hdq2) {
        return hdq2.Initialized;
    }
}

