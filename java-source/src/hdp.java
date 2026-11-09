/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hdp {
    public static final hbe jzX = hbe.jAM;
    private final lbn kaD = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hdp kaG;
        {
            this.kaG = hdp2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hdp.a(this.kaG)) {
                throw new AssertionError();
            }
            this.kaG.cdR();
        }

        static {
            $assertionsDisabled = !hdp.class.desiredAssertionStatus();
        }
    };
    private final hdm jLM;
    private boolean Initialized;
    private hdx kaE;
    private hdw kaF;

    public hdp(hdm hdm2) {
        this.jLM = hdm2;
        this.Initialized = true;
        this.mU(true);
    }

    public final void dispose() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
    }

    public final void a(hdx hdx2) {
        assert (this.Initialized);
        assert (this.jLM.jYS.cdi());
        assert (hdx2 != null);
        assert (this.jLM.cbP().kck.b(hdx2) != null);
        this.kaE = hdx2;
        this.jLM.jYS.closeWindow();
        this.jLM.jYQ.cdk();
    }

    public final hdx cdP() {
        assert (this.Initialized);
        return this.kaE;
    }

    public final hdw cdQ() {
        assert (this.Initialized);
        return this.kaF;
    }

    public final void cdR() {
        if (this.jLM.cbP().kcf.cnD()) {
            if (this.jLM.jYQ.cdi()) {
                this.jLM.jYQ.closeWindow();
            }
            if (this.jLM.jYS.cdi()) {
                this.jLM.jYS.closeWindow();
            }
            hdx[] hdxArray = this.jLM.cbP().kcf.cnE();
            this.kaF = this.jLM.cbP().kcf.cdQ();
            if (hdxArray.length == 1 && this.jLM.cbP().kck.e(hdxArray[0])) {
                this.kaE = hdxArray[0];
                this.jLM.jYQ.cdk();
            } else {
                this.jLM.jYS.cdk();
            }
        } else {
            this.jLM.jYQ.ne(false);
            this.jLM.jYS.ne(false);
        }
    }

    private void mU(boolean bl) {
        this.jLM.cbP().kcf.cnG().a(bl, this.kaD);
    }

    static /* synthetic */ boolean a(hdp hdp2) {
        return hdp2.Initialized;
    }
}

