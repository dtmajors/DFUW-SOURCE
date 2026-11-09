/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iyg
extends isa {
    private iyf mBG;

    public iyg() {
        this.doL().RX(-5);
        this.h(new ipk(0x151515));
        this.b(new iym(this){
            final /* synthetic */ iyg mBH;
            {
                this.mBH = iyg2;
            }

            public void cLq() {
                this.mBH.doS();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbI.bD(new Object[0]).exA());
            }
        });
        this.W(new iyl(1, 0));
        this.doL().cqF();
        this.a(new iyj());
        this.W(new iyl(1, 0));
        this.c(new iyn(this){
            final /* synthetic */ iyg mBH;
            {
                this.mBH = iyg2;
            }

            public void cLq() {
                this.mBH.doT();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbJ.bD(new Object[0]).exA());
            }
        });
        this.W(new iyl(1, 0));
        this.mBG = new iyf(this){
            final /* synthetic */ iyg mBH;
            {
                this.mBH = iyg2;
            }

            public void cLq() {
                this.rF(false);
                ioc ioc2 = this.eo(0, 0);
                this.mBH.d(new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()));
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbK.bD(new Object[0]).exA());
            }
        };
        this.W(this.mBG);
        this.ae(new iyh("/dfdata/texture/gui/j2f/chat/tab_active_end_dirt.png"));
        this.ad(new iyk());
    }

    @Override
    public int doP() {
        return this.getWidth() - (this.mBG.djL() ? this.mBG.getWidth() : 0);
    }

    @Override
    public ipq doQ() {
        return this.mBG;
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        for (int i = 0; i < this.bfn(); ++i) {
            ipf ipf2 = this.RO(i);
            if (!(ipf2 instanceof iwx)) continue;
            ipf2.hz(f2);
        }
        this.mBG.kh(f2);
    }

    @Override
    public void doY() {
        ((iym)this.doN()).dpo();
    }

    @Override
    public void doZ() {
        ((iym)this.doN()).dbr();
    }

    @Override
    public void dpa() {
        ((iyn)this.doO()).dpo();
    }

    @Override
    public void dpb() {
        ((iyn)this.doO()).dbr();
    }

    @Override
    public int dpc() {
        return ((iyk)this.doV()).dsG().dlR();
    }

    @Override
    public int dpd() {
        return ((iyk)this.doV()).dsG().dlQ();
    }

    @Override
    public int dpe() {
        return ((iyk)this.doV()).dsG().dlS();
    }

    @Override
    public int SN(int n) {
        return n * 2;
    }
}

