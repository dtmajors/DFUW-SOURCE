/*
 * Decompiled with CFR.
 */
public class hbh
extends how {
    private final lhf jAV = new lhf(6, 10);
    private final lhf jAW = new lhf(12, 5);
    private boolean Initialized;
    private Object[] jAX;
    private final lbp jAY = new lbp(this){
        final /* synthetic */ hbh jBa;
        {
            this.jBa = hbh2;
        }

        public final boolean caU() {
            return true;
        }
    };
    private final lbn jAZ = new lbn(this){
        final /* synthetic */ hbh jBa;
        {
            this.jBa = hbh2;
        }

        public final void W() {
        }
    };

    public hbh(hbm hbm2, lgs lgs2, Object[] objectArray) {
        super((hnc)((Object)hbm2), "", lgs2.aI(), lgs2.cqv(), hbh.caT());
        this.jAX = objectArray;
        this.d(new lhf(this.getWidth(), 10));
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        lgg lgg2 = new lgg(8, 8);
        this.mU(true);
        this.caS();
    }

    private void caS() {
        Object object;
        int n = 12;
        int n2 = 5;
        int n3 = 180;
        int n4 = 20;
        int n5 = 3;
        int n6 = 4;
        int n7 = 0;
        int n8 = 0;
        for (int j = 0; j < this.jAX.length; ++j) {
            if (this.jAX[j] instanceof cs) {
                n = this.jAW.rmN + (n3 + this.jAV.rmN) * n8;
                n2 = this.jAW.H + (n4 + this.jAV.H) * n7;
                object = (cs)this.jAX[j];
                hbm hbm2 = this.caP();
                ((Object)((Object)hbm2)).getClass();
                hbm.b b2 = new hbm.b(hbm2, 0);
                hbm hbm3 = this.caP();
                ((Object)((Object)hbm3)).getClass();
                hbm.b b3 = new hbm.b(hbm3, 0);
                lgs lgs2 = new lgs(n, n2, n3, n4);
                hbl hbl2 = new hbl(this.caP(), lgs2, b3, false, (cs)object);
                this.j(hbl2);
                if (++n7 != n5) continue;
                n7 = 0;
                if (++n8 > n6) assert (false);
                continue;
            }
            assert (false);
        }
        n = this.jAW.rmN;
        n2 = this.jAW.H + (n4 + this.jAV.H) * n5;
        lgs lgs3 = new lgs(n, n2, n3, n4);
        object = new hpe(this.kLu, "", lgs3.aI(), lgs3.cqv(), this.caP().kIA, lcx.qQR.esy() + " 16");
        this.j((hms)object);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private hbm caP() {
        return (hbm)((Object)this.kLu);
    }

    private static hpw.a caT() {
        lhu lhu2 = new lhu(256, 256, "gui/background/background.dds");
        return new hpw.a(lhu2, lcq.COLORSHIFT_NEUTRAL);
    }

    private void mU(boolean bl) {
        this.a(bl, this.jAY, 27, jpn.nLm);
    }
}

